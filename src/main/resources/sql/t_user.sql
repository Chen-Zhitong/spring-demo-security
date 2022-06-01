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

 Date: 01/06/2022 17:29:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT,
    `username`    varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    `passwd`      varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    `create_time` datetime                                DEFAULT NULL,
    `status`      varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '1',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;
