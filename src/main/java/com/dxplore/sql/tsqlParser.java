// Generated from /Users/motty/GitHub/sql-utils/antlr/tsql.g4 by ANTLR 4.5.1
package com.dxplore.sql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, ALL=2, ALTER=3, AND=4, ANY=5, AS=6, ASC=7, AUTHORIZATION=8, BACKUP=9, 
		BEGIN=10, BETWEEN=11, BREAK=12, BROWSE=13, BULK=14, BY=15, CASCADE=16, 
		CASE=17, CHANGETABLE=18, CHANGES=19, CHECK=20, CHECKPOINT=21, CLOSE=22, 
		CLUSTERED=23, COALESCE=24, COLLATE=25, COLUMN=26, COMMIT=27, COMPUTE=28, 
		CONSTRAINT=29, CONTAINS=30, CONTAINSTABLE=31, CONTINUE=32, CONVERT=33, 
		CREATE=34, CROSS=35, CURRENT=36, CURRENT_DATE=37, CURRENT_TIME=38, CURRENT_TIMESTAMP=39, 
		CURRENT_USER=40, CURSOR=41, DATABASE=42, DBCC=43, DEALLOCATE=44, DECLARE=45, 
		DEFAULT=46, DELETE=47, DENY=48, DESC=49, DISK=50, DISTINCT=51, DISTRIBUTED=52, 
		DOUBLE=53, DROP=54, DUMP=55, ELSE=56, END=57, ERRLVL=58, ESCAPE=59, EXCEPT=60, 
		EXEC=61, EXECUTE=62, EXISTS=63, EXIT=64, EXTERNAL=65, FETCH=66, FILE=67, 
		FILLFACTOR=68, FOR=69, FORCESEEK=70, FOREIGN=71, FREETEXT=72, FREETEXTTABLE=73, 
		FROM=74, FULL=75, FUNCTION=76, GOTO=77, GRANT=78, GROUP=79, HAVING=80, 
		IDENTITY=81, IDENTITYCOL=82, IDENTITY_INSERT=83, IF=84, IN=85, INDEX=86, 
		INNER=87, INSERT=88, INTERSECT=89, INTO=90, IS=91, JOIN=92, KEY=93, KILL=94, 
		LEFT=95, LIKE=96, LINENO=97, LOAD=98, MERGE=99, NATIONAL=100, NOCHECK=101, 
		NONCLUSTERED=102, NOT=103, NULL=104, NULLIF=105, OF=106, OFF=107, OFFSETS=108, 
		ON=109, OPEN=110, OPENDATASOURCE=111, OPENQUERY=112, OPENROWSET=113, OPENXML=114, 
		OPTION=115, OR=116, ORDER=117, OUTER=118, OVER=119, PERCENT=120, PIVOT=121, 
		PLAN=122, PRECISION=123, PRIMARY=124, PRINT=125, PROC=126, PROCEDURE=127, 
		PUBLIC=128, RAISERROR=129, READ=130, READTEXT=131, RECONFIGURE=132, REFERENCES=133, 
		REPLICATION=134, RESTORE=135, RESTRICT=136, RETURN=137, REVERT=138, REVOKE=139, 
		RIGHT=140, ROLLBACK=141, ROWCOUNT=142, ROWGUIDCOL=143, RULE=144, SAVE=145, 
		SCHEMA=146, SECURITYAUDIT=147, SELECT=148, SEMANTICKEYPHRASETABLE=149, 
		SEMANTICSIMILARITYDETAILSTABLE=150, SEMANTICSIMILARITYTABLE=151, SESSION_USER=152, 
		SET=153, SETUSER=154, SHUTDOWN=155, SOME=156, STATISTICS=157, SYSTEM_USER=158, 
		TABLE=159, TABLESAMPLE=160, TEXTSIZE=161, THEN=162, TO=163, TOP=164, TRAN=165, 
		TRANSACTION=166, TRIGGER=167, TRUNCATE=168, TRY_CONVERT=169, TSEQUAL=170, 
		UNION=171, UNIQUE=172, UNPIVOT=173, UPDATE=174, UPDATETEXT=175, USE=176, 
		USER=177, VALUES=178, VARYING=179, VIEW=180, WAITFOR=181, WHEN=182, WHERE=183, 
		WHILE=184, WITH=185, WITHIN=186, WRITETEXT=187, ABSOLUTE=188, APPLY=189, 
		AUTO=190, AVG=191, BASE64=192, BINARY_CHECKSUM=193, CALLER=194, CAST=195, 
		CATCH=196, CHECKSUM=197, CHECKSUM_AGG=198, COMMITTED=199, CONCAT=200, 
		COOKIE=201, COUNT=202, COUNT_BIG=203, DATEADD=204, DATEDIFF=205, DATENAME=206, 
		DATEPART=207, DELAY=208, DELETED=209, DENSE_RANK=210, DISABLE=211, DYNAMIC=212, 
		ENCRYPTION=213, FAST=214, FAST_FORWARD=215, FIRST=216, FOLLOWING=217, 
		FORWARD_ONLY=218, FULLSCAN=219, GLOBAL=220, GO=221, GROUPING=222, GROUPING_ID=223, 
		HASH=224, INSENSITIVE=225, INSERTED=226, ISOLATION=227, KEEPFIXED=228, 
		KEYSET=229, LAST=230, LEVEL=231, LOCAL=232, LOCK_ESCALATION=233, LOGIN=234, 
		LOOP=235, MARK=236, MAX=237, MIN=238, MIN_ACTIVE_ROWVERSION=239, MODIFY=240, 
		NEXT=241, NAME=242, NOCOUNT=243, NOEXPAND=244, NORECOMPUTE=245, NTILE=246, 
		NUMBER=247, OFFSET=248, ONLY=249, OPTIMISTIC=250, OPTIMIZE=251, OUT=252, 
		OUTPUT=253, OWNER=254, PARTITION=255, PATH=256, PRECEDING=257, PRIOR=258, 
		RANGE=259, RANK=260, READONLY=261, READ_ONLY=262, RECOMPILE=263, RELATIVE=264, 
		REMOTE=265, REPEATABLE=266, ROOT=267, ROW=268, ROWGUID=269, ROWS=270, 
		ROW_NUMBER=271, SAMPLE=272, SCHEMABINDING=273, SCROLL=274, SCROLL_LOCKS=275, 
		SELF=276, SERIALIZABLE=277, SNAPSHOT=278, SPATIAL_WINDOW_MAX_CELLS=279, 
		STATIC=280, STATS_STREAM=281, STDEV=282, STDEVP=283, SUM=284, THROW=285, 
		TIES=286, TIME=287, TRY=288, TYPE=289, TYPE_WARNING=290, UNBOUNDED=291, 
		UNCOMMITTED=292, UNKNOWN=293, USING=294, VAR=295, VARP=296, VIEW_METADATA=297, 
		WORK=298, XML=299, XMLNAMESPACES=300, DOLLAR_ACTION=301, SPACE=302, COMMENT=303, 
		LINE_COMMENT=304, DOUBLE_QUOTE_ID=305, SQUARE_BRACKET_ID=306, LOCAL_ID=307, 
		DECIMAL=308, ID=309, STRING=310, BINARY=311, FLOAT=312, REAL=313, EQUAL=314, 
		GREATER=315, LESS=316, EXCLAMATION=317, PLUS_ASSIGN=318, MINUS_ASSIGN=319, 
		MULT_ASSIGN=320, DIV_ASSIGN=321, MOD_ASSIGN=322, AND_ASSIGN=323, XOR_ASSIGN=324, 
		OR_ASSIGN=325, DOT=326, UNDERLINE=327, AT=328, SHARP=329, DOLLAR=330, 
		LR_BRACKET=331, RR_BRACKET=332, COMMA=333, SEMI=334, COLON=335, STAR=336, 
		DIVIDE=337, MODULE=338, PLUS=339, MINUS=340, BIT_NOT=341, BIT_OR=342, 
		BIT_AND=343, BIT_XOR=344;
	public static final int
		RULE_tsql_file = 0, RULE_sql_clause = 1, RULE_dml_clause = 2, RULE_ddl_clause = 3, 
		RULE_cfl_statement = 4, RULE_another_statement = 5, RULE_delete_statement = 6, 
		RULE_insert_statement = 7, RULE_select_statement = 8, RULE_update_statement = 9, 
		RULE_output_clause = 10, RULE_output_dml_list_elem = 11, RULE_output_column_name = 12, 
		RULE_create_index = 13, RULE_create_procedure = 14, RULE_procedure_param = 15, 
		RULE_procedure_option = 16, RULE_create_statistics = 17, RULE_create_table = 18, 
		RULE_create_view = 19, RULE_view_attribute = 20, RULE_alter_table = 21, 
		RULE_alter_database = 22, RULE_database_option = 23, RULE_drop_index = 24, 
		RULE_drop_procedure = 25, RULE_drop_statistics = 26, RULE_drop_table = 27, 
		RULE_drop_view = 28, RULE_rowset_function_limited = 29, RULE_openquery = 30, 
		RULE_opendatasource = 31, RULE_declare_statement = 32, RULE_cursor_statement = 33, 
		RULE_execute_statement = 34, RULE_execute_statement_arg = 35, RULE_execute_var_string = 36, 
		RULE_security_statement = 37, RULE_set_statment = 38, RULE_transaction_statement = 39, 
		RULE_go_statement = 40, RULE_use_statement = 41, RULE_execute_clause = 42, 
		RULE_declare_local = 43, RULE_table_type_definition = 44, RULE_column_def_table_constraint = 45, 
		RULE_column_definition = 46, RULE_column_constraint = 47, RULE_table_constraint = 48, 
		RULE_index_options = 49, RULE_index_option = 50, RULE_declare_cursor = 51, 
		RULE_declare_set_cursor_common = 52, RULE_fetch_cursor = 53, RULE_set_special = 54, 
		RULE_expression = 55, RULE_constant_expression = 56, RULE_subquery = 57, 
		RULE_dml_table_source = 58, RULE_with_expression = 59, RULE_common_table_expression = 60, 
		RULE_update_elem = 61, RULE_search_condition_list = 62, RULE_search_condition = 63, 
		RULE_search_condition_or = 64, RULE_search_condition_not = 65, RULE_predicate = 66, 
		RULE_query_expression = 67, RULE_union = 68, RULE_query_specification = 69, 
		RULE_order_by_clause = 70, RULE_for_clause = 71, RULE_xml_common_directives = 72, 
		RULE_order_by_expression = 73, RULE_group_by_item = 74, RULE_option_clause = 75, 
		RULE_option = 76, RULE_optimize_for_arg = 77, RULE_select_list = 78, RULE_select_list_elem = 79, 
		RULE_partition_by_clause = 80, RULE_table_source = 81, RULE_table_source_item_joined = 82, 
		RULE_table_source_item = 83, RULE_change_table = 84, RULE_join_part = 85, 
		RULE_table_name_with_hint = 86, RULE_rowset_function = 87, RULE_bulk_option = 88, 
		RULE_derived_table = 89, RULE_function_call = 90, RULE_datepart = 91, 
		RULE_as_table_alias = 92, RULE_table_alias = 93, RULE_with_table_hints = 94, 
		RULE_table_hint = 95, RULE_index_column_name = 96, RULE_index_value = 97, 
		RULE_column_alias_list = 98, RULE_column_alias = 99, RULE_table_value_constructor = 100, 
		RULE_expression_list = 101, RULE_case_expr = 102, RULE_ranking_windowed_function = 103, 
		RULE_aggregate_windowed_function = 104, RULE_all_distinct_expression = 105, 
		RULE_over_clause = 106, RULE_row_or_range_clause = 107, RULE_window_frame_extent = 108, 
		RULE_window_frame_bound = 109, RULE_window_frame_preceding = 110, RULE_window_frame_following = 111, 
		RULE_full_table_name = 112, RULE_table_name = 113, RULE_view_name = 114, 
		RULE_func_proc_name = 115, RULE_ddl_object = 116, RULE_full_column_name = 117, 
		RULE_column_name_list = 118, RULE_column_name = 119, RULE_cursor_name = 120, 
		RULE_on_off = 121, RULE_clustered = 122, RULE_null_notnull = 123, RULE_scalar_function_name = 124, 
		RULE_data_type = 125, RULE_default_value = 126, RULE_constant = 127, RULE_number = 128, 
		RULE_sign = 129, RULE_id = 130, RULE_simple_id = 131, RULE_comparison_operator = 132, 
		RULE_assignment_operator = 133;
	public static final String[] ruleNames = {
		"tsql_file", "sql_clause", "dml_clause", "ddl_clause", "cfl_statement", 
		"another_statement", "delete_statement", "insert_statement", "select_statement", 
		"update_statement", "output_clause", "output_dml_list_elem", "output_column_name", 
		"create_index", "create_procedure", "procedure_param", "procedure_option", 
		"create_statistics", "create_table", "create_view", "view_attribute", 
		"alter_table", "alter_database", "database_option", "drop_index", "drop_procedure", 
		"drop_statistics", "drop_table", "drop_view", "rowset_function_limited", 
		"openquery", "opendatasource", "declare_statement", "cursor_statement", 
		"execute_statement", "execute_statement_arg", "execute_var_string", "security_statement", 
		"set_statment", "transaction_statement", "go_statement", "use_statement", 
		"execute_clause", "declare_local", "table_type_definition", "column_def_table_constraint", 
		"column_definition", "column_constraint", "table_constraint", "index_options", 
		"index_option", "declare_cursor", "declare_set_cursor_common", "fetch_cursor", 
		"set_special", "expression", "constant_expression", "subquery", "dml_table_source", 
		"with_expression", "common_table_expression", "update_elem", "search_condition_list", 
		"search_condition", "search_condition_or", "search_condition_not", "predicate", 
		"query_expression", "union", "query_specification", "order_by_clause", 
		"for_clause", "xml_common_directives", "order_by_expression", "group_by_item", 
		"option_clause", "option", "optimize_for_arg", "select_list", "select_list_elem", 
		"partition_by_clause", "table_source", "table_source_item_joined", "table_source_item", 
		"change_table", "join_part", "table_name_with_hint", "rowset_function", 
		"bulk_option", "derived_table", "function_call", "datepart", "as_table_alias", 
		"table_alias", "with_table_hints", "table_hint", "index_column_name", 
		"index_value", "column_alias_list", "column_alias", "table_value_constructor", 
		"expression_list", "case_expr", "ranking_windowed_function", "aggregate_windowed_function", 
		"all_distinct_expression", "over_clause", "row_or_range_clause", "window_frame_extent", 
		"window_frame_bound", "window_frame_preceding", "window_frame_following", 
		"full_table_name", "table_name", "view_name", "func_proc_name", "ddl_object", 
		"full_column_name", "column_name_list", "column_name", "cursor_name", 
		"on_off", "clustered", "null_notnull", "scalar_function_name", "data_type", 
		"default_value", "constant", "number", "sign", "id", "simple_id", "comparison_operator", 
		"assignment_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'='", "'>'", "'<'", "'!'", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'&='", "'^='", "'|='", "'.'", "'_'", "'@'", "'#'", "'$'", "'('", 
		"')'", "','", "';'", "':'", "'*'", "'/'", "'%'", "'+'", "'-'", "'~'", 
		"'|'", "'&'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ADD", "ALL", "ALTER", "AND", "ANY", "AS", "ASC", "AUTHORIZATION", 
		"BACKUP", "BEGIN", "BETWEEN", "BREAK", "BROWSE", "BULK", "BY", "CASCADE", 
		"CASE", "CHANGETABLE", "CHANGES", "CHECK", "CHECKPOINT", "CLOSE", "CLUSTERED", 
		"COALESCE", "COLLATE", "COLUMN", "COMMIT", "COMPUTE", "CONSTRAINT", "CONTAINS", 
		"CONTAINSTABLE", "CONTINUE", "CONVERT", "CREATE", "CROSS", "CURRENT", 
		"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR", 
		"DATABASE", "DBCC", "DEALLOCATE", "DECLARE", "DEFAULT", "DELETE", "DENY", 
		"DESC", "DISK", "DISTINCT", "DISTRIBUTED", "DOUBLE", "DROP", "DUMP", "ELSE", 
		"END", "ERRLVL", "ESCAPE", "EXCEPT", "EXEC", "EXECUTE", "EXISTS", "EXIT", 
		"EXTERNAL", "FETCH", "FILE", "FILLFACTOR", "FOR", "FORCESEEK", "FOREIGN", 
		"FREETEXT", "FREETEXTTABLE", "FROM", "FULL", "FUNCTION", "GOTO", "GRANT", 
		"GROUP", "HAVING", "IDENTITY", "IDENTITYCOL", "IDENTITY_INSERT", "IF", 
		"IN", "INDEX", "INNER", "INSERT", "INTERSECT", "INTO", "IS", "JOIN", "KEY", 
		"KILL", "LEFT", "LIKE", "LINENO", "LOAD", "MERGE", "NATIONAL", "NOCHECK", 
		"NONCLUSTERED", "NOT", "NULL", "NULLIF", "OF", "OFF", "OFFSETS", "ON", 
		"OPEN", "OPENDATASOURCE", "OPENQUERY", "OPENROWSET", "OPENXML", "OPTION", 
		"OR", "ORDER", "OUTER", "OVER", "PERCENT", "PIVOT", "PLAN", "PRECISION", 
		"PRIMARY", "PRINT", "PROC", "PROCEDURE", "PUBLIC", "RAISERROR", "READ", 
		"READTEXT", "RECONFIGURE", "REFERENCES", "REPLICATION", "RESTORE", "RESTRICT", 
		"RETURN", "REVERT", "REVOKE", "RIGHT", "ROLLBACK", "ROWCOUNT", "ROWGUIDCOL", 
		"RULE", "SAVE", "SCHEMA", "SECURITYAUDIT", "SELECT", "SEMANTICKEYPHRASETABLE", 
		"SEMANTICSIMILARITYDETAILSTABLE", "SEMANTICSIMILARITYTABLE", "SESSION_USER", 
		"SET", "SETUSER", "SHUTDOWN", "SOME", "STATISTICS", "SYSTEM_USER", "TABLE", 
		"TABLESAMPLE", "TEXTSIZE", "THEN", "TO", "TOP", "TRAN", "TRANSACTION", 
		"TRIGGER", "TRUNCATE", "TRY_CONVERT", "TSEQUAL", "UNION", "UNIQUE", "UNPIVOT", 
		"UPDATE", "UPDATETEXT", "USE", "USER", "VALUES", "VARYING", "VIEW", "WAITFOR", 
		"WHEN", "WHERE", "WHILE", "WITH", "WITHIN", "WRITETEXT", "ABSOLUTE", "APPLY", 
		"AUTO", "AVG", "BASE64", "BINARY_CHECKSUM", "CALLER", "CAST", "CATCH", 
		"CHECKSUM", "CHECKSUM_AGG", "COMMITTED", "CONCAT", "COOKIE", "COUNT", 
		"COUNT_BIG", "DATEADD", "DATEDIFF", "DATENAME", "DATEPART", "DELAY", "DELETED", 
		"DENSE_RANK", "DISABLE", "DYNAMIC", "ENCRYPTION", "FAST", "FAST_FORWARD", 
		"FIRST", "FOLLOWING", "FORWARD_ONLY", "FULLSCAN", "GLOBAL", "GO", "GROUPING", 
		"GROUPING_ID", "HASH", "INSENSITIVE", "INSERTED", "ISOLATION", "KEEPFIXED", 
		"KEYSET", "LAST", "LEVEL", "LOCAL", "LOCK_ESCALATION", "LOGIN", "LOOP", 
		"MARK", "MAX", "MIN", "MIN_ACTIVE_ROWVERSION", "MODIFY", "NEXT", "NAME", 
		"NOCOUNT", "NOEXPAND", "NORECOMPUTE", "NTILE", "NUMBER", "OFFSET", "ONLY", 
		"OPTIMISTIC", "OPTIMIZE", "OUT", "OUTPUT", "OWNER", "PARTITION", "PATH", 
		"PRECEDING", "PRIOR", "RANGE", "RANK", "READONLY", "READ_ONLY", "RECOMPILE", 
		"RELATIVE", "REMOTE", "REPEATABLE", "ROOT", "ROW", "ROWGUID", "ROWS", 
		"ROW_NUMBER", "SAMPLE", "SCHEMABINDING", "SCROLL", "SCROLL_LOCKS", "SELF", 
		"SERIALIZABLE", "SNAPSHOT", "SPATIAL_WINDOW_MAX_CELLS", "STATIC", "STATS_STREAM", 
		"STDEV", "STDEVP", "SUM", "THROW", "TIES", "TIME", "TRY", "TYPE", "TYPE_WARNING", 
		"UNBOUNDED", "UNCOMMITTED", "UNKNOWN", "USING", "VAR", "VARP", "VIEW_METADATA", 
		"WORK", "XML", "XMLNAMESPACES", "DOLLAR_ACTION", "SPACE", "COMMENT", "LINE_COMMENT", 
		"DOUBLE_QUOTE_ID", "SQUARE_BRACKET_ID", "LOCAL_ID", "DECIMAL", "ID", "STRING", 
		"BINARY", "FLOAT", "REAL", "EQUAL", "GREATER", "LESS", "EXCLAMATION", 
		"PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", "DOT", "UNDERLINE", "AT", "SHARP", 
		"DOLLAR", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "COLON", "STAR", 
		"DIVIDE", "MODULE", "PLUS", "MINUS", "BIT_NOT", "BIT_OR", "BIT_AND", "BIT_XOR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "tsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Tsql_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tsqlParser.EOF, 0); }
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public Tsql_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsql_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTsql_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTsql_file(this);
		}
	}

	public final Tsql_fileContext tsql_file() throws RecognitionException {
		Tsql_fileContext _localctx = new Tsql_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tsql_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE) | (1L << DECLARE) | (1L << DELETE) | (1L << DROP) | (1L << EXEC) | (1L << EXECUTE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FETCH - 66)) | (1L << (FORCESEEK - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (INSERT - 66)) | (1L << (OPEN - 66)) | (1L << (PRINT - 66)) | (1L << (RAISERROR - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (RETURN - 137)) | (1L << (REVERT - 137)) | (1L << (ROLLBACK - 137)) | (1L << (SAVE - 137)) | (1L << (SELECT - 137)) | (1L << (SET - 137)) | (1L << (UPDATE - 137)) | (1L << (USE - 137)) | (1L << (WAITFOR - 137)) | (1L << (WHILE - 137)) | (1L << (WITH - 137)) | (1L << (ABSOLUTE - 137)) | (1L << (APPLY - 137)) | (1L << (AUTO - 137)) | (1L << (AVG - 137)) | (1L << (BASE64 - 137)) | (1L << (CALLER - 137)) | (1L << (CAST - 137)) | (1L << (CATCH - 137)) | (1L << (CHECKSUM_AGG - 137)) | (1L << (COMMITTED - 137)) | (1L << (CONCAT - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (COOKIE - 201)) | (1L << (COUNT - 201)) | (1L << (COUNT_BIG - 201)) | (1L << (DELAY - 201)) | (1L << (DELETED - 201)) | (1L << (DENSE_RANK - 201)) | (1L << (DISABLE - 201)) | (1L << (DYNAMIC - 201)) | (1L << (ENCRYPTION - 201)) | (1L << (FAST - 201)) | (1L << (FAST_FORWARD - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORWARD_ONLY - 201)) | (1L << (FULLSCAN - 201)) | (1L << (GLOBAL - 201)) | (1L << (GO - 201)) | (1L << (GROUPING - 201)) | (1L << (GROUPING_ID - 201)) | (1L << (HASH - 201)) | (1L << (INSENSITIVE - 201)) | (1L << (INSERTED - 201)) | (1L << (ISOLATION - 201)) | (1L << (KEEPFIXED - 201)) | (1L << (KEYSET - 201)) | (1L << (LAST - 201)) | (1L << (LEVEL - 201)) | (1L << (LOCAL - 201)) | (1L << (LOCK_ESCALATION - 201)) | (1L << (LOGIN - 201)) | (1L << (LOOP - 201)) | (1L << (MARK - 201)) | (1L << (MAX - 201)) | (1L << (MIN - 201)) | (1L << (MODIFY - 201)) | (1L << (NEXT - 201)) | (1L << (NAME - 201)) | (1L << (NOCOUNT - 201)) | (1L << (NOEXPAND - 201)) | (1L << (NORECOMPUTE - 201)) | (1L << (NTILE - 201)) | (1L << (NUMBER - 201)) | (1L << (OFFSET - 201)) | (1L << (ONLY - 201)) | (1L << (OPTIMISTIC - 201)) | (1L << (OPTIMIZE - 201)) | (1L << (OUT - 201)) | (1L << (OUTPUT - 201)) | (1L << (OWNER - 201)) | (1L << (PARTITION - 201)) | (1L << (PATH - 201)) | (1L << (PRECEDING - 201)) | (1L << (PRIOR - 201)) | (1L << (RANGE - 201)) | (1L << (RANK - 201)) | (1L << (READONLY - 201)) | (1L << (READ_ONLY - 201)) | (1L << (RECOMPILE - 201)) | (1L << (RELATIVE - 201)))) != 0) || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (REMOTE - 265)) | (1L << (REPEATABLE - 265)) | (1L << (ROOT - 265)) | (1L << (ROW - 265)) | (1L << (ROWGUID - 265)) | (1L << (ROWS - 265)) | (1L << (ROW_NUMBER - 265)) | (1L << (SAMPLE - 265)) | (1L << (SCHEMABINDING - 265)) | (1L << (SCROLL - 265)) | (1L << (SCROLL_LOCKS - 265)) | (1L << (SELF - 265)) | (1L << (SERIALIZABLE - 265)) | (1L << (SNAPSHOT - 265)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 265)) | (1L << (STATIC - 265)) | (1L << (STATS_STREAM - 265)) | (1L << (STDEV - 265)) | (1L << (STDEVP - 265)) | (1L << (SUM - 265)) | (1L << (THROW - 265)) | (1L << (TIES - 265)) | (1L << (TIME - 265)) | (1L << (TRY - 265)) | (1L << (TYPE - 265)) | (1L << (TYPE_WARNING - 265)) | (1L << (UNBOUNDED - 265)) | (1L << (UNCOMMITTED - 265)) | (1L << (UNKNOWN - 265)) | (1L << (USING - 265)) | (1L << (VAR - 265)) | (1L << (VARP - 265)) | (1L << (VIEW_METADATA - 265)) | (1L << (WORK - 265)) | (1L << (XML - 265)) | (1L << (XMLNAMESPACES - 265)) | (1L << (DOUBLE_QUOTE_ID - 265)) | (1L << (SQUARE_BRACKET_ID - 265)) | (1L << (ID - 265)))) != 0) || _la==LR_BRACKET) {
				{
				{
				setState(268);
				sql_clause();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_clauseContext extends ParserRuleContext {
		public Dml_clauseContext dml_clause() {
			return getRuleContext(Dml_clauseContext.class,0);
		}
		public Ddl_clauseContext ddl_clause() {
			return getRuleContext(Ddl_clauseContext.class,0);
		}
		public Cfl_statementContext cfl_statement() {
			return getRuleContext(Cfl_statementContext.class,0);
		}
		public Another_statementContext another_statement() {
			return getRuleContext(Another_statementContext.class,0);
		}
		public Sql_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSql_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSql_clause(this);
		}
	}

	public final Sql_clauseContext sql_clause() throws RecognitionException {
		Sql_clauseContext _localctx = new Sql_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_clause);
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				dml_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				ddl_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				cfl_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				another_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dml_clauseContext extends ParserRuleContext {
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Dml_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDml_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDml_clause(this);
		}
	}

	public final Dml_clauseContext dml_clause() throws RecognitionException {
		Dml_clauseContext _localctx = new Dml_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dml_clause);
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				delete_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				insert_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				select_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				update_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_clauseContext extends ParserRuleContext {
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public Create_procedureContext create_procedure() {
			return getRuleContext(Create_procedureContext.class,0);
		}
		public Create_statisticsContext create_statistics() {
			return getRuleContext(Create_statisticsContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Alter_databaseContext alter_database() {
			return getRuleContext(Alter_databaseContext.class,0);
		}
		public Drop_indexContext drop_index() {
			return getRuleContext(Drop_indexContext.class,0);
		}
		public Drop_procedureContext drop_procedure() {
			return getRuleContext(Drop_procedureContext.class,0);
		}
		public Drop_statisticsContext drop_statistics() {
			return getRuleContext(Drop_statisticsContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Drop_viewContext drop_view() {
			return getRuleContext(Drop_viewContext.class,0);
		}
		public Ddl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDdl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDdl_clause(this);
		}
	}

	public final Ddl_clauseContext ddl_clause() throws RecognitionException {
		Ddl_clauseContext _localctx = new Ddl_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ddl_clause);
		try {
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				create_index();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				create_procedure();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				create_statistics();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				create_table();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				create_view();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				alter_table();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(294);
				alter_database();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(295);
				drop_index();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(296);
				drop_procedure();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(297);
				drop_statistics();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(298);
				drop_table();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(299);
				drop_view();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfl_statementContext extends ParserRuleContext {
		public Cfl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfl_statement; }
	 
		public Cfl_statementContext() { }
		public void copyFrom(Cfl_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Waitfor_statementContext extends Cfl_statementContext {
		public TerminalNode WAITFOR() { return getToken(tsqlParser.WAITFOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELAY() { return getToken(tsqlParser.DELAY, 0); }
		public TerminalNode TIME() { return getToken(tsqlParser.TIME, 0); }
		public Waitfor_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWaitfor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWaitfor_statement(this);
		}
	}
	public static class Print_statementContext extends Cfl_statementContext {
		public TerminalNode PRINT() { return getToken(tsqlParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitPrint_statement(this);
		}
	}
	public static class Continue_statementContext extends Cfl_statementContext {
		public TerminalNode CONTINUE() { return getToken(tsqlParser.CONTINUE, 0); }
		public Continue_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitContinue_statement(this);
		}
	}
	public static class Begin_statementContext extends Cfl_statementContext {
		public TerminalNode BEGIN() { return getToken(tsqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(tsqlParser.END, 0); }
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public Begin_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBegin_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBegin_statement(this);
		}
	}
	public static class If_statementContext extends Cfl_statementContext {
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(tsqlParser.ELSE, 0); }
		public If_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitIf_statement(this);
		}
	}
	public static class Raiseerror_statementContext extends Cfl_statementContext {
		public Token msg;
		public TerminalNode RAISERROR() { return getToken(tsqlParser.RAISERROR, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public Raiseerror_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRaiseerror_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRaiseerror_statement(this);
		}
	}
	public static class Throw_statementContext extends Cfl_statementContext {
		public TerminalNode THROW() { return getToken(tsqlParser.THROW, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Throw_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitThrow_statement(this);
		}
	}
	public static class Try_catch_statementContext extends Cfl_statementContext {
		public List<TerminalNode> BEGIN() { return getTokens(tsqlParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(tsqlParser.BEGIN, i);
		}
		public List<TerminalNode> TRY() { return getTokens(tsqlParser.TRY); }
		public TerminalNode TRY(int i) {
			return getToken(tsqlParser.TRY, i);
		}
		public List<TerminalNode> END() { return getTokens(tsqlParser.END); }
		public TerminalNode END(int i) {
			return getToken(tsqlParser.END, i);
		}
		public List<TerminalNode> CATCH() { return getTokens(tsqlParser.CATCH); }
		public TerminalNode CATCH(int i) {
			return getToken(tsqlParser.CATCH, i);
		}
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public Try_catch_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTry_catch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTry_catch_statement(this);
		}
	}
	public static class While_statementContext extends Cfl_statementContext {
		public TerminalNode WHILE() { return getToken(tsqlParser.WHILE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Sql_clauseContext sql_clause() {
			return getRuleContext(Sql_clauseContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(tsqlParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(tsqlParser.CONTINUE, 0); }
		public While_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWhile_statement(this);
		}
	}
	public static class Break_statementContext extends Cfl_statementContext {
		public TerminalNode BREAK() { return getToken(tsqlParser.BREAK, 0); }
		public Break_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBreak_statement(this);
		}
	}
	public static class Goto_statementContext extends Cfl_statementContext {
		public TerminalNode GOTO() { return getToken(tsqlParser.GOTO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Goto_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterGoto_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitGoto_statement(this);
		}
	}
	public static class Return_statementContext extends Cfl_statementContext {
		public TerminalNode RETURN() { return getToken(tsqlParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitReturn_statement(this);
		}
	}

	public final Cfl_statementContext cfl_statement() throws RecognitionException {
		Cfl_statementContext _localctx = new Cfl_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cfl_statement);
		int _la;
		try {
			setState(445);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new Begin_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(BEGIN);
				setState(304);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(303);
					match(SEMI);
					}
				}

				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE) | (1L << DECLARE) | (1L << DELETE) | (1L << DROP) | (1L << EXEC) | (1L << EXECUTE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FETCH - 66)) | (1L << (FORCESEEK - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (INSERT - 66)) | (1L << (OPEN - 66)) | (1L << (PRINT - 66)) | (1L << (RAISERROR - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (RETURN - 137)) | (1L << (REVERT - 137)) | (1L << (ROLLBACK - 137)) | (1L << (SAVE - 137)) | (1L << (SELECT - 137)) | (1L << (SET - 137)) | (1L << (UPDATE - 137)) | (1L << (USE - 137)) | (1L << (WAITFOR - 137)) | (1L << (WHILE - 137)) | (1L << (WITH - 137)) | (1L << (ABSOLUTE - 137)) | (1L << (APPLY - 137)) | (1L << (AUTO - 137)) | (1L << (AVG - 137)) | (1L << (BASE64 - 137)) | (1L << (CALLER - 137)) | (1L << (CAST - 137)) | (1L << (CATCH - 137)) | (1L << (CHECKSUM_AGG - 137)) | (1L << (COMMITTED - 137)) | (1L << (CONCAT - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (COOKIE - 201)) | (1L << (COUNT - 201)) | (1L << (COUNT_BIG - 201)) | (1L << (DELAY - 201)) | (1L << (DELETED - 201)) | (1L << (DENSE_RANK - 201)) | (1L << (DISABLE - 201)) | (1L << (DYNAMIC - 201)) | (1L << (ENCRYPTION - 201)) | (1L << (FAST - 201)) | (1L << (FAST_FORWARD - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORWARD_ONLY - 201)) | (1L << (FULLSCAN - 201)) | (1L << (GLOBAL - 201)) | (1L << (GO - 201)) | (1L << (GROUPING - 201)) | (1L << (GROUPING_ID - 201)) | (1L << (HASH - 201)) | (1L << (INSENSITIVE - 201)) | (1L << (INSERTED - 201)) | (1L << (ISOLATION - 201)) | (1L << (KEEPFIXED - 201)) | (1L << (KEYSET - 201)) | (1L << (LAST - 201)) | (1L << (LEVEL - 201)) | (1L << (LOCAL - 201)) | (1L << (LOCK_ESCALATION - 201)) | (1L << (LOGIN - 201)) | (1L << (LOOP - 201)) | (1L << (MARK - 201)) | (1L << (MAX - 201)) | (1L << (MIN - 201)) | (1L << (MODIFY - 201)) | (1L << (NEXT - 201)) | (1L << (NAME - 201)) | (1L << (NOCOUNT - 201)) | (1L << (NOEXPAND - 201)) | (1L << (NORECOMPUTE - 201)) | (1L << (NTILE - 201)) | (1L << (NUMBER - 201)) | (1L << (OFFSET - 201)) | (1L << (ONLY - 201)) | (1L << (OPTIMISTIC - 201)) | (1L << (OPTIMIZE - 201)) | (1L << (OUT - 201)) | (1L << (OUTPUT - 201)) | (1L << (OWNER - 201)) | (1L << (PARTITION - 201)) | (1L << (PATH - 201)) | (1L << (PRECEDING - 201)) | (1L << (PRIOR - 201)) | (1L << (RANGE - 201)) | (1L << (RANK - 201)) | (1L << (READONLY - 201)) | (1L << (READ_ONLY - 201)) | (1L << (RECOMPILE - 201)) | (1L << (RELATIVE - 201)))) != 0) || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (REMOTE - 265)) | (1L << (REPEATABLE - 265)) | (1L << (ROOT - 265)) | (1L << (ROW - 265)) | (1L << (ROWGUID - 265)) | (1L << (ROWS - 265)) | (1L << (ROW_NUMBER - 265)) | (1L << (SAMPLE - 265)) | (1L << (SCHEMABINDING - 265)) | (1L << (SCROLL - 265)) | (1L << (SCROLL_LOCKS - 265)) | (1L << (SELF - 265)) | (1L << (SERIALIZABLE - 265)) | (1L << (SNAPSHOT - 265)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 265)) | (1L << (STATIC - 265)) | (1L << (STATS_STREAM - 265)) | (1L << (STDEV - 265)) | (1L << (STDEVP - 265)) | (1L << (SUM - 265)) | (1L << (THROW - 265)) | (1L << (TIES - 265)) | (1L << (TIME - 265)) | (1L << (TRY - 265)) | (1L << (TYPE - 265)) | (1L << (TYPE_WARNING - 265)) | (1L << (UNBOUNDED - 265)) | (1L << (UNCOMMITTED - 265)) | (1L << (UNKNOWN - 265)) | (1L << (USING - 265)) | (1L << (VAR - 265)) | (1L << (VARP - 265)) | (1L << (VIEW_METADATA - 265)) | (1L << (WORK - 265)) | (1L << (XML - 265)) | (1L << (XMLNAMESPACES - 265)) | (1L << (DOUBLE_QUOTE_ID - 265)) | (1L << (SQUARE_BRACKET_ID - 265)) | (1L << (ID - 265)))) != 0) || _la==LR_BRACKET) {
					{
					{
					setState(306);
					sql_clause();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				match(END);
				setState(314);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(313);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Break_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(BREAK);
				setState(318);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(317);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new Continue_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(CONTINUE);
				setState(322);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(321);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Goto_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(GOTO);
				setState(325);
				id();
				setState(327);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(326);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new Goto_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				id();
				setState(330);
				match(COLON);
				setState(332);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(331);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(334);
				match(IF);
				setState(335);
				search_condition();
				setState(336);
				sql_clause();
				setState(339);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(337);
					match(ELSE);
					setState(338);
					sql_clause();
					}
					break;
				}
				setState(342);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(341);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(344);
				match(RETURN);
				setState(346);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(345);
					expression(0);
					}
					break;
				}
				setState(349);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(348);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new Throw_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(351);
				match(THROW);
				setState(357);
				_la = _input.LA(1);
				if (_la==LOCAL_ID || _la==DECIMAL) {
					{
					setState(352);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==DECIMAL) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(353);
					match(COMMA);
					setState(354);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==STRING) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(355);
					match(COMMA);
					setState(356);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==DECIMAL) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(360);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(359);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new Try_catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(362);
				match(BEGIN);
				setState(363);
				match(TRY);
				setState(365);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(364);
					match(SEMI);
					}
				}

				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE) | (1L << DECLARE) | (1L << DELETE) | (1L << DROP) | (1L << EXEC) | (1L << EXECUTE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FETCH - 66)) | (1L << (FORCESEEK - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (INSERT - 66)) | (1L << (OPEN - 66)) | (1L << (PRINT - 66)) | (1L << (RAISERROR - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (RETURN - 137)) | (1L << (REVERT - 137)) | (1L << (ROLLBACK - 137)) | (1L << (SAVE - 137)) | (1L << (SELECT - 137)) | (1L << (SET - 137)) | (1L << (UPDATE - 137)) | (1L << (USE - 137)) | (1L << (WAITFOR - 137)) | (1L << (WHILE - 137)) | (1L << (WITH - 137)) | (1L << (ABSOLUTE - 137)) | (1L << (APPLY - 137)) | (1L << (AUTO - 137)) | (1L << (AVG - 137)) | (1L << (BASE64 - 137)) | (1L << (CALLER - 137)) | (1L << (CAST - 137)) | (1L << (CATCH - 137)) | (1L << (CHECKSUM_AGG - 137)) | (1L << (COMMITTED - 137)) | (1L << (CONCAT - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (COOKIE - 201)) | (1L << (COUNT - 201)) | (1L << (COUNT_BIG - 201)) | (1L << (DELAY - 201)) | (1L << (DELETED - 201)) | (1L << (DENSE_RANK - 201)) | (1L << (DISABLE - 201)) | (1L << (DYNAMIC - 201)) | (1L << (ENCRYPTION - 201)) | (1L << (FAST - 201)) | (1L << (FAST_FORWARD - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORWARD_ONLY - 201)) | (1L << (FULLSCAN - 201)) | (1L << (GLOBAL - 201)) | (1L << (GO - 201)) | (1L << (GROUPING - 201)) | (1L << (GROUPING_ID - 201)) | (1L << (HASH - 201)) | (1L << (INSENSITIVE - 201)) | (1L << (INSERTED - 201)) | (1L << (ISOLATION - 201)) | (1L << (KEEPFIXED - 201)) | (1L << (KEYSET - 201)) | (1L << (LAST - 201)) | (1L << (LEVEL - 201)) | (1L << (LOCAL - 201)) | (1L << (LOCK_ESCALATION - 201)) | (1L << (LOGIN - 201)) | (1L << (LOOP - 201)) | (1L << (MARK - 201)) | (1L << (MAX - 201)) | (1L << (MIN - 201)) | (1L << (MODIFY - 201)) | (1L << (NEXT - 201)) | (1L << (NAME - 201)) | (1L << (NOCOUNT - 201)) | (1L << (NOEXPAND - 201)) | (1L << (NORECOMPUTE - 201)) | (1L << (NTILE - 201)) | (1L << (NUMBER - 201)) | (1L << (OFFSET - 201)) | (1L << (ONLY - 201)) | (1L << (OPTIMISTIC - 201)) | (1L << (OPTIMIZE - 201)) | (1L << (OUT - 201)) | (1L << (OUTPUT - 201)) | (1L << (OWNER - 201)) | (1L << (PARTITION - 201)) | (1L << (PATH - 201)) | (1L << (PRECEDING - 201)) | (1L << (PRIOR - 201)) | (1L << (RANGE - 201)) | (1L << (RANK - 201)) | (1L << (READONLY - 201)) | (1L << (READ_ONLY - 201)) | (1L << (RECOMPILE - 201)) | (1L << (RELATIVE - 201)))) != 0) || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (REMOTE - 265)) | (1L << (REPEATABLE - 265)) | (1L << (ROOT - 265)) | (1L << (ROW - 265)) | (1L << (ROWGUID - 265)) | (1L << (ROWS - 265)) | (1L << (ROW_NUMBER - 265)) | (1L << (SAMPLE - 265)) | (1L << (SCHEMABINDING - 265)) | (1L << (SCROLL - 265)) | (1L << (SCROLL_LOCKS - 265)) | (1L << (SELF - 265)) | (1L << (SERIALIZABLE - 265)) | (1L << (SNAPSHOT - 265)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 265)) | (1L << (STATIC - 265)) | (1L << (STATS_STREAM - 265)) | (1L << (STDEV - 265)) | (1L << (STDEVP - 265)) | (1L << (SUM - 265)) | (1L << (THROW - 265)) | (1L << (TIES - 265)) | (1L << (TIME - 265)) | (1L << (TRY - 265)) | (1L << (TYPE - 265)) | (1L << (TYPE_WARNING - 265)) | (1L << (UNBOUNDED - 265)) | (1L << (UNCOMMITTED - 265)) | (1L << (UNKNOWN - 265)) | (1L << (USING - 265)) | (1L << (VAR - 265)) | (1L << (VARP - 265)) | (1L << (VIEW_METADATA - 265)) | (1L << (WORK - 265)) | (1L << (XML - 265)) | (1L << (XMLNAMESPACES - 265)) | (1L << (DOUBLE_QUOTE_ID - 265)) | (1L << (SQUARE_BRACKET_ID - 265)) | (1L << (ID - 265)))) != 0) || _la==LR_BRACKET) {
					{
					{
					setState(367);
					sql_clause();
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(373);
				match(END);
				setState(374);
				match(TRY);
				setState(376);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(375);
					match(SEMI);
					}
				}

				setState(378);
				match(BEGIN);
				setState(379);
				match(CATCH);
				setState(381);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(380);
					match(SEMI);
					}
				}

				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE) | (1L << DECLARE) | (1L << DELETE) | (1L << DROP) | (1L << EXEC) | (1L << EXECUTE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FETCH - 66)) | (1L << (FORCESEEK - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (INSERT - 66)) | (1L << (OPEN - 66)) | (1L << (PRINT - 66)) | (1L << (RAISERROR - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (RETURN - 137)) | (1L << (REVERT - 137)) | (1L << (ROLLBACK - 137)) | (1L << (SAVE - 137)) | (1L << (SELECT - 137)) | (1L << (SET - 137)) | (1L << (UPDATE - 137)) | (1L << (USE - 137)) | (1L << (WAITFOR - 137)) | (1L << (WHILE - 137)) | (1L << (WITH - 137)) | (1L << (ABSOLUTE - 137)) | (1L << (APPLY - 137)) | (1L << (AUTO - 137)) | (1L << (AVG - 137)) | (1L << (BASE64 - 137)) | (1L << (CALLER - 137)) | (1L << (CAST - 137)) | (1L << (CATCH - 137)) | (1L << (CHECKSUM_AGG - 137)) | (1L << (COMMITTED - 137)) | (1L << (CONCAT - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (COOKIE - 201)) | (1L << (COUNT - 201)) | (1L << (COUNT_BIG - 201)) | (1L << (DELAY - 201)) | (1L << (DELETED - 201)) | (1L << (DENSE_RANK - 201)) | (1L << (DISABLE - 201)) | (1L << (DYNAMIC - 201)) | (1L << (ENCRYPTION - 201)) | (1L << (FAST - 201)) | (1L << (FAST_FORWARD - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORWARD_ONLY - 201)) | (1L << (FULLSCAN - 201)) | (1L << (GLOBAL - 201)) | (1L << (GO - 201)) | (1L << (GROUPING - 201)) | (1L << (GROUPING_ID - 201)) | (1L << (HASH - 201)) | (1L << (INSENSITIVE - 201)) | (1L << (INSERTED - 201)) | (1L << (ISOLATION - 201)) | (1L << (KEEPFIXED - 201)) | (1L << (KEYSET - 201)) | (1L << (LAST - 201)) | (1L << (LEVEL - 201)) | (1L << (LOCAL - 201)) | (1L << (LOCK_ESCALATION - 201)) | (1L << (LOGIN - 201)) | (1L << (LOOP - 201)) | (1L << (MARK - 201)) | (1L << (MAX - 201)) | (1L << (MIN - 201)) | (1L << (MODIFY - 201)) | (1L << (NEXT - 201)) | (1L << (NAME - 201)) | (1L << (NOCOUNT - 201)) | (1L << (NOEXPAND - 201)) | (1L << (NORECOMPUTE - 201)) | (1L << (NTILE - 201)) | (1L << (NUMBER - 201)) | (1L << (OFFSET - 201)) | (1L << (ONLY - 201)) | (1L << (OPTIMISTIC - 201)) | (1L << (OPTIMIZE - 201)) | (1L << (OUT - 201)) | (1L << (OUTPUT - 201)) | (1L << (OWNER - 201)) | (1L << (PARTITION - 201)) | (1L << (PATH - 201)) | (1L << (PRECEDING - 201)) | (1L << (PRIOR - 201)) | (1L << (RANGE - 201)) | (1L << (RANK - 201)) | (1L << (READONLY - 201)) | (1L << (READ_ONLY - 201)) | (1L << (RECOMPILE - 201)) | (1L << (RELATIVE - 201)))) != 0) || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (REMOTE - 265)) | (1L << (REPEATABLE - 265)) | (1L << (ROOT - 265)) | (1L << (ROW - 265)) | (1L << (ROWGUID - 265)) | (1L << (ROWS - 265)) | (1L << (ROW_NUMBER - 265)) | (1L << (SAMPLE - 265)) | (1L << (SCHEMABINDING - 265)) | (1L << (SCROLL - 265)) | (1L << (SCROLL_LOCKS - 265)) | (1L << (SELF - 265)) | (1L << (SERIALIZABLE - 265)) | (1L << (SNAPSHOT - 265)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 265)) | (1L << (STATIC - 265)) | (1L << (STATS_STREAM - 265)) | (1L << (STDEV - 265)) | (1L << (STDEVP - 265)) | (1L << (SUM - 265)) | (1L << (THROW - 265)) | (1L << (TIES - 265)) | (1L << (TIME - 265)) | (1L << (TRY - 265)) | (1L << (TYPE - 265)) | (1L << (TYPE_WARNING - 265)) | (1L << (UNBOUNDED - 265)) | (1L << (UNCOMMITTED - 265)) | (1L << (UNKNOWN - 265)) | (1L << (USING - 265)) | (1L << (VAR - 265)) | (1L << (VARP - 265)) | (1L << (VIEW_METADATA - 265)) | (1L << (WORK - 265)) | (1L << (XML - 265)) | (1L << (XMLNAMESPACES - 265)) | (1L << (DOUBLE_QUOTE_ID - 265)) | (1L << (SQUARE_BRACKET_ID - 265)) | (1L << (ID - 265)))) != 0) || _la==LR_BRACKET) {
					{
					{
					setState(383);
					sql_clause();
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(389);
				match(END);
				setState(390);
				match(CATCH);
				setState(392);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(391);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new Waitfor_statementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(394);
				match(WAITFOR);
				setState(395);
				_la = _input.LA(1);
				if ( !(_la==DELAY || _la==TIME) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(396);
				expression(0);
				setState(398);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(397);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(400);
				match(WHILE);
				setState(401);
				search_condition();
				setState(411);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(402);
					sql_clause();
					}
					break;
				case 2:
					{
					setState(403);
					match(BREAK);
					setState(405);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(404);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(407);
					match(CONTINUE);
					setState(409);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(408);
						match(SEMI);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new Print_statementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(413);
				match(PRINT);
				setState(414);
				expression(0);
				setState(416);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(415);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new Raiseerror_statementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(418);
				match(RAISERROR);
				setState(419);
				match(LR_BRACKET);
				setState(420);
				((Raiseerror_statementContext)_localctx).msg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 307)) & ~0x3f) == 0 && ((1L << (_la - 307)) & ((1L << (LOCAL_ID - 307)) | (1L << (DECIMAL - 307)) | (1L << (STRING - 307)))) != 0)) ) {
					((Raiseerror_statementContext)_localctx).msg = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(421);
				match(COMMA);
				setState(424);
				switch (_input.LA(1)) {
				case DECIMAL:
				case PLUS:
				case MINUS:
					{
					setState(422);
					number();
					}
					break;
				case LOCAL_ID:
					{
					setState(423);
					match(LOCAL_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(426);
				match(COMMA);
				setState(429);
				switch (_input.LA(1)) {
				case DECIMAL:
				case PLUS:
				case MINUS:
					{
					setState(427);
					number();
					}
					break;
				case LOCAL_ID:
					{
					setState(428);
					match(LOCAL_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(431);
					match(COMMA);
					setState(434);
					switch (_input.LA(1)) {
					case DECIMAL:
					case STRING:
					case BINARY:
					case FLOAT:
					case REAL:
					case DOLLAR:
					case PLUS:
					case MINUS:
						{
						setState(432);
						constant();
						}
						break;
					case LOCAL_ID:
						{
						setState(433);
						match(LOCAL_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(441);
				match(RR_BRACKET);
				setState(443);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(442);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Another_statementContext extends ParserRuleContext {
		public Declare_statementContext declare_statement() {
			return getRuleContext(Declare_statementContext.class,0);
		}
		public Cursor_statementContext cursor_statement() {
			return getRuleContext(Cursor_statementContext.class,0);
		}
		public Execute_statementContext execute_statement() {
			return getRuleContext(Execute_statementContext.class,0);
		}
		public Security_statementContext security_statement() {
			return getRuleContext(Security_statementContext.class,0);
		}
		public Set_statmentContext set_statment() {
			return getRuleContext(Set_statmentContext.class,0);
		}
		public Transaction_statementContext transaction_statement() {
			return getRuleContext(Transaction_statementContext.class,0);
		}
		public Go_statementContext go_statement() {
			return getRuleContext(Go_statementContext.class,0);
		}
		public Use_statementContext use_statement() {
			return getRuleContext(Use_statementContext.class,0);
		}
		public Another_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_another_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAnother_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAnother_statement(this);
		}
	}

	public final Another_statementContext another_statement() throws RecognitionException {
		Another_statementContext _localctx = new Another_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_another_statement);
		try {
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				declare_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				cursor_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				execute_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				security_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				set_statment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(452);
				transaction_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(453);
				go_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(454);
				use_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementContext extends ParserRuleContext {
		public Token table_var;
		public Token cursor_var;
		public TerminalNode DELETE() { return getToken(tsqlParser.DELETE, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public TerminalNode TOP() { return getToken(tsqlParser.TOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(tsqlParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(tsqlParser.FROM, i);
		}
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(tsqlParser.WHERE, 0); }
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDelete_statement(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(457);
				with_expression();
				}
			}

			setState(460);
			match(DELETE);
			setState(468);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(461);
				match(TOP);
				setState(462);
				match(LR_BRACKET);
				setState(463);
				expression(0);
				setState(464);
				match(RR_BRACKET);
				setState(466);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(465);
					match(PERCENT);
					}
				}

				}
			}

			setState(471);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(470);
				match(FROM);
				}
			}

			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(473);
				table_alias();
				}
				break;
			case 2:
				{
				setState(474);
				ddl_object();
				}
				break;
			case 3:
				{
				setState(475);
				rowset_function_limited();
				}
				break;
			case 4:
				{
				setState(476);
				((Delete_statementContext)_localctx).table_var = match(LOCAL_ID);
				}
				break;
			}
			setState(480);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(479);
				with_table_hints();
				}
				break;
			}
			setState(483);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(482);
				output_clause();
				}
				break;
			}
			setState(494);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(485);
				match(FROM);
				setState(486);
				table_source();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(487);
					match(COMMA);
					setState(488);
					table_source();
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(509);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(496);
				match(WHERE);
				setState(507);
				switch (_input.LA(1)) {
				case CASE:
				case COALESCE:
				case CONVERT:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DEFAULT:
				case EXISTS:
				case FORCESEEK:
				case IDENTITY:
				case LEFT:
				case NOT:
				case NULL:
				case NULLIF:
				case RIGHT:
				case SESSION_USER:
				case SYSTEM_USER:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case BINARY_CHECKSUM:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATEADD:
				case DATEDIFF:
				case DATENAME:
				case DATEPART:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MIN_ACTIVE_ROWVERSION:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
					{
					setState(497);
					search_condition();
					}
					break;
				case CURRENT:
					{
					setState(498);
					match(CURRENT);
					setState(499);
					match(OF);
					setState(505);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(501);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							setState(500);
							match(GLOBAL);
							}
							break;
						}
						setState(503);
						cursor_name();
						}
						break;
					case 2:
						{
						setState(504);
						((Delete_statementContext)_localctx).cursor_var = match(LOCAL_ID);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(512);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(511);
				for_clause();
				}
			}

			setState(515);
			_la = _input.LA(1);
			if (_la==OPTION) {
				{
				setState(514);
				option_clause();
				}
			}

			setState(518);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(517);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(tsqlParser.INSERT, 0); }
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(tsqlParser.VALUES, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public Execute_statementContext execute_statement() {
			return getRuleContext(Execute_statementContext.class,0);
		}
		public Dml_table_sourceContext dml_table_source() {
			return getRuleContext(Dml_table_sourceContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public TerminalNode TOP() { return getToken(tsqlParser.TOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitInsert_statement(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(520);
				with_expression();
				}
			}

			setState(523);
			match(INSERT);
			setState(531);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(524);
				match(TOP);
				setState(525);
				match(LR_BRACKET);
				setState(526);
				expression(0);
				setState(527);
				match(RR_BRACKET);
				setState(529);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(528);
					match(PERCENT);
					}
				}

				}
			}

			setState(534);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(533);
				match(INTO);
				}
			}

			setState(538);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case ID:
				{
				setState(536);
				ddl_object();
				}
				break;
			case OPENDATASOURCE:
			case OPENQUERY:
				{
				setState(537);
				rowset_function_limited();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(541);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(540);
				with_table_hints();
				}
				break;
			}
			setState(547);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(543);
				match(LR_BRACKET);
				setState(544);
				column_name_list();
				setState(545);
				match(RR_BRACKET);
				}
				break;
			}
			setState(550);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(549);
				output_clause();
				}
			}

			setState(571);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(552);
				match(VALUES);
				setState(553);
				match(LR_BRACKET);
				setState(554);
				expression_list();
				setState(555);
				match(RR_BRACKET);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(556);
					match(COMMA);
					setState(557);
					match(LR_BRACKET);
					setState(558);
					expression_list();
					setState(559);
					match(RR_BRACKET);
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(566);
				derived_table();
				}
				break;
			case 3:
				{
				setState(567);
				execute_statement();
				}
				break;
			case 4:
				{
				setState(568);
				dml_table_source();
				}
				break;
			case 5:
				{
				setState(569);
				match(DEFAULT);
				setState(570);
				match(VALUES);
				}
				break;
			}
			setState(574);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(573);
				for_clause();
				}
			}

			setState(577);
			_la = _input.LA(1);
			if (_la==OPTION) {
				{
				setState(576);
				option_clause();
				}
			}

			setState(580);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(579);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(582);
				with_expression();
				}
			}

			setState(585);
			query_expression();
			setState(587);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(586);
				order_by_clause();
				}
				break;
			}
			setState(590);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(589);
				for_clause();
				}
				break;
			}
			setState(593);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(592);
				option_clause();
				}
				break;
			}
			setState(596);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(595);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public Token cursor_var;
		public TerminalNode UPDATE() { return getToken(tsqlParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public List<Update_elemContext> update_elem() {
			return getRuleContexts(Update_elemContext.class);
		}
		public Update_elemContext update_elem(int i) {
			return getRuleContext(Update_elemContext.class,i);
		}
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public TerminalNode TOP() { return getToken(tsqlParser.TOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(tsqlParser.FROM, 0); }
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(tsqlParser.WHERE, 0); }
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public Search_condition_listContext search_condition_list() {
			return getRuleContext(Search_condition_listContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUpdate_statement(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(598);
				with_expression();
				}
			}

			setState(601);
			match(UPDATE);
			setState(609);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(602);
				match(TOP);
				setState(603);
				match(LR_BRACKET);
				setState(604);
				expression(0);
				setState(605);
				match(RR_BRACKET);
				setState(607);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(606);
					match(PERCENT);
					}
				}

				}
			}

			setState(613);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case ID:
				{
				setState(611);
				ddl_object();
				}
				break;
			case OPENDATASOURCE:
			case OPENQUERY:
				{
				setState(612);
				rowset_function_limited();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(616);
			_la = _input.LA(1);
			if (_la==WITH || _la==LR_BRACKET) {
				{
				setState(615);
				with_table_hints();
				}
			}

			setState(618);
			match(SET);
			setState(619);
			update_elem();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(620);
				match(COMMA);
				setState(621);
				update_elem();
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(628);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(627);
				output_clause();
				}
				break;
			}
			setState(639);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(630);
				match(FROM);
				setState(631);
				table_source();
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(632);
					match(COMMA);
					setState(633);
					table_source();
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(654);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(641);
				match(WHERE);
				setState(652);
				switch (_input.LA(1)) {
				case CASE:
				case COALESCE:
				case CONVERT:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DEFAULT:
				case EXISTS:
				case FORCESEEK:
				case IDENTITY:
				case LEFT:
				case NOT:
				case NULL:
				case NULLIF:
				case RIGHT:
				case SESSION_USER:
				case SYSTEM_USER:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case BINARY_CHECKSUM:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATEADD:
				case DATEDIFF:
				case DATENAME:
				case DATEPART:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MIN_ACTIVE_ROWVERSION:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
					{
					setState(642);
					search_condition_list();
					}
					break;
				case CURRENT:
					{
					setState(643);
					match(CURRENT);
					setState(644);
					match(OF);
					setState(650);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(646);
						switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
						case 1:
							{
							setState(645);
							match(GLOBAL);
							}
							break;
						}
						setState(648);
						cursor_name();
						}
						break;
					case 2:
						{
						setState(649);
						((Update_statementContext)_localctx).cursor_var = match(LOCAL_ID);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(657);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(656);
				for_clause();
				}
			}

			setState(660);
			_la = _input.LA(1);
			if (_la==OPTION) {
				{
				setState(659);
				option_clause();
				}
			}

			setState(663);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(662);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_clauseContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public List<Output_dml_list_elemContext> output_dml_list_elem() {
			return getRuleContexts(Output_dml_list_elemContext.class);
		}
		public Output_dml_list_elemContext output_dml_list_elem(int i) {
			return getRuleContext(Output_dml_list_elemContext.class,i);
		}
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Output_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOutput_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOutput_clause(this);
		}
	}

	public final Output_clauseContext output_clause() throws RecognitionException {
		Output_clauseContext _localctx = new Output_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_output_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(OUTPUT);
			setState(666);
			output_dml_list_elem();
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(667);
				match(COMMA);
				setState(668);
				output_dml_list_elem();
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(674);
				match(INTO);
				setState(677);
				switch (_input.LA(1)) {
				case LOCAL_ID:
					{
					setState(675);
					match(LOCAL_ID);
					}
					break;
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(676);
					table_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(683);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(679);
					match(LR_BRACKET);
					setState(680);
					column_name_list();
					setState(681);
					match(RR_BRACKET);
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_dml_list_elemContext extends ParserRuleContext {
		public Output_column_nameContext output_column_name() {
			return getRuleContext(Output_column_nameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Output_dml_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_dml_list_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOutput_dml_list_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOutput_dml_list_elem(this);
		}
	}

	public final Output_dml_list_elemContext output_dml_list_elem() throws RecognitionException {
		Output_dml_list_elemContext _localctx = new Output_dml_list_elemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output_dml_list_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(687);
				output_column_name();
				}
				break;
			case 2:
				{
				setState(688);
				expression(0);
				}
				break;
			}
			setState(695);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(692);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(691);
					match(AS);
					}
				}

				setState(694);
				column_alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_column_nameContext extends ParserRuleContext {
		public TerminalNode DELETED() { return getToken(tsqlParser.DELETED, 0); }
		public TerminalNode INSERTED() { return getToken(tsqlParser.INSERTED, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode DOLLAR_ACTION() { return getToken(tsqlParser.DOLLAR_ACTION, 0); }
		public Output_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOutput_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOutput_column_name(this);
		}
	}

	public final Output_column_nameContext output_column_name() throws RecognitionException {
		Output_column_nameContext _localctx = new Output_column_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_output_column_name);
		try {
			setState(708);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(697);
					match(DELETED);
					}
					break;
				case 2:
					{
					setState(698);
					match(INSERTED);
					}
					break;
				case 3:
					{
					setState(699);
					table_name();
					}
					break;
				}
				setState(702);
				match(DOT);
				setState(705);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(703);
					match(STAR);
					}
					break;
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(704);
					column_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DOLLAR_ACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(DOLLAR_ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_indexContext extends ParserRuleContext {
		public IdContext name;
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(tsqlParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(tsqlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Create_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_index(this);
		}
	}

	public final Create_indexContext create_index() throws RecognitionException {
		Create_indexContext _localctx = new Create_indexContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(CREATE);
			setState(712);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(711);
				match(UNIQUE);
				}
			}

			setState(715);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(714);
				clustered();
				}
			}

			setState(717);
			match(INDEX);
			setState(718);
			((Create_indexContext)_localctx).name = id();
			setState(719);
			match(ON);
			setState(720);
			table_name_with_hint();
			setState(721);
			match(LR_BRACKET);
			setState(722);
			column_name_list();
			setState(723);
			match(RR_BRACKET);
			setState(725);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(724);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_procedureContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode PROC() { return getToken(tsqlParser.PROC, 0); }
		public TerminalNode PROCEDURE() { return getToken(tsqlParser.PROCEDURE, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public List<Procedure_paramContext> procedure_param() {
			return getRuleContexts(Procedure_paramContext.class);
		}
		public Procedure_paramContext procedure_param(int i) {
			return getRuleContext(Procedure_paramContext.class,i);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Procedure_optionContext> procedure_option() {
			return getRuleContexts(Procedure_optionContext.class);
		}
		public Procedure_optionContext procedure_option(int i) {
			return getRuleContext(Procedure_optionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public Create_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_procedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_procedure(this);
		}
	}

	public final Create_procedureContext create_procedure() throws RecognitionException {
		Create_procedureContext _localctx = new Create_procedureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_procedure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(CREATE);
			setState(728);
			_la = _input.LA(1);
			if ( !(_la==PROC || _la==PROCEDURE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(729);
			func_proc_name();
			setState(732);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(730);
				match(SEMI);
				setState(731);
				match(DECIMAL);
				}
			}

			setState(748);
			_la = _input.LA(1);
			if (_la==LOCAL_ID || _la==LR_BRACKET) {
				{
				setState(735);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(734);
					match(LR_BRACKET);
					}
				}

				setState(737);
				procedure_param();
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(738);
					match(COMMA);
					setState(739);
					procedure_param();
					}
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(746);
				_la = _input.LA(1);
				if (_la==RR_BRACKET) {
					{
					setState(745);
					match(RR_BRACKET);
					}
				}

				}
			}

			setState(759);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(750);
				match(WITH);
				setState(751);
				procedure_option();
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(752);
					match(COMMA);
					setState(753);
					procedure_option();
					}
					}
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(763);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(761);
				match(FOR);
				setState(762);
				match(REPLICATION);
				}
			}

			setState(765);
			match(AS);
			setState(767); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(766);
					sql_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(769); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_paramContext extends ParserRuleContext {
		public Default_valueContext default_val;
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode VARYING() { return getToken(tsqlParser.VARYING, 0); }
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public TerminalNode OUT() { return getToken(tsqlParser.OUT, 0); }
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public TerminalNode READONLY() { return getToken(tsqlParser.READONLY, 0); }
		public Procedure_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterProcedure_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitProcedure_param(this);
		}
	}

	public final Procedure_paramContext procedure_param() throws RecognitionException {
		Procedure_paramContext _localctx = new Procedure_paramContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_procedure_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(LOCAL_ID);
			setState(775);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(772);
				id();
				setState(773);
				match(DOT);
				}
				break;
			}
			setState(778);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(777);
				match(AS);
				}
			}

			setState(780);
			data_type();
			setState(782);
			_la = _input.LA(1);
			if (_la==VARYING) {
				{
				setState(781);
				match(VARYING);
				}
			}

			setState(786);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(784);
				match(EQUAL);
				setState(785);
				((Procedure_paramContext)_localctx).default_val = default_value();
				}
			}

			setState(789);
			_la = _input.LA(1);
			if (((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (OUT - 252)) | (1L << (OUTPUT - 252)) | (1L << (READONLY - 252)))) != 0)) {
				{
				setState(788);
				_la = _input.LA(1);
				if ( !(((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (OUT - 252)) | (1L << (OUTPUT - 252)) | (1L << (READONLY - 252)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_optionContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(tsqlParser.ENCRYPTION, 0); }
		public TerminalNode RECOMPILE() { return getToken(tsqlParser.RECOMPILE, 0); }
		public Execute_clauseContext execute_clause() {
			return getRuleContext(Execute_clauseContext.class,0);
		}
		public Procedure_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterProcedure_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitProcedure_option(this);
		}
	}

	public final Procedure_optionContext procedure_option() throws RecognitionException {
		Procedure_optionContext _localctx = new Procedure_optionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_procedure_option);
		try {
			setState(794);
			switch (_input.LA(1)) {
			case ENCRYPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(ENCRYPTION);
				}
				break;
			case RECOMPILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(RECOMPILE);
				}
				break;
			case EXEC:
			case EXECUTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				execute_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_statisticsContext extends ParserRuleContext {
		public On_offContext INCREMENTAL;
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode STATISTICS() { return getToken(tsqlParser.STATISTICS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode FULLSCAN() { return getToken(tsqlParser.FULLSCAN, 0); }
		public TerminalNode SAMPLE() { return getToken(tsqlParser.SAMPLE, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode STATS_STREAM() { return getToken(tsqlParser.STATS_STREAM, 0); }
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public TerminalNode NORECOMPUTE() { return getToken(tsqlParser.NORECOMPUTE, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public Create_statisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statistics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_statistics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_statistics(this);
		}
	}

	public final Create_statisticsContext create_statistics() throws RecognitionException {
		Create_statisticsContext _localctx = new Create_statisticsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_create_statistics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(CREATE);
			setState(797);
			match(STATISTICS);
			setState(798);
			id();
			setState(799);
			match(ON);
			setState(800);
			table_name_with_hint();
			setState(801);
			match(LR_BRACKET);
			setState(802);
			column_name_list();
			setState(803);
			match(RR_BRACKET);
			setState(820);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(804);
				match(WITH);
				setState(810);
				switch (_input.LA(1)) {
				case FULLSCAN:
					{
					setState(805);
					match(FULLSCAN);
					}
					break;
				case SAMPLE:
					{
					setState(806);
					match(SAMPLE);
					setState(807);
					match(DECIMAL);
					setState(808);
					_la = _input.LA(1);
					if ( !(_la==PERCENT || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case STATS_STREAM:
					{
					setState(809);
					match(STATS_STREAM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(814);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(812);
					match(COMMA);
					setState(813);
					match(NORECOMPUTE);
					}
					break;
				}
				setState(818);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(816);
					match(COMMA);
					setState(817);
					((Create_statisticsContext)_localctx).INCREMENTAL = on_off();
					}
				}

				}
				break;
			}
			setState(823);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(822);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_table(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(CREATE);
			setState(826);
			match(TABLE);
			setState(827);
			table_name();
			setState(828);
			match(LR_BRACKET);
			setState(829);
			column_def_table_constraint();
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(831);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(830);
						match(COMMA);
						}
					}

					setState(833);
					column_def_table_constraint();
					}
					} 
				}
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(840);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(839);
				match(COMMA);
				}
			}

			setState(842);
			match(RR_BRACKET);
			setState(846);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(843);
				match(ON);
				setState(844);
				id();
				}
				break;
			case DEFAULT:
				{
				setState(845);
				match(DEFAULT);
				}
				break;
			case EOF:
			case ALTER:
			case BEGIN:
			case BREAK:
			case CLOSE:
			case COMMIT:
			case CONTINUE:
			case CREATE:
			case DEALLOCATE:
			case DECLARE:
			case DELETE:
			case DROP:
			case ELSE:
			case END:
			case EXEC:
			case EXECUTE:
			case FETCH:
			case FORCESEEK:
			case GOTO:
			case IF:
			case INSERT:
			case OPEN:
			case PRINT:
			case RAISERROR:
			case RETURN:
			case REVERT:
			case ROLLBACK:
			case SAVE:
			case SELECT:
			case SET:
			case UPDATE:
			case USE:
			case WAITFOR:
			case WHILE:
			case WITH:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
			case LR_BRACKET:
			case SEMI:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(849);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(848);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_viewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(tsqlParser.VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(tsqlParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(tsqlParser.WITH, i);
		}
		public List<View_attributeContext> view_attribute() {
			return getRuleContexts(View_attributeContext.class);
		}
		public View_attributeContext view_attribute(int i) {
			return getRuleContext(View_attributeContext.class,i);
		}
		public TerminalNode CHECK() { return getToken(tsqlParser.CHECK, 0); }
		public TerminalNode OPTION() { return getToken(tsqlParser.OPTION, 0); }
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCreate_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCreate_view(this);
		}
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_create_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(CREATE);
			setState(852);
			match(VIEW);
			setState(853);
			view_name();
			setState(865);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(854);
				match(LR_BRACKET);
				setState(855);
				column_name();
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(856);
					match(COMMA);
					setState(857);
					column_name();
					}
					}
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(863);
				match(RR_BRACKET);
				}
			}

			setState(876);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(867);
				match(WITH);
				setState(868);
				view_attribute();
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(869);
					match(COMMA);
					setState(870);
					view_attribute();
					}
					}
					setState(875);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(878);
			match(AS);
			setState(879);
			select_statement();
			setState(883);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(880);
				match(WITH);
				setState(881);
				match(CHECK);
				setState(882);
				match(OPTION);
				}
				break;
			}
			setState(886);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(885);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_attributeContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(tsqlParser.ENCRYPTION, 0); }
		public TerminalNode SCHEMABINDING() { return getToken(tsqlParser.SCHEMABINDING, 0); }
		public TerminalNode VIEW_METADATA() { return getToken(tsqlParser.VIEW_METADATA, 0); }
		public View_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterView_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitView_attribute(this);
		}
	}

	public final View_attributeContext view_attribute() throws RecognitionException {
		View_attributeContext _localctx = new View_attributeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_view_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			_la = _input.LA(1);
			if ( !(_la==ENCRYPTION || _la==SCHEMABINDING || _la==VIEW_METADATA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_tableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(tsqlParser.ALTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(tsqlParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(tsqlParser.TABLE, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(tsqlParser.LOCK_ESCALATION, 0); }
		public TerminalNode AUTO() { return getToken(tsqlParser.AUTO, 0); }
		public TerminalNode DISABLE() { return getToken(tsqlParser.DISABLE, 0); }
		public TerminalNode ADD() { return getToken(tsqlParser.ADD, 0); }
		public Column_def_table_constraintContext column_def_table_constraint() {
			return getRuleContext(Column_def_table_constraintContext.class,0);
		}
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAlter_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAlter_table(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alter_table);
		int _la;
		try {
			setState(910);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				match(ALTER);
				setState(891);
				match(TABLE);
				setState(892);
				table_name();
				setState(893);
				match(SET);
				setState(894);
				match(LR_BRACKET);
				setState(895);
				match(LOCK_ESCALATION);
				setState(896);
				match(EQUAL);
				setState(897);
				_la = _input.LA(1);
				if ( !(((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (TABLE - 159)) | (1L << (AUTO - 159)) | (1L << (DISABLE - 159)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(898);
				match(RR_BRACKET);
				setState(900);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(899);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				match(ALTER);
				setState(903);
				match(TABLE);
				setState(904);
				table_name();
				setState(905);
				match(ADD);
				setState(906);
				column_def_table_constraint();
				setState(908);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(907);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_databaseContext extends ParserRuleContext {
		public IdContext database;
		public IdContext new_name;
		public IdContext collation;
		public TerminalNode ALTER() { return getToken(tsqlParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(tsqlParser.DATABASE, 0); }
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public TerminalNode MODIFY() { return getToken(tsqlParser.MODIFY, 0); }
		public TerminalNode NAME() { return getToken(tsqlParser.NAME, 0); }
		public TerminalNode COLLATE() { return getToken(tsqlParser.COLLATE, 0); }
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public Database_optionContext database_option() {
			return getRuleContext(Database_optionContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Alter_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAlter_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAlter_database(this);
		}
	}

	public final Alter_databaseContext alter_database() throws RecognitionException {
		Alter_databaseContext _localctx = new Alter_databaseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alter_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(ALTER);
			setState(913);
			match(DATABASE);
			setState(916);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(914);
				((Alter_databaseContext)_localctx).database = id();
				}
				break;
			case CURRENT:
				{
				setState(915);
				match(CURRENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(926);
			switch (_input.LA(1)) {
			case MODIFY:
				{
				setState(918);
				match(MODIFY);
				setState(919);
				match(NAME);
				setState(920);
				match(EQUAL);
				setState(921);
				((Alter_databaseContext)_localctx).new_name = id();
				}
				break;
			case COLLATE:
				{
				setState(922);
				match(COLLATE);
				setState(923);
				((Alter_databaseContext)_localctx).collation = id();
				}
				break;
			case SET:
				{
				setState(924);
				match(SET);
				setState(925);
				database_option();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(929);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(928);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_optionContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode FULL() { return getToken(tsqlParser.FULL, 0); }
		public Database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDatabase_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDatabase_option(this);
		}
	}

	public final Database_optionContext database_option() throws RecognitionException {
		Database_optionContext _localctx = new Database_optionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_database_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			id();
			setState(934);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(932);
				id();
				}
				break;
			case 2:
				{
				setState(933);
				match(FULL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_indexContext extends ParserRuleContext {
		public IdContext name;
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(tsqlParser.INDEX, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public Drop_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_index(this);
		}
	}

	public final Drop_indexContext drop_index() throws RecognitionException {
		Drop_indexContext _localctx = new Drop_indexContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_drop_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(DROP);
			setState(937);
			match(INDEX);
			setState(940);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(938);
				match(IF);
				setState(939);
				match(EXISTS);
				}
			}

			setState(942);
			((Drop_indexContext)_localctx).name = id();
			setState(944);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(943);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_procedureContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode PROCEDURE() { return getToken(tsqlParser.PROCEDURE, 0); }
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public Drop_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_procedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_procedure(this);
		}
	}

	public final Drop_procedureContext drop_procedure() throws RecognitionException {
		Drop_procedureContext _localctx = new Drop_procedureContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_drop_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(DROP);
			setState(947);
			match(PROCEDURE);
			setState(950);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(948);
				match(IF);
				setState(949);
				match(EXISTS);
				}
			}

			setState(952);
			func_proc_name();
			setState(954);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(953);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_statisticsContext extends ParserRuleContext {
		public IdContext name;
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode STATISTICS() { return getToken(tsqlParser.STATISTICS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Drop_statisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statistics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_statistics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_statistics(this);
		}
	}

	public final Drop_statisticsContext drop_statistics() throws RecognitionException {
		Drop_statisticsContext _localctx = new Drop_statisticsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_drop_statistics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(DROP);
			setState(957);
			match(STATISTICS);
			setState(961);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(958);
				table_name();
				setState(959);
				match(DOT);
				}
				break;
			}
			setState(963);
			((Drop_statisticsContext)_localctx).name = id();
			setState(964);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_tableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_table(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(DROP);
			setState(967);
			match(TABLE);
			setState(970);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(968);
				match(IF);
				setState(969);
				match(EXISTS);
				}
			}

			setState(972);
			table_name();
			setState(974);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(973);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_viewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(tsqlParser.VIEW, 0); }
		public List<View_nameContext> view_name() {
			return getRuleContexts(View_nameContext.class);
		}
		public View_nameContext view_name(int i) {
			return getRuleContext(View_nameContext.class,i);
		}
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public Drop_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDrop_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDrop_view(this);
		}
	}

	public final Drop_viewContext drop_view() throws RecognitionException {
		Drop_viewContext _localctx = new Drop_viewContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_drop_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(DROP);
			setState(977);
			match(VIEW);
			setState(980);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(978);
				match(IF);
				setState(979);
				match(EXISTS);
				}
			}

			setState(982);
			view_name();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(983);
				match(COMMA);
				setState(984);
				view_name();
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(991);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(990);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rowset_function_limitedContext extends ParserRuleContext {
		public OpenqueryContext openquery() {
			return getRuleContext(OpenqueryContext.class,0);
		}
		public OpendatasourceContext opendatasource() {
			return getRuleContext(OpendatasourceContext.class,0);
		}
		public Rowset_function_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowset_function_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRowset_function_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRowset_function_limited(this);
		}
	}

	public final Rowset_function_limitedContext rowset_function_limited() throws RecognitionException {
		Rowset_function_limitedContext _localctx = new Rowset_function_limitedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rowset_function_limited);
		try {
			setState(995);
			switch (_input.LA(1)) {
			case OPENQUERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				openquery();
				}
				break;
			case OPENDATASOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				opendatasource();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenqueryContext extends ParserRuleContext {
		public IdContext linked_server;
		public Token query;
		public TerminalNode OPENQUERY() { return getToken(tsqlParser.OPENQUERY, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public OpenqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOpenquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOpenquery(this);
		}
	}

	public final OpenqueryContext openquery() throws RecognitionException {
		OpenqueryContext _localctx = new OpenqueryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_openquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(OPENQUERY);
			setState(998);
			match(LR_BRACKET);
			setState(999);
			((OpenqueryContext)_localctx).linked_server = id();
			setState(1000);
			match(COMMA);
			setState(1001);
			((OpenqueryContext)_localctx).query = match(STRING);
			setState(1002);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpendatasourceContext extends ParserRuleContext {
		public Token provider;
		public Token init;
		public IdContext database;
		public IdContext scheme;
		public IdContext table;
		public TerminalNode OPENDATASOURCE() { return getToken(tsqlParser.OPENDATASOURCE, 0); }
		public List<TerminalNode> STRING() { return getTokens(tsqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(tsqlParser.STRING, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public OpendatasourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opendatasource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOpendatasource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOpendatasource(this);
		}
	}

	public final OpendatasourceContext opendatasource() throws RecognitionException {
		OpendatasourceContext _localctx = new OpendatasourceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_opendatasource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(OPENDATASOURCE);
			setState(1005);
			match(LR_BRACKET);
			setState(1006);
			((OpendatasourceContext)_localctx).provider = match(STRING);
			setState(1007);
			match(COMMA);
			setState(1008);
			((OpendatasourceContext)_localctx).init = match(STRING);
			setState(1009);
			match(RR_BRACKET);
			setState(1010);
			match(DOT);
			setState(1012);
			_la = _input.LA(1);
			if (_la==FORCESEEK || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ABSOLUTE - 188)) | (1L << (APPLY - 188)) | (1L << (AUTO - 188)) | (1L << (AVG - 188)) | (1L << (BASE64 - 188)) | (1L << (CALLER - 188)) | (1L << (CAST - 188)) | (1L << (CATCH - 188)) | (1L << (CHECKSUM_AGG - 188)) | (1L << (COMMITTED - 188)) | (1L << (CONCAT - 188)) | (1L << (COOKIE - 188)) | (1L << (COUNT - 188)) | (1L << (COUNT_BIG - 188)) | (1L << (DELAY - 188)) | (1L << (DELETED - 188)) | (1L << (DENSE_RANK - 188)) | (1L << (DISABLE - 188)) | (1L << (DYNAMIC - 188)) | (1L << (ENCRYPTION - 188)) | (1L << (FAST - 188)) | (1L << (FAST_FORWARD - 188)) | (1L << (FIRST - 188)) | (1L << (FOLLOWING - 188)) | (1L << (FORWARD_ONLY - 188)) | (1L << (FULLSCAN - 188)) | (1L << (GLOBAL - 188)) | (1L << (GO - 188)) | (1L << (GROUPING - 188)) | (1L << (GROUPING_ID - 188)) | (1L << (HASH - 188)) | (1L << (INSENSITIVE - 188)) | (1L << (INSERTED - 188)) | (1L << (ISOLATION - 188)) | (1L << (KEEPFIXED - 188)) | (1L << (KEYSET - 188)) | (1L << (LAST - 188)) | (1L << (LEVEL - 188)) | (1L << (LOCAL - 188)) | (1L << (LOCK_ESCALATION - 188)) | (1L << (LOGIN - 188)) | (1L << (LOOP - 188)) | (1L << (MARK - 188)) | (1L << (MAX - 188)) | (1L << (MIN - 188)) | (1L << (MODIFY - 188)) | (1L << (NEXT - 188)) | (1L << (NAME - 188)) | (1L << (NOCOUNT - 188)) | (1L << (NOEXPAND - 188)) | (1L << (NORECOMPUTE - 188)) | (1L << (NTILE - 188)) | (1L << (NUMBER - 188)) | (1L << (OFFSET - 188)) | (1L << (ONLY - 188)) | (1L << (OPTIMISTIC - 188)) | (1L << (OPTIMIZE - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (OUT - 252)) | (1L << (OUTPUT - 252)) | (1L << (OWNER - 252)) | (1L << (PARTITION - 252)) | (1L << (PATH - 252)) | (1L << (PRECEDING - 252)) | (1L << (PRIOR - 252)) | (1L << (RANGE - 252)) | (1L << (RANK - 252)) | (1L << (READONLY - 252)) | (1L << (READ_ONLY - 252)) | (1L << (RECOMPILE - 252)) | (1L << (RELATIVE - 252)) | (1L << (REMOTE - 252)) | (1L << (REPEATABLE - 252)) | (1L << (ROOT - 252)) | (1L << (ROW - 252)) | (1L << (ROWGUID - 252)) | (1L << (ROWS - 252)) | (1L << (ROW_NUMBER - 252)) | (1L << (SAMPLE - 252)) | (1L << (SCHEMABINDING - 252)) | (1L << (SCROLL - 252)) | (1L << (SCROLL_LOCKS - 252)) | (1L << (SELF - 252)) | (1L << (SERIALIZABLE - 252)) | (1L << (SNAPSHOT - 252)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 252)) | (1L << (STATIC - 252)) | (1L << (STATS_STREAM - 252)) | (1L << (STDEV - 252)) | (1L << (STDEVP - 252)) | (1L << (SUM - 252)) | (1L << (THROW - 252)) | (1L << (TIES - 252)) | (1L << (TIME - 252)) | (1L << (TRY - 252)) | (1L << (TYPE - 252)) | (1L << (TYPE_WARNING - 252)) | (1L << (UNBOUNDED - 252)) | (1L << (UNCOMMITTED - 252)) | (1L << (UNKNOWN - 252)) | (1L << (USING - 252)) | (1L << (VAR - 252)) | (1L << (VARP - 252)) | (1L << (VIEW_METADATA - 252)) | (1L << (WORK - 252)) | (1L << (XML - 252)) | (1L << (XMLNAMESPACES - 252)) | (1L << (DOUBLE_QUOTE_ID - 252)) | (1L << (SQUARE_BRACKET_ID - 252)) | (1L << (ID - 252)))) != 0)) {
				{
				setState(1011);
				((OpendatasourceContext)_localctx).database = id();
				}
			}

			setState(1014);
			match(DOT);
			setState(1016);
			_la = _input.LA(1);
			if (_la==FORCESEEK || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ABSOLUTE - 188)) | (1L << (APPLY - 188)) | (1L << (AUTO - 188)) | (1L << (AVG - 188)) | (1L << (BASE64 - 188)) | (1L << (CALLER - 188)) | (1L << (CAST - 188)) | (1L << (CATCH - 188)) | (1L << (CHECKSUM_AGG - 188)) | (1L << (COMMITTED - 188)) | (1L << (CONCAT - 188)) | (1L << (COOKIE - 188)) | (1L << (COUNT - 188)) | (1L << (COUNT_BIG - 188)) | (1L << (DELAY - 188)) | (1L << (DELETED - 188)) | (1L << (DENSE_RANK - 188)) | (1L << (DISABLE - 188)) | (1L << (DYNAMIC - 188)) | (1L << (ENCRYPTION - 188)) | (1L << (FAST - 188)) | (1L << (FAST_FORWARD - 188)) | (1L << (FIRST - 188)) | (1L << (FOLLOWING - 188)) | (1L << (FORWARD_ONLY - 188)) | (1L << (FULLSCAN - 188)) | (1L << (GLOBAL - 188)) | (1L << (GO - 188)) | (1L << (GROUPING - 188)) | (1L << (GROUPING_ID - 188)) | (1L << (HASH - 188)) | (1L << (INSENSITIVE - 188)) | (1L << (INSERTED - 188)) | (1L << (ISOLATION - 188)) | (1L << (KEEPFIXED - 188)) | (1L << (KEYSET - 188)) | (1L << (LAST - 188)) | (1L << (LEVEL - 188)) | (1L << (LOCAL - 188)) | (1L << (LOCK_ESCALATION - 188)) | (1L << (LOGIN - 188)) | (1L << (LOOP - 188)) | (1L << (MARK - 188)) | (1L << (MAX - 188)) | (1L << (MIN - 188)) | (1L << (MODIFY - 188)) | (1L << (NEXT - 188)) | (1L << (NAME - 188)) | (1L << (NOCOUNT - 188)) | (1L << (NOEXPAND - 188)) | (1L << (NORECOMPUTE - 188)) | (1L << (NTILE - 188)) | (1L << (NUMBER - 188)) | (1L << (OFFSET - 188)) | (1L << (ONLY - 188)) | (1L << (OPTIMISTIC - 188)) | (1L << (OPTIMIZE - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (OUT - 252)) | (1L << (OUTPUT - 252)) | (1L << (OWNER - 252)) | (1L << (PARTITION - 252)) | (1L << (PATH - 252)) | (1L << (PRECEDING - 252)) | (1L << (PRIOR - 252)) | (1L << (RANGE - 252)) | (1L << (RANK - 252)) | (1L << (READONLY - 252)) | (1L << (READ_ONLY - 252)) | (1L << (RECOMPILE - 252)) | (1L << (RELATIVE - 252)) | (1L << (REMOTE - 252)) | (1L << (REPEATABLE - 252)) | (1L << (ROOT - 252)) | (1L << (ROW - 252)) | (1L << (ROWGUID - 252)) | (1L << (ROWS - 252)) | (1L << (ROW_NUMBER - 252)) | (1L << (SAMPLE - 252)) | (1L << (SCHEMABINDING - 252)) | (1L << (SCROLL - 252)) | (1L << (SCROLL_LOCKS - 252)) | (1L << (SELF - 252)) | (1L << (SERIALIZABLE - 252)) | (1L << (SNAPSHOT - 252)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 252)) | (1L << (STATIC - 252)) | (1L << (STATS_STREAM - 252)) | (1L << (STDEV - 252)) | (1L << (STDEVP - 252)) | (1L << (SUM - 252)) | (1L << (THROW - 252)) | (1L << (TIES - 252)) | (1L << (TIME - 252)) | (1L << (TRY - 252)) | (1L << (TYPE - 252)) | (1L << (TYPE_WARNING - 252)) | (1L << (UNBOUNDED - 252)) | (1L << (UNCOMMITTED - 252)) | (1L << (UNKNOWN - 252)) | (1L << (USING - 252)) | (1L << (VAR - 252)) | (1L << (VARP - 252)) | (1L << (VIEW_METADATA - 252)) | (1L << (WORK - 252)) | (1L << (XML - 252)) | (1L << (XMLNAMESPACES - 252)) | (1L << (DOUBLE_QUOTE_ID - 252)) | (1L << (SQUARE_BRACKET_ID - 252)) | (1L << (ID - 252)))) != 0)) {
				{
				setState(1015);
				((OpendatasourceContext)_localctx).scheme = id();
				}
			}

			setState(1018);
			match(DOT);
			{
			setState(1019);
			((OpendatasourceContext)_localctx).table = id();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_statementContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(tsqlParser.DECLARE, 0); }
		public List<Declare_localContext> declare_local() {
			return getRuleContexts(Declare_localContext.class);
		}
		public Declare_localContext declare_local(int i) {
			return getRuleContext(Declare_localContext.class,i);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Table_type_definitionContext table_type_definition() {
			return getRuleContext(Table_type_definitionContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDeclare_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDeclare_statement(this);
		}
	}

	public final Declare_statementContext declare_statement() throws RecognitionException {
		Declare_statementContext _localctx = new Declare_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declare_statement);
		int _la;
		try {
			setState(1042);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				match(DECLARE);
				setState(1022);
				declare_local();
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1023);
					match(COMMA);
					setState(1024);
					declare_local();
					}
					}
					setState(1029);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1031);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1030);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				match(DECLARE);
				setState(1034);
				match(LOCAL_ID);
				setState(1036);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1035);
					match(AS);
					}
				}

				setState(1038);
				table_type_definition();
				setState(1040);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1039);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_statementContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(tsqlParser.CLOSE, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode DEALLOCATE() { return getToken(tsqlParser.DEALLOCATE, 0); }
		public Declare_cursorContext declare_cursor() {
			return getRuleContext(Declare_cursorContext.class,0);
		}
		public Fetch_cursorContext fetch_cursor() {
			return getRuleContext(Fetch_cursorContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(tsqlParser.OPEN, 0); }
		public Cursor_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCursor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCursor_statement(this);
		}
	}

	public final Cursor_statementContext cursor_statement() throws RecognitionException {
		Cursor_statementContext _localctx = new Cursor_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cursor_statement);
		try {
			setState(1070);
			switch (_input.LA(1)) {
			case CLOSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				match(CLOSE);
				setState(1046);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1045);
					match(GLOBAL);
					}
					break;
				}
				setState(1048);
				cursor_name();
				setState(1050);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1049);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				match(DEALLOCATE);
				setState(1054);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1053);
					match(GLOBAL);
					}
					break;
				}
				setState(1056);
				cursor_name();
				setState(1058);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1057);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case DECLARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060);
				declare_cursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1061);
				fetch_cursor();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1062);
				match(OPEN);
				setState(1064);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1063);
					match(GLOBAL);
					}
					break;
				}
				setState(1066);
				cursor_name();
				setState(1068);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1067);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_statementContext extends ParserRuleContext {
		public Token return_status;
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode EXEC() { return getToken(tsqlParser.EXEC, 0); }
		public TerminalNode EXECUTE() { return getToken(tsqlParser.EXECUTE, 0); }
		public List<Execute_statement_argContext> execute_statement_arg() {
			return getRuleContexts(Execute_statement_argContext.class);
		}
		public Execute_statement_argContext execute_statement_arg(int i) {
			return getRuleContext(Execute_statement_argContext.class,i);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public List<Execute_var_stringContext> execute_var_string() {
			return getRuleContexts(Execute_var_stringContext.class);
		}
		public Execute_var_stringContext execute_var_string(int i) {
			return getRuleContext(Execute_var_stringContext.class,i);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode LOGIN() { return getToken(tsqlParser.LOGIN, 0); }
		public TerminalNode USER() { return getToken(tsqlParser.USER, 0); }
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Execute_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExecute_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExecute_statement(this);
		}
	}

	public final Execute_statementContext execute_statement() throws RecognitionException {
		Execute_statementContext _localctx = new Execute_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_execute_statement);
		int _la;
		try {
			setState(1113);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				_la = _input.LA(1);
				if ( !(_la==EXEC || _la==EXECUTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1075);
				_la = _input.LA(1);
				if (_la==LOCAL_ID) {
					{
					setState(1073);
					((Execute_statementContext)_localctx).return_status = match(LOCAL_ID);
					setState(1074);
					match(EQUAL);
					}
				}

				setState(1077);
				func_proc_name();
				setState(1086);
				_la = _input.LA(1);
				if (_la==DEFAULT || _la==NULL || ((((_la - 307)) & ~0x3f) == 0 && ((1L << (_la - 307)) & ((1L << (LOCAL_ID - 307)) | (1L << (DECIMAL - 307)) | (1L << (STRING - 307)) | (1L << (BINARY - 307)) | (1L << (FLOAT - 307)) | (1L << (REAL - 307)) | (1L << (DOLLAR - 307)) | (1L << (PLUS - 307)) | (1L << (MINUS - 307)))) != 0)) {
					{
					setState(1078);
					execute_statement_arg();
					setState(1083);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1079);
						match(COMMA);
						setState(1080);
						execute_statement_arg();
						}
						}
						setState(1085);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1089);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1088);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				_la = _input.LA(1);
				if ( !(_la==EXEC || _la==EXECUTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1092);
				match(LR_BRACKET);
				setState(1093);
				execute_var_string();
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(1094);
					match(PLUS);
					setState(1095);
					execute_var_string();
					}
					}
					setState(1100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1101);
				match(RR_BRACKET);
				setState(1108);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1103);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1102);
						match(AS);
						}
					}

					setState(1105);
					_la = _input.LA(1);
					if ( !(_la==USER || _la==LOGIN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1106);
					match(EQUAL);
					setState(1107);
					match(STRING);
					}
					break;
				}
				setState(1111);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1110);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_statement_argContext extends ParserRuleContext {
		public Token parameter;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public TerminalNode OUT() { return getToken(tsqlParser.OUT, 0); }
		public Execute_statement_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_statement_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExecute_statement_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExecute_statement_arg(this);
		}
	}

	public final Execute_statement_argContext execute_statement_arg() throws RecognitionException {
		Execute_statement_argContext _localctx = new Execute_statement_argContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_execute_statement_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1115);
				((Execute_statement_argContext)_localctx).parameter = match(LOCAL_ID);
				setState(1116);
				match(EQUAL);
				}
				break;
			}
			setState(1126);
			switch (_input.LA(1)) {
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				{
				setState(1119);
				constant();
				}
				break;
			case LOCAL_ID:
				{
				setState(1120);
				match(LOCAL_ID);
				setState(1122);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1121);
					_la = _input.LA(1);
					if ( !(_la==OUT || _la==OUTPUT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				break;
			case DEFAULT:
				{
				setState(1124);
				match(DEFAULT);
				}
				break;
			case NULL:
				{
				setState(1125);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_var_stringContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Execute_var_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_var_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExecute_var_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExecute_var_string(this);
		}
	}

	public final Execute_var_stringContext execute_var_string() throws RecognitionException {
		Execute_var_stringContext _localctx = new Execute_var_stringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_execute_var_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_la = _input.LA(1);
			if ( !(_la==LOCAL_ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Security_statementContext extends ParserRuleContext {
		public Execute_clauseContext execute_clause() {
			return getRuleContext(Execute_clauseContext.class,0);
		}
		public TerminalNode REVERT() { return getToken(tsqlParser.REVERT, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode COOKIE() { return getToken(tsqlParser.COOKIE, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Security_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_security_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSecurity_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSecurity_statement(this);
		}
	}

	public final Security_statementContext security_statement() throws RecognitionException {
		Security_statementContext _localctx = new Security_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_security_statement);
		try {
			setState(1146);
			switch (_input.LA(1)) {
			case EXEC:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				execute_clause();
				setState(1132);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1131);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case REVERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1134);
				match(REVERT);
				setState(1141);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1135);
					match(LR_BRACKET);
					setState(1136);
					match(WITH);
					setState(1137);
					match(COOKIE);
					setState(1138);
					match(EQUAL);
					setState(1139);
					match(LOCAL_ID);
					setState(1140);
					match(RR_BRACKET);
					}
					break;
				}
				setState(1144);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1143);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_statmentContext extends ParserRuleContext {
		public IdContext member_name;
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(tsqlParser.CURSOR, 0); }
		public Declare_set_cursor_commonContext declare_set_cursor_common() {
			return getRuleContext(Declare_set_cursor_commonContext.class,0);
		}
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode READ() { return getToken(tsqlParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode UPDATE() { return getToken(tsqlParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Set_specialContext set_special() {
			return getRuleContext(Set_specialContext.class,0);
		}
		public Set_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSet_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSet_statment(this);
		}
	}

	public final Set_statmentContext set_statment() throws RecognitionException {
		Set_statmentContext _localctx = new Set_statmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_set_statment);
		int _la;
		try {
			setState(1187);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				match(SET);
				setState(1149);
				match(LOCAL_ID);
				setState(1152);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1150);
					match(DOT);
					setState(1151);
					((Set_statmentContext)_localctx).member_name = id();
					}
				}

				setState(1154);
				match(EQUAL);
				setState(1155);
				expression(0);
				setState(1157);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1156);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1159);
				match(SET);
				setState(1160);
				match(LOCAL_ID);
				setState(1161);
				assignment_operator();
				setState(1162);
				expression(0);
				setState(1164);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1163);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1166);
				match(SET);
				setState(1167);
				match(LOCAL_ID);
				setState(1168);
				match(EQUAL);
				setState(1169);
				match(CURSOR);
				setState(1170);
				declare_set_cursor_common();
				setState(1181);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1171);
					match(FOR);
					setState(1179);
					switch (_input.LA(1)) {
					case READ:
						{
						setState(1172);
						match(READ);
						setState(1173);
						match(ONLY);
						}
						break;
					case UPDATE:
						{
						setState(1174);
						match(UPDATE);
						setState(1177);
						_la = _input.LA(1);
						if (_la==OF) {
							{
							setState(1175);
							match(OF);
							setState(1176);
							column_name_list();
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1184);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1183);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1186);
				set_special();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_statementContext extends ParserRuleContext {
		public Token DELAYED_DURABILITY;
		public TerminalNode BEGIN() { return getToken(tsqlParser.BEGIN, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(tsqlParser.DISTRIBUTED, 0); }
		public TerminalNode TRAN() { return getToken(tsqlParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(tsqlParser.TRANSACTION, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode MARK() { return getToken(tsqlParser.MARK, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode COMMIT() { return getToken(tsqlParser.COMMIT, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode WORK() { return getToken(tsqlParser.WORK, 0); }
		public TerminalNode ROLLBACK() { return getToken(tsqlParser.ROLLBACK, 0); }
		public TerminalNode SAVE() { return getToken(tsqlParser.SAVE, 0); }
		public Transaction_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTransaction_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTransaction_statement(this);
		}
	}

	public final Transaction_statementContext transaction_statement() throws RecognitionException {
		Transaction_statementContext _localctx = new Transaction_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_transaction_statement);
		int _la;
		try {
			setState(1264);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				match(BEGIN);
				setState(1190);
				match(DISTRIBUTED);
				setState(1191);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1194);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1192);
					id();
					}
					break;
				case 2:
					{
					setState(1193);
					match(LOCAL_ID);
					}
					break;
				}
				setState(1197);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1196);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				match(BEGIN);
				setState(1200);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1210);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1203);
					switch (_input.LA(1)) {
					case FORCESEEK:
					case ABSOLUTE:
					case APPLY:
					case AUTO:
					case AVG:
					case BASE64:
					case CALLER:
					case CAST:
					case CATCH:
					case CHECKSUM_AGG:
					case COMMITTED:
					case CONCAT:
					case COOKIE:
					case COUNT:
					case COUNT_BIG:
					case DELAY:
					case DELETED:
					case DENSE_RANK:
					case DISABLE:
					case DYNAMIC:
					case ENCRYPTION:
					case FAST:
					case FAST_FORWARD:
					case FIRST:
					case FOLLOWING:
					case FORWARD_ONLY:
					case FULLSCAN:
					case GLOBAL:
					case GO:
					case GROUPING:
					case GROUPING_ID:
					case HASH:
					case INSENSITIVE:
					case INSERTED:
					case ISOLATION:
					case KEEPFIXED:
					case KEYSET:
					case LAST:
					case LEVEL:
					case LOCAL:
					case LOCK_ESCALATION:
					case LOGIN:
					case LOOP:
					case MARK:
					case MAX:
					case MIN:
					case MODIFY:
					case NEXT:
					case NAME:
					case NOCOUNT:
					case NOEXPAND:
					case NORECOMPUTE:
					case NTILE:
					case NUMBER:
					case OFFSET:
					case ONLY:
					case OPTIMISTIC:
					case OPTIMIZE:
					case OUT:
					case OUTPUT:
					case OWNER:
					case PARTITION:
					case PATH:
					case PRECEDING:
					case PRIOR:
					case RANGE:
					case RANK:
					case READONLY:
					case READ_ONLY:
					case RECOMPILE:
					case RELATIVE:
					case REMOTE:
					case REPEATABLE:
					case ROOT:
					case ROW:
					case ROWGUID:
					case ROWS:
					case ROW_NUMBER:
					case SAMPLE:
					case SCHEMABINDING:
					case SCROLL:
					case SCROLL_LOCKS:
					case SELF:
					case SERIALIZABLE:
					case SNAPSHOT:
					case SPATIAL_WINDOW_MAX_CELLS:
					case STATIC:
					case STATS_STREAM:
					case STDEV:
					case STDEVP:
					case SUM:
					case THROW:
					case TIES:
					case TIME:
					case TRY:
					case TYPE:
					case TYPE_WARNING:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNKNOWN:
					case USING:
					case VAR:
					case VARP:
					case VIEW_METADATA:
					case WORK:
					case XML:
					case XMLNAMESPACES:
					case DOUBLE_QUOTE_ID:
					case SQUARE_BRACKET_ID:
					case ID:
						{
						setState(1201);
						id();
						}
						break;
					case LOCAL_ID:
						{
						setState(1202);
						match(LOCAL_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1208);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						setState(1205);
						match(WITH);
						setState(1206);
						match(MARK);
						setState(1207);
						match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1213);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1212);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1215);
				match(COMMIT);
				setState(1216);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1227);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1219);
					switch (_input.LA(1)) {
					case FORCESEEK:
					case ABSOLUTE:
					case APPLY:
					case AUTO:
					case AVG:
					case BASE64:
					case CALLER:
					case CAST:
					case CATCH:
					case CHECKSUM_AGG:
					case COMMITTED:
					case CONCAT:
					case COOKIE:
					case COUNT:
					case COUNT_BIG:
					case DELAY:
					case DELETED:
					case DENSE_RANK:
					case DISABLE:
					case DYNAMIC:
					case ENCRYPTION:
					case FAST:
					case FAST_FORWARD:
					case FIRST:
					case FOLLOWING:
					case FORWARD_ONLY:
					case FULLSCAN:
					case GLOBAL:
					case GO:
					case GROUPING:
					case GROUPING_ID:
					case HASH:
					case INSENSITIVE:
					case INSERTED:
					case ISOLATION:
					case KEEPFIXED:
					case KEYSET:
					case LAST:
					case LEVEL:
					case LOCAL:
					case LOCK_ESCALATION:
					case LOGIN:
					case LOOP:
					case MARK:
					case MAX:
					case MIN:
					case MODIFY:
					case NEXT:
					case NAME:
					case NOCOUNT:
					case NOEXPAND:
					case NORECOMPUTE:
					case NTILE:
					case NUMBER:
					case OFFSET:
					case ONLY:
					case OPTIMISTIC:
					case OPTIMIZE:
					case OUT:
					case OUTPUT:
					case OWNER:
					case PARTITION:
					case PATH:
					case PRECEDING:
					case PRIOR:
					case RANGE:
					case RANK:
					case READONLY:
					case READ_ONLY:
					case RECOMPILE:
					case RELATIVE:
					case REMOTE:
					case REPEATABLE:
					case ROOT:
					case ROW:
					case ROWGUID:
					case ROWS:
					case ROW_NUMBER:
					case SAMPLE:
					case SCHEMABINDING:
					case SCROLL:
					case SCROLL_LOCKS:
					case SELF:
					case SERIALIZABLE:
					case SNAPSHOT:
					case SPATIAL_WINDOW_MAX_CELLS:
					case STATIC:
					case STATS_STREAM:
					case STDEV:
					case STDEVP:
					case SUM:
					case THROW:
					case TIES:
					case TIME:
					case TRY:
					case TYPE:
					case TYPE_WARNING:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNKNOWN:
					case USING:
					case VAR:
					case VARP:
					case VIEW_METADATA:
					case WORK:
					case XML:
					case XMLNAMESPACES:
					case DOUBLE_QUOTE_ID:
					case SQUARE_BRACKET_ID:
					case ID:
						{
						setState(1217);
						id();
						}
						break;
					case LOCAL_ID:
						{
						setState(1218);
						match(LOCAL_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1225);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						setState(1221);
						match(WITH);
						setState(1222);
						match(LR_BRACKET);
						setState(1223);
						((Transaction_statementContext)_localctx).DELAYED_DURABILITY = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OFF || _la==ON) ) {
							((Transaction_statementContext)_localctx).DELAYED_DURABILITY = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1224);
						match(RR_BRACKET);
						}
						break;
					}
					}
					break;
				}
				setState(1230);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1229);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1232);
				match(COMMIT);
				setState(1234);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1233);
					match(WORK);
					}
					break;
				}
				setState(1237);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1236);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1239);
				match(ROLLBACK);
				setState(1240);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1243);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1241);
					id();
					}
					break;
				case 2:
					{
					setState(1242);
					match(LOCAL_ID);
					}
					break;
				}
				setState(1246);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1245);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1248);
				match(ROLLBACK);
				setState(1250);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1249);
					match(WORK);
					}
					break;
				}
				setState(1253);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1252);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1255);
				match(SAVE);
				setState(1256);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1259);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1257);
					id();
					}
					break;
				case 2:
					{
					setState(1258);
					match(LOCAL_ID);
					}
					break;
				}
				setState(1262);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1261);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Go_statementContext extends ParserRuleContext {
		public Token count;
		public TerminalNode GO() { return getToken(tsqlParser.GO, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Go_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_go_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterGo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitGo_statement(this);
		}
	}

	public final Go_statementContext go_statement() throws RecognitionException {
		Go_statementContext _localctx = new Go_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_go_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(GO);
			setState(1268);
			_la = _input.LA(1);
			if (_la==DECIMAL) {
				{
				setState(1267);
				((Go_statementContext)_localctx).count = match(DECIMAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_statementContext extends ParserRuleContext {
		public IdContext database;
		public TerminalNode USE() { return getToken(tsqlParser.USE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Use_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUse_statement(this);
		}
	}

	public final Use_statementContext use_statement() throws RecognitionException {
		Use_statementContext _localctx = new Use_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_use_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(USE);
			setState(1271);
			((Use_statementContext)_localctx).database = id();
			setState(1273);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1272);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_clauseContext extends ParserRuleContext {
		public Token clause;
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode EXEC() { return getToken(tsqlParser.EXEC, 0); }
		public TerminalNode EXECUTE() { return getToken(tsqlParser.EXECUTE, 0); }
		public TerminalNode CALLER() { return getToken(tsqlParser.CALLER, 0); }
		public TerminalNode SELF() { return getToken(tsqlParser.SELF, 0); }
		public TerminalNode OWNER() { return getToken(tsqlParser.OWNER, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Execute_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExecute_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExecute_clause(this);
		}
	}

	public final Execute_clauseContext execute_clause() throws RecognitionException {
		Execute_clauseContext _localctx = new Execute_clauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_execute_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			_la = _input.LA(1);
			if ( !(_la==EXEC || _la==EXECUTE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1276);
			match(AS);
			setState(1277);
			((Execute_clauseContext)_localctx).clause = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CALLER || _la==OWNER || _la==SELF || _la==STRING) ) {
				((Execute_clauseContext)_localctx).clause = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_localContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declare_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDeclare_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDeclare_local(this);
		}
	}

	public final Declare_localContext declare_local() throws RecognitionException {
		Declare_localContext _localctx = new Declare_localContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_declare_local);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(LOCAL_ID);
			setState(1281);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1280);
				match(AS);
				}
			}

			setState(1283);
			data_type();
			setState(1286);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1284);
				match(EQUAL);
				setState(1285);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_type_definitionContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public Table_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_type_definition(this);
		}
	}

	public final Table_type_definitionContext table_type_definition() throws RecognitionException {
		Table_type_definitionContext _localctx = new Table_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_table_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(TABLE);
			setState(1289);
			match(LR_BRACKET);
			setState(1290);
			column_def_table_constraint();
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHECK || _la==CONSTRAINT || _la==FORCESEEK || _la==PRIMARY || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (UNIQUE - 172)) | (1L << (ABSOLUTE - 172)) | (1L << (APPLY - 172)) | (1L << (AUTO - 172)) | (1L << (AVG - 172)) | (1L << (BASE64 - 172)) | (1L << (CALLER - 172)) | (1L << (CAST - 172)) | (1L << (CATCH - 172)) | (1L << (CHECKSUM_AGG - 172)) | (1L << (COMMITTED - 172)) | (1L << (CONCAT - 172)) | (1L << (COOKIE - 172)) | (1L << (COUNT - 172)) | (1L << (COUNT_BIG - 172)) | (1L << (DELAY - 172)) | (1L << (DELETED - 172)) | (1L << (DENSE_RANK - 172)) | (1L << (DISABLE - 172)) | (1L << (DYNAMIC - 172)) | (1L << (ENCRYPTION - 172)) | (1L << (FAST - 172)) | (1L << (FAST_FORWARD - 172)) | (1L << (FIRST - 172)) | (1L << (FOLLOWING - 172)) | (1L << (FORWARD_ONLY - 172)) | (1L << (FULLSCAN - 172)) | (1L << (GLOBAL - 172)) | (1L << (GO - 172)) | (1L << (GROUPING - 172)) | (1L << (GROUPING_ID - 172)) | (1L << (HASH - 172)) | (1L << (INSENSITIVE - 172)) | (1L << (INSERTED - 172)) | (1L << (ISOLATION - 172)) | (1L << (KEEPFIXED - 172)) | (1L << (KEYSET - 172)) | (1L << (LAST - 172)) | (1L << (LEVEL - 172)) | (1L << (LOCAL - 172)) | (1L << (LOCK_ESCALATION - 172)) | (1L << (LOGIN - 172)) | (1L << (LOOP - 172)))) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (MARK - 236)) | (1L << (MAX - 236)) | (1L << (MIN - 236)) | (1L << (MODIFY - 236)) | (1L << (NEXT - 236)) | (1L << (NAME - 236)) | (1L << (NOCOUNT - 236)) | (1L << (NOEXPAND - 236)) | (1L << (NORECOMPUTE - 236)) | (1L << (NTILE - 236)) | (1L << (NUMBER - 236)) | (1L << (OFFSET - 236)) | (1L << (ONLY - 236)) | (1L << (OPTIMISTIC - 236)) | (1L << (OPTIMIZE - 236)) | (1L << (OUT - 236)) | (1L << (OUTPUT - 236)) | (1L << (OWNER - 236)) | (1L << (PARTITION - 236)) | (1L << (PATH - 236)) | (1L << (PRECEDING - 236)) | (1L << (PRIOR - 236)) | (1L << (RANGE - 236)) | (1L << (RANK - 236)) | (1L << (READONLY - 236)) | (1L << (READ_ONLY - 236)) | (1L << (RECOMPILE - 236)) | (1L << (RELATIVE - 236)) | (1L << (REMOTE - 236)) | (1L << (REPEATABLE - 236)) | (1L << (ROOT - 236)) | (1L << (ROW - 236)) | (1L << (ROWGUID - 236)) | (1L << (ROWS - 236)) | (1L << (ROW_NUMBER - 236)) | (1L << (SAMPLE - 236)) | (1L << (SCHEMABINDING - 236)) | (1L << (SCROLL - 236)) | (1L << (SCROLL_LOCKS - 236)) | (1L << (SELF - 236)) | (1L << (SERIALIZABLE - 236)) | (1L << (SNAPSHOT - 236)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 236)) | (1L << (STATIC - 236)) | (1L << (STATS_STREAM - 236)) | (1L << (STDEV - 236)) | (1L << (STDEVP - 236)) | (1L << (SUM - 236)) | (1L << (THROW - 236)) | (1L << (TIES - 236)) | (1L << (TIME - 236)) | (1L << (TRY - 236)) | (1L << (TYPE - 236)) | (1L << (TYPE_WARNING - 236)) | (1L << (UNBOUNDED - 236)) | (1L << (UNCOMMITTED - 236)) | (1L << (UNKNOWN - 236)) | (1L << (USING - 236)) | (1L << (VAR - 236)) | (1L << (VARP - 236)) | (1L << (VIEW_METADATA - 236)) | (1L << (WORK - 236)) | (1L << (XML - 236)))) != 0) || ((((_la - 300)) & ~0x3f) == 0 && ((1L << (_la - 300)) & ((1L << (XMLNAMESPACES - 300)) | (1L << (DOUBLE_QUOTE_ID - 300)) | (1L << (SQUARE_BRACKET_ID - 300)) | (1L << (ID - 300)) | (1L << (COMMA - 300)))) != 0)) {
				{
				{
				setState(1292);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1291);
					match(COMMA);
					}
				}

				setState(1294);
				column_def_table_constraint();
				}
				}
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1300);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_def_table_constraintContext extends ParserRuleContext {
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Column_def_table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_def_table_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_def_table_constraint(this);
		}
	}

	public final Column_def_table_constraintContext column_def_table_constraint() throws RecognitionException {
		Column_def_table_constraintContext _localctx = new Column_def_table_constraintContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_column_def_table_constraint);
		try {
			setState(1304);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302);
				column_definition();
				}
				break;
			case CHECK:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				table_constraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public IdContext constraint;
		public Token seed;
		public Token increment;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(tsqlParser.COLLATE, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(tsqlParser.ROWGUIDCOL, 0); }
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(tsqlParser.CONSTRAINT, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode VALUES() { return getToken(tsqlParser.VALUES, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_definition(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_column_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			column_name();
			setState(1310);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(1307);
				data_type();
				}
				break;
			case AS:
				{
				setState(1308);
				match(AS);
				setState(1309);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1314);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1312);
				match(COLLATE);
				setState(1313);
				id();
				}
			}

			setState(1317);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1316);
				null_notnull();
				}
				break;
			}
			setState(1342);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1321);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1319);
					match(CONSTRAINT);
					setState(1320);
					((Column_definitionContext)_localctx).constraint = id();
					}
				}

				setState(1323);
				match(DEFAULT);
				setState(1324);
				constant_expression();
				setState(1327);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1325);
					match(WITH);
					setState(1326);
					match(VALUES);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1329);
				match(IDENTITY);
				setState(1335);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1330);
					match(LR_BRACKET);
					setState(1331);
					((Column_definitionContext)_localctx).seed = match(DECIMAL);
					setState(1332);
					match(COMMA);
					setState(1333);
					((Column_definitionContext)_localctx).increment = match(DECIMAL);
					setState(1334);
					match(RR_BRACKET);
					}
					break;
				}
				setState(1340);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1337);
					match(NOT);
					setState(1338);
					match(FOR);
					setState(1339);
					match(REPLICATION);
					}
					break;
				}
				}
				break;
			}
			setState(1345);
			_la = _input.LA(1);
			if (_la==ROWGUIDCOL) {
				{
				setState(1344);
				match(ROWGUIDCOL);
				}
			}

			setState(1350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1347);
					column_constraint();
					}
					} 
				}
				setState(1352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(tsqlParser.CHECK, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(tsqlParser.CONSTRAINT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode PRIMARY() { return getToken(tsqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(tsqlParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(tsqlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_constraint(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1353);
				match(CONSTRAINT);
				setState(1354);
				id();
				}
			}

			setState(1358);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(1357);
				null_notnull();
				}
			}

			setState(1381);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
				{
				setState(1363);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					setState(1360);
					match(PRIMARY);
					setState(1361);
					match(KEY);
					}
					break;
				case UNIQUE:
					{
					setState(1362);
					match(UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1366);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1365);
					clustered();
					}
				}

				setState(1369);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1368);
					index_options();
					}
					break;
				}
				}
				break;
			case CHECK:
				{
				setState(1371);
				match(CHECK);
				setState(1375);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1372);
					match(NOT);
					setState(1373);
					match(FOR);
					setState(1374);
					match(REPLICATION);
					}
				}

				setState(1377);
				match(LR_BRACKET);
				setState(1378);
				search_condition();
				setState(1379);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(tsqlParser.CHECK, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(tsqlParser.CONSTRAINT, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode PRIMARY() { return getToken(tsqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(tsqlParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(tsqlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_constraint(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1383);
				match(CONSTRAINT);
				setState(1384);
				id();
				}
			}

			setState(1415);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
				{
				setState(1390);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					setState(1387);
					match(PRIMARY);
					setState(1388);
					match(KEY);
					}
					break;
				case UNIQUE:
					{
					setState(1389);
					match(UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1393);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1392);
					clustered();
					}
				}

				setState(1395);
				match(LR_BRACKET);
				setState(1396);
				column_name_list();
				setState(1397);
				match(RR_BRACKET);
				setState(1399);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1398);
					index_options();
					}
					break;
				}
				setState(1403);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1401);
					match(ON);
					setState(1402);
					id();
					}
				}

				}
				break;
			case CHECK:
				{
				setState(1405);
				match(CHECK);
				setState(1409);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1406);
					match(NOT);
					setState(1407);
					match(FOR);
					setState(1408);
					match(REPLICATION);
					}
				}

				setState(1411);
				match(LR_BRACKET);
				setState(1412);
				search_condition();
				setState(1413);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterIndex_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitIndex_options(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(WITH);
			setState(1418);
			match(LR_BRACKET);
			setState(1419);
			index_option();
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1420);
				match(COMMA);
				setState(1421);
				index_option();
				}
				}
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1427);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionContext extends ParserRuleContext {
		public List<Simple_idContext> simple_id() {
			return getRuleContexts(Simple_idContext.class);
		}
		public Simple_idContext simple_id(int i) {
			return getRuleContext(Simple_idContext.class,i);
		}
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Index_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterIndex_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitIndex_option(this);
		}
	}

	public final Index_optionContext index_option() throws RecognitionException {
		Index_optionContext _localctx = new Index_optionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_index_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			simple_id();
			setState(1430);
			match(EQUAL);
			setState(1434);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ID:
				{
				setState(1431);
				simple_id();
				}
				break;
			case OFF:
			case ON:
				{
				setState(1432);
				on_off();
				}
				break;
			case DECIMAL:
				{
				setState(1433);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_cursorContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(tsqlParser.DECLARE, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(tsqlParser.CURSOR, 0); }
		public List<TerminalNode> FOR() { return getTokens(tsqlParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(tsqlParser.FOR, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode INSENSITIVE() { return getToken(tsqlParser.INSENSITIVE, 0); }
		public TerminalNode SCROLL() { return getToken(tsqlParser.SCROLL, 0); }
		public TerminalNode READ() { return getToken(tsqlParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode UPDATE() { return getToken(tsqlParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Declare_set_cursor_commonContext declare_set_cursor_common() {
			return getRuleContext(Declare_set_cursor_commonContext.class,0);
		}
		public Declare_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDeclare_cursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDeclare_cursor(this);
		}
	}

	public final Declare_cursorContext declare_cursor() throws RecognitionException {
		Declare_cursorContext _localctx = new Declare_cursorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declare_cursor);
		int _la;
		try {
			setState(1481);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1436);
				match(DECLARE);
				setState(1437);
				cursor_name();
				setState(1438);
				match(CURSOR);
				setState(1440);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1439);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				match(DECLARE);
				setState(1443);
				cursor_name();
				setState(1445);
				_la = _input.LA(1);
				if (_la==INSENSITIVE) {
					{
					setState(1444);
					match(INSENSITIVE);
					}
				}

				setState(1448);
				_la = _input.LA(1);
				if (_la==SCROLL) {
					{
					setState(1447);
					match(SCROLL);
					}
				}

				setState(1450);
				match(CURSOR);
				setState(1451);
				match(FOR);
				setState(1452);
				select_statement();
				setState(1461);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1453);
					match(FOR);
					setState(1459);
					switch (_input.LA(1)) {
					case READ:
						{
						setState(1454);
						match(READ);
						setState(1455);
						match(ONLY);
						}
						break;
					case UPDATE:
						{
						setState(1456);
						match(UPDATE);
						}
						break;
					case OF:
						{
						{
						setState(1457);
						match(OF);
						setState(1458);
						column_name_list();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1464);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1463);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1466);
				match(DECLARE);
				setState(1467);
				cursor_name();
				setState(1468);
				match(CURSOR);
				setState(1469);
				declare_set_cursor_common();
				setState(1476);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1470);
					match(FOR);
					setState(1471);
					match(UPDATE);
					setState(1474);
					_la = _input.LA(1);
					if (_la==OF) {
						{
						setState(1472);
						match(OF);
						setState(1473);
						column_name_list();
						}
					}

					}
				}

				setState(1479);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1478);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_set_cursor_commonContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode TYPE_WARNING() { return getToken(tsqlParser.TYPE_WARNING, 0); }
		public TerminalNode LOCAL() { return getToken(tsqlParser.LOCAL, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode FORWARD_ONLY() { return getToken(tsqlParser.FORWARD_ONLY, 0); }
		public TerminalNode SCROLL() { return getToken(tsqlParser.SCROLL, 0); }
		public TerminalNode STATIC() { return getToken(tsqlParser.STATIC, 0); }
		public TerminalNode KEYSET() { return getToken(tsqlParser.KEYSET, 0); }
		public TerminalNode DYNAMIC() { return getToken(tsqlParser.DYNAMIC, 0); }
		public TerminalNode FAST_FORWARD() { return getToken(tsqlParser.FAST_FORWARD, 0); }
		public TerminalNode READ_ONLY() { return getToken(tsqlParser.READ_ONLY, 0); }
		public TerminalNode SCROLL_LOCKS() { return getToken(tsqlParser.SCROLL_LOCKS, 0); }
		public TerminalNode OPTIMISTIC() { return getToken(tsqlParser.OPTIMISTIC, 0); }
		public Declare_set_cursor_commonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_set_cursor_common; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDeclare_set_cursor_common(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDeclare_set_cursor_common(this);
		}
	}

	public final Declare_set_cursor_commonContext declare_set_cursor_common() throws RecognitionException {
		Declare_set_cursor_commonContext _localctx = new Declare_set_cursor_commonContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_declare_set_cursor_common);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			_la = _input.LA(1);
			if (_la==GLOBAL || _la==LOCAL) {
				{
				setState(1483);
				_la = _input.LA(1);
				if ( !(_la==GLOBAL || _la==LOCAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1487);
			_la = _input.LA(1);
			if (_la==FORWARD_ONLY || _la==SCROLL) {
				{
				setState(1486);
				_la = _input.LA(1);
				if ( !(_la==FORWARD_ONLY || _la==SCROLL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1490);
			_la = _input.LA(1);
			if (((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (DYNAMIC - 212)) | (1L << (FAST_FORWARD - 212)) | (1L << (KEYSET - 212)))) != 0) || _la==STATIC) {
				{
				setState(1489);
				_la = _input.LA(1);
				if ( !(((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (DYNAMIC - 212)) | (1L << (FAST_FORWARD - 212)) | (1L << (KEYSET - 212)))) != 0) || _la==STATIC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1493);
			_la = _input.LA(1);
			if (((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (OPTIMISTIC - 250)) | (1L << (READ_ONLY - 250)) | (1L << (SCROLL_LOCKS - 250)))) != 0)) {
				{
				setState(1492);
				_la = _input.LA(1);
				if ( !(((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (OPTIMISTIC - 250)) | (1L << (READ_ONLY - 250)) | (1L << (SCROLL_LOCKS - 250)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1496);
			_la = _input.LA(1);
			if (_la==TYPE_WARNING) {
				{
				setState(1495);
				match(TYPE_WARNING);
				}
			}

			setState(1498);
			match(FOR);
			setState(1499);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_cursorContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(tsqlParser.FETCH, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(tsqlParser.FROM, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public TerminalNode NEXT() { return getToken(tsqlParser.NEXT, 0); }
		public TerminalNode PRIOR() { return getToken(tsqlParser.PRIOR, 0); }
		public TerminalNode FIRST() { return getToken(tsqlParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(tsqlParser.LAST, 0); }
		public TerminalNode ABSOLUTE() { return getToken(tsqlParser.ABSOLUTE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RELATIVE() { return getToken(tsqlParser.RELATIVE, 0); }
		public Fetch_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFetch_cursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFetch_cursor(this);
		}
	}

	public final Fetch_cursorContext fetch_cursor() throws RecognitionException {
		Fetch_cursorContext _localctx = new Fetch_cursorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fetch_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			match(FETCH);
			setState(1513);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1510);
				switch (_input.LA(1)) {
				case NEXT:
					{
					setState(1502);
					match(NEXT);
					}
					break;
				case PRIOR:
					{
					setState(1503);
					match(PRIOR);
					}
					break;
				case FIRST:
					{
					setState(1504);
					match(FIRST);
					}
					break;
				case LAST:
					{
					setState(1505);
					match(LAST);
					}
					break;
				case ABSOLUTE:
					{
					setState(1506);
					match(ABSOLUTE);
					setState(1507);
					expression(0);
					}
					break;
				case RELATIVE:
					{
					setState(1508);
					match(RELATIVE);
					setState(1509);
					expression(0);
					}
					break;
				case FROM:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1512);
				match(FROM);
				}
				break;
			}
			setState(1516);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1515);
				match(GLOBAL);
				}
				break;
			}
			setState(1518);
			cursor_name();
			setState(1528);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1519);
				match(INTO);
				setState(1520);
				match(LOCAL_ID);
				setState(1525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1521);
					match(COMMA);
					setState(1522);
					match(LOCAL_ID);
					}
					}
					setState(1527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1531);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1530);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_specialContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode TRANSACTION() { return getToken(tsqlParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(tsqlParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(tsqlParser.LEVEL, 0); }
		public TerminalNode READ() { return getToken(tsqlParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(tsqlParser.UNCOMMITTED, 0); }
		public TerminalNode COMMITTED() { return getToken(tsqlParser.COMMITTED, 0); }
		public TerminalNode REPEATABLE() { return getToken(tsqlParser.REPEATABLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(tsqlParser.SNAPSHOT, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(tsqlParser.SERIALIZABLE, 0); }
		public TerminalNode IDENTITY_INSERT() { return getToken(tsqlParser.IDENTITY_INSERT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Set_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSet_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSet_special(this);
		}
	}

	public final Set_specialContext set_special() throws RecognitionException {
		Set_specialContext _localctx = new Set_specialContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_set_special);
		try {
			setState(1568);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				match(SET);
				setState(1534);
				id();
				setState(1539);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1535);
					id();
					}
					break;
				case DECIMAL:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case PLUS:
				case MINUS:
					{
					setState(1536);
					constant();
					}
					break;
				case LOCAL_ID:
					{
					setState(1537);
					match(LOCAL_ID);
					}
					break;
				case OFF:
				case ON:
					{
					setState(1538);
					on_off();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1542);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1541);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1544);
				match(SET);
				setState(1545);
				match(TRANSACTION);
				setState(1546);
				match(ISOLATION);
				setState(1547);
				match(LEVEL);
				setState(1556);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(1548);
					match(READ);
					setState(1549);
					match(UNCOMMITTED);
					}
					break;
				case 2:
					{
					setState(1550);
					match(READ);
					setState(1551);
					match(COMMITTED);
					}
					break;
				case 3:
					{
					setState(1552);
					match(REPEATABLE);
					setState(1553);
					match(READ);
					}
					break;
				case 4:
					{
					setState(1554);
					match(SNAPSHOT);
					}
					break;
				case 5:
					{
					setState(1555);
					match(SERIALIZABLE);
					}
					break;
				}
				setState(1559);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(1558);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1561);
				match(SET);
				setState(1562);
				match(IDENTITY_INSERT);
				setState(1563);
				table_name();
				setState(1564);
				on_off();
				setState(1566);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1565);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Binary_operator_expressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Binary_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBinary_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBinary_operator_expression(this);
		}
	}
	public static class Primitive_expressionContext extends ExpressionContext {
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Primitive_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterPrimitive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitPrimitive_expression(this);
		}
	}
	public static class Unary_operator_expressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Unary_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUnary_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUnary_operator_expression(this);
		}
	}
	public static class Bracket_expressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bracket_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBracket_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBracket_expression(this);
		}
	}
	public static class Function_call_expressionContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(tsqlParser.COLLATE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_call_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFunction_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFunction_call_expression(this);
		}
	}
	public static class Case_expressionContext extends ExpressionContext {
		public Case_exprContext case_expr() {
			return getRuleContext(Case_exprContext.class,0);
		}
		public Case_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCase_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCase_expression(this);
		}
	}
	public static class Column_ref_expressionContext extends ExpressionContext {
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public Column_ref_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_ref_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_ref_expression(this);
		}
	}
	public static class Subquery_expressionContext extends ExpressionContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Subquery_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSubquery_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSubquery_expression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				_localctx = new Unary_operator_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1571);
				match(BIT_NOT);
				setState(1572);
				expression(5);
				}
				break;
			case 2:
				{
				_localctx = new Unary_operator_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1573);
				((Unary_operator_expressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Unary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1574);
				expression(3);
				}
				break;
			case 3:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1575);
				match(DEFAULT);
				}
				break;
			case 4:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1576);
				match(NULL);
				}
				break;
			case 5:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1577);
				match(LOCAL_ID);
				}
				break;
			case 6:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1578);
				constant();
				}
				break;
			case 7:
				{
				_localctx = new Function_call_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1579);
				function_call();
				}
				break;
			case 8:
				{
				_localctx = new Case_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1580);
				case_expr();
				}
				break;
			case 9:
				{
				_localctx = new Column_ref_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1581);
				full_column_name();
				}
				break;
			case 10:
				{
				_localctx = new Bracket_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1582);
				match(LR_BRACKET);
				setState(1583);
				expression(0);
				setState(1584);
				match(RR_BRACKET);
				}
				break;
			case 11:
				{
				_localctx = new Subquery_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1586);
				match(LR_BRACKET);
				setState(1587);
				subquery();
				setState(1588);
				match(RR_BRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1605);
					switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
					case 1:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1592);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1593);
						((Binary_operator_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & ((1L << (STAR - 336)) | (1L << (DIVIDE - 336)) | (1L << (MODULE - 336)))) != 0)) ) {
							((Binary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1594);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1595);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1596);
						((Binary_operator_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (PLUS - 339)) | (1L << (MINUS - 339)) | (1L << (BIT_OR - 339)) | (1L << (BIT_AND - 339)) | (1L << (BIT_XOR - 339)))) != 0)) ) {
							((Binary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1597);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1598);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1599);
						comparison_operator();
						setState(1600);
						expression(2);
						}
						break;
					case 4:
						{
						_localctx = new Function_call_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1602);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1603);
						match(COLLATE);
						setState(1604);
						id();
						}
						break;
					}
					} 
				}
				setState(1609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_constant_expression);
		try {
			setState(1618);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				match(NULL);
				}
				break;
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1611);
				constant();
				}
				break;
			case COALESCE:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case FORCESEEK:
			case IDENTITY:
			case LEFT:
			case NULLIF:
			case RIGHT:
			case SESSION_USER:
			case SYSTEM_USER:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case BINARY_CHECKSUM:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATEADD:
			case DATEDIFF:
			case DATENAME:
			case DATEPART:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MIN_ACTIVE_ROWVERSION:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(1612);
				function_call();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(1613);
				match(LOCAL_ID);
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(1614);
				match(LR_BRACKET);
				setState(1615);
				constant_expression();
				setState(1616);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSubquery(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dml_table_sourceContext extends ParserRuleContext {
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public Dml_table_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_table_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDml_table_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDml_table_source(this);
		}
	}

	public final Dml_table_sourceContext dml_table_source() throws RecognitionException {
		Dml_table_sourceContext _localctx = new Dml_table_sourceContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_dml_table_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			query_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_expressionContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode XMLNAMESPACES() { return getToken(tsqlParser.XMLNAMESPACES, 0); }
		public With_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWith_expression(this);
		}
	}

	public final With_expressionContext with_expression() throws RecognitionException {
		With_expressionContext _localctx = new With_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_with_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			match(WITH);
			setState(1627);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1625);
				match(XMLNAMESPACES);
				setState(1626);
				match(COMMA);
				}
				break;
			}
			setState(1629);
			common_table_expression();
			setState(1634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1630);
				match(COMMA);
				setState(1631);
				common_table_expression();
				}
				}
				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public IdContext expression_name;
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCommon_table_expression(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			((Common_table_expressionContext)_localctx).expression_name = id();
			setState(1642);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(1638);
				match(LR_BRACKET);
				setState(1639);
				column_name_list();
				setState(1640);
				match(RR_BRACKET);
				}
			}

			setState(1644);
			match(AS);
			setState(1645);
			match(LR_BRACKET);
			setState(1646);
			select_statement();
			setState(1647);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_elemContext extends ParserRuleContext {
		public IdContext udt_column_name;
		public IdContext method_name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Update_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUpdate_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUpdate_elem(this);
		}
	}

	public final Update_elemContext update_elem() throws RecognitionException {
		Update_elemContext _localctx = new Update_elemContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_update_elem);
		try {
			setState(1665);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1651);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1649);
					full_column_name();
					}
					break;
				case LOCAL_ID:
					{
					setState(1650);
					match(LOCAL_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1655);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(1653);
					match(EQUAL);
					}
					break;
				case PLUS_ASSIGN:
				case MINUS_ASSIGN:
				case MULT_ASSIGN:
				case DIV_ASSIGN:
				case MOD_ASSIGN:
				case AND_ASSIGN:
				case XOR_ASSIGN:
				case OR_ASSIGN:
					{
					setState(1654);
					assignment_operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1657);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1658);
				((Update_elemContext)_localctx).udt_column_name = id();
				setState(1659);
				match(DOT);
				setState(1660);
				((Update_elemContext)_localctx).method_name = id();
				setState(1661);
				match(LR_BRACKET);
				setState(1662);
				expression_list();
				setState(1663);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_listContext extends ParserRuleContext {
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public Search_condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSearch_condition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSearch_condition_list(this);
		}
	}

	public final Search_condition_listContext search_condition_list() throws RecognitionException {
		Search_condition_listContext _localctx = new Search_condition_listContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_search_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			search_condition();
			setState(1672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1668);
				match(COMMA);
				setState(1669);
				search_condition();
				}
				}
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_conditionContext extends ParserRuleContext {
		public List<Search_condition_orContext> search_condition_or() {
			return getRuleContexts(Search_condition_orContext.class);
		}
		public Search_condition_orContext search_condition_or(int i) {
			return getRuleContext(Search_condition_orContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(tsqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(tsqlParser.AND, i);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSearch_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSearch_condition(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_search_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			search_condition_or();
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1676);
				match(AND);
				setState(1677);
				search_condition_or();
				}
				}
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_orContext extends ParserRuleContext {
		public List<Search_condition_notContext> search_condition_not() {
			return getRuleContexts(Search_condition_notContext.class);
		}
		public Search_condition_notContext search_condition_not(int i) {
			return getRuleContext(Search_condition_notContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(tsqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(tsqlParser.OR, i);
		}
		public Search_condition_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSearch_condition_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSearch_condition_or(this);
		}
	}

	public final Search_condition_orContext search_condition_or() throws RecognitionException {
		Search_condition_orContext _localctx = new Search_condition_orContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_search_condition_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			search_condition_not();
			setState(1688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1684);
				match(OR);
				setState(1685);
				search_condition_not();
				}
				}
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_notContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public Search_condition_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSearch_condition_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSearch_condition_not(this);
		}
	}

	public final Search_condition_notContext search_condition_not() throws RecognitionException {
		Search_condition_notContext _localctx = new Search_condition_notContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_search_condition_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1691);
				match(NOT);
				}
			}

			setState(1694);
			predicate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(tsqlParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(tsqlParser.ANY, 0); }
		public TerminalNode BETWEEN() { return getToken(tsqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(tsqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode IN() { return getToken(tsqlParser.IN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(tsqlParser.LIKE, 0); }
		public TerminalNode ESCAPE() { return getToken(tsqlParser.ESCAPE, 0); }
		public TerminalNode IS() { return getToken(tsqlParser.IS, 0); }
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_predicate);
		int _la;
		try {
			setState(1751);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1696);
				match(EXISTS);
				setState(1697);
				match(LR_BRACKET);
				setState(1698);
				subquery();
				setState(1699);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1701);
				expression(0);
				setState(1702);
				comparison_operator();
				setState(1703);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1705);
				expression(0);
				setState(1706);
				comparison_operator();
				setState(1707);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1708);
				match(LR_BRACKET);
				setState(1709);
				subquery();
				setState(1710);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1712);
				expression(0);
				setState(1714);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1713);
					match(NOT);
					}
				}

				setState(1716);
				match(BETWEEN);
				setState(1717);
				expression(0);
				setState(1718);
				match(AND);
				setState(1719);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1721);
				expression(0);
				setState(1723);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1722);
					match(NOT);
					}
				}

				setState(1725);
				match(IN);
				setState(1726);
				match(LR_BRACKET);
				setState(1729);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(1727);
					subquery();
					}
					break;
				case 2:
					{
					setState(1728);
					expression_list();
					}
					break;
				}
				setState(1731);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1733);
				expression(0);
				setState(1735);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1734);
					match(NOT);
					}
				}

				setState(1737);
				match(LIKE);
				setState(1738);
				expression(0);
				setState(1741);
				_la = _input.LA(1);
				if (_la==ESCAPE) {
					{
					setState(1739);
					match(ESCAPE);
					setState(1740);
					expression(0);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1743);
				expression(0);
				setState(1744);
				match(IS);
				setState(1745);
				null_notnull();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1747);
				match(LR_BRACKET);
				setState(1748);
				search_condition();
				setState(1749);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_expressionContext extends ParserRuleContext {
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterQuery_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitQuery_expression(this);
		}
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_query_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1753);
				query_specification();
				}
				break;
			case LR_BRACKET:
				{
				setState(1754);
				match(LR_BRACKET);
				setState(1755);
				query_expression();
				setState(1756);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1760);
					union();
					}
					} 
				}
				setState(1765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(tsqlParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(tsqlParser.EXCEPT, 0); }
		public TerminalNode INTERSECT() { return getToken(tsqlParser.INTERSECT, 0); }
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public List<Query_expressionContext> query_expression() {
			return getRuleContexts(Query_expressionContext.class);
		}
		public Query_expressionContext query_expression(int i) {
			return getRuleContext(Query_expressionContext.class,i);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitUnion(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_union);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			switch (_input.LA(1)) {
			case UNION:
				{
				setState(1766);
				match(UNION);
				setState(1768);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(1767);
					match(ALL);
					}
				}

				}
				break;
			case EXCEPT:
				{
				setState(1770);
				match(EXCEPT);
				}
				break;
			case INTERSECT:
				{
				setState(1771);
				match(INTERSECT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1783);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1774);
				query_specification();
				}
				break;
			case LR_BRACKET:
				{
				setState(1779); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1775);
						match(LR_BRACKET);
						setState(1776);
						query_expression();
						setState(1777);
						match(RR_BRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1781); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_specificationContext extends ParserRuleContext {
		public Table_nameContext into_table;
		public Search_conditionContext where;
		public Search_conditionContext having;
		public TerminalNode SELECT() { return getToken(tsqlParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode TOP() { return getToken(tsqlParser.TOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public TerminalNode FROM() { return getToken(tsqlParser.FROM, 0); }
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(tsqlParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(tsqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(tsqlParser.BY, 0); }
		public List<Group_by_itemContext> group_by_item() {
			return getRuleContexts(Group_by_itemContext.class);
		}
		public Group_by_itemContext group_by_item(int i) {
			return getRuleContext(Group_by_itemContext.class,i);
		}
		public TerminalNode HAVING() { return getToken(tsqlParser.HAVING, 0); }
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(tsqlParser.DISTINCT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(tsqlParser.TIES, 0); }
		public Query_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterQuery_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitQuery_specification(this);
		}
	}

	public final Query_specificationContext query_specification() throws RecognitionException {
		Query_specificationContext _localctx = new Query_specificationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_query_specification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			match(SELECT);
			setState(1787);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(1786);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1798);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(1789);
				match(TOP);
				setState(1790);
				expression(0);
				setState(1792);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(1791);
					match(PERCENT);
					}
				}

				setState(1796);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1794);
					match(WITH);
					setState(1795);
					match(TIES);
					}
				}

				}
			}

			setState(1800);
			select_list();
			setState(1803);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1801);
				match(INTO);
				setState(1802);
				((Query_specificationContext)_localctx).into_table = table_name();
				}
			}

			setState(1814);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1805);
				match(FROM);
				setState(1806);
				table_source();
				setState(1811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1807);
						match(COMMA);
						setState(1808);
						table_source();
						}
						} 
					}
					setState(1813);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
				}
				}
			}

			setState(1818);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(1816);
				match(WHERE);
				setState(1817);
				((Query_specificationContext)_localctx).where = search_condition();
				}
				break;
			}
			setState(1830);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				setState(1820);
				match(GROUP);
				setState(1821);
				match(BY);
				setState(1822);
				group_by_item();
				setState(1827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1823);
						match(COMMA);
						setState(1824);
						group_by_item();
						}
						} 
					}
					setState(1829);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
				}
				}
				break;
			}
			setState(1834);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				{
				setState(1832);
				match(HAVING);
				setState(1833);
				((Query_specificationContext)_localctx).having = search_condition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(tsqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(tsqlParser.BY, 0); }
		public List<Order_by_expressionContext> order_by_expression() {
			return getRuleContexts(Order_by_expressionContext.class);
		}
		public Order_by_expressionContext order_by_expression(int i) {
			return getRuleContext(Order_by_expressionContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(tsqlParser.OFFSET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ROW() { return getTokens(tsqlParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(tsqlParser.ROW, i);
		}
		public List<TerminalNode> ROWS() { return getTokens(tsqlParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(tsqlParser.ROWS, i);
		}
		public TerminalNode FETCH() { return getToken(tsqlParser.FETCH, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode FIRST() { return getToken(tsqlParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(tsqlParser.NEXT, 0); }
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOrder_by_clause(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			match(ORDER);
			setState(1837);
			match(BY);
			setState(1838);
			order_by_expression();
			setState(1843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1839);
					match(COMMA);
					setState(1840);
					order_by_expression();
					}
					} 
				}
				setState(1845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			setState(1857);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				setState(1846);
				match(OFFSET);
				setState(1847);
				expression(0);
				setState(1848);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1855);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(1849);
					match(FETCH);
					setState(1850);
					_la = _input.LA(1);
					if ( !(_la==FIRST || _la==NEXT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1851);
					expression(0);
					setState(1852);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1853);
					match(ONLY);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode BROWSE() { return getToken(tsqlParser.BROWSE, 0); }
		public TerminalNode XML() { return getToken(tsqlParser.XML, 0); }
		public TerminalNode AUTO() { return getToken(tsqlParser.AUTO, 0); }
		public Xml_common_directivesContext xml_common_directives() {
			return getRuleContext(Xml_common_directivesContext.class,0);
		}
		public TerminalNode PATH() { return getToken(tsqlParser.PATH, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public For_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFor_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFor_clause(this);
		}
	}

	public final For_clauseContext for_clause() throws RecognitionException {
		For_clauseContext _localctx = new For_clauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_for_clause);
		try {
			setState(1878);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1859);
				match(FOR);
				setState(1860);
				match(BROWSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1861);
				match(FOR);
				setState(1862);
				match(XML);
				setState(1863);
				match(AUTO);
				setState(1865);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(1864);
					xml_common_directives();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1867);
				match(FOR);
				setState(1868);
				match(XML);
				setState(1869);
				match(PATH);
				setState(1873);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(1870);
					match(LR_BRACKET);
					setState(1871);
					match(STRING);
					setState(1872);
					match(RR_BRACKET);
					}
					break;
				}
				setState(1876);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(1875);
					xml_common_directives();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_common_directivesContext extends ParserRuleContext {
		public TerminalNode BINARY() { return getToken(tsqlParser.BINARY, 0); }
		public TerminalNode BASE64() { return getToken(tsqlParser.BASE64, 0); }
		public TerminalNode TYPE() { return getToken(tsqlParser.TYPE, 0); }
		public TerminalNode ROOT() { return getToken(tsqlParser.ROOT, 0); }
		public Xml_common_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_common_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterXml_common_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitXml_common_directives(this);
		}
	}

	public final Xml_common_directivesContext xml_common_directives() throws RecognitionException {
		Xml_common_directivesContext _localctx = new Xml_common_directivesContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_xml_common_directives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			match(COMMA);
			setState(1885);
			switch (_input.LA(1)) {
			case BINARY:
				{
				setState(1881);
				match(BINARY);
				setState(1882);
				match(BASE64);
				}
				break;
			case TYPE:
				{
				setState(1883);
				match(TYPE);
				}
				break;
			case ROOT:
				{
				setState(1884);
				match(ROOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(tsqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(tsqlParser.DESC, 0); }
		public Order_by_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOrder_by_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOrder_by_expression(this);
		}
	}

	public final Order_by_expressionContext order_by_expression() throws RecognitionException {
		Order_by_expressionContext _localctx = new Order_by_expressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_order_by_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			expression(0);
			setState(1889);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1888);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Group_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterGroup_by_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitGroup_by_item(this);
		}
	}

	public final Group_by_itemContext group_by_item() throws RecognitionException {
		Group_by_itemContext _localctx = new Group_by_itemContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_group_by_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_clauseContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(tsqlParser.OPTION, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public Option_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOption_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOption_clause(this);
		}
	}

	public final Option_clauseContext option_clause() throws RecognitionException {
		Option_clauseContext _localctx = new Option_clauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_option_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			match(OPTION);
			setState(1894);
			match(LR_BRACKET);
			setState(1895);
			option();
			setState(1900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1896);
				match(COMMA);
				setState(1897);
				option();
				}
				}
				setState(1902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1903);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public Token number_rows;
		public TerminalNode FAST() { return getToken(tsqlParser.FAST, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode GROUP() { return getToken(tsqlParser.GROUP, 0); }
		public TerminalNode HASH() { return getToken(tsqlParser.HASH, 0); }
		public TerminalNode ORDER() { return getToken(tsqlParser.ORDER, 0); }
		public TerminalNode UNION() { return getToken(tsqlParser.UNION, 0); }
		public TerminalNode MERGE() { return getToken(tsqlParser.MERGE, 0); }
		public TerminalNode CONCAT() { return getToken(tsqlParser.CONCAT, 0); }
		public TerminalNode KEEPFIXED() { return getToken(tsqlParser.KEEPFIXED, 0); }
		public TerminalNode PLAN() { return getToken(tsqlParser.PLAN, 0); }
		public TerminalNode OPTIMIZE() { return getToken(tsqlParser.OPTIMIZE, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public List<Optimize_for_argContext> optimize_for_arg() {
			return getRuleContexts(Optimize_for_argContext.class);
		}
		public Optimize_for_argContext optimize_for_arg(int i) {
			return getRuleContext(Optimize_for_argContext.class,i);
		}
		public TerminalNode UNKNOWN() { return getToken(tsqlParser.UNKNOWN, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_option);
		int _la;
		try {
			setState(1929);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1905);
				match(FAST);
				setState(1906);
				((OptionContext)_localctx).number_rows = match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1907);
				_la = _input.LA(1);
				if ( !(_la==ORDER || _la==HASH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1908);
				match(GROUP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1909);
				_la = _input.LA(1);
				if ( !(_la==MERGE || _la==CONCAT || _la==HASH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1910);
				match(UNION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1911);
				match(KEEPFIXED);
				setState(1912);
				match(PLAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1913);
				match(OPTIMIZE);
				setState(1914);
				match(FOR);
				setState(1915);
				match(LR_BRACKET);
				setState(1916);
				optimize_for_arg();
				setState(1921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1917);
					match(COMMA);
					setState(1918);
					optimize_for_arg();
					}
					}
					setState(1923);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1924);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1926);
				match(OPTIMIZE);
				setState(1927);
				match(FOR);
				setState(1928);
				match(UNKNOWN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optimize_for_argContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode UNKNOWN() { return getToken(tsqlParser.UNKNOWN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Optimize_for_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimize_for_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOptimize_for_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOptimize_for_arg(this);
		}
	}

	public final Optimize_for_argContext optimize_for_arg() throws RecognitionException {
		Optimize_for_argContext _localctx = new Optimize_for_argContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_optimize_for_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			match(LOCAL_ID);
			setState(1935);
			switch (_input.LA(1)) {
			case UNKNOWN:
				{
				setState(1932);
				match(UNKNOWN);
				}
				break;
			case EQUAL:
				{
				setState(1933);
				match(EQUAL);
				setState(1934);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_elemContext> select_list_elem() {
			return getRuleContexts(Select_list_elemContext.class);
		}
		public Select_list_elemContext select_list_elem(int i) {
			return getRuleContext(Select_list_elemContext.class,i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			select_list_elem();
			setState(1942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1938);
					match(COMMA);
					setState(1939);
					select_list_elem();
					}
					} 
				}
				setState(1944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_elemContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public TerminalNode ROWGUID() { return getToken(tsqlParser.ROWGUID, 0); }
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Select_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSelect_list_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSelect_list_elem(this);
		}
	}

	public final Select_list_elemContext select_list_elem() throws RecognitionException {
		Select_list_elemContext _localctx = new Select_list_elemContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_select_list_elem);
		int _la;
		try {
			setState(1966);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1948);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ABSOLUTE - 188)) | (1L << (APPLY - 188)) | (1L << (AUTO - 188)) | (1L << (AVG - 188)) | (1L << (BASE64 - 188)) | (1L << (CALLER - 188)) | (1L << (CAST - 188)) | (1L << (CATCH - 188)) | (1L << (CHECKSUM_AGG - 188)) | (1L << (COMMITTED - 188)) | (1L << (CONCAT - 188)) | (1L << (COOKIE - 188)) | (1L << (COUNT - 188)) | (1L << (COUNT_BIG - 188)) | (1L << (DELAY - 188)) | (1L << (DELETED - 188)) | (1L << (DENSE_RANK - 188)) | (1L << (DISABLE - 188)) | (1L << (DYNAMIC - 188)) | (1L << (ENCRYPTION - 188)) | (1L << (FAST - 188)) | (1L << (FAST_FORWARD - 188)) | (1L << (FIRST - 188)) | (1L << (FOLLOWING - 188)) | (1L << (FORWARD_ONLY - 188)) | (1L << (FULLSCAN - 188)) | (1L << (GLOBAL - 188)) | (1L << (GO - 188)) | (1L << (GROUPING - 188)) | (1L << (GROUPING_ID - 188)) | (1L << (HASH - 188)) | (1L << (INSENSITIVE - 188)) | (1L << (INSERTED - 188)) | (1L << (ISOLATION - 188)) | (1L << (KEEPFIXED - 188)) | (1L << (KEYSET - 188)) | (1L << (LAST - 188)) | (1L << (LEVEL - 188)) | (1L << (LOCAL - 188)) | (1L << (LOCK_ESCALATION - 188)) | (1L << (LOGIN - 188)) | (1L << (LOOP - 188)) | (1L << (MARK - 188)) | (1L << (MAX - 188)) | (1L << (MIN - 188)) | (1L << (MODIFY - 188)) | (1L << (NEXT - 188)) | (1L << (NAME - 188)) | (1L << (NOCOUNT - 188)) | (1L << (NOEXPAND - 188)) | (1L << (NORECOMPUTE - 188)) | (1L << (NTILE - 188)) | (1L << (NUMBER - 188)) | (1L << (OFFSET - 188)) | (1L << (ONLY - 188)) | (1L << (OPTIMISTIC - 188)) | (1L << (OPTIMIZE - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (OUT - 252)) | (1L << (OUTPUT - 252)) | (1L << (OWNER - 252)) | (1L << (PARTITION - 252)) | (1L << (PATH - 252)) | (1L << (PRECEDING - 252)) | (1L << (PRIOR - 252)) | (1L << (RANGE - 252)) | (1L << (RANK - 252)) | (1L << (READONLY - 252)) | (1L << (READ_ONLY - 252)) | (1L << (RECOMPILE - 252)) | (1L << (RELATIVE - 252)) | (1L << (REMOTE - 252)) | (1L << (REPEATABLE - 252)) | (1L << (ROOT - 252)) | (1L << (ROW - 252)) | (1L << (ROWGUID - 252)) | (1L << (ROWS - 252)) | (1L << (ROW_NUMBER - 252)) | (1L << (SAMPLE - 252)) | (1L << (SCHEMABINDING - 252)) | (1L << (SCROLL - 252)) | (1L << (SCROLL_LOCKS - 252)) | (1L << (SELF - 252)) | (1L << (SERIALIZABLE - 252)) | (1L << (SNAPSHOT - 252)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 252)) | (1L << (STATIC - 252)) | (1L << (STATS_STREAM - 252)) | (1L << (STDEV - 252)) | (1L << (STDEVP - 252)) | (1L << (SUM - 252)) | (1L << (THROW - 252)) | (1L << (TIES - 252)) | (1L << (TIME - 252)) | (1L << (TRY - 252)) | (1L << (TYPE - 252)) | (1L << (TYPE_WARNING - 252)) | (1L << (UNBOUNDED - 252)) | (1L << (UNCOMMITTED - 252)) | (1L << (UNKNOWN - 252)) | (1L << (USING - 252)) | (1L << (VAR - 252)) | (1L << (VARP - 252)) | (1L << (VIEW_METADATA - 252)) | (1L << (WORK - 252)) | (1L << (XML - 252)) | (1L << (XMLNAMESPACES - 252)) | (1L << (DOUBLE_QUOTE_ID - 252)) | (1L << (SQUARE_BRACKET_ID - 252)) | (1L << (ID - 252)))) != 0)) {
					{
					setState(1945);
					table_name();
					setState(1946);
					match(DOT);
					}
				}

				setState(1953);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(1950);
					match(STAR);
					}
					break;
				case DOLLAR:
					{
					setState(1951);
					match(DOLLAR);
					setState(1952);
					_la = _input.LA(1);
					if ( !(_la==IDENTITY || _la==ROWGUID) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1955);
				column_alias();
				setState(1956);
				match(EQUAL);
				setState(1957);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1959);
				expression(0);
				setState(1964);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(1961);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1960);
						match(AS);
						}
					}

					setState(1963);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(tsqlParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(tsqlParser.BY, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterPartition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitPartition_by_clause(this);
		}
	}

	public final Partition_by_clauseContext partition_by_clause() throws RecognitionException {
		Partition_by_clauseContext _localctx = new Partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_partition_by_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			match(PARTITION);
			setState(1969);
			match(BY);
			setState(1970);
			expression_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_sourceContext extends ParserRuleContext {
		public Table_source_item_joinedContext table_source_item_joined() {
			return getRuleContext(Table_source_item_joinedContext.class,0);
		}
		public Table_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_source(this);
		}
	}

	public final Table_sourceContext table_source() throws RecognitionException {
		Table_sourceContext _localctx = new Table_sourceContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_table_source);
		try {
			setState(1977);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1972);
				table_source_item_joined();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1973);
				match(LR_BRACKET);
				setState(1974);
				table_source_item_joined();
				setState(1975);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_source_item_joinedContext extends ParserRuleContext {
		public Table_source_itemContext table_source_item() {
			return getRuleContext(Table_source_itemContext.class,0);
		}
		public List<Join_partContext> join_part() {
			return getRuleContexts(Join_partContext.class);
		}
		public Join_partContext join_part(int i) {
			return getRuleContext(Join_partContext.class,i);
		}
		public Table_source_item_joinedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source_item_joined; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_source_item_joined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_source_item_joined(this);
		}
	}

	public final Table_source_item_joinedContext table_source_item_joined() throws RecognitionException {
		Table_source_item_joinedContext _localctx = new Table_source_item_joinedContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_table_source_item_joined);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			table_source_item();
			setState(1983);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1980);
					join_part();
					}
					} 
				}
				setState(1985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_source_itemContext extends ParserRuleContext {
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public As_table_aliasContext as_table_alias() {
			return getRuleContext(As_table_aliasContext.class,0);
		}
		public Rowset_functionContext rowset_function() {
			return getRuleContext(Rowset_functionContext.class,0);
		}
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public Column_alias_listContext column_alias_list() {
			return getRuleContext(Column_alias_listContext.class,0);
		}
		public Change_tableContext change_table() {
			return getRuleContext(Change_tableContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Table_source_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_source_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_source_item(this);
		}
	}

	public final Table_source_itemContext table_source_item() throws RecognitionException {
		Table_source_itemContext _localctx = new Table_source_itemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_table_source_item);
		try {
			setState(2021);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1986);
				table_name_with_hint();
				setState(1988);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(1987);
					as_table_alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1990);
				rowset_function();
				setState(1992);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(1991);
					as_table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1994);
				derived_table();
				setState(1999);
				switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					{
					setState(1995);
					as_table_alias();
					setState(1997);
					switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
					case 1:
						{
						setState(1996);
						column_alias_list();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2001);
				change_table();
				setState(2002);
				as_table_alias();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2004);
				function_call();
				setState(2006);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2005);
					as_table_alias();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2008);
				match(LOCAL_ID);
				setState(2010);
				switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
				case 1:
					{
					setState(2009);
					as_table_alias();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2012);
				match(LOCAL_ID);
				setState(2013);
				match(DOT);
				setState(2014);
				function_call();
				setState(2019);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2015);
					as_table_alias();
					setState(2017);
					switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
					case 1:
						{
						setState(2016);
						column_alias_list();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Change_tableContext extends ParserRuleContext {
		public TerminalNode CHANGETABLE() { return getToken(tsqlParser.CHANGETABLE, 0); }
		public TerminalNode CHANGES() { return getToken(tsqlParser.CHANGES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Change_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterChange_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitChange_table(this);
		}
	}

	public final Change_tableContext change_table() throws RecognitionException {
		Change_tableContext _localctx = new Change_tableContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_change_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			match(CHANGETABLE);
			setState(2024);
			match(LR_BRACKET);
			setState(2025);
			match(CHANGES);
			setState(2026);
			table_name();
			setState(2027);
			match(COMMA);
			setState(2028);
			_la = _input.LA(1);
			if ( !(_la==NULL || _la==LOCAL_ID || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2029);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_partContext extends ParserRuleContext {
		public Token join_type;
		public Token join_hint;
		public TerminalNode JOIN() { return getToken(tsqlParser.JOIN, 0); }
		public Table_sourceContext table_source() {
			return getRuleContext(Table_sourceContext.class,0);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(tsqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(tsqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(tsqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(tsqlParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(tsqlParser.OUTER, 0); }
		public TerminalNode LOOP() { return getToken(tsqlParser.LOOP, 0); }
		public TerminalNode HASH() { return getToken(tsqlParser.HASH, 0); }
		public TerminalNode MERGE() { return getToken(tsqlParser.MERGE, 0); }
		public TerminalNode REMOTE() { return getToken(tsqlParser.REMOTE, 0); }
		public TerminalNode CROSS() { return getToken(tsqlParser.CROSS, 0); }
		public TerminalNode APPLY() { return getToken(tsqlParser.APPLY, 0); }
		public Join_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterJoin_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitJoin_part(this);
		}
	}

	public final Join_partContext join_part() throws RecognitionException {
		Join_partContext _localctx = new Join_partContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_join_part);
		int _la;
		try {
			setState(2057);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2038);
				switch (_input.LA(1)) {
				case INNER:
				case JOIN:
				case MERGE:
				case HASH:
				case LOOP:
				case REMOTE:
					{
					setState(2032);
					_la = _input.LA(1);
					if (_la==INNER) {
						{
						setState(2031);
						match(INNER);
						}
					}

					}
					break;
				case FULL:
				case LEFT:
				case RIGHT:
					{
					setState(2034);
					((Join_partContext)_localctx).join_type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
						((Join_partContext)_localctx).join_type = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2036);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(2035);
						match(OUTER);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2041);
				_la = _input.LA(1);
				if (_la==MERGE || ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (HASH - 224)) | (1L << (LOOP - 224)) | (1L << (REMOTE - 224)))) != 0)) {
					{
					setState(2040);
					((Join_partContext)_localctx).join_hint = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MERGE || ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (HASH - 224)) | (1L << (LOOP - 224)) | (1L << (REMOTE - 224)))) != 0)) ) {
						((Join_partContext)_localctx).join_hint = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(2043);
				match(JOIN);
				setState(2044);
				table_source();
				setState(2045);
				match(ON);
				setState(2046);
				search_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2048);
				match(CROSS);
				setState(2049);
				match(JOIN);
				setState(2050);
				table_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2051);
				match(CROSS);
				setState(2052);
				match(APPLY);
				setState(2053);
				table_source();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2054);
				match(OUTER);
				setState(2055);
				match(APPLY);
				setState(2056);
				table_source();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_name_with_hintContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Table_name_with_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name_with_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_name_with_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_name_with_hint(this);
		}
	}

	public final Table_name_with_hintContext table_name_with_hint() throws RecognitionException {
		Table_name_with_hintContext _localctx = new Table_name_with_hintContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_table_name_with_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			table_name();
			setState(2061);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				{
				setState(2060);
				with_table_hints();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rowset_functionContext extends ParserRuleContext {
		public Token data_file;
		public TerminalNode OPENROWSET() { return getToken(tsqlParser.OPENROWSET, 0); }
		public TerminalNode BULK() { return getToken(tsqlParser.BULK, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public List<Bulk_optionContext> bulk_option() {
			return getRuleContexts(Bulk_optionContext.class);
		}
		public Bulk_optionContext bulk_option(int i) {
			return getRuleContext(Bulk_optionContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Rowset_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowset_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRowset_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRowset_function(this);
		}
	}

	public final Rowset_functionContext rowset_function() throws RecognitionException {
		Rowset_functionContext _localctx = new Rowset_functionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_rowset_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
			match(OPENROWSET);
			setState(2064);
			match(LR_BRACKET);
			setState(2065);
			match(BULK);
			setState(2066);
			((Rowset_functionContext)_localctx).data_file = match(STRING);
			setState(2067);
			match(COMMA);
			setState(2077);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				{
				setState(2068);
				bulk_option();
				setState(2073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2069);
					match(COMMA);
					setState(2070);
					bulk_option();
					}
					}
					setState(2075);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(2076);
				id();
				}
				break;
			}
			setState(2079);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bulk_optionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Bulk_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulk_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterBulk_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitBulk_option(this);
		}
	}

	public final Bulk_optionContext bulk_option() throws RecognitionException {
		Bulk_optionContext _localctx = new Bulk_optionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_bulk_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			id();
			setState(2082);
			match(EQUAL);
			setState(2083);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_tableContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Table_value_constructorContext table_value_constructor() {
			return getRuleContext(Table_value_constructorContext.class,0);
		}
		public Derived_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDerived_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDerived_table(this);
		}
	}

	public final Derived_tableContext derived_table() throws RecognitionException {
		Derived_tableContext _localctx = new Derived_tableContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_derived_table);
		try {
			setState(2091);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2085);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2086);
				match(LR_BRACKET);
				setState(2087);
				subquery();
				setState(2088);
				match(RR_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2090);
				table_value_constructor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public ExpressionContext style;
		public Token seed;
		public Token increment;
		public Ranking_windowed_functionContext ranking_windowed_function() {
			return getRuleContext(Ranking_windowed_functionContext.class,0);
		}
		public Aggregate_windowed_functionContext aggregate_windowed_function() {
			return getRuleContext(Aggregate_windowed_functionContext.class,0);
		}
		public Scalar_function_nameContext scalar_function_name() {
			return getRuleContext(Scalar_function_nameContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode BINARY_CHECKSUM() { return getToken(tsqlParser.BINARY_CHECKSUM, 0); }
		public TerminalNode CAST() { return getToken(tsqlParser.CAST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode CONVERT() { return getToken(tsqlParser.CONVERT, 0); }
		public TerminalNode CHECKSUM() { return getToken(tsqlParser.CHECKSUM, 0); }
		public TerminalNode COALESCE() { return getToken(tsqlParser.COALESCE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(tsqlParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(tsqlParser.CURRENT_USER, 0); }
		public TerminalNode DATEADD() { return getToken(tsqlParser.DATEADD, 0); }
		public DatepartContext datepart() {
			return getRuleContext(DatepartContext.class,0);
		}
		public TerminalNode DATEDIFF() { return getToken(tsqlParser.DATEDIFF, 0); }
		public TerminalNode DATENAME() { return getToken(tsqlParser.DATENAME, 0); }
		public TerminalNode DATEPART() { return getToken(tsqlParser.DATEPART, 0); }
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public TerminalNode MIN_ACTIVE_ROWVERSION() { return getToken(tsqlParser.MIN_ACTIVE_ROWVERSION, 0); }
		public TerminalNode NULLIF() { return getToken(tsqlParser.NULLIF, 0); }
		public TerminalNode SESSION_USER() { return getToken(tsqlParser.SESSION_USER, 0); }
		public TerminalNode SYSTEM_USER() { return getToken(tsqlParser.SYSTEM_USER, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_function_call);
		int _la;
		try {
			setState(2190);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2093);
				ranking_windowed_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2094);
				aggregate_windowed_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2095);
				scalar_function_name();
				setState(2096);
				match(LR_BRACKET);
				setState(2098);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (CASE - 17)) | (1L << (COALESCE - 17)) | (1L << (CONVERT - 17)) | (1L << (CURRENT_TIMESTAMP - 17)) | (1L << (CURRENT_USER - 17)) | (1L << (DEFAULT - 17)) | (1L << (FORCESEEK - 17)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (IDENTITY - 81)) | (1L << (LEFT - 81)) | (1L << (NULL - 81)) | (1L << (NULLIF - 81)) | (1L << (RIGHT - 81)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (SESSION_USER - 152)) | (1L << (SYSTEM_USER - 152)) | (1L << (ABSOLUTE - 152)) | (1L << (APPLY - 152)) | (1L << (AUTO - 152)) | (1L << (AVG - 152)) | (1L << (BASE64 - 152)) | (1L << (BINARY_CHECKSUM - 152)) | (1L << (CALLER - 152)) | (1L << (CAST - 152)) | (1L << (CATCH - 152)) | (1L << (CHECKSUM - 152)) | (1L << (CHECKSUM_AGG - 152)) | (1L << (COMMITTED - 152)) | (1L << (CONCAT - 152)) | (1L << (COOKIE - 152)) | (1L << (COUNT - 152)) | (1L << (COUNT_BIG - 152)) | (1L << (DATEADD - 152)) | (1L << (DATEDIFF - 152)) | (1L << (DATENAME - 152)) | (1L << (DATEPART - 152)) | (1L << (DELAY - 152)) | (1L << (DELETED - 152)) | (1L << (DENSE_RANK - 152)) | (1L << (DISABLE - 152)) | (1L << (DYNAMIC - 152)) | (1L << (ENCRYPTION - 152)) | (1L << (FAST - 152)) | (1L << (FAST_FORWARD - 152)))) != 0) || ((((_la - 216)) & ~0x3f) == 0 && ((1L << (_la - 216)) & ((1L << (FIRST - 216)) | (1L << (FOLLOWING - 216)) | (1L << (FORWARD_ONLY - 216)) | (1L << (FULLSCAN - 216)) | (1L << (GLOBAL - 216)) | (1L << (GO - 216)) | (1L << (GROUPING - 216)) | (1L << (GROUPING_ID - 216)) | (1L << (HASH - 216)) | (1L << (INSENSITIVE - 216)) | (1L << (INSERTED - 216)) | (1L << (ISOLATION - 216)) | (1L << (KEEPFIXED - 216)) | (1L << (KEYSET - 216)) | (1L << (LAST - 216)) | (1L << (LEVEL - 216)) | (1L << (LOCAL - 216)) | (1L << (LOCK_ESCALATION - 216)) | (1L << (LOGIN - 216)) | (1L << (LOOP - 216)) | (1L << (MARK - 216)) | (1L << (MAX - 216)) | (1L << (MIN - 216)) | (1L << (MIN_ACTIVE_ROWVERSION - 216)) | (1L << (MODIFY - 216)) | (1L << (NEXT - 216)) | (1L << (NAME - 216)) | (1L << (NOCOUNT - 216)) | (1L << (NOEXPAND - 216)) | (1L << (NORECOMPUTE - 216)) | (1L << (NTILE - 216)) | (1L << (NUMBER - 216)) | (1L << (OFFSET - 216)) | (1L << (ONLY - 216)) | (1L << (OPTIMISTIC - 216)) | (1L << (OPTIMIZE - 216)) | (1L << (OUT - 216)) | (1L << (OUTPUT - 216)) | (1L << (OWNER - 216)) | (1L << (PARTITION - 216)) | (1L << (PATH - 216)) | (1L << (PRECEDING - 216)) | (1L << (PRIOR - 216)) | (1L << (RANGE - 216)) | (1L << (RANK - 216)) | (1L << (READONLY - 216)) | (1L << (READ_ONLY - 216)) | (1L << (RECOMPILE - 216)) | (1L << (RELATIVE - 216)) | (1L << (REMOTE - 216)) | (1L << (REPEATABLE - 216)) | (1L << (ROOT - 216)) | (1L << (ROW - 216)) | (1L << (ROWGUID - 216)) | (1L << (ROWS - 216)) | (1L << (ROW_NUMBER - 216)) | (1L << (SAMPLE - 216)) | (1L << (SCHEMABINDING - 216)) | (1L << (SCROLL - 216)) | (1L << (SCROLL_LOCKS - 216)) | (1L << (SELF - 216)) | (1L << (SERIALIZABLE - 216)) | (1L << (SNAPSHOT - 216)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 216)))) != 0) || ((((_la - 280)) & ~0x3f) == 0 && ((1L << (_la - 280)) & ((1L << (STATIC - 280)) | (1L << (STATS_STREAM - 280)) | (1L << (STDEV - 280)) | (1L << (STDEVP - 280)) | (1L << (SUM - 280)) | (1L << (THROW - 280)) | (1L << (TIES - 280)) | (1L << (TIME - 280)) | (1L << (TRY - 280)) | (1L << (TYPE - 280)) | (1L << (TYPE_WARNING - 280)) | (1L << (UNBOUNDED - 280)) | (1L << (UNCOMMITTED - 280)) | (1L << (UNKNOWN - 280)) | (1L << (USING - 280)) | (1L << (VAR - 280)) | (1L << (VARP - 280)) | (1L << (VIEW_METADATA - 280)) | (1L << (WORK - 280)) | (1L << (XML - 280)) | (1L << (XMLNAMESPACES - 280)) | (1L << (DOUBLE_QUOTE_ID - 280)) | (1L << (SQUARE_BRACKET_ID - 280)) | (1L << (LOCAL_ID - 280)) | (1L << (DECIMAL - 280)) | (1L << (ID - 280)) | (1L << (STRING - 280)) | (1L << (BINARY - 280)) | (1L << (FLOAT - 280)) | (1L << (REAL - 280)) | (1L << (DOLLAR - 280)) | (1L << (LR_BRACKET - 280)) | (1L << (PLUS - 280)) | (1L << (MINUS - 280)) | (1L << (BIT_NOT - 280)))) != 0)) {
					{
					setState(2097);
					expression_list();
					}
				}

				setState(2100);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2102);
				match(BINARY_CHECKSUM);
				setState(2103);
				match(LR_BRACKET);
				setState(2104);
				match(STAR);
				setState(2105);
				match(RR_BRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2106);
				match(CAST);
				setState(2107);
				match(LR_BRACKET);
				setState(2108);
				expression(0);
				setState(2109);
				match(AS);
				setState(2110);
				data_type();
				setState(2111);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2113);
				match(CONVERT);
				setState(2114);
				match(LR_BRACKET);
				setState(2115);
				data_type();
				setState(2116);
				match(COMMA);
				setState(2117);
				expression(0);
				setState(2120);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2118);
					match(COMMA);
					setState(2119);
					((Function_callContext)_localctx).style = expression(0);
					}
				}

				setState(2122);
				match(RR_BRACKET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2124);
				match(CHECKSUM);
				setState(2125);
				match(LR_BRACKET);
				setState(2126);
				match(STAR);
				setState(2127);
				match(RR_BRACKET);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2128);
				match(COALESCE);
				setState(2129);
				match(LR_BRACKET);
				setState(2130);
				expression_list();
				setState(2131);
				match(RR_BRACKET);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2133);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2134);
				match(CURRENT_USER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2135);
				match(DATEADD);
				setState(2136);
				match(LR_BRACKET);
				setState(2137);
				datepart();
				setState(2138);
				match(COMMA);
				setState(2139);
				expression(0);
				setState(2140);
				match(COMMA);
				setState(2141);
				expression(0);
				setState(2142);
				match(RR_BRACKET);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2144);
				match(DATEDIFF);
				setState(2145);
				match(LR_BRACKET);
				setState(2146);
				datepart();
				setState(2147);
				match(COMMA);
				setState(2148);
				expression(0);
				setState(2149);
				match(COMMA);
				setState(2150);
				expression(0);
				setState(2151);
				match(RR_BRACKET);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2153);
				match(DATENAME);
				setState(2154);
				match(LR_BRACKET);
				setState(2155);
				datepart();
				setState(2156);
				match(COMMA);
				setState(2157);
				expression(0);
				setState(2158);
				match(RR_BRACKET);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2160);
				match(DATEPART);
				setState(2161);
				match(LR_BRACKET);
				setState(2162);
				datepart();
				setState(2163);
				match(COMMA);
				setState(2164);
				expression(0);
				setState(2165);
				match(RR_BRACKET);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2167);
				match(IDENTITY);
				setState(2168);
				match(LR_BRACKET);
				setState(2169);
				data_type();
				setState(2172);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2170);
					match(COMMA);
					setState(2171);
					((Function_callContext)_localctx).seed = match(DECIMAL);
					}
					break;
				}
				setState(2176);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2174);
					match(COMMA);
					setState(2175);
					((Function_callContext)_localctx).increment = match(DECIMAL);
					}
				}

				setState(2178);
				match(RR_BRACKET);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2180);
				match(MIN_ACTIVE_ROWVERSION);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2181);
				match(NULLIF);
				setState(2182);
				match(LR_BRACKET);
				setState(2183);
				expression(0);
				setState(2184);
				match(COMMA);
				setState(2185);
				expression(0);
				setState(2186);
				match(RR_BRACKET);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2188);
				match(SESSION_USER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2189);
				match(SYSTEM_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatepartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public DatepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datepart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDatepart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDatepart(this);
		}
	}

	public final DatepartContext datepart() throws RecognitionException {
		DatepartContext _localctx = new DatepartContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_datepart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class As_table_aliasContext extends ParserRuleContext {
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public As_table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAs_table_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAs_table_alias(this);
		}
	}

	public final As_table_aliasContext as_table_alias() throws RecognitionException {
		As_table_aliasContext _localctx = new As_table_aliasContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_as_table_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2194);
				match(AS);
				}
			}

			setState(2197);
			table_alias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_alias(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			id();
			setState(2201);
			switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
			case 1:
				{
				setState(2200);
				with_table_hints();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_table_hintsContext extends ParserRuleContext {
		public List<Table_hintContext> table_hint() {
			return getRuleContexts(Table_hintContext.class);
		}
		public Table_hintContext table_hint(int i) {
			return getRuleContext(Table_hintContext.class,i);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public With_table_hintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_table_hints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWith_table_hints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWith_table_hints(this);
		}
	}

	public final With_table_hintsContext with_table_hints() throws RecognitionException {
		With_table_hintsContext _localctx = new With_table_hintsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_with_table_hints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2203);
				match(WITH);
				}
			}

			setState(2206);
			match(LR_BRACKET);
			setState(2207);
			table_hint();
			setState(2212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2208);
				match(COMMA);
				setState(2209);
				table_hint();
				}
				}
				setState(2214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2215);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_hintContext extends ParserRuleContext {
		public TerminalNode NOEXPAND() { return getToken(tsqlParser.NOEXPAND, 0); }
		public TerminalNode INDEX() { return getToken(tsqlParser.INDEX, 0); }
		public List<Index_valueContext> index_value() {
			return getRuleContexts(Index_valueContext.class);
		}
		public Index_valueContext index_value(int i) {
			return getRuleContext(Index_valueContext.class,i);
		}
		public TerminalNode FORCESEEK() { return getToken(tsqlParser.FORCESEEK, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(tsqlParser.SERIALIZABLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(tsqlParser.SNAPSHOT, 0); }
		public TerminalNode SPATIAL_WINDOW_MAX_CELLS() { return getToken(tsqlParser.SPATIAL_WINDOW_MAX_CELLS, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public Table_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_hint(this);
		}
	}

	public final Table_hintContext table_hint() throws RecognitionException {
		Table_hintContext _localctx = new Table_hintContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_table_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			_la = _input.LA(1);
			if (_la==NOEXPAND) {
				{
				setState(2217);
				match(NOEXPAND);
				}
			}

			setState(2258);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				{
				setState(2220);
				match(INDEX);
				setState(2221);
				match(LR_BRACKET);
				setState(2222);
				index_value();
				setState(2227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2223);
					match(COMMA);
					setState(2224);
					index_value();
					}
					}
					setState(2229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2230);
				match(RR_BRACKET);
				}
				break;
			case 2:
				{
				setState(2232);
				match(INDEX);
				setState(2233);
				match(EQUAL);
				setState(2234);
				index_value();
				}
				break;
			case 3:
				{
				setState(2235);
				match(FORCESEEK);
				setState(2250);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(2236);
					match(LR_BRACKET);
					setState(2237);
					index_value();
					setState(2238);
					match(LR_BRACKET);
					setState(2239);
					index_column_name();
					setState(2244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2240);
						match(COMMA);
						setState(2241);
						index_column_name();
						}
						}
						setState(2246);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2247);
					match(RR_BRACKET);
					setState(2248);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case 4:
				{
				setState(2252);
				match(SERIALIZABLE);
				}
				break;
			case 5:
				{
				setState(2253);
				match(SNAPSHOT);
				}
				break;
			case 6:
				{
				setState(2254);
				match(SPATIAL_WINDOW_MAX_CELLS);
				setState(2255);
				match(EQUAL);
				setState(2256);
				match(DECIMAL);
				}
				break;
			case 7:
				{
				setState(2257);
				match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public Index_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterIndex_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitIndex_column_name(this);
		}
	}

	public final Index_column_nameContext index_column_name() throws RecognitionException {
		Index_column_nameContext _localctx = new Index_column_nameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_index_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Index_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterIndex_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitIndex_value(this);
		}
	}

	public final Index_valueContext index_value() throws RecognitionException {
		Index_valueContext _localctx = new Index_valueContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_index_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_alias_listContext extends ParserRuleContext {
		public List<Column_aliasContext> column_alias() {
			return getRuleContexts(Column_aliasContext.class);
		}
		public Column_aliasContext column_alias(int i) {
			return getRuleContext(Column_aliasContext.class,i);
		}
		public Column_alias_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_alias_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_alias_list(this);
		}
	}

	public final Column_alias_listContext column_alias_list() throws RecognitionException {
		Column_alias_listContext _localctx = new Column_alias_listContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_column_alias_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2264);
			match(LR_BRACKET);
			setState(2265);
			column_alias();
			setState(2270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2266);
				match(COMMA);
				setState(2267);
				column_alias();
				}
				}
				setState(2272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2273);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_alias(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_column_alias);
		try {
			setState(2277);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2275);
				id();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2276);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_value_constructorContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(tsqlParser.VALUES, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public Table_value_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_value_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_value_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_value_constructor(this);
		}
	}

	public final Table_value_constructorContext table_value_constructor() throws RecognitionException {
		Table_value_constructorContext _localctx = new Table_value_constructorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_table_value_constructor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
			match(VALUES);
			setState(2280);
			match(LR_BRACKET);
			setState(2281);
			expression_list();
			setState(2282);
			match(RR_BRACKET);
			setState(2290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2283);
					match(COMMA);
					setState(2284);
					match(LR_BRACKET);
					setState(2285);
					expression_list();
					setState(2286);
					match(RR_BRACKET);
					}
					} 
				}
				setState(2292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			expression(0);
			setState(2298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2294);
				match(COMMA);
				setState(2295);
				expression(0);
				}
				}
				setState(2300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_exprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(tsqlParser.CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode END() { return getToken(tsqlParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(tsqlParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(tsqlParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(tsqlParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(tsqlParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(tsqlParser.ELSE, 0); }
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCase_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCase_expr(this);
		}
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_case_expr);
		int _la;
		try {
			setState(2334);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2301);
				match(CASE);
				setState(2302);
				expression(0);
				setState(2308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2303);
					match(WHEN);
					setState(2304);
					expression(0);
					setState(2305);
					match(THEN);
					setState(2306);
					expression(0);
					}
					}
					setState(2310); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2314);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2312);
					match(ELSE);
					setState(2313);
					expression(0);
					}
				}

				setState(2316);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2318);
				match(CASE);
				setState(2324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2319);
					match(WHEN);
					setState(2320);
					search_condition();
					setState(2321);
					match(THEN);
					setState(2322);
					expression(0);
					}
					}
					setState(2326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2330);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2328);
					match(ELSE);
					setState(2329);
					expression(0);
					}
				}

				setState(2332);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ranking_windowed_functionContext extends ParserRuleContext {
		public TerminalNode RANK() { return getToken(tsqlParser.RANK, 0); }
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode DENSE_RANK() { return getToken(tsqlParser.DENSE_RANK, 0); }
		public TerminalNode NTILE() { return getToken(tsqlParser.NTILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROW_NUMBER() { return getToken(tsqlParser.ROW_NUMBER, 0); }
		public Ranking_windowed_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranking_windowed_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRanking_windowed_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRanking_windowed_function(this);
		}
	}

	public final Ranking_windowed_functionContext ranking_windowed_function() throws RecognitionException {
		Ranking_windowed_functionContext _localctx = new Ranking_windowed_functionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_ranking_windowed_function);
		try {
			setState(2354);
			switch (_input.LA(1)) {
			case RANK:
				enterOuterAlt(_localctx, 1);
				{
				setState(2336);
				match(RANK);
				setState(2337);
				match(LR_BRACKET);
				setState(2338);
				match(RR_BRACKET);
				setState(2339);
				over_clause();
				}
				break;
			case DENSE_RANK:
				enterOuterAlt(_localctx, 2);
				{
				setState(2340);
				match(DENSE_RANK);
				setState(2341);
				match(LR_BRACKET);
				setState(2342);
				match(RR_BRACKET);
				setState(2343);
				over_clause();
				}
				break;
			case NTILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2344);
				match(NTILE);
				setState(2345);
				match(LR_BRACKET);
				setState(2346);
				expression(0);
				setState(2347);
				match(RR_BRACKET);
				setState(2348);
				over_clause();
				}
				break;
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2350);
				match(ROW_NUMBER);
				setState(2351);
				match(LR_BRACKET);
				setState(2352);
				match(RR_BRACKET);
				setState(2353);
				over_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_windowed_functionContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(tsqlParser.AVG, 0); }
		public All_distinct_expressionContext all_distinct_expression() {
			return getRuleContext(All_distinct_expressionContext.class,0);
		}
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode CHECKSUM_AGG() { return getToken(tsqlParser.CHECKSUM_AGG, 0); }
		public TerminalNode GROUPING() { return getToken(tsqlParser.GROUPING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GROUPING_ID() { return getToken(tsqlParser.GROUPING_ID, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode MAX() { return getToken(tsqlParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(tsqlParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(tsqlParser.SUM, 0); }
		public TerminalNode STDEV() { return getToken(tsqlParser.STDEV, 0); }
		public TerminalNode STDEVP() { return getToken(tsqlParser.STDEVP, 0); }
		public TerminalNode VAR() { return getToken(tsqlParser.VAR, 0); }
		public TerminalNode VARP() { return getToken(tsqlParser.VARP, 0); }
		public TerminalNode COUNT() { return getToken(tsqlParser.COUNT, 0); }
		public TerminalNode COUNT_BIG() { return getToken(tsqlParser.COUNT_BIG, 0); }
		public Aggregate_windowed_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_windowed_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAggregate_windowed_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAggregate_windowed_function(this);
		}
	}

	public final Aggregate_windowed_functionContext aggregate_windowed_function() throws RecognitionException {
		Aggregate_windowed_functionContext _localctx = new Aggregate_windowed_functionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_aggregate_windowed_function);
		try {
			setState(2447);
			switch (_input.LA(1)) {
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2356);
				match(AVG);
				setState(2357);
				match(LR_BRACKET);
				setState(2358);
				all_distinct_expression();
				setState(2359);
				match(RR_BRACKET);
				setState(2361);
				switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
				case 1:
					{
					setState(2360);
					over_clause();
					}
					break;
				}
				}
				break;
			case CHECKSUM_AGG:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				match(CHECKSUM_AGG);
				setState(2364);
				match(LR_BRACKET);
				setState(2365);
				all_distinct_expression();
				setState(2366);
				match(RR_BRACKET);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 3);
				{
				setState(2368);
				match(GROUPING);
				setState(2369);
				match(LR_BRACKET);
				setState(2370);
				expression(0);
				setState(2371);
				match(RR_BRACKET);
				}
				break;
			case GROUPING_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(2373);
				match(GROUPING_ID);
				setState(2374);
				match(LR_BRACKET);
				setState(2375);
				expression_list();
				setState(2376);
				match(RR_BRACKET);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(2378);
				match(MAX);
				setState(2379);
				match(LR_BRACKET);
				setState(2380);
				all_distinct_expression();
				setState(2381);
				match(RR_BRACKET);
				setState(2383);
				switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
				case 1:
					{
					setState(2382);
					over_clause();
					}
					break;
				}
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(2385);
				match(MIN);
				setState(2386);
				match(LR_BRACKET);
				setState(2387);
				all_distinct_expression();
				setState(2388);
				match(RR_BRACKET);
				setState(2390);
				switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
				case 1:
					{
					setState(2389);
					over_clause();
					}
					break;
				}
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 7);
				{
				setState(2392);
				match(SUM);
				setState(2393);
				match(LR_BRACKET);
				setState(2394);
				all_distinct_expression();
				setState(2395);
				match(RR_BRACKET);
				setState(2397);
				switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
				case 1:
					{
					setState(2396);
					over_clause();
					}
					break;
				}
				}
				break;
			case STDEV:
				enterOuterAlt(_localctx, 8);
				{
				setState(2399);
				match(STDEV);
				setState(2400);
				match(LR_BRACKET);
				setState(2401);
				all_distinct_expression();
				setState(2402);
				match(RR_BRACKET);
				setState(2404);
				switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
				case 1:
					{
					setState(2403);
					over_clause();
					}
					break;
				}
				}
				break;
			case STDEVP:
				enterOuterAlt(_localctx, 9);
				{
				setState(2406);
				match(STDEVP);
				setState(2407);
				match(LR_BRACKET);
				setState(2408);
				all_distinct_expression();
				setState(2409);
				match(RR_BRACKET);
				setState(2411);
				switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
				case 1:
					{
					setState(2410);
					over_clause();
					}
					break;
				}
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(2413);
				match(VAR);
				setState(2414);
				match(LR_BRACKET);
				setState(2415);
				all_distinct_expression();
				setState(2416);
				match(RR_BRACKET);
				setState(2418);
				switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
				case 1:
					{
					setState(2417);
					over_clause();
					}
					break;
				}
				}
				break;
			case VARP:
				enterOuterAlt(_localctx, 11);
				{
				setState(2420);
				match(VARP);
				setState(2421);
				match(LR_BRACKET);
				setState(2422);
				all_distinct_expression();
				setState(2423);
				match(RR_BRACKET);
				setState(2425);
				switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
				case 1:
					{
					setState(2424);
					over_clause();
					}
					break;
				}
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 12);
				{
				setState(2427);
				match(COUNT);
				setState(2428);
				match(LR_BRACKET);
				setState(2431);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2429);
					match(STAR);
					}
					break;
				case ALL:
				case CASE:
				case COALESCE:
				case CONVERT:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DEFAULT:
				case DISTINCT:
				case FORCESEEK:
				case IDENTITY:
				case LEFT:
				case NULL:
				case NULLIF:
				case RIGHT:
				case SESSION_USER:
				case SYSTEM_USER:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case BINARY_CHECKSUM:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATEADD:
				case DATEDIFF:
				case DATENAME:
				case DATEPART:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MIN_ACTIVE_ROWVERSION:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
					{
					setState(2430);
					all_distinct_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2433);
				match(RR_BRACKET);
				setState(2435);
				switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
				case 1:
					{
					setState(2434);
					over_clause();
					}
					break;
				}
				}
				break;
			case COUNT_BIG:
				enterOuterAlt(_localctx, 13);
				{
				setState(2437);
				match(COUNT_BIG);
				setState(2438);
				match(LR_BRACKET);
				setState(2441);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2439);
					match(STAR);
					}
					break;
				case ALL:
				case CASE:
				case COALESCE:
				case CONVERT:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DEFAULT:
				case DISTINCT:
				case FORCESEEK:
				case IDENTITY:
				case LEFT:
				case NULL:
				case NULLIF:
				case RIGHT:
				case SESSION_USER:
				case SYSTEM_USER:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case BINARY_CHECKSUM:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATEADD:
				case DATEDIFF:
				case DATENAME:
				case DATEPART:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MIN_ACTIVE_ROWVERSION:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
					{
					setState(2440);
					all_distinct_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2443);
				match(RR_BRACKET);
				setState(2445);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(2444);
					over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_distinct_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(tsqlParser.DISTINCT, 0); }
		public All_distinct_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_distinct_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAll_distinct_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAll_distinct_expression(this);
		}
	}

	public final All_distinct_expressionContext all_distinct_expression() throws RecognitionException {
		All_distinct_expressionContext _localctx = new All_distinct_expressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_all_distinct_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(2449);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(2452);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Over_clauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(tsqlParser.OVER, 0); }
		public Partition_by_clauseContext partition_by_clause() {
			return getRuleContext(Partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Row_or_range_clauseContext row_or_range_clause() {
			return getRuleContext(Row_or_range_clauseContext.class,0);
		}
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOver_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOver_clause(this);
		}
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			match(OVER);
			setState(2455);
			match(LR_BRACKET);
			setState(2457);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2456);
				partition_by_clause();
				}
			}

			setState(2460);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(2459);
				order_by_clause();
				}
			}

			setState(2463);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(2462);
				row_or_range_clause();
				}
			}

			setState(2465);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_or_range_clauseContext extends ParserRuleContext {
		public Window_frame_extentContext window_frame_extent() {
			return getRuleContext(Window_frame_extentContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(tsqlParser.RANGE, 0); }
		public Row_or_range_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_or_range_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterRow_or_range_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitRow_or_range_clause(this);
		}
	}

	public final Row_or_range_clauseContext row_or_range_clause() throws RecognitionException {
		Row_or_range_clauseContext _localctx = new Row_or_range_clauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_row_or_range_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2467);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2468);
			window_frame_extent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_extentContext extends ParserRuleContext {
		public Window_frame_precedingContext window_frame_preceding() {
			return getRuleContext(Window_frame_precedingContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(tsqlParser.BETWEEN, 0); }
		public List<Window_frame_boundContext> window_frame_bound() {
			return getRuleContexts(Window_frame_boundContext.class);
		}
		public Window_frame_boundContext window_frame_bound(int i) {
			return getRuleContext(Window_frame_boundContext.class,i);
		}
		public TerminalNode AND() { return getToken(tsqlParser.AND, 0); }
		public Window_frame_extentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_extent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWindow_frame_extent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWindow_frame_extent(this);
		}
	}

	public final Window_frame_extentContext window_frame_extent() throws RecognitionException {
		Window_frame_extentContext _localctx = new Window_frame_extentContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_window_frame_extent);
		try {
			setState(2476);
			switch (_input.LA(1)) {
			case CURRENT:
			case UNBOUNDED:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2470);
				window_frame_preceding();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2471);
				match(BETWEEN);
				setState(2472);
				window_frame_bound();
				setState(2473);
				match(AND);
				setState(2474);
				window_frame_bound();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_boundContext extends ParserRuleContext {
		public Window_frame_precedingContext window_frame_preceding() {
			return getRuleContext(Window_frame_precedingContext.class,0);
		}
		public Window_frame_followingContext window_frame_following() {
			return getRuleContext(Window_frame_followingContext.class,0);
		}
		public Window_frame_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWindow_frame_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWindow_frame_bound(this);
		}
	}

	public final Window_frame_boundContext window_frame_bound() throws RecognitionException {
		Window_frame_boundContext _localctx = new Window_frame_boundContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_window_frame_bound);
		try {
			setState(2480);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2478);
				window_frame_preceding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2479);
				window_frame_following();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_precedingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(tsqlParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(tsqlParser.PRECEDING, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(tsqlParser.ROW, 0); }
		public Window_frame_precedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_preceding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWindow_frame_preceding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWindow_frame_preceding(this);
		}
	}

	public final Window_frame_precedingContext window_frame_preceding() throws RecognitionException {
		Window_frame_precedingContext _localctx = new Window_frame_precedingContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_window_frame_preceding);
		try {
			setState(2488);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2482);
				match(UNBOUNDED);
				setState(2483);
				match(PRECEDING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2484);
				match(DECIMAL);
				setState(2485);
				match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2486);
				match(CURRENT);
				setState(2487);
				match(ROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_followingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(tsqlParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(tsqlParser.FOLLOWING, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Window_frame_followingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_following; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterWindow_frame_following(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitWindow_frame_following(this);
		}
	}

	public final Window_frame_followingContext window_frame_following() throws RecognitionException {
		Window_frame_followingContext _localctx = new Window_frame_followingContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_window_frame_following);
		try {
			setState(2494);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2490);
				match(UNBOUNDED);
				setState(2491);
				match(FOLLOWING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2492);
				match(DECIMAL);
				setState(2493);
				match(FOLLOWING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_table_nameContext extends ParserRuleContext {
		public IdContext server;
		public IdContext database;
		public IdContext schema;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Full_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFull_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFull_table_name(this);
		}
	}

	public final Full_table_nameContext full_table_name() throws RecognitionException {
		Full_table_nameContext _localctx = new Full_table_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_full_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2513);
			switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
			case 1:
				{
				setState(2496);
				((Full_table_nameContext)_localctx).server = id();
				setState(2497);
				match(DOT);
				setState(2498);
				((Full_table_nameContext)_localctx).database = id();
				setState(2499);
				match(DOT);
				setState(2500);
				((Full_table_nameContext)_localctx).schema = id();
				setState(2501);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(2503);
				((Full_table_nameContext)_localctx).database = id();
				setState(2504);
				match(DOT);
				setState(2506);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ABSOLUTE - 188)) | (1L << (APPLY - 188)) | (1L << (AUTO - 188)) | (1L << (AVG - 188)) | (1L << (BASE64 - 188)) | (1L << (CALLER - 188)) | (1L << (CAST - 188)) | (1L << (CATCH - 188)) | (1L << (CHECKSUM_AGG - 188)) | (1L << (COMMITTED - 188)) | (1L << (CONCAT - 188)) | (1L << (COOKIE - 188)) | (1L << (COUNT - 188)) | (1L << (COUNT_BIG - 188)) | (1L << (DELAY - 188)) | (1L << (DELETED - 188)) | (1L << (DENSE_RANK - 188)) | (1L << (DISABLE - 188)) | (1L << (DYNAMIC - 188)) | (1L << (ENCRYPTION - 188)) | (1L << (FAST - 188)) | (1L << (FAST_FORWARD - 188)) | (1L << (FIRST - 188)) | (1L << (FOLLOWING - 188)) | (1L << (FORWARD_ONLY - 188)) | (1L << (FULLSCAN - 188)) | (1L << (GLOBAL - 188)) | (1L << (GO - 188)) | (1L << (GROUPING - 188)) | (1L << (GROUPING_ID - 188)) | (1L << (HASH - 188)) | (1L << (INSENSITIVE - 188)) | (1L << (INSERTED - 188)) | (1L << (ISOLATION - 188)) | (1L << (KEEPFIXED - 188)) | (1L << (KEYSET - 188)) | (1L << (LAST - 188)) | (1L << (LEVEL - 188)) | (1L << (LOCAL - 188)) | (1L << (LOCK_ESCALATION - 188)) | (1L << (LOGIN - 188)) | (1L << (LOOP - 188)) | (1L << (MARK - 188)) | (1L << (MAX - 188)) | (1L << (MIN - 188)) | (1L << (MODIFY - 188)) | (1L << (NEXT - 188)) | (1L << (NAME - 188)) | (1L << (NOCOUNT - 188)) | (1L << (NOEXPAND - 188)) | (1L << (NORECOMPUTE - 188)) | (1L << (NTILE - 188)) | (1L << (NUMBER - 188)) | (1L << (OFFSET - 188)) | (1L << (ONLY - 188)) | (1L << (OPTIMISTIC - 188)) | (1L << (OPTIMIZE - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (OUT - 252)) | (1L << (OUTPUT - 252)) | (1L << (OWNER - 252)) | (1L << (PARTITION - 252)) | (1L << (PATH - 252)) | (1L << (PRECEDING - 252)) | (1L << (PRIOR - 252)) | (1L << (RANGE - 252)) | (1L << (RANK - 252)) | (1L << (READONLY - 252)) | (1L << (READ_ONLY - 252)) | (1L << (RECOMPILE - 252)) | (1L << (RELATIVE - 252)) | (1L << (REMOTE - 252)) | (1L << (REPEATABLE - 252)) | (1L << (ROOT - 252)) | (1L << (ROW - 252)) | (1L << (ROWGUID - 252)) | (1L << (ROWS - 252)) | (1L << (ROW_NUMBER - 252)) | (1L << (SAMPLE - 252)) | (1L << (SCHEMABINDING - 252)) | (1L << (SCROLL - 252)) | (1L << (SCROLL_LOCKS - 252)) | (1L << (SELF - 252)) | (1L << (SERIALIZABLE - 252)) | (1L << (SNAPSHOT - 252)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 252)) | (1L << (STATIC - 252)) | (1L << (STATS_STREAM - 252)) | (1L << (STDEV - 252)) | (1L << (STDEVP - 252)) | (1L << (SUM - 252)) | (1L << (THROW - 252)) | (1L << (TIES - 252)) | (1L << (TIME - 252)) | (1L << (TRY - 252)) | (1L << (TYPE - 252)) | (1L << (TYPE_WARNING - 252)) | (1L << (UNBOUNDED - 252)) | (1L << (UNCOMMITTED - 252)) | (1L << (UNKNOWN - 252)) | (1L << (USING - 252)) | (1L << (VAR - 252)) | (1L << (VARP - 252)) | (1L << (VIEW_METADATA - 252)) | (1L << (WORK - 252)) | (1L << (XML - 252)) | (1L << (XMLNAMESPACES - 252)) | (1L << (DOUBLE_QUOTE_ID - 252)) | (1L << (SQUARE_BRACKET_ID - 252)) | (1L << (ID - 252)))) != 0)) {
					{
					setState(2505);
					((Full_table_nameContext)_localctx).schema = id();
					}
				}

				setState(2508);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(2510);
				((Full_table_nameContext)_localctx).schema = id();
				setState(2511);
				match(DOT);
				}
				break;
			}
			setState(2515);
			((Full_table_nameContext)_localctx).table = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdContext database;
		public IdContext schema;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2527);
			switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
			case 1:
				{
				setState(2517);
				((Table_nameContext)_localctx).database = id();
				setState(2518);
				match(DOT);
				setState(2520);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ABSOLUTE - 188)) | (1L << (APPLY - 188)) | (1L << (AUTO - 188)) | (1L << (AVG - 188)) | (1L << (BASE64 - 188)) | (1L << (CALLER - 188)) | (1L << (CAST - 188)) | (1L << (CATCH - 188)) | (1L << (CHECKSUM_AGG - 188)) | (1L << (COMMITTED - 188)) | (1L << (CONCAT - 188)) | (1L << (COOKIE - 188)) | (1L << (COUNT - 188)) | (1L << (COUNT_BIG - 188)) | (1L << (DELAY - 188)) | (1L << (DELETED - 188)) | (1L << (DENSE_RANK - 188)) | (1L << (DISABLE - 188)) | (1L << (DYNAMIC - 188)) | (1L << (ENCRYPTION - 188)) | (1L << (FAST - 188)) | (1L << (FAST_FORWARD - 188)) | (1L << (FIRST - 188)) | (1L << (FOLLOWING - 188)) | (1L << (FORWARD_ONLY - 188)) | (1L << (FULLSCAN - 188)) | (1L << (GLOBAL - 188)) | (1L << (GO - 188)) | (1L << (GROUPING - 188)) | (1L << (GROUPING_ID - 188)) | (1L << (HASH - 188)) | (1L << (INSENSITIVE - 188)) | (1L << (INSERTED - 188)) | (1L << (ISOLATION - 188)) | (1L << (KEEPFIXED - 188)) | (1L << (KEYSET - 188)) | (1L << (LAST - 188)) | (1L << (LEVEL - 188)) | (1L << (LOCAL - 188)) | (1L << (LOCK_ESCALATION - 188)) | (1L << (LOGIN - 188)) | (1L << (LOOP - 188)) | (1L << (MARK - 188)) | (1L << (MAX - 188)) | (1L << (MIN - 188)) | (1L << (MODIFY - 188)) | (1L << (NEXT - 188)) | (1L << (NAME - 188)) | (1L << (NOCOUNT - 188)) | (1L << (NOEXPAND - 188)) | (1L << (NORECOMPUTE - 188)) | (1L << (NTILE - 188)) | (1L << (NUMBER - 188)) | (1L << (OFFSET - 188)) | (1L << (ONLY - 188)) | (1L << (OPTIMISTIC - 188)) | (1L << (OPTIMIZE - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (OUT - 252)) | (1L << (OUTPUT - 252)) | (1L << (OWNER - 252)) | (1L << (PARTITION - 252)) | (1L << (PATH - 252)) | (1L << (PRECEDING - 252)) | (1L << (PRIOR - 252)) | (1L << (RANGE - 252)) | (1L << (RANK - 252)) | (1L << (READONLY - 252)) | (1L << (READ_ONLY - 252)) | (1L << (RECOMPILE - 252)) | (1L << (RELATIVE - 252)) | (1L << (REMOTE - 252)) | (1L << (REPEATABLE - 252)) | (1L << (ROOT - 252)) | (1L << (ROW - 252)) | (1L << (ROWGUID - 252)) | (1L << (ROWS - 252)) | (1L << (ROW_NUMBER - 252)) | (1L << (SAMPLE - 252)) | (1L << (SCHEMABINDING - 252)) | (1L << (SCROLL - 252)) | (1L << (SCROLL_LOCKS - 252)) | (1L << (SELF - 252)) | (1L << (SERIALIZABLE - 252)) | (1L << (SNAPSHOT - 252)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 252)) | (1L << (STATIC - 252)) | (1L << (STATS_STREAM - 252)) | (1L << (STDEV - 252)) | (1L << (STDEVP - 252)) | (1L << (SUM - 252)) | (1L << (THROW - 252)) | (1L << (TIES - 252)) | (1L << (TIME - 252)) | (1L << (TRY - 252)) | (1L << (TYPE - 252)) | (1L << (TYPE_WARNING - 252)) | (1L << (UNBOUNDED - 252)) | (1L << (UNCOMMITTED - 252)) | (1L << (UNKNOWN - 252)) | (1L << (USING - 252)) | (1L << (VAR - 252)) | (1L << (VARP - 252)) | (1L << (VIEW_METADATA - 252)) | (1L << (WORK - 252)) | (1L << (XML - 252)) | (1L << (XMLNAMESPACES - 252)) | (1L << (DOUBLE_QUOTE_ID - 252)) | (1L << (SQUARE_BRACKET_ID - 252)) | (1L << (ID - 252)))) != 0)) {
					{
					setState(2519);
					((Table_nameContext)_localctx).schema = id();
					}
				}

				setState(2522);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(2524);
				((Table_nameContext)_localctx).schema = id();
				setState(2525);
				match(DOT);
				}
				break;
			}
			setState(2529);
			((Table_nameContext)_localctx).table = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public IdContext schema;
		public IdContext view;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitView_name(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2534);
			switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
			case 1:
				{
				setState(2531);
				((View_nameContext)_localctx).schema = id();
				setState(2532);
				match(DOT);
				}
				break;
			}
			setState(2536);
			((View_nameContext)_localctx).view = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_proc_nameContext extends ParserRuleContext {
		public IdContext database;
		public IdContext schema;
		public IdContext procedure;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Func_proc_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_proc_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFunc_proc_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFunc_proc_name(this);
		}
	}

	public final Func_proc_nameContext func_proc_name() throws RecognitionException {
		Func_proc_nameContext _localctx = new Func_proc_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_func_proc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2548);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				{
				setState(2538);
				((Func_proc_nameContext)_localctx).database = id();
				setState(2539);
				match(DOT);
				setState(2541);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ABSOLUTE - 188)) | (1L << (APPLY - 188)) | (1L << (AUTO - 188)) | (1L << (AVG - 188)) | (1L << (BASE64 - 188)) | (1L << (CALLER - 188)) | (1L << (CAST - 188)) | (1L << (CATCH - 188)) | (1L << (CHECKSUM_AGG - 188)) | (1L << (COMMITTED - 188)) | (1L << (CONCAT - 188)) | (1L << (COOKIE - 188)) | (1L << (COUNT - 188)) | (1L << (COUNT_BIG - 188)) | (1L << (DELAY - 188)) | (1L << (DELETED - 188)) | (1L << (DENSE_RANK - 188)) | (1L << (DISABLE - 188)) | (1L << (DYNAMIC - 188)) | (1L << (ENCRYPTION - 188)) | (1L << (FAST - 188)) | (1L << (FAST_FORWARD - 188)) | (1L << (FIRST - 188)) | (1L << (FOLLOWING - 188)) | (1L << (FORWARD_ONLY - 188)) | (1L << (FULLSCAN - 188)) | (1L << (GLOBAL - 188)) | (1L << (GO - 188)) | (1L << (GROUPING - 188)) | (1L << (GROUPING_ID - 188)) | (1L << (HASH - 188)) | (1L << (INSENSITIVE - 188)) | (1L << (INSERTED - 188)) | (1L << (ISOLATION - 188)) | (1L << (KEEPFIXED - 188)) | (1L << (KEYSET - 188)) | (1L << (LAST - 188)) | (1L << (LEVEL - 188)) | (1L << (LOCAL - 188)) | (1L << (LOCK_ESCALATION - 188)) | (1L << (LOGIN - 188)) | (1L << (LOOP - 188)) | (1L << (MARK - 188)) | (1L << (MAX - 188)) | (1L << (MIN - 188)) | (1L << (MODIFY - 188)) | (1L << (NEXT - 188)) | (1L << (NAME - 188)) | (1L << (NOCOUNT - 188)) | (1L << (NOEXPAND - 188)) | (1L << (NORECOMPUTE - 188)) | (1L << (NTILE - 188)) | (1L << (NUMBER - 188)) | (1L << (OFFSET - 188)) | (1L << (ONLY - 188)) | (1L << (OPTIMISTIC - 188)) | (1L << (OPTIMIZE - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (OUT - 252)) | (1L << (OUTPUT - 252)) | (1L << (OWNER - 252)) | (1L << (PARTITION - 252)) | (1L << (PATH - 252)) | (1L << (PRECEDING - 252)) | (1L << (PRIOR - 252)) | (1L << (RANGE - 252)) | (1L << (RANK - 252)) | (1L << (READONLY - 252)) | (1L << (READ_ONLY - 252)) | (1L << (RECOMPILE - 252)) | (1L << (RELATIVE - 252)) | (1L << (REMOTE - 252)) | (1L << (REPEATABLE - 252)) | (1L << (ROOT - 252)) | (1L << (ROW - 252)) | (1L << (ROWGUID - 252)) | (1L << (ROWS - 252)) | (1L << (ROW_NUMBER - 252)) | (1L << (SAMPLE - 252)) | (1L << (SCHEMABINDING - 252)) | (1L << (SCROLL - 252)) | (1L << (SCROLL_LOCKS - 252)) | (1L << (SELF - 252)) | (1L << (SERIALIZABLE - 252)) | (1L << (SNAPSHOT - 252)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 252)) | (1L << (STATIC - 252)) | (1L << (STATS_STREAM - 252)) | (1L << (STDEV - 252)) | (1L << (STDEVP - 252)) | (1L << (SUM - 252)) | (1L << (THROW - 252)) | (1L << (TIES - 252)) | (1L << (TIME - 252)) | (1L << (TRY - 252)) | (1L << (TYPE - 252)) | (1L << (TYPE_WARNING - 252)) | (1L << (UNBOUNDED - 252)) | (1L << (UNCOMMITTED - 252)) | (1L << (UNKNOWN - 252)) | (1L << (USING - 252)) | (1L << (VAR - 252)) | (1L << (VARP - 252)) | (1L << (VIEW_METADATA - 252)) | (1L << (WORK - 252)) | (1L << (XML - 252)) | (1L << (XMLNAMESPACES - 252)) | (1L << (DOUBLE_QUOTE_ID - 252)) | (1L << (SQUARE_BRACKET_ID - 252)) | (1L << (ID - 252)))) != 0)) {
					{
					setState(2540);
					((Func_proc_nameContext)_localctx).schema = id();
					}
				}

				setState(2543);
				match(DOT);
				}
				break;
			case 2:
				{
				{
				setState(2545);
				((Func_proc_nameContext)_localctx).schema = id();
				}
				setState(2546);
				match(DOT);
				}
				break;
			}
			setState(2550);
			((Func_proc_nameContext)_localctx).procedure = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_objectContext extends ParserRuleContext {
		public Full_table_nameContext full_table_name() {
			return getRuleContext(Full_table_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Ddl_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDdl_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDdl_object(this);
		}
	}

	public final Ddl_objectContext ddl_object() throws RecognitionException {
		Ddl_objectContext _localctx = new Ddl_objectContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_ddl_object);
		try {
			setState(2554);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2552);
				full_table_name();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2553);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Full_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterFull_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitFull_column_name(this);
		}
	}

	public final Full_column_nameContext full_column_name() throws RecognitionException {
		Full_column_nameContext _localctx = new Full_column_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_full_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2559);
			switch ( getInterpreter().adaptivePredict(_input,393,_ctx) ) {
			case 1:
				{
				setState(2556);
				table_name();
				setState(2557);
				match(DOT);
				}
				break;
			}
			setState(2561);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_name_list(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2563);
			column_name();
			setState(2568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2564);
				match(COMMA);
				setState(2565);
				column_name();
				}
				}
				setState(2570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2571);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Cursor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterCursor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitCursor_name(this);
		}
	}

	public final Cursor_nameContext cursor_name() throws RecognitionException {
		Cursor_nameContext _localctx = new Cursor_nameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_cursor_name);
		try {
			setState(2575);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2573);
				id();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2574);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class On_offContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public On_offContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_off; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterOn_off(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitOn_off(this);
		}
	}

	public final On_offContext on_off() throws RecognitionException {
		On_offContext _localctx = new On_offContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_on_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2577);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusteredContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(tsqlParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(tsqlParser.NONCLUSTERED, 0); }
		public ClusteredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustered; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterClustered(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitClustered(this);
		}
	}

	public final ClusteredContext clustered() throws RecognitionException {
		ClusteredContext _localctx = new ClusteredContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_clustered);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2579);
			_la = _input.LA(1);
			if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_notnullContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public Null_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_notnull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterNull_notnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitNull_notnull(this);
		}
	}

	public final Null_notnullContext null_notnull() throws RecognitionException {
		Null_notnullContext _localctx = new Null_notnullContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2582);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2581);
				match(NOT);
				}
			}

			setState(2584);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_function_nameContext extends ParserRuleContext {
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(tsqlParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(tsqlParser.LEFT, 0); }
		public TerminalNode BINARY_CHECKSUM() { return getToken(tsqlParser.BINARY_CHECKSUM, 0); }
		public TerminalNode CHECKSUM() { return getToken(tsqlParser.CHECKSUM, 0); }
		public Scalar_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterScalar_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitScalar_function_name(this);
		}
	}

	public final Scalar_function_nameContext scalar_function_name() throws RecognitionException {
		Scalar_function_nameContext _localctx = new Scalar_function_nameContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_scalar_function_name);
		try {
			setState(2591);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2586);
				func_proc_name();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2587);
				match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2588);
				match(LEFT);
				}
				break;
			case BINARY_CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(2589);
				match(BINARY_CHECKSUM);
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(2590);
				match(CHECKSUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public TerminalNode MAX() { return getToken(tsqlParser.MAX, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2593);
			id();
			setState(2595);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				{
				setState(2594);
				match(IDENTITY);
				}
				break;
			}
			setState(2604);
			switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
			case 1:
				{
				setState(2597);
				match(LR_BRACKET);
				setState(2598);
				_la = _input.LA(1);
				if ( !(_la==MAX || _la==DECIMAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2601);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2599);
					match(COMMA);
					setState(2600);
					match(DECIMAL);
					}
				}

				setState(2603);
				match(RR_BRACKET);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitDefault_value(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_default_value);
		try {
			setState(2608);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2606);
				match(NULL);
				}
				break;
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2607);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode BINARY() { return getToken(tsqlParser.BINARY, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode REAL() { return getToken(tsqlParser.REAL, 0); }
		public TerminalNode FLOAT() { return getToken(tsqlParser.FLOAT, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_constant);
		int _la;
		try {
			setState(2622);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2610);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2611);
				match(BINARY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2612);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2614);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2613);
					sign();
					}
				}

				setState(2616);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==REAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2618);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2617);
					sign();
					}
				}

				setState(2620);
				match(DOLLAR);
				setState(2621);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(2624);
				sign();
				}
			}

			setState(2627);
			match(DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(tsqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(tsqlParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTE_ID() { return getToken(tsqlParser.DOUBLE_QUOTE_ID, 0); }
		public TerminalNode SQUARE_BRACKET_ID() { return getToken(tsqlParser.SQUARE_BRACKET_ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_id);
		try {
			setState(2634);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2631);
				simple_id();
				}
				break;
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2632);
				match(DOUBLE_QUOTE_ID);
				}
				break;
			case SQUARE_BRACKET_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(2633);
				match(SQUARE_BRACKET_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public TerminalNode ABSOLUTE() { return getToken(tsqlParser.ABSOLUTE, 0); }
		public TerminalNode APPLY() { return getToken(tsqlParser.APPLY, 0); }
		public TerminalNode AUTO() { return getToken(tsqlParser.AUTO, 0); }
		public TerminalNode AVG() { return getToken(tsqlParser.AVG, 0); }
		public TerminalNode BASE64() { return getToken(tsqlParser.BASE64, 0); }
		public TerminalNode CALLER() { return getToken(tsqlParser.CALLER, 0); }
		public TerminalNode CAST() { return getToken(tsqlParser.CAST, 0); }
		public TerminalNode CATCH() { return getToken(tsqlParser.CATCH, 0); }
		public TerminalNode CHECKSUM_AGG() { return getToken(tsqlParser.CHECKSUM_AGG, 0); }
		public TerminalNode COMMITTED() { return getToken(tsqlParser.COMMITTED, 0); }
		public TerminalNode CONCAT() { return getToken(tsqlParser.CONCAT, 0); }
		public TerminalNode COOKIE() { return getToken(tsqlParser.COOKIE, 0); }
		public TerminalNode COUNT() { return getToken(tsqlParser.COUNT, 0); }
		public TerminalNode COUNT_BIG() { return getToken(tsqlParser.COUNT_BIG, 0); }
		public TerminalNode DELAY() { return getToken(tsqlParser.DELAY, 0); }
		public TerminalNode DELETED() { return getToken(tsqlParser.DELETED, 0); }
		public TerminalNode DENSE_RANK() { return getToken(tsqlParser.DENSE_RANK, 0); }
		public TerminalNode DISABLE() { return getToken(tsqlParser.DISABLE, 0); }
		public TerminalNode DYNAMIC() { return getToken(tsqlParser.DYNAMIC, 0); }
		public TerminalNode ENCRYPTION() { return getToken(tsqlParser.ENCRYPTION, 0); }
		public TerminalNode FAST() { return getToken(tsqlParser.FAST, 0); }
		public TerminalNode FAST_FORWARD() { return getToken(tsqlParser.FAST_FORWARD, 0); }
		public TerminalNode FIRST() { return getToken(tsqlParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(tsqlParser.FOLLOWING, 0); }
		public TerminalNode FORCESEEK() { return getToken(tsqlParser.FORCESEEK, 0); }
		public TerminalNode FORWARD_ONLY() { return getToken(tsqlParser.FORWARD_ONLY, 0); }
		public TerminalNode FULLSCAN() { return getToken(tsqlParser.FULLSCAN, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode GO() { return getToken(tsqlParser.GO, 0); }
		public TerminalNode GROUPING() { return getToken(tsqlParser.GROUPING, 0); }
		public TerminalNode GROUPING_ID() { return getToken(tsqlParser.GROUPING_ID, 0); }
		public TerminalNode HASH() { return getToken(tsqlParser.HASH, 0); }
		public TerminalNode INSENSITIVE() { return getToken(tsqlParser.INSENSITIVE, 0); }
		public TerminalNode INSERTED() { return getToken(tsqlParser.INSERTED, 0); }
		public TerminalNode ISOLATION() { return getToken(tsqlParser.ISOLATION, 0); }
		public TerminalNode KEYSET() { return getToken(tsqlParser.KEYSET, 0); }
		public TerminalNode KEEPFIXED() { return getToken(tsqlParser.KEEPFIXED, 0); }
		public TerminalNode LAST() { return getToken(tsqlParser.LAST, 0); }
		public TerminalNode LEVEL() { return getToken(tsqlParser.LEVEL, 0); }
		public TerminalNode LOCAL() { return getToken(tsqlParser.LOCAL, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(tsqlParser.LOCK_ESCALATION, 0); }
		public TerminalNode LOGIN() { return getToken(tsqlParser.LOGIN, 0); }
		public TerminalNode LOOP() { return getToken(tsqlParser.LOOP, 0); }
		public TerminalNode MARK() { return getToken(tsqlParser.MARK, 0); }
		public TerminalNode MAX() { return getToken(tsqlParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(tsqlParser.MIN, 0); }
		public TerminalNode MODIFY() { return getToken(tsqlParser.MODIFY, 0); }
		public TerminalNode NAME() { return getToken(tsqlParser.NAME, 0); }
		public TerminalNode NEXT() { return getToken(tsqlParser.NEXT, 0); }
		public TerminalNode NOCOUNT() { return getToken(tsqlParser.NOCOUNT, 0); }
		public TerminalNode NOEXPAND() { return getToken(tsqlParser.NOEXPAND, 0); }
		public TerminalNode NORECOMPUTE() { return getToken(tsqlParser.NORECOMPUTE, 0); }
		public TerminalNode NTILE() { return getToken(tsqlParser.NTILE, 0); }
		public TerminalNode NUMBER() { return getToken(tsqlParser.NUMBER, 0); }
		public TerminalNode OFFSET() { return getToken(tsqlParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode OPTIMISTIC() { return getToken(tsqlParser.OPTIMISTIC, 0); }
		public TerminalNode OPTIMIZE() { return getToken(tsqlParser.OPTIMIZE, 0); }
		public TerminalNode OUT() { return getToken(tsqlParser.OUT, 0); }
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public TerminalNode OWNER() { return getToken(tsqlParser.OWNER, 0); }
		public TerminalNode PARTITION() { return getToken(tsqlParser.PARTITION, 0); }
		public TerminalNode PATH() { return getToken(tsqlParser.PATH, 0); }
		public TerminalNode PRECEDING() { return getToken(tsqlParser.PRECEDING, 0); }
		public TerminalNode PRIOR() { return getToken(tsqlParser.PRIOR, 0); }
		public TerminalNode RANGE() { return getToken(tsqlParser.RANGE, 0); }
		public TerminalNode RANK() { return getToken(tsqlParser.RANK, 0); }
		public TerminalNode READONLY() { return getToken(tsqlParser.READONLY, 0); }
		public TerminalNode READ_ONLY() { return getToken(tsqlParser.READ_ONLY, 0); }
		public TerminalNode RECOMPILE() { return getToken(tsqlParser.RECOMPILE, 0); }
		public TerminalNode RELATIVE() { return getToken(tsqlParser.RELATIVE, 0); }
		public TerminalNode REMOTE() { return getToken(tsqlParser.REMOTE, 0); }
		public TerminalNode REPEATABLE() { return getToken(tsqlParser.REPEATABLE, 0); }
		public TerminalNode ROOT() { return getToken(tsqlParser.ROOT, 0); }
		public TerminalNode ROW() { return getToken(tsqlParser.ROW, 0); }
		public TerminalNode ROWGUID() { return getToken(tsqlParser.ROWGUID, 0); }
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(tsqlParser.ROW_NUMBER, 0); }
		public TerminalNode SAMPLE() { return getToken(tsqlParser.SAMPLE, 0); }
		public TerminalNode SCHEMABINDING() { return getToken(tsqlParser.SCHEMABINDING, 0); }
		public TerminalNode SCROLL() { return getToken(tsqlParser.SCROLL, 0); }
		public TerminalNode SCROLL_LOCKS() { return getToken(tsqlParser.SCROLL_LOCKS, 0); }
		public TerminalNode SELF() { return getToken(tsqlParser.SELF, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(tsqlParser.SERIALIZABLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(tsqlParser.SNAPSHOT, 0); }
		public TerminalNode SPATIAL_WINDOW_MAX_CELLS() { return getToken(tsqlParser.SPATIAL_WINDOW_MAX_CELLS, 0); }
		public TerminalNode STATIC() { return getToken(tsqlParser.STATIC, 0); }
		public TerminalNode STATS_STREAM() { return getToken(tsqlParser.STATS_STREAM, 0); }
		public TerminalNode STDEV() { return getToken(tsqlParser.STDEV, 0); }
		public TerminalNode STDEVP() { return getToken(tsqlParser.STDEVP, 0); }
		public TerminalNode SUM() { return getToken(tsqlParser.SUM, 0); }
		public TerminalNode THROW() { return getToken(tsqlParser.THROW, 0); }
		public TerminalNode TIES() { return getToken(tsqlParser.TIES, 0); }
		public TerminalNode TIME() { return getToken(tsqlParser.TIME, 0); }
		public TerminalNode TRY() { return getToken(tsqlParser.TRY, 0); }
		public TerminalNode TYPE() { return getToken(tsqlParser.TYPE, 0); }
		public TerminalNode TYPE_WARNING() { return getToken(tsqlParser.TYPE_WARNING, 0); }
		public TerminalNode UNBOUNDED() { return getToken(tsqlParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(tsqlParser.UNCOMMITTED, 0); }
		public TerminalNode UNKNOWN() { return getToken(tsqlParser.UNKNOWN, 0); }
		public TerminalNode USING() { return getToken(tsqlParser.USING, 0); }
		public TerminalNode VAR() { return getToken(tsqlParser.VAR, 0); }
		public TerminalNode VARP() { return getToken(tsqlParser.VARP, 0); }
		public TerminalNode VIEW_METADATA() { return getToken(tsqlParser.VIEW_METADATA, 0); }
		public TerminalNode WORK() { return getToken(tsqlParser.WORK, 0); }
		public TerminalNode XML() { return getToken(tsqlParser.XML, 0); }
		public TerminalNode XMLNAMESPACES() { return getToken(tsqlParser.XMLNAMESPACES, 0); }
		public Simple_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterSimple_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitSimple_id(this);
		}
	}

	public final Simple_idContext simple_id() throws RecognitionException {
		Simple_idContext _localctx = new Simple_idContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_simple_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2636);
			_la = _input.LA(1);
			if ( !(_la==FORCESEEK || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ABSOLUTE - 188)) | (1L << (APPLY - 188)) | (1L << (AUTO - 188)) | (1L << (AVG - 188)) | (1L << (BASE64 - 188)) | (1L << (CALLER - 188)) | (1L << (CAST - 188)) | (1L << (CATCH - 188)) | (1L << (CHECKSUM_AGG - 188)) | (1L << (COMMITTED - 188)) | (1L << (CONCAT - 188)) | (1L << (COOKIE - 188)) | (1L << (COUNT - 188)) | (1L << (COUNT_BIG - 188)) | (1L << (DELAY - 188)) | (1L << (DELETED - 188)) | (1L << (DENSE_RANK - 188)) | (1L << (DISABLE - 188)) | (1L << (DYNAMIC - 188)) | (1L << (ENCRYPTION - 188)) | (1L << (FAST - 188)) | (1L << (FAST_FORWARD - 188)) | (1L << (FIRST - 188)) | (1L << (FOLLOWING - 188)) | (1L << (FORWARD_ONLY - 188)) | (1L << (FULLSCAN - 188)) | (1L << (GLOBAL - 188)) | (1L << (GO - 188)) | (1L << (GROUPING - 188)) | (1L << (GROUPING_ID - 188)) | (1L << (HASH - 188)) | (1L << (INSENSITIVE - 188)) | (1L << (INSERTED - 188)) | (1L << (ISOLATION - 188)) | (1L << (KEEPFIXED - 188)) | (1L << (KEYSET - 188)) | (1L << (LAST - 188)) | (1L << (LEVEL - 188)) | (1L << (LOCAL - 188)) | (1L << (LOCK_ESCALATION - 188)) | (1L << (LOGIN - 188)) | (1L << (LOOP - 188)) | (1L << (MARK - 188)) | (1L << (MAX - 188)) | (1L << (MIN - 188)) | (1L << (MODIFY - 188)) | (1L << (NEXT - 188)) | (1L << (NAME - 188)) | (1L << (NOCOUNT - 188)) | (1L << (NOEXPAND - 188)) | (1L << (NORECOMPUTE - 188)) | (1L << (NTILE - 188)) | (1L << (NUMBER - 188)) | (1L << (OFFSET - 188)) | (1L << (ONLY - 188)) | (1L << (OPTIMISTIC - 188)) | (1L << (OPTIMIZE - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (OUT - 252)) | (1L << (OUTPUT - 252)) | (1L << (OWNER - 252)) | (1L << (PARTITION - 252)) | (1L << (PATH - 252)) | (1L << (PRECEDING - 252)) | (1L << (PRIOR - 252)) | (1L << (RANGE - 252)) | (1L << (RANK - 252)) | (1L << (READONLY - 252)) | (1L << (READ_ONLY - 252)) | (1L << (RECOMPILE - 252)) | (1L << (RELATIVE - 252)) | (1L << (REMOTE - 252)) | (1L << (REPEATABLE - 252)) | (1L << (ROOT - 252)) | (1L << (ROW - 252)) | (1L << (ROWGUID - 252)) | (1L << (ROWS - 252)) | (1L << (ROW_NUMBER - 252)) | (1L << (SAMPLE - 252)) | (1L << (SCHEMABINDING - 252)) | (1L << (SCROLL - 252)) | (1L << (SCROLL_LOCKS - 252)) | (1L << (SELF - 252)) | (1L << (SERIALIZABLE - 252)) | (1L << (SNAPSHOT - 252)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 252)) | (1L << (STATIC - 252)) | (1L << (STATS_STREAM - 252)) | (1L << (STDEV - 252)) | (1L << (STDEVP - 252)) | (1L << (SUM - 252)) | (1L << (THROW - 252)) | (1L << (TIES - 252)) | (1L << (TIME - 252)) | (1L << (TRY - 252)) | (1L << (TYPE - 252)) | (1L << (TYPE_WARNING - 252)) | (1L << (UNBOUNDED - 252)) | (1L << (UNCOMMITTED - 252)) | (1L << (UNKNOWN - 252)) | (1L << (USING - 252)) | (1L << (VAR - 252)) | (1L << (VARP - 252)) | (1L << (VIEW_METADATA - 252)) | (1L << (WORK - 252)) | (1L << (XML - 252)) | (1L << (XMLNAMESPACES - 252)) | (1L << (ID - 252)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitComparison_operator(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_comparison_operator);
		try {
			setState(2653);
			switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2638);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2639);
				match(GREATER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2640);
				match(LESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2641);
				match(LESS);
				setState(2642);
				match(EQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2643);
				match(GREATER);
				setState(2644);
				match(EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2645);
				match(LESS);
				setState(2646);
				match(GREATER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2647);
				match(EXCLAMATION);
				setState(2648);
				match(EQUAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2649);
				match(EXCLAMATION);
				setState(2650);
				match(GREATER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2651);
				match(EXCLAMATION);
				setState(2652);
				match(LESS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tsqlListener ) ((tsqlListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			_la = _input.LA(1);
			if ( !(((((_la - 318)) & ~0x3f) == 0 && ((1L << (_la - 318)) & ((1L << (PLUS_ASSIGN - 318)) | (1L << (MINUS_ASSIGN - 318)) | (1L << (MULT_ASSIGN - 318)) | (1L << (DIV_ASSIGN - 318)) | (1L << (MOD_ASSIGN - 318)) | (1L << (AND_ASSIGN - 318)) | (1L << (XOR_ASSIGN - 318)) | (1L << (OR_ASSIGN - 318)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 55:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u015a\u0a64\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\3\2\7\2\u0110\n\2\f\2\16\2\u0113"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u011b\n\3\3\4\3\4\3\4\3\4\5\4\u0121"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u012f\n\5\3\6"+
		"\3\6\5\6\u0133\n\6\3\6\7\6\u0136\n\6\f\6\16\6\u0139\13\6\3\6\3\6\5\6\u013d"+
		"\n\6\3\6\3\6\5\6\u0141\n\6\3\6\3\6\5\6\u0145\n\6\3\6\3\6\3\6\5\6\u014a"+
		"\n\6\3\6\3\6\3\6\5\6\u014f\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0156\n\6\3\6\5"+
		"\6\u0159\n\6\3\6\3\6\5\6\u015d\n\6\3\6\5\6\u0160\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0168\n\6\3\6\5\6\u016b\n\6\3\6\3\6\3\6\5\6\u0170\n\6\3\6\7"+
		"\6\u0173\n\6\f\6\16\6\u0176\13\6\3\6\3\6\3\6\5\6\u017b\n\6\3\6\3\6\3\6"+
		"\5\6\u0180\n\6\3\6\7\6\u0183\n\6\f\6\16\6\u0186\13\6\3\6\3\6\3\6\5\6\u018b"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u0191\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0198\n\6\3"+
		"\6\3\6\5\6\u019c\n\6\5\6\u019e\n\6\3\6\3\6\3\6\5\6\u01a3\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u01ab\n\6\3\6\3\6\3\6\5\6\u01b0\n\6\3\6\3\6\3\6\5\6"+
		"\u01b5\n\6\7\6\u01b7\n\6\f\6\16\6\u01ba\13\6\3\6\3\6\5\6\u01be\n\6\5\6"+
		"\u01c0\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01ca\n\7\3\b\5\b\u01cd"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01d5\n\b\5\b\u01d7\n\b\3\b\5\b\u01da"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u01e0\n\b\3\b\5\b\u01e3\n\b\3\b\5\b\u01e6\n\b"+
		"\3\b\3\b\3\b\3\b\7\b\u01ec\n\b\f\b\16\b\u01ef\13\b\5\b\u01f1\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u01f8\n\b\3\b\3\b\5\b\u01fc\n\b\5\b\u01fe\n\b\5\b\u0200"+
		"\n\b\3\b\5\b\u0203\n\b\3\b\5\b\u0206\n\b\3\b\5\b\u0209\n\b\3\t\5\t\u020c"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0214\n\t\5\t\u0216\n\t\3\t\5\t\u0219"+
		"\n\t\3\t\3\t\5\t\u021d\n\t\3\t\5\t\u0220\n\t\3\t\3\t\3\t\3\t\5\t\u0226"+
		"\n\t\3\t\5\t\u0229\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0234\n"+
		"\t\f\t\16\t\u0237\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u023e\n\t\3\t\5\t\u0241"+
		"\n\t\3\t\5\t\u0244\n\t\3\t\5\t\u0247\n\t\3\n\5\n\u024a\n\n\3\n\3\n\5\n"+
		"\u024e\n\n\3\n\5\n\u0251\n\n\3\n\5\n\u0254\n\n\3\n\5\n\u0257\n\n\3\13"+
		"\5\13\u025a\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0262\n\13\5\13\u0264"+
		"\n\13\3\13\3\13\5\13\u0268\n\13\3\13\5\13\u026b\n\13\3\13\3\13\3\13\3"+
		"\13\7\13\u0271\n\13\f\13\16\13\u0274\13\13\3\13\5\13\u0277\n\13\3\13\3"+
		"\13\3\13\3\13\7\13\u027d\n\13\f\13\16\13\u0280\13\13\5\13\u0282\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0289\n\13\3\13\3\13\5\13\u028d\n\13\5\13"+
		"\u028f\n\13\5\13\u0291\n\13\3\13\5\13\u0294\n\13\3\13\5\13\u0297\n\13"+
		"\3\13\5\13\u029a\n\13\3\f\3\f\3\f\3\f\7\f\u02a0\n\f\f\f\16\f\u02a3\13"+
		"\f\3\f\3\f\3\f\5\f\u02a8\n\f\3\f\3\f\3\f\3\f\5\f\u02ae\n\f\5\f\u02b0\n"+
		"\f\3\r\3\r\5\r\u02b4\n\r\3\r\5\r\u02b7\n\r\3\r\5\r\u02ba\n\r\3\16\3\16"+
		"\3\16\5\16\u02bf\n\16\3\16\3\16\3\16\5\16\u02c4\n\16\3\16\5\16\u02c7\n"+
		"\16\3\17\3\17\5\17\u02cb\n\17\3\17\5\17\u02ce\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u02d8\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u02df"+
		"\n\20\3\20\5\20\u02e2\n\20\3\20\3\20\3\20\7\20\u02e7\n\20\f\20\16\20\u02ea"+
		"\13\20\3\20\5\20\u02ed\n\20\5\20\u02ef\n\20\3\20\3\20\3\20\3\20\7\20\u02f5"+
		"\n\20\f\20\16\20\u02f8\13\20\5\20\u02fa\n\20\3\20\3\20\5\20\u02fe\n\20"+
		"\3\20\3\20\6\20\u0302\n\20\r\20\16\20\u0303\3\21\3\21\3\21\3\21\5\21\u030a"+
		"\n\21\3\21\5\21\u030d\n\21\3\21\3\21\5\21\u0311\n\21\3\21\3\21\5\21\u0315"+
		"\n\21\3\21\5\21\u0318\n\21\3\22\3\22\3\22\5\22\u031d\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u032d"+
		"\n\23\3\23\3\23\5\23\u0331\n\23\3\23\3\23\5\23\u0335\n\23\5\23\u0337\n"+
		"\23\3\23\5\23\u033a\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0342\n\24"+
		"\3\24\7\24\u0345\n\24\f\24\16\24\u0348\13\24\3\24\5\24\u034b\n\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0351\n\24\3\24\5\24\u0354\n\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\7\25\u035d\n\25\f\25\16\25\u0360\13\25\3\25\3\25\5"+
		"\25\u0364\n\25\3\25\3\25\3\25\3\25\7\25\u036a\n\25\f\25\16\25\u036d\13"+
		"\25\5\25\u036f\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u0376\n\25\3\25\5\25"+
		"\u0379\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0387\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u038f\n\27\5\27\u0391"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u0397\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u03a1\n\30\3\30\5\30\u03a4\n\30\3\31\3\31\3\31\5\31\u03a9"+
		"\n\31\3\32\3\32\3\32\3\32\5\32\u03af\n\32\3\32\3\32\5\32\u03b3\n\32\3"+
		"\33\3\33\3\33\3\33\5\33\u03b9\n\33\3\33\3\33\5\33\u03bd\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u03c4\n\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35"+
		"\u03cd\n\35\3\35\3\35\5\35\u03d1\n\35\3\36\3\36\3\36\3\36\5\36\u03d7\n"+
		"\36\3\36\3\36\3\36\7\36\u03dc\n\36\f\36\16\36\u03df\13\36\3\36\5\36\u03e2"+
		"\n\36\3\37\3\37\5\37\u03e6\n\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\5!\u03f7\n!\3!\3!\5!\u03fb\n!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u0404"+
		"\n\"\f\"\16\"\u0407\13\"\3\"\5\"\u040a\n\"\3\"\3\"\3\"\5\"\u040f\n\"\3"+
		"\"\3\"\5\"\u0413\n\"\5\"\u0415\n\"\3#\3#\5#\u0419\n#\3#\3#\5#\u041d\n"+
		"#\3#\3#\5#\u0421\n#\3#\3#\5#\u0425\n#\3#\3#\3#\3#\5#\u042b\n#\3#\3#\5"+
		"#\u042f\n#\5#\u0431\n#\3$\3$\3$\5$\u0436\n$\3$\3$\3$\3$\7$\u043c\n$\f"+
		"$\16$\u043f\13$\5$\u0441\n$\3$\5$\u0444\n$\3$\3$\3$\3$\3$\7$\u044b\n$"+
		"\f$\16$\u044e\13$\3$\3$\5$\u0452\n$\3$\3$\3$\5$\u0457\n$\3$\5$\u045a\n"+
		"$\5$\u045c\n$\3%\3%\5%\u0460\n%\3%\3%\3%\5%\u0465\n%\3%\3%\5%\u0469\n"+
		"%\3&\3&\3\'\3\'\5\'\u046f\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0478\n"+
		"\'\3\'\5\'\u047b\n\'\5\'\u047d\n\'\3(\3(\3(\3(\5(\u0483\n(\3(\3(\3(\5"+
		"(\u0488\n(\3(\3(\3(\3(\3(\5(\u048f\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\5(\u049c\n(\5(\u049e\n(\5(\u04a0\n(\3(\5(\u04a3\n(\3(\5(\u04a6\n(\3"+
		")\3)\3)\3)\3)\5)\u04ad\n)\3)\5)\u04b0\n)\3)\3)\3)\3)\5)\u04b6\n)\3)\3"+
		")\3)\5)\u04bb\n)\5)\u04bd\n)\3)\5)\u04c0\n)\3)\3)\3)\3)\5)\u04c6\n)\3"+
		")\3)\3)\3)\5)\u04cc\n)\5)\u04ce\n)\3)\5)\u04d1\n)\3)\3)\5)\u04d5\n)\3"+
		")\5)\u04d8\n)\3)\3)\3)\3)\5)\u04de\n)\3)\5)\u04e1\n)\3)\3)\5)\u04e5\n"+
		")\3)\5)\u04e8\n)\3)\3)\3)\3)\5)\u04ee\n)\3)\5)\u04f1\n)\5)\u04f3\n)\3"+
		"*\3*\5*\u04f7\n*\3+\3+\3+\5+\u04fc\n+\3,\3,\3,\3,\3-\3-\5-\u0504\n-\3"+
		"-\3-\3-\5-\u0509\n-\3.\3.\3.\3.\5.\u050f\n.\3.\7.\u0512\n.\f.\16.\u0515"+
		"\13.\3.\3.\3/\3/\5/\u051b\n/\3\60\3\60\3\60\3\60\5\60\u0521\n\60\3\60"+
		"\3\60\5\60\u0525\n\60\3\60\5\60\u0528\n\60\3\60\3\60\5\60\u052c\n\60\3"+
		"\60\3\60\3\60\3\60\5\60\u0532\n\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u053a\n\60\3\60\3\60\3\60\5\60\u053f\n\60\5\60\u0541\n\60\3\60\5\60\u0544"+
		"\n\60\3\60\7\60\u0547\n\60\f\60\16\60\u054a\13\60\3\61\3\61\5\61\u054e"+
		"\n\61\3\61\5\61\u0551\n\61\3\61\3\61\3\61\5\61\u0556\n\61\3\61\5\61\u0559"+
		"\n\61\3\61\5\61\u055c\n\61\3\61\3\61\3\61\3\61\5\61\u0562\n\61\3\61\3"+
		"\61\3\61\3\61\5\61\u0568\n\61\3\62\3\62\5\62\u056c\n\62\3\62\3\62\3\62"+
		"\5\62\u0571\n\62\3\62\5\62\u0574\n\62\3\62\3\62\3\62\3\62\5\62\u057a\n"+
		"\62\3\62\3\62\5\62\u057e\n\62\3\62\3\62\3\62\3\62\5\62\u0584\n\62\3\62"+
		"\3\62\3\62\3\62\5\62\u058a\n\62\3\63\3\63\3\63\3\63\3\63\7\63\u0591\n"+
		"\63\f\63\16\63\u0594\13\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64\u059d"+
		"\n\64\3\65\3\65\3\65\3\65\5\65\u05a3\n\65\3\65\3\65\3\65\5\65\u05a8\n"+
		"\65\3\65\5\65\u05ab\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u05b6\n\65\5\65\u05b8\n\65\3\65\5\65\u05bb\n\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\5\65\u05c5\n\65\5\65\u05c7\n\65\3\65\5\65\u05ca"+
		"\n\65\5\65\u05cc\n\65\3\66\5\66\u05cf\n\66\3\66\5\66\u05d2\n\66\3\66\5"+
		"\66\u05d5\n\66\3\66\5\66\u05d8\n\66\3\66\5\66\u05db\n\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u05e9\n\67\3\67\5\67"+
		"\u05ec\n\67\3\67\5\67\u05ef\n\67\3\67\3\67\3\67\3\67\3\67\7\67\u05f6\n"+
		"\67\f\67\16\67\u05f9\13\67\5\67\u05fb\n\67\3\67\5\67\u05fe\n\67\38\38"+
		"\38\38\38\38\58\u0606\n8\38\58\u0609\n8\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\58\u0617\n8\38\58\u061a\n8\38\38\38\38\38\58\u0621\n8\58\u0623"+
		"\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0639"+
		"\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\79\u0648\n9\f9\169\u064b\13"+
		"9\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0655\n:\3;\3;\3<\3<\3=\3=\3=\5=\u065e\n"+
		"=\3=\3=\3=\7=\u0663\n=\f=\16=\u0666\13=\3>\3>\3>\3>\3>\5>\u066d\n>\3>"+
		"\3>\3>\3>\3>\3?\3?\5?\u0676\n?\3?\3?\5?\u067a\n?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\5?\u0684\n?\3@\3@\3@\7@\u0689\n@\f@\16@\u068c\13@\3A\3A\3A\7A\u0691"+
		"\nA\fA\16A\u0694\13A\3B\3B\3B\7B\u0699\nB\fB\16B\u069c\13B\3C\5C\u069f"+
		"\nC\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u06b5"+
		"\nD\3D\3D\3D\3D\3D\3D\3D\5D\u06be\nD\3D\3D\3D\3D\5D\u06c4\nD\3D\3D\3D"+
		"\3D\5D\u06ca\nD\3D\3D\3D\3D\5D\u06d0\nD\3D\3D\3D\3D\3D\3D\3D\3D\5D\u06da"+
		"\nD\3E\3E\3E\3E\3E\5E\u06e1\nE\3E\7E\u06e4\nE\fE\16E\u06e7\13E\3F\3F\5"+
		"F\u06eb\nF\3F\3F\5F\u06ef\nF\3F\3F\3F\3F\3F\6F\u06f6\nF\rF\16F\u06f7\5"+
		"F\u06fa\nF\3G\3G\5G\u06fe\nG\3G\3G\3G\5G\u0703\nG\3G\3G\5G\u0707\nG\5"+
		"G\u0709\nG\3G\3G\3G\5G\u070e\nG\3G\3G\3G\3G\7G\u0714\nG\fG\16G\u0717\13"+
		"G\5G\u0719\nG\3G\3G\5G\u071d\nG\3G\3G\3G\3G\3G\7G\u0724\nG\fG\16G\u0727"+
		"\13G\5G\u0729\nG\3G\3G\5G\u072d\nG\3H\3H\3H\3H\3H\7H\u0734\nH\fH\16H\u0737"+
		"\13H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0742\nH\5H\u0744\nH\3I\3I\3I\3I\3"+
		"I\3I\5I\u074c\nI\3I\3I\3I\3I\3I\3I\5I\u0754\nI\3I\5I\u0757\nI\5I\u0759"+
		"\nI\3J\3J\3J\3J\3J\5J\u0760\nJ\3K\3K\5K\u0764\nK\3L\3L\3M\3M\3M\3M\3M"+
		"\7M\u076d\nM\fM\16M\u0770\13M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\7N\u0782\nN\fN\16N\u0785\13N\3N\3N\3N\3N\3N\5N\u078c\nN\3O\3O"+
		"\3O\3O\5O\u0792\nO\3P\3P\3P\7P\u0797\nP\fP\16P\u079a\13P\3Q\3Q\3Q\5Q\u079f"+
		"\nQ\3Q\3Q\3Q\5Q\u07a4\nQ\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u07ac\nQ\3Q\5Q\u07af\nQ"+
		"\5Q\u07b1\nQ\3R\3R\3R\3R\3S\3S\3S\3S\3S\5S\u07bc\nS\3T\3T\7T\u07c0\nT"+
		"\fT\16T\u07c3\13T\3U\3U\5U\u07c7\nU\3U\3U\5U\u07cb\nU\3U\3U\3U\5U\u07d0"+
		"\nU\5U\u07d2\nU\3U\3U\3U\3U\3U\5U\u07d9\nU\3U\3U\5U\u07dd\nU\3U\3U\3U"+
		"\3U\3U\5U\u07e4\nU\5U\u07e6\nU\5U\u07e8\nU\3V\3V\3V\3V\3V\3V\3V\3V\3W"+
		"\5W\u07f3\nW\3W\3W\5W\u07f7\nW\5W\u07f9\nW\3W\5W\u07fc\nW\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u080c\nW\3X\3X\5X\u0810\nX\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\7Y\u081a\nY\fY\16Y\u081d\13Y\3Y\5Y\u0820\nY\3Y\3Y\3Z\3"+
		"Z\3Z\3Z\3[\3[\3[\3[\3[\3[\5[\u082e\n[\3\\\3\\\3\\\3\\\3\\\5\\\u0835\n"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\5\\\u084b\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\5\\\u087f\n\\\3\\\3\\\5\\\u0883\n\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0891\n\\\3]\3]\3^\5^\u0896\n^\3^\3"+
		"^\3_\3_\5_\u089c\n_\3`\5`\u089f\n`\3`\3`\3`\3`\7`\u08a5\n`\f`\16`\u08a8"+
		"\13`\3`\3`\3a\5a\u08ad\na\3a\3a\3a\3a\3a\7a\u08b4\na\fa\16a\u08b7\13a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\7a\u08c5\na\fa\16a\u08c8\13a\3a\3"+
		"a\3a\5a\u08cd\na\3a\3a\3a\3a\3a\3a\5a\u08d5\na\3b\3b\3c\3c\3d\3d\3d\3"+
		"d\7d\u08df\nd\fd\16d\u08e2\13d\3d\3d\3e\3e\5e\u08e8\ne\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\7f\u08f3\nf\ff\16f\u08f6\13f\3g\3g\3g\7g\u08fb\ng\fg\16g"+
		"\u08fe\13g\3h\3h\3h\3h\3h\3h\3h\6h\u0907\nh\rh\16h\u0908\3h\3h\5h\u090d"+
		"\nh\3h\3h\3h\3h\3h\3h\3h\3h\6h\u0917\nh\rh\16h\u0918\3h\3h\5h\u091d\n"+
		"h\3h\3h\5h\u0921\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3"+
		"i\3i\5i\u0935\ni\3j\3j\3j\3j\3j\5j\u093c\nj\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0952\nj\3j\3j\3j\3j\3j\5j\u0959"+
		"\nj\3j\3j\3j\3j\3j\5j\u0960\nj\3j\3j\3j\3j\3j\5j\u0967\nj\3j\3j\3j\3j"+
		"\3j\5j\u096e\nj\3j\3j\3j\3j\3j\5j\u0975\nj\3j\3j\3j\3j\3j\5j\u097c\nj"+
		"\3j\3j\3j\3j\5j\u0982\nj\3j\3j\5j\u0986\nj\3j\3j\3j\3j\5j\u098c\nj\3j"+
		"\3j\5j\u0990\nj\5j\u0992\nj\3k\5k\u0995\nk\3k\3k\3l\3l\3l\5l\u099c\nl"+
		"\3l\5l\u099f\nl\3l\5l\u09a2\nl\3l\3l\3m\3m\3m\3n\3n\3n\3n\3n\3n\5n\u09af"+
		"\nn\3o\3o\5o\u09b3\no\3p\3p\3p\3p\3p\3p\5p\u09bb\np\3q\3q\3q\3q\5q\u09c1"+
		"\nq\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u09cd\nr\3r\3r\3r\3r\3r\5r\u09d4"+
		"\nr\3r\3r\3s\3s\3s\5s\u09db\ns\3s\3s\3s\3s\3s\5s\u09e2\ns\3s\3s\3t\3t"+
		"\3t\5t\u09e9\nt\3t\3t\3u\3u\3u\5u\u09f0\nu\3u\3u\3u\3u\3u\5u\u09f7\nu"+
		"\3u\3u\3v\3v\5v\u09fd\nv\3w\3w\3w\5w\u0a02\nw\3w\3w\3x\3x\3x\7x\u0a09"+
		"\nx\fx\16x\u0a0c\13x\3y\3y\3z\3z\5z\u0a12\nz\3{\3{\3|\3|\3}\5}\u0a19\n"+
		"}\3}\3}\3~\3~\3~\3~\3~\5~\u0a22\n~\3\177\3\177\5\177\u0a26\n\177\3\177"+
		"\3\177\3\177\3\177\5\177\u0a2c\n\177\3\177\5\177\u0a2f\n\177\3\u0080\3"+
		"\u0080\5\u0080\u0a33\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0a39"+
		"\n\u0081\3\u0081\3\u0081\5\u0081\u0a3d\n\u0081\3\u0081\3\u0081\5\u0081"+
		"\u0a41\n\u0081\3\u0082\5\u0082\u0a44\n\u0082\3\u0082\3\u0082\3\u0083\3"+
		"\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u0a4d\n\u0084\3\u0085\3\u0085\3"+
		"\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0a60\n\u0086"+
		"\3\u0087\3\u0087\3\u0087\2\3p\u0088\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\2,\3\2\u0135\u0136"+
		"\4\2\u0135\u0135\u0138\u0138\4\2\u00d2\u00d2\u0121\u0121\4\2\u0135\u0136"+
		"\u0138\u0138\3\2\u0080\u0081\4\2\u00fe\u00ff\u0107\u0107\4\2zz\u0110\u0110"+
		"\5\2\u00d7\u00d7\u0113\u0113\u012b\u012b\5\2\u00a1\u00a1\u00c0\u00c0\u00d5"+
		"\u00d5\3\2?@\4\2\u00b3\u00b3\u00ec\u00ec\3\2\u00fe\u00ff\3\2\u00a7\u00a8"+
		"\4\2mmoo\6\2\u00c4\u00c4\u0100\u0100\u0116\u0116\u0138\u0138\4\2\u00de"+
		"\u00de\u00ea\u00ea\4\2\u00dc\u00dc\u0114\u0114\6\2\u00d6\u00d6\u00d9\u00d9"+
		"\u00e7\u00e7\u011a\u011a\5\2\u00fc\u00fc\u0108\u0108\u0115\u0115\3\2\u0155"+
		"\u0156\3\2\u0152\u0154\4\2\u0155\u0156\u0158\u015a\5\2\4\4\7\7\u009e\u009e"+
		"\4\2\4\4\65\65\4\2\u010e\u010e\u0110\u0110\4\2\u00da\u00da\u00f3\u00f3"+
		"\4\2\t\t\63\63\4\2ww\u00e2\u00e2\5\2ee\u00ca\u00ca\u00e2\u00e2\4\2SS\u010f"+
		"\u010f\4\2jj\u0135\u0136\5\2MMaa\u008e\u008e\6\2ee\u00e2\u00e2\u00ed\u00ed"+
		"\u010b\u010b\4\2\u0136\u0136\u0138\u0138\3\2\u0136\u0137\4\2\u0105\u0105"+
		"\u0110\u0110\4\2\31\31hh\4\2\u00ef\u00ef\u0136\u0136\3\2\u013a\u013b\4"+
		"\2\u0136\u0136\u013a\u013a\t\2HH\u00be\u00c2\u00c4\u00c6\u00c8\u00cd\u00d2"+
		"\u00f0\u00f2\u012e\u0137\u0137\3\2\u0140\u0147\u0c19\2\u0111\3\2\2\2\4"+
		"\u011a\3\2\2\2\6\u0120\3\2\2\2\b\u012e\3\2\2\2\n\u01bf\3\2\2\2\f\u01c9"+
		"\3\2\2\2\16\u01cc\3\2\2\2\20\u020b\3\2\2\2\22\u0249\3\2\2\2\24\u0259\3"+
		"\2\2\2\26\u029b\3\2\2\2\30\u02b3\3\2\2\2\32\u02c6\3\2\2\2\34\u02c8\3\2"+
		"\2\2\36\u02d9\3\2\2\2 \u0305\3\2\2\2\"\u031c\3\2\2\2$\u031e\3\2\2\2&\u033b"+
		"\3\2\2\2(\u0355\3\2\2\2*\u037a\3\2\2\2,\u0390\3\2\2\2.\u0392\3\2\2\2\60"+
		"\u03a5\3\2\2\2\62\u03aa\3\2\2\2\64\u03b4\3\2\2\2\66\u03be\3\2\2\28\u03c8"+
		"\3\2\2\2:\u03d2\3\2\2\2<\u03e5\3\2\2\2>\u03e7\3\2\2\2@\u03ee\3\2\2\2B"+
		"\u0414\3\2\2\2D\u0430\3\2\2\2F\u045b\3\2\2\2H\u045f\3\2\2\2J\u046a\3\2"+
		"\2\2L\u047c\3\2\2\2N\u04a5\3\2\2\2P\u04f2\3\2\2\2R\u04f4\3\2\2\2T\u04f8"+
		"\3\2\2\2V\u04fd\3\2\2\2X\u0501\3\2\2\2Z\u050a\3\2\2\2\\\u051a\3\2\2\2"+
		"^\u051c\3\2\2\2`\u054d\3\2\2\2b\u056b\3\2\2\2d\u058b\3\2\2\2f\u0597\3"+
		"\2\2\2h\u05cb\3\2\2\2j\u05ce\3\2\2\2l\u05df\3\2\2\2n\u0622\3\2\2\2p\u0638"+
		"\3\2\2\2r\u0654\3\2\2\2t\u0656\3\2\2\2v\u0658\3\2\2\2x\u065a\3\2\2\2z"+
		"\u0667\3\2\2\2|\u0683\3\2\2\2~\u0685\3\2\2\2\u0080\u068d\3\2\2\2\u0082"+
		"\u0695\3\2\2\2\u0084\u069e\3\2\2\2\u0086\u06d9\3\2\2\2\u0088\u06e0\3\2"+
		"\2\2\u008a\u06ee\3\2\2\2\u008c\u06fb\3\2\2\2\u008e\u072e\3\2\2\2\u0090"+
		"\u0758\3\2\2\2\u0092\u075a\3\2\2\2\u0094\u0761\3\2\2\2\u0096\u0765\3\2"+
		"\2\2\u0098\u0767\3\2\2\2\u009a\u078b\3\2\2\2\u009c\u078d\3\2\2\2\u009e"+
		"\u0793\3\2\2\2\u00a0\u07b0\3\2\2\2\u00a2\u07b2\3\2\2\2\u00a4\u07bb\3\2"+
		"\2\2\u00a6\u07bd\3\2\2\2\u00a8\u07e7\3\2\2\2\u00aa\u07e9\3\2\2\2\u00ac"+
		"\u080b\3\2\2\2\u00ae\u080d\3\2\2\2\u00b0\u0811\3\2\2\2\u00b2\u0823\3\2"+
		"\2\2\u00b4\u082d\3\2\2\2\u00b6\u0890\3\2\2\2\u00b8\u0892\3\2\2\2\u00ba"+
		"\u0895\3\2\2\2\u00bc\u0899\3\2\2\2\u00be\u089e\3\2\2\2\u00c0\u08ac\3\2"+
		"\2\2\u00c2\u08d6\3\2\2\2\u00c4\u08d8\3\2\2\2\u00c6\u08da\3\2\2\2\u00c8"+
		"\u08e7\3\2\2\2\u00ca\u08e9\3\2\2\2\u00cc\u08f7\3\2\2\2\u00ce\u0920\3\2"+
		"\2\2\u00d0\u0934\3\2\2\2\u00d2\u0991\3\2\2\2\u00d4\u0994\3\2\2\2\u00d6"+
		"\u0998\3\2\2\2\u00d8\u09a5\3\2\2\2\u00da\u09ae\3\2\2\2\u00dc\u09b2\3\2"+
		"\2\2\u00de\u09ba\3\2\2\2\u00e0\u09c0\3\2\2\2\u00e2\u09d3\3\2\2\2\u00e4"+
		"\u09e1\3\2\2\2\u00e6\u09e8\3\2\2\2\u00e8\u09f6\3\2\2\2\u00ea\u09fc\3\2"+
		"\2\2\u00ec\u0a01\3\2\2\2\u00ee\u0a05\3\2\2\2\u00f0\u0a0d\3\2\2\2\u00f2"+
		"\u0a11\3\2\2\2\u00f4\u0a13\3\2\2\2\u00f6\u0a15\3\2\2\2\u00f8\u0a18\3\2"+
		"\2\2\u00fa\u0a21\3\2\2\2\u00fc\u0a23\3\2\2\2\u00fe\u0a32\3\2\2\2\u0100"+
		"\u0a40\3\2\2\2\u0102\u0a43\3\2\2\2\u0104\u0a47\3\2\2\2\u0106\u0a4c\3\2"+
		"\2\2\u0108\u0a4e\3\2\2\2\u010a\u0a5f\3\2\2\2\u010c\u0a61\3\2\2\2\u010e"+
		"\u0110\5\4\3\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0115\7\2\2\3\u0115\3\3\2\2\2\u0116\u011b\5\6\4\2\u0117\u011b\5\b\5\2"+
		"\u0118\u011b\5\n\6\2\u0119\u011b\5\f\7\2\u011a\u0116\3\2\2\2\u011a\u0117"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\5\3\2\2\2\u011c"+
		"\u0121\5\16\b\2\u011d\u0121\5\20\t\2\u011e\u0121\5\22\n\2\u011f\u0121"+
		"\5\24\13\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0120\u011f\3\2\2\2\u0121\7\3\2\2\2\u0122\u012f\5\34\17\2\u0123\u012f"+
		"\5\36\20\2\u0124\u012f\5$\23\2\u0125\u012f\5&\24\2\u0126\u012f\5(\25\2"+
		"\u0127\u012f\5,\27\2\u0128\u012f\5.\30\2\u0129\u012f\5\62\32\2\u012a\u012f"+
		"\5\64\33\2\u012b\u012f\5\66\34\2\u012c\u012f\58\35\2\u012d\u012f\5:\36"+
		"\2\u012e\u0122\3\2\2\2\u012e\u0123\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u0125"+
		"\3\2\2\2\u012e\u0126\3\2\2\2\u012e\u0127\3\2\2\2\u012e\u0128\3\2\2\2\u012e"+
		"\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012d\3\2\2\2\u012f\t\3\2\2\2\u0130\u0132\7\f\2\2\u0131\u0133"+
		"\7\u0150\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\3\2\2"+
		"\2\u0134\u0136\5\4\3\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013c\7;\2\2\u013b\u013d\7\u0150\2\2\u013c\u013b\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u01c0\3\2\2\2\u013e\u0140\7\16\2\2\u013f\u0141\7\u0150"+
		"\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u01c0\3\2\2\2\u0142"+
		"\u0144\7\"\2\2\u0143\u0145\7\u0150\2\2\u0144\u0143\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u01c0\3\2\2\2\u0146\u0147\7O\2\2\u0147\u0149\5\u0106\u0084"+
		"\2\u0148\u014a\7\u0150\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u01c0\3\2\2\2\u014b\u014c\5\u0106\u0084\2\u014c\u014e\7\u0151\2\2\u014d"+
		"\u014f\7\u0150\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u01c0"+
		"\3\2\2\2\u0150\u0151\7V\2\2\u0151\u0152\5\u0080A\2\u0152\u0155\5\4\3\2"+
		"\u0153\u0154\7:\2\2\u0154\u0156\5\4\3\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\7\u0150\2\2\u0158\u0157\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u01c0\3\2\2\2\u015a\u015c\7\u008b\2\2\u015b"+
		"\u015d\5p9\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2"+
		"\2\u015e\u0160\7\u0150\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u01c0\3\2\2\2\u0161\u0167\7\u011f\2\2\u0162\u0163\t\2\2\2\u0163\u0164"+
		"\7\u014f\2\2\u0164\u0165\t\3\2\2\u0165\u0166\7\u014f\2\2\u0166\u0168\t"+
		"\2\2\2\u0167\u0162\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u016b\7\u0150\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u01c0"+
		"\3\2\2\2\u016c\u016d\7\f\2\2\u016d\u016f\7\u0122\2\2\u016e\u0170\7\u0150"+
		"\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0174\3\2\2\2\u0171"+
		"\u0173\5\4\3\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\7;\2\2\u0178\u017a\7\u0122\2\2\u0179\u017b\7\u0150\2\2\u017a\u0179"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7\f\2\2\u017d"+
		"\u017f\7\u00c6\2\2\u017e\u0180\7\u0150\2\2\u017f\u017e\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0184\3\2\2\2\u0181\u0183\5\4\3\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7;\2\2\u0188\u018a\7\u00c6\2\2\u0189"+
		"\u018b\7\u0150\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u01c0"+
		"\3\2\2\2\u018c\u018d\7\u00b7\2\2\u018d\u018e\t\4\2\2\u018e\u0190\5p9\2"+
		"\u018f\u0191\7\u0150\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u01c0\3\2\2\2\u0192\u0193\7\u00ba\2\2\u0193\u019d\5\u0080A\2\u0194\u019e"+
		"\5\4\3\2\u0195\u0197\7\16\2\2\u0196\u0198\7\u0150\2\2\u0197\u0196\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u019e\3\2\2\2\u0199\u019b\7\"\2\2\u019a"+
		"\u019c\7\u0150\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e"+
		"\3\2\2\2\u019d\u0194\3\2\2\2\u019d\u0195\3\2\2\2\u019d\u0199\3\2\2\2\u019e"+
		"\u01c0\3\2\2\2\u019f\u01a0\7\177\2\2\u01a0\u01a2\5p9\2\u01a1\u01a3\7\u0150"+
		"\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01c0\3\2\2\2\u01a4"+
		"\u01a5\7\u0083\2\2\u01a5\u01a6\7\u014d\2\2\u01a6\u01a7\t\5\2\2\u01a7\u01aa"+
		"\7\u014f\2\2\u01a8\u01ab\5\u0102\u0082\2\u01a9\u01ab\7\u0135\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\7\u014f"+
		"\2\2\u01ad\u01b0\5\u0102\u0082\2\u01ae\u01b0\7\u0135\2\2\u01af\u01ad\3"+
		"\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b8\3\2\2\2\u01b1\u01b4\7\u014f\2\2"+
		"\u01b2\u01b5\5\u0100\u0081\2\u01b3\u01b5\7\u0135\2\2\u01b4\u01b2\3\2\2"+
		"\2\u01b4\u01b3\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b7\u01ba"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bd\7\u014e\2\2\u01bc\u01be\7\u0150\2\2\u01bd\u01bc"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u0130\3\2\2\2\u01bf"+
		"\u013e\3\2\2\2\u01bf\u0142\3\2\2\2\u01bf\u0146\3\2\2\2\u01bf\u014b\3\2"+
		"\2\2\u01bf\u0150\3\2\2\2\u01bf\u015a\3\2\2\2\u01bf\u0161\3\2\2\2\u01bf"+
		"\u016c\3\2\2\2\u01bf\u018c\3\2\2\2\u01bf\u0192\3\2\2\2\u01bf\u019f\3\2"+
		"\2\2\u01bf\u01a4\3\2\2\2\u01c0\13\3\2\2\2\u01c1\u01ca\5B\"\2\u01c2\u01ca"+
		"\5D#\2\u01c3\u01ca\5F$\2\u01c4\u01ca\5L\'\2\u01c5\u01ca\5N(\2\u01c6\u01ca"+
		"\5P)\2\u01c7\u01ca\5R*\2\u01c8\u01ca\5T+\2\u01c9\u01c1\3\2\2\2\u01c9\u01c2"+
		"\3\2\2\2\u01c9\u01c3\3\2\2\2\u01c9\u01c4\3\2\2\2\u01c9\u01c5\3\2\2\2\u01c9"+
		"\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\r\3\2\2\2"+
		"\u01cb\u01cd\5x=\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01d6\7\61\2\2\u01cf\u01d0\7\u00a6\2\2\u01d0\u01d1\7\u014d"+
		"\2\2\u01d1\u01d2\5p9\2\u01d2\u01d4\7\u014e\2\2\u01d3\u01d5\7z\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01cf\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01da\7L\2\2\u01d9"+
		"\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01df\3\2\2\2\u01db\u01e0\5\u00bc"+
		"_\2\u01dc\u01e0\5\u00eav\2\u01dd\u01e0\5<\37\2\u01de\u01e0\7\u0135\2\2"+
		"\u01df\u01db\3\2\2\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de"+
		"\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\5\u00be`\2\u01e2\u01e1\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e6\5\26\f\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01f0\3\2\2\2\u01e7\u01e8\7L"+
		"\2\2\u01e8\u01ed\5\u00a4S\2\u01e9\u01ea\7\u014f\2\2\u01ea\u01ec\5\u00a4"+
		"S\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01e7\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ff\3\2\2\2\u01f2\u01fd\7\u00b9\2\2\u01f3"+
		"\u01fe\5\u0080A\2\u01f4\u01f5\7&\2\2\u01f5\u01fb\7l\2\2\u01f6\u01f8\7"+
		"\u00de\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2"+
		"\u01f9\u01fc\5\u00f2z\2\u01fa\u01fc\7\u0135\2\2\u01fb\u01f7\3\2\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f3\3\2\2\2\u01fd\u01f4\3\2"+
		"\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f2\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0202\3\2\2\2\u0201\u0203\5\u0090I\2\u0202\u0201\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0206\5\u0098M\2\u0205\u0204\3\2\2"+
		"\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0209\7\u0150\2\2\u0208"+
		"\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\17\3\2\2\2\u020a\u020c\5x=\2"+
		"\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0215"+
		"\7Z\2\2\u020e\u020f\7\u00a6\2\2\u020f\u0210\7\u014d\2\2\u0210\u0211\5"+
		"p9\2\u0211\u0213\7\u014e\2\2\u0212\u0214\7z\2\2\u0213\u0212\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u020e\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u0218\3\2\2\2\u0217\u0219\7\\\2\2\u0218\u0217\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u021d\5\u00eav\2\u021b\u021d"+
		"\5<\37\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021d\u021f\3\2\2\2\u021e"+
		"\u0220\5\u00be`\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0225"+
		"\3\2\2\2\u0221\u0222\7\u014d\2\2\u0222\u0223\5\u00eex\2\u0223\u0224\7"+
		"\u014e\2\2\u0224\u0226\3\2\2\2\u0225\u0221\3\2\2\2\u0225\u0226\3\2\2\2"+
		"\u0226\u0228\3\2\2\2\u0227\u0229\5\26\f\2\u0228\u0227\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u023d\3\2\2\2\u022a\u022b\7\u00b4\2\2\u022b\u022c\7\u014d"+
		"\2\2\u022c\u022d\5\u00ccg\2\u022d\u0235\7\u014e\2\2\u022e\u022f\7\u014f"+
		"\2\2\u022f\u0230\7\u014d\2\2\u0230\u0231\5\u00ccg\2\u0231\u0232\7\u014e"+
		"\2\2\u0232\u0234\3\2\2\2\u0233\u022e\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u023e\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0238\u023e\5\u00b4[\2\u0239\u023e\5F$\2\u023a\u023e\5v<\2\u023b"+
		"\u023c\7\60\2\2\u023c\u023e\7\u00b4\2\2\u023d\u022a\3\2\2\2\u023d\u0238"+
		"\3\2\2\2\u023d\u0239\3\2\2\2\u023d\u023a\3\2\2\2\u023d\u023b\3\2\2\2\u023e"+
		"\u0240\3\2\2\2\u023f\u0241\5\u0090I\2\u0240\u023f\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0244\5\u0098M\2\u0243\u0242\3\2\2"+
		"\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0247\7\u0150\2\2\u0246"+
		"\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\21\3\2\2\2\u0248\u024a\5x=\2"+
		"\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d"+
		"\5\u0088E\2\u024c\u024e\5\u008eH\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2"+
		"\2\2\u024e\u0250\3\2\2\2\u024f\u0251\5\u0090I\2\u0250\u024f\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0254\5\u0098M\2\u0253\u0252"+
		"\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0257\7\u0150\2"+
		"\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\23\3\2\2\2\u0258\u025a"+
		"\5x=\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u0263\7\u00b0\2\2\u025c\u025d\7\u00a6\2\2\u025d\u025e\7\u014d\2\2\u025e"+
		"\u025f\5p9\2\u025f\u0261\7\u014e\2\2\u0260\u0262\7z\2\2\u0261\u0260\3"+
		"\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u025c\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0268\5\u00eav\2\u0266\u0268"+
		"\5<\37\2\u0267\u0265\3\2\2\2\u0267\u0266\3\2\2\2\u0268\u026a\3\2\2\2\u0269"+
		"\u026b\5\u00be`\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c"+
		"\3\2\2\2\u026c\u026d\7\u009b\2\2\u026d\u0272\5|?\2\u026e\u026f\7\u014f"+
		"\2\2\u026f\u0271\5|?\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0277\5\26\f\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0281\3"+
		"\2\2\2\u0278\u0279\7L\2\2\u0279\u027e\5\u00a4S\2\u027a\u027b\7\u014f\2"+
		"\2\u027b\u027d\5\u00a4S\2\u027c\u027a\3\2\2\2\u027d\u0280\3\2\2\2\u027e"+
		"\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2"+
		"\2\2\u0281\u0278\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0290\3\2\2\2\u0283"+
		"\u028e\7\u00b9\2\2\u0284\u028f\5~@\2\u0285\u0286\7&\2\2\u0286\u028c\7"+
		"l\2\2\u0287\u0289\7\u00de\2\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2"+
		"\u0289\u028a\3\2\2\2\u028a\u028d\5\u00f2z\2\u028b\u028d\7\u0135\2\2\u028c"+
		"\u0288\3\2\2\2\u028c\u028b\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u0284\3\2"+
		"\2\2\u028e\u0285\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u0283\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0294\5\u0090I\2\u0293\u0292"+
		"\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0297\5\u0098M"+
		"\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u029a"+
		"\7\u0150\2\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\25\3\2\2\2"+
		"\u029b\u029c\7\u00ff\2\2\u029c\u02a1\5\30\r\2\u029d\u029e\7\u014f\2\2"+
		"\u029e\u02a0\5\30\r\2\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02af\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4"+
		"\u02a7\7\\\2\2\u02a5\u02a8\7\u0135\2\2\u02a6\u02a8\5\u00e4s\2\u02a7\u02a5"+
		"\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02ad\3\2\2\2\u02a9\u02aa\7\u014d\2"+
		"\2\u02aa\u02ab\5\u00eex\2\u02ab\u02ac\7\u014e\2\2\u02ac\u02ae\3\2\2\2"+
		"\u02ad\u02a9\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02a4"+
		"\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\27\3\2\2\2\u02b1\u02b4\5\32\16\2\u02b2"+
		"\u02b4\5p9\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b9\3\2\2"+
		"\2\u02b5\u02b7\7\b\2\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8"+
		"\3\2\2\2\u02b8\u02ba\5\u00c8e\2\u02b9\u02b6\3\2\2\2\u02b9\u02ba\3\2\2"+
		"\2\u02ba\31\3\2\2\2\u02bb\u02bf\7\u00d3\2\2\u02bc\u02bf\7\u00e4\2\2\u02bd"+
		"\u02bf\5\u00e4s\2\u02be\u02bb\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bd"+
		"\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c3\7\u0148\2\2\u02c1\u02c4\7\u0152"+
		"\2\2\u02c2\u02c4\5\u00f0y\2\u02c3\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4"+
		"\u02c7\3\2\2\2\u02c5\u02c7\7\u012f\2\2\u02c6\u02be\3\2\2\2\u02c6\u02c5"+
		"\3\2\2\2\u02c7\33\3\2\2\2\u02c8\u02ca\7$\2\2\u02c9\u02cb\7\u00ae\2\2\u02ca"+
		"\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02ce\5\u00f6"+
		"|\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02d0\7X\2\2\u02d0\u02d1\5\u0106\u0084\2\u02d1\u02d2\7o\2\2\u02d2\u02d3"+
		"\5\u00aeX\2\u02d3\u02d4\7\u014d\2\2\u02d4\u02d5\5\u00eex\2\u02d5\u02d7"+
		"\7\u014e\2\2\u02d6\u02d8\7\u0150\2\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3"+
		"\2\2\2\u02d8\35\3\2\2\2\u02d9\u02da\7$\2\2\u02da\u02db\t\6\2\2\u02db\u02de"+
		"\5\u00e8u\2\u02dc\u02dd\7\u0150\2\2\u02dd\u02df\7\u0136\2\2\u02de\u02dc"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02ee\3\2\2\2\u02e0\u02e2\7\u014d\2"+
		"\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e8"+
		"\5 \21\2\u02e4\u02e5\7\u014f\2\2\u02e5\u02e7\5 \21\2\u02e6\u02e4\3\2\2"+
		"\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ec"+
		"\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ed\7\u014e\2\2\u02ec\u02eb\3\2\2"+
		"\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02e1\3\2\2\2\u02ee\u02ef"+
		"\3\2\2\2\u02ef\u02f9\3\2\2\2\u02f0\u02f1\7\u00bb\2\2\u02f1\u02f6\5\"\22"+
		"\2\u02f2\u02f3\7\u014f\2\2\u02f3\u02f5\5\"\22\2\u02f4\u02f2\3\2\2\2\u02f5"+
		"\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fa\3\2"+
		"\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02f0\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fd\3\2\2\2\u02fb\u02fc\7G\2\2\u02fc\u02fe\7\u0088\2\2\u02fd\u02fb"+
		"\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\7\b\2\2\u0300"+
		"\u0302\5\4\3\2\u0301\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0301\3\2"+
		"\2\2\u0303\u0304\3\2\2\2\u0304\37\3\2\2\2\u0305\u0309\7\u0135\2\2\u0306"+
		"\u0307\5\u0106\u0084\2\u0307\u0308\7\u0148\2\2\u0308\u030a\3\2\2\2\u0309"+
		"\u0306\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u030d\7\b"+
		"\2\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u0310\5\u00fc\177\2\u030f\u0311\7\u00b5\2\2\u0310\u030f\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0313\7\u013c\2\2\u0313\u0315"+
		"\5\u00fe\u0080\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\3"+
		"\2\2\2\u0316\u0318\t\7\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"!\3\2\2\2\u0319\u031d\7\u00d7\2\2\u031a\u031d\7\u0109\2\2\u031b\u031d"+
		"\5V,\2\u031c\u0319\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d"+
		"#\3\2\2\2\u031e\u031f\7$\2\2\u031f\u0320\7\u009f\2\2\u0320\u0321\5\u0106"+
		"\u0084\2\u0321\u0322\7o\2\2\u0322\u0323\5\u00aeX\2\u0323\u0324\7\u014d"+
		"\2\2\u0324\u0325\5\u00eex\2\u0325\u0336\7\u014e\2\2\u0326\u032c\7\u00bb"+
		"\2\2\u0327\u032d\7\u00dd\2\2\u0328\u0329\7\u0112\2\2\u0329\u032a\7\u0136"+
		"\2\2\u032a\u032d\t\b\2\2\u032b\u032d\7\u011b\2\2\u032c\u0327\3\2\2\2\u032c"+
		"\u0328\3\2\2\2\u032c\u032b\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032f\7\u014f"+
		"\2\2\u032f\u0331\7\u00f7\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0334\3\2\2\2\u0332\u0333\7\u014f\2\2\u0333\u0335\5\u00f4{\2\u0334\u0332"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336\u0326\3\2\2\2\u0336"+
		"\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u033a\7\u0150\2\2\u0339\u0338"+
		"\3\2\2\2\u0339\u033a\3\2\2\2\u033a%\3\2\2\2\u033b\u033c\7$\2\2\u033c\u033d"+
		"\7\u00a1\2\2\u033d\u033e\5\u00e4s\2\u033e\u033f\7\u014d\2\2\u033f\u0346"+
		"\5\\/\2\u0340\u0342\7\u014f\2\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2"+
		"\2\u0342\u0343\3\2\2\2\u0343\u0345\5\\/\2\u0344\u0341\3\2\2\2\u0345\u0348"+
		"\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034a\3\2\2\2\u0348"+
		"\u0346\3\2\2\2\u0349\u034b\7\u014f\2\2\u034a\u0349\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u0350\7\u014e\2\2\u034d\u034e\7o\2"+
		"\2\u034e\u0351\5\u0106\u0084\2\u034f\u0351\7\60\2\2\u0350\u034d\3\2\2"+
		"\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0354"+
		"\7\u0150\2\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\'\3\2\2\2\u0355"+
		"\u0356\7$\2\2\u0356\u0357\7\u00b6\2\2\u0357\u0363\5\u00e6t\2\u0358\u0359"+
		"\7\u014d\2\2\u0359\u035e\5\u00f0y\2\u035a\u035b\7\u014f\2\2\u035b\u035d"+
		"\5\u00f0y\2\u035c\u035a\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2"+
		"\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0362"+
		"\7\u014e\2\2\u0362\u0364\3\2\2\2\u0363\u0358\3\2\2\2\u0363\u0364\3\2\2"+
		"\2\u0364\u036e\3\2\2\2\u0365\u0366\7\u00bb\2\2\u0366\u036b\5*\26\2\u0367"+
		"\u0368\7\u014f\2\2\u0368\u036a\5*\26\2\u0369\u0367\3\2\2\2\u036a\u036d"+
		"\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036f\3\2\2\2\u036d"+
		"\u036b\3\2\2\2\u036e\u0365\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2"+
		"\2\2\u0370\u0371\7\b\2\2\u0371\u0375\5\22\n\2\u0372\u0373\7\u00bb\2\2"+
		"\u0373\u0374\7\26\2\2\u0374\u0376\7u\2\2\u0375\u0372\3\2\2\2\u0375\u0376"+
		"\3\2\2\2\u0376\u0378\3\2\2\2\u0377\u0379\7\u0150\2\2\u0378\u0377\3\2\2"+
		"\2\u0378\u0379\3\2\2\2\u0379)\3\2\2\2\u037a\u037b\t\t\2\2\u037b+\3\2\2"+
		"\2\u037c\u037d\7\5\2\2\u037d\u037e\7\u00a1\2\2\u037e\u037f\5\u00e4s\2"+
		"\u037f\u0380\7\u009b\2\2\u0380\u0381\7\u014d\2\2\u0381\u0382\7\u00eb\2"+
		"\2\u0382\u0383\7\u013c\2\2\u0383\u0384\t\n\2\2\u0384\u0386\7\u014e\2\2"+
		"\u0385\u0387\7\u0150\2\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387"+
		"\u0391\3\2\2\2\u0388\u0389\7\5\2\2\u0389\u038a\7\u00a1\2\2\u038a\u038b"+
		"\5\u00e4s\2\u038b\u038c\7\3\2\2\u038c\u038e\5\\/\2\u038d\u038f\7\u0150"+
		"\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\3\2\2\2\u0390"+
		"\u037c\3\2\2\2\u0390\u0388\3\2\2\2\u0391-\3\2\2\2\u0392\u0393\7\5\2\2"+
		"\u0393\u0396\7,\2\2\u0394\u0397\5\u0106\u0084\2\u0395\u0397\7&\2\2\u0396"+
		"\u0394\3\2\2\2\u0396\u0395\3\2\2\2\u0397\u03a0\3\2\2\2\u0398\u0399\7\u00f2"+
		"\2\2\u0399\u039a\7\u00f4\2\2\u039a\u039b\7\u013c\2\2\u039b\u03a1\5\u0106"+
		"\u0084\2\u039c\u039d\7\33\2\2\u039d\u03a1\5\u0106\u0084\2\u039e\u039f"+
		"\7\u009b\2\2\u039f\u03a1\5\60\31\2\u03a0\u0398\3\2\2\2\u03a0\u039c\3\2"+
		"\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2\u03a4\7\u0150\2\2\u03a3"+
		"\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4/\3\2\2\2\u03a5\u03a8\5\u0106"+
		"\u0084\2\u03a6\u03a9\5\u0106\u0084\2\u03a7\u03a9\7M\2\2\u03a8\u03a6\3"+
		"\2\2\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\61\3\2\2\2\u03aa"+
		"\u03ab\78\2\2\u03ab\u03ae\7X\2\2\u03ac\u03ad\7V\2\2\u03ad\u03af\7A\2\2"+
		"\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2"+
		"\5\u0106\u0084\2\u03b1\u03b3\7\u0150\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3"+
		"\3\2\2\2\u03b3\63\3\2\2\2\u03b4\u03b5\78\2\2\u03b5\u03b8\7\u0081\2\2\u03b6"+
		"\u03b7\7V\2\2\u03b7\u03b9\7A\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2"+
		"\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\5\u00e8u\2\u03bb\u03bd\7\u0150\2\2"+
		"\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\65\3\2\2\2\u03be\u03bf"+
		"\78\2\2\u03bf\u03c3\7\u009f\2\2\u03c0\u03c1\5\u00e4s\2\u03c1\u03c2\7\u0148"+
		"\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c0\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4"+
		"\u03c5\3\2\2\2\u03c5\u03c6\5\u0106\u0084\2\u03c6\u03c7\7\u0150\2\2\u03c7"+
		"\67\3\2\2\2\u03c8\u03c9\78\2\2\u03c9\u03cc\7\u00a1\2\2\u03ca\u03cb\7V"+
		"\2\2\u03cb\u03cd\7A\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03d0\5\u00e4s\2\u03cf\u03d1\7\u0150\2\2\u03d0\u03cf"+
		"\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d19\3\2\2\2\u03d2\u03d3\78\2\2\u03d3\u03d6"+
		"\7\u00b6\2\2\u03d4\u03d5\7V\2\2\u03d5\u03d7\7A\2\2\u03d6\u03d4\3\2\2\2"+
		"\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03dd\5\u00e6t\2\u03d9"+
		"\u03da\7\u014f\2\2\u03da\u03dc\5\u00e6t\2\u03db\u03d9\3\2\2\2\u03dc\u03df"+
		"\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e1\3\2\2\2\u03df"+
		"\u03dd\3\2\2\2\u03e0\u03e2\7\u0150\2\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2"+
		"\3\2\2\2\u03e2;\3\2\2\2\u03e3\u03e6\5> \2\u03e4\u03e6\5@!\2\u03e5\u03e3"+
		"\3\2\2\2\u03e5\u03e4\3\2\2\2\u03e6=\3\2\2\2\u03e7\u03e8\7r\2\2\u03e8\u03e9"+
		"\7\u014d\2\2\u03e9\u03ea\5\u0106\u0084\2\u03ea\u03eb\7\u014f\2\2\u03eb"+
		"\u03ec\7\u0138\2\2\u03ec\u03ed\7\u014e\2\2\u03ed?\3\2\2\2\u03ee\u03ef"+
		"\7q\2\2\u03ef\u03f0\7\u014d\2\2\u03f0\u03f1\7\u0138\2\2\u03f1\u03f2\7"+
		"\u014f\2\2\u03f2\u03f3\7\u0138\2\2\u03f3\u03f4\7\u014e\2\2\u03f4\u03f6"+
		"\7\u0148\2\2\u03f5\u03f7\5\u0106\u0084\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7"+
		"\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\7\u0148\2\2\u03f9\u03fb\5\u0106"+
		"\u0084\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fd\7\u0148\2\2\u03fd\u03fe\5\u0106\u0084\2\u03feA\3\2\2\2\u03ff\u0400"+
		"\7/\2\2\u0400\u0405\5X-\2\u0401\u0402\7\u014f\2\2\u0402\u0404\5X-\2\u0403"+
		"\u0401\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2"+
		"\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u040a\7\u0150\2\2\u0409"+
		"\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u0415\3\2\2\2\u040b\u040c\7/"+
		"\2\2\u040c\u040e\7\u0135\2\2\u040d\u040f\7\b\2\2\u040e\u040d\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0412\5Z.\2\u0411\u0413\7\u0150"+
		"\2\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415\3\2\2\2\u0414"+
		"\u03ff\3\2\2\2\u0414\u040b\3\2\2\2\u0415C\3\2\2\2\u0416\u0418\7\30\2\2"+
		"\u0417\u0419\7\u00de\2\2\u0418\u0417\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u041c\5\u00f2z\2\u041b\u041d\7\u0150\2\2\u041c\u041b"+
		"\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u0431\3\2\2\2\u041e\u0420\7.\2\2\u041f"+
		"\u0421\7\u00de\2\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422"+
		"\3\2\2\2\u0422\u0424\5\u00f2z\2\u0423\u0425\7\u0150\2\2\u0424\u0423\3"+
		"\2\2\2\u0424\u0425\3\2\2\2\u0425\u0431\3\2\2\2\u0426\u0431\5h\65\2\u0427"+
		"\u0431\5l\67\2\u0428\u042a\7p\2\2\u0429\u042b\7\u00de\2\2\u042a\u0429"+
		"\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\5\u00f2z"+
		"\2\u042d\u042f\7\u0150\2\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0431\3\2\2\2\u0430\u0416\3\2\2\2\u0430\u041e\3\2\2\2\u0430\u0426\3\2"+
		"\2\2\u0430\u0427\3\2\2\2\u0430\u0428\3\2\2\2\u0431E\3\2\2\2\u0432\u0435"+
		"\t\13\2\2\u0433\u0434\7\u0135\2\2\u0434\u0436\7\u013c\2\2\u0435\u0433"+
		"\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0440\5\u00e8u"+
		"\2\u0438\u043d\5H%\2\u0439\u043a\7\u014f\2\2\u043a\u043c\5H%\2\u043b\u0439"+
		"\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0438\3\2\2\2\u0440\u0441\3\2"+
		"\2\2\u0441\u0443\3\2\2\2\u0442\u0444\7\u0150\2\2\u0443\u0442\3\2\2\2\u0443"+
		"\u0444\3\2\2\2\u0444\u045c\3\2\2\2\u0445\u0446\t\13\2\2\u0446\u0447\7"+
		"\u014d\2\2\u0447\u044c\5J&\2\u0448\u0449\7\u0155\2\2\u0449\u044b\5J&\2"+
		"\u044a\u0448\3\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d"+
		"\3\2\2\2\u044d\u044f\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0456\7\u014e\2"+
		"\2\u0450\u0452\7\b\2\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453"+
		"\3\2\2\2\u0453\u0454\t\f\2\2\u0454\u0455\7\u013c\2\2\u0455\u0457\7\u0138"+
		"\2\2\u0456\u0451\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0459\3\2\2\2\u0458"+
		"\u045a\7\u0150\2\2\u0459\u0458\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c"+
		"\3\2\2\2\u045b\u0432\3\2\2\2\u045b\u0445\3\2\2\2\u045cG\3\2\2\2\u045d"+
		"\u045e\7\u0135\2\2\u045e\u0460\7\u013c\2\2\u045f\u045d\3\2\2\2\u045f\u0460"+
		"\3\2\2\2\u0460\u0468\3\2\2\2\u0461\u0469\5\u0100\u0081\2\u0462\u0464\7"+
		"\u0135\2\2\u0463\u0465\t\r\2\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2"+
		"\u0465\u0469\3\2\2\2\u0466\u0469\7\60\2\2\u0467\u0469\7j\2\2\u0468\u0461"+
		"\3\2\2\2\u0468\u0462\3\2\2\2\u0468\u0466\3\2\2\2\u0468\u0467\3\2\2\2\u0469"+
		"I\3\2\2\2\u046a\u046b\t\3\2\2\u046bK\3\2\2\2\u046c\u046e\5V,\2\u046d\u046f"+
		"\7\u0150\2\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u047d\3\2\2"+
		"\2\u0470\u0477\7\u008c\2\2\u0471\u0472\7\u014d\2\2\u0472\u0473\7\u00bb"+
		"\2\2\u0473\u0474\7\u00cb\2\2\u0474\u0475\7\u013c\2\2\u0475\u0476\7\u0135"+
		"\2\2\u0476\u0478\7\u014e\2\2\u0477\u0471\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"\u047a\3\2\2\2\u0479\u047b\7\u0150\2\2\u047a\u0479\3\2\2\2\u047a\u047b"+
		"\3\2\2\2\u047b\u047d\3\2\2\2\u047c\u046c\3\2\2\2\u047c\u0470\3\2\2\2\u047d"+
		"M\3\2\2\2\u047e\u047f\7\u009b\2\2\u047f\u0482\7\u0135\2\2\u0480\u0481"+
		"\7\u0148\2\2\u0481\u0483\5\u0106\u0084\2\u0482\u0480\3\2\2\2\u0482\u0483"+
		"\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\7\u013c\2\2\u0485\u0487\5p9\2"+
		"\u0486\u0488\7\u0150\2\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u04a6\3\2\2\2\u0489\u048a\7\u009b\2\2\u048a\u048b\7\u0135\2\2\u048b\u048c"+
		"\5\u010c\u0087\2\u048c\u048e\5p9\2\u048d\u048f\7\u0150\2\2\u048e\u048d"+
		"\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u04a6\3\2\2\2\u0490\u0491\7\u009b\2"+
		"\2\u0491\u0492\7\u0135\2\2\u0492\u0493\7\u013c\2\2\u0493\u0494\7+\2\2"+
		"\u0494\u049f\5j\66\2\u0495\u049d\7G\2\2\u0496\u0497\7\u0084\2\2\u0497"+
		"\u049e\7\u00fb\2\2\u0498\u049b\7\u00b0\2\2\u0499\u049a\7l\2\2\u049a\u049c"+
		"\5\u00eex\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049e\3\2\2"+
		"\2\u049d\u0496\3\2\2\2\u049d\u0498\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u0495"+
		"\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1\u04a3\7\u0150\2"+
		"\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4\u04a6"+
		"\5n8\2\u04a5\u047e\3\2\2\2\u04a5\u0489\3\2\2\2\u04a5\u0490\3\2\2\2\u04a5"+
		"\u04a4\3\2\2\2\u04a6O\3\2\2\2\u04a7\u04a8\7\f\2\2\u04a8\u04a9\7\66\2\2"+
		"\u04a9\u04ac\t\16\2\2\u04aa\u04ad\5\u0106\u0084\2\u04ab\u04ad\7\u0135"+
		"\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad"+
		"\u04af\3\2\2\2\u04ae\u04b0\7\u0150\2\2\u04af\u04ae\3\2\2\2\u04af\u04b0"+
		"\3\2\2\2\u04b0\u04f3\3\2\2\2\u04b1\u04b2\7\f\2\2\u04b2\u04bc\t\16\2\2"+
		"\u04b3\u04b6\5\u0106\u0084\2\u04b4\u04b6\7\u0135\2\2\u04b5\u04b3\3\2\2"+
		"\2\u04b5\u04b4\3\2\2\2\u04b6\u04ba\3\2\2\2\u04b7\u04b8\7\u00bb\2\2\u04b8"+
		"\u04b9\7\u00ee\2\2\u04b9\u04bb\7\u0138\2\2\u04ba\u04b7\3\2\2\2\u04ba\u04bb"+
		"\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04b5\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd"+
		"\u04bf\3\2\2\2\u04be\u04c0\7\u0150\2\2\u04bf\u04be\3\2\2\2\u04bf\u04c0"+
		"\3\2\2\2\u04c0\u04f3\3\2\2\2\u04c1\u04c2\7\35\2\2\u04c2\u04cd\t\16\2\2"+
		"\u04c3\u04c6\5\u0106\u0084\2\u04c4\u04c6\7\u0135\2\2\u04c5\u04c3\3\2\2"+
		"\2\u04c5\u04c4\3\2\2\2\u04c6\u04cb\3\2\2\2\u04c7\u04c8\7\u00bb\2\2\u04c8"+
		"\u04c9\7\u014d\2\2\u04c9\u04ca\t\17\2\2\u04ca\u04cc\7\u014e\2\2\u04cb"+
		"\u04c7\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04c5\3\2"+
		"\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04d1\7\u0150\2\2\u04d0"+
		"\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04f3\3\2\2\2\u04d2\u04d4\7\35"+
		"\2\2\u04d3\u04d5\7\u012c\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5"+
		"\u04d7\3\2\2\2\u04d6\u04d8\7\u0150\2\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8"+
		"\3\2\2\2\u04d8\u04f3\3\2\2\2\u04d9\u04da\7\u008f\2\2\u04da\u04dd\t\16"+
		"\2\2\u04db\u04de\5\u0106\u0084\2\u04dc\u04de\7\u0135\2\2\u04dd\u04db\3"+
		"\2\2\2\u04dd\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df"+
		"\u04e1\7\u0150\2\2\u04e0\u04df\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04f3"+
		"\3\2\2\2\u04e2\u04e4\7\u008f\2\2\u04e3\u04e5\7\u012c\2\2\u04e4\u04e3\3"+
		"\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04e8\7\u0150\2\2"+
		"\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04f3\3\2\2\2\u04e9\u04ea"+
		"\7\u0093\2\2\u04ea\u04ed\t\16\2\2\u04eb\u04ee\5\u0106\u0084\2\u04ec\u04ee"+
		"\7\u0135\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2"+
		"\2\u04ee\u04f0\3\2\2\2\u04ef\u04f1\7\u0150\2\2\u04f0\u04ef\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04a7\3\2\2\2\u04f2\u04b1\3\2"+
		"\2\2\u04f2\u04c1\3\2\2\2\u04f2\u04d2\3\2\2\2\u04f2\u04d9\3\2\2\2\u04f2"+
		"\u04e2\3\2\2\2\u04f2\u04e9\3\2\2\2\u04f3Q\3\2\2\2\u04f4\u04f6\7\u00df"+
		"\2\2\u04f5\u04f7\7\u0136\2\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"S\3\2\2\2\u04f8\u04f9\7\u00b2\2\2\u04f9\u04fb\5\u0106\u0084\2\u04fa\u04fc"+
		"\7\u0150\2\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fcU\3\2\2\2\u04fd"+
		"\u04fe\t\13\2\2\u04fe\u04ff\7\b\2\2\u04ff\u0500\t\20\2\2\u0500W\3\2\2"+
		"\2\u0501\u0503\7\u0135\2\2\u0502\u0504\7\b\2\2\u0503\u0502\3\2\2\2\u0503"+
		"\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0508\5\u00fc\177\2\u0506\u0507"+
		"\7\u013c\2\2\u0507\u0509\5p9\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2"+
		"\u0509Y\3\2\2\2\u050a\u050b\7\u00a1\2\2\u050b\u050c\7\u014d\2\2\u050c"+
		"\u0513\5\\/\2\u050d\u050f\7\u014f\2\2\u050e\u050d\3\2\2\2\u050e\u050f"+
		"\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512\5\\/\2\u0511\u050e\3\2\2\2\u0512"+
		"\u0515\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0516\3\2"+
		"\2\2\u0515\u0513\3\2\2\2\u0516\u0517\7\u014e\2\2\u0517[\3\2\2\2\u0518"+
		"\u051b\5^\60\2\u0519\u051b\5b\62\2\u051a\u0518\3\2\2\2\u051a\u0519\3\2"+
		"\2\2\u051b]\3\2\2\2\u051c\u0520\5\u00f0y\2\u051d\u0521\5\u00fc\177\2\u051e"+
		"\u051f\7\b\2\2\u051f\u0521\5p9\2\u0520\u051d\3\2\2\2\u0520\u051e\3\2\2"+
		"\2\u0521\u0524\3\2\2\2\u0522\u0523\7\33\2\2\u0523\u0525\5\u0106\u0084"+
		"\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2\2\2\u0526\u0528"+
		"\5\u00f8}\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0540\3\2\2"+
		"\2\u0529\u052a\7\37\2\2\u052a\u052c\5\u0106\u0084\2\u052b\u0529\3\2\2"+
		"\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\7\60\2\2\u052e"+
		"\u0531\5r:\2\u052f\u0530\7\u00bb\2\2\u0530\u0532\7\u00b4\2\2\u0531\u052f"+
		"\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0541\3\2\2\2\u0533\u0539\7S\2\2\u0534"+
		"\u0535\7\u014d\2\2\u0535\u0536\7\u0136\2\2\u0536\u0537\7\u014f\2\2\u0537"+
		"\u0538\7\u0136\2\2\u0538\u053a\7\u014e\2\2\u0539\u0534\3\2\2\2\u0539\u053a"+
		"\3\2\2\2\u053a\u053e\3\2\2\2\u053b\u053c\7i\2\2\u053c\u053d\7G\2\2\u053d"+
		"\u053f\7\u0088\2\2\u053e\u053b\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541"+
		"\3\2\2\2\u0540\u052b\3\2\2\2\u0540\u0533\3\2\2\2\u0540\u0541\3\2\2\2\u0541"+
		"\u0543\3\2\2\2\u0542\u0544\7\u0091\2\2\u0543\u0542\3\2\2\2\u0543\u0544"+
		"\3\2\2\2\u0544\u0548\3\2\2\2\u0545\u0547\5`\61\2\u0546\u0545\3\2\2\2\u0547"+
		"\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549_\3\2\2\2"+
		"\u054a\u0548\3\2\2\2\u054b\u054c\7\37\2\2\u054c\u054e\5\u0106\u0084\2"+
		"\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0550\3\2\2\2\u054f\u0551"+
		"\5\u00f8}\2\u0550\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0567\3\2\2"+
		"\2\u0552\u0553\7~\2\2\u0553\u0556\7_\2\2\u0554\u0556\7\u00ae\2\2\u0555"+
		"\u0552\3\2\2\2\u0555\u0554\3\2\2\2\u0556\u0558\3\2\2\2\u0557\u0559\5\u00f6"+
		"|\2\u0558\u0557\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055b\3\2\2\2\u055a"+
		"\u055c\5d\63\2\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u0568\3\2"+
		"\2\2\u055d\u0561\7\26\2\2\u055e\u055f\7i\2\2\u055f\u0560\7G\2\2\u0560"+
		"\u0562\7\u0088\2\2\u0561\u055e\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563"+
		"\3\2\2\2\u0563\u0564\7\u014d\2\2\u0564\u0565\5\u0080A\2\u0565\u0566\7"+
		"\u014e\2\2\u0566\u0568\3\2\2\2\u0567\u0555\3\2\2\2\u0567\u055d\3\2\2\2"+
		"\u0568a\3\2\2\2\u0569\u056a\7\37\2\2\u056a\u056c\5\u0106\u0084\2\u056b"+
		"\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u0589\3\2\2\2\u056d\u056e\7~"+
		"\2\2\u056e\u0571\7_\2\2\u056f\u0571\7\u00ae\2\2\u0570\u056d\3\2\2\2\u0570"+
		"\u056f\3\2\2\2\u0571\u0573\3\2\2\2\u0572\u0574\5\u00f6|\2\u0573\u0572"+
		"\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\7\u014d\2"+
		"\2\u0576\u0577\5\u00eex\2\u0577\u0579\7\u014e\2\2\u0578\u057a\5d\63\2"+
		"\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u057c"+
		"\7o\2\2\u057c\u057e\5\u0106\u0084\2\u057d\u057b\3\2\2\2\u057d\u057e\3"+
		"\2\2\2\u057e\u058a\3\2\2\2\u057f\u0583\7\26\2\2\u0580\u0581\7i\2\2\u0581"+
		"\u0582\7G\2\2\u0582\u0584\7\u0088\2\2\u0583\u0580\3\2\2\2\u0583\u0584"+
		"\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0586\7\u014d\2\2\u0586\u0587\5\u0080"+
		"A\2\u0587\u0588\7\u014e\2\2\u0588\u058a\3\2\2\2\u0589\u0570\3\2\2\2\u0589"+
		"\u057f\3\2\2\2\u058ac\3\2\2\2\u058b\u058c\7\u00bb\2\2\u058c\u058d\7\u014d"+
		"\2\2\u058d\u0592\5f\64\2\u058e\u058f\7\u014f\2\2\u058f\u0591\5f\64\2\u0590"+
		"\u058e\3\2\2\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2"+
		"\2\2\u0593\u0595\3\2\2\2\u0594\u0592\3\2\2\2\u0595\u0596\7\u014e\2\2\u0596"+
		"e\3\2\2\2\u0597\u0598\5\u0108\u0085\2\u0598\u059c\7\u013c\2\2\u0599\u059d"+
		"\5\u0108\u0085\2\u059a\u059d\5\u00f4{\2\u059b\u059d\7\u0136\2\2\u059c"+
		"\u0599\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059b\3\2\2\2\u059dg\3\2\2\2"+
		"\u059e\u059f\7/\2\2\u059f\u05a0\5\u00f2z\2\u05a0\u05a2\7+\2\2\u05a1\u05a3"+
		"\7\u0150\2\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05cc\3\2\2"+
		"\2\u05a4\u05a5\7/\2\2\u05a5\u05a7\5\u00f2z\2\u05a6\u05a8\7\u00e3\2\2\u05a7"+
		"\u05a6\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05aa\3\2\2\2\u05a9\u05ab\7\u0114"+
		"\2\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac"+
		"\u05ad\7+\2\2\u05ad\u05ae\7G\2\2\u05ae\u05b7\5\22\n\2\u05af\u05b5\7G\2"+
		"\2\u05b0\u05b1\7\u0084\2\2\u05b1\u05b6\7\u00fb\2\2\u05b2\u05b6\7\u00b0"+
		"\2\2\u05b3\u05b4\7l\2\2\u05b4\u05b6\5\u00eex\2\u05b5\u05b0\3\2\2\2\u05b5"+
		"\u05b2\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b6\u05b8\3\2\2\2\u05b7\u05af\3\2"+
		"\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05bb\7\u0150\2\2\u05ba"+
		"\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05cc\3\2\2\2\u05bc\u05bd\7/"+
		"\2\2\u05bd\u05be\5\u00f2z\2\u05be\u05bf\7+\2\2\u05bf\u05c6\5j\66\2\u05c0"+
		"\u05c1\7G\2\2\u05c1\u05c4\7\u00b0\2\2\u05c2\u05c3\7l\2\2\u05c3\u05c5\5"+
		"\u00eex\2\u05c4\u05c2\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7\3\2\2\2"+
		"\u05c6\u05c0\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c9\3\2\2\2\u05c8\u05ca"+
		"\7\u0150\2\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cc\3\2\2"+
		"\2\u05cb\u059e\3\2\2\2\u05cb\u05a4\3\2\2\2\u05cb\u05bc\3\2\2\2\u05cci"+
		"\3\2\2\2\u05cd\u05cf\t\21\2\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2\2\2"+
		"\u05cf\u05d1\3\2\2\2\u05d0\u05d2\t\22\2\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2"+
		"\3\2\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05d5\t\23\2\2\u05d4\u05d3\3\2\2\2"+
		"\u05d4\u05d5\3\2\2\2\u05d5\u05d7\3\2\2\2\u05d6\u05d8\t\24\2\2\u05d7\u05d6"+
		"\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05da\3\2\2\2\u05d9\u05db\7\u0124\2"+
		"\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05dd"+
		"\7G\2\2\u05dd\u05de\5\22\n\2\u05dek\3\2\2\2\u05df\u05eb\7D\2\2\u05e0\u05e9"+
		"\7\u00f3\2\2\u05e1\u05e9\7\u0104\2\2\u05e2\u05e9\7\u00da\2\2\u05e3\u05e9"+
		"\7\u00e8\2\2\u05e4\u05e5\7\u00be\2\2\u05e5\u05e9\5p9\2\u05e6\u05e7\7\u010a"+
		"\2\2\u05e7\u05e9\5p9\2\u05e8\u05e0\3\2\2\2\u05e8\u05e1\3\2\2\2\u05e8\u05e2"+
		"\3\2\2\2\u05e8\u05e3\3\2\2\2\u05e8\u05e4\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e8"+
		"\u05e9\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec\7L\2\2\u05eb\u05e8\3\2"+
		"\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05ef\7\u00de\2\2\u05ee"+
		"\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05fa\5\u00f2"+
		"z\2\u05f1\u05f2\7\\\2\2\u05f2\u05f7\7\u0135\2\2\u05f3\u05f4\7\u014f\2"+
		"\2\u05f4\u05f6\7\u0135\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05f9\3\2\2\2\u05f7"+
		"\u05f5\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fb\3\2\2\2\u05f9\u05f7\3\2"+
		"\2\2\u05fa\u05f1\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fd\3\2\2\2\u05fc"+
		"\u05fe\7\u0150\2\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fem\3\2"+
		"\2\2\u05ff\u0600\7\u009b\2\2\u0600\u0605\5\u0106\u0084\2\u0601\u0606\5"+
		"\u0106\u0084\2\u0602\u0606\5\u0100\u0081\2\u0603\u0606\7\u0135\2\2\u0604"+
		"\u0606\5\u00f4{\2\u0605\u0601\3\2\2\2\u0605\u0602\3\2\2\2\u0605\u0603"+
		"\3\2\2\2\u0605\u0604\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u0609\7\u0150\2"+
		"\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u0623\3\2\2\2\u060a\u060b"+
		"\7\u009b\2\2\u060b\u060c\7\u00a8\2\2\u060c\u060d\7\u00e5\2\2\u060d\u0616"+
		"\7\u00e9\2\2\u060e\u060f\7\u0084\2\2\u060f\u0617\7\u0126\2\2\u0610\u0611"+
		"\7\u0084\2\2\u0611\u0617\7\u00c9\2\2\u0612\u0613\7\u010c\2\2\u0613\u0617"+
		"\7\u0084\2\2\u0614\u0617\7\u0118\2\2\u0615\u0617\7\u0117\2\2\u0616\u060e"+
		"\3\2\2\2\u0616\u0610\3\2\2\2\u0616\u0612\3\2\2\2\u0616\u0614\3\2\2\2\u0616"+
		"\u0615\3\2\2\2\u0617\u0619\3\2\2\2\u0618\u061a\7\u0150\2\2\u0619\u0618"+
		"\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u0623\3\2\2\2\u061b\u061c\7\u009b\2"+
		"\2\u061c\u061d\7U\2\2\u061d\u061e\5\u00e4s\2\u061e\u0620\5\u00f4{\2\u061f"+
		"\u0621\7\u0150\2\2\u0620\u061f\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0623"+
		"\3\2\2\2\u0622\u05ff\3\2\2\2\u0622\u060a\3\2\2\2\u0622\u061b\3\2\2\2\u0623"+
		"o\3\2\2\2\u0624\u0625\b9\1\2\u0625\u0626\7\u0157\2\2\u0626\u0639\5p9\7"+
		"\u0627\u0628\t\25\2\2\u0628\u0639\5p9\5\u0629\u0639\7\60\2\2\u062a\u0639"+
		"\7j\2\2\u062b\u0639\7\u0135\2\2\u062c\u0639\5\u0100\u0081\2\u062d\u0639"+
		"\5\u00b6\\\2\u062e\u0639\5\u00ceh\2\u062f\u0639\5\u00ecw\2\u0630\u0631"+
		"\7\u014d\2\2\u0631\u0632\5p9\2\u0632\u0633\7\u014e\2\2\u0633\u0639\3\2"+
		"\2\2\u0634\u0635\7\u014d\2\2\u0635\u0636\5t;\2\u0636\u0637\7\u014e\2\2"+
		"\u0637\u0639\3\2\2\2\u0638\u0624\3\2\2\2\u0638\u0627\3\2\2\2\u0638\u0629"+
		"\3\2\2\2\u0638\u062a\3\2\2\2\u0638\u062b\3\2\2\2\u0638\u062c\3\2\2\2\u0638"+
		"\u062d\3\2\2\2\u0638\u062e\3\2\2\2\u0638\u062f\3\2\2\2\u0638\u0630\3\2"+
		"\2\2\u0638\u0634\3\2\2\2\u0639\u0649\3\2\2\2\u063a\u063b\f\6\2\2\u063b"+
		"\u063c\t\26\2\2\u063c\u0648\5p9\7\u063d\u063e\f\4\2\2\u063e\u063f\t\27"+
		"\2\2\u063f\u0648\5p9\5\u0640\u0641\f\3\2\2\u0641\u0642\5\u010a\u0086\2"+
		"\u0642\u0643\5p9\4\u0643\u0648\3\2\2\2\u0644\u0645\f\f\2\2\u0645\u0646"+
		"\7\33\2\2\u0646\u0648\5\u0106\u0084\2\u0647\u063a\3\2\2\2\u0647\u063d"+
		"\3\2\2\2\u0647\u0640\3\2\2\2\u0647\u0644\3\2\2\2\u0648\u064b\3\2\2\2\u0649"+
		"\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064aq\3\2\2\2\u064b\u0649\3\2\2\2"+
		"\u064c\u0655\7j\2\2\u064d\u0655\5\u0100\u0081\2\u064e\u0655\5\u00b6\\"+
		"\2\u064f\u0655\7\u0135\2\2\u0650\u0651\7\u014d\2\2\u0651\u0652\5r:\2\u0652"+
		"\u0653\7\u014e\2\2\u0653\u0655\3\2\2\2\u0654\u064c\3\2\2\2\u0654\u064d"+
		"\3\2\2\2\u0654\u064e\3\2\2\2\u0654\u064f\3\2\2\2\u0654\u0650\3\2\2\2\u0655"+
		"s\3\2\2\2\u0656\u0657\5\22\n\2\u0657u\3\2\2\2\u0658\u0659\5\u008cG\2\u0659"+
		"w\3\2\2\2\u065a\u065d\7\u00bb\2\2\u065b\u065c\7\u012e\2\2\u065c\u065e"+
		"\7\u014f\2\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\3\2\2"+
		"\2\u065f\u0664\5z>\2\u0660\u0661\7\u014f\2\2\u0661\u0663\5z>\2\u0662\u0660"+
		"\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665"+
		"y\3\2\2\2\u0666\u0664\3\2\2\2\u0667\u066c\5\u0106\u0084\2\u0668\u0669"+
		"\7\u014d\2\2\u0669\u066a\5\u00eex\2\u066a\u066b\7\u014e\2\2\u066b\u066d"+
		"\3\2\2\2\u066c\u0668\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e\3\2\2\2\u066e"+
		"\u066f\7\b\2\2\u066f\u0670\7\u014d\2\2\u0670\u0671\5\22\n\2\u0671\u0672"+
		"\7\u014e\2\2\u0672{\3\2\2\2\u0673\u0676\5\u00ecw\2\u0674\u0676\7\u0135"+
		"\2\2\u0675\u0673\3\2\2\2\u0675\u0674\3\2\2\2\u0676\u0679\3\2\2\2\u0677"+
		"\u067a\7\u013c\2\2\u0678\u067a\5\u010c\u0087\2\u0679\u0677\3\2\2\2\u0679"+
		"\u0678\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u0684\5p9\2\u067c\u067d\5\u0106"+
		"\u0084\2\u067d\u067e\7\u0148\2\2\u067e\u067f\5\u0106\u0084\2\u067f\u0680"+
		"\7\u014d\2\2\u0680\u0681\5\u00ccg\2\u0681\u0682\7\u014e\2\2\u0682\u0684"+
		"\3\2\2\2\u0683\u0675\3\2\2\2\u0683\u067c\3\2\2\2\u0684}\3\2\2\2\u0685"+
		"\u068a\5\u0080A\2\u0686\u0687\7\u014f\2\2\u0687\u0689\5\u0080A\2\u0688"+
		"\u0686\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2"+
		"\2\2\u068b\177\3\2\2\2\u068c\u068a\3\2\2\2\u068d\u0692\5\u0082B\2\u068e"+
		"\u068f\7\6\2\2\u068f\u0691\5\u0082B\2\u0690\u068e\3\2\2\2\u0691\u0694"+
		"\3\2\2\2\u0692\u0690\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0081\3\2\2\2\u0694"+
		"\u0692\3\2\2\2\u0695\u069a\5\u0084C\2\u0696\u0697\7v\2\2\u0697\u0699\5"+
		"\u0084C\2\u0698\u0696\3\2\2\2\u0699\u069c\3\2\2\2\u069a\u0698\3\2\2\2"+
		"\u069a\u069b\3\2\2\2\u069b\u0083\3\2\2\2\u069c\u069a\3\2\2\2\u069d\u069f"+
		"\7i\2\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0"+
		"\u06a1\5\u0086D\2\u06a1\u0085\3\2\2\2\u06a2\u06a3\7A\2\2\u06a3\u06a4\7"+
		"\u014d\2\2\u06a4\u06a5\5t;\2\u06a5\u06a6\7\u014e\2\2\u06a6\u06da\3\2\2"+
		"\2\u06a7\u06a8\5p9\2\u06a8\u06a9\5\u010a\u0086\2\u06a9\u06aa\5p9\2\u06aa"+
		"\u06da\3\2\2\2\u06ab\u06ac\5p9\2\u06ac\u06ad\5\u010a\u0086\2\u06ad\u06ae"+
		"\t\30\2\2\u06ae\u06af\7\u014d\2\2\u06af\u06b0\5t;\2\u06b0\u06b1\7\u014e"+
		"\2\2\u06b1\u06da\3\2\2\2\u06b2\u06b4\5p9\2\u06b3\u06b5\7i\2\2\u06b4\u06b3"+
		"\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b7\7\r\2\2\u06b7"+
		"\u06b8\5p9\2\u06b8\u06b9\7\6\2\2\u06b9\u06ba\5p9\2\u06ba\u06da\3\2\2\2"+
		"\u06bb\u06bd\5p9\2\u06bc\u06be\7i\2\2\u06bd\u06bc\3\2\2\2\u06bd\u06be"+
		"\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c0\7W\2\2\u06c0\u06c3\7\u014d\2"+
		"\2\u06c1\u06c4\5t;\2\u06c2\u06c4\5\u00ccg\2\u06c3\u06c1\3\2\2\2\u06c3"+
		"\u06c2\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\7\u014e\2\2\u06c6\u06da"+
		"\3\2\2\2\u06c7\u06c9\5p9\2\u06c8\u06ca\7i\2\2\u06c9\u06c8\3\2\2\2\u06c9"+
		"\u06ca\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cc\7b\2\2\u06cc\u06cf\5p9"+
		"\2\u06cd\u06ce\7=\2\2\u06ce\u06d0\5p9\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0"+
		"\3\2\2\2\u06d0\u06da\3\2\2\2\u06d1\u06d2\5p9\2\u06d2\u06d3\7]\2\2\u06d3"+
		"\u06d4\5\u00f8}\2\u06d4\u06da\3\2\2\2\u06d5\u06d6\7\u014d\2\2\u06d6\u06d7"+
		"\5\u0080A\2\u06d7\u06d8\7\u014e\2\2\u06d8\u06da\3\2\2\2\u06d9\u06a2\3"+
		"\2\2\2\u06d9\u06a7\3\2\2\2\u06d9\u06ab\3\2\2\2\u06d9\u06b2\3\2\2\2\u06d9"+
		"\u06bb\3\2\2\2\u06d9\u06c7\3\2\2\2\u06d9\u06d1\3\2\2\2\u06d9\u06d5\3\2"+
		"\2\2\u06da\u0087\3\2\2\2\u06db\u06e1\5\u008cG\2\u06dc\u06dd\7\u014d\2"+
		"\2\u06dd\u06de\5\u0088E\2\u06de\u06df\7\u014e\2\2\u06df\u06e1\3\2\2\2"+
		"\u06e0\u06db\3\2\2\2\u06e0\u06dc\3\2\2\2\u06e1\u06e5\3\2\2\2\u06e2\u06e4"+
		"\5\u008aF\2\u06e3\u06e2\3\2\2\2\u06e4\u06e7\3\2\2\2\u06e5\u06e3\3\2\2"+
		"\2\u06e5\u06e6\3\2\2\2\u06e6\u0089\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e8\u06ea"+
		"\7\u00ad\2\2\u06e9\u06eb\7\4\2\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2\2"+
		"\2\u06eb\u06ef\3\2\2\2\u06ec\u06ef\7>\2\2\u06ed\u06ef\7[\2\2\u06ee\u06e8"+
		"\3\2\2\2\u06ee\u06ec\3\2\2\2\u06ee\u06ed\3\2\2\2\u06ef\u06f9\3\2\2\2\u06f0"+
		"\u06fa\5\u008cG\2\u06f1\u06f2\7\u014d\2\2\u06f2\u06f3\5\u0088E\2\u06f3"+
		"\u06f4\7\u014e\2\2\u06f4\u06f6\3\2\2\2\u06f5\u06f1\3\2\2\2\u06f6\u06f7"+
		"\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fa\3\2\2\2\u06f9"+
		"\u06f0\3\2\2\2\u06f9\u06f5\3\2\2\2\u06fa\u008b\3\2\2\2\u06fb\u06fd\7\u0096"+
		"\2\2\u06fc\u06fe\t\31\2\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe"+
		"\u0708\3\2\2\2\u06ff\u0700\7\u00a6\2\2\u0700\u0702\5p9\2\u0701\u0703\7"+
		"z\2\2\u0702\u0701\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0706\3\2\2\2\u0704"+
		"\u0705\7\u00bb\2\2\u0705\u0707\7\u0120\2\2\u0706\u0704\3\2\2\2\u0706\u0707"+
		"\3\2\2\2\u0707\u0709\3\2\2\2\u0708\u06ff\3\2\2\2\u0708\u0709\3\2\2\2\u0709"+
		"\u070a\3\2\2\2\u070a\u070d\5\u009eP\2\u070b\u070c\7\\\2\2\u070c\u070e"+
		"\5\u00e4s\2\u070d\u070b\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0718\3\2\2"+
		"\2\u070f\u0710\7L\2\2\u0710\u0715\5\u00a4S\2\u0711\u0712\7\u014f\2\2\u0712"+
		"\u0714\5\u00a4S\2\u0713\u0711\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713"+
		"\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0719\3\2\2\2\u0717\u0715\3\2\2\2\u0718"+
		"\u070f\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071c\3\2\2\2\u071a\u071b\7\u00b9"+
		"\2\2\u071b\u071d\5\u0080A\2\u071c\u071a\3\2\2\2\u071c\u071d\3\2\2\2\u071d"+
		"\u0728\3\2\2\2\u071e\u071f\7Q\2\2\u071f\u0720\7\21\2\2\u0720\u0725\5\u0096"+
		"L\2\u0721\u0722\7\u014f\2\2\u0722\u0724\5\u0096L\2\u0723\u0721\3\2\2\2"+
		"\u0724\u0727\3\2\2\2\u0725\u0723\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0729"+
		"\3\2\2\2\u0727\u0725\3\2\2\2\u0728\u071e\3\2\2\2\u0728\u0729\3\2\2\2\u0729"+
		"\u072c\3\2\2\2\u072a\u072b\7R\2\2\u072b\u072d\5\u0080A\2\u072c\u072a\3"+
		"\2\2\2\u072c\u072d\3\2\2\2\u072d\u008d\3\2\2\2\u072e\u072f\7w\2\2\u072f"+
		"\u0730\7\21\2\2\u0730\u0735\5\u0094K\2\u0731\u0732\7\u014f\2\2\u0732\u0734"+
		"\5\u0094K\2\u0733\u0731\3\2\2\2\u0734\u0737\3\2\2\2\u0735\u0733\3\2\2"+
		"\2\u0735\u0736\3\2\2\2\u0736\u0743\3\2\2\2\u0737\u0735\3\2\2\2\u0738\u0739"+
		"\7\u00fa\2\2\u0739\u073a\5p9\2\u073a\u0741\t\32\2\2\u073b\u073c\7D\2\2"+
		"\u073c\u073d\t\33\2\2\u073d\u073e\5p9\2\u073e\u073f\t\32\2\2\u073f\u0740"+
		"\7\u00fb\2\2\u0740\u0742\3\2\2\2\u0741\u073b\3\2\2\2\u0741\u0742\3\2\2"+
		"\2\u0742\u0744\3\2\2\2\u0743\u0738\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u008f"+
		"\3\2\2\2\u0745\u0746\7G\2\2\u0746\u0759\7\17\2\2\u0747\u0748\7G\2\2\u0748"+
		"\u0749\7\u012d\2\2\u0749\u074b\7\u00c0\2\2\u074a\u074c\5\u0092J\2\u074b"+
		"\u074a\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u0759\3\2\2\2\u074d\u074e\7G"+
		"\2\2\u074e\u074f\7\u012d\2\2\u074f\u0753\7\u0102\2\2\u0750\u0751\7\u014d"+
		"\2\2\u0751\u0752\7\u0138\2\2\u0752\u0754\7\u014e\2\2\u0753\u0750\3\2\2"+
		"\2\u0753\u0754\3\2\2\2\u0754\u0756\3\2\2\2\u0755\u0757\5\u0092J\2\u0756"+
		"\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0759\3\2\2\2\u0758\u0745\3\2"+
		"\2\2\u0758\u0747\3\2\2\2\u0758\u074d\3\2\2\2\u0759\u0091\3\2\2\2\u075a"+
		"\u075f\7\u014f\2\2\u075b\u075c\7\u0139\2\2\u075c\u0760\7\u00c2\2\2\u075d"+
		"\u0760\7\u0123\2\2\u075e\u0760\7\u010d\2\2\u075f\u075b\3\2\2\2\u075f\u075d"+
		"\3\2\2\2\u075f\u075e\3\2\2\2\u0760\u0093\3\2\2\2\u0761\u0763\5p9\2\u0762"+
		"\u0764\t\34\2\2\u0763\u0762\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0095\3"+
		"\2\2\2\u0765\u0766\5p9\2\u0766\u0097\3\2\2\2\u0767\u0768\7u\2\2\u0768"+
		"\u0769\7\u014d\2\2\u0769\u076e\5\u009aN\2\u076a\u076b\7\u014f\2\2\u076b"+
		"\u076d\5\u009aN\2\u076c\u076a\3\2\2\2\u076d\u0770\3\2\2\2\u076e\u076c"+
		"\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0771\3\2\2\2\u0770\u076e\3\2\2\2\u0771"+
		"\u0772\7\u014e\2\2\u0772\u0099\3\2\2\2\u0773\u0774\7\u00d8\2\2\u0774\u078c"+
		"\7\u0136\2\2\u0775\u0776\t\35\2\2\u0776\u078c\7Q\2\2\u0777\u0778\t\36"+
		"\2\2\u0778\u078c\7\u00ad\2\2\u0779\u077a\7\u00e6\2\2\u077a\u078c\7|\2"+
		"\2\u077b\u077c\7\u00fd\2\2\u077c\u077d\7G\2\2\u077d\u077e\7\u014d\2\2"+
		"\u077e\u0783\5\u009cO\2\u077f\u0780\7\u014f\2\2\u0780\u0782\5\u009cO\2"+
		"\u0781\u077f\3\2\2\2\u0782\u0785\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784"+
		"\3\2\2\2\u0784\u0786\3\2\2\2\u0785\u0783\3\2\2\2\u0786\u0787\7\u014e\2"+
		"\2\u0787\u078c\3\2\2\2\u0788\u0789\7\u00fd\2\2\u0789\u078a\7G\2\2\u078a"+
		"\u078c\7\u0127\2\2\u078b\u0773\3\2\2\2\u078b\u0775\3\2\2\2\u078b\u0777"+
		"\3\2\2\2\u078b\u0779\3\2\2\2\u078b\u077b\3\2\2\2\u078b\u0788\3\2\2\2\u078c"+
		"\u009b\3\2\2\2\u078d\u0791\7\u0135\2\2\u078e\u0792\7\u0127\2\2\u078f\u0790"+
		"\7\u013c\2\2\u0790\u0792\5\u0100\u0081\2\u0791\u078e\3\2\2\2\u0791\u078f"+
		"\3\2\2\2\u0792\u009d\3\2\2\2\u0793\u0798\5\u00a0Q\2\u0794\u0795\7\u014f"+
		"\2\2\u0795\u0797\5\u00a0Q\2\u0796\u0794\3\2\2\2\u0797\u079a\3\2\2\2\u0798"+
		"\u0796\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u009f\3\2\2\2\u079a\u0798\3\2"+
		"\2\2\u079b\u079c\5\u00e4s\2\u079c\u079d\7\u0148\2\2\u079d\u079f\3\2\2"+
		"\2\u079e\u079b\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a3\3\2\2\2\u07a0\u07a4"+
		"\7\u0152\2\2\u07a1\u07a2\7\u014c\2\2\u07a2\u07a4\t\37\2\2\u07a3\u07a0"+
		"\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a4\u07b1\3\2\2\2\u07a5\u07a6\5\u00c8e"+
		"\2\u07a6\u07a7\7\u013c\2\2\u07a7\u07a8\5p9\2\u07a8\u07b1\3\2\2\2\u07a9"+
		"\u07ae\5p9\2\u07aa\u07ac\7\b\2\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3\2\2"+
		"\2\u07ac\u07ad\3\2\2\2\u07ad\u07af\5\u00c8e\2\u07ae\u07ab\3\2\2\2\u07ae"+
		"\u07af\3\2\2\2\u07af\u07b1\3\2\2\2\u07b0\u079e\3\2\2\2\u07b0\u07a5\3\2"+
		"\2\2\u07b0\u07a9\3\2\2\2\u07b1\u00a1\3\2\2\2\u07b2\u07b3\7\u0101\2\2\u07b3"+
		"\u07b4\7\21\2\2\u07b4\u07b5\5\u00ccg\2\u07b5\u00a3\3\2\2\2\u07b6\u07bc"+
		"\5\u00a6T\2\u07b7\u07b8\7\u014d\2\2\u07b8\u07b9\5\u00a6T\2\u07b9\u07ba"+
		"\7\u014e\2\2\u07ba\u07bc\3\2\2\2\u07bb\u07b6\3\2\2\2\u07bb\u07b7\3\2\2"+
		"\2\u07bc\u00a5\3\2\2\2\u07bd\u07c1\5\u00a8U\2\u07be\u07c0\5\u00acW\2\u07bf"+
		"\u07be\3\2\2\2\u07c0\u07c3\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2"+
		"\2\2\u07c2\u00a7\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c4\u07c6\5\u00aeX\2\u07c5"+
		"\u07c7\5\u00ba^\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7\u07e8"+
		"\3\2\2\2\u07c8\u07ca\5\u00b0Y\2\u07c9\u07cb\5\u00ba^\2\u07ca\u07c9\3\2"+
		"\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07e8\3\2\2\2\u07cc\u07d1\5\u00b4[\2\u07cd"+
		"\u07cf\5\u00ba^\2\u07ce\u07d0\5\u00c6d\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0"+
		"\3\2\2\2\u07d0\u07d2\3\2\2\2\u07d1\u07cd\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2"+
		"\u07e8\3\2\2\2\u07d3\u07d4\5\u00aaV\2\u07d4\u07d5\5\u00ba^\2\u07d5\u07e8"+
		"\3\2\2\2\u07d6\u07d8\5\u00b6\\\2\u07d7\u07d9\5\u00ba^\2\u07d8\u07d7\3"+
		"\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07e8\3\2\2\2\u07da\u07dc\7\u0135\2\2"+
		"\u07db\u07dd\5\u00ba^\2\u07dc\u07db\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd"+
		"\u07e8\3\2\2\2\u07de\u07df\7\u0135\2\2\u07df\u07e0\7\u0148\2\2\u07e0\u07e5"+
		"\5\u00b6\\\2\u07e1\u07e3\5\u00ba^\2\u07e2\u07e4\5\u00c6d\2\u07e3\u07e2"+
		"\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e6\3\2\2\2\u07e5\u07e1\3\2\2\2\u07e5"+
		"\u07e6\3\2\2\2\u07e6\u07e8\3\2\2\2\u07e7\u07c4\3\2\2\2\u07e7\u07c8\3\2"+
		"\2\2\u07e7\u07cc\3\2\2\2\u07e7\u07d3\3\2\2\2\u07e7\u07d6\3\2\2\2\u07e7"+
		"\u07da\3\2\2\2\u07e7\u07de\3\2\2\2\u07e8\u00a9\3\2\2\2\u07e9\u07ea\7\24"+
		"\2\2\u07ea\u07eb\7\u014d\2\2\u07eb\u07ec\7\25\2\2\u07ec\u07ed\5\u00e4"+
		"s\2\u07ed\u07ee\7\u014f\2\2\u07ee\u07ef\t \2\2\u07ef\u07f0\7\u014e\2\2"+
		"\u07f0\u00ab\3\2\2\2\u07f1\u07f3\7Y\2\2\u07f2\u07f1\3\2\2\2\u07f2\u07f3"+
		"\3\2\2\2\u07f3\u07f9\3\2\2\2\u07f4\u07f6\t!\2\2\u07f5\u07f7\7x\2\2\u07f6"+
		"\u07f5\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f9\3\2\2\2\u07f8\u07f2\3\2"+
		"\2\2\u07f8\u07f4\3\2\2\2\u07f9\u07fb\3\2\2\2\u07fa\u07fc\t\"\2\2\u07fb"+
		"\u07fa\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07fe\7^"+
		"\2\2\u07fe\u07ff\5\u00a4S\2\u07ff\u0800\7o\2\2\u0800\u0801\5\u0080A\2"+
		"\u0801\u080c\3\2\2\2\u0802\u0803\7%\2\2\u0803\u0804\7^\2\2\u0804\u080c"+
		"\5\u00a4S\2\u0805\u0806\7%\2\2\u0806\u0807\7\u00bf\2\2\u0807\u080c\5\u00a4"+
		"S\2\u0808\u0809\7x\2\2\u0809\u080a\7\u00bf\2\2\u080a\u080c\5\u00a4S\2"+
		"\u080b\u07f8\3\2\2\2\u080b\u0802\3\2\2\2\u080b\u0805\3\2\2\2\u080b\u0808"+
		"\3\2\2\2\u080c\u00ad\3\2\2\2\u080d\u080f\5\u00e4s\2\u080e\u0810\5\u00be"+
		"`\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u00af\3\2\2\2\u0811"+
		"\u0812\7s\2\2\u0812\u0813\7\u014d\2\2\u0813\u0814\7\20\2\2\u0814\u0815"+
		"\7\u0138\2\2\u0815\u081f\7\u014f\2\2\u0816\u081b\5\u00b2Z\2\u0817\u0818"+
		"\7\u014f\2\2\u0818\u081a\5\u00b2Z\2\u0819\u0817\3\2\2\2\u081a\u081d\3"+
		"\2\2\2\u081b\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u0820\3\2\2\2\u081d"+
		"\u081b\3\2\2\2\u081e\u0820\5\u0106\u0084\2\u081f\u0816\3\2\2\2\u081f\u081e"+
		"\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0822\7\u014e\2\2\u0822\u00b1\3\2\2"+
		"\2\u0823\u0824\5\u0106\u0084\2\u0824\u0825\7\u013c\2\2\u0825\u0826\t#"+
		"\2\2\u0826\u00b3\3\2\2\2\u0827\u082e\5t;\2\u0828\u0829\7\u014d\2\2\u0829"+
		"\u082a\5t;\2\u082a\u082b\7\u014e\2\2\u082b\u082e\3\2\2\2\u082c\u082e\5"+
		"\u00caf\2\u082d\u0827\3\2\2\2\u082d\u0828\3\2\2\2\u082d\u082c\3\2\2\2"+
		"\u082e\u00b5\3\2\2\2\u082f\u0891\5\u00d0i\2\u0830\u0891\5\u00d2j\2\u0831"+
		"\u0832\5\u00fa~\2\u0832\u0834\7\u014d\2\2\u0833\u0835\5\u00ccg\2\u0834"+
		"\u0833\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0837\7\u014e"+
		"\2\2\u0837\u0891\3\2\2\2\u0838\u0839\7\u00c3\2\2\u0839\u083a\7\u014d\2"+
		"\2\u083a\u083b\7\u0152\2\2\u083b\u0891\7\u014e\2\2\u083c\u083d\7\u00c5"+
		"\2\2\u083d\u083e\7\u014d\2\2\u083e\u083f\5p9\2\u083f\u0840\7\b\2\2\u0840"+
		"\u0841\5\u00fc\177\2\u0841\u0842\7\u014e\2\2\u0842\u0891\3\2\2\2\u0843"+
		"\u0844\7#\2\2\u0844\u0845\7\u014d\2\2\u0845\u0846\5\u00fc\177\2\u0846"+
		"\u0847\7\u014f\2\2\u0847\u084a\5p9\2\u0848\u0849\7\u014f\2\2\u0849\u084b"+
		"\5p9\2\u084a\u0848\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u084c\3\2\2\2\u084c"+
		"\u084d\7\u014e\2\2\u084d\u0891\3\2\2\2\u084e\u084f\7\u00c7\2\2\u084f\u0850"+
		"\7\u014d\2\2\u0850\u0851\7\u0152\2\2\u0851\u0891\7\u014e\2\2\u0852\u0853"+
		"\7\32\2\2\u0853\u0854\7\u014d\2\2\u0854\u0855\5\u00ccg\2\u0855\u0856\7"+
		"\u014e\2\2\u0856\u0891\3\2\2\2\u0857\u0891\7)\2\2\u0858\u0891\7*\2\2\u0859"+
		"\u085a\7\u00ce\2\2\u085a\u085b\7\u014d\2\2\u085b\u085c\5\u00b8]\2\u085c"+
		"\u085d\7\u014f\2\2\u085d\u085e\5p9\2\u085e\u085f\7\u014f\2\2\u085f\u0860"+
		"\5p9\2\u0860\u0861\7\u014e\2\2\u0861\u0891\3\2\2\2\u0862\u0863\7\u00cf"+
		"\2\2\u0863\u0864\7\u014d\2\2\u0864\u0865\5\u00b8]\2\u0865\u0866\7\u014f"+
		"\2\2\u0866\u0867\5p9\2\u0867\u0868\7\u014f\2\2\u0868\u0869\5p9\2\u0869"+
		"\u086a\7\u014e\2\2\u086a\u0891\3\2\2\2\u086b\u086c\7\u00d0\2\2\u086c\u086d"+
		"\7\u014d\2\2\u086d\u086e\5\u00b8]\2\u086e\u086f\7\u014f\2\2\u086f\u0870"+
		"\5p9\2\u0870\u0871\7\u014e\2\2\u0871\u0891\3\2\2\2\u0872\u0873\7\u00d1"+
		"\2\2\u0873\u0874\7\u014d\2\2\u0874\u0875\5\u00b8]\2\u0875\u0876\7\u014f"+
		"\2\2\u0876\u0877\5p9\2\u0877\u0878\7\u014e\2\2\u0878\u0891\3\2\2\2\u0879"+
		"\u087a\7S\2\2\u087a\u087b\7\u014d\2\2\u087b\u087e\5\u00fc\177\2\u087c"+
		"\u087d\7\u014f\2\2\u087d\u087f\7\u0136\2\2\u087e\u087c\3\2\2\2\u087e\u087f"+
		"\3\2\2\2\u087f\u0882\3\2\2\2\u0880\u0881\7\u014f\2\2\u0881\u0883\7\u0136"+
		"\2\2\u0882\u0880\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0884\3\2\2\2\u0884"+
		"\u0885\7\u014e\2\2\u0885\u0891\3\2\2\2\u0886\u0891\7\u00f1\2\2\u0887\u0888"+
		"\7k\2\2\u0888\u0889\7\u014d\2\2\u0889\u088a\5p9\2\u088a\u088b\7\u014f"+
		"\2\2\u088b\u088c\5p9\2\u088c\u088d\7\u014e\2\2\u088d\u0891\3\2\2\2\u088e"+
		"\u0891\7\u009a\2\2\u088f\u0891\7\u00a0\2\2\u0890\u082f\3\2\2\2\u0890\u0830"+
		"\3\2\2\2\u0890\u0831\3\2\2\2\u0890\u0838\3\2\2\2\u0890\u083c\3\2\2\2\u0890"+
		"\u0843\3\2\2\2\u0890\u084e\3\2\2\2\u0890\u0852\3\2\2\2\u0890\u0857\3\2"+
		"\2\2\u0890\u0858\3\2\2\2\u0890\u0859\3\2\2\2\u0890\u0862\3\2\2\2\u0890"+
		"\u086b\3\2\2\2\u0890\u0872\3\2\2\2\u0890\u0879\3\2\2\2\u0890\u0886\3\2"+
		"\2\2\u0890\u0887\3\2\2\2\u0890\u088e\3\2\2\2\u0890\u088f\3\2\2\2\u0891"+
		"\u00b7\3\2\2\2\u0892\u0893\7\u0137\2\2\u0893\u00b9\3\2\2\2\u0894\u0896"+
		"\7\b\2\2\u0895\u0894\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0897\3\2\2\2\u0897"+
		"\u0898\5\u00bc_\2\u0898\u00bb\3\2\2\2\u0899\u089b\5\u0106\u0084\2\u089a"+
		"\u089c\5\u00be`\2\u089b\u089a\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u00bd"+
		"\3\2\2\2\u089d\u089f\7\u00bb\2\2\u089e\u089d\3\2\2\2\u089e\u089f\3\2\2"+
		"\2\u089f\u08a0\3\2\2\2\u08a0\u08a1\7\u014d\2\2\u08a1\u08a6\5\u00c0a\2"+
		"\u08a2\u08a3\7\u014f\2\2\u08a3\u08a5\5\u00c0a\2\u08a4\u08a2\3\2\2\2\u08a5"+
		"\u08a8\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08a9\3\2"+
		"\2\2\u08a8\u08a6\3\2\2\2\u08a9\u08aa\7\u014e\2\2\u08aa\u00bf\3\2\2\2\u08ab"+
		"\u08ad\7\u00f6\2\2\u08ac\u08ab\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08d4"+
		"\3\2\2\2\u08ae\u08af\7X\2\2\u08af\u08b0\7\u014d\2\2\u08b0\u08b5\5\u00c4"+
		"c\2\u08b1\u08b2\7\u014f\2\2\u08b2\u08b4\5\u00c4c\2\u08b3\u08b1\3\2\2\2"+
		"\u08b4\u08b7\3\2\2\2\u08b5\u08b3\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b8"+
		"\3\2\2\2\u08b7\u08b5\3\2\2\2\u08b8\u08b9\7\u014e\2\2\u08b9\u08d5\3\2\2"+
		"\2\u08ba\u08bb\7X\2\2\u08bb\u08bc\7\u013c\2\2\u08bc\u08d5\5\u00c4c\2\u08bd"+
		"\u08cc\7H\2\2\u08be\u08bf\7\u014d\2\2\u08bf\u08c0\5\u00c4c\2\u08c0\u08c1"+
		"\7\u014d\2\2\u08c1\u08c6\5\u00c2b\2\u08c2\u08c3\7\u014f\2\2\u08c3\u08c5"+
		"\5\u00c2b\2\u08c4\u08c2\3\2\2\2\u08c5\u08c8\3\2\2\2\u08c6\u08c4\3\2\2"+
		"\2\u08c6\u08c7\3\2\2\2\u08c7\u08c9\3\2\2\2\u08c8\u08c6\3\2\2\2\u08c9\u08ca"+
		"\7\u014e\2\2\u08ca\u08cb\7\u014e\2\2\u08cb\u08cd\3\2\2\2\u08cc\u08be\3"+
		"\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08d5\3\2\2\2\u08ce\u08d5\7\u0117\2\2"+
		"\u08cf\u08d5\7\u0118\2\2\u08d0\u08d1\7\u0119\2\2\u08d1\u08d2\7\u013c\2"+
		"\2\u08d2\u08d5\7\u0136\2\2\u08d3\u08d5\7\u0137\2\2\u08d4\u08ae\3\2\2\2"+
		"\u08d4\u08ba\3\2\2\2\u08d4\u08bd\3\2\2\2\u08d4\u08ce\3\2\2\2\u08d4\u08cf"+
		"\3\2\2\2\u08d4\u08d0\3\2\2\2\u08d4";
	private static final String _serializedATNSegment1 =
		"\u08d3\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u00c1\3\2\2\2\u08d6\u08d7\7\u0137"+
		"\2\2\u08d7\u00c3\3\2\2\2\u08d8\u08d9\t$\2\2\u08d9\u00c5\3\2\2\2\u08da"+
		"\u08db\7\u014d\2\2\u08db\u08e0\5\u00c8e\2\u08dc\u08dd\7\u014f\2\2\u08dd"+
		"\u08df\5\u00c8e\2\u08de\u08dc\3\2\2\2\u08df\u08e2\3\2\2\2\u08e0\u08de"+
		"\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e3\3\2\2\2\u08e2\u08e0\3\2\2\2\u08e3"+
		"\u08e4\7\u014e\2\2\u08e4\u00c7\3\2\2\2\u08e5\u08e8\5\u0106\u0084\2\u08e6"+
		"\u08e8\7\u0138\2\2\u08e7\u08e5\3\2\2\2\u08e7\u08e6\3\2\2\2\u08e8\u00c9"+
		"\3\2\2\2\u08e9\u08ea\7\u00b4\2\2\u08ea\u08eb\7\u014d\2\2\u08eb\u08ec\5"+
		"\u00ccg\2\u08ec\u08f4\7\u014e\2\2\u08ed\u08ee\7\u014f\2\2\u08ee\u08ef"+
		"\7\u014d\2\2\u08ef\u08f0\5\u00ccg\2\u08f0\u08f1\7\u014e\2\2\u08f1\u08f3"+
		"\3\2\2\2\u08f2\u08ed\3\2\2\2\u08f3\u08f6\3\2\2\2\u08f4\u08f2\3\2\2\2\u08f4"+
		"\u08f5\3\2\2\2\u08f5\u00cb\3\2\2\2\u08f6\u08f4\3\2\2\2\u08f7\u08fc\5p"+
		"9\2\u08f8\u08f9\7\u014f\2\2\u08f9\u08fb\5p9\2\u08fa\u08f8\3\2\2\2\u08fb"+
		"\u08fe\3\2\2\2\u08fc\u08fa\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u00cd\3\2"+
		"\2\2\u08fe\u08fc\3\2\2\2\u08ff\u0900\7\23\2\2\u0900\u0906\5p9\2\u0901"+
		"\u0902\7\u00b8\2\2\u0902\u0903\5p9\2\u0903\u0904\7\u00a4\2\2\u0904\u0905"+
		"\5p9\2\u0905\u0907\3\2\2\2\u0906\u0901\3\2\2\2\u0907\u0908\3\2\2\2\u0908"+
		"\u0906\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090c\3\2\2\2\u090a\u090b\7:"+
		"\2\2\u090b\u090d\5p9\2\u090c\u090a\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e"+
		"\3\2\2\2\u090e\u090f\7;\2\2\u090f\u0921\3\2\2\2\u0910\u0916\7\23\2\2\u0911"+
		"\u0912\7\u00b8\2\2\u0912\u0913\5\u0080A\2\u0913\u0914\7\u00a4\2\2\u0914"+
		"\u0915\5p9\2\u0915\u0917\3\2\2\2\u0916\u0911\3\2\2\2\u0917\u0918\3\2\2"+
		"\2\u0918\u0916\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u091c\3\2\2\2\u091a\u091b"+
		"\7:\2\2\u091b\u091d\5p9\2\u091c\u091a\3\2\2\2\u091c\u091d\3\2\2\2\u091d"+
		"\u091e\3\2\2\2\u091e\u091f\7;\2\2\u091f\u0921\3\2\2\2\u0920\u08ff\3\2"+
		"\2\2\u0920\u0910\3\2\2\2\u0921\u00cf\3\2\2\2\u0922\u0923\7\u0106\2\2\u0923"+
		"\u0924\7\u014d\2\2\u0924\u0925\7\u014e\2\2\u0925\u0935\5\u00d6l\2\u0926"+
		"\u0927\7\u00d4\2\2\u0927\u0928\7\u014d\2\2\u0928\u0929\7\u014e\2\2\u0929"+
		"\u0935\5\u00d6l\2\u092a\u092b\7\u00f8\2\2\u092b\u092c\7\u014d\2\2\u092c"+
		"\u092d\5p9\2\u092d\u092e\7\u014e\2\2\u092e\u092f\5\u00d6l\2\u092f\u0935"+
		"\3\2\2\2\u0930\u0931\7\u0111\2\2\u0931\u0932\7\u014d\2\2\u0932\u0933\7"+
		"\u014e\2\2\u0933\u0935\5\u00d6l\2\u0934\u0922\3\2\2\2\u0934\u0926\3\2"+
		"\2\2\u0934\u092a\3\2\2\2\u0934\u0930\3\2\2\2\u0935\u00d1\3\2\2\2\u0936"+
		"\u0937\7\u00c1\2\2\u0937\u0938\7\u014d\2\2\u0938\u0939\5\u00d4k\2\u0939"+
		"\u093b\7\u014e\2\2\u093a\u093c\5\u00d6l\2\u093b\u093a\3\2\2\2\u093b\u093c"+
		"\3\2\2\2\u093c\u0992\3\2\2\2\u093d\u093e\7\u00c8\2\2\u093e\u093f\7\u014d"+
		"\2\2\u093f\u0940\5\u00d4k\2\u0940\u0941\7\u014e\2\2\u0941\u0992\3\2\2"+
		"\2\u0942\u0943\7\u00e0\2\2\u0943\u0944\7\u014d\2\2\u0944\u0945\5p9\2\u0945"+
		"\u0946\7\u014e\2\2\u0946\u0992\3\2\2\2\u0947\u0948\7\u00e1\2\2\u0948\u0949"+
		"\7\u014d\2\2\u0949\u094a\5\u00ccg\2\u094a\u094b\7\u014e\2\2\u094b\u0992"+
		"\3\2\2\2\u094c\u094d\7\u00ef\2\2\u094d\u094e\7\u014d\2\2\u094e\u094f\5"+
		"\u00d4k\2\u094f\u0951\7\u014e\2\2\u0950\u0952\5\u00d6l\2\u0951\u0950\3"+
		"\2\2\2\u0951\u0952\3\2\2\2\u0952\u0992\3\2\2\2\u0953\u0954\7\u00f0\2\2"+
		"\u0954\u0955\7\u014d\2\2\u0955\u0956\5\u00d4k\2\u0956\u0958\7\u014e\2"+
		"\2\u0957\u0959\5\u00d6l\2\u0958\u0957\3\2\2\2\u0958\u0959\3\2\2\2\u0959"+
		"\u0992\3\2\2\2\u095a\u095b\7\u011e\2\2\u095b\u095c\7\u014d\2\2\u095c\u095d"+
		"\5\u00d4k\2\u095d\u095f\7\u014e\2\2\u095e\u0960\5\u00d6l\2\u095f\u095e"+
		"\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u0992\3\2\2\2\u0961\u0962\7\u011c\2"+
		"\2\u0962\u0963\7\u014d\2\2\u0963\u0964\5\u00d4k\2\u0964\u0966\7\u014e"+
		"\2\2\u0965\u0967\5\u00d6l\2\u0966\u0965\3\2\2\2\u0966\u0967\3\2\2\2\u0967"+
		"\u0992\3\2\2\2\u0968\u0969\7\u011d\2\2\u0969\u096a\7\u014d\2\2\u096a\u096b"+
		"\5\u00d4k\2\u096b\u096d\7\u014e\2\2\u096c\u096e\5\u00d6l\2\u096d\u096c"+
		"\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u0992\3\2\2\2\u096f\u0970\7\u0129\2"+
		"\2\u0970\u0971\7\u014d\2\2\u0971\u0972\5\u00d4k\2\u0972\u0974\7\u014e"+
		"\2\2\u0973\u0975\5\u00d6l\2\u0974\u0973\3\2\2\2\u0974\u0975\3\2\2\2\u0975"+
		"\u0992\3\2\2\2\u0976\u0977\7\u012a\2\2\u0977\u0978\7\u014d\2\2\u0978\u0979"+
		"\5\u00d4k\2\u0979\u097b\7\u014e\2\2\u097a\u097c\5\u00d6l\2\u097b\u097a"+
		"\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u0992\3\2\2\2\u097d\u097e\7\u00cc\2"+
		"\2\u097e\u0981\7\u014d\2\2\u097f\u0982\7\u0152\2\2\u0980\u0982\5\u00d4"+
		"k\2\u0981\u097f\3\2\2\2\u0981\u0980\3\2\2\2\u0982\u0983\3\2\2\2\u0983"+
		"\u0985\7\u014e\2\2\u0984\u0986\5\u00d6l\2\u0985\u0984\3\2\2\2\u0985\u0986"+
		"\3\2\2\2\u0986\u0992\3\2\2\2\u0987\u0988\7\u00cd\2\2\u0988\u098b\7\u014d"+
		"\2\2\u0989\u098c\7\u0152\2\2\u098a\u098c\5\u00d4k\2\u098b\u0989\3\2\2"+
		"\2\u098b\u098a\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098f\7\u014e\2\2\u098e"+
		"\u0990\5\u00d6l\2\u098f\u098e\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0992"+
		"\3\2\2\2\u0991\u0936\3\2\2\2\u0991\u093d\3\2\2\2\u0991\u0942\3\2\2\2\u0991"+
		"\u0947\3\2\2\2\u0991\u094c\3\2\2\2\u0991\u0953\3\2\2\2\u0991\u095a\3\2"+
		"\2\2\u0991\u0961\3\2\2\2\u0991\u0968\3\2\2\2\u0991\u096f\3\2\2\2\u0991"+
		"\u0976\3\2\2\2\u0991\u097d\3\2\2\2\u0991\u0987\3\2\2\2\u0992\u00d3\3\2"+
		"\2\2\u0993\u0995\t\31\2\2\u0994\u0993\3\2\2\2\u0994\u0995\3\2\2\2\u0995"+
		"\u0996\3\2\2\2\u0996\u0997\5p9\2\u0997\u00d5\3\2\2\2\u0998\u0999\7y\2"+
		"\2\u0999\u099b\7\u014d\2\2\u099a\u099c\5\u00a2R\2\u099b\u099a\3\2\2\2"+
		"\u099b\u099c\3\2\2\2\u099c\u099e\3\2\2\2\u099d\u099f\5\u008eH\2\u099e"+
		"\u099d\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a1\3\2\2\2\u09a0\u09a2\5\u00d8"+
		"m\2\u09a1\u09a0\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3"+
		"\u09a4\7\u014e\2\2\u09a4\u00d7\3\2\2\2\u09a5\u09a6\t%\2\2\u09a6\u09a7"+
		"\5\u00dan\2\u09a7\u00d9\3\2\2\2\u09a8\u09af\5\u00dep\2\u09a9\u09aa\7\r"+
		"\2\2\u09aa\u09ab\5\u00dco\2\u09ab\u09ac\7\6\2\2\u09ac\u09ad\5\u00dco\2"+
		"\u09ad\u09af\3\2\2\2\u09ae\u09a8\3\2\2\2\u09ae\u09a9\3\2\2\2\u09af\u00db"+
		"\3\2\2\2\u09b0\u09b3\5\u00dep\2\u09b1\u09b3\5\u00e0q\2\u09b2\u09b0\3\2"+
		"\2\2\u09b2\u09b1\3\2\2\2\u09b3\u00dd\3\2\2\2\u09b4\u09b5\7\u0125\2\2\u09b5"+
		"\u09bb\7\u0103\2\2\u09b6\u09b7\7\u0136\2\2\u09b7\u09bb\7\u0103\2\2\u09b8"+
		"\u09b9\7&\2\2\u09b9\u09bb\7\u010e\2\2\u09ba\u09b4\3\2\2\2\u09ba\u09b6"+
		"\3\2\2\2\u09ba\u09b8\3\2\2\2\u09bb\u00df\3\2\2\2\u09bc\u09bd\7\u0125\2"+
		"\2\u09bd\u09c1\7\u00db\2\2\u09be\u09bf\7\u0136\2\2\u09bf\u09c1\7\u00db"+
		"\2\2\u09c0\u09bc\3\2\2\2\u09c0\u09be\3\2\2\2\u09c1\u00e1\3\2\2\2\u09c2"+
		"\u09c3\5\u0106\u0084\2\u09c3\u09c4\7\u0148\2\2\u09c4\u09c5\5\u0106\u0084"+
		"\2\u09c5\u09c6\7\u0148\2\2\u09c6\u09c7\5\u0106\u0084\2\u09c7\u09c8\7\u0148"+
		"\2\2\u09c8\u09d4\3\2\2\2\u09c9\u09ca\5\u0106\u0084\2\u09ca\u09cc\7\u0148"+
		"\2\2\u09cb\u09cd\5\u0106\u0084\2\u09cc\u09cb\3\2\2\2\u09cc\u09cd\3\2\2"+
		"\2\u09cd\u09ce\3\2\2\2\u09ce\u09cf\7\u0148\2\2\u09cf\u09d4\3\2\2\2\u09d0"+
		"\u09d1\5\u0106\u0084\2\u09d1\u09d2\7\u0148\2\2\u09d2\u09d4\3\2\2\2\u09d3"+
		"\u09c2\3\2\2\2\u09d3\u09c9\3\2\2\2\u09d3\u09d0\3\2\2\2\u09d3\u09d4\3\2"+
		"\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\5\u0106\u0084\2\u09d6\u00e3\3\2\2"+
		"\2\u09d7\u09d8\5\u0106\u0084\2\u09d8\u09da\7\u0148\2\2\u09d9\u09db\5\u0106"+
		"\u0084\2\u09da\u09d9\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc"+
		"\u09dd\7\u0148\2\2\u09dd\u09e2\3\2\2\2\u09de\u09df\5\u0106\u0084\2\u09df"+
		"\u09e0\7\u0148\2\2\u09e0\u09e2\3\2\2\2\u09e1\u09d7\3\2\2\2\u09e1\u09de"+
		"\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e4\5\u0106\u0084"+
		"\2\u09e4\u00e5\3\2\2\2\u09e5\u09e6\5\u0106\u0084\2\u09e6\u09e7\7\u0148"+
		"\2\2\u09e7\u09e9\3\2\2\2\u09e8\u09e5\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9"+
		"\u09ea\3\2\2\2\u09ea\u09eb\5\u0106\u0084\2\u09eb\u00e7\3\2\2\2\u09ec\u09ed"+
		"\5\u0106\u0084\2\u09ed\u09ef\7\u0148\2\2\u09ee\u09f0\5\u0106\u0084\2\u09ef"+
		"\u09ee\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u09f2\7\u0148"+
		"\2\2\u09f2\u09f7\3\2\2\2\u09f3\u09f4\5\u0106\u0084\2\u09f4\u09f5\7\u0148"+
		"\2\2\u09f5\u09f7\3\2\2\2\u09f6\u09ec\3\2\2\2\u09f6\u09f3\3\2\2\2\u09f6"+
		"\u09f7\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09f9\5\u0106\u0084\2\u09f9\u00e9"+
		"\3\2\2\2\u09fa\u09fd\5\u00e2r\2\u09fb\u09fd\7\u0135\2\2\u09fc\u09fa\3"+
		"\2\2\2\u09fc\u09fb\3\2\2\2\u09fd\u00eb\3\2\2\2\u09fe\u09ff\5\u00e4s\2"+
		"\u09ff\u0a00\7\u0148\2\2\u0a00\u0a02\3\2\2\2\u0a01\u09fe\3\2\2\2\u0a01"+
		"\u0a02\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a04\5\u00f0y\2\u0a04\u00ed"+
		"\3\2\2\2\u0a05\u0a0a\5\u00f0y\2\u0a06\u0a07\7\u014f\2\2\u0a07\u0a09\5"+
		"\u00f0y\2\u0a08\u0a06\3\2\2\2\u0a09\u0a0c\3\2\2\2\u0a0a\u0a08\3\2\2\2"+
		"\u0a0a\u0a0b\3\2\2\2\u0a0b\u00ef\3\2\2\2\u0a0c\u0a0a\3\2\2\2\u0a0d\u0a0e"+
		"\5\u0106\u0084\2\u0a0e\u00f1\3\2\2\2\u0a0f\u0a12\5\u0106\u0084\2\u0a10"+
		"\u0a12\7\u0135\2\2\u0a11\u0a0f\3\2\2\2\u0a11\u0a10\3\2\2\2\u0a12\u00f3"+
		"\3\2\2\2\u0a13\u0a14\t\17\2\2\u0a14\u00f5\3\2\2\2\u0a15\u0a16\t&\2\2\u0a16"+
		"\u00f7\3\2\2\2\u0a17\u0a19\7i\2\2\u0a18\u0a17\3\2\2\2\u0a18\u0a19\3\2"+
		"\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1b\7j\2\2\u0a1b\u00f9\3\2\2\2\u0a1c"+
		"\u0a22\5\u00e8u\2\u0a1d\u0a22\7\u008e\2\2\u0a1e\u0a22\7a\2\2\u0a1f\u0a22"+
		"\7\u00c3\2\2\u0a20\u0a22\7\u00c7\2\2\u0a21\u0a1c\3\2\2\2\u0a21\u0a1d\3"+
		"\2\2\2\u0a21\u0a1e\3\2\2\2\u0a21\u0a1f\3\2\2\2\u0a21\u0a20\3\2\2\2\u0a22"+
		"\u00fb\3\2\2\2\u0a23\u0a25\5\u0106\u0084\2\u0a24\u0a26\7S\2\2\u0a25\u0a24"+
		"\3\2\2\2\u0a25\u0a26\3\2\2\2\u0a26\u0a2e\3\2\2\2\u0a27\u0a28\7\u014d\2"+
		"\2\u0a28\u0a2b\t\'\2\2\u0a29\u0a2a\7\u014f\2\2\u0a2a\u0a2c\7\u0136\2\2"+
		"\u0a2b\u0a29\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d\u0a2f"+
		"\7\u014e\2\2\u0a2e\u0a27\3\2\2\2\u0a2e\u0a2f\3\2\2\2\u0a2f\u00fd\3\2\2"+
		"\2\u0a30\u0a33\7j\2\2\u0a31\u0a33\5\u0100\u0081\2\u0a32\u0a30\3\2\2\2"+
		"\u0a32\u0a31\3\2\2\2\u0a33\u00ff\3\2\2\2\u0a34\u0a41\7\u0138\2\2\u0a35"+
		"\u0a41\7\u0139\2\2\u0a36\u0a41\5\u0102\u0082\2\u0a37\u0a39\5\u0104\u0083"+
		"\2\u0a38\u0a37\3\2\2\2\u0a38\u0a39\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a41"+
		"\t(\2\2\u0a3b\u0a3d\5\u0104\u0083\2\u0a3c\u0a3b\3\2\2\2\u0a3c\u0a3d\3"+
		"\2\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e\u0a3f\7\u014c\2\2\u0a3f\u0a41\t)\2\2"+
		"\u0a40\u0a34\3\2\2\2\u0a40\u0a35\3\2\2\2\u0a40\u0a36\3\2\2\2\u0a40\u0a38"+
		"\3\2\2\2\u0a40\u0a3c\3\2\2\2\u0a41\u0101\3\2\2\2\u0a42\u0a44\5\u0104\u0083"+
		"\2\u0a43\u0a42\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46"+
		"\7\u0136\2\2\u0a46\u0103\3\2\2\2\u0a47\u0a48\t\25\2\2\u0a48\u0105\3\2"+
		"\2\2\u0a49\u0a4d\5\u0108\u0085\2\u0a4a\u0a4d\7\u0133\2\2\u0a4b\u0a4d\7"+
		"\u0134\2\2\u0a4c\u0a49\3\2\2\2\u0a4c\u0a4a\3\2\2\2\u0a4c\u0a4b\3\2\2\2"+
		"\u0a4d\u0107\3\2\2\2\u0a4e\u0a4f\t*\2\2\u0a4f\u0109\3\2\2\2\u0a50\u0a60"+
		"\7\u013c\2\2\u0a51\u0a60\7\u013d\2\2\u0a52\u0a60\7\u013e\2\2\u0a53\u0a54"+
		"\7\u013e\2\2\u0a54\u0a60\7\u013c\2\2\u0a55\u0a56\7\u013d\2\2\u0a56\u0a60"+
		"\7\u013c\2\2\u0a57\u0a58\7\u013e\2\2\u0a58\u0a60\7\u013d\2\2\u0a59\u0a5a"+
		"\7\u013f\2\2\u0a5a\u0a60\7\u013c\2\2\u0a5b\u0a5c\7\u013f\2\2\u0a5c\u0a60"+
		"\7\u013d\2\2\u0a5d\u0a5e\7\u013f\2\2\u0a5e\u0a60\7\u013e\2\2\u0a5f\u0a50"+
		"\3\2\2\2\u0a5f\u0a51\3\2\2\2\u0a5f\u0a52\3\2\2\2\u0a5f\u0a53\3\2\2\2\u0a5f"+
		"\u0a55\3\2\2\2\u0a5f\u0a57\3\2\2\2\u0a5f\u0a59\3\2\2\2\u0a5f\u0a5b\3\2"+
		"\2\2\u0a5f\u0a5d\3\2\2\2\u0a60\u010b\3\2\2\2\u0a61\u0a62\t+\2\2\u0a62"+
		"\u010d\3\2\2\2\u019a\u0111\u011a\u0120\u012e\u0132\u0137\u013c\u0140\u0144"+
		"\u0149\u014e\u0155\u0158\u015c\u015f\u0167\u016a\u016f\u0174\u017a\u017f"+
		"\u0184\u018a\u0190\u0197\u019b\u019d\u01a2\u01aa\u01af\u01b4\u01b8\u01bd"+
		"\u01bf\u01c9\u01cc\u01d4\u01d6\u01d9\u01df\u01e2\u01e5\u01ed\u01f0\u01f7"+
		"\u01fb\u01fd\u01ff\u0202\u0205\u0208\u020b\u0213\u0215\u0218\u021c\u021f"+
		"\u0225\u0228\u0235\u023d\u0240\u0243\u0246\u0249\u024d\u0250\u0253\u0256"+
		"\u0259\u0261\u0263\u0267\u026a\u0272\u0276\u027e\u0281\u0288\u028c\u028e"+
		"\u0290\u0293\u0296\u0299\u02a1\u02a7\u02ad\u02af\u02b3\u02b6\u02b9\u02be"+
		"\u02c3\u02c6\u02ca\u02cd\u02d7\u02de\u02e1\u02e8\u02ec\u02ee\u02f6\u02f9"+
		"\u02fd\u0303\u0309\u030c\u0310\u0314\u0317\u031c\u032c\u0330\u0334\u0336"+
		"\u0339\u0341\u0346\u034a\u0350\u0353\u035e\u0363\u036b\u036e\u0375\u0378"+
		"\u0386\u038e\u0390\u0396\u03a0\u03a3\u03a8\u03ae\u03b2\u03b8\u03bc\u03c3"+
		"\u03cc\u03d0\u03d6\u03dd\u03e1\u03e5\u03f6\u03fa\u0405\u0409\u040e\u0412"+
		"\u0414\u0418\u041c\u0420\u0424\u042a\u042e\u0430\u0435\u043d\u0440\u0443"+
		"\u044c\u0451\u0456\u0459\u045b\u045f\u0464\u0468\u046e\u0477\u047a\u047c"+
		"\u0482\u0487\u048e\u049b\u049d\u049f\u04a2\u04a5\u04ac\u04af\u04b5\u04ba"+
		"\u04bc\u04bf\u04c5\u04cb\u04cd\u04d0\u04d4\u04d7\u04dd\u04e0\u04e4\u04e7"+
		"\u04ed\u04f0\u04f2\u04f6\u04fb\u0503\u0508\u050e\u0513\u051a\u0520\u0524"+
		"\u0527\u052b\u0531\u0539\u053e\u0540\u0543\u0548\u054d\u0550\u0555\u0558"+
		"\u055b\u0561\u0567\u056b\u0570\u0573\u0579\u057d\u0583\u0589\u0592\u059c"+
		"\u05a2\u05a7\u05aa\u05b5\u05b7\u05ba\u05c4\u05c6\u05c9\u05cb\u05ce\u05d1"+
		"\u05d4\u05d7\u05da\u05e8\u05eb\u05ee\u05f7\u05fa\u05fd\u0605\u0608\u0616"+
		"\u0619\u0620\u0622\u0638\u0647\u0649\u0654\u065d\u0664\u066c\u0675\u0679"+
		"\u0683\u068a\u0692\u069a\u069e\u06b4\u06bd\u06c3\u06c9\u06cf\u06d9\u06e0"+
		"\u06e5\u06ea\u06ee\u06f7\u06f9\u06fd\u0702\u0706\u0708\u070d\u0715\u0718"+
		"\u071c\u0725\u0728\u072c\u0735\u0741\u0743\u074b\u0753\u0756\u0758\u075f"+
		"\u0763\u076e\u0783\u078b\u0791\u0798\u079e\u07a3\u07ab\u07ae\u07b0\u07bb"+
		"\u07c1\u07c6\u07ca\u07cf\u07d1\u07d8\u07dc\u07e3\u07e5\u07e7\u07f2\u07f6"+
		"\u07f8\u07fb\u080b\u080f\u081b\u081f\u082d\u0834\u084a\u087e\u0882\u0890"+
		"\u0895\u089b\u089e\u08a6\u08ac\u08b5\u08c6\u08cc\u08d4\u08e0\u08e7\u08f4"+
		"\u08fc\u0908\u090c\u0918\u091c\u0920\u0934\u093b\u0951\u0958\u095f\u0966"+
		"\u096d\u0974\u097b\u0981\u0985\u098b\u098f\u0991\u0994\u099b\u099e\u09a1"+
		"\u09ae\u09b2\u09ba\u09c0\u09cc\u09d3\u09da\u09e1\u09e8\u09ef\u09f6\u09fc"+
		"\u0a01\u0a0a\u0a11\u0a18\u0a21\u0a25\u0a2b\u0a2e\u0a32\u0a38\u0a3c\u0a40"+
		"\u0a43\u0a4c\u0a5f";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}