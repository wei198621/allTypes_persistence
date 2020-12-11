package com.tiza.leo.service;

import com.tiza.leo.dao.EmpDAO;
import com.tiza.leo.entity.Emp;
import com.tiza.leo.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/12/11 11:34
 * Content:
 */
public class EmpServiceImpl implements EmpService {
    public List<Emp> findAll() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpDAO mapper = sqlSession.getMapper(EmpDAO.class);
        List<Emp> all = mapper.findAll();
        MybatisUtil.close();
        return all;
    }

    public void insert(Emp emp) {
        SqlSession sqlSession=null;
        try {
            sqlSession =MybatisUtil.getSqlSession();
            EmpDAO mapper = sqlSession.getMapper(EmpDAO.class);
            mapper.insert(emp);
            MybatisUtil.commit();
        } catch (Exception e) {
            e.printStackTrace();
            MybatisUtil.rollback();
        }

    }
}
