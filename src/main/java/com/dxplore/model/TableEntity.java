/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.model;

/**
 * Created by motty on 15/02/2016.
 */
public class TableEntity {

    /**
     * Schema
     */
    private String schema = null;
    public String getSchema() { return schema; }
    public void setSchema(String value) { this.schema = value; }

    /**
     * Table
     */
    private String table = null;
    public String getTable() { return table; }
    public void setTable(String value) { this.table = value; }

    /**
     * Alias
     */
    private String alias = null;
    public String getAlias() { return alias; }
    public void setAlias(String value) { this.alias = value; }


    /**
     * Constructor with parameters
     */
    public TableEntity(String schema, String table, String alias) {
        this.setSchema(schema);
        this.setTable(table);
        this.setAlias(alias);
    }

    @Override
    public String toString() {
        return String.format("%s.%s (%s)", schema, table, alias);
    }
}
