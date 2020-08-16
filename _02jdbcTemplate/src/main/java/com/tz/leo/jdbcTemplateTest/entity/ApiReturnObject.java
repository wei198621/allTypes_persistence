package com.tz.leo.jdbcTemplateTest.entity;

/**
 * Author: tz_wl
 * Date: 2020/3/30 15:29
 * Content:
 */
public  class ApiReturnObject {
    public static String success;
    public static String error;

    public static Object success(String str) {
        return str;
    }

    public static Object success(Object obj) {
        return obj;
    }

    public static Object error(String str) {
        return str;
    }
}
