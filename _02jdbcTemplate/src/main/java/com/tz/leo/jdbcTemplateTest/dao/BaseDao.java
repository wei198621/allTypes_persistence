package com.tz.leo.jdbcTemplateTest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Author: tz_wl
 * Date: 2020/3/21 12:13
 * Content:
 */
@Component
public abstract class BaseDao {

    @Autowired
    protected JdbcTemplate jdbcTemplate;
}
