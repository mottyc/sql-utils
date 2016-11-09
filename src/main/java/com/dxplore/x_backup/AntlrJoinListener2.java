/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.x_backup;



import com.dxplore.model.CompoundJoinEntity;
import com.dxplore.model.StatementEntity;
import com.dxplore.plsql.plsqlBaseListener;
import com.dxplore.plsql.plsqlParser;
import com.dxplore.utils.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of ANTRL PLSQL listener
 *
 * Created by motty on 14/02/2016.
 */
public class AntlrJoinListener2 extends plsqlBaseListener {

    // Statement
    private StatementEntity statement = null;

    private boolean isJoinOn = false;
    private boolean isWhere = false;

    // Logger
    private static final Logger logger = LoggerFactory.getLogger("AntlrJoinListener");

    // SELECT segment -----------------------------------------------------------
    @Override
    public void enterSelect_statement(plsqlParser.Select_statementContext ctx) {
        super.enterSelect_statement(ctx);
    }

    @Override
    public void exitSelect_statement(plsqlParser.Select_statementContext ctx) {
        super.exitSelect_statement(ctx);
        try {
            CompoundJoinEntity cJoin = this.statement.getCompoundJoin();
            Application.getModel().addCompoundJoin(cJoin);
            //Application.getModel().queueCompoundJoin(cJoin);
        } catch (Exception ex) {
            this.statement.setError("Normalize error: " + ex.getMessage());
        }
    }

    // TABLES segment -----------------------------------------------------------

    @Override
    public void enterTable_ref_aux(plsqlParser.Table_ref_auxContext ctx) {
        super.enterTable_ref_aux(ctx);
    }

    @Override
    public void exitTable_ref_aux(plsqlParser.Table_ref_auxContext ctx) {
        super.exitTable_ref_aux(ctx);
        try {
            // Extract table name
            plsqlParser.Dml_table_expression_clauseContext dml = ctx.dml_table_expression_clause();

            plsqlParser.IdContext idc = dml.tableview_name().id();
            plsqlParser.Id_expressionContext idx = dml.tableview_name().id_expression();

            String schema = null;
            String table = null;
            String alias = null;

            // Extract schema and table
            if (idx == null) {
                table = idc.getText().replace("[", "").replace("]", "");
            } else {
                schema = idc.getText().replace("[", "").replace("]", "");
                table = idx.getText().replace("[", "").replace("]", "");
            }

            // Extract table alias (if exists)
            plsqlParser.Table_aliasContext aliasCtx = ctx.table_alias();

            if (aliasCtx != null) {
                alias = aliasCtx.id().getText();
            }

            this.statement.addTable(schema, table, alias);
        } catch (Exception ex) {
            this.statement.setError("exitTable_ref_aux error: " + ex.getMessage());
        }
    }


    // JOIN ON segment -----------------------------------------------------------
    @Override
    public void enterJoin_on_part(plsqlParser.Join_on_partContext ctx) {
        super.enterJoin_on_part(ctx);
        this.isJoinOn = true;
    }

    @Override
    public void exitJoin_on_part(plsqlParser.Join_on_partContext ctx) {
        super.exitJoin_on_part(ctx);
        this.isJoinOn = false;
    }


    // RELATIONAL expression -------------------------------------------------------
    @Override
    public void enterRelational_expression(plsqlParser.Relational_expressionContext ctx) {
        super.enterRelational_expression(ctx);
    }

    @Override
    public void exitRelational_expression(plsqlParser.Relational_expressionContext ctx) {
        super.exitRelational_expression(ctx);

        try {
            if (ctx.getText().startsWith("(")) return;

            String left = ctx.compound_expression(0).getText();
            String right = ctx.compound_expression(1).getText();

            if (this.isJoinOn) {
                //ctx.compound_expression(0).getText();
                this.statement.addJoinRelation(left, right, "JOIN");
                //logger.debug("Exit JOIN Relational_expression" + ctx.getText());
            }
            if (this.isWhere) {
                this.statement.addWhereRelation(left, right);
                //logger.debug("Exit WHERE Relational_expression" + ctx.getText());
            }
        } catch (Exception ex) {
            this.statement.setError("exitRelational_expression error: " + ex.getMessage());
        }
    }


    // WHERE segment -------------------------------------------------------
    @Override
    public void enterWhere_clause(plsqlParser.Where_clauseContext ctx) {
        super.enterWhere_clause(ctx);
        this.isWhere = true;
        //logger.debug("Enter WHERE -----------------------");
    }

    @Override
    public void exitWhere_clause(plsqlParser.Where_clauseContext ctx) {
        super.exitWhere_clause(ctx);
        this.isWhere = false;
        //logger.debug("Exit WHERE ------------------------");
        //logger.debug(ctx.getText());
    }

    /**
     * Constructor
     * @param sql SQL statement
     * @param counter statement counter
     */
    public AntlrJoinListener2(String sql, int counter, int number) {
        String id = String.valueOf(counter);
        this.statement = new StatementEntity(id, sql, number);
    }

    /**
     * Constructor
     * @param sql SQL statement
     */
    public AntlrJoinListener2(String sql, int number) {
        String id = String.valueOf(number);
        this.statement = new StatementEntity(id, sql, number);
    }
}