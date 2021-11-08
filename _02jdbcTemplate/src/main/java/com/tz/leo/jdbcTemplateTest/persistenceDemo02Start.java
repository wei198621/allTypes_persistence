package com.tz.leo.jdbcTemplateTest;

import cn.hutool.core.util.RandomUtil;
import com.tz.leo.jdbcTemplateTest.controller.UserInfoController;
import com.tz.leo.jdbcTemplateTest.entity.UserInfo;
import com.tz.leo.jdbcTemplateTest.util.JacksonUtil;
import com.tz.leo.jdbcTemplateTest.util.SpringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * Author: tz_wl
 * Date: 2020/3/30 14:40
 * Content:
 */
public class persistenceDemo02Start {
    private static Logger logger = LoggerFactory.getLogger(persistenceDemo02Start.class);

    public static void main(String[] args) {
        logger.info(" SpringUtil.init() start ");
        SpringUtil.init();
        logger.info(" SpringUtil.init() end ");
        SpringUtil.ShowAllBeans();


        //select
        UserInfoController userInfoController = SpringUtil.getBean("userInfoController");

        int randomInt = RandomUtil.randomInt(1, 20000);  //随机数

        // UserInfo 实例
        UserInfo userInfo = new UserInfo();
        userInfo.setUiId(BigDecimal.valueOf(randomInt));
        userInfo.setUiIsLogin(1);
        userInfo.setUiIsAdmin(1);
        userInfo.setUiName("liLei");
        userInfo.setOriId(BigDecimal.valueOf(22));
        userInfo.setUiInsertTime(cn.hutool.core.date.DateUtil.dateSecond());
        userInfoController.add(userInfo);
        System.out.println("============   新增用户  ================  ");

        UserInfo user = userInfoController.findById(randomInt);
        System.out.println("==============  查询用户，结果 ============= ");
        System.out.println(JacksonUtil.toJson(user));

    }


}
