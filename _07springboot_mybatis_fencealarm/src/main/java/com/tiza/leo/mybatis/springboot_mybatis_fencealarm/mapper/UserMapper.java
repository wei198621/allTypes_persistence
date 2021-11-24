package com.tiza.leo.mybatis.springboot_mybatis_fencealarm.mapper;

import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.enums.UserSexEnum;
import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.model.User;
import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.param.UserParam;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
	List<User> getAll();

	List<User> getList(UserParam userParam);

	int getCount(UserParam userParam);

	User getOne(Long id);

	void insert(User user);

	int update(User user);

	int delete(Long id);


}