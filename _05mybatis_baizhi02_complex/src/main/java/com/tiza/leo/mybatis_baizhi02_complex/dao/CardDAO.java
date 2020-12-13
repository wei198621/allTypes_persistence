package com.tiza.leo.mybatis_baizhi02_complex.dao;

import com.tiza.leo.mybatis_baizhi02_complex.entity.Card;

import java.util.List;

/**
 * @author leowei
 * @date 2020/12/12  - 22:33
 */
public interface CardDAO {
    public List<Card> queryAll();
}
