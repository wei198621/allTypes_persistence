package com.tiza.leo.mybatis.springboot_mybatis_xml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author leowei
 * @date 2020/11/26  - 0:09
 */
@SpringBootApplication
@MapperScan("com.tiza.leo.mybatis.springboot_mybatis_xml.mapper")
public class SpringbootMybatisXmlApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisXmlApplication.class, args);
    }
}
