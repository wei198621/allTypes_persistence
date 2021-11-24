package com.tiza.leo.mybatis.springboot_mybatis_fencealarm.controller;

import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.enums.UserSexEnum;
import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.mapper.UserMapper;
import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.model.User;
import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.param.UserParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author leowei
 * @date 2021/11/25  - 0:05
 */
@Api(value = "消息",description = "消息操作API",position = 100,protocols = "http")
@RestController
@RequestMapping("/userController")
public class UserController {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private UserMapper userMapper;

    @GetMapping(value="testInsert")
    public void testInsert()  {
        userMapper.insert(new User("aa", "a123456a", UserSexEnum.MAN));
        userMapper.insert(new User("bb", "b123456b", UserSexEnum.WOMAN));
        userMapper.insert(new User("cc", "b123456c", UserSexEnum.WOMAN));

      logger.info("userMapperSize is :"+ userMapper.getAll().size());
    }


    @GetMapping(value="testUpdate")
    public void testUpdate() {
        long id=1l;
        User user = userMapper.getOne(id);
        if(user!=null){
            System.out.println(user.toString());
            user.setNickName("wzlove");
            userMapper.update(user);
           // Assert.assertTrue(("wzlove".equals(userMapper.getOne(id).getNickName())));
        }else {
            System.out.println("not find user id="+id);
        }
    }



    @ApiOperation(value = "删除用户",notes = "根据id删除用户",code = 200)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户的id",required = true, dataType = "Long", paramType = "path")
    })
    @DeleteMapping(value = "user/{id}")
    public void delete (@PathVariable("id") Long id) {
        int count=userMapper.delete(id);
        if(count>0){
            System.out.println("delete is sucess");
        }else {
            System.out.println("delete if failed");
        }
    }


    @GetMapping(value="findAll")
    public void findAll(){
        UserParam userParam = new UserParam();
        userParam.setCurrentPage(0);
        userParam.setPageSize(1);
        List<User> list = userMapper.getList(userParam);
        System.out.println(list.get(0));

    }
}
