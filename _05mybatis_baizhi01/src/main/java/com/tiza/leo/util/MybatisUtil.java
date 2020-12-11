package com.tiza.leo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;


/**
 * Author: tz_wl
 * Date: 2020/12/11 11:22
 * Content:
 */
public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;
    public static final ThreadLocal<SqlSession> t = new ThreadLocal<SqlSession>();

    static{
        Reader resourceAsReader = null;
        try {
            resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory=  new SqlSessionFactoryBuilder().build(resourceAsReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回sqlSession
     */
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = t.get();
        if(sqlSession==null){
            sqlSession = sqlSessionFactory.openSession();
            t.set(sqlSession);
        }
        return sqlSession;
    }
    /**
     * 关闭sqlSession
     */
    public static void close(){
        SqlSession sqlSession = t.get();
        if(sqlSession!=null){
            sqlSession.close();
            t.remove();
        }
    }
    /**
     * 提交事务
     */
    public static void commit(){
        getSqlSession().commit();
        close();
    }
    /**
     * 回滚事务
     */
    public static void rollback(){
        getSqlSession().rollback();
        close();
    }

}
