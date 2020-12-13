package com.tiza.leo._05mybatis_baizhi03_complex_plus.dao;

import com.tiza.leo._05mybatis_baizhi03_complex_plus.entity.Student;

import java.util.List;

/**
 * @author leowei
 * @date 2020/12/13  - 13:19
 */
public interface StudentDAO {
    public List<Student> queryAll();
}
