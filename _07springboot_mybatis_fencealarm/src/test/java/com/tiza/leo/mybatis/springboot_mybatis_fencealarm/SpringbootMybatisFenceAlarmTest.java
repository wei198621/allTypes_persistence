package com.tiza.leo.mybatis.springboot_mybatis_fencealarm;

import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.enums.UserSexEnum;
import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.mapper.UserMapper;
import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.model.User;
import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.param.UserParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author leowei
 * @date 2021/11/25  - 0:18
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringbootMybatisFenceAlarmTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testInsert()  {
        userMapper.insert(new User("aa", "a123456a", UserSexEnum.MAN));
        userMapper.insert(new User("bb", "b123456b", UserSexEnum.WOMAN));
        userMapper.insert(new User("cc", "b123456c", UserSexEnum.WOMAN));

        Assert.assertEquals(3, userMapper.getAll().size());
    }

    @Test
    public void testUpdate() {
        long id=1l;
        User user = userMapper.getOne(id);
        if(user!=null){
            System.out.println(user.toString());
            user.setNickName("wzlove");
            userMapper.update(user);
            Assert.assertTrue(("wzlove".equals(userMapper.getOne(id).getNickName())));
        }else {
            System.out.println("not find user id="+id);
        }
    }


    @Test
    public void testDelete() {
        int count=userMapper.delete(3l);
        if(count>0){
            System.out.println("delete is sucess");
        }else {
            System.out.println("delete if failed");
        }
    }

    @Test
    public void findAll(){
        UserParam userParam = new UserParam();
        userParam.setCurrentPage(0);
        userParam.setPageSize(1);
        List<User> list = userMapper.getList(userParam);
        System.out.println(list.get(0));
        Assert.assertEquals(1,list.size());
    }
}