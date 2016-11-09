/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.model;

import java.util.Collection;
import java.util.List;

/**
 * Created by motty on 15/02/2016.
 */
public class ColumnEntity {

    /**
     * column prefix
     */
    private String prefix;
    public String getPrefix() { return prefix; }
    public void setPrefix(String value) { this.prefix = value; }

    /**
     * Table name
     */
    private String table;
    public String getTable() { return table; }
    public void setTable(String value) { this.table = value; }

    /**
     * Column name
     */
    private String column;
    public String getColumn() { return column; }
    public void setColumn(String value) { this.column = value; }


    /**
     * Default constructor
     */
    public ColumnEntity() {}

    /**
     * Constructor with parameters
     */
    public ColumnEntity(String fullName) {
        if (fullName.contains(".")) {
            this.prefix = fullName.substring(0, fullName.indexOf("."));
            this.column = fullName.substring(fullName.indexOf(".") + 1);
        } else {
            this.column = fullName;
        }
    }

    @Override
    public String toString() {
        return String.format("(%s) %s.%s", prefix, table, column);
    }

    /**
     * Create column with actual table name
     * @param fullName
     * @param tables
     * @return
     */
    public static ColumnEntity convert(String fullName, Collection<TableEntity> tables) {
        ColumnEntity col = new ColumnEntity(fullName);

        // If no prefix exists, it is not a relation
        if (col.prefix == null) return null;

        for (TableEntity table : tables) {
            // Does table identified by name?
            if (col.prefix.equalsIgnoreCase(table.getTable())) {
                col.table = table.getTable();
                return col;
            }

            // Does table identified by alias?
            if (col.prefix.equalsIgnoreCase(table.getAlias())) {
                col.table = table.getTable();
                return col;
            }
        }

        // Table not identified
        col.table = "UNKNOWN";
        return col;
    }
}
