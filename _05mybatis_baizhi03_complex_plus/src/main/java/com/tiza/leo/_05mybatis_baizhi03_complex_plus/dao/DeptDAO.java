package com.tiza.leo._05mybatis_baizhi03_complex_plus.dao;

import com.tiza.leo._05mybatis_baizhi03_complex_plus.entity.Dept;

import java.util.List;

/**
 * @author leowei
 * @date 2020/12/13  - 10:03
 */
public interface DeptDAO {
    //查询部门的同时将部门中所有的员工信息一并查到
     List<Dept> queryAll();
}
