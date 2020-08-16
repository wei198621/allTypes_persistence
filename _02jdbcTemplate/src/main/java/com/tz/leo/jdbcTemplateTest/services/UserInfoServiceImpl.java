package com.tz.leo.jdbcTemplateTest.services;

import com.tz.leo.jdbcTemplateTest.dao.IUserInfoDAO;
import com.tz.leo.jdbcTemplateTest.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Author: tz_wl
 * Date: 2020/8/14 15:59
 * Content:
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    protected IUserInfoDAO userInfoDAO;

    @Override
    public int add(UserInfo userInfo) {
        //做一些 验证工作
        return  userInfoDAO.add(userInfo);
    }

    @Override
    public int update(UserInfo userInfo) {
        //做一些 验证工作
        return userInfoDAO.update(userInfo);
    }

    @Override
    public int delete(int id) {
        //做一些 验证工作
        return userInfoDAO.delete(id);
    }

    @Override
    public UserInfo findById(int id) {
        //做一些 验证工作
        return userInfoDAO.findById(id);
    }

    @Override
    public List<UserInfo> findAllList(Map<String, Object> param) {
        //做一些 验证工作
        return userInfoDAO.findAllList(param);
    }
}
