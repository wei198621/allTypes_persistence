package com.tiza.leo.mybatis_baizhi02_complex.entity;

import java.util.Date;

/**
 * Author: tz_wl
 * Date: 2020/12/11 17:09
 * Content:
 */
public class User {
    private String id;
    private String name;
    private Integer age;
    private Date bir;

    private Card card;//关系属性  不要出现在toString方法里面


    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
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
    public Date getBir() {
        return bir;
    }
    public void setBir(Date bir) {
        this.bir = bir;
    }
    public User(String id, String name, Integer age, Date bir) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.bir = bir;
    }
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", bir="
                + bir + "]";
    }
}
