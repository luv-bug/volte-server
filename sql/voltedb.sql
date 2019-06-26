/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : voltedb

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-05-27 10:31:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for app_info
-- ----------------------------
DROP TABLE IF EXISTS `app_info`;
CREATE TABLE `app_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `appname` varchar(30) NOT NULL COMMENT 'appname',
  `serverversion` varchar(20) NOT NULL COMMENT 'app版本',
  `serverflag` varchar(10) NOT NULL COMMENT '服务器标志',
  `lastforce` varchar(1) NOT NULL COMMENT '1:强制升级,0非强制升级',
  `updateurl` varchar(256) NOT NULL COMMENT 'app最新版本地址',
  `upgradeinfo` varchar(256) NOT NULL COMMENT '升级信息',
  `addtime` datetime NOT NULL COMMENT '添加时间',
  `remark` varchar(50) NOT NULL COMMENT '备注:最新版本值为current version，其他版本值为old version',
  PRIMARY KEY (`id`,`serverversion`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for call_measure
-- ----------------------------
DROP TABLE IF EXISTS `call_measure`;
CREATE TABLE `call_measure` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpn` varchar(20) DEFAULT NULL,
  `cpnlocation` varchar(255) DEFAULT NULL,
  `cpnlongitude` varchar(30) DEFAULT NULL,
  `cpnlatitude` varchar(30) DEFAULT NULL,
  `cpnrecordpath` varchar(255) DEFAULT NULL,
  `cpnremark` varchar(255) DEFAULT NULL,
  `cpdn` varchar(20) DEFAULT NULL,
  `cpdnlocation` varchar(30) DEFAULT NULL,
  `cpdnlongitude` varchar(30) DEFAULT NULL,
  `cpdnlatitude` varchar(30) DEFAULT NULL,
  `cpdnrecordpath` varchar(255) DEFAULT NULL,
  `cpdnremark` varchar(255) DEFAULT NULL,
  `calltime` datetime DEFAULT NULL,
  `testresult` varchar(20) DEFAULT NULL,
  `uploadtype` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
