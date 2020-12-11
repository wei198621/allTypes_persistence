package com.tiza.leo.test;

import com.tiza.leo.entity.Emp;
import com.tiza.leo.service.EmpService;
import com.tiza.leo.service.EmpServiceImpl;

import java.util.Date;
import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/12/11 11:34
 * Content:
 */
public class TestEmpService {
    public static void main(String[] args) {
        EmpService empService  = new EmpServiceImpl();
        //新增一个雇员
        //empService.insert(new  Emp("5", "xiaoming", 23, new Date()));
        // 展示所有雇员
        List<Emp> findAll = empService.findAll();
        for (Emp emp : findAll) {
            System.out.println(emp);
        }
    }
}
