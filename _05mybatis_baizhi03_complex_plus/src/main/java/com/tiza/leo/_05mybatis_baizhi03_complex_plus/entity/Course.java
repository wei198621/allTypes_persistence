package com.tiza.leo._05mybatis_baizhi03_complex_plus.entity;

/**
 * @author leowei
 * @date 2020/12/13  - 10:01
 */
public class Course {
    private String id;
    private String name;
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
    public Course() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Course(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + "]";
    }
}
