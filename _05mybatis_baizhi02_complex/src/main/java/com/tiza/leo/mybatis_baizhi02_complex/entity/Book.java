package com.tiza.leo.mybatis_baizhi02_complex.entity;

import java.util.Date;

/**
 * Author: tz_wl
 * Date: 2020/12/11 17:10
 * Content:
 */
public class Book {
    private String id;
    private String name;
    private Date pubDate;
    private Double price;
    private String author;
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

    public Date getPubDate() {
        return pubDate;
    }
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Book() {
        super();
    }
    public Book(String id, String name, Date pubDate, Double price,
                String author) {
        super();
        this.id = id;
        this.name = name;
        this.pubDate = pubDate;
        this.price = price;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", pubDate=" + pubDate
                + ", price=" + price + ", author=" + author + "]";
    }

}
