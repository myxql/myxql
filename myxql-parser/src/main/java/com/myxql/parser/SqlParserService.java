package com.myxql.parser;

import com.myxql.parser.model.StatementData;

/**
 * SqlParserService
 * description: sql解析接口
 * Date: 2023/2/16
 */
public interface SqlParserService {
    /**
     * 获取sql类型
     */
    SqlTypeEnum parseSqlType(String sql);

    /**
     * sql格式化
     */
    String parseSqlFormatter(String sql);

    /**
     * sql解析表元数据
     */
    StatementData parseSqlTableLineage(String sql);

    /**
     * sql解析字段元数据
     */
    StatementData parseSqlFieldLineage(String sql);
}
