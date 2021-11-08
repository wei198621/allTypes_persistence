package com.tiza.leo.springdatajpa;

import com.tiza.leo.springdatajpa.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author leowei
 * @date 2020/11/25  - 21:09
 */
@SpringBootApplication
public class SpringdatajpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdatajpaApplication.class, args);
        /*UserController userController=new UserController();
        userController.find();*/
    }

}