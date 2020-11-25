package com.tiza.leo.springdatajpa.repository;

import com.tiza.leo.springdatajpa.model.UserDetail;
import com.tiza.leo.springdatajpa.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author leowei
 * @date 2020/11/25  - 21:22
 */
public interface UserDetailRepository extends JpaSpecificationExecutor<UserDetail>,
        JpaRepository<UserDetail, Long> {

    @Query("select u.userName as userName, u.email as email, d.introduction as introduction , d.hobby as hobby from User u , UserDetail d " +
            "where u.id=d.userId  and  d.hobby = ?1 ")
    List<UserInfo> findUserInfo(String hobby);
}
