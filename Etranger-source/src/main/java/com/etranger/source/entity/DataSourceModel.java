package com.etranger.source.entity;

/**
 * 数据源
 */
public class DataSourceModel {
    private String code;
    private String name;
    private DBType dbType;
    private String ip;
    private String dbName;
    private String userName;
    private String passWord;

    public DataSourceModel(String code, String name, DBType dbType, String ip, String dbName, String userName, String passWord) {
        this.code = code;
        this.name = name;
        this.dbType = dbType;
        this.ip = ip;
        this.dbName = dbName;
        this.userName = userName;
        this.passWord = passWord;
    }

    public DataSourceModel(String dbName, String userName, String passWord) {
        int max = 1000, min = 100;
        int randonNum = (int) (Math.random() * (max - min) + min);
        this.code = "DB" + randonNum + System.currentTimeMillis();
        this.name = "DataSource" + randonNum + System.currentTimeMillis();
        this.dbType = DBType.PGSql;
        this.ip = "localhost";
        this.dbName = dbName;
        this.userName = userName;
        this.passWord = passWord;
    }

    public DataSourceModel(DBType dbType, String ip, String dbName, String userName, String passWord) {
        int max = 1000, min = 100;
        int randonNum = (int) (Math.random() * (max - min) + min);
        this.code = "DB" + randonNum + System.currentTimeMillis();
        this.name = "DataSource" + randonNum + System.currentTimeMillis();
        this.dbType = dbType;
        this.ip = ip;
        this.dbName = dbName;
        this.userName = userName;
        this.passWord = passWord;
    }

    public DataSourceModel(String ip, String dbName, String userName, String passWord) {
        int max = 1000, min = 100;
        int randonNum = (int) (Math.random() * (max - min) + min);
        this.code = "DB" + randonNum + System.currentTimeMillis();
        this.name = "DataSource" + randonNum + System.currentTimeMillis();
        this.dbType = DBType.PGSql;
        this.ip = ip;
        this.dbName = dbName;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public DBType getDbType() {
        return dbType;
    }

    public String getIp() {
        return ip;
    }

    public String getDbName() {
        return dbName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDbType(DBType dbType) {
        this.dbType = dbType;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
