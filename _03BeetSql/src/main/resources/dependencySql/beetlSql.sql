/*
 Navicat Premium Data Transfer

 Source Server         : mysqlLocalConn
 Source Server Type    : MySQL
 Source Server Version : 50515
 Source Host           : localhost:3306
 Source Schema         : xgzx

 Target Server Type    : MySQL
 Target Server Version : 50515
 File Encoding         : 65001

 Date: 14/08/2020 15:53:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `beetl_user`;
CREATE TABLE `beetl_user`  (
  `ui_id` int(16) NOT NULL,
  `ui_is_login` int(1) NULL DEFAULT 0,
  `ui_is_admin` int(1) NULL DEFAULT 0,
  `uti_id` int(16) NULL DEFAULT NULL,
  `ori_id` int(16) NULL DEFAULT NULL,
  `ui_login_name` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_password` varchar(32) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_image_url` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_name` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_sex` varchar(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT '1',
  `ui_job` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_code` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_mobile` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_email` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_phone` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_fax` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_address` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_memo` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_last_login_time` date NULL DEFAULT NULL,
  `ui_last_login_ip` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_login_num` int(8) NULL DEFAULT 0,
  `ui_is_deleted` int(1) NULL DEFAULT 0,
  `ui_insert_time` date NULL DEFAULT NULL,
  `ui_update_time` date NULL DEFAULT NULL,
  `ui_delete_time` date NULL DEFAULT NULL,
  `ui_insert_id` int(16) NULL DEFAULT NULL,
  `ui_update_id` int(16) NULL DEFAULT NULL,
  `ui_delete_id` int(16) NULL DEFAULT NULL,
  `ori_code` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_sap_code` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ui_last_login_type` int(1) NULL DEFAULT NULL,
  `ui_charge_type` int(1) NULL DEFAULT NULL,
  `ui_is_bind_info` int(1) NULL DEFAULT NULL,
  `ui_sms_code` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ui_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `beetl_user` VALUES (294, NULL, NULL, NULL, 22, NULL, NULL, NULL, 'liLei', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `beetl_user` VALUES (4884, NULL, NULL, NULL, 22, NULL, NULL, NULL, 'liLei', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `beetl_user` VALUES (9145, NULL, NULL, NULL, 22, NULL, NULL, NULL, 'liLei', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;

select * from beetl_user ;
