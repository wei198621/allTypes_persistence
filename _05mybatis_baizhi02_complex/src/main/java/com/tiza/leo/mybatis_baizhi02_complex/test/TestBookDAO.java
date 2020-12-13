package com.tiza.leo.mybatis_baizhi02_complex.test;

import com.tiza.leo.mybatis_baizhi02_complex.dao.BookDAO;
import com.tiza.leo.mybatis_baizhi02_complex.entity.Book;
import com.tiza.leo.mybatis_baizhi02_complex.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author leowei
 * @date 2020/12/12  - 22:27
 */
public class TestBookDAO {

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookDAO mapper = sqlSession.getMapper(BookDAO.class);
        List<Book> books = mapper.selectAll();
        books.forEach(book->{
            System.out.println("book = " + book);
        });
        MybatisUtil.close();
    }

    @Test
    public void  testSelectFileds(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookDAO mapper = sqlSession.getMapper(BookDAO.class);
        List<Book> selectByFields = mapper.selectByFields(new Book(null, null,null, null,"wangshuo"));

        for (Book book : selectByFields) {
            System.out.println(book);
        }

        MybatisUtil.close();

    }


    @Test
    public void  testSelectByChoose(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookDAO mapper = sqlSession.getMapper(BookDAO.class);
        List<Book> selectByChoose = mapper.selectByChoose(new Book(null,"六脉神剑", null, 123.0, "小黑"));
        for (Book book : selectByChoose) {
            System.out.println(book);
        }
        MybatisUtil.close();

    }

    @Test
    public void  testUpdate(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookDAO mapper = sqlSession.getMapper(BookDAO.class);
        mapper.update(new Book("1", "六脉123", null, null, null));
        MybatisUtil.commit();

    }


    /**
     * mysql  测试没有通过 在local zhan comp
     * oracle 没有测试
     *
     * 一致 mysql 不支持  begin  end 批量处理语法
     */

    @Test
    public void  testInsertAll(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookDAO mapper = sqlSession.getMapper(BookDAO.class);
        List<Book> books = Arrays.asList(new Book(UUID.randomUUID().toString(), "我的大学", new Date(), null, "高尔基")
                , new Book(UUID.randomUUID().toString(), "我的大学-1", new Date(), null, "高尔基-1"));
        mapper.insertAll(books);
        MybatisUtil.commit();

    }




}
