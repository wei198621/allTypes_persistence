package com.tiza.leo.mybatis.springboot_mybatis_annotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author leowei
 * @date 2020/11/26  - 0:32
 */
@SpringBootApplication
@MapperScan("com.tiza.leo.mybatis.springboot_mybatis_annotation.mapper")
public class SpringbootMybatisAnnotationApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisAnnotationApplication.class, args);
    }

}
