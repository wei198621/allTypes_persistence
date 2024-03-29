package com.tiza.leo.mybatis.springboot_mybatis_fencealarm.model;

import java.util.Calendar;

/**
 * Author: tz_wl
 * Date: 2020/11/25 14:44
 * Content:
 */
public class Message {

    private Long id;
    private String text;
    private String summary;
    private Calendar created = Calendar.getInstance();

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getCreated() {
        return this.created;
    }

    public void setCreated(Calendar created) {
        this.created = created;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
