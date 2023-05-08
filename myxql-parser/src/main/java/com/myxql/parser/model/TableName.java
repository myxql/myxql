package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public class TableName {
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;
    private Optional<String> metaType;

    public TableName(Optional<String> catalogName, Optional<String> databaseName, String tableName, Optional<String> metaType) {
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName");
        this.metaType = metaType;
    }

    public TableName(Optional<String> databaseName, String tableName, Optional<String> metaType) {
        this(Optional.empty(), databaseName, tableName, metaType);
    }

    public TableName(Optional<String> catalogName, Optional<String> databaseName, String tableName) {
        this(catalogName, databaseName, tableName, Optional.empty());
    }

    public TableName(Optional<String> databaseName, String tableName) {
        this(Optional.empty(), databaseName, tableName, Optional.empty());
    }

    public TableName(String tableName) {
        this(Optional.empty(), Optional.empty(), tableName, Optional.empty());
    }

    public final String getFullTableName() {
        if (this.catalogName.isPresent()) {
            return this.catalogName.get() + '.' + this.databaseName.get() + '.' + this.tableName;
        } else {
            return this.databaseName.isPresent() ? this.databaseName.get() + '.' + this.tableName : this.tableName;
        }
    }

    public final Optional<String> getCatalogName() {
        return this.catalogName;
    }

    public final Optional<String> getDatabaseName() {
        return this.databaseName;
    }

    public final String getTableName() {
        return this.tableName;
    }

    public final Optional<String> getMetaType() {
        return this.metaType;
    }

    public static String dealNameMark(String name) {
        if(name.startsWith("`") && name.endsWith("`")) {
            return name.substring(1, name.length()-1);
        }else{
            return name;
        }
    }

    @Override
    public String toString() {
        return "TableName(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", metaType=" + this.metaType + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableName != null ? this.tableName.hashCode() : 0)) * 31;
        return var1 + (this.metaType.isPresent() ? this.metaType.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof TableName) {
                TableName var2 = (TableName)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName) && this.tableName.equals(var2.tableName) && this.metaType.equals(var2.metaType)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}


