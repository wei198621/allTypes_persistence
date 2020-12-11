package com.tiza.leo.test;

import com.tiza.leo.dao.EmpDAO;
import com.tiza.leo.entity.Emp;
import com.tiza.leo.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Author: tz_wl
 * Date: 2020/12/11 10:42
 * Content:
 */
public class TestEmpDAO {


    /**
     *
     // 1.获取配置文件
     // 2.获取sqlSessionFactory
     // 3.获取SqlSession
     // 4.获取返回结果
     // 5.print
     * @throws IOException
     */
    @Test
    public void testFindById() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDAO empDAO = sqlSession.getMapper(EmpDAO.class);
        Emp emp = empDAO.findById("1");
        System.out.println("emp = " + emp);
    }


    @Test
    public void testFindByIdAndName() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDAO empDAO = sqlSession.getMapper(EmpDAO.class);
        Emp emp = empDAO.findByIdAndName("1", "xiaowei");
        System.out.println("emp = " + emp);
    }

    @Test
    public void testFindAll() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDAO empDAO = sqlSession.getMapper(EmpDAO.class);
        List<Emp> emplist = empDAO.findAll();
        for (Emp emp : emplist) {
            System.out.println("emp = " + emp);
        }
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        SqlSession sqlSession=null;
        try {
            Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
            sqlSession = sqlSessionFactory.openSession();
            EmpDAO empDAO = sqlSession.getMapper(EmpDAO.class);
            empDAO.update(new Emp("1","zzhangsan",22,new Date()));
            empDAO.update(new Emp("2","lisi",44,new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").parse("2020-12-12 12:12:12")));
            sqlSession.commit();         // 改变操作需要手动commit()才可以正常执行
        } catch (ParseException e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
    }

    @Test
    public void testDelete(){
        SqlSession sqlSession=null;
        try {
            Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
            sqlSession = sqlSessionFactory.openSession();
            EmpDAO empDAO = sqlSession.getMapper(EmpDAO.class);
            empDAO.delete("2");
            sqlSession.commit();         // 改变操作需要手动commit()才可以正常执行
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }

    }

    //测试插入
    @Test
    public void testInsert(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpDAO mapper = sqlSession.getMapper(EmpDAO.class);
        String id = UUID.randomUUID().toString();
        mapper.insert(new  Emp(id , "miniPean", 24, new Date()));
        sqlSession.commit();
        MybatisUtil.close();
    }

}
