package com.tiza.leo.mybatis.springboot_mybatis_fencealarm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author leowei
 * @date 2021/11/24  - 21:04
 */
@SpringBootApplication
@MapperScan("com.tiza.leo.mybatis.springboot_mybatis_fencealarm.mapper")
public class SpringbootMybatisFenceAlarm {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisFenceAlarm.class, args);
    }

}