package com.tiza.leo.mybatis_baizhi02_complex.test;

import com.tiza.leo.mybatis_baizhi02_complex.dao.UserDAO;
import com.tiza.leo.mybatis_baizhi02_complex.entity.User;
import com.tiza.leo.mybatis_baizhi02_complex.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/12/11 17:19
 * Content:
 */
public class TestUserDAO {
    public static void main(String[] args) {

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDAO mapper = sqlSession.getMapper(UserDAO.class);

        List<User> queryAll = mapper.queryAll();
        for (User user : queryAll) {
            System.out.println(user);
            System.out.println(user.getCard());
        }

    }
}
