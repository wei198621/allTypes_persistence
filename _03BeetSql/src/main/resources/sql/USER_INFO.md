sample
===

select #use("cols")# from user_info where #use("condition")#

cols
===
        `ui_id`,
        `ui_is_login`,
        `ui_is_admin`,
        `uti_id`,
        `ori_id`,
        `ui_login_name`,
        `ui_password`,
        `ui_image_url`,
        `ui_name`,
        `ui_sex`,
        `ui_job`,
        `ui_code`,
        `ui_mobile`,
        `ui_email`,
        `ui_phone`,
        `ui_fax`,
        `ui_address`,
        `ui_memo`,
        `ui_last_login_time`,
        `ui_last_login_ip`,
        `ui_login_num`,
        `ui_is_deleted`,
        `ui_insert_time`,
        `ui_update_time`,
        `ui_delete_time`,
        `ui_insert_id`,
        `ui_update_id`,
        `ui_delete_id`,
        `ori_code`,
        `ui_sap_code`,
        `ui_last_login_type`,
        `ui_charge_type`,
        `ui_is_bind_info`,
        `ui_sms_code`

updateSample
===
        `ui_id=#uiId#`,
        `ui_is_login=#uiIsLogin#`,
        `ui_is_admin=#uiIsAdmin#`,
        `uti_id=#utiId#`,
        `ori_id=#oriId#`,
        `ui_login_name=#uiLoginName#`,
        `ui_password=#uiPassword#`,
        `ui_image_url=#uiImageUrl#`,
        `ui_name=#uiName#`,
        `ui_sex=#uiSex#`,
        `ui_job=#uiJob#`,
        `ui_code=#uiCode#`,
        `ui_mobile=#uiMobile#`,
        `ui_email=#uiEmail#`,
        `ui_phone=#uiPhone#`,
        `ui_fax=#uiFax#`,
        `ui_address=#uiAddress#`,
        `ui_memo=#uiMemo#`,
        `ui_last_login_time=#uiLastLoginTime#`,
        `ui_last_login_ip=#uiLastLoginIp#`,
        `ui_login_num=#uiLoginNum#`,
        `ui_is_deleted=#uiIsDeleted#`,
        `ui_insert_time=#uiInsertTime#`,
        `ui_update_time=#uiUpdateTime#`,
        `ui_delete_time=#uiDeleteTime#`,
        `ui_insert_id=#uiInsertId#`,
        `ui_update_id=#uiUpdateId#`,
        `ui_delete_id=#uiDeleteId#`,
        `ori_code=#oriCode#`,
        `ui_sap_code=#uiSapCode#`,
        `ui_last_login_type=#uiLastLoginType#`,
        `ui_charge_type=#uiChargeType#`,
        `ui_is_bind_info=#uiIsBindInfo#`,
        `ui_sms_code=#uiSmsCode#`

condition
===
    1 = 1
    @if(!isEmpty(uiId)){
      and `ui_id`=#uiId#
    @}
    @if(!isEmpty(uiIsLogin)){
      and `ui_is_login`=#uiIsLogin#
    @}
    @if(!isEmpty(uiIsAdmin)){
      and `ui_is_admin`=#uiIsAdmin#
    @}
    @if(!isEmpty(utiId)){
      and `uti_id`=#utiId#
    @}
    @if(!isEmpty(oriId)){
      and `ori_id`=#oriId#
    @}
    @if(!isEmpty(uiLoginName)){
      and `ui_login_name`=#uiLoginName#
    @}
    @if(!isEmpty(uiPassword)){
      and `ui_password`=#uiPassword#
    @}
    @if(!isEmpty(uiImageUrl)){
      and `ui_image_url`=#uiImageUrl#
    @}
    @if(!isEmpty(uiName)){
      and `ui_name`=#uiName#
    @}
    @if(!isEmpty(uiSex)){
      and `ui_sex`=#uiSex#
    @}
    @if(!isEmpty(uiJob)){
      and `ui_job`=#uiJob#
    @}
    @if(!isEmpty(uiCode)){
      and `ui_code`=#uiCode#
    @}
    @if(!isEmpty(uiMobile)){
      and `ui_mobile`=#uiMobile#
    @}
    @if(!isEmpty(uiEmail)){
      and `ui_email`=#uiEmail#
    @}
    @if(!isEmpty(uiPhone)){
      and `ui_phone`=#uiPhone#
    @}
    @if(!isEmpty(uiFax)){
      and `ui_fax`=#uiFax#
    @}
    @if(!isEmpty(uiAddress)){
      and `ui_address`=#uiAddress#
    @}
    @if(!isEmpty(uiMemo)){
      and `ui_memo`=#uiMemo#
    @}
    @if(!isEmpty(uiLastLoginTime)){
      and `ui_last_login_time`=#uiLastLoginTime#
    @}
    @if(!isEmpty(uiLastLoginIp)){
      and `ui_last_login_ip`=#uiLastLoginIp#
    @}
    @if(!isEmpty(uiLoginNum)){
      and `ui_login_num`=#uiLoginNum#
    @}
    @if(!isEmpty(uiIsDeleted)){
      and `ui_is_deleted`=#uiIsDeleted#
    @}
    @if(!isEmpty(uiInsertTime)){
      and `ui_insert_time`=#uiInsertTime#
    @}
    @if(!isEmpty(uiUpdateTime)){
      and `ui_update_time`=#uiUpdateTime#
    @}
    @if(!isEmpty(uiDeleteTime)){
      and `ui_delete_time`=#uiDeleteTime#
    @}
    @if(!isEmpty(uiInsertId)){
      and `ui_insert_id`=#uiInsertId#
    @}
    @if(!isEmpty(uiUpdateId)){
      and `ui_update_id`=#uiUpdateId#
    @}
    @if(!isEmpty(uiDeleteId)){
      and `ui_delete_id`=#uiDeleteId#
    @}
    @if(!isEmpty(oriCode)){
      and `ori_code`=#oriCode#
    @}
    @if(!isEmpty(uiSapCode)){
      and `ui_sap_code`=#uiSapCode#
    @}
    @if(!isEmpty(uiLastLoginType)){
      and `ui_last_login_type`=#uiLastLoginType#
    @}
    @if(!isEmpty(uiChargeType)){
      and `ui_charge_type`=#uiChargeType#
    @}
    @if(!isEmpty(uiIsBindInfo)){
      and `ui_is_bind_info`=#uiIsBindInfo#
    @}
    @if(!isEmpty(uiSmsCode)){
      and `ui_sms_code`=#uiSmsCode#
    @}