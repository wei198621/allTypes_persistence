package com.tiza.leo.mybatis_baizhi02_complex.entity;

/**
 * Author: tz_wl
 * Date: 2020/12/11 17:10
 * Content:
 */
public class Card {
    private String id;
    private String no;
    private String address;
    private String fork;


    private User user;//关系属性

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getFork() {
        return fork;
    }
    public void setFork(String fork) {
        this.fork = fork;
    }
    public Card() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Card(String id, String no, String address, String fork) {
        super();
        this.id = id;
        this.no = no;
        this.address = address;
        this.fork = fork;
    }
    @Override
    public String toString() {
        return "Card [id=" + id + ", no=" + no + ", address=" + address
                + ", fork=" + fork + "]";
    }
}
