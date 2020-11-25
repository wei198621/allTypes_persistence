package com.tiza.leo.springdatajpa.repository;

import com.tiza.leo.springdatajpa.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author leowei
 * @date 2020/11/25  - 21:10
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserNameOrEmail(String userName, String email);

    User findByUserName(String userName);

    /**
     * @Author Smith
     * @Description 自定义Sql查询,
     * @Date 10:18 2019/1/24
     * @Param
     * @return org.springframework.data.domain.Page<com.jpa.springdatajpa.model.User>
     **/
    @Query(value = "select * from user",nativeQuery = true)
    Page<User> findALL(Pageable pageable);

    /**
     * @Author Smith
     * @Description 原生SQL的写法,?1表示方法参数中的顺序
     * @Date 10:20 2019/1/24
     * @Param
     * @return org.springframework.data.domain.Page<com.jpa.springdatajpa.model.User>
     **/
    @Query(value = "select * from user where nick_name = ?1",nativeQuery = true)
    Page<User> findByNickName(String nickName, Pageable pageable);

    /**
     * @Author Smith
     * @Description 修改,添加事务的支持
     * @Date 10:21 2019/1/24
     * @Param
     * @return int
     **/
    @Transactional(timeout = 10)
    @Modifying
    @Query("update User set userName = ?1 where id = ?2")
    int modifyById(String  userName, Long id);

    /**
     * @Author Smith
     * @Description 删除
     * @Date 10:22 2019/1/24
     * @Param
     * @return void
     **/
    @Transactional
    @Modifying
    @Query("delete from User where id = ?1")
    @Override
    void deleteById(Long id);

    User findFirstByOrderByNickNameAsc();

    User findTopByOrderByIdDesc();

    Page<User> queryFirst10ByNickName(String nickName, Pageable pageable);

    List<User> findFirst10ByNickName(String nickName, Sort sort);

    List<User> findTop10ByNickName(String nickName, Pageable pageable);

}