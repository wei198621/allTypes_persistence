package com.tz.leo.jdbcTemplateTest.dao.impl;

import com.tz.leo.jdbcTemplateTest.dao.BaseDao;
import com.tz.leo.jdbcTemplateTest.dao.IUserInfoDAO;
import com.tz.leo.jdbcTemplateTest.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Author: tz_wl
 * Date: 2020/3/30 14:29
 * Content:
 */
@Component(value = "userInfoDaoImpl")
public class UserInfoDaoImpl extends BaseDao implements IUserInfoDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public int add(UserInfo userInfo) {
        return jdbcTemplate.update("insert into jdbc_template_user  (ui_id,ui_is_login,ui_is_admin,ui_name) values (?,?,?,? )",
                userInfo.getUiId(),userInfo.getUiIsLogin(),userInfo.getUiIsAdmin(),userInfo.getUiName());
    }

    @Override
    public int update(UserInfo userInfo) {
        return jdbcTemplate.update("UPDATE  jdbc_template_user  SET ui_is_login=?,ui_is_admin=?,uti_id=?,ori_id=?,ui_login_name=?,ui_password=?,ui_image_url=?,ui_name=?,ui_sex=?,ui_job=?,ui_code=?,ui_mobile=?,ui_email=?,ui_phone=?,ui_fax=?,ui_address=?,ui_memo=?,ui_last_login_time=?,ui_last_login_ip=?,ui_login_num=?,ui_is_deleted=?,ui_insert_time=?,ui_update_time=?,ui_delete_time=?,ui_insert_id=?,ui_update_id=?,ui_delete_id=?,ori_code=?,ui_sap_code=?,ui_last_login_type=?,ui_charge_type=?,ui_is_bind_info=?,ui_sms_code=? where ui_id=?",
                userInfo.getUiIsLogin(),userInfo.getUiIsAdmin(),userInfo.getUtiId(),userInfo.getOriId(),userInfo.getUiLoginName(),userInfo.getUiPassword(),userInfo.getUiImageUrl(),userInfo.getUiName(),userInfo.getUiSex(),userInfo.getUiJob(),userInfo.getUiCode(),userInfo.getUiMobile(),userInfo.getUiEmail(),userInfo.getUiPhone(),userInfo.getUiFax(),userInfo.getUiAddress(),userInfo.getUiMemo(),userInfo.getUiLastLoginTime(),userInfo.getUiLastLoginIp(),userInfo.getUiLoginNum(),userInfo.getUiIsDeleted(),userInfo.getUiInsertTime(),userInfo.getUiUpdateTime(),userInfo.getUiDeleteTime(),userInfo.getUiInsertId(),userInfo.getUiUpdateId(),userInfo.getUiDeleteId(),userInfo.getOriCode(),userInfo.getUiSapCode(),userInfo.getUiLastLoginType(),userInfo.getUiChargeType(),userInfo.getUiIsBindInfo(),userInfo.getUiSmsCode(),userInfo.getUiId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE from jdbc_template_user where ui_id=?",id);
    }

    @Override
    public UserInfo findById(int id) {
        List<UserInfo> list = jdbcTemplate.query("select * from jdbc_template_user where ui_id=?", new Object[]{id}, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
        if(list!=null && list.size()>0){
            UserInfo userInfo = list.get(0);
            return userInfo;
        }else{
            return null;
        }
    }

    @Override
    public List<UserInfo> findAllList(Map<String,Object> params) {

        List<UserInfo> list = jdbcTemplate.query("select * from jdbc_template_user", new Object[]{}, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
