package com.tiza.leo.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Author: tz_wl
 * Date: 2020/12/11 10:22
 * Content:
 */
public class TestMybatis {

    public static void main(String[] args) throws SQLException, IOException {
      /*  //读取配置  方式一
        InputStream resourceAsStream = TestMybatis.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);*/

        //Mybatis读取配置文件的方式
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);

        SqlSession sqlSession = sessionFactory.openSession();
        System.out.println(sqlSession);
        //org.apache.ibatis.session.defaults.DefaultSqlSession@5a39699c
        sqlSession.getConnection().commit();
    }
}
