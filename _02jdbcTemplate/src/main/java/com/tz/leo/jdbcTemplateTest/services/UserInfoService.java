package com.tz.leo.jdbcTemplateTest.services;

import com.tz.leo.jdbcTemplateTest.entity.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * Author: tz_wl
 * Date: 2020/8/14 15:59
 * Content:
 */
public interface UserInfoService {
    int add(UserInfo zUserInfo20200330);

    int update(UserInfo zUserInfo20200330);

    int delete(int id);

    UserInfo findById(int id);

    List<UserInfo> findAllList(Map<String, Object> param);
}
