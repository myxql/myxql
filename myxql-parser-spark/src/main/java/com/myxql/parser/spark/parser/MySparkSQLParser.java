package com.myxql.parser.spark.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.model.StatementData;

public class MySparkSQLParser extends SqlParserAbstract {
    @Override
    public StatementData parseSqlTableLineage(String sql) {
        SparkSQLTableLineageParser tableLineageParser = new SparkSQLTableLineageParser();
        StatementData data = tableLineageParser.parse(sql);
        return data;
    }

    @Override
    public StatementData parseSqlFieldLineage(String sql) {
        SparkSQLFieldLineageParser fieldLineageParser = new SparkSQLFieldLineageParser();
        StatementData data = fieldLineageParser.parse(sql);
        return data;
    }

}
