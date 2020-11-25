package com.tiza.leo.mybatis.springboot_mybatis_xml.mapper;

import com.tiza.leo.mybatis.springboot_mybatis_xml.model.User;
import com.tiza.leo.mybatis.springboot_mybatis_xml.param.UserParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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