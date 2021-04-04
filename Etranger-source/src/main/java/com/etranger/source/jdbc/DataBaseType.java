package com.etranger.source.jdbc;

public enum DataBaseType {
    MySql("mysql", "com.mysql.jdbc.Driver"),
    Tddl("mysql", "com.mysql.jdbc.Driver"),
    DRDS("drds", "com.mysql.jdbc.Driver"),
    Oracle("oracle", "oracle.jdbc.driver.OracleDriver"),
    SQLServer("sqlserver", "com.microsoft.sqlserver.jdbc.SQLServerDriver"),
    PostgreSQL("postgresql", "org.postgresql.Driver"),
    RDBMS("rdbms", "com.alibaba.datax.plugin.rdbms.util.DataBaseType"),
    DB2("db2", "com.ibm.db2.jcc.DB2Driver"),
    ADS("ads","com.mysql.jdbc.Driver"),
    ClickHouse("clickhouse", "ru.yandex.clickhouse.ClickHouseDriver"),
    DM("dm","dm.jdbc.driver.DmDriver"),
    HighGo("highgo","com.highgo.jdbc.Driver");

    private String typeName;
    private String driverClassName;

    DataBaseType(String typeName, String driverClassName) {
        this.typeName = typeName;
        this.driverClassName = driverClassName;
    }

    public String getDriverClassName() {
        return this.driverClassName;
    }

    public String getTypeName(){return this.typeName;}

}
