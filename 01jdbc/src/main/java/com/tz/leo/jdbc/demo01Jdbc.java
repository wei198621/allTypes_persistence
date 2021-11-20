package com.tz.leo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author leowei
 * @date 2021/11/19  - 22:50
 * ————————————————
 * https://blog.csdn.net/lizhe_dashuju/article/details/72377105
 *
 */
public class demo01Jdbc {
    public static void main(String[] args) throws SQLException {
        System.out.println( "Hello World!" );
        Connection conn = null;
        String sql;

        String conn_str = "jdbc:mysql://192.168.121.38:3306/xgzx?"
                + "user=root&password=root&useUnicode=true&characterEncoding=UTF8";
        try {
            Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
            System.out.println("成功加载MySQL驱动程序");

            // 一个Connection代表一个数据库连接
            conn = DriverManager.getConnection(conn_str);
            Statement stmt = conn.createStatement();
            sql = "show tables;";
            ResultSet result = stmt.executeQuery(sql);
            if (result != null) {
                while (result.next()) {
                    System.out.println(result.getString(1) + "\t");
                }
            }
        } catch (SQLException e) {
            System.out.println("MySQL操作错误");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }


    }
}
