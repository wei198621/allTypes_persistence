package com.tiza.leo._05mybatis_baizhi03_complex_plus.entity;

import java.util.List;

/**
 * @author leowei
 * @date 2020/12/13  - 10:01
 */
public class Student {
    private String id;
    private String name;
    private Integer age;
    private List<Course> courses;//关系属性   用来表示一个学生选了多个课程

    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
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
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
