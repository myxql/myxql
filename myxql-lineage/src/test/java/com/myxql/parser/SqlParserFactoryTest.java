package com.myxql.parser;

import com.myxql.parser.model.StatementData;
import org.junit.Test;

public class SqlParserFactoryTest {
    @Test
    public void test1() {
        String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, name FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";

        SqlParserService parserService = SqlParserFactory.getParser(EngineTypeEnum.SPARK);
        StatementData data = parserService.parseSqlTableLineage(sql);
        System.out.println("data="+data.toString());
    }
}
