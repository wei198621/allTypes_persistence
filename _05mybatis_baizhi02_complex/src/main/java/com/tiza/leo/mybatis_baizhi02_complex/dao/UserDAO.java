package com.tiza.leo.mybatis_baizhi02_complex.dao;

import com.tiza.leo.mybatis_baizhi02_complex.entity.User;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/12/11 15:25
 * Content:
 */
public interface UserDAO {
    //查询用户  并且查询用户的身份信息
    public List<User> queryAll();
}
