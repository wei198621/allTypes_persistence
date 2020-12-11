package com.tiza.leo.service;

import com.tiza.leo.entity.Emp;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/12/11 11:34
 * Content:
 */
public interface EmpService {
     List<Emp> findAll();


     void insert(Emp emp);
}
