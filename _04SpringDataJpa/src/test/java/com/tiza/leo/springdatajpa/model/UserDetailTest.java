package com.tiza.leo.springdatajpa.model;

import com.tiza.leo.springdatajpa.param.UserDetailParam;
import com.tiza.leo.springdatajpa.repository.UserDetailRepository;
import com.tiza.leo.springdatajpa.servic.UserDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author leowei
 * @date 2020/11/25  - 21:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDetailTest {

    @Resource
    private UserDetailService userDetailService;

    @Resource
    private UserDetailRepository userDetailRepository;

    @Test
    public void testFindByCondition()  {
        int page=0,size=10;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        UserDetailParam param=new UserDetailParam();
        param.setIntroduction("程序员");
        param.setMinAge(10);
        param.setMaxAge(30);
        Page<UserDetail> page1=userDetailService.findByCondition(param,pageable);
        for (UserDetail userDetail:page1){
            System.out.println("userDetail: "+userDetail.toString());
        }
    }

    @Test
    public void testUserInfo()  {
        List<UserInfo> userInfos=userDetailRepository.findUserInfo("钓鱼");
        for (UserInfo userInfo:userInfos){
            System.out.println("userInfo: "+userInfo.getUserName()+"-"+userInfo.getEmail()+"-"+userInfo.getHobby()+"-"+userInfo.getIntroduction());
        }
    }

}