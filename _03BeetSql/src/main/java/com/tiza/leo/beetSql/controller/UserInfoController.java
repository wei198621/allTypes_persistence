package com.tiza.leo.beetSql.controller;

import com.tiza.leo.beetSql.entity.ApiReturnObject;
import com.tiza.leo.beetSql.entity.UserInfo;
import com.tiza.leo.beetSql.util.BeetlSQLManagerInit;
import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: tz_wl
 * Date: 2020/3/30 15:17
 * Content:
 */
//@Component(value = "userInfoController88888")    //注意此处不要用 @Component 注解，因为方法中需要sqlManager,需要执行其init方法
//@Component 注解无法做到这一点  ，所以在 xml 中 配置bean进行依赖注入
public class UserInfoController {

    private SQLManager sqlManager;

    public void init() {
        this.sqlManager =  BeetlSQLManagerInit.getSqlManager();
    }


    /**
     * 新增或编辑
     */
   // @PostMapping("/save")
    public Object save(UserInfo userInfo){
        UserInfo userInfo1 =sqlManager.unique(UserInfo.class,userInfo.getUiId());
        if(userInfo!=null){
            sqlManager.updateById(userInfo);
            return ApiReturnObject.success("编辑成功");
        }else{
            sqlManager.insert(userInfo);
            return ApiReturnObject.error("保存成功");
        }
    }

    /**
     * 删除
     */
    //@PostMapping("/delete")
    public Object delete(int id){
        UserInfo userInfo=sqlManager.unique(UserInfo.class,id);
        if(userInfo!=null){
            sqlManager.deleteById(userInfo.getClass(),id);
            return ApiReturnObject.success("删除成功");
        }else{
            return ApiReturnObject.error("没有找到该对象");
        }
    }

    /**
     * 查询
     */
   // @PostMapping("/find")
    public Object find(int id){
        try {
            UserInfo userInfo=sqlManager.unique(UserInfo.class,id);
            if(userInfo!=null){
                return ApiReturnObject.success(userInfo);
            }else{
                return ApiReturnObject.error("没有找到该对象");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return ApiReturnObject.error("没有找到该对象");
        }
    }


    /**
     * 分页查询
     */
    //@PostMapping("/list")
   /* public Object list(UserInfo zUserInfo20200330,
                       @RequestParam(required = false, defaultValue = "0") int pageNumber,
                       @RequestParam(required = false, defaultValue = "10") int pageSize
    ) {
        List<UserInfo> list = sqlManager.query(UserInfo.class).select();
        return ApiReturnObject.success(list);
    }*/



}
