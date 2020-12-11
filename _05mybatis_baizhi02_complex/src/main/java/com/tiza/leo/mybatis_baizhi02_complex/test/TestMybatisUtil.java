package com.tiza.leo.mybatis_baizhi02_complex.test;

import com.tiza.leo.mybatis_baizhi02_complex.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Author: tz_wl
 * Date: 2020/12/11 15:30
 * Content:
 */
public class TestMybatisUtil {
    public static void main(String[] args) throws Exception {

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        System.out.println(sqlSession);
        sqlSession.getConnection().commit();


    }
}
