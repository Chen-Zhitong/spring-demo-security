/*
 Navicat Premium Data Transfer

 Source Server         : mysql57
 Source Server Type    : MySQL
 Source Server Version : 50734
 Source Host           : localhost:3307
 Source Schema         : shiro

 Target Server Type    : MySQL
 Target Server Version : 50734
 File Encoding         : 65001

 Date: 01/06/2022 17:29:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`
(
    `user_id` int(11) NOT NULL,
    `rid`     int(11) NOT NULL,
    PRIMARY KEY (`user_id`, `rid`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;
