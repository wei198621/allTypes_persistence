package com.tz.leo.jdbcTemplateTest.dao;

import com.tz.leo.jdbcTemplateTest.entity.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * Author: tz_wl
 * Date: 2020/3/30 14:28
 * Content:
 */
public interface IUserInfoDAO {

    int add(UserInfo userInfo);

    int update(UserInfo userInfo);

    int delete(int id);

    UserInfo findById(int id);

    List<UserInfo> findAllList(Map<String, Object> param);

}
