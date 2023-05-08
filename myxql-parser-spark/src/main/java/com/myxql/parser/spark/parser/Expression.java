package com.myxql.parser.spark.parser;

import com.myxql.parser.antlr4.Origin;

import java.util.Optional;

// sql 表达式
public abstract class Expression {
    private Optional<Origin> location;

    public Expression(Optional<Origin> location) {
        this.location = location;
    }
}
