package com.tiza.leo.springdatajpa.servic;

import com.tiza.leo.springdatajpa.model.UserDetail;
import com.tiza.leo.springdatajpa.param.UserDetailParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author leowei
 * @date 2020/11/25  - 21:11
 */
public interface UserDetailService {

    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);


}