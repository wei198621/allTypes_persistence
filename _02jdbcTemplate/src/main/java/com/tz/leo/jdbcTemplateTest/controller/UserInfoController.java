package com.tz.leo.jdbcTemplateTest.controller;

import com.tz.leo.jdbcTemplateTest.entity.UserInfo;
import com.tz.leo.jdbcTemplateTest.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * Author: tz_wl
 * Date: 2020/8/14 16:04
 * Content:
 */
@Controller("userInfoController")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    public int add(UserInfo userInfo) {
        return  userInfoService.add(userInfo);
    }

    public int update(UserInfo userInfo) {
        return userInfoService.update(userInfo);
    }

    public int delete(int id) {
        return userInfoService.delete(id);
    }

    public UserInfo findById(int id) {
        return userInfoService.findById(id);
    }

    public List<UserInfo> findAllList(Map<String, Object> param) {
        return userInfoService.findAllList(param);
    }
}
