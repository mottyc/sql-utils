/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.model;

import com.dxplore.plsql.plsqlParser;

/**
 * Created by motty on 15/02/2016.
 */
public class JoinEntity {

    /**
     * Join left column
     */
    private ColumnEntity left;
    public ColumnEntity getLeft() { return left; }
    public void setLeft(ColumnEntity value) { this.left = value; }

    /**
     * Join right column
     */
    private ColumnEntity right;
    public ColumnEntity getRight() { return right; }
    public void setRight(ColumnEntity value) { this.right = value; }

    /**
     * Type (join or where)
     */
    private String type;
    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    /**
     * Constructor with parameters
     */
    public JoinEntity(ColumnEntity left, ColumnEntity right, String type) {
        this.left = left;
        this.right = right;
        this.setType(type);
    }

    /**
     * Returns a string representation of the object.
     */
    @Override
    public String toString() {
        return String.format("%s.%s=%s.%s", left.getTable(), left.getColumn(), right.getTable(), right.getColumn());
    }

    /**
     * Get object as test to write in as a line a text file
     */
    public String getText() {
        return String.format("%s,%s,%s,%s,%s", left.getTable(), left.getColumn(), right.getTable(), right.getColumn(), type);
    }
}
