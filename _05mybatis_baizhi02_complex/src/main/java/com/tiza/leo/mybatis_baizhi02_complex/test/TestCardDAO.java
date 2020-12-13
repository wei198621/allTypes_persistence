package com.tiza.leo.mybatis_baizhi02_complex.test;

import com.tiza.leo.mybatis_baizhi02_complex.dao.CardDAO;
import com.tiza.leo.mybatis_baizhi02_complex.entity.Card;
import com.tiza.leo.mybatis_baizhi02_complex.util.MybatisUtil;

import java.util.List;

/**
 * @author leowei
 * @date 2020/12/12  - 22:27
 */
public class TestCardDAO {
    public static void main(String[] args) {
        List<Card> cardList = MybatisUtil.getSqlSession().getMapper(CardDAO.class).queryAll();
        cardList.forEach(card->{
            System.out.println(card + "  ");
            System.out.println(card.getUser());
            System.out.println(" ===================================== ");
        });
    }
}
