package com.tiza.leo.mybatis.springboot_mybatis_fencealarm.repository;

import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.model.Message;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/11/25 14:45
 * Content:
 */
public interface MessageRepository {
    List<Message> findAll();

    Message save(Message message);

    Message update(Message message);

    Message updateText(Message message);

    Message findMessage(Long id);

    void deleteMessage(Long id);
}
