package com.tiza.leo.mybatis.springboot_mybatis_annotation.mapper;

import com.tiza.leo.mybatis.springboot_mybatis_annotation.enums.UserSexEnum;
import com.tiza.leo.mybatis.springboot_mybatis_annotation.model.User;
import com.tiza.leo.mybatis.springboot_mybatis_annotation.param.UserParam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.Delete;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

	@Select("SELECT * FROM mybatis_annotation_users")
	@Results({
			@Result(property = "userSex", column="user_sex",javaType = UserSexEnum.class),
			@Result(property = "nickName", column = "nick_name",javaType = String.class)
	})
	List<User> getAll();

	@SelectProvider(type = UserSql.class,method = "getList")
	List<User> getList(UserParam userParam);

	@SelectProvider(type = UserSql.class,method = "getCount")
	int getCount(UserParam userParam);

	/*注意$与#的区别*/

	@Select("SELECT * FROM mybatis_annotation_users WHERE user_sex = #{user_sex}")
	List<User> getListByUserSex(@Param("user_sex") String userSex);

	@Select("SELECT * FROM mybatis_annotation_users WHERE username=#{username} AND user_sex = #{user_sex}")
	List<User> getListByNameAndSex(Map<String, Object> map);

	@Select("SELECT * FROM mybatis_annotation_users WHERE ID = #{id}")
	@Results({
			@Result(property = "userSex", column="user_sex",javaType = UserSexEnum.class),
			@Result(property = "nickName", column = "nick_name",javaType = String.class)
	})
	User getOne(Long id);

	@Insert("INSERT INTO mybatis_annotation_users(userName,passWord,user_sex) VALUES(#{userName},#{passWord},#{userSex})")
	void insert(User user);

	@UpdateProvider(type = UserSql.class,method = "update")
	int update(User user);

	@Update({"<script> ",
			"UPDATE mybatis_annotation_users ",
			"<set>" ,
			" <if test='userName != null'>userName=#{userName},</if>" ,
			" <if test='nickName != null'>nick_name=#{nickName},</if>" ,
			" </set> ",
			"where id=#{id} " ,
			"</script>"})
	int updateUser(User user);

	@Delete("DELETE FROM mybatis_annotation_users WHERE id = #{id}")
	int delete(Long id);

}