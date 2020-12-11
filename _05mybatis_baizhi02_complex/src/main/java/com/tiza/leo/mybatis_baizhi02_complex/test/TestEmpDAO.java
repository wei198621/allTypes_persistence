package com.tiza.leo.mybatis_baizhi02_complex.test;

import com.tiza.leo.mybatis_baizhi02_complex.dao.EmpDAO;
import com.tiza.leo.mybatis_baizhi02_complex.entity.Emp;
import com.tiza.leo.mybatis_baizhi02_complex.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/12/11 15:48
 * Content:
 */
public class TestEmpDAO {

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpDAO empDAO = sqlSession.getMapper(EmpDAO.class);
        //01  like  查询
        List<Emp> empLists = empDAO.selectByLike("xiaoming");
        for (Emp emp : empLists) {
            System.out.println("emp = " + emp);
        }
        System.out.println("===========================");
      /*  //02 insert
        Emp emp = new Emp("21", null, 24, new Date());
        empDAO.insert(emp);
        MybatisUtil.commit();   // 注意更新操作要手动commit*/

      //03 update
       // Emp emp = new Emp("5", null, 101, new Date());
      /*  Emp emp = new Emp("5", "leo", null, new Date());
        empDAO.update(emp);
        MybatisUtil.commit();   // 注意更新操作要手动commit*/

        System.out.println("===========================");

        //04  selectByPage
        List<Emp> emps = empDAO.selectByPage(3, 2);
        emps.forEach(emp3->{
            System.out.println("emp3 = " + emp3);
        });

        System.out.println("===========================");
    }

}
