/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.model;

/**
 * Created by motty on 15/02/2016.
 */
public class RelationEntity {

    /**
     * Raw text
     */
    private String raw;
    public String getRaw() { return raw; }
    public void setRaw(String value) { this.raw = value; }

    /**
     * Type (join or where)
     */
    private String type;
    public String getType() { return type; }
    public void setType(String value) { this.type = value; }


    /**
     * Left argument
     */
    private String left;
    public String getLeft() { return left; }
    public void setLeft(String value) { this.left = value; }

    /**
     * Right argument
     */
    private String right;
    public String getRight() { return right; }
    public void setRight(String value) { this.right = value; }

    /**
     * Constructor with parameters
     */
    public RelationEntity(String left, String right, String type) {
        this.type = type;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("%s=%s", this.left, this.right);
    }
}
