package com.tiza.leo.beetSql.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Author: tz_wl
 * Date: 2020/3/30 14:21
 * Content:
 */
@Data

public class BeetlUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private BigDecimal uiId;

    /**
     * 是否登录
     */
    private Integer uiIsLogin;

    /**
     * 是否admin
     */
    private Integer uiIsAdmin;

    /**
     * uti_id
     */
    private BigDecimal utiId;

    /**
     * ori_id
     */
    private BigDecimal oriId;

    /**
     * 登录名
     */
    private String uiLoginName;

    /**
     * 密码
     */
    private String uiPassword;

    /**
     * ui_image_url
     */
    private String uiImageUrl;

    /**
     * ui_name
     */
    private String uiName;

    /**
     * ui_sex
     */
    private String uiSex;

    /**
     * ui_job
     */
    private String uiJob;

    /**
     * ui_code
     */
    private String uiCode;

    /**
     * ui_mobile
     */
    private String uiMobile;

    /**
     * ui_email
     */
    private String uiEmail;

    /**
     * ui_phone
     */
    private String uiPhone;

    /**
     * ui_fax
     */
    private String uiFax;

    /**
     * ui_address
     */
    private String uiAddress;

    /**
     * ui_memo
     */
    private String uiMemo;

    /**
     * ui_last_login_time
     */
    private Date uiLastLoginTime;

    /**
     * ui_last_login_ip
     */
    private String uiLastLoginIp;

    /**
     * ui_login_num
     */
    private Integer uiLoginNum;

    /**
     * ui_is_deleted
     */
    private Integer uiIsDeleted;

    /**
     * ui_insert_time
     */
    private Date uiInsertTime;

    /**
     * ui_update_time
     */
    private Date uiUpdateTime;

    /**
     * ui_delete_time
     */
    private Date uiDeleteTime;

    /**
     * ui_insert_id
     */
    private BigDecimal uiInsertId;

    /**
     * ui_update_id
     */
    private BigDecimal uiUpdateId;

    /**
     * ui_delete_id
     */
    private BigDecimal uiDeleteId;

    /**
     * ori_code
     */
    private String oriCode;

    /**
     * ui_sap_code
     */
    private String uiSapCode;

    /**
     * ui_last_login_type
     */
    private Integer uiLastLoginType;

    /**
     * ui_charge_type
     */
    private String uiChargeType;

    /**
     * ui_is_bind_info
     */
    private Integer uiIsBindInfo;

    /**
     * ui_sms_code
     */
    private String uiSmsCode;

    public BeetlUser() {
    }


}
