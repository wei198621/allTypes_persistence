package com.tiza.leo.mybatis.springboot_mybatis_annotation;

import com.tiza.leo.mybatis.springboot_mybatis_annotation.enums.UserSexEnum;
import com.tiza.leo.mybatis.springboot_mybatis_annotation.mapper.UserMapper;
import com.tiza.leo.mybatis.springboot_mybatis_annotation.model.User;
import com.tiza.leo.mybatis.springboot_mybatis_annotation.param.UserParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leowei
 * @date 2020/11/26  - 0:42
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisAnnoTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testInsert()  {
        userMapper.insert(new User("dd", "a123456", UserSexEnum.MAN));
        // The total number of data in the database
        Assert.assertEquals(3, userMapper.getAll().size());
    }

    @Test
    public void testUpdate() {
        long id=4l;
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
        int count=userMapper.delete(2l);
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

    @Test
    public void testGetListByUserSex(){
        String userSex = "MAN";
        List<User> userLists = userMapper.getListByUserSex(userSex);
        Assert.assertEquals(2,userLists.size());
    }

    @Test
    public void testGetListByNameAndSex(){
        Map<String,Object> condition = new HashMap<>(2);
        condition.put("username","dd");
        condition.put("user_sex","MAN");
        List<User> userList = userMapper.getListByNameAndSex(condition);
        Assert.assertEquals(1,userList.size());
    }
}
