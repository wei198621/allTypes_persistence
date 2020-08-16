package com.tiza.leo.beetSql.entity;

/**
 * Author: tz_wl
 * Date: 2020/3/30 15:29
 * Content:
 */
public  class ApiReturnObject {
    public static boolean isSuccess=true;

    public static String success(String str) {
        isSuccess=true;
        return str;
    }

    public static Object success(Object obj) {
        isSuccess=true;
        return obj;
    }

    public static String error(String str) {
        isSuccess=false;
        return str;
    }

    public static Object error(Object str) {
        isSuccess=false;
        return str;
    }
}
