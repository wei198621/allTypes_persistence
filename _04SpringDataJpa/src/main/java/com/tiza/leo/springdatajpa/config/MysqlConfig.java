package com.tiza.leo.springdatajpa.config;

//import org.hibernate.dialect.MySQL5Dialect;
import org.hibernate.dialect.MySQLDialect;

/**
 * @author leowei
 * @date 2020/11/25  - 21:09
 *
 * org.hibernate.dialect.MySQL5Dialect：新版本的mysql方言
 * org.hibernate.dialect.MySQLDialect ：老版本的mysql方言
 *
 */
public class MysqlConfig extends MySQLDialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
