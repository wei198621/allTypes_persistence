package com.tiza.leo.mybatis.springboot_mybatis_fencealarm.repository;

import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Author: tz_wl
 * Date: 2020/11/25 14:45
 * Content:
 */

@Service("messageRepository")
public class InMemoryMessageRepository implements MessageRepository {

    private static AtomicLong counter=new AtomicLong();
    private final ConcurrentMap<Long,Message> mapMessage =new ConcurrentHashMap<>();

    public List<Message> findAll() {
        return null;
    }

    //给当前类增加一条记录
    public Message save(Message message) {
        Long id=message.getId();
        if(id==null){
            id=counter.incrementAndGet();
            message.setId(id);
        }
        return this.mapMessage.putIfAbsent(id,message);
    }

    //更新一条记录
    public Message update(Message message) {
        this.mapMessage.put(message.getId(),message);
        return message;
    }

    //用传参message更新当前 message.id 对应的text ,其他不变
    public Message updateText(Message message) {
        Message msg = this.mapMessage.get(message.getId());
        msg.setText(message.getText());
        this.mapMessage.put(msg.getId(),msg);
        return msg;
    }

    //获取信息
    public Message findMessage(Long id) {
        return this.mapMessage.get(id);
    }

    //删除信息
    public void deleteMessage(Long id) {
        this.mapMessage.remove(id);
    }
}
