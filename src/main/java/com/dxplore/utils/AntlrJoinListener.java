/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.utils;



import com.dxplore.model.CompoundJoinEntity;
import com.dxplore.model.RelationEntity;
import com.dxplore.model.StatementEntity;
import com.dxplore.tsql.tsqlBaseListener;
import com.dxplore.tsql.tsqlParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of ANTRL TSQL listener
 *
 * Created by motty on 14/02/2016.
 */
public class AntlrJoinListener extends tsqlBaseListener {

    // Statement
    private StatementEntity statement = null;

    private boolean isJoinOn = false;
    private boolean isWhere = false;
    private String joinType = "";
    private List<RelationEntity> relations = new ArrayList<RelationEntity>();

    // Logger
    private static final Logger logger = LoggerFactory.getLogger("AntlrJoinListener");

    // SELECT segment -----------------------------------------------------------
    @Override
    public void enterSelect_statement(tsqlParser.Select_statementContext ctx) {
        super.enterSelect_statement(ctx);
    }

    @Override
    public void exitSelect_statement(tsqlParser.Select_statementContext ctx) {
        super.exitSelect_statement(ctx);
        try {
            for (RelationEntity rel : this.relations) {
                this.statement.addWhereRelation(rel.getLeft(), rel.getRight());
            }
            CompoundJoinEntity cJoin = this.statement.getCompoundJoin();
            Application.getModel().addCompoundJoin(cJoin);
        } catch (Exception ex) {
            this.statement.setError("Normalize error: " + ex.getMessage());
        }
    }

    // TABLES segment -----------------------------------------------------------
    @Override
    public void exitTable_source_item(tsqlParser.Table_source_itemContext ctx) {
        super.exitTable_source_item(ctx);
        this.addTable(ctx);
    }

    // JOIN part segment -----------------------------------------------------------
    @Override
    public void enterJoin_part(tsqlParser.Join_partContext ctx) {
        super.enterJoin_part(ctx);
        this.isJoinOn = true;
    }

    @Override
    public void exitJoin_part(tsqlParser.Join_partContext ctx) {
        super.exitJoin_part(ctx);
        this.isJoinOn = false;
        try {
            this.joinType = this.getJoinType(ctx);
            for (RelationEntity rel : this.relations) {
                this.statement.addJoinRelation(rel.getLeft(), rel.getRight(), this.joinType);
            }
            this.addTable(ctx.table_source().table_source_item_joined().table_source_item());

            // Clean temp relations
            this.relations.clear();
        } catch (Exception ex) {
            this.statement.setError("exitJoin_part error: " + ex.getMessage());
        }
    }


    // SEARCH Condition segment ------------------------------------------------



    @Override
    public void exitSearch_condition(tsqlParser.Search_conditionContext ctx) {
        super.exitSearch_condition(ctx);
        try {
            String s = ctx.getText();
            List<tsqlParser.Search_condition_orContext> parts = ctx.search_condition_or();

            boolean bWhere = ctx.getParent().getText().contains("where");
            for (tsqlParser.Search_condition_orContext part : parts) {

                part.search_condition_not().stream().filter((or) -> {
                    try {
                        return or.predicate().comparison_operator().getText().equalsIgnoreCase("=");
                    } catch (Exception ex) {
                        return false;
                    }
                }).forEach((or) -> {
                    try {
                        String left = or.predicate().expression(0).getChild(0).getText();
                        String right = or.predicate().expression(1).getChild(0).getText();
                        this.relations.add(new RelationEntity(left, right, bWhere ? "WHERE" : ""));

                    } catch (Exception ex) {}
                });
            }
        } catch (Exception ex) {
            this.statement.setError("exitRelational_expression error: " + ex.getMessage());
        }
    }

    /**
     * Process table and add it to list
     * @param ctx
     */
    private void addTable(tsqlParser.Table_source_itemContext ctx) {
        try {
            tsqlParser.Table_name_with_hintContext hintCtx = ctx.table_name_with_hint();
            tsqlParser.Table_nameContext tblCtx = (hintCtx != null) ? hintCtx.table_name() : null;

            String database = (tblCtx != null) ? (tblCtx.database != null) ? this.simplify(tblCtx.database.getText()) : "" : "";
            String schema = (tblCtx != null) ? (tblCtx.schema != null) ? this.simplify(tblCtx.schema.getText()) : "" : "";
            String table = (tblCtx != null) ? (tblCtx.table != null) ? this.simplify(tblCtx.table.getText()) : "" : "";

            tsqlParser.As_table_aliasContext aliasCtx = ctx.as_table_alias();
            String alias = (aliasCtx != null) ?
                    (aliasCtx.table_alias() != null) ?
                            (aliasCtx.table_alias().id() != null) ?
                                    this.simplify(aliasCtx.table_alias().id().getText()) : "" : "" : "";


            this.statement.addTable(schema, table, alias);
        } catch (Exception ex) {
            this.statement.setError("exitTable_ref_aux error: " + ex.getMessage());
        }
    }

    /**
     * Add columns in expression
     * @param left
     * @param right
     */
    private void addColumnsPair(String left, String right) {
        System.out.println(String.format(left + " = " + right));
        if (this.isJoinOn) {
            this.statement.addJoinRelation(left, right, this.joinType);
        }
        if (this.isWhere) {
            this.statement.addWhereRelation(left, right);
        }
    }

    /**
     * Constructor
     * @param sql SQL statement
     * @param counter statement counter
     */
    public AntlrJoinListener(String sql, int counter, int number) {
        String id = String.valueOf(counter);
        this.statement = new StatementEntity(id, sql, number);
    }

    /**
     * Constructor
     * @param sql SQL statement
     */
    public AntlrJoinListener(String sql, int number) {
        String id = String.valueOf(number);
        this.statement = new StatementEntity(id, sql, number);
    }

    /**
     * Remove quated and brackets
     * @param input
     * @return
     */
    private String simplify(String input) {
        return input.replace("\"", "").replace("[", "").replace("]", "");
    }

    /**
     * Get the join type
     * @param ctx
     * @return
     */
    private String getJoinType(tsqlParser.Join_partContext ctx) {
        if (ctx.INNER() != null) return "INNER JOIN";

        String type = "";
        if (ctx.LEFT() != null) {
            return  (ctx.OUTER() != null) ? "LEFT OUTER JOIN" : "LEFT JOIN";
        }
        if (ctx.RIGHT() != null) {
            return  (ctx.OUTER() != null) ? "RIGHT OUTER JOIN" : "RIGHT JOIN";
        }
        if (ctx.FULL() != null) {
            return  (ctx.OUTER() != null) ? "FULL OUTER JOIN" : "FULL JOIN";
        }
        return "JOIN";
    }
}