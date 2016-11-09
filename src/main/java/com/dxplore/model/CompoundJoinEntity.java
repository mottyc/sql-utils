/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by motty on 15/02/2016.
 */
public class CompoundJoinEntity {

    /**
     * Compund key
     */
    private String key = "";
    public String getKey() { return key; }
    public void setKey(String value) { this.key = value; }

    /**
     * List of joins
     */
    private List<JoinEntity> joins = new ArrayList<>();
    public List<JoinEntity> getJoins() { return joins; }
    public void setJoins(List<JoinEntity> value) { this.joins = value; }


    /**
     * How many times this join has been seen
     */
    private int weight = 1;
    public int getWeight() { return weight; }
    public void setWeight(int value) { this.weight = value; }

    /**
     * Error message
     */
    private String error = "";
    public String getError() { return error; }
    public void setError(String value) { this.error = value; }

    /**
     * Indicates if statement has error
     * @return
     */
    public boolean hasError() { return (!error.isEmpty()); }

    /**
     * Constructor with parameters
     */
    public CompoundJoinEntity(String key, List<JoinEntity> joins, String error) {
        this.setKey(key);
        this.setJoins(joins);
        this.setError(error);
    }

    /**
     * Increment weight
     */
    public void incrementWeight() {
        this.weight++;
    }

    /**
     * Returns a unique string representation of the object.
     */
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(",");
        joins.stream().forEach((t) -> { joiner.add(t.toString()); } );
        return joiner.toString();
    }

    /**
     * Get object as test to write in as a line a text file
     */
    public String getText(String tenant, String database) {
        StringJoiner joiner = new StringJoiner("\n");
        joins.stream().forEach((t) -> {
            joiner.add(String.format("%s,%s,%s,%s", tenant, database, key, t.getText()));
        });
        return joiner.toString();
    }
}
