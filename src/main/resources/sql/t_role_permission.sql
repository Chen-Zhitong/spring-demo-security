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

 Date: 01/06/2022 17:29:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_role_permission`;
CREATE TABLE `t_role_permission`
(
    `rid` int(11) NOT NULL,
    `pid` int(11) NOT NULL,
    PRIMARY KEY (`rid`, `pid`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;
