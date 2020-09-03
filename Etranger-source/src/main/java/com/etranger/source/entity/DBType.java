package com.etranger.source.entity;

import java.util.HashMap;

public enum DBType {
    SQLServer("0"), Oracle("1"), MySQL("2"), DM("3"), PGSql("4"), highto("5"), GBase("6"), unkown("7");
    private String value;
    private static HashMap<String, DBType> map;

    DBType(String value) {
        value = value;
    }

    public String getValue() {
        return value;
    }

    public static HashMap<String, DBType> getMap() {
        if (map == null) {
            map = new HashMap<String, DBType>();
        }
        return map;
    }

    public static DBType getEnumValue(String value) {
        if (!getMap().containsKey(value)) {
            throw new RuntimeException("索引数组中不存在当前值：" + value);
        }
        return getMap().get(value);
    }
}
