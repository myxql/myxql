package com.myxql.parser.spark.parser;

import com.myxql.parser.antlr4.ParseErrorListener;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.antlr4.UpperCaseCharStream;
import com.myxql.parser.model.StatementData;
import com.myxql.parser.model.StatementType;
import com.myxql.parser.spark.antlr4.SqlBaseLexer;
import com.myxql.parser.spark.antlr4.SqlBaseParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.commons.lang3.StringUtils;

public class SparkSQLFieldLineageParser {
    public static Boolean checkSupportedSQL(StatementType statementType) {
        Boolean checkRet = false;
        switch (statementType) {
            case DESC_DATABASE:
            case CREATE_TABLE:
            case CREATE_TABLE_AS_SELECT:
            case REPLACE_TABLE:
            case REPLACE_TABLE_AS_SELECT:
            case CREATE_TABLE_AS_LIKE:
            case DROP_TABLE:
            case TRUNCATE_TABLE:
            case MERGE_TABLE:
            case REFRESH_TABLE:
            case LOAD_TEMP_TABLE:
            case EXPORT_TABLE:
            case ANALYZE_TABLE:

            case ALTER_TABLE_RENAME:
            case ALTER_TABLE_ADD_COLS:
            case ALTER_TABLE_PROPERTIES:
            case ALTER_TABLE_RENAME_COL:
            case ALTER_TABLE_CHANGE_COL:
            case ALTER_TABLE_DROP_PARTS:
            case ALTER_TABLE_ADD_PARTS:
            case ALTER_TABLE_RENAME_PART:
            case ALTER_TABLE_SET_LOCATION:
            case DESC_TABLE:
            case MSCK_TABLE:
            case ALTER_TABLE_TOUCH:

            case SELECT:
            case INSERT_VALUES:
            case INSERT_SELECT:
            case MULTI_INSERT:

            case CREATE_VIEW:
            case DROP_VIEW:
            case ALTER_VIEW_QUERY:
            case ALTER_VIEW_RENAME:
            case ALTER_VIEW_PROPERTIES:

            case SHOW: //mysql 命令
            case SHOW_COLUMNS:
            case SHOW_PARTITIONS:
            case SHOW_TABLES:
            case SHOW_VIEWS:
            case SHOW_TABLE_EXTENDED:
            case SHOW_TABLE_PROPERTIES:
            case SHOW_CREATE_TABLE:

            case SHOW_FUNCTIONS:
            case DESC_FUNCTION:

            case CACHE:
            case UNCACHE:
            case CLEAR_CACHE:

            case DATATUNNEL:
            case CALL:
            case SYNC:

            case DELETE:
            case UPDATE:
            case MERGE_INTO_TABLE:

            case EXPLAIN:
                checkRet = true;
                break;
        }
        return checkRet;
    }

    public StatementData parse(String command) {
        String trimCmd = StringUtils.trim(command);

        UpperCaseCharStream charStream = new UpperCaseCharStream(CharStreams.fromString(trimCmd));
        SqlBaseLexer lexer = new SqlBaseLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ParseErrorListener());

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokenStream);
        parser.addParseListener(new SparkSQLPostProcessor());
        parser.removeErrorListeners();
        parser.addErrorListener(new ParseErrorListener());
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

        SparkSQLFieldLineageAstBuilder sqlVisitor = new SparkSQLFieldLineageAstBuilder();
        sqlVisitor.setCommand(trimCmd);

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                return (StatementData) sqlVisitor.visit(parser.singleStatement());
            }
            catch (ParseCancellationException ex) {
                tokenStream.seek(0); // rewind input stream
                parser.reset();

                // Try Again.
                parser.getInterpreter().setPredictionMode(PredictionMode.LL);
                return (StatementData) sqlVisitor.visit(parser.statement());
            }
        } catch (ParseException ex) {
            if(StringUtils.isNotBlank(ex.getCommand())) {
                throw ex;
            } else {
                throw ex.withCommand(trimCmd);
            }
        }
    }


}
