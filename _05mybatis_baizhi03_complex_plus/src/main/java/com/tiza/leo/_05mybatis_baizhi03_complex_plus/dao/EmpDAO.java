package com.tiza.leo._05mybatis_baizhi03_complex_plus.dao;

import com.tiza.leo._05mybatis_baizhi03_complex_plus.dto.EmpDto;
import com.tiza.leo._05mybatis_baizhi03_complex_plus.entity.Emp;

import java.util.List;

/**
 * @author leowei
 * @date 2020/12/13  - 10:03
 */
public interface EmpDAO {
    //查询员工信息的同时将员工的部门信息获取
     List<Emp> queryAll();


    List<EmpDto> queryAll02();
}
