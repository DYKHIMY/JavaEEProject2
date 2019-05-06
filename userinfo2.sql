/*
Navicat MySQL Data Transfer

Source Server         : Tanyaconnect
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : javaee

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2019-05-06 18:56:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for userinfo2
-- ----------------------------
DROP TABLE IF EXISTS `userinfo2`;
CREATE TABLE `userinfo2` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo2
-- ----------------------------
INSERT INTO `userinfo2` VALUES ('1', 'test1', '111111');
