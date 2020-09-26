/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库连接
Source Server Version : 50730
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50730
File Encoding         : 65001

Date: 2020-09-01 09:57:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `uid` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `uname` varchar(255) DEFAULT NULL COMMENT '用户姓名',
  `pwd` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `sex` int(1) DEFAULT NULL COMMENT '用户性别，1：男，0：女',
  `age` int(3) DEFAULT NULL COMMENT '用户年龄',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '张三', 'zs', '1', '21');
INSERT INTO `users` VALUES ('2', '李四', 'ls', '0', '18');
INSERT INTO `users` VALUES ('3', '王五', 'ww', '0', '20');
INSERT INTO `users` VALUES ('4', '赵六', 'zl', '1', '26');
INSERT INTO `users` VALUES ('5', '十七', 'sq', '0', '22');
INSERT INTO `users` VALUES ('6', '阿什', 'as', '1', '25');
SET FOREIGN_KEY_CHECKS=1;
