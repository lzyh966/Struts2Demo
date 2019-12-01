/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50515
Source Host           : 127.0.0.1:3306
Source Database       : strutsdemo

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2019-10-21 21:19:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(40) NOT NULL,
  `credit` int(11) NOT NULL,
  `teacher` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of courses
-- ----------------------------
INSERT INTO `courses` VALUES ('1', '计算机组成原理', '3', '张酷');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `studentId` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` varchar(4) NOT NULL,
  `major` varchar(40) NOT NULL,
  `birthDate` varchar(50) NOT NULL,
  `memo` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '张三', '男', '物联网工程', '2019-10-15T00:00:00+08:00', '是一个学习计算机的人。');
INSERT INTO `student` VALUES ('3', '包拯', '男', '法学', '2019-10-16T00:00:00+08:00', '包青天');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', 'admin');
INSERT INTO `users` VALUES ('2', '张三', '123');
