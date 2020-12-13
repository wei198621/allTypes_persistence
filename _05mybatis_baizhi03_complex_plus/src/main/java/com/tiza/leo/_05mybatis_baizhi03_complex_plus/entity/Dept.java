package com.tiza.leo._05mybatis_baizhi03_complex_plus.entity;

import java.util.List;

/**
 * @author leowei
 * @date 2020/12/13  - 10:01
 */
public class Dept {
    private String id;
    private String name;
    //关系属性    部门--员工
    //部门对员工是  一对多的关系
    private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }
    public void setEmps(List<Emp> emps) {
        this.emps = emps;
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
    public Dept() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Dept(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", emps=" + emps +
                '}';
    }
}
