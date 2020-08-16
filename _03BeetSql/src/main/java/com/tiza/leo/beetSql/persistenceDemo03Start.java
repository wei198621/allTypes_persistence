package com.tiza.leo.beetSql;

import com.tiza.leo.beetSql.controller.UserInfoController;
import com.tiza.leo.beetSql.entity.UserInfo;
import com.tiza.leo.beetSql.util.JacksonUtil;
import com.tiza.leo.beetSql.util.SpringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author: tz_wl
 * Date: 2020/3/30 15:39
 * Content:
 */
public class persistenceDemo03Start {
    private static Logger logger = LoggerFactory.getLogger(persistenceDemo03Start.class);

    public static void main(String[] args) {
        logger.info(" SpringUtil.init() start ");
        String strConfigPath = "classpath:applicationContext.xml";
        SpringUtil.init(strConfigPath);
        logger.info(" SpringUtil.init() end ");
        SpringUtil.ShowAllBeans();


       /* //此处 没有使用spring实例化 UserInfoController
        System.out.println("=================   没有使用spring实例化 UserInfoController     start =====================");
        UserInfoController userInfoController = new UserInfoController();
        userInfoController.init();
        UserInfo userInfo = (UserInfo) userInfoController.find(294);  //294
        System.out.println("====================  print UserInfo  =============================");
        System.out.println(JacksonUtil.toJson(userInfo));
        System.out.println("====================   print UserInfo  =============================");
        System.out.println("=================没有使用spring实例化 UserInfoController    end ==========================");

        */

        //  使用spring实例化 UserInfoController
        System.out.println("=================  使用spring实例化 UserInfoController    start ==========================");
        UserInfoController userInfoController = SpringUtil.getBean("userInfoController");
        UserInfo userInfo = (UserInfo) userInfoController.find(294);
        System.out.println(JacksonUtil.toJson(userInfo));
        System.out.println("=================使用spring实例化 UserInfoController    end ==========================");


    }
}
