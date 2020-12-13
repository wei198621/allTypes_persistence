package com.tiza.leo._05mybatis_baizhi03_complex_plus.test;

import com.tiza.leo._05mybatis_baizhi03_complex_plus.dao.DeptDAO;
import com.tiza.leo._05mybatis_baizhi03_complex_plus.entity.Dept;
import com.tiza.leo._05mybatis_baizhi03_complex_plus.entity.Emp;
import com.tiza.leo._05mybatis_baizhi03_complex_plus.util.MybatisUtil;

import java.util.List;

/**
 * @author leowei
 * @date 2020/12/13  - 12:50
 */
public class TestDeptDAO {

    public static void main(String[] args) {
        List<Dept> depts = MybatisUtil.getSqlSession().getMapper(DeptDAO.class).queryAll();
        for (Dept dept : depts) {
            System.out.println("dept = " + dept);
            List<Emp> emps = dept.getEmps();
            for (Emp emp : emps) {
                System.out.println("emp = " + emp);
            }
            System.out.println(" =================================== " );
        }
    }


















}
