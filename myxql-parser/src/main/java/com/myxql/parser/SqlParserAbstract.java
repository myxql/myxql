package com.myxql.parser;

import com.myxql.parser.model.StatementLineage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName SqlParserAbstractFactory
 * @description:
 * @Date: 2023/2/16
 */
public abstract class SqlParserAbstract implements SqlParserService {

    public static final Logger logger = LoggerFactory.getLogger(SqlParserAbstract.class);

    private void notSupport(String msg) {
        logger.error("not support {}", msg);
    }

    @Override
    public SqlTypeEnum parseSqlType(String sql) {
        notSupport("parseSqlType");
        return null;
    }

    @Override
    public String parseSqlFormatter(String sql) {
        notSupport("parseSqlFormatter");
        return null;
    }

    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        notSupport("parseSqlTableLineage");
        return null;
    }

    @Override
    public StatementLineage parseSqlFieldLineage(String sql) {
        notSupport("parseSqlFieldLineage");
        return null;
    }
}
