package com.tiza.leo.mybatis_baizhi02_complex.dao;

import com.tiza.leo.mybatis_baizhi02_complex.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/12/11 15:33
 * Content:
 */
public interface EmpDAO {

    public void insert(Emp emp);
    public void update(Emp emp);

    /**
     *
     * @param pageNow   当前页
     * @param pageSize  每页显示条数
     * @return
     */
    public List<Emp> selectByPage(@Param("pageNow")Integer pageNow, @Param("pageSize")Integer pageSize);
    /**
     * 模糊查询
     * @param keyWords  搜索的关键字
     * @return
     */
    public List<Emp> selectByLike(String keyWords);

}
