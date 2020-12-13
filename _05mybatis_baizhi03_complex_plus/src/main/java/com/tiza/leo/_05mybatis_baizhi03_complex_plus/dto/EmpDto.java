package com.tiza.leo._05mybatis_baizhi03_complex_plus.dto;

import java.util.Date;

/**
 * @author leowei
 * @date 2020/12/13  - 10:19
 */
public class EmpDto {
    private String eid;
    private String ename;

    private Integer age;
    private Double salary;
    private Date  bir;

    private String id;
    private String name;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Date getBir() {
        return bir;
    }
    public void setBir(Date bir) {
        this.bir = bir;
    }


    @Override
    public String toString() {
        return "EmpDto{" +
                "eid='" + eid + '\'' +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", bir=" + bir +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
