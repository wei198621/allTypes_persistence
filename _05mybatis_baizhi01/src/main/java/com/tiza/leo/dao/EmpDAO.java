package com.tiza.leo.dao;

import com.tiza.leo.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/12/11 10:43
 * Content:
 */
public interface EmpDAO {
    //根据主键查询一个用户
    public Emp findById(String id);

    //多个参数的查询
    public Emp findByIdAndName(@Param("id")String id, @Param("name")String name);

    //查询所有
    public List<Emp> findAll();

    //更新员工
    public void update(Emp emp);

    //根据主键删除一个
    public void delete(String id);

    //插入
    public void insert(Emp emp);

}
