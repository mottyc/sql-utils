/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;

/**
 * Represent a single SQL statement
 * Created by motty on 15/02/2016.
 */
public class StatementEntity {

    /**
     * line number in file
     */
    private int line;
    public int getLine() { return line; }
    public void setLine(int value) { this.line = value; }

    /**
     * Statement key
     */
    private String key = "";
    public String getKey() { return key; }
    public void setKey(String value) { this.key = value; }

    /**
     * Raw SQL
     */
    private String sql = "";
    public String getRight() { return sql; }
    public void setSql(String value) { this.sql = value; }

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
     * Get formatted error
     * @return
     */
    public String getErrorMessage() {
        return String.format("LINE:%d, ERROR:%s, SQL: %s", this.line, this.error, this.sql);
    }

    /**
     * List of joins
     */
    private List<JoinEntity> joins = new ArrayList<>();
    public List<JoinEntity> getJoins() { return joins; }
    public void setJoins(List<JoinEntity> value) { this.joins = value; }

    /**
     * Internal list of tables and aliases
     */
    private HashMap<String, TableEntity> tables = new HashMap<>();

    /**
     * Internal list of JOIN relations
     */
    public HashMap<String, RelationEntity> joinRelations = new HashMap<>();

    /**
     * Default Constructor
     */
    public StatementEntity() {}

    /**
     * Constructor with parameters
     */
    public StatementEntity(String key, String sql, int line) {
        this.setKey(key);
        this.setSql(sql);
        this.setLine(line);
    }

    /**
     * Add new table to list of tables
     * @param schema Schema name
     * @param table Table name
     * @param alias Alias name
     */
    public void addTable(String schema, String table, String alias) {

        String key = (schema == null) ? table : String.format("%s.%s", schema, table);

        if (tables.containsKey(key)) return;
        TableEntity newTable = new TableEntity(schema, table, alias);
        tables.put(key, newTable);

    }

    /**
     * Add new relation to the list of JOIN relations
     * @param left Left argument
     * @param right Right argument
     */
    public void addJoinRelation(String left, String right, String type) {
        RelationEntity rel = new RelationEntity(left, right, type.toUpperCase());
        this.joinRelations.put(rel.toString(), rel);
    }

    /**
     * Add new relation to the list of JOIN relations
     * @param left Left argument
     * @param right Right argument
     */
    public void addWhereRelation(String left, String right) {
        RelationEntity rel = new RelationEntity(left, right, "WHERE");
        this.joinRelations.put(rel.toString(), rel);
    }

    /**
     * Get compound join for this statement
     * @return
     */
    public CompoundJoinEntity getCompoundJoin() {
        try {
            List<JoinEntity> joins = new ArrayList<>();

            // Add joins relations
            this.joinRelations.values().stream().forEach((rel) -> {
                ColumnEntity left = ColumnEntity.convert(rel.getLeft(), this.tables.values());
                ColumnEntity right = ColumnEntity.convert(rel.getRight(), this.tables.values());
                if ((left != null) && (right != null)) {
                    joins.add(new JoinEntity(left, right, rel.getType()));
                }
            });

            return new CompoundJoinEntity(this.key, joins, (this.hasError()) ? this.getErrorMessage() : "");
        } catch (Exception ex) {
            //System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * Returns a string representation of the object.
     */
    @Override
    public String toString() {
        String result = "";
        for (JoinEntity je : joins) {
            String line = String.format("%s,%s", this.key, je.toString());
            result = result.isEmpty() ? line : String.format("%s\n", line);
        }
        return result;
    }

    /**
     * Serialize object as JSON string
     * @return
     */
    public String toJson() {
        // Get list of tables
        StringJoiner tablesJoiner = new StringJoiner(",", "[", "]");
        tables.values().stream().forEach((t) -> { tablesJoiner.add(t.toString()); } );

        // Get list of joins
        StringJoiner joinsJoiner = new StringJoiner(",", "[", "]");
        joins.stream().forEach((j) -> { joinsJoiner.add(j.toString());
        });

        return String.format("{'key':'%s', 'tables':%s, 'joins':%s}", this.key, tablesJoiner.toString(), joinsJoiner.toString());
    }
}
