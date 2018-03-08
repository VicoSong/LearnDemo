/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-01-24 14:17:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for filesave
-- ----------------------------
DROP TABLE IF EXISTS `filesave`;
CREATE TABLE `filesave` (
  `filename` varchar(50) DEFAULT NULL,
  `savepath` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of filesave
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `role` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'swk', '101000', '管理员');
INSERT INTO `user` VALUES ('2', 'brown', '123456', '普通用户');
INSERT INTO `user` VALUES ('3', 'admin', 'admin', '管理员');
INSERT INTO `user` VALUES ('4', 'vico', '101000', '普通用户');
