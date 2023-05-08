package com.myxql.parser.spark;

import com.myxql.parser.SqlParserService;
import com.myxql.parser.model.*;
import com.myxql.parser.spark.parser.MySparkSQLParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class SparkSQLFieldLineageParserTest {
    private SqlParserService parserService = new MySparkSQLParser();

    @Test
    public void insertQueryTest1() {
        String sql = "INSERT INTO TABLE db_test.table_result(idd, name) SELECT t1.id, name_x FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name_x FROM ( SELECT id, sourcename AS name_x FROM db_test.table2 ) ) t2 ON t1.id=t2.id";

        StatementData statementData = parserService.parseSqlFieldLineage(sql);
        Optional<Statement> statement = statementData.getStatement();
        Assert.assertEquals(StatementType.INSERT_SELECT, statementData.getType());
        statement.map(stmt -> {
            if (stmt instanceof TableData) {
                TableData tableData = (TableData) stmt;
                List<ColumnData> columnDataList = tableData.getColumnDatas().get();
                Assert.assertEquals(2, columnDataList.size());
                Assert.assertEquals(3, columnDataList.get(0).getSourceFields().size());
                Assert.assertEquals(1, columnDataList.get(1).getSourceFields().size());
            } else {
                Assert.fail();
            }
            return null;
        });
        Assert.assertEquals(statementData.getQuerySql().get(), "INSERT INTO TABLE db_test.table_result(idd, name) SELECT t1.id, name_x FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name_x FROM ( SELECT id, sourcename AS name_x FROM db_test.table2 ) ) t2 ON t1.id=t2.id");
    }

    @Test
    public void insertQueryTest2() {
        String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, name_x FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name_x FROM ( SELECT id, sourcename AS name_x FROM db_test.table2 ) ) t2 ON t1.id=t2.id";

        StatementData statementData = parserService.parseSqlFieldLineage(sql);
        Optional<Statement> statement = statementData.getStatement();
        Assert.assertEquals(StatementType.INSERT_SELECT, statementData.getType());
        statement.map(stmt -> {
            if (stmt instanceof TableData) {
                TableData tableData = (TableData) stmt;
                List<ColumnData> columnDataList = tableData.getColumnDatas().get();
                Assert.assertEquals(2, columnDataList.size());
                Assert.assertEquals(3, columnDataList.get(0).getSourceFields().size());
                Assert.assertEquals(1, columnDataList.get(1).getSourceFields().size());
            } else {
                Assert.fail();
            }
            return null;
        });
        Assert.assertEquals(statementData.getQuerySql().get(), "INSERT INTO TABLE db_test.table_result SELECT t1.id, name_x FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name_x FROM ( SELECT id, sourcename AS name_x FROM db_test.table2 ) ) t2 ON t1.id=t2.id");
    }

    @Test
    public void mutilInsertTest() {
        String sql = "FROM default.sample_07 " +
                "INSERT OVERWRITE TABLE toodey1 SELECT sample_07.code0,sample_07.salary0 " +
                "INSERT OVERWRITE TABLE toodey2 SELECT sample_07.code1,sample_07.salary1 WHERE sample_07.salary >= 50000 " +
                "INSERT OVERWRITE TABLE toodey3 SELECT sample_07.total_emp,sample_07.salary WHERE sample_07.salary <= 50000";

        StatementData statementData = parserService.parseSqlFieldLineage(sql);
        Optional<Statement> statement = statementData.getStatement();
        Assert.assertEquals(StatementType.MULTI_INSERT, statementData.getType());
        statement.map(stmt -> {
            if (stmt instanceof TableData) {
                TableData tableData = (TableData) stmt;
                List<ColumnData> columnDataList = tableData.getColumnDatas().get();
                Assert.assertEquals(6, columnDataList.size());
                Assert.assertEquals(1, columnDataList.get(0).getSourceFields().size());
                Assert.assertEquals(1, columnDataList.get(1).getSourceFields().size());
                Assert.assertEquals(1, columnDataList.get(2).getSourceFields().size());
                Assert.assertEquals(1, columnDataList.get(3).getSourceFields().size());
                Assert.assertEquals(1, columnDataList.get(4).getSourceFields().size());
                Assert.assertEquals(1, columnDataList.get(5).getSourceFields().size());
            } else {
                Assert.fail();
            }
            return null;
        });
    }

    @Test
    public void insertUinonTest() {
        String sql = "insert INTO table customers\n" +
                "     SELECT updates.customerId as mergeKey, updates.*\n" +
                "     FROM updates\n" +
                "     UNION ALL\n" +
                "     SELECT NULL as mergeKey, customers.*\n" +
                "     FROM updates JOIN customers\n" +
                "     ON updates.customerid = customers.customerid\n" +
                "     WHERE customers.current = true AND updates.address <> customers.address\n";
        StatementData statementData = parserService.parseSqlFieldLineage(sql);
        Optional<Statement> statement = statementData.getStatement();
        Assert.assertEquals(StatementType.INSERT_SELECT, statementData.getType());
        statement.map(stmt -> {
            if (stmt instanceof TableData) {
                TableData tableData = (TableData) stmt;
                List<ColumnData> columnDataList = tableData.getColumnDatas().get();
                Assert.assertEquals(2, columnDataList.size());
                Assert.assertEquals(1, columnDataList.get(0).getSourceFields().size());
                Assert.assertEquals(2, columnDataList.get(1).getSourceFields().size());
            } else {
                Assert.fail();
            }
            return null;
        });
    }

    @Test
    public void cetInsertCteTest0() {
        String sql = "with " +
                "a as (select key,a2 from src where key is not null), " +
                "b as (select b1,value from src2 where value>0), " +
                "c as (select c1,value from src3 where value>0), " +
                "d as (select a.key,b.value from a join b on a.key=b.key), " +
                "e as (select a.key,c.value from a left outer join c on a.key=c.key and c.key is not null) " +
                "insert overwrite table srcp partition (p='abc') " +
                "select key,value from d union all select key,value from e";

        StatementData statementData = parserService.parseSqlFieldLineage(sql);
        Optional<Statement> statement = statementData.getStatement();
        Assert.assertEquals(StatementType.INSERT_SELECT, statementData.getType());
        statement.map(stmt -> {
            if (stmt instanceof TableData) {
                TableData tableData = (TableData) stmt;
                List<ColumnData> columnDataList = tableData.getColumnDatas().get();
                Assert.assertEquals(2, columnDataList.size());
                Assert.assertEquals(1, columnDataList.get(0).getSourceFields().size());
                Assert.assertEquals(2, columnDataList.get(1).getSourceFields().size());
            } else {
                Assert.fail();
            }
            return null;
        });
    }

}
