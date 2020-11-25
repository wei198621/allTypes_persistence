package com.tiza.leo.springdatajpa.controller;

import com.tiza.leo.springdatajpa.param.UserDetailParam;
import com.tiza.leo.springdatajpa.servic.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

/**
 * @author leowei
 * @date 2020/11/25  - 23:14
 */
public class UserController {

    @Autowired
    UserDetailServiceImpl userDetailService;


    public void find(){
        UserDetailParam detailParam =new UserDetailParam();
        detailParam.setUserId("1");
        detailParam.setCity("xuzhou");

        Pageable pageable = Pageable.unpaged();

        userDetailService.findByCondition(detailParam,pageable);
    }
}
