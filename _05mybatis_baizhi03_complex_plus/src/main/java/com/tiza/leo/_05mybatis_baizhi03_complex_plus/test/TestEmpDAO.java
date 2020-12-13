package com.tiza.leo._05mybatis_baizhi03_complex_plus.test;

import com.tiza.leo._05mybatis_baizhi03_complex_plus.dao.EmpDAO;
import com.tiza.leo._05mybatis_baizhi03_complex_plus.dto.EmpDto;
import com.tiza.leo._05mybatis_baizhi03_complex_plus.entity.Emp;
import com.tiza.leo._05mybatis_baizhi03_complex_plus.util.MybatisUtil;

import java.util.List;

/**
 * @author leowei
 * @date 2020/12/13  - 10:14
 */
public class TestEmpDAO {
    public static void main(String[] args) {
        test01();
        //test02();
    }

    private static void test01() {
        List<Emp> emps = MybatisUtil.getSqlSession().getMapper(EmpDAO.class).queryAll();
        for (Emp emp : emps) {
            System.out.println("emp = " + emp+ "   所属部门id:  "+emp.getDept().getId()+"  部门名称:  "+emp.getDept().getName());
        }
    }
    private static void test02() {
        List<EmpDto> emps = MybatisUtil.getSqlSession().getMapper(EmpDAO.class).queryAll02();
        for (EmpDto empDto : emps) {
            System.out.println("empDto = " + empDto);
        }
    }
}
