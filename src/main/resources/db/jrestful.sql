/*
 Navicat Premium Data Transfer

 Source Server         : localhost 3307
 Source Server Type    : MySQL
 Source Server Version : 50626
 Source Host           : localhost
 Source Database       : jrestful

 Target Server Type    : MySQL
 Target Server Version : 50626
 File Encoding         : utf-8

 Date: 05/20/2016 17:23:29 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `emp`
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `emp`
-- ----------------------------
BEGIN;
INSERT INTO `emp` VALUES ('1', 'aaa', 'bbb'), ('2', 'ccc', 'ddd'), ('3', 'eee', 'fff');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
