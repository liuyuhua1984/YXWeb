/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50714
Source Host           : 127.0.0.1:3306
Source Database       : gamecenter

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-07 21:09:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for oa_action
-- ----------------------------
DROP TABLE IF EXISTS `oa_action`;
CREATE TABLE `oa_action` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `actionname` varchar(50) DEFAULT NULL,
  `actioncode` varchar(50) DEFAULT NULL,
  `icon` varchar(200) DEFAULT NULL,
  `sort` int(11) DEFAULT '0',
  `info` varchar(200) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=161 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oa_action
-- ----------------------------
INSERT INTO `oa_action` VALUES ('32', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('34', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('35', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('36', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('37', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('38', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('39', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('40', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('41', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('42', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('43', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('44', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('45', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('46', '查看', 'see', '', '0', '');
INSERT INTO `oa_action` VALUES ('48', '账号禁言', 'words', '', '0', '');
INSERT INTO `oa_action` VALUES ('49', 'IP禁言', 'wordsForIp', '', '0', '');
INSERT INTO `oa_action` VALUES ('50', '封号', 'passport', '', '0', '');
INSERT INTO `oa_action` VALUES ('51', '踢人', 'player', '', '0', '');
INSERT INTO `oa_action` VALUES ('60', '查看', null, null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('64', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('68', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('69', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('70', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('71', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('72', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('73', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('74', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('75', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('76', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('77', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('78', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('79', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('80', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('81', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('82', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('83', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('84', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('85', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('86', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('87', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('88', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('89', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('90', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('91', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('92', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('93', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('94', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('95', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('96', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('97', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('98', '模块树', 'getmoduletree', '', '0', '');
INSERT INTO `oa_action` VALUES ('99', '数据列表', 'reportList', '', '0', '');
INSERT INTO `oa_action` VALUES ('100', '列表数据', 'dataList', '', '0', '');
INSERT INTO `oa_action` VALUES ('101', '玩家明细', 'datamsg', '', '0', '');
INSERT INTO `oa_action` VALUES ('102', '数据列表', 'newuserList', '', '0', '');
INSERT INTO `oa_action` VALUES ('103', '数据列表', 'list', '', '0', '');
INSERT INTO `oa_action` VALUES ('104', '数据列表', 'list', '', '0', '');
INSERT INTO `oa_action` VALUES ('105', '实时在线', 'online', '', '0', '');
INSERT INTO `oa_action` VALUES ('106', '每日在线', 'onlineDayByHour', '', '0', '');
INSERT INTO `oa_action` VALUES ('107', '数据列表', 'list', '', '0', '');
INSERT INTO `oa_action` VALUES ('108', '图表分析', 'getOnlineByhour', '', '0', '');
INSERT INTO `oa_action` VALUES ('109', '等级列表', 'fenbulist', '', '0', '');
INSERT INTO `oa_action` VALUES ('110', '等级范围分布', 'gradescope', '', '0', '');
INSERT INTO `oa_action` VALUES ('111', '等级图表', 'gradeList', '', '0', '');
INSERT INTO `oa_action` VALUES ('112', '明细列表', 'detaillist', '', '0', '');
INSERT INTO `oa_action` VALUES ('113', '日报列表', 'reportList', '', '0', '');
INSERT INTO `oa_action` VALUES ('114', '排行列表', 'paytopList', '', '0', '');
INSERT INTO `oa_action` VALUES ('115', '数据列表', 'payhabitList', '', '0', '');
INSERT INTO `oa_action` VALUES ('116', '数据列表', 'reportList', '', '0', '');
INSERT INTO `oa_action` VALUES ('117', '图表分布', 'consumeList', '', '0', '');
INSERT INTO `oa_action` VALUES ('118', '执行封禁', 'execute', '', '0', '');
INSERT INTO `oa_action` VALUES ('119', '数据保存', 'save', '', '0', '');
INSERT INTO `oa_action` VALUES ('120', '循环控制', 'optCycle', '', '0', '');
INSERT INTO `oa_action` VALUES ('121', '发起查询', 'select', '', '0', '');
INSERT INTO `oa_action` VALUES ('122', '添加白名单', 'save', '', '0', '');
INSERT INTO `oa_action` VALUES ('123', '发起申请', 'applySave', '', '0', '');
INSERT INTO `oa_action` VALUES ('124', '金币发放', 'sendpage', '', '0', '');
INSERT INTO `oa_action` VALUES ('125', '发放保存', 'sendSave', '', '0', '');
INSERT INTO `oa_action` VALUES ('126', '数据列表', 'getmoneyList', '', '0', '');
INSERT INTO `oa_action` VALUES ('127', '充值汇总', 'getpaycount', '', '0', '');
INSERT INTO `oa_action` VALUES ('128', '数据列表', 'dataList', '', '0', '');
INSERT INTO `oa_action` VALUES ('129', '充值累计', 'paycount', '', '0', '');
INSERT INTO `oa_action` VALUES ('130', '订单数据', 'datamsg', '', '0', '');
INSERT INTO `oa_action` VALUES ('131', '补单发货', 'fahuo', '', '0', '');
INSERT INTO `oa_action` VALUES ('132', '添加页面', 'add', '', '0', '');
INSERT INTO `oa_action` VALUES ('133', '数据保存', 'savedata', '', '0', '');
INSERT INTO `oa_action` VALUES ('134', '删除', 'del', '', '0', '');
INSERT INTO `oa_action` VALUES ('135', '新增', 'add', '', '0', '');
INSERT INTO `oa_action` VALUES ('136', '更新', 'update', '', '0', '');
INSERT INTO `oa_action` VALUES ('137', '数据保存', 'savedata', '', '0', '');
INSERT INTO `oa_action` VALUES ('138', '删除', 'del', '', '0', '');
INSERT INTO `oa_action` VALUES ('139', '数据上报状态控制', 'upstatus', '', '0', '');
INSERT INTO `oa_action` VALUES ('140', '邀请开关', 'invite', '', '0', '');
INSERT INTO `oa_action` VALUES ('141', '新增', 'activityadd', '', '0', '');
INSERT INTO `oa_action` VALUES ('142', '保存', 'saveActivity', '', '0', '');
INSERT INTO `oa_action` VALUES ('143', '数据列表', 'dataList', '', '0', '');
INSERT INTO `oa_action` VALUES ('144', '新增', 'addcdkpage', '', '0', '');
INSERT INTO `oa_action` VALUES ('145', '保存', 'createCdk', '', '0', '');
INSERT INTO `oa_action` VALUES ('146', '应用选择联动区服', 'changeWorld', '', '0', '');
INSERT INTO `oa_action` VALUES ('147', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('148', '查看', 'see', null, '1', '入口方法');
INSERT INTO `oa_action` VALUES ('149', '编辑', 'edit', '', '0', '');
INSERT INTO `oa_action` VALUES ('150', '新增', 'add', '', '0', '');
INSERT INTO `oa_action` VALUES ('151', '编辑', 'edit', '', '0', '');
INSERT INTO `oa_action` VALUES ('152', '保存数据', 'savedata', '', '0', '');
INSERT INTO `oa_action` VALUES ('153', '删除', 'del', '', '0', '');
INSERT INTO `oa_action` VALUES ('154', '新增', 'add', '', '0', '');
INSERT INTO `oa_action` VALUES ('155', '编辑', 'edit', '', '0', '');
INSERT INTO `oa_action` VALUES ('156', '保存', 'save', '', '0', '');
INSERT INTO `oa_action` VALUES ('157', '删除', 'del', '', '0', '');
INSERT INTO `oa_action` VALUES ('158', '选择运营商', 'selectOperatorByAppId', '', '0', '');
INSERT INTO `oa_action` VALUES ('159', 'json列表', 'getJsonList', '', '0', '');
INSERT INTO `oa_action` VALUES ('160', '数据列表', 'dataList', '', '0', '');

-- ----------------------------
-- Table structure for oa_module
-- ----------------------------
DROP TABLE IF EXISTS `oa_module`;
CREATE TABLE `oa_module` (
  `mid` int(11) NOT NULL AUTO_INCREMENT COMMENT '模块id',
  `pid` int(11) DEFAULT '0' COMMENT '父id',
  `modulename` varchar(50) DEFAULT NULL COMMENT '名称',
  `moduleurl` varchar(200) DEFAULT NULL COMMENT '模块url',
  `sort` int(11) DEFAULT '1' COMMENT '排序',
  `status` varchar(1) DEFAULT '0' COMMENT '状态0:正常 1:禁用',
  `info` varchar(200) DEFAULT NULL COMMENT '简介',
  `icon` varchar(300) DEFAULT NULL COMMENT '图标名称地址',
  `type` varchar(20) DEFAULT '1',
  `joinid` varchar(200) DEFAULT NULL,
  `level` int(11) DEFAULT '1',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=187 DEFAULT CHARSET=utf8 COMMENT='菜单模块表';

-- ----------------------------
-- Records of oa_module
-- ----------------------------
INSERT INTO `oa_module` VALUES ('80', '0', '运营管理', '', '1', '0', '', null, '1', '80', '1');
INSERT INTO `oa_module` VALUES ('82', '0', '运维管理', '', '3', '0', '', null, '1', '82', '1');
INSERT INTO `oa_module` VALUES ('83', '0', '支撑管理', '', '4', '0', '', null, '1', '83', '1');
INSERT INTO `oa_module` VALUES ('84', '80', '游戏概况', '', '1', '0', '', null, '1', '80_84', '2');
INSERT INTO `oa_module` VALUES ('85', '84', '汇总概况', '/oss/survey/gather', '1', '0', '', null, '0', '80_84_85', '3');
INSERT INTO `oa_module` VALUES ('86', '84', '综合日报', '/oss/survey/report', '2', '0', '', null, '0', '80_84_86', '3');
INSERT INTO `oa_module` VALUES ('89', '80', '游戏玩家', '', '2', '0', '', null, '1', '80_89', '2');
INSERT INTO `oa_module` VALUES ('90', '89', '玩家列表', '/oss/gameuser/base', '1', '0', '', null, '0', '80_89_90', '3');
INSERT INTO `oa_module` VALUES ('91', '89', '新增玩家', '/oss/gameuser/new', '2', '0', '', null, '0', '80_89_91', '3');
INSERT INTO `oa_module` VALUES ('92', '89', '活跃玩家', '/oss/gameuser/active', '3', '0', '', null, '0', '80_89_92', '3');
INSERT INTO `oa_module` VALUES ('93', '89', '玩家留存', '/oss/gameuser/remain', '4', '0', '', null, '0', '80_89_93', '3');
INSERT INTO `oa_module` VALUES ('94', '80', '在线分析', '', '3', '0', '', null, '1', '80_94', '2');
INSERT INTO `oa_module` VALUES ('95', '94', '实时在线', '/oss/online/now', '1', '0', '', null, '0', '80_94_95', '3');
INSERT INTO `oa_module` VALUES ('96', '94', '历史在线', '/oss/online/history', '3', '0', '', null, '0', '80_94_96', '3');
INSERT INTO `oa_module` VALUES ('97', '80', '等级分析', '', '4', '0', '', null, '1', '80_97', '2');
INSERT INTO `oa_module` VALUES ('98', '97', '等级分布', '/oss/grade/scope', '1', '0', '', null, '0', '80_97_98', '3');
INSERT INTO `oa_module` VALUES ('99', '97', '等级明细', '/oss/grade/detail', '2', '0', '', null, '0', '80_97_99', '3');
INSERT INTO `oa_module` VALUES ('100', '80', '收入分析', '', '5', '0', '', null, '1', '80_100', '2');
INSERT INTO `oa_module` VALUES ('101', '80', '消费分析', '', '6', '0', '', null, '1', '80_101', '2');
INSERT INTO `oa_module` VALUES ('102', '100', '充值日报', '/oss/pay/dayreport', '1', '0', '', null, '0', '80_100_102', '3');
INSERT INTO `oa_module` VALUES ('103', '100', '付费排行', '/oss/pay/top', '1', '0', '', null, '0', '80_100_103', '3');
INSERT INTO `oa_module` VALUES ('104', '100', '付费习惯', '/oss/pay/habit', '1', '0', '', null, '0', '80_100_104', '3');
INSERT INTO `oa_module` VALUES ('105', '101', '消费点统计', '/oss/consume/report', '1', '0', '', null, '0', '80_101_105', '3');
INSERT INTO `oa_module` VALUES ('130', '0', '客服管理', '', '2', '0', '', null, '1', '130', '1');
INSERT INTO `oa_module` VALUES ('131', '130', '封禁管理', '', '1', '0', '', null, '1', '130_131', '2');
INSERT INTO `oa_module` VALUES ('132', '130', '公告管理', '', '2', '0', '', null, '1', '130_132', '2');
INSERT INTO `oa_module` VALUES ('133', '130', '玩家查询', '', '3', '0', '', null, '1', '130_133', '2');
INSERT INTO `oa_module` VALUES ('134', '130', '内部充值', '', '4', '0', '', null, '1', '130_134', '2');
INSERT INTO `oa_module` VALUES ('135', '130', '外部充值', '', '5', '0', '', null, '1', '130_135', '2');
INSERT INTO `oa_module` VALUES ('136', '131', '封禁记录', '/gmt/forbid/msglist', '1', '0', '', null, '0', '130_131_136', '3');
INSERT INTO `oa_module` VALUES ('137', '131', '账号禁言', '/gmt/forbid/wordsforpassport', '2', '0', '', null, '0', '130_131_137', '3');
INSERT INTO `oa_module` VALUES ('138', '131', 'IP  禁言', '/gmt/forbid/wordsforip', '3', '0', '', null, '0', '130_131_138', '3');
INSERT INTO `oa_module` VALUES ('139', '131', '封号', '/gmt/forbid/passport', '4', '0', '', null, '0', '130_131_139', '3');
INSERT INTO `oa_module` VALUES ('140', '131', '踢人', '/gmt/forbid/tiren', '5', '0', '', null, '0', '130_131_140', '3');
INSERT INTO `oa_module` VALUES ('141', '132', '公告列表', '/gmt/notice/list', '1', '0', '', null, '0', '130_132_141', '3');
INSERT INTO `oa_module` VALUES ('142', '132', '发送公告', '/gmt/notice/send', '2', '0', '', null, '0', '130_132_142', '3');
INSERT INTO `oa_module` VALUES ('143', '132', '循环公告', '/gmt/notice/cyclelist', '3', '0', '', null, '0', '130_132_143', '3');
INSERT INTO `oa_module` VALUES ('144', '133', '账号查询', '/gmt/passport/select', '1', '0', '', null, '0', '130_133_144', '3');
INSERT INTO `oa_module` VALUES ('145', '133', '添加白名单', '/gmt/passport/allow', '2', '0', '', null, '0', '130_133_145', '3');
INSERT INTO `oa_module` VALUES ('146', '134', '发起申请', '/gmt/money/apply', '1', '0', '', null, '0', '130_134_146', '3');
INSERT INTO `oa_module` VALUES ('147', '134', '申请记录', '/gmt/money/applyList', '2', '0', '', null, '0', '130_134_147', '3');
INSERT INTO `oa_module` VALUES ('148', '134', '发放记录', '/gmt/money/sendLog', '3', '0', '', null, '0', '130_134_148', '3');
INSERT INTO `oa_module` VALUES ('149', '134', '金币记录', '/gmt/money/getmoney', '3', '0', '', null, '0', '130_134_149', '3');
INSERT INTO `oa_module` VALUES ('150', '135', '充值记录', '/gmt/recharge', '1', '0', '', null, '0', '130_135_150', '3');
INSERT INTO `oa_module` VALUES ('151', '83', '产品管理', '', '1', '0', '', null, '1', '83_151', '2');
INSERT INTO `oa_module` VALUES ('152', '83', '区服管理', '', '22', '0', '', null, '1', '83_152', '2');
INSERT INTO `oa_module` VALUES ('153', '83', '联运管理', '', '3', '0', '', null, '0', '83_153', '2');
INSERT INTO `oa_module` VALUES ('154', '83', '活动管理', '', '44', '0', '', null, '1', '83_154', '2');
INSERT INTO `oa_module` VALUES ('156', '151', '产品列表', '/apps/game', '1', '0', '', null, '0', '83_151_156', '3');
INSERT INTO `oa_module` VALUES ('157', '152', '区服列表', '/apps/world', '2', '0', '', null, '0', '83_152_157', '3');
INSERT INTO `oa_module` VALUES ('158', '153', '联运商列表', '/apps/operator', '3', '0', '', null, '0', '83_153_158', '3');
INSERT INTO `oa_module` VALUES ('159', '154', '活动管理', '/oss/activity', '1', '0', '', null, '0', '83_154_159', '3');
INSERT INTO `oa_module` VALUES ('160', '154', '卡密管理', '/oss/activity/card', '2', '0', '', null, '0', '83_154_160', '3');
INSERT INTO `oa_module` VALUES ('161', '154', '道具管理', '', '3', '0', '', null, '0', '83_154_161', '3');
INSERT INTO `oa_module` VALUES ('162', '0', '系统管理', '', '55', '0', '', null, '1', '162', '1');
INSERT INTO `oa_module` VALUES ('163', '162', '账户管理', '', '1', '0', '', null, '1', '162_163', '2');
INSERT INTO `oa_module` VALUES ('164', '163', '账户列表', '/sys/user', '1', '0', '', null, '0', '162_163_164', '3');
INSERT INTO `oa_module` VALUES ('165', '162', '权限管理', '', '2', '0', '', null, '1', '162_165', '2');
INSERT INTO `oa_module` VALUES ('166', '162', '系统管理', '', '3', '0', '', null, '1', '162_166', '2');
INSERT INTO `oa_module` VALUES ('167', '165', '模块管理', '/sys/module', '1', '0', '', null, '0', '162_165_167', '3');
INSERT INTO `oa_module` VALUES ('168', '165', '角色管理', '/sys/role', '2', '0', '', null, '0', '162_165_168', '3');
INSERT INTO `oa_module` VALUES ('169', '165', '系统设置', '/sys/set', '3', '0', '', null, '0', '162_165_169', '3');
INSERT INTO `oa_module` VALUES ('170', '166', '数据分析', '/sys/analyzeset', '1', '0', '', null, '0', '162_166_170', '3');
INSERT INTO `oa_module` VALUES ('171', '166', '数据备份', '', '2', '0', '', null, '0', '162_166_171', '3');
INSERT INTO `oa_module` VALUES ('186', '153', '联运商产品', '/apps/operator/product', '2', '0', '', null, '0', '83_153_186', '3');

-- ----------------------------
-- Table structure for oa_permit
-- ----------------------------
DROP TABLE IF EXISTS `oa_permit`;
CREATE TABLE `oa_permit` (
  `permitid` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT NULL,
  `aid` int(11) DEFAULT NULL,
  `info` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`permitid`)
) ENGINE=InnoDB AUTO_INCREMENT=161 DEFAULT CHARSET=utf8 COMMENT='基本权限表';

-- ----------------------------
-- Records of oa_permit
-- ----------------------------
INSERT INTO `oa_permit` VALUES ('32', '85', '32', null);
INSERT INTO `oa_permit` VALUES ('34', '86', '34', null);
INSERT INTO `oa_permit` VALUES ('35', '90', '35', null);
INSERT INTO `oa_permit` VALUES ('36', '91', '36', null);
INSERT INTO `oa_permit` VALUES ('37', '92', '37', null);
INSERT INTO `oa_permit` VALUES ('38', '93', '38', null);
INSERT INTO `oa_permit` VALUES ('39', '95', '39', null);
INSERT INTO `oa_permit` VALUES ('40', '98', '40', null);
INSERT INTO `oa_permit` VALUES ('41', '99', '41', null);
INSERT INTO `oa_permit` VALUES ('42', '103', '42', null);
INSERT INTO `oa_permit` VALUES ('43', '104', '43', null);
INSERT INTO `oa_permit` VALUES ('44', '102', '44', null);
INSERT INTO `oa_permit` VALUES ('45', '105', '45', null);
INSERT INTO `oa_permit` VALUES ('46', '96', '46', null);
INSERT INTO `oa_permit` VALUES ('64', '125', '64', null);
INSERT INTO `oa_permit` VALUES ('68', '129', '68', null);
INSERT INTO `oa_permit` VALUES ('71', '136', '71', null);
INSERT INTO `oa_permit` VALUES ('72', '137', '72', null);
INSERT INTO `oa_permit` VALUES ('73', '138', '73', null);
INSERT INTO `oa_permit` VALUES ('74', '139', '74', null);
INSERT INTO `oa_permit` VALUES ('75', '140', '75', null);
INSERT INTO `oa_permit` VALUES ('76', '141', '76', null);
INSERT INTO `oa_permit` VALUES ('77', '142', '77', null);
INSERT INTO `oa_permit` VALUES ('78', '143', '78', null);
INSERT INTO `oa_permit` VALUES ('79', '144', '79', null);
INSERT INTO `oa_permit` VALUES ('80', '145', '80', null);
INSERT INTO `oa_permit` VALUES ('81', '146', '81', null);
INSERT INTO `oa_permit` VALUES ('82', '147', '82', null);
INSERT INTO `oa_permit` VALUES ('83', '148', '83', null);
INSERT INTO `oa_permit` VALUES ('84', '149', '84', null);
INSERT INTO `oa_permit` VALUES ('85', '150', '85', null);
INSERT INTO `oa_permit` VALUES ('86', '156', '86', null);
INSERT INTO `oa_permit` VALUES ('87', '157', '87', null);
INSERT INTO `oa_permit` VALUES ('88', '158', '88', null);
INSERT INTO `oa_permit` VALUES ('89', '159', '89', null);
INSERT INTO `oa_permit` VALUES ('90', '160', '90', null);
INSERT INTO `oa_permit` VALUES ('91', '161', '91', null);
INSERT INTO `oa_permit` VALUES ('92', '164', '92', null);
INSERT INTO `oa_permit` VALUES ('93', '167', '93', null);
INSERT INTO `oa_permit` VALUES ('94', '168', '94', null);
INSERT INTO `oa_permit` VALUES ('95', '169', '95', null);
INSERT INTO `oa_permit` VALUES ('96', '170', '96', null);
INSERT INTO `oa_permit` VALUES ('97', '171', '97', null);
INSERT INTO `oa_permit` VALUES ('98', '167', '98', null);
INSERT INTO `oa_permit` VALUES ('99', '86', '99', null);
INSERT INTO `oa_permit` VALUES ('100', '90', '100', null);
INSERT INTO `oa_permit` VALUES ('101', '90', '101', null);
INSERT INTO `oa_permit` VALUES ('102', '91', '102', null);
INSERT INTO `oa_permit` VALUES ('103', '92', '103', null);
INSERT INTO `oa_permit` VALUES ('104', '93', '104', null);
INSERT INTO `oa_permit` VALUES ('105', '95', '105', null);
INSERT INTO `oa_permit` VALUES ('106', '95', '106', null);
INSERT INTO `oa_permit` VALUES ('107', '96', '107', null);
INSERT INTO `oa_permit` VALUES ('108', '96', '108', null);
INSERT INTO `oa_permit` VALUES ('109', '98', '109', null);
INSERT INTO `oa_permit` VALUES ('110', '98', '110', null);
INSERT INTO `oa_permit` VALUES ('111', '98', '111', null);
INSERT INTO `oa_permit` VALUES ('112', '99', '112', null);
INSERT INTO `oa_permit` VALUES ('113', '102', '113', null);
INSERT INTO `oa_permit` VALUES ('114', '103', '114', null);
INSERT INTO `oa_permit` VALUES ('115', '104', '115', null);
INSERT INTO `oa_permit` VALUES ('116', '105', '116', null);
INSERT INTO `oa_permit` VALUES ('117', '105', '117', null);
INSERT INTO `oa_permit` VALUES ('118', '139', '118', null);
INSERT INTO `oa_permit` VALUES ('119', '142', '119', null);
INSERT INTO `oa_permit` VALUES ('120', '143', '120', null);
INSERT INTO `oa_permit` VALUES ('121', '144', '121', null);
INSERT INTO `oa_permit` VALUES ('122', '145', '122', null);
INSERT INTO `oa_permit` VALUES ('123', '146', '123', null);
INSERT INTO `oa_permit` VALUES ('124', '147', '124', null);
INSERT INTO `oa_permit` VALUES ('125', '147', '125', null);
INSERT INTO `oa_permit` VALUES ('126', '149', '126', null);
INSERT INTO `oa_permit` VALUES ('127', '149', '127', null);
INSERT INTO `oa_permit` VALUES ('128', '150', '128', null);
INSERT INTO `oa_permit` VALUES ('129', '150', '129', null);
INSERT INTO `oa_permit` VALUES ('130', '150', '130', null);
INSERT INTO `oa_permit` VALUES ('131', '150', '131', null);
INSERT INTO `oa_permit` VALUES ('132', '156', '132', null);
INSERT INTO `oa_permit` VALUES ('133', '156', '133', null);
INSERT INTO `oa_permit` VALUES ('134', '156', '134', null);
INSERT INTO `oa_permit` VALUES ('135', '157', '135', null);
INSERT INTO `oa_permit` VALUES ('136', '157', '136', null);
INSERT INTO `oa_permit` VALUES ('137', '157', '137', null);
INSERT INTO `oa_permit` VALUES ('138', '157', '138', null);
INSERT INTO `oa_permit` VALUES ('139', '157', '139', null);
INSERT INTO `oa_permit` VALUES ('140', '157', '140', null);
INSERT INTO `oa_permit` VALUES ('141', '159', '141', null);
INSERT INTO `oa_permit` VALUES ('142', '159', '142', null);
INSERT INTO `oa_permit` VALUES ('143', '160', '143', null);
INSERT INTO `oa_permit` VALUES ('144', '160', '144', null);
INSERT INTO `oa_permit` VALUES ('145', '160', '145', null);
INSERT INTO `oa_permit` VALUES ('146', '157', '146', null);
INSERT INTO `oa_permit` VALUES ('147', '186', '147', null);
INSERT INTO `oa_permit` VALUES ('148', '187', '148', null);
INSERT INTO `oa_permit` VALUES ('149', '156', '149', null);
INSERT INTO `oa_permit` VALUES ('150', '158', '150', null);
INSERT INTO `oa_permit` VALUES ('151', '158', '151', null);
INSERT INTO `oa_permit` VALUES ('152', '158', '152', null);
INSERT INTO `oa_permit` VALUES ('153', '158', '153', null);
INSERT INTO `oa_permit` VALUES ('154', '186', '154', null);
INSERT INTO `oa_permit` VALUES ('155', '186', '155', null);
INSERT INTO `oa_permit` VALUES ('156', '186', '156', null);
INSERT INTO `oa_permit` VALUES ('157', '186', '157', null);
INSERT INTO `oa_permit` VALUES ('158', '186', '158', null);
INSERT INTO `oa_permit` VALUES ('159', '156', '159', null);
INSERT INTO `oa_permit` VALUES ('160', '157', '160', null);

-- ----------------------------
-- Table structure for oa_permit_detail
-- ----------------------------
DROP TABLE IF EXISTS `oa_permit_detail`;
CREATE TABLE `oa_permit_detail` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `sourceid` int(11) DEFAULT NULL,
  `permitid` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT '1' COMMENT '1:权限组 2：角色',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=1839 DEFAULT CHARSET=utf8 COMMENT='权限组、角色';

-- ----------------------------
-- Records of oa_permit_detail
-- ----------------------------
INSERT INTO `oa_permit_detail` VALUES ('872', '16', '131', '2');
INSERT INTO `oa_permit_detail` VALUES ('873', '16', '85', '2');
INSERT INTO `oa_permit_detail` VALUES ('874', '16', '128', '2');
INSERT INTO `oa_permit_detail` VALUES ('875', '16', '129', '2');
INSERT INTO `oa_permit_detail` VALUES ('876', '16', '130', '2');
INSERT INTO `oa_permit_detail` VALUES ('877', '16', '44', '2');
INSERT INTO `oa_permit_detail` VALUES ('878', '16', '113', '2');
INSERT INTO `oa_permit_detail` VALUES ('879', '16', '114', '2');
INSERT INTO `oa_permit_detail` VALUES ('880', '16', '42', '2');
INSERT INTO `oa_permit_detail` VALUES ('881', '16', '115', '2');
INSERT INTO `oa_permit_detail` VALUES ('882', '16', '43', '2');
INSERT INTO `oa_permit_detail` VALUES ('883', '16', '45', '2');
INSERT INTO `oa_permit_detail` VALUES ('884', '16', '116', '2');
INSERT INTO `oa_permit_detail` VALUES ('885', '16', '117', '2');
INSERT INTO `oa_permit_detail` VALUES ('886', '16', '32', '2');
INSERT INTO `oa_permit_detail` VALUES ('887', '16', '34', '2');
INSERT INTO `oa_permit_detail` VALUES ('888', '16', '99', '2');
INSERT INTO `oa_permit_detail` VALUES ('889', '16', '100', '2');
INSERT INTO `oa_permit_detail` VALUES ('890', '16', '101', '2');
INSERT INTO `oa_permit_detail` VALUES ('891', '16', '35', '2');
INSERT INTO `oa_permit_detail` VALUES ('892', '16', '36', '2');
INSERT INTO `oa_permit_detail` VALUES ('893', '16', '102', '2');
INSERT INTO `oa_permit_detail` VALUES ('894', '16', '103', '2');
INSERT INTO `oa_permit_detail` VALUES ('895', '16', '37', '2');
INSERT INTO `oa_permit_detail` VALUES ('896', '16', '104', '2');
INSERT INTO `oa_permit_detail` VALUES ('897', '16', '38', '2');
INSERT INTO `oa_permit_detail` VALUES ('898', '16', '105', '2');
INSERT INTO `oa_permit_detail` VALUES ('899', '16', '39', '2');
INSERT INTO `oa_permit_detail` VALUES ('900', '16', '106', '2');
INSERT INTO `oa_permit_detail` VALUES ('901', '16', '107', '2');
INSERT INTO `oa_permit_detail` VALUES ('902', '16', '108', '2');
INSERT INTO `oa_permit_detail` VALUES ('903', '16', '46', '2');
INSERT INTO `oa_permit_detail` VALUES ('904', '16', '110', '2');
INSERT INTO `oa_permit_detail` VALUES ('905', '16', '111', '2');
INSERT INTO `oa_permit_detail` VALUES ('906', '16', '109', '2');
INSERT INTO `oa_permit_detail` VALUES ('907', '16', '40', '2');
INSERT INTO `oa_permit_detail` VALUES ('908', '16', '112', '2');
INSERT INTO `oa_permit_detail` VALUES ('909', '16', '41', '2');
INSERT INTO `oa_permit_detail` VALUES ('910', '17', '71', '2');
INSERT INTO `oa_permit_detail` VALUES ('911', '17', '72', '2');
INSERT INTO `oa_permit_detail` VALUES ('912', '17', '73', '2');
INSERT INTO `oa_permit_detail` VALUES ('913', '17', '118', '2');
INSERT INTO `oa_permit_detail` VALUES ('914', '17', '74', '2');
INSERT INTO `oa_permit_detail` VALUES ('915', '17', '75', '2');
INSERT INTO `oa_permit_detail` VALUES ('916', '17', '76', '2');
INSERT INTO `oa_permit_detail` VALUES ('917', '17', '119', '2');
INSERT INTO `oa_permit_detail` VALUES ('918', '17', '77', '2');
INSERT INTO `oa_permit_detail` VALUES ('919', '17', '120', '2');
INSERT INTO `oa_permit_detail` VALUES ('920', '17', '78', '2');
INSERT INTO `oa_permit_detail` VALUES ('921', '17', '79', '2');
INSERT INTO `oa_permit_detail` VALUES ('922', '17', '121', '2');
INSERT INTO `oa_permit_detail` VALUES ('923', '17', '100', '2');
INSERT INTO `oa_permit_detail` VALUES ('924', '17', '101', '2');
INSERT INTO `oa_permit_detail` VALUES ('925', '17', '35', '2');
INSERT INTO `oa_permit_detail` VALUES ('926', '18', '71', '2');
INSERT INTO `oa_permit_detail` VALUES ('927', '18', '72', '2');
INSERT INTO `oa_permit_detail` VALUES ('928', '18', '73', '2');
INSERT INTO `oa_permit_detail` VALUES ('929', '18', '118', '2');
INSERT INTO `oa_permit_detail` VALUES ('930', '18', '74', '2');
INSERT INTO `oa_permit_detail` VALUES ('931', '18', '75', '2');
INSERT INTO `oa_permit_detail` VALUES ('932', '18', '76', '2');
INSERT INTO `oa_permit_detail` VALUES ('933', '18', '119', '2');
INSERT INTO `oa_permit_detail` VALUES ('934', '18', '77', '2');
INSERT INTO `oa_permit_detail` VALUES ('935', '18', '120', '2');
INSERT INTO `oa_permit_detail` VALUES ('936', '18', '78', '2');
INSERT INTO `oa_permit_detail` VALUES ('937', '18', '79', '2');
INSERT INTO `oa_permit_detail` VALUES ('938', '18', '121', '2');
INSERT INTO `oa_permit_detail` VALUES ('939', '18', '122', '2');
INSERT INTO `oa_permit_detail` VALUES ('940', '18', '80', '2');
INSERT INTO `oa_permit_detail` VALUES ('941', '18', '123', '2');
INSERT INTO `oa_permit_detail` VALUES ('942', '18', '81', '2');
INSERT INTO `oa_permit_detail` VALUES ('943', '18', '125', '2');
INSERT INTO `oa_permit_detail` VALUES ('944', '18', '124', '2');
INSERT INTO `oa_permit_detail` VALUES ('945', '18', '82', '2');
INSERT INTO `oa_permit_detail` VALUES ('946', '18', '83', '2');
INSERT INTO `oa_permit_detail` VALUES ('947', '18', '126', '2');
INSERT INTO `oa_permit_detail` VALUES ('948', '18', '127', '2');
INSERT INTO `oa_permit_detail` VALUES ('949', '18', '84', '2');
INSERT INTO `oa_permit_detail` VALUES ('950', '18', '131', '2');
INSERT INTO `oa_permit_detail` VALUES ('951', '18', '85', '2');
INSERT INTO `oa_permit_detail` VALUES ('952', '18', '128', '2');
INSERT INTO `oa_permit_detail` VALUES ('953', '18', '129', '2');
INSERT INTO `oa_permit_detail` VALUES ('954', '18', '130', '2');
INSERT INTO `oa_permit_detail` VALUES ('955', '18', '100', '2');
INSERT INTO `oa_permit_detail` VALUES ('956', '18', '101', '2');
INSERT INTO `oa_permit_detail` VALUES ('957', '18', '35', '2');
INSERT INTO `oa_permit_detail` VALUES ('958', '19', '44', '2');
INSERT INTO `oa_permit_detail` VALUES ('959', '19', '113', '2');
INSERT INTO `oa_permit_detail` VALUES ('960', '19', '34', '2');
INSERT INTO `oa_permit_detail` VALUES ('961', '19', '99', '2');
INSERT INTO `oa_permit_detail` VALUES ('1736', '20', '71', '2');
INSERT INTO `oa_permit_detail` VALUES ('1737', '20', '72', '2');
INSERT INTO `oa_permit_detail` VALUES ('1738', '20', '73', '2');
INSERT INTO `oa_permit_detail` VALUES ('1739', '20', '74', '2');
INSERT INTO `oa_permit_detail` VALUES ('1740', '20', '118', '2');
INSERT INTO `oa_permit_detail` VALUES ('1741', '20', '75', '2');
INSERT INTO `oa_permit_detail` VALUES ('1742', '20', '76', '2');
INSERT INTO `oa_permit_detail` VALUES ('1743', '20', '77', '2');
INSERT INTO `oa_permit_detail` VALUES ('1744', '20', '119', '2');
INSERT INTO `oa_permit_detail` VALUES ('1745', '20', '78', '2');
INSERT INTO `oa_permit_detail` VALUES ('1746', '20', '120', '2');
INSERT INTO `oa_permit_detail` VALUES ('1747', '20', '79', '2');
INSERT INTO `oa_permit_detail` VALUES ('1748', '20', '121', '2');
INSERT INTO `oa_permit_detail` VALUES ('1749', '20', '80', '2');
INSERT INTO `oa_permit_detail` VALUES ('1750', '20', '122', '2');
INSERT INTO `oa_permit_detail` VALUES ('1751', '20', '81', '2');
INSERT INTO `oa_permit_detail` VALUES ('1752', '20', '123', '2');
INSERT INTO `oa_permit_detail` VALUES ('1753', '20', '82', '2');
INSERT INTO `oa_permit_detail` VALUES ('1754', '20', '124', '2');
INSERT INTO `oa_permit_detail` VALUES ('1755', '20', '125', '2');
INSERT INTO `oa_permit_detail` VALUES ('1756', '20', '83', '2');
INSERT INTO `oa_permit_detail` VALUES ('1757', '20', '84', '2');
INSERT INTO `oa_permit_detail` VALUES ('1758', '20', '126', '2');
INSERT INTO `oa_permit_detail` VALUES ('1759', '20', '127', '2');
INSERT INTO `oa_permit_detail` VALUES ('1760', '20', '85', '2');
INSERT INTO `oa_permit_detail` VALUES ('1761', '20', '128', '2');
INSERT INTO `oa_permit_detail` VALUES ('1762', '20', '129', '2');
INSERT INTO `oa_permit_detail` VALUES ('1763', '20', '130', '2');
INSERT INTO `oa_permit_detail` VALUES ('1764', '20', '131', '2');
INSERT INTO `oa_permit_detail` VALUES ('1765', '20', '92', '2');
INSERT INTO `oa_permit_detail` VALUES ('1766', '20', '93', '2');
INSERT INTO `oa_permit_detail` VALUES ('1767', '20', '98', '2');
INSERT INTO `oa_permit_detail` VALUES ('1768', '20', '94', '2');
INSERT INTO `oa_permit_detail` VALUES ('1769', '20', '95', '2');
INSERT INTO `oa_permit_detail` VALUES ('1770', '20', '96', '2');
INSERT INTO `oa_permit_detail` VALUES ('1771', '20', '97', '2');
INSERT INTO `oa_permit_detail` VALUES ('1772', '20', '44', '2');
INSERT INTO `oa_permit_detail` VALUES ('1773', '20', '113', '2');
INSERT INTO `oa_permit_detail` VALUES ('1774', '20', '42', '2');
INSERT INTO `oa_permit_detail` VALUES ('1775', '20', '114', '2');
INSERT INTO `oa_permit_detail` VALUES ('1776', '20', '43', '2');
INSERT INTO `oa_permit_detail` VALUES ('1777', '20', '115', '2');
INSERT INTO `oa_permit_detail` VALUES ('1778', '20', '45', '2');
INSERT INTO `oa_permit_detail` VALUES ('1779', '20', '116', '2');
INSERT INTO `oa_permit_detail` VALUES ('1780', '20', '117', '2');
INSERT INTO `oa_permit_detail` VALUES ('1781', '20', '32', '2');
INSERT INTO `oa_permit_detail` VALUES ('1782', '20', '34', '2');
INSERT INTO `oa_permit_detail` VALUES ('1783', '20', '99', '2');
INSERT INTO `oa_permit_detail` VALUES ('1784', '20', '35', '2');
INSERT INTO `oa_permit_detail` VALUES ('1785', '20', '100', '2');
INSERT INTO `oa_permit_detail` VALUES ('1786', '20', '101', '2');
INSERT INTO `oa_permit_detail` VALUES ('1787', '20', '36', '2');
INSERT INTO `oa_permit_detail` VALUES ('1788', '20', '102', '2');
INSERT INTO `oa_permit_detail` VALUES ('1789', '20', '37', '2');
INSERT INTO `oa_permit_detail` VALUES ('1790', '20', '103', '2');
INSERT INTO `oa_permit_detail` VALUES ('1791', '20', '38', '2');
INSERT INTO `oa_permit_detail` VALUES ('1792', '20', '104', '2');
INSERT INTO `oa_permit_detail` VALUES ('1793', '20', '39', '2');
INSERT INTO `oa_permit_detail` VALUES ('1794', '20', '105', '2');
INSERT INTO `oa_permit_detail` VALUES ('1795', '20', '106', '2');
INSERT INTO `oa_permit_detail` VALUES ('1796', '20', '46', '2');
INSERT INTO `oa_permit_detail` VALUES ('1797', '20', '107', '2');
INSERT INTO `oa_permit_detail` VALUES ('1798', '20', '108', '2');
INSERT INTO `oa_permit_detail` VALUES ('1799', '20', '40', '2');
INSERT INTO `oa_permit_detail` VALUES ('1800', '20', '109', '2');
INSERT INTO `oa_permit_detail` VALUES ('1801', '20', '110', '2');
INSERT INTO `oa_permit_detail` VALUES ('1802', '20', '111', '2');
INSERT INTO `oa_permit_detail` VALUES ('1803', '20', '41', '2');
INSERT INTO `oa_permit_detail` VALUES ('1804', '20', '112', '2');
INSERT INTO `oa_permit_detail` VALUES ('1805', '20', '86', '2');
INSERT INTO `oa_permit_detail` VALUES ('1806', '20', '132', '2');
INSERT INTO `oa_permit_detail` VALUES ('1807', '20', '133', '2');
INSERT INTO `oa_permit_detail` VALUES ('1808', '20', '134', '2');
INSERT INTO `oa_permit_detail` VALUES ('1809', '20', '149', '2');
INSERT INTO `oa_permit_detail` VALUES ('1810', '20', '159', '2');
INSERT INTO `oa_permit_detail` VALUES ('1811', '20', '87', '2');
INSERT INTO `oa_permit_detail` VALUES ('1812', '20', '135', '2');
INSERT INTO `oa_permit_detail` VALUES ('1813', '20', '136', '2');
INSERT INTO `oa_permit_detail` VALUES ('1814', '20', '137', '2');
INSERT INTO `oa_permit_detail` VALUES ('1815', '20', '138', '2');
INSERT INTO `oa_permit_detail` VALUES ('1816', '20', '139', '2');
INSERT INTO `oa_permit_detail` VALUES ('1817', '20', '140', '2');
INSERT INTO `oa_permit_detail` VALUES ('1818', '20', '146', '2');
INSERT INTO `oa_permit_detail` VALUES ('1819', '20', '160', '2');
INSERT INTO `oa_permit_detail` VALUES ('1820', '20', '88', '2');
INSERT INTO `oa_permit_detail` VALUES ('1821', '20', '150', '2');
INSERT INTO `oa_permit_detail` VALUES ('1822', '20', '151', '2');
INSERT INTO `oa_permit_detail` VALUES ('1823', '20', '152', '2');
INSERT INTO `oa_permit_detail` VALUES ('1824', '20', '153', '2');
INSERT INTO `oa_permit_detail` VALUES ('1825', '20', '147', '2');
INSERT INTO `oa_permit_detail` VALUES ('1826', '20', '154', '2');
INSERT INTO `oa_permit_detail` VALUES ('1827', '20', '155', '2');
INSERT INTO `oa_permit_detail` VALUES ('1828', '20', '156', '2');
INSERT INTO `oa_permit_detail` VALUES ('1829', '20', '157', '2');
INSERT INTO `oa_permit_detail` VALUES ('1830', '20', '158', '2');
INSERT INTO `oa_permit_detail` VALUES ('1831', '20', '89', '2');
INSERT INTO `oa_permit_detail` VALUES ('1832', '20', '141', '2');
INSERT INTO `oa_permit_detail` VALUES ('1833', '20', '142', '2');
INSERT INTO `oa_permit_detail` VALUES ('1834', '20', '90', '2');
INSERT INTO `oa_permit_detail` VALUES ('1835', '20', '143', '2');
INSERT INTO `oa_permit_detail` VALUES ('1836', '20', '144', '2');
INSERT INTO `oa_permit_detail` VALUES ('1837', '20', '145', '2');
INSERT INTO `oa_permit_detail` VALUES ('1838', '20', '91', '2');

-- ----------------------------
-- Table structure for oa_role
-- ----------------------------
DROP TABLE IF EXISTS `oa_role`;
CREATE TABLE `oa_role` (
  `roleid` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(50) DEFAULT NULL,
  `status` varchar(1) DEFAULT '1' COMMENT '1:启用  0：失效',
  `info` varchar(500) DEFAULT NULL,
  `pgids` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='权限组';

-- ----------------------------
-- Records of oa_role
-- ----------------------------
INSERT INTO `oa_role` VALUES ('16', '产品运营', '1', '', '');
INSERT INTO `oa_role` VALUES ('17', '普通客服', '1', '', '');
INSERT INTO `oa_role` VALUES ('18', '客服主管', '1', '', '');
INSERT INTO `oa_role` VALUES ('19', '财务管理', '1', '', '');
INSERT INTO `oa_role` VALUES ('20', '管理员', '1', '', '');

-- ----------------------------
-- Table structure for oa_user
-- ----------------------------
DROP TABLE IF EXISTS `oa_user`;
CREATE TABLE `oa_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `passport` varchar(50) NOT NULL,
  `pwd` varchar(32) DEFAULT NULL,
  `uname` varchar(30) DEFAULT NULL,
  `tel` varchar(11) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `regTime` varchar(20) DEFAULT NULL,
  `logincount` int(11) DEFAULT NULL,
  `lastLoginTime` varchar(20) DEFAULT NULL,
  `status` varchar(1) DEFAULT '0' COMMENT '0:正常      1:禁用',
  `isonine` varchar(1) DEFAULT '0' COMMENT '0:不在线  1：在线',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户基础表';

-- ----------------------------
-- Records of oa_user
-- ----------------------------
INSERT INTO `oa_user` VALUES ('10', 'admin', '1', '超级管理员', '', '', null, null, null, '1', '0');
INSERT INTO `oa_user` VALUES ('15', 'gsbgsb', '123123', '古世彬', '', '', null, null, null, '1', '0');
INSERT INTO `oa_user` VALUES ('16', 'hjl', 'hjl', '胡君琳', null, null, null, null, null, '1', '0');

-- ----------------------------
-- Table structure for oa_user_permit
-- ----------------------------
DROP TABLE IF EXISTS `oa_user_permit`;
CREATE TABLE `oa_user_permit` (
  `uid` int(11) NOT NULL,
  `deptid` int(11) DEFAULT NULL,
  `posid` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL,
  `pgid` int(11) DEFAULT NULL,
  `info` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户授权表，用户ID与角色、职位、项目及直接授予的权限串表；';

-- ----------------------------
-- Records of oa_user_permit
-- ----------------------------
INSERT INTO `oa_user_permit` VALUES ('11', null, null, '0', null, null);
INSERT INTO `oa_user_permit` VALUES ('13', null, null, '16', null, null);
INSERT INTO `oa_user_permit` VALUES ('14', null, null, '18', null, null);
INSERT INTO `oa_user_permit` VALUES ('15', null, null, '20', null, null);
INSERT INTO `oa_user_permit` VALUES ('16', null, null, '20', null, null);

-- ----------------------------
-- Table structure for op_activity
-- ----------------------------
DROP TABLE IF EXISTS `op_activity`;
CREATE TABLE `op_activity` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `keyword` varchar(500) DEFAULT NULL,
  `begintime` varchar(20) DEFAULT NULL,
  `endtime` varchar(20) DEFAULT NULL,
  `info` varchar(500) DEFAULT NULL COMMENT '备注',
  `status` varchar(1) DEFAULT '0' COMMENT '状态0：运行中  1：已经结束',
  `addtime` varchar(20) DEFAULT NULL COMMENT '记录时间',
  `isbing` varchar(1) DEFAULT '1' COMMENT '活动卡密是否绑定账号0:否 1：是',
  `joincount` int(11) DEFAULT '0' COMMENT '玩家参与的次数 0 ：无限制  其他:参与的次数',
  `appid` varchar(50) DEFAULT NULL,
  `worldids` varchar(1000) DEFAULT NULL COMMENT '#间隔',
  `cardnum` int(11) DEFAULT '0',
  `usenum` int(11) DEFAULT '0',
  `award` varchar(1000) DEFAULT NULL COMMENT '类型*编号*数量 # ',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动信息表';

-- ----------------------------
-- Records of op_activity
-- ----------------------------

-- ----------------------------
-- Table structure for op_activity_cdk
-- ----------------------------
DROP TABLE IF EXISTS `op_activity_cdk`;
CREATE TABLE `op_activity_cdk` (
  `cdkcode` varchar(50) NOT NULL,
  `aid` int(11) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `status` varchar(1) DEFAULT '0' COMMENT '0:可以  1：已经使用',
  PRIMARY KEY (`cdkcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='CDK信息表';

-- ----------------------------
-- Records of op_activity_cdk
-- ----------------------------

-- ----------------------------
-- Table structure for op_activity_uselog
-- ----------------------------
DROP TABLE IF EXISTS `op_activity_uselog`;
CREATE TABLE `op_activity_uselog` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '流水id',
  `cdkcode` varchar(50) DEFAULT NULL,
  `aid` int(11) DEFAULT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `worldid` varchar(50) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `userip` varchar(20) DEFAULT NULL,
  `info` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='玩家卡密使用记录';

-- ----------------------------
-- Records of op_activity_uselog
-- ----------------------------

-- ----------------------------
-- Table structure for op_gameapp
-- ----------------------------
DROP TABLE IF EXISTS `op_gameapp`;
CREATE TABLE `op_gameapp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appid` varchar(20) DEFAULT NULL,
  `appname` varchar(100) DEFAULT NULL,
  `info` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `appid` (`appid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gameapp
-- ----------------------------
INSERT INTO `op_gameapp` VALUES ('1', 'game1001', '棋牌', '棋牌');
INSERT INTO `op_gameapp` VALUES ('7', 'app1', '蛮荒', '蛮荒');

-- ----------------------------
-- Table structure for op_gameapp_version
-- ----------------------------
DROP TABLE IF EXISTS `op_gameapp_version`;
CREATE TABLE `op_gameapp_version` (
  `id` varchar(20) NOT NULL,
  `appid` varchar(20) DEFAULT NULL,
  `vsid` varchar(100) DEFAULT NULL,
  `vname` varchar(100) DEFAULT NULL,
  `info` varchar(1000) DEFAULT NULL,
  `sendtime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gameapp_version
-- ----------------------------

-- ----------------------------
-- Table structure for op_gameworld
-- ----------------------------
DROP TABLE IF EXISTS `op_gameworld`;
CREATE TABLE `op_gameworld` (
  `wid` int(11) NOT NULL AUTO_INCREMENT COMMENT '内部编号',
  `appid` varchar(20) DEFAULT NULL,
  `vsid` varchar(20) DEFAULT NULL,
  `wname` varchar(100) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL COMMENT '唯一',
  `status` varchar(2) DEFAULT NULL,
  `domain` varchar(50) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  `serverurl` varchar(100) DEFAULT NULL,
  `info` varchar(2000) DEFAULT NULL,
  `ismingle` varchar(2) DEFAULT '0' COMMENT '1: 是 0：不是',
  `time` varchar(20) DEFAULT NULL,
  `opentime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gameworld
-- ----------------------------
INSERT INTO `op_gameworld` VALUES ('10', 'game1001', null, '局域网', '1003', '1', '192.168.1.150', '192.168.1.150', '8005', '', '0', null, '2014-06-05');
INSERT INTO `op_gameworld` VALUES ('18', 'game1001', null, '凤飞飞', '1001', '1', '192.168.0.189', '192.168.0.189', '3102', '2222', '0', null, '2014-07-03');

-- ----------------------------
-- Table structure for op_game_goods
-- ----------------------------
DROP TABLE IF EXISTS `op_game_goods`;
CREATE TABLE `op_game_goods` (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `gtype` varchar(20) DEFAULT NULL,
  `gcode` varchar(50) DEFAULT NULL,
  `gname` varchar(100) DEFAULT NULL,
  `info` varchar(1000) DEFAULT NULL,
  `appid` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='游戏道具表';

-- ----------------------------
-- Records of op_game_goods
-- ----------------------------
INSERT INTO `op_game_goods` VALUES ('4', '4', '0', '金币', '金币', 'game001');
INSERT INTO `op_game_goods` VALUES ('5', '6', '7301', '仙豆', '仙豆', 'game001');

-- ----------------------------
-- Table structure for op_gmt_forbidmsg
-- ----------------------------
DROP TABLE IF EXISTS `op_gmt_forbidmsg`;
CREATE TABLE `op_gmt_forbidmsg` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `ptype` int(11) DEFAULT NULL COMMENT '1:账号 2:：角色',
  `passport` varchar(50) DEFAULT NULL,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `opttype` int(11) DEFAULT NULL,
  `forbidtime` int(11) DEFAULT NULL COMMENT '单位分钟',
  `ip` varchar(20) DEFAULT NULL,
  `msg` varchar(1000) DEFAULT NULL,
  `optres` varchar(100) DEFAULT NULL,
  `opttime` varchar(20) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_forbidmsg
-- ----------------------------

-- ----------------------------
-- Table structure for op_gmt_notice
-- ----------------------------
DROP TABLE IF EXISTS `op_gmt_notice`;
CREATE TABLE `op_gmt_notice` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `type` int(11) DEFAULT '1' COMMENT '1：一次性  2：循环',
  `content` varchar(1000) DEFAULT NULL,
  `msg` varchar(1000) DEFAULT NULL,
  `optres` varchar(100) DEFAULT NULL,
  `opttime` varchar(20) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_notice
-- ----------------------------

-- ----------------------------
-- Table structure for op_gmt_notice_cycle
-- ----------------------------
DROP TABLE IF EXISTS `op_gmt_notice_cycle`;
CREATE TABLE `op_gmt_notice_cycle` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `type` int(11) DEFAULT '1' COMMENT '1：一次性  2：循环',
  `cycletime` int(11) DEFAULT '1',
  `content` varchar(1000) DEFAULT NULL,
  `msg` varchar(1000) DEFAULT NULL,
  `opttime` varchar(20) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `settime` varchar(20) DEFAULT NULL,
  `status` varchar(2) DEFAULT '1' COMMENT '1:活跃  0：停止',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_notice_cycle
-- ----------------------------

-- ----------------------------
-- Table structure for op_gmt_sendmoney
-- ----------------------------
DROP TABLE IF EXISTS `op_gmt_sendmoney`;
CREATE TABLE `op_gmt_sendmoney` (
  `applyid` int(11) NOT NULL AUTO_INCREMENT,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `type` int(11) DEFAULT '1' COMMENT '1：指定账号  2：全服',
  `content` varchar(2000) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `status` varchar(20) DEFAULT '0',
  `checkmsg` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`applyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_sendmoney
-- ----------------------------

-- ----------------------------
-- Table structure for op_gmt_sendmoney_log
-- ----------------------------
DROP TABLE IF EXISTS `op_gmt_sendmoney_log`;
CREATE TABLE `op_gmt_sendmoney_log` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `applyid` int(11) DEFAULT NULL,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `type` int(11) DEFAULT '1' COMMENT '1：指定账号  2：全服',
  `passports` varchar(2000) DEFAULT NULL,
  `msg` varchar(1000) DEFAULT NULL,
  `optres` varchar(1000) DEFAULT NULL,
  `opttime` varchar(20) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_sendmoney_log
-- ----------------------------

-- ----------------------------
-- Table structure for op_gmt_sendmoney_pay
-- ----------------------------
DROP TABLE IF EXISTS `op_gmt_sendmoney_pay`;
CREATE TABLE `op_gmt_sendmoney_pay` (
  `orderid` varchar(32) NOT NULL,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `passport` varchar(50) DEFAULT NULL,
  `money` double(12,2) DEFAULT NULL,
  `sendid` int(11) DEFAULT NULL,
  `status` varchar(2) DEFAULT '1',
  `info` varchar(1000) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_sendmoney_pay
-- ----------------------------

-- ----------------------------
-- Table structure for op_operator
-- ----------------------------
DROP TABLE IF EXISTS `op_operator`;
CREATE TABLE `op_operator` (
  `optid` int(11) NOT NULL AUTO_INCREMENT COMMENT '运营商ID',
  `opcode` varchar(100) DEFAULT NULL,
  `optname` varchar(100) DEFAULT NULL COMMENT '运营商名称',
  `status` varchar(2) DEFAULT NULL COMMENT '状态',
  `info` varchar(2000) DEFAULT NULL COMMENT '信息',
  PRIMARY KEY (`optid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_operator
-- ----------------------------
INSERT INTO `op_operator` VALUES ('5', 'ywkj', '元巫科技', '1', '元巫科技');
INSERT INTO `op_operator` VALUES ('6', 'game360', '360游戏平台', '1', '360游戏平台');
INSERT INTO `op_operator` VALUES ('7', 'txgame', '腾讯平台', '1', '腾讯平台');

-- ----------------------------
-- Table structure for op_operator_product
-- ----------------------------
DROP TABLE IF EXISTS `op_operator_product`;
CREATE TABLE `op_operator_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `optid` int(11) DEFAULT NULL COMMENT '运营商ID',
  `appid` varchar(20) DEFAULT NULL,
  `appkey` varchar(100) DEFAULT NULL,
  `checkip` varchar(1000) DEFAULT NULL COMMENT '使用，间隔',
  `pfurl` varchar(300) DEFAULT NULL,
  `wnum` int(11) DEFAULT NULL,
  `status` varchar(2) DEFAULT NULL COMMENT '状态',
  `info` varchar(2000) DEFAULT NULL COMMENT '信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_operator_product
-- ----------------------------
INSERT INTO `op_operator_product` VALUES ('5', '5', 'game1001', '123456', '127.0.0.1,222.222.222.22', 'www.rekugame.com', null, '1', '213');
INSERT INTO `op_operator_product` VALUES ('6', '5', 'game1002', '333', '33', '3', '3', '1', '3');

-- ----------------------------
-- Table structure for op_operator_recharge
-- ----------------------------
DROP TABLE IF EXISTS `op_operator_recharge`;
CREATE TABLE `op_operator_recharge` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `passport` varchar(100) DEFAULT NULL,
  `sid` int(11) DEFAULT NULL,
  `gold` int(11) DEFAULT NULL,
  `money` double(10,2) DEFAULT NULL,
  `billno` varchar(100) DEFAULT NULL,
  `time` int(11) DEFAULT NULL,
  `flag` varchar(200) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  `res` varchar(100) DEFAULT NULL,
  `info` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_operator_recharge
-- ----------------------------

-- ----------------------------
-- Table structure for op_operator_world
-- ----------------------------
DROP TABLE IF EXISTS `op_operator_world`;
CREATE TABLE `op_operator_world` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `optid` int(11) DEFAULT NULL COMMENT '运营商ID',
  `wid` int(11) DEFAULT NULL COMMENT '内部编号',
  `number` varchar(50) DEFAULT NULL,
  `info` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_operator_world
-- ----------------------------
INSERT INTO `op_operator_world` VALUES ('1', '5', '15', '7', null);
INSERT INTO `op_operator_world` VALUES ('2', '5', '16', '123', null);
INSERT INTO `op_operator_world` VALUES ('3', '5', '17', '22', null);
INSERT INTO `op_operator_world` VALUES ('4', '5', '18', '222', null);
INSERT INTO `op_operator_world` VALUES ('5', '5', '19', '3', null);

-- ----------------------------
-- Table structure for op_oss_consume_dayreport
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_consume_dayreport`;
CREATE TABLE `op_oss_consume_dayreport` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `optid` varchar(20) DEFAULT NULL,
  `sfrom` varchar(20) DEFAULT NULL,
  `ctime` varchar(20) DEFAULT NULL,
  `itemtype` varchar(30) DEFAULT NULL,
  `itemname` varchar(50) DEFAULT NULL,
  `itemnum` int(11) DEFAULT NULL,
  `usernum` int(11) DEFAULT NULL,
  `money` double(12,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_consume_dayreport
-- ----------------------------

-- ----------------------------
-- Table structure for op_oss_online_dayreport
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_online_dayreport`;
CREATE TABLE `op_oss_online_dayreport` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `ctime` varchar(20) DEFAULT NULL,
  `maxval` int(11) DEFAULT '0',
  `minval` int(11) DEFAULT '0',
  `avgval` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_online_dayreport
-- ----------------------------

-- ----------------------------
-- Table structure for op_oss_pay_dayreport
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_pay_dayreport`;
CREATE TABLE `op_oss_pay_dayreport` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `optid` varchar(20) DEFAULT NULL,
  `sfrom` varchar(20) DEFAULT NULL,
  `ctime` varchar(20) DEFAULT NULL,
  `apa` int(11) DEFAULT '0',
  `newapa` int(11) DEFAULT '0',
  `total` double(12,2) DEFAULT '0.00',
  `arpu` double(12,2) DEFAULT '0.00',
  `payper` double(5,2) DEFAULT '0.00',
  `paycount` int(11) DEFAULT '0',
  `maxpay` double(12,2) DEFAULT '0.00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_pay_dayreport
-- ----------------------------

-- ----------------------------
-- Table structure for op_oss_qlz_compars
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_compars`;
CREATE TABLE `op_oss_qlz_compars` (
  `openid` varchar(50) NOT NULL,
  `pars` varchar(800) DEFAULT NULL COMMENT 'json串',
  `time` varchar(20) DEFAULT NULL,
  `info` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='进入应用时携带';

-- ----------------------------
-- Records of op_oss_qlz_compars
-- ----------------------------

-- ----------------------------
-- Table structure for op_oss_qlz_consume_log
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_consume_log`;
CREATE TABLE `op_oss_qlz_consume_log` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `worldid` varchar(20) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `moneybefore` double(12,2) DEFAULT NULL COMMENT '游戏币',
  `moneyafter` double(12,2) DEFAULT NULL,
  `lostmoney` double(12,2) DEFAULT NULL,
  `itemid` varchar(20) DEFAULT NULL,
  `itemtype` varchar(30) DEFAULT NULL,
  `itemnum` int(11) DEFAULT NULL,
  `itemname` varchar(50) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `rolename` varchar(50) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=511 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_qlz_consume_log
-- ----------------------------
INSERT INTO `op_oss_qlz_consume_log` VALUES ('1', 'game003', 'test', '1030.00', '1029.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:14:16', '45', '沃克瓦格纳', '2017-06-02 12:48:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('2', 'game003', 'test', '1029.00', '1028.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:14:16', '45', '沃克瓦格纳', '2017-06-02 12:48:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('3', 'game003', 'test', '1028.00', '1027.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:14:16', '45', '沃克瓦格纳', '2017-06-02 12:48:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('4', 'game003', 'test', '1027.00', '1026.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:14:17', '45', '沃克瓦格纳', '2017-06-02 12:48:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('5', 'game003', 'test', '1026.00', '1020.00', '-6.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-22 14:14:25', '45', '沃克瓦格纳', '2017-06-02 12:48:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('6', 'game003', 'test', '1020.00', '1009.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-22 14:19:22', '45', '沃克瓦格纳', '2017-06-02 12:48:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('7', 'game003', 'test', '1009.00', '998.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-22 14:31:10', '45', '沃克瓦格纳', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('8', 'game003', 'test', '998.00', '996.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:37', '45', '沃克瓦格纳', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('9', 'game003', 'test', '996.00', '994.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:39', '45', '沃克瓦格纳', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('10', 'game003', 'test', '994.00', '992.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:41', '45', '沃克瓦格纳', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('11', 'game003', 'test', '992.00', '990.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:41', '45', '沃克瓦格纳', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('12', 'game003', 'test', '990.00', '988.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:41', '45', '沃克瓦格纳', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('13', 'game003', 'test', '988.00', '986.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:41', '45', '沃克瓦格纳', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('14', 'game003', 'test', '986.00', '984.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:52', '45', '沃克瓦格纳', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('15', 'game003', 'test', '984.00', '982.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:53', '45', '沃克瓦格纳', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('16', 'game003', 'test', '982.00', '980.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:53', '45', '沃克瓦格纳', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('17', 'game003', 'test', '980.00', '978.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:54', '45', '沃克瓦格纳', '2017-06-02 12:48:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('18', 'game003', 'test', '978.00', '967.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-22 14:31:57', '45', '沃克瓦格纳', '2017-06-02 12:48:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('19', 'game003', 'test', '967.00', '965.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:58', '45', '沃克瓦格纳', '2017-06-02 12:48:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('20', 'game003', 'test', '965.00', '963.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:31:58', '45', '沃克瓦格纳', '2017-06-02 12:48:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('21', 'game003', 'test', '963.00', '962.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:12', '45', '沃克瓦格纳', '2017-06-02 12:48:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('22', 'game003', 'test', '962.00', '961.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:13', '45', '沃克瓦格纳', '2017-06-02 12:48:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('23', 'game003', 'test', '961.00', '960.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:13', '45', '沃克瓦格纳', '2017-06-02 12:48:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('24', 'game003', 'test', '960.00', '959.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:13', '45', '沃克瓦格纳', '2017-06-02 12:48:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('25', 'game003', 'test', '959.00', '958.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:13', '45', '沃克瓦格纳', '2017-06-02 12:48:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('26', 'game003', 'test', '958.00', '957.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:14', '45', '沃克瓦格纳', '2017-06-02 12:48:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('27', 'game003', 'test', '957.00', '956.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:14', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('28', 'game003', 'test', '956.00', '955.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:14', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('29', 'game003', 'test', '955.00', '954.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:14', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('30', 'game003', 'test', '954.00', '953.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:14', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('31', 'game003', 'test', '953.00', '952.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:15', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('32', 'game003', 'test', '952.00', '951.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:15', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('33', 'game003', 'test', '951.00', '950.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:15', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('34', 'game003', 'test', '950.00', '949.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:16', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('35', 'game003', 'test', '949.00', '948.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:16', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('36', 'game003', 'test', '948.00', '947.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:17', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('37', 'game003', 'test', '947.00', '946.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:17', '45', '沃克瓦格纳', '2017-06-02 12:48:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('38', 'game003', 'test', '946.00', '945.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:17', '45', '沃克瓦格纳', '2017-06-02 12:48:27');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('39', 'game003', 'test', '945.00', '934.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-22 14:32:19', '45', '沃克瓦格纳', '2017-06-02 12:48:27');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('40', 'game003', 'test', '934.00', '933.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:20', '45', '沃克瓦格纳', '2017-06-02 12:48:27');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('41', 'game003', 'test', '933.00', '932.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:20', '45', '沃克瓦格纳', '2017-06-02 12:48:27');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('42', 'game003', 'test', '932.00', '931.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:20', '45', '沃克瓦格纳', '2017-06-02 12:48:27');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('43', 'game003', 'test', '931.00', '930.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:21', '45', '沃克瓦格纳', '2017-06-02 12:48:28');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('44', 'game003', 'test', '930.00', '929.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:21', '45', '沃克瓦格纳', '2017-06-02 12:48:28');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('45', 'game003', 'test', '929.00', '928.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:21', '45', '沃克瓦格纳', '2017-06-02 12:48:28');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('46', 'game003', 'test', '928.00', '927.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:21', '45', '沃克瓦格纳', '2017-06-02 12:48:28');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('47', 'game003', 'test', '927.00', '926.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:21', '45', '沃克瓦格纳', '2017-06-02 12:48:28');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('48', 'game003', 'test', '926.00', '925.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:22', '45', '沃克瓦格纳', '2017-06-02 12:48:28');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('49', 'game003', 'test', '925.00', '923.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:22', '45', '沃克瓦格纳', '2017-06-02 12:48:28');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('50', 'game003', 'test', '923.00', '912.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-22 14:32:24', '45', '沃克瓦格纳', '2017-06-02 12:48:28');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('51', 'game003', 'test', '912.00', '910.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:25', '45', '沃克瓦格纳', '2017-06-02 12:48:28');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('52', 'game003', 'test', '910.00', '908.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:25', '45', '沃克瓦格纳', '2017-06-02 12:48:28');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('53', 'game003', 'test', '908.00', '906.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:25', '45', '沃克瓦格纳', '2017-06-02 12:48:29');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('54', 'game003', 'test', '906.00', '904.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:25', '45', '沃克瓦格纳', '2017-06-02 12:48:29');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('55', 'game003', 'test', '904.00', '902.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:26', '45', '沃克瓦格纳', '2017-06-02 12:48:29');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('56', 'game003', 'test', '902.00', '900.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:26', '45', '沃克瓦格纳', '2017-06-02 12:48:29');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('57', 'game003', 'test', '900.00', '898.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:26', '45', '沃克瓦格纳', '2017-06-02 12:48:29');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('58', 'game003', 'test', '898.00', '896.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:26', '45', '沃克瓦格纳', '2017-06-02 12:48:30');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('59', 'game003', 'test', '896.00', '894.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:26', '45', '沃克瓦格纳', '2017-06-02 12:48:30');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('60', 'game003', 'test', '894.00', '892.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:27', '45', '沃克瓦格纳', '2017-06-02 12:48:30');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('61', 'game003', 'test', '892.00', '881.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-22 14:32:29', '45', '沃克瓦格纳', '2017-06-02 12:48:30');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('62', 'game003', 'test', '881.00', '879.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:30', '45', '沃克瓦格纳', '2017-06-02 12:48:30');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('63', 'game003', 'test', '879.00', '877.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:30', '45', '沃克瓦格纳', '2017-06-02 12:48:30');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('64', 'game003', 'test', '877.00', '876.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:43', '45', '沃克瓦格纳', '2017-06-02 12:48:30');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('65', 'game003', 'test', '876.00', '875.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:43', '45', '沃克瓦格纳', '2017-06-02 12:48:30');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('66', 'game003', 'test', '875.00', '874.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:43', '45', '沃克瓦格纳', '2017-06-02 12:48:30');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('67', 'game003', 'test', '874.00', '873.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:43', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('68', 'game003', 'test', '873.00', '872.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:43', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('69', 'game003', 'test', '872.00', '871.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:44', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('70', 'game003', 'test', '871.00', '870.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:44', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('71', 'game003', 'test', '870.00', '869.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:44', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('72', 'game003', 'test', '869.00', '868.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:44', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('73', 'game003', 'test', '868.00', '867.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:45', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('74', 'game003', 'test', '867.00', '866.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:45', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('75', 'game003', 'test', '866.00', '865.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:45', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('76', 'game003', 'test', '865.00', '864.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:45', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('77', 'game003', 'test', '864.00', '863.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:46', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('78', 'game003', 'test', '863.00', '862.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:46', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('79', 'game003', 'test', '862.00', '861.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:46', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('80', 'game003', 'test', '861.00', '860.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:46', '45', '沃克瓦格纳', '2017-06-02 12:48:31');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('81', 'game003', 'test', '860.00', '859.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-22 14:32:46', '45', '沃克瓦格纳', '2017-06-02 12:48:32');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('82', 'game003', 'test', '859.00', '848.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-22 14:32:48', '45', '沃克瓦格纳', '2017-06-02 12:48:32');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('83', 'game003', 'test', '848.00', '828.00', '-20.00', '0', '57', '1', '购买会谈次数', '2014-08-22 14:34:00', '45', '沃克瓦格纳', '2017-06-02 12:48:32');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('84', 'game003', 'sad', '9999.00', '9989.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-22 14:54:19', '70', '格斯蒙哥马利', '2017-06-02 12:48:35');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('85', 'game003', 'sad', '9989.00', '9979.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-22 14:54:20', '70', '格斯蒙哥马利', '2017-06-02 12:48:35');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('86', 'game003', 'sad', '9979.00', '9969.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-22 14:54:22', '70', '格斯蒙哥马利', '2017-06-02 12:48:35');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('87', 'game003', 'sad', '9969.00', '9959.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-22 14:54:23', '70', '格斯蒙哥马利', '2017-06-02 12:48:35');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('88', 'game003', 'sad', '9959.00', '9949.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-22 14:54:23', '70', '格斯蒙哥马利', '2017-06-02 12:48:35');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('89', 'game003', 'sad', '9949.00', '9939.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-22 14:54:24', '70', '格斯蒙哥马利', '2017-06-02 12:48:35');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('90', 'game003', 'sad', '9939.00', '9929.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-22 14:54:24', '70', '格斯蒙哥马利', '2017-06-02 12:48:36');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('91', 'game003', 'sad', '9929.00', '9919.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-22 14:54:25', '70', '格斯蒙哥马利', '2017-06-02 12:48:36');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('92', 'game003', 'sad', '9919.00', '9909.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-22 14:54:26', '70', '格斯蒙哥马利', '2017-06-02 12:48:36');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('93', 'game003', 'sad', '9909.00', '9879.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 14:54:42', '70', '格斯蒙哥马利', '2017-06-02 12:48:36');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('94', 'game003', 'sad', '9879.00', '9849.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:05', '70', '格斯蒙哥马利', '2017-06-02 12:48:37');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('95', 'game003', 'sad', '9849.00', '9819.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:05', '70', '格斯蒙哥马利', '2017-06-02 12:48:37');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('96', 'game003', 'sad', '9819.00', '9789.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:05', '70', '格斯蒙哥马利', '2017-06-02 12:48:37');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('97', 'game003', 'sad', '9789.00', '9759.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:06', '70', '格斯蒙哥马利', '2017-06-02 12:48:38');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('98', 'game003', 'sad', '9759.00', '9729.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:06', '70', '格斯蒙哥马利', '2017-06-02 12:48:38');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('99', 'game003', 'sad', '9729.00', '9699.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:06', '70', '格斯蒙哥马利', '2017-06-02 12:48:38');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('100', 'game003', 'sad', '9699.00', '9669.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:06', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('101', 'game003', 'sad', '9669.00', '9639.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:06', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('102', 'game003', 'sad', '9639.00', '9609.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:06', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('103', 'game003', 'sad', '9609.00', '9579.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:07', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('104', 'game003', 'sad', '9579.00', '9549.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:07', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('105', 'game003', 'sad', '9549.00', '9519.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:07', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('106', 'game003', 'sad', '9519.00', '9489.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:07', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('107', 'game003', 'sad', '9489.00', '9459.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:07', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('108', 'game003', 'sad', '9459.00', '9429.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:07', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('109', 'game003', 'sad', '9429.00', '9399.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:08', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('110', 'game003', 'sad', '9399.00', '9369.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:08', '70', '格斯蒙哥马利', '2017-06-02 12:48:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('111', 'game003', 'sad', '9369.00', '9339.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:09', '70', '格斯蒙哥马利', '2017-06-02 12:48:40');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('112', 'game003', 'sad', '9339.00', '9309.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:09', '70', '格斯蒙哥马利', '2017-06-02 12:48:40');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('113', 'game003', 'sad', '9309.00', '9279.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:09', '70', '格斯蒙哥马利', '2017-06-02 12:48:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('114', 'game003', 'sad', '9279.00', '9249.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:09', '70', '格斯蒙哥马利', '2017-06-02 12:48:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('115', 'game003', 'sad', '9249.00', '9219.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:09', '70', '格斯蒙哥马利', '2017-06-02 12:48:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('116', 'game003', 'sad', '9219.00', '9189.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:09', '70', '格斯蒙哥马利', '2017-06-02 12:48:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('117', 'game003', 'sad', '9189.00', '9159.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:09', '70', '格斯蒙哥马利', '2017-06-02 12:48:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('118', 'game003', 'sad', '9159.00', '9129.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:09', '70', '格斯蒙哥马利', '2017-06-02 12:48:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('119', 'game003', 'sad', '9129.00', '9099.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-22 15:04:10', '70', '格斯蒙哥马利', '2017-06-02 12:48:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('120', 'game003', 'test', '14328.00', '4328.00', '-10000.00', '0', '58', '1', '购买会谈特权', '2014-08-22 15:09:12', '45', '沃克瓦格纳', '2017-06-02 12:48:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('121', 'game003', '1290', '100000000.00', '99999999.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:48', '70', 'sew', '2017-06-02 12:48:54');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('122', 'game003', '1290', '99999999.00', '99999998.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:49', '70', 'sew', '2017-06-02 12:48:54');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('123', 'game003', '1290', '99999998.00', '99999997.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:49', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('124', 'game003', '1290', '99999997.00', '99999996.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:49', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('125', 'game003', '1290', '99999996.00', '99999995.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:49', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('126', 'game003', '1290', '99999995.00', '99999994.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:49', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('127', 'game003', '1290', '99999994.00', '99999993.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:50', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('128', 'game003', '1290', '99999993.00', '99999982.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-25 10:24:55', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('129', 'game003', '1290', '99999982.00', '99999981.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:56', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('130', 'game003', '1290', '99999981.00', '99999980.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:57', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('131', 'game003', '1290', '99999980.00', '99999979.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:57', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('132', 'game003', '1290', '99999979.00', '99999978.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:57', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('133', 'game003', '1290', '99999978.00', '99999977.00', '-1.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:58', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('134', 'game003', '1290', '99999977.00', '99999975.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:58', '70', 'sew', '2017-06-02 12:48:55');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('135', 'game003', '1290', '99999975.00', '99999973.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:58', '70', 'sew', '2017-06-02 12:48:56');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('136', 'game003', '1290', '99999973.00', '99999971.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:58', '70', 'sew', '2017-06-02 12:48:56');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('137', 'game003', '1290', '99999971.00', '99999969.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:58', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('138', 'game003', '1290', '99999969.00', '99999967.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:24:59', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('139', 'game003', '1290', '99999967.00', '99999956.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-25 10:25:01', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('140', 'game003', '1290', '99999956.00', '99999954.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:25:02', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('141', 'game003', '1290', '99999954.00', '99999952.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:25:02', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('142', 'game003', '1290', '99999952.00', '99999950.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:25:03', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('143', 'game003', '1290', '99999950.00', '99999948.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:25:03', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('144', 'game003', '1290', '99999948.00', '99999946.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:25:03', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('145', 'game003', '1290', '99999946.00', '99999944.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:25:03', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('146', 'game003', '1290', '99999944.00', '99999942.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:25:04', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('147', 'game003', '1290', '99999942.00', '99999940.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:25:04', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('148', 'game003', '1290', '99999940.00', '99999938.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:25:04', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('149', 'game003', '1290', '99999938.00', '99999936.00', '-2.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:25:04', '70', 'sew', '2017-06-02 12:48:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('150', 'game003', '1290', '99999936.00', '99999925.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-25 10:25:41', '70', 'sew', '2017-06-02 12:48:58');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('151', 'game003', '1290', '99999925.00', '99999917.00', '-8.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-25 10:28:38', '70', 'sew', '2017-06-02 12:48:58');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('152', 'game003', '1290', '99999917.00', '99999906.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-25 10:29:05', '70', 'sew', '2017-06-02 12:48:58');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('153', 'game003', '1290', '99999906.00', '99999903.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:06', '70', 'sew', '2017-06-02 12:48:58');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('154', 'game003', '1290', '99999903.00', '99999900.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:09', '70', 'sew', '2017-06-02 12:48:58');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('155', 'game003', '1290', '99999900.00', '99999897.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:10', '70', 'sew', '2017-06-02 12:48:58');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('156', 'game003', '1290', '99999897.00', '99999894.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:11', '70', 'sew', '2017-06-02 12:48:58');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('157', 'game003', '1290', '99999894.00', '99999891.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:11', '70', 'sew', '2017-06-02 12:48:59');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('158', 'game003', '1290', '99999891.00', '99999888.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:12', '70', 'sew', '2017-06-02 12:48:59');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('159', 'game003', '1290', '99999888.00', '99999885.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:13', '70', 'sew', '2017-06-02 12:49:00');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('160', 'game003', '1290', '99999885.00', '99999882.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:13', '70', 'sew', '2017-06-02 12:49:00');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('161', 'game003', '1290', '99999882.00', '99999879.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:14', '70', 'sew', '2017-06-02 12:49:00');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('162', 'game003', '1290', '99999879.00', '99999876.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:15', '70', 'sew', '2017-06-02 12:49:00');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('163', 'game003', '1290', '99999876.00', '99999865.00', '-11.00', '0', '29', '1', '减少装备强化冷却时间', '2014-08-25 10:29:33', '70', 'sew', '2017-06-02 12:49:00');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('164', 'game003', '1290', '99999865.00', '99999862.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:34', '70', 'sew', '2017-06-02 12:49:00');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('165', 'game003', '1290', '99999862.00', '99999859.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:38', '70', 'sew', '2017-06-02 12:49:00');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('166', 'game003', '1290', '99999859.00', '99999856.00', '-3.00', '0', '27', '1', '装备强化提升成功率', '2014-08-25 10:29:39', '70', 'sew', '2017-06-02 12:49:00');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('167', 'game003', '1290', '99999856.00', '99999836.00', '-20.00', '0', '57', '1', '购买会谈次数', '2014-08-25 12:00:53', '70', 'sew', '2017-06-02 12:49:03');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('168', 'game003', '1290', '99999836.00', '99989836.00', '-10000.00', '0', '58', '1', '购买会谈特权', '2014-08-25 12:01:53', '70', 'sew', '2017-06-02 12:49:03');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('169', 'game003', 'sad', '99999.00', '99989.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:47:36', '1', '汤姆劳埃德', '2017-06-02 12:49:06');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('170', 'game003', 'sad', '99989.00', '99979.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:47:36', '1', '汤姆劳埃德', '2017-06-02 12:49:06');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('171', 'game003', 'sad', '99979.00', '99969.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:47:38', '1', '汤姆劳埃德', '2017-06-02 12:49:06');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('172', 'game003', 'sad', '99969.00', '99959.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:47:38', '1', '汤姆劳埃德', '2017-06-02 12:49:06');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('173', 'game003', 'sad', '99959.00', '99949.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:47:38', '1', '汤姆劳埃德', '2017-06-02 12:49:06');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('174', 'game003', 'sad', '99949.00', '99939.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:47:39', '1', '汤姆劳埃德', '2017-06-02 12:49:06');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('175', 'game003', 'sad', '99939.00', '99929.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:47:40', '1', '汤姆劳埃德', '2017-06-02 12:49:06');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('176', 'game003', 'sad', '99929.00', '99919.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:47:40', '1', '汤姆劳埃德', '2017-06-02 12:49:07');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('177', 'game003', 'sad', '99919.00', '99909.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:47:41', '1', '汤姆劳埃德', '2017-06-02 12:49:07');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('178', 'game003', 'sad', '99909.00', '99899.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:47:43', '1', '汤姆劳埃德', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('179', 'game003', '1290', '99989836.00', '99989806.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:49:29', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('180', 'game003', '1290', '99989806.00', '99989776.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:49:35', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('181', 'game003', '1290', '99989776.00', '99989746.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:49:38', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('182', 'game003', '1290', '99989746.00', '99989716.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:49:41', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('183', 'game003', '1290', '99989716.00', '99989686.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:49:43', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('184', 'game003', '1290', '99989686.00', '99989656.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:49:44', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('185', 'game003', '1290', '99989656.00', '99989626.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:49:45', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('186', 'game003', '1290', '99989626.00', '99989596.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:49:48', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('187', 'game003', '1290', '99989596.00', '99989566.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:49:49', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('188', 'game003', '1290', '99989566.00', '99989536.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:49:50', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('189', 'game003', '1290', '99989536.00', '99989506.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:50:26', '70', 'sew', '2017-06-02 12:49:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('190', 'game003', '1290', '99989506.00', '99989476.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:50:55', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('191', 'game003', '1290', '99989476.00', '99989446.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:03', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('192', 'game003', '1290', '99989446.00', '99989416.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:03', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('193', 'game003', '1290', '99989416.00', '99989386.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:04', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('194', 'game003', '1290', '99989386.00', '99989356.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:04', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('195', 'game003', '1290', '99989356.00', '99989326.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:39', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('196', 'game003', '1290', '99989326.00', '99989296.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:40', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('197', 'game003', '1290', '99989296.00', '99989266.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:41', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('198', 'game003', '1290', '99989266.00', '99989236.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:45', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('199', 'game003', '1290', '99989236.00', '99989206.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:48', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('200', 'game003', '1290', '99989206.00', '99989176.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:51', '70', 'sew', '2017-06-02 12:49:09');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('201', 'game003', '1290', '99989176.00', '99989146.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:53', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('202', 'game003', '1290', '99989146.00', '99989116.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:54', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('203', 'game003', '1290', '99989116.00', '99989086.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:56', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('204', 'game003', '1290', '99989086.00', '99989056.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:51:57', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('205', 'game003', '1290', '99989056.00', '99989026.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:52:02', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('206', 'game003', '1290', '99989026.00', '99988996.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:52:04', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('207', 'game003', '1290', '99988996.00', '99988966.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:52:08', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('208', 'game003', '1290', '99988966.00', '99988936.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:52:10', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('209', 'game003', '1290', '99988936.00', '99988926.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:55:10', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('210', 'game003', '1290', '99988926.00', '99988916.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:55:15', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('211', 'game003', '1290', '99988916.00', '99988906.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:55:19', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('212', 'game003', '1290', '99988906.00', '99988896.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:55:42', '70', 'sew', '2017-06-02 12:49:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('213', 'game003', '1290', '99988896.00', '99988886.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 13:55:47', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('214', 'game003', '1290', '99988886.00', '99988856.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:01', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('215', 'game003', '1290', '99988856.00', '99988826.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:04', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('216', 'game003', '1290', '99988826.00', '99988796.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:08', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('217', 'game003', '1290', '99988796.00', '99988766.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:12', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('218', 'game003', '1290', '99988766.00', '99988736.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:14', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('219', 'game003', '1290', '99988736.00', '99988706.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:17', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('220', 'game003', '1290', '99988706.00', '99988676.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:19', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('221', 'game003', '1290', '99988676.00', '99988646.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:22', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('222', 'game003', '1290', '99988646.00', '99988616.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:24', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('223', 'game003', '1290', '99988616.00', '99988586.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:28', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('224', 'game003', '1290', '99988586.00', '99988556.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:30', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('225', 'game003', '1290', '99988556.00', '99988526.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:32', '70', 'sew', '2017-06-02 12:49:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('226', 'game003', '1290', '99988526.00', '99988496.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:34', '70', 'sew', '2017-06-02 12:49:13');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('227', 'game003', '1290', '99988496.00', '99988466.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:36', '70', 'sew', '2017-06-02 12:49:14');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('228', 'game003', '1290', '99988466.00', '99988436.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:37', '70', 'sew', '2017-06-02 12:49:14');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('229', 'game003', '1290', '99988436.00', '99988406.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:39', '70', 'sew', '2017-06-02 12:49:14');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('230', 'game003', '1290', '99988406.00', '99988376.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:40', '70', 'sew', '2017-06-02 12:49:14');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('231', 'game003', '1290', '99988376.00', '99988346.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:42', '70', 'sew', '2017-06-02 12:49:14');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('232', 'game003', '1290', '99988346.00', '99988316.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:43', '70', 'sew', '2017-06-02 12:49:14');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('233', 'game003', '1290', '99988316.00', '99988286.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:44', '70', 'sew', '2017-06-02 12:49:14');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('234', 'game003', '1290', '99988286.00', '99988256.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:45', '70', 'sew', '2017-06-02 12:49:14');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('235', 'game003', '1290', '99988256.00', '99988226.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:46', '70', 'sew', '2017-06-02 12:49:14');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('236', 'game003', '1290', '99988226.00', '99988196.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:47', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('237', 'game003', '1290', '99988196.00', '99988166.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:49', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('238', 'game003', '1290', '99988166.00', '99988136.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:53', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('239', 'game003', '1290', '99988136.00', '99988106.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:54', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('240', 'game003', '1290', '99988106.00', '99988076.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:56:56', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('241', 'game003', '1290', '99988076.00', '99988046.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:02', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('242', 'game003', '1290', '99988046.00', '99988016.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:05', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('243', 'game003', '1290', '99988016.00', '99987986.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:07', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('244', 'game003', '1290', '99987986.00', '99987956.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:09', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('245', 'game003', '1290', '99987956.00', '99987926.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:11', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('246', 'game003', '1290', '99987926.00', '99987896.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:12', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('247', 'game003', '1290', '99987896.00', '99987866.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:14', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('248', 'game003', '1290', '99987866.00', '99987836.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:16', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('249', 'game003', '1290', '99987836.00', '99987806.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:18', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('250', 'game003', '1290', '99987806.00', '99987776.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:20', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('251', 'game003', '1290', '99987776.00', '99987746.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:23', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('252', 'game003', '1290', '99987746.00', '99987716.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:28', '70', 'sew', '2017-06-02 12:49:15');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('253', 'game003', '1290', '99987716.00', '99987686.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:38', '70', 'sew', '2017-06-02 12:49:16');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('254', 'game003', '1290', '99987686.00', '99987656.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 13:57:43', '70', 'sew', '2017-06-02 12:49:16');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('255', 'game003', '1290', '99987656.00', '99987528.00', '-128.00', '18025', '51', '1', '商店中购买物品道具', '2014-08-25 13:58:04', '70', 'sew', '2017-06-02 12:49:16');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('256', 'game003', '1290', '99987528.00', '99987400.00', '-128.00', '18019', '51', '1', '商店中购买物品道具', '2014-08-25 13:58:08', '70', 'sew', '2017-06-02 12:49:16');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('257', 'game003', '1290', '99987400.00', '99987272.00', '-128.00', '18023', '51', '1', '商店中购买物品道具', '2014-08-25 13:58:13', '70', 'sew', '2017-06-02 12:49:16');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('258', 'game003', '1290', '99987272.00', '99987144.00', '-128.00', '18021', '51', '1', '商店中购买物品道具', '2014-08-25 13:58:15', '70', 'sew', '2017-06-02 12:49:16');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('259', 'game003', '1290', '99987144.00', '99987016.00', '-128.00', '18020', '51', '1', '商店中购买物品道具', '2014-08-25 13:58:19', '70', 'sew', '2017-06-02 12:49:16');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('260', 'game003', '1290', '99987016.00', '99986888.00', '-128.00', '18023', '51', '1', '商店中购买物品道具', '2014-08-25 13:58:21', '70', 'sew', '2017-06-02 12:49:16');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('261', 'game003', 'sad', '99899.00', '99889.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:37', '1', '汤姆劳埃德', '2017-06-02 12:49:18');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('262', 'game003', 'sad', '99889.00', '99879.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:38', '1', '汤姆劳埃德', '2017-06-02 12:49:18');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('263', 'game003', 'sad', '99879.00', '99869.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:38', '1', '汤姆劳埃德', '2017-06-02 12:49:18');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('264', 'game003', 'sad', '99869.00', '99859.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:38', '1', '汤姆劳埃德', '2017-06-02 12:49:18');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('265', 'game003', 'sad', '99859.00', '99849.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:38', '1', '汤姆劳埃德', '2017-06-02 12:49:18');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('266', 'game003', 'sad', '99849.00', '99839.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:38', '1', '汤姆劳埃德', '2017-06-02 12:49:18');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('267', 'game003', 'sad', '99839.00', '99829.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:39', '1', '汤姆劳埃德', '2017-06-02 12:49:18');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('268', 'game003', 'sad', '99829.00', '99819.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:39', '1', '汤姆劳埃德', '2017-06-02 12:49:18');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('269', 'game003', 'sad', '99819.00', '99809.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:39', '1', '汤姆劳埃德', '2017-06-02 12:49:19');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('270', 'game003', 'sad', '99809.00', '99799.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:40', '1', '汤姆劳埃德', '2017-06-02 12:49:19');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('271', 'game003', 'sad', '99799.00', '99789.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:40', '1', '汤姆劳埃德', '2017-06-02 12:49:19');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('272', 'game003', 'sad', '99789.00', '99779.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:41', '1', '汤姆劳埃德', '2017-06-02 12:49:19');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('273', 'game003', 'sad', '99779.00', '99769.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:41', '1', '汤姆劳埃德', '2017-06-02 12:49:19');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('274', 'game003', 'sad', '99769.00', '99759.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:41', '1', '汤姆劳埃德', '2017-06-02 12:49:19');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('275', 'game003', 'sad', '99759.00', '99749.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:41', '1', '汤姆劳埃德', '2017-06-02 12:49:19');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('276', 'game003', 'sad', '99749.00', '99739.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:41', '1', '汤姆劳埃德', '2017-06-02 12:49:19');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('277', 'game003', 'sad', '99739.00', '99729.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:41', '1', '汤姆劳埃德', '2017-06-02 12:49:19');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('278', 'game003', 'sad', '99729.00', '99719.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:42', '1', '汤姆劳埃德', '2017-06-02 12:49:19');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('279', 'game003', 'sad', '99719.00', '99709.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:42', '1', '汤姆劳埃德', '2017-06-02 12:49:20');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('280', 'game003', 'sad', '99709.00', '99699.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:42', '1', '汤姆劳埃德', '2017-06-02 12:49:20');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('281', 'game003', 'sad', '99699.00', '99689.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:42', '1', '汤姆劳埃德', '2017-06-02 12:49:20');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('282', 'game003', 'sad', '99689.00', '99679.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:42', '1', '汤姆劳埃德', '2017-06-02 12:49:20');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('283', 'game003', 'sad', '99679.00', '99669.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:42', '1', '汤姆劳埃德', '2017-06-02 12:49:20');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('284', 'game003', 'sad', '99669.00', '99659.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:42', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('285', 'game003', 'sad', '99659.00', '99649.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:43', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('286', 'game003', 'sad', '99649.00', '99639.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:43', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('287', 'game003', 'sad', '99639.00', '99629.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:43', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('288', 'game003', 'sad', '99629.00', '99619.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:43', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('289', 'game003', 'sad', '99619.00', '99609.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:43', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('290', 'game003', 'sad', '99609.00', '99599.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:43', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('291', 'game003', 'sad', '99599.00', '99589.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:43', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('292', 'game003', 'sad', '99589.00', '99579.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:44', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('293', 'game003', 'sad', '99579.00', '99569.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:44', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('294', 'game003', 'sad', '99569.00', '99559.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:44', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('295', 'game003', 'sad', '99559.00', '99549.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:44', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('296', 'game003', 'sad', '99549.00', '99539.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:45', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('297', 'game003', 'sad', '99539.00', '99529.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:45', '1', '汤姆劳埃德', '2017-06-02 12:49:21');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('298', 'game003', 'sad', '99529.00', '99519.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:45', '1', '汤姆劳埃德', '2017-06-02 12:49:22');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('299', 'game003', 'sad', '99519.00', '99509.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:45', '1', '汤姆劳埃德', '2017-06-02 12:49:22');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('300', 'game003', 'sad', '99509.00', '99499.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:45', '1', '汤姆劳埃德', '2017-06-02 12:49:22');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('301', 'game003', 'sad', '99499.00', '99489.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:46', '1', '汤姆劳埃德', '2017-06-02 12:49:22');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('302', 'game003', 'sad', '99489.00', '99479.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:46', '1', '汤姆劳埃德', '2017-06-02 12:49:22');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('303', 'game003', 'sad', '99479.00', '99469.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:46', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('304', 'game003', 'sad', '99469.00', '99459.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:47', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('305', 'game003', 'sad', '99459.00', '99449.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:48', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('306', 'game003', 'sad', '99449.00', '99439.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:48', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('307', 'game003', 'sad', '99439.00', '99429.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:48', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('308', 'game003', 'sad', '99429.00', '99419.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:48', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('309', 'game003', 'sad', '99419.00', '99409.00', '-10.00', '0', '25', '1', '装备随即洗练', '2014-08-25 14:04:48', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('310', 'game003', 'sad', '99409.00', '99379.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:53', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('311', 'game003', 'sad', '99379.00', '99349.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:54', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('312', 'game003', 'sad', '99349.00', '99319.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:55', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('313', 'game003', 'sad', '99319.00', '99289.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:55', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('314', 'game003', 'sad', '99289.00', '99259.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:56', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('315', 'game003', 'sad', '99259.00', '99229.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:56', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('316', 'game003', 'sad', '99229.00', '99199.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:56', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('317', 'game003', 'sad', '99199.00', '99169.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:56', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('318', 'game003', 'sad', '99169.00', '99139.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:56', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('319', 'game003', 'sad', '99139.00', '99109.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:56', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('320', 'game003', 'sad', '99109.00', '99079.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:57', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('321', 'game003', 'sad', '99079.00', '99049.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:57', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('322', 'game003', 'sad', '99049.00', '99019.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:57', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('323', 'game003', 'sad', '99019.00', '98989.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:57', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('324', 'game003', 'sad', '98989.00', '98959.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:57', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('325', 'game003', 'sad', '98959.00', '98929.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:57', '1', '汤姆劳埃德', '2017-06-02 12:49:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('326', 'game003', 'sad', '98929.00', '98899.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:06:58', '1', '汤姆劳埃德', '2017-06-02 12:49:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('327', 'game003', 'sad', '98899.00', '98869.00', '-30.00', '0', '24', '2', '装备定向洗练:大师洗练', '2014-08-25 14:07:32', '1', '汤姆劳埃德', '2017-06-02 12:49:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('328', 'game003', '1290', '99986888.00', '99986760.00', '-128.00', '18024', '51', '1', '商店中购买物品道具', '2014-08-25 14:17:26', '70', 'sew', '2017-06-02 12:49:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('329', 'game003', '1290', '99986760.00', '99986632.00', '-128.00', '18024', '51', '1', '商店中购买物品道具', '2014-08-25 14:17:28', '70', 'sew', '2017-06-02 12:49:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('330', 'game003', '1290', '99986632.00', '99986504.00', '-128.00', '18025', '51', '1', '商店中购买物品道具', '2014-08-25 14:17:30', '70', 'sew', '2017-06-02 12:49:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('331', 'game003', '1290', '99986504.00', '99986376.00', '-128.00', '18024', '51', '1', '商店中购买物品道具', '2014-08-25 14:17:34', '70', 'sew', '2017-06-02 12:49:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('332', 'game003', '1290', '99986376.00', '99986248.00', '-128.00', '18025', '51', '1', '商店中购买物品道具', '2014-08-25 14:17:37', '70', 'sew', '2017-06-02 12:49:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('333', 'game003', '1290', '99986248.00', '99986206.00', '-42.00', '0', '42', '6', '背包解锁', '2014-08-25 14:17:46', '70', 'sew', '2017-06-02 12:49:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('334', 'game003', '1290', '99986206.00', '99984916.00', '-1290.00', '0', '42', '30', '背包解锁', '2014-08-25 14:17:49', '70', 'sew', '2017-06-02 12:49:26');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('335', 'game003', '1290', '100000000.00', '99990000.00', '-10000.00', '0', '58', '1', '购买会谈特权', '2014-08-26 09:48:40', '70', 'fff', '2017-06-02 12:49:34');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('336', 'game003', 'sa1', '8922779.00', '8912779.00', '-10000.00', '5061', '51', '10', '商店中购买物品道具', '2014-08-28 21:38:29', '40', 'sa1', '2017-06-02 12:49:36');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('337', 'game003', 'sa1', '8912779.00', '8911779.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-28 21:55:20', '40', 'sa1', '2017-06-02 12:49:36');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('338', 'game003', 'sa1', '8912779.00', '8911779.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-28 21:57:56', '40', 'sa1', '2017-06-02 12:49:36');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('339', 'game003', 'sa1', '8700779.00', '8600779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:24:44', '40', 'sa1', '2017-06-02 12:49:37');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('340', 'game003', 'sa1', '8600779.00', '8500779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:25:28', '40', 'sa1', '2017-06-02 12:49:38');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('341', 'game003', 'sa1', '8500779.00', '8400779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:26:12', '40', 'sa1', '2017-06-02 12:49:38');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('342', 'game003', 'sa1', '8600779.00', '8500779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:30:17', '40', 'sa1', '2017-06-02 12:49:38');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('343', 'game003', 'sa1', '8500779.00', '8400779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:30:38', '40', 'sa1', '2017-06-02 12:49:38');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('344', 'game003', '12', '7764610.00', '7763610.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-28 22:30:44', '3', '福勒菲尔丁', '2017-06-02 12:49:38');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('345', 'game003', 'sa1', '8400779.00', '8300779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:30:55', '40', 'sa1', '2017-06-02 12:49:38');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('346', 'game003', 'sa1', '8300779.00', '8200779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:30:59', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('347', 'game003', 'sa1', '8200779.00', '8199779.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-28 22:30:59', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('348', 'game003', 'sa1', '8199779.00', '8099779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:31:02', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('349', 'game003', 'sa1', '8099779.00', '8098779.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-28 22:31:03', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('350', 'game003', 'sa1', '8098779.00', '7998779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:31:05', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('351', 'game003', 'sa1', '7998779.00', '7898779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:31:07', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('352', 'game003', 'sa1', '7898779.00', '7798779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:31:10', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('353', 'game003', 'sa1', '7798779.00', '7797779.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-28 22:31:11', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('354', 'game003', 'sa1', '7797779.00', '7796779.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-28 22:31:12', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('355', 'game003', 'sa1', '7796779.00', '7696779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:31:14', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('356', 'game003', 'sa1', '7696779.00', '7695779.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-28 22:31:15', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('357', 'game003', 'sa1', '7695779.00', '7595779.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:31:17', '40', 'sa1', '2017-06-02 12:49:39');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('358', 'game003', 'yuchangmei12', '8997575.00', '8897575.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:49:40', '35', '罗素佩兴斯', '2017-06-02 12:49:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('359', 'game003', 'yuchangmei12', '8897575.00', '8797575.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:49:42', '35', '罗素佩兴斯', '2017-06-02 12:49:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('360', 'game003', 'yuchangmei12', '8797575.00', '8697575.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:50:03', '35', '罗素佩兴斯', '2017-06-02 12:49:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('361', 'game003', 'yuchangmei12', '8697575.00', '8597575.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:50:06', '35', '罗素佩兴斯', '2017-06-02 12:49:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('362', 'game003', '12', '7763610.00', '7663610.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:50:42', '3', '福勒菲尔丁', '2017-06-02 12:49:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('363', 'game003', '12', '7663610.00', '7563610.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:50:44', '3', '福勒菲尔丁', '2017-06-02 12:49:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('364', 'game003', '12', '7563610.00', '7463610.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:50:49', '3', '福勒菲尔丁', '2017-06-02 12:49:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('365', 'game003', 'yuchangmei12', '8997575.00', '8996575.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-28 22:55:11', '35', '罗素佩兴斯', '2017-06-02 12:49:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('366', 'game003', 'sa1', '7595779.00', '7594779.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-28 22:55:46', '40', 'sa1', '2017-06-02 12:49:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('367', 'game003', '12', '7763610.00', '7663610.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-28 22:56:59', '3', '福勒菲尔丁', '2017-06-02 12:49:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('368', 'game003', 'sa1234567', '100000000.00', '99999958.00', '-42.00', '0', '42', '6', '背包解锁', '2014-08-29 00:49:40', '1', '迪福拉瑟福德', '2017-06-02 12:49:46');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('369', 'game003', 'sa1234567', '99999958.00', '99998668.00', '-1290.00', '0', '42', '30', '背包解锁', '2014-08-29 00:49:42', '1', '迪福拉瑟福德', '2017-06-02 12:49:46');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('370', 'game003', 'sa1234567', '99998668.00', '99995578.00', '-3090.00', '0', '42', '30', '背包解锁', '2014-08-29 00:49:45', '1', '迪福拉瑟福德', '2017-06-02 12:49:46');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('371', 'game003', 'sa1234567', '99995578.00', '99990688.00', '-4890.00', '0', '42', '30', '背包解锁', '2014-08-29 00:49:47', '1', '迪福拉瑟福德', '2017-06-02 12:49:46');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('372', 'game003', 'sa1234567', '99990688.00', '99890688.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 00:51:09', '1', '迪福拉瑟福德', '2017-06-02 12:49:46');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('373', 'game003', 'sa1234567', '99890688.00', '99790688.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 00:51:12', '1', '迪福拉瑟福德', '2017-06-02 12:49:46');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('374', 'game003', '1', '1000000000.00', '999900000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:09:24', '1', '凯雷朗费罗', '2017-06-02 12:49:47');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('375', 'game003', '1', '100000000.00', '99999000.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-29 12:14:25', '2', '休詹理斯', '2017-06-02 12:49:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('376', 'game003', '1', '99999000.00', '99899000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:14:34', '2', '休詹理斯', '2017-06-02 12:49:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('377', 'game003', '2', '10000000.00', '9900000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:15:58', '1', '哈该哈伯德', '2017-06-02 12:49:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('378', 'game003', '3', '1000000000.00', '999995000.00', '-5000.00', '5061', '51', '5', '商店中购买物品道具', '2014-08-29 12:17:47', '1', '乔丹白壁德', '2017-06-02 12:49:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('379', 'game003', '3', '999995000.00', '999895000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:17:55', '1', '乔丹白壁德', '2017-06-02 12:49:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('380', 'game003', '4', '1000000000.00', '999900000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:21:24', '1', '鲍勃托因比', '2017-06-02 12:49:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('381', 'game003', '4', '999900000.00', '999800000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:21:26', '1', '鲍勃托因比', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('382', 'game003', '3', '999895000.00', '999894000.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-29 12:21:54', '1', '乔丹白壁德', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('383', 'game003', '5', '100000000.00', '99900000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:23:04', '1', '卡特霍尔特', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('384', 'game003', '5', '99900000.00', '99800000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:23:07', '1', '卡特霍尔特', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('385', 'game003', '6', '100000000.00', '99900000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:24:30', '1', '哈尔希克斯', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('386', 'game003', '6', '99900000.00', '99800000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:24:32', '1', '哈尔希克斯', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('387', 'game003', '6', '99800000.00', '99799000.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-29 12:24:34', '1', '哈尔希克斯', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('388', 'game003', '7', '10000000.00', '9900000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:25:23', '1', '卡尔威克利夫', '2017-06-02 12:49:51');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('389', 'game003', '8', '100000000.00', '99900000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:26:19', '1', '哈该利奥波德', '2017-06-02 12:49:52');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('390', 'game003', '8', '99900000.00', '99899000.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-29 12:26:22', '1', '哈该利奥波德', '2017-06-02 12:49:52');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('391', 'game003', '9', '100000000.00', '99999000.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-29 12:27:15', '1', '杰米鲍德温', '2017-06-02 12:49:52');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('392', 'game003', '9', '99999000.00', '99998000.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-29 12:27:16', '1', '杰米鲍德温', '2017-06-02 12:49:52');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('393', 'game003', '9', '99998000.00', '99988000.00', '-10000.00', '5061', '51', '10', '商店中购买物品道具', '2014-08-29 12:27:21', '1', '杰米鲍德温', '2017-06-02 12:49:53');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('394', 'game003', '9', '99988000.00', '99888000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:27:33', '1', '杰米鲍德温', '2017-06-02 12:49:53');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('395', 'game003', '10', '10000000.00', '9900000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:28:18', '1', '罗斯克洛宁', '2017-06-02 12:49:53');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('396', 'game003', '10', '9900000.00', '9880000.00', '-20000.00', '5061', '51', '20', '商店中购买物品道具', '2014-08-29 12:28:22', '1', '罗斯克洛宁', '2017-06-02 12:49:53');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('397', 'game003', '2', '9900000.00', '9899000.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-29 12:29:40', '1', '哈该哈伯德', '2017-06-02 12:49:53');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('398', 'game003', '7', '9900000.00', '9899000.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-29 12:31:15', '1', '卡尔威克利夫', '2017-06-02 12:49:53');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('399', 'game003', '7', '9899000.00', '9799000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:31:28', '1', '卡尔威克利夫', '2017-06-02 12:49:53');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('400', 'game003', '2', '9899000.00', '9898000.00', '-1000.00', '5061', '51', '1', '商店中购买物品道具', '2014-08-29 12:35:36', '1', '哈该哈伯德', '2017-06-02 12:49:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('401', 'game003', '0', '10000000.00', '9900000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:38:34', '1', '霍普鲁道夫', '2017-06-02 12:49:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('402', 'game003', '0', '9900000.00', '9800000.00', '-100000.00', '5061', '51', '100', '商店中购买物品道具', '2014-08-29 12:38:36', '1', '霍普鲁道夫', '2017-06-02 12:49:57');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('403', 'game003', '2035942', '387.00', '377.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:06:24', '48', '李慢慢', '2017-06-02 12:50:07');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('404', 'game003', '2035942', '377.00', '367.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:06:25', '48', '李慢慢', '2017-06-02 12:50:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('405', 'game003', '2035942', '367.00', '357.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:06:25', '48', '李慢慢', '2017-06-02 12:50:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('406', 'game003', '2035942', '357.00', '347.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:06:25', '48', '李慢慢', '2017-06-02 12:50:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('407', 'game003', '2035942', '347.00', '337.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:06:26', '48', '李慢慢', '2017-06-02 12:50:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('408', 'game003', '2035942', '337.00', '327.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:06:26', '48', '李慢慢', '2017-06-02 12:50:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('409', 'game003', '2035942', '327.00', '317.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:06:26', '48', '李慢慢', '2017-06-02 12:50:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('410', 'game003', '2035942', '317.00', '307.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:06:26', '48', '李慢慢', '2017-06-02 12:50:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('411', 'game003', '2035942', '307.00', '297.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:06:26', '48', '李慢慢', '2017-06-02 12:50:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('412', 'game003', '2035942', '297.00', '287.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:06:27', '48', '李慢慢', '2017-06-02 12:50:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('413', 'game003', '2035942', '287.00', '245.00', '-42.00', '0', '42', '6', 'Mở khóa túi', '2014-09-04 18:07:58', '48', '李慢慢', '2017-06-02 12:50:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('414', 'game003', '2033648', '1918.00', '1908.00', '-10.00', '0', '34', '1', 'Vàng làm mới tàng bảo đồ tầm bảo', '2014-09-04 18:35:15', '35', '科菲莫特利', '2017-06-02 12:50:11');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('415', 'game003', '1', '1000.00', '872.00', '-128.00', '18025', '51', '1', '商店中购买物品道具', '2014-09-10 17:19:09', '65', '嘛的', '2017-06-02 12:50:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('416', 'game003', '1', '872.00', '744.00', '-128.00', '18021', '51', '1', '商店中购买物品道具', '2014-09-10 17:21:19', '65', '嘛的', '2017-06-02 12:50:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('417', 'game003', '1', '744.00', '616.00', '-128.00', '18020', '51', '1', '商店中购买物品道具', '2014-09-10 17:21:22', '65', '嘛的', '2017-06-02 12:50:12');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('418', 'game003', '1', '100000.00', '99958.00', '-42.00', '0', '42', '6', '背包解锁', '2014-09-16 10:17:11', '45', '在要', '2017-06-02 12:50:20');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('419', 'game003', '1', '99958.00', '98668.00', '-1290.00', '0', '42', '30', '背包解锁', '2014-09-16 10:17:13', '45', '在要', '2017-06-02 12:50:20');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('420', 'game003', '1', '98668.00', '95578.00', '-3090.00', '0', '42', '30', '背包解锁', '2014-09-16 10:20:21', '45', '在要', '2017-06-02 12:50:22');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('421', 'game003', '1', '95578.00', '95278.00', '-300.00', '0', '72', '1', '月卡', '2014-09-16 10:22:08', '45', '在要', '2017-06-02 12:50:22');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('422', 'game003', '459742', '2276.00', '2266.00', '-10.00', '0', '34', '1', '金币刷新寻宝藏宝图', '2014-09-19 11:56:36', '58', '媽媽咪呀', '2017-06-02 12:50:29');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('423', 'game003', '459742', '2266.00', '2256.00', '-10.00', '0', '34', '1', '金币刷新寻宝藏宝图', '2014-09-19 11:56:37', '58', '媽媽咪呀', '2017-06-02 12:50:29');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('424', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '999999.00', '998001.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:49:59', '1', '特里艾迪生', '2017-06-02 12:50:40');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('425', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '998001.00', '996003.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:50:07', '1', '特里艾迪生', '2017-06-02 12:50:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('426', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '996003.00', '994005.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:51:52', '1', '特里艾迪生', '2017-06-02 12:50:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('427', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '994005.00', '992007.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:53:20', '1', '特里艾迪生', '2017-06-02 12:50:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('428', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '992007.00', '990009.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:53:20', '1', '特里艾迪生', '2017-06-02 12:50:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('429', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '990009.00', '988011.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:53:23', '1', '特里艾迪生', '2017-06-02 12:50:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('430', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '988011.00', '986013.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:53:23', '1', '特里艾迪生', '2017-06-02 12:50:41');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('431', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '986013.00', '984015.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:53:23', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('432', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '984015.00', '982017.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:53:24', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('433', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '982017.00', '980019.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:53:24', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('434', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '980019.00', '978021.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:53:36', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('435', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '978021.00', '976023.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:54:56', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('436', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '976023.00', '974025.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:55:04', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('437', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '974025.00', '972027.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:55:19', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('438', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '972027.00', '970029.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:55:30', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('439', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '970029.00', '968031.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:55:50', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('440', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '968031.00', '966033.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:56:18', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('441', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '966033.00', '964035.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:56:21', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('442', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '964035.00', '962037.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:56:23', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('443', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '962037.00', '960039.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:56:24', '1', '特里艾迪生', '2017-06-02 12:50:43');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('444', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '960039.00', '958041.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:56:25', '1', '特里艾迪生', '2017-06-02 12:50:43');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('445', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '958041.00', '956043.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:56:25', '1', '特里艾迪生', '2017-06-02 12:50:43');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('446', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '956043.00', '954045.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:57:40', '1', '特里艾迪生', '2017-06-02 12:50:44');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('447', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '956043.00', '954045.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:58:53', '1', '特里艾迪生', '2017-06-02 12:50:44');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('448', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '954045.00', '952047.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 15:59:47', '1', '特里艾迪生', '2017-06-02 12:50:44');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('449', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '952047.00', '950049.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 16:00:40', '1', '特里艾迪生', '2017-06-02 12:50:44');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('450', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '956043.00', '954045.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 16:03:48', '1', '特里艾迪生', '2017-06-02 12:50:44');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('451', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '954045.00', '952047.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 16:04:33', '1', '特里艾迪生', '2017-06-02 12:50:44');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('452', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '956043.00', '954045.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 16:06:41', '1', '特里艾迪生', '2017-06-02 12:50:45');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('453', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '954045.00', '952047.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 16:08:14', '1', '特里艾迪生', '2017-06-02 12:50:45');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('454', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '952047.00', '950049.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 16:08:29', '1', '特里艾迪生', '2017-06-02 12:50:46');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('455', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '950049.00', '948051.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 16:08:30', '1', '特里艾迪生', '2017-06-02 12:50:46');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('456', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '948051.00', '946053.00', '-1998.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:32', '1', '特里艾迪生', '2017-06-02 12:50:47');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('457', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '946053.00', '944355.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:34', '1', '特里艾迪生', '2017-06-02 12:50:47');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('458', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '944355.00', '942657.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:36', '1', '特里艾迪生', '2017-06-02 12:50:47');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('459', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '942657.00', '940959.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:36', '1', '特里艾迪生', '2017-06-02 12:50:47');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('460', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '940959.00', '939261.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:36', '1', '特里艾迪生', '2017-06-02 12:50:47');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('461', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '939261.00', '937563.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:37', '1', '特里艾迪生', '2017-06-02 12:50:47');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('462', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '937563.00', '935865.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:37', '1', '特里艾迪生', '2017-06-02 12:50:47');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('463', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '935865.00', '934167.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:37', '1', '特里艾迪生', '2017-06-02 12:50:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('464', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '934167.00', '932569.00', '-1598.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:37', '1', '特里艾迪生', '2017-06-02 12:50:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('465', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '932569.00', '930971.00', '-1598.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:37', '1', '特里艾迪生', '2017-06-02 12:50:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('466', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '930971.00', '929373.00', '-1598.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:38', '1', '特里艾迪生', '2017-06-02 12:50:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('467', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '929373.00', '927775.00', '-1598.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:38', '1', '特里艾迪生', '2017-06-02 12:50:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('468', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '927775.00', '926177.00', '-1598.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:38', '1', '特里艾迪生', '2017-06-02 12:50:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('469', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '926177.00', '924579.00', '-1598.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:38', '1', '特里艾迪生', '2017-06-02 12:50:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('470', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '924579.00', '922981.00', '-1598.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:38', '1', '特里艾迪生', '2017-06-02 12:50:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('471', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '922981.00', '921383.00', '-1598.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:39', '1', '特里艾迪生', '2017-06-02 12:50:48');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('472', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '921383.00', '919785.00', '-1598.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:39', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('473', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '919785.00', '918386.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:39', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('474', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '918386.00', '916987.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:39', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('475', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '916987.00', '915588.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:40', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('476', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '915588.00', '914189.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:40', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('477', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '914189.00', '912790.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:40', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('478', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '912790.00', '911391.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:40', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('479', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '911391.00', '909992.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:40', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('480', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '909992.00', '908593.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:41', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('481', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '908593.00', '907194.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:41', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('482', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '907194.00', '905795.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:41', '1', '特里艾迪生', '2017-06-02 12:50:49');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('483', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '905795.00', '904396.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:41', '1', '特里艾迪生', '2017-06-02 12:50:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('484', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '904396.00', '902997.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:41', '1', '特里艾迪生', '2017-06-02 12:50:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('485', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '902997.00', '901598.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:42', '1', '特里艾迪生', '2017-06-02 12:50:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('486', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '901598.00', '900199.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:42', '1', '特里艾迪生', '2017-06-02 12:50:50');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('487', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '900199.00', '898800.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:42', '1', '特里艾迪生', '2017-06-02 12:50:51');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('488', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '898800.00', '897401.00', '-1399.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:42', '1', '特里艾迪生', '2017-06-02 12:50:51');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('489', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '897401.00', '896202.00', '-1199.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:42', '1', '特里艾迪生', '2017-06-02 12:50:51');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('490', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '896202.00', '895003.00', '-1199.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:42', '1', '特里艾迪生', '2017-06-02 12:50:51');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('491', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '895003.00', '893804.00', '-1199.00', '0', '76', '1', '全民团购', '2014-09-19 16:11:42', '1', '特里艾迪生', '2017-06-02 12:50:51');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('492', 'game003', '145F6553D8D8EBF6130EDC73B4017B5A', '893804.00', '893784.00', '-20.00', '0', '75', '1', '购买节日活动特殊物品', '2014-09-19 16:46:53', '1', '特里艾迪生', '2017-06-02 12:50:54');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('493', '1', '2039427', '1000000.00', '998202.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 09:35:47', '1', '兰登亚当斯', '2017-06-02 12:51:07');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('494', '1', '2', '10000000.00', '9998202.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 09:48:41', '1', '2', '2017-06-02 12:51:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('495', '1', '3', '1000000000.00', '999998202.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 09:49:41', '1', '3', '2017-06-02 12:51:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('496', '1', '4', '10000000.00', '9998202.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 09:50:20', '1', '5', '2017-06-02 12:51:08');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('497', '1', '5', '100000.00', '98202.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 09:51:04', '1', '4', '2017-06-02 12:52:22');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('498', '1', '6', '1000000.00', '998302.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-26 09:54:23', '1', '6', '2017-06-02 12:52:22');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('499', '1', '1', '10000000.00', '9998202.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 10:16:35', '3', '1', '2017-06-02 12:52:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('500', '1', '2', '9998202.00', '9996404.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 10:16:59', '1', '2', '2017-06-02 12:52:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('501', '1', '3', '999998202.00', '999996404.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 10:17:08', '1', '3', '2017-06-02 12:52:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('502', '1', '4', '9998202.00', '9996404.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 10:17:18', '1', '5', '2017-06-02 12:52:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('503', '1', '5', '1798.00', '100.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-26 10:18:04', '1', '4', '2017-06-02 12:52:24');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('504', '1', '6', '1000000.00', '998302.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-26 10:19:21', '1', '6', '2017-06-02 12:52:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('505', '1', '6', '1800.00', '2.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 10:34:19', '1', '6', '2017-06-02 12:52:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('506', '1', '5', '1800.00', '2.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 10:34:52', '1', '4', '2017-06-02 12:52:25');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('507', '1', '4', '1800.00', '2.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 10:35:32', '1', '5', '2017-06-02 12:52:27');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('508', '1', '3', '1800.00', '2.00', '-1798.00', '0', '76', '1', '全民团购', '2014-09-26 10:36:04', '1', '3', '2017-06-02 12:52:27');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('509', '1', '2', '1800.00', '102.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-26 10:36:35', '1', '2', '2017-06-02 12:52:27');
INSERT INTO `op_oss_qlz_consume_log` VALUES ('510', '1', '1', '1800.00', '102.00', '-1698.00', '0', '76', '1', '全民团购', '2014-09-26 10:37:10', '3', '1', '2017-06-02 12:52:28');

-- ----------------------------
-- Table structure for op_oss_qlz_createrole_log
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_createrole_log`;
CREATE TABLE `op_oss_qlz_createrole_log` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `worldid` varchar(20) DEFAULT NULL,
  `userip` varchar(20) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `rolename` varchar(50) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 COMMENT='角色创建上报。。';

-- ----------------------------
-- Records of op_oss_qlz_createrole_log
-- ----------------------------
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('1', 'game003', '192.168.1.50', '2014-08-21 17:45:36', 'test', '佩恩塔特爾', '2017-06-02 12:47:54');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('2', 'game003', '192.168.1.50', '2014-08-21 17:59:32', 'Soul', '朗伯斯梅德利', '2017-06-02 12:47:57');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('3', 'game003', '192.168.1.169', '2014-08-21 18:03:57', '145F6553D8D8EBF6130EDC73B4017B5A', '亚当福克斯', '2017-06-02 12:47:59');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('4', 'game003', '192.168.9.238', '2014-08-22 09:42:26', 'test10', '福特邓洛普', '2017-06-02 12:48:02');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('5', 'game003', '192.168.1.169', '2014-08-22 10:11:28', 'sad', 'sad', '2017-06-02 12:48:07');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('6', 'game003', '192.168.1.241', '2014-08-22 11:09:40', 'Soul2222121', '杜邦森次巴立', '2017-06-02 12:48:09');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('7', 'game003', '192.168.1.241', '2014-08-22 11:16:18', 'Soul222c11', '梅格魏克利夫', '2017-06-02 12:48:10');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('8', 'game003', '192.168.1.241', '2014-08-22 11:20:41', 'Soul222c1111', '鲍尔马歇尔', '2017-06-02 12:48:11');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('9', 'game003', '192.168.1.118', '2014-08-22 11:25:09', '12', '迈卡斯梯尔', '2017-06-02 12:48:11');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('10', 'game003', '192.168.1.118', '2014-08-22 11:51:03', '129', '萨利道格拉斯', '2017-06-02 12:48:13');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('11', 'game003', '192.168.1.118', '2014-08-22 12:26:20', '1290', '瓦特普赖斯', '2017-06-02 12:48:13');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('12', 'game003', '192.168.1.241', '2014-08-22 12:56:49', 'Soul222c1111', '伦敦斯图尔特', '2017-06-02 12:48:14');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('13', 'game003', '192.168.1.241', '2014-08-22 12:59:12', 'Soul', '哈该贾尔斯', '2017-06-02 12:48:15');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('14', 'game003', '192.168.1.169', '2014-08-22 13:38:47', 'sad', '格斯蒙哥马利', '2017-06-02 12:48:15');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('15', 'game003', '192.168.1.241', '2014-08-22 13:51:31', 'test', '沃克瓦格纳', '2017-06-02 12:48:18');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('16', 'game003', '192.168.9.238', '2014-08-22 15:53:58', 'test11', '乔尔贝西墨', '2017-06-02 12:48:45');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('17', 'game003', '192.168.1.118', '2014-08-25 09:37:13', '1290', 'ssw', '2017-06-02 12:48:54');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('18', 'game003', '192.168.1.118', '2014-08-25 10:13:05', '1290', 'sew', '2017-06-02 12:48:54');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('19', 'game003', '192.168.1.128', '2014-08-25 13:38:11', 'sad', '汤姆劳埃德', '2017-06-02 12:49:04');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('20', 'game003', '127.0.0.1', '2014-08-25 14:38:20', 'test', '波普麦金托什', '2017-06-02 12:49:29');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('21', 'game003', '192.168.1.118', '2014-08-25 14:56:00', '12900', '拉金罗伯逊', '2017-06-02 12:49:32');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('22', 'game003', '192.168.1.118', '2014-08-26 09:44:27', '1290', 'fff', '2017-06-02 12:49:33');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('23', 'game003', '192.168.1.118', '2014-08-29 00:42:28', 'sa123456', '佩特巴特勒', '2017-06-02 12:49:44');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('24', 'game003', '192.168.1.118', '2014-08-29 00:49:18', 'sa1234567', '迪福拉瑟福德', '2017-06-02 12:49:45');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('25', 'game003', '192.168.1.118', '2014-08-29 12:08:26', '1', '凯雷朗费罗', '2017-06-02 12:49:46');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('26', 'game003', '192.168.1.118', '2014-08-29 12:13:37', '1', '休詹理斯', '2017-06-02 12:49:48');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('27', 'game003', '192.168.1.118', '2014-08-29 12:15:31', '2', '哈该哈伯德', '2017-06-02 12:49:48');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('28', 'game003', '192.168.1.118', '2014-08-29 12:17:13', '3', '乔丹白壁德', '2017-06-02 12:49:49');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('29', 'game003', '192.168.1.118', '2014-08-29 12:20:42', '4', '鲍勃托因比', '2017-06-02 12:49:49');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('30', 'game003', '192.168.1.118', '2014-08-29 12:22:34', '5', '卡特霍尔特', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('31', 'game003', '192.168.1.118', '2014-08-29 12:24:05', '6', '哈尔希克斯', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('32', 'game003', '192.168.1.118', '2014-08-29 12:24:58', '7', '卡尔威克利夫', '2017-06-02 12:49:51');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('33', 'game003', '192.168.1.118', '2014-08-29 12:25:49', '8', '哈该利奥波德', '2017-06-02 12:49:51');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('34', 'game003', '192.168.1.118', '2014-08-29 12:26:50', '9', '杰米鲍德温', '2017-06-02 12:49:52');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('35', 'game003', '192.168.1.118', '2014-08-29 12:27:55', '10', '罗斯克洛宁', '2017-06-02 12:49:53');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('36', 'game003', '192.168.1.118', '2014-08-29 12:38:10', '0', '霍普鲁道夫', '2017-06-02 12:49:57');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('37', 'game003', '192.168.1.128', '2014-08-30 15:43:04', 'EA29906FEE97799837A8F0C63035F62E', '斯诺森次巴立', '2017-06-02 12:49:58');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('38', 'game003', '192.168.1.128', '2014-08-30 15:48:22', 'sad', '埃文哈罗德', '2017-06-02 12:49:59');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('39', 'game003', '192.168.1.241', '2014-08-30 16:04:55', 'sa', '巴尼比勒尔', '2017-06-02 12:49:59');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('40', 'game003', '192.168.1.128', '2014-08-30 16:16:23', '234', '摩利安東尼', '2017-06-02 12:49:59');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('41', 'game003', '192.168.1.118', '2014-09-04 11:52:13', '4455', '劳里普里策', '2017-06-02 12:50:06');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('42', 'game003', '192.168.1.241', '2014-09-04 18:29:02', 'test', '鄧巴赫士列特', '2017-06-02 12:50:09');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('43', 'game003', '192.168.1.88', '2014-09-04 19:06:57', '43', '贾德鲍德温', '2017-06-02 12:50:11');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('44', 'game003', '192.168.1.118', '2014-09-10 17:14:01', '1', '嘛的', '2017-06-02 12:50:12');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('45', 'game003', '192.168.1.118', '2014-09-11 17:57:55', '4545645', '斯托克罗夫特', '2017-06-02 12:50:15');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('46', 'game003', '192.168.1.118', '2014-09-11 17:58:19', '14', '芬恩布赖斯', '2017-06-02 12:50:15');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('47', 'game003', '192.168.1.118', '2014-09-16 10:10:53', '1', '在要', '2017-06-02 12:50:19');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('48', 'game003', '192.168.1.118', '2014-09-16 10:12:28', '2', '尤尔富兰克林', '2017-06-02 12:50:20');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('49', 'game003', '192.168.1.118', '2014-09-17 16:55:23', '11', '休爱迪生', '2017-06-02 12:50:26');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('50', 'game003', '192.168.1.128', '2014-09-19 14:45:03', '145F6553D8D8EBF6130EDC73B4017B5A', '特里艾迪生', '2017-06-02 12:50:30');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('51', 'game003', '192.168.1.118', '2014-09-22 13:53:13', '11', '贝克法兰西斯', '2017-06-02 12:51:01');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('52', 'game003', '192.168.1.128', '2014-09-22 17:38:26', 'sad', '鲍勃李嘉图', '2017-06-02 12:51:05');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('53', '1', '192.168.1.118', '2014-09-26 09:35:10', '2039427', '兰登亚当斯', '2017-06-02 12:51:07');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('54', '1', '192.168.1.118', '2014-09-26 09:47:03', '1', '1', '2017-06-02 12:51:07');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('55', '1', '192.168.1.118', '2014-09-26 09:48:16', '2', '2', '2017-06-02 12:51:08');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('56', '1', '192.168.1.118', '2014-09-26 09:49:15', '3', '3', '2017-06-02 12:51:08');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('57', '1', '192.168.1.118', '2014-09-26 09:50:00', '4', '5', '2017-06-02 12:51:08');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('58', '1', '192.168.1.118', '2014-09-26 09:50:44', '5', '4', '2017-06-02 12:52:22');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('59', '1', '192.168.1.118', '2014-09-26 09:53:09', '6', '6', '2017-06-02 12:52:22');

-- ----------------------------
-- Table structure for op_oss_qlz_login_log
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_login_log`;
CREATE TABLE `op_oss_qlz_login_log` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `worldid` varchar(20) DEFAULT NULL,
  `userip` varchar(20) DEFAULT NULL,
  `logintime` varchar(20) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `rolename` varchar(50) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=352 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_qlz_login_log
-- ----------------------------
INSERT INTO `op_oss_qlz_login_log` VALUES ('1', 'game003', '192.168.1.50', '2014-08-21 17:56:28', 'test', '1', '佩恩塔特爾', '2017-06-02 12:47:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('2', 'game003', '192.168.1.50', '2014-08-21 17:57:35', 'test', '1', '佩恩塔特爾', '2017-06-02 12:47:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('3', 'game003', '192.168.1.50', '2014-08-21 17:58:59', 'test', '1', '佩恩塔特爾', '2017-06-02 12:47:57');
INSERT INTO `op_oss_qlz_login_log` VALUES ('4', 'game003', '192.168.1.50', '2014-08-21 17:59:39', 'Soul', '1', '朗伯斯梅德利', '2017-06-02 12:47:58');
INSERT INTO `op_oss_qlz_login_log` VALUES ('5', 'game003', '192.168.1.50', '2014-08-21 18:00:26', 'test', '1', '佩恩塔特爾', '2017-06-02 12:47:59');
INSERT INTO `op_oss_qlz_login_log` VALUES ('6', 'game003', '192.168.1.169', '2014-08-21 18:04:00', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '亚当福克斯', '2017-06-02 12:47:59');
INSERT INTO `op_oss_qlz_login_log` VALUES ('7', 'game003', '192.168.1.169', '2014-08-21 18:04:49', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '亚当福克斯', '2017-06-02 12:48:00');
INSERT INTO `op_oss_qlz_login_log` VALUES ('8', 'game003', '192.168.1.169', '2014-08-22 09:46:04', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '亚当福克斯', '2017-06-02 12:48:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('9', 'game003', '192.168.1.241', '2014-08-22 09:47:48', 'Soul', '1', '朗伯斯梅德利', '2017-06-02 12:48:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('10', 'game003', '192.168.1.169', '2014-08-22 09:48:05', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '亚当福克斯', '2017-06-02 12:48:03');
INSERT INTO `op_oss_qlz_login_log` VALUES ('11', 'game003', '192.168.1.169', '2014-08-22 09:59:25', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '亚当福克斯', '2017-06-02 12:48:05');
INSERT INTO `op_oss_qlz_login_log` VALUES ('12', 'game003', '192.168.1.241', '2014-08-22 10:03:09', 'Soul', '3', '朗伯斯梅德利', '2017-06-02 12:48:06');
INSERT INTO `op_oss_qlz_login_log` VALUES ('13', 'game003', '192.168.1.169', '2014-08-22 10:04:28', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '亚当福克斯', '2017-06-02 12:48:07');
INSERT INTO `op_oss_qlz_login_log` VALUES ('14', 'game003', '192.168.1.169', '2014-08-22 10:07:00', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '亚当福克斯', '2017-06-02 12:48:07');
INSERT INTO `op_oss_qlz_login_log` VALUES ('15', 'game003', '192.168.1.241', '2014-08-22 11:08:33', 'Soul', '3', '朗伯斯梅德利', '2017-06-02 12:48:08');
INSERT INTO `op_oss_qlz_login_log` VALUES ('16', 'game003', '192.168.1.241', '2014-08-22 11:09:18', 'Soul', '3', '朗伯斯梅德利', '2017-06-02 12:48:09');
INSERT INTO `op_oss_qlz_login_log` VALUES ('17', 'game003', '192.168.1.241', '2014-08-22 11:09:44', 'Soul2222121', '1', '杜邦森次巴立', '2017-06-02 12:48:10');
INSERT INTO `op_oss_qlz_login_log` VALUES ('18', 'game003', '192.168.1.241', '2014-08-22 11:10:11', 'Soul', '3', '朗伯斯梅德利', '2017-06-02 12:48:10');
INSERT INTO `op_oss_qlz_login_log` VALUES ('19', 'game003', '192.168.1.241', '2014-08-22 11:11:48', 'Soul', '3', '朗伯斯梅德利', '2017-06-02 12:48:10');
INSERT INTO `op_oss_qlz_login_log` VALUES ('20', 'game003', '192.168.1.118', '2014-08-22 11:25:16', '12', '1', '迈卡斯梯尔', '2017-06-02 12:48:11');
INSERT INTO `op_oss_qlz_login_log` VALUES ('21', 'game003', '192.168.1.118', '2014-08-22 11:26:10', '12', '1', '迈卡斯梯尔', '2017-06-02 12:48:11');
INSERT INTO `op_oss_qlz_login_log` VALUES ('22', 'game003', '192.168.1.118', '2014-08-22 11:31:45', '12', '1', '迈卡斯梯尔', '2017-06-02 12:48:11');
INSERT INTO `op_oss_qlz_login_log` VALUES ('23', 'game003', '192.168.1.118', '2014-08-22 11:51:08', '129', '1', '萨利道格拉斯', '2017-06-02 12:48:13');
INSERT INTO `op_oss_qlz_login_log` VALUES ('24', 'game003', '192.168.1.118', '2014-08-22 12:26:25', '1290', '1', '瓦特普赖斯', '2017-06-02 12:48:13');
INSERT INTO `op_oss_qlz_login_log` VALUES ('25', 'game003', '192.168.1.118', '2014-08-22 12:27:19', '1290', '1', '瓦特普赖斯', '2017-06-02 12:48:14');
INSERT INTO `op_oss_qlz_login_log` VALUES ('26', 'game003', '192.168.1.118', '2014-08-22 12:28:12', '1290', '1', '瓦特普赖斯', '2017-06-02 12:48:14');
INSERT INTO `op_oss_qlz_login_log` VALUES ('27', 'game003', '192.168.1.241', '2014-08-22 12:56:55', 'Soul222c1111', '1', '伦敦斯图尔特', '2017-06-02 12:48:14');
INSERT INTO `op_oss_qlz_login_log` VALUES ('28', 'game003', '192.168.1.241', '2014-08-22 12:59:18', 'Soul', '1', '哈该贾尔斯', '2017-06-02 12:48:15');
INSERT INTO `op_oss_qlz_login_log` VALUES ('29', 'game003', '192.168.1.169', '2014-08-22 13:38:51', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:15');
INSERT INTO `op_oss_qlz_login_log` VALUES ('30', 'game003', '192.168.1.169', '2014-08-22 13:39:22', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:15');
INSERT INTO `op_oss_qlz_login_log` VALUES ('31', 'game003', '192.168.1.169', '2014-08-22 13:40:32', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:16');
INSERT INTO `op_oss_qlz_login_log` VALUES ('32', 'game003', '192.168.1.169', '2014-08-22 13:42:04', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:17');
INSERT INTO `op_oss_qlz_login_log` VALUES ('33', 'game003', '192.168.1.169', '2014-08-22 13:43:05', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:17');
INSERT INTO `op_oss_qlz_login_log` VALUES ('34', 'game003', '192.168.1.169', '2014-08-22 13:43:30', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:17');
INSERT INTO `op_oss_qlz_login_log` VALUES ('35', 'game003', '192.168.1.169', '2014-08-22 13:43:47', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:17');
INSERT INTO `op_oss_qlz_login_log` VALUES ('36', 'game003', '192.168.1.241', '2014-08-22 13:51:36', 'test', '1', '沃克瓦格纳', '2017-06-02 12:48:19');
INSERT INTO `op_oss_qlz_login_log` VALUES ('37', 'game003', '192.168.1.241', '2014-08-22 13:55:12', 'Soul', '1', '哈该贾尔斯', '2017-06-02 12:48:19');
INSERT INTO `op_oss_qlz_login_log` VALUES ('38', 'game003', '192.168.1.241', '2014-08-22 13:55:33', 'test', '3', '沃克瓦格纳', '2017-06-02 12:48:19');
INSERT INTO `op_oss_qlz_login_log` VALUES ('39', 'game003', '192.168.1.169', '2014-08-22 14:04:44', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:19');
INSERT INTO `op_oss_qlz_login_log` VALUES ('40', 'game003', '192.168.1.169', '2014-08-22 14:06:17', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:20');
INSERT INTO `op_oss_qlz_login_log` VALUES ('41', 'game003', '192.168.1.169', '2014-08-22 14:09:34', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:20');
INSERT INTO `op_oss_qlz_login_log` VALUES ('42', 'game003', '192.168.1.169', '2014-08-22 14:10:29', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:20');
INSERT INTO `op_oss_qlz_login_log` VALUES ('43', 'game003', '192.168.1.169', '2014-08-22 14:10:55', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:20');
INSERT INTO `op_oss_qlz_login_log` VALUES ('44', 'game003', '192.168.1.241', '2014-08-22 14:14:02', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:20');
INSERT INTO `op_oss_qlz_login_log` VALUES ('45', 'game003', '192.168.1.169', '2014-08-22 14:16:12', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:22');
INSERT INTO `op_oss_qlz_login_log` VALUES ('46', 'game003', '192.168.1.169', '2014-08-22 14:17:20', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:23');
INSERT INTO `op_oss_qlz_login_log` VALUES ('47', 'game003', '192.168.1.241', '2014-08-22 14:21:36', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:23');
INSERT INTO `op_oss_qlz_login_log` VALUES ('48', 'game003', '192.168.1.169', '2014-08-22 14:22:27', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:23');
INSERT INTO `op_oss_qlz_login_log` VALUES ('49', 'game003', '192.168.1.241', '2014-08-22 14:30:49', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:23');
INSERT INTO `op_oss_qlz_login_log` VALUES ('50', 'game003', '192.168.1.169', '2014-08-22 14:30:53', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:24');
INSERT INTO `op_oss_qlz_login_log` VALUES ('51', 'game003', '192.168.1.169', '2014-08-22 14:32:39', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:30');
INSERT INTO `op_oss_qlz_login_log` VALUES ('52', 'game003', '192.168.1.241', '2014-08-22 14:47:47', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:34');
INSERT INTO `op_oss_qlz_login_log` VALUES ('53', 'game003', '192.168.1.169', '2014-08-22 14:47:50', 'sad', '1', '格斯蒙哥马利', '2017-06-02 12:48:34');
INSERT INTO `op_oss_qlz_login_log` VALUES ('54', 'game003', '192.168.1.169', '2014-08-22 14:50:19', 'sad', '65', '格斯蒙哥马利', '2017-06-02 12:48:34');
INSERT INTO `op_oss_qlz_login_log` VALUES ('55', 'game003', '192.168.1.241', '2014-08-22 14:50:25', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:34');
INSERT INTO `op_oss_qlz_login_log` VALUES ('56', 'game003', '192.168.1.169', '2014-08-22 14:53:52', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:34');
INSERT INTO `op_oss_qlz_login_log` VALUES ('57', 'game003', '192.168.1.169', '2014-08-22 14:55:38', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('58', 'game003', '192.168.1.169', '2014-08-22 14:56:29', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('59', 'game003', '192.168.1.241', '2014-08-22 14:58:16', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('60', 'game003', '192.168.1.169', '2014-08-22 15:01:13', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:37');
INSERT INTO `op_oss_qlz_login_log` VALUES ('61', 'game003', '192.168.1.169', '2014-08-22 15:02:32', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:37');
INSERT INTO `op_oss_qlz_login_log` VALUES ('62', 'game003', '192.168.1.241', '2014-08-22 15:03:04', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:37');
INSERT INTO `op_oss_qlz_login_log` VALUES ('63', 'game003', '192.168.1.169', '2014-08-22 15:03:46', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:37');
INSERT INTO `op_oss_qlz_login_log` VALUES ('64', 'game003', '192.168.1.241', '2014-08-22 15:06:29', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:41');
INSERT INTO `op_oss_qlz_login_log` VALUES ('65', 'game003', '192.168.1.169', '2014-08-22 15:09:22', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:42');
INSERT INTO `op_oss_qlz_login_log` VALUES ('66', 'game003', '192.168.1.241', '2014-08-22 15:18:13', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:42');
INSERT INTO `op_oss_qlz_login_log` VALUES ('67', 'game003', '192.168.1.241', '2014-08-22 15:27:57', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:43');
INSERT INTO `op_oss_qlz_login_log` VALUES ('68', 'game003', '192.168.1.169', '2014-08-22 15:43:48', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:44');
INSERT INTO `op_oss_qlz_login_log` VALUES ('69', 'game003', '192.168.1.169', '2014-08-22 15:46:11', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:44');
INSERT INTO `op_oss_qlz_login_log` VALUES ('70', 'game003', '192.168.9.238', '2014-08-22 15:54:01', 'test11', '1', '乔尔贝西墨', '2017-06-02 12:48:45');
INSERT INTO `op_oss_qlz_login_log` VALUES ('71', 'game003', '192.168.1.241', '2014-08-22 16:05:30', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:45');
INSERT INTO `op_oss_qlz_login_log` VALUES ('72', 'game003', '192.168.1.241', '2014-08-22 16:11:49', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:45');
INSERT INTO `op_oss_qlz_login_log` VALUES ('73', 'game003', '192.168.1.241', '2014-08-22 16:12:25', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:46');
INSERT INTO `op_oss_qlz_login_log` VALUES ('74', 'game003', '192.168.1.241', '2014-08-22 16:48:15', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:46');
INSERT INTO `op_oss_qlz_login_log` VALUES ('75', 'game003', '192.168.1.241', '2014-08-22 16:52:41', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:48');
INSERT INTO `op_oss_qlz_login_log` VALUES ('76', 'game003', '192.168.1.241', '2014-08-22 16:53:06', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:48');
INSERT INTO `op_oss_qlz_login_log` VALUES ('77', 'game003', '192.168.1.241', '2014-08-22 16:54:01', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:48');
INSERT INTO `op_oss_qlz_login_log` VALUES ('78', 'game003', '192.168.1.241', '2014-08-22 16:54:50', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:49');
INSERT INTO `op_oss_qlz_login_log` VALUES ('79', 'game003', '192.168.1.241', '2014-08-22 16:56:16', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:49');
INSERT INTO `op_oss_qlz_login_log` VALUES ('80', 'game003', '192.168.1.241', '2014-08-22 16:59:04', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:49');
INSERT INTO `op_oss_qlz_login_log` VALUES ('81', 'game003', '192.168.1.241', '2014-08-22 17:00:04', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:50');
INSERT INTO `op_oss_qlz_login_log` VALUES ('82', 'game003', '192.168.1.241', '2014-08-22 17:01:46', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:50');
INSERT INTO `op_oss_qlz_login_log` VALUES ('83', 'game003', '192.168.1.241', '2014-08-22 17:03:37', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:51');
INSERT INTO `op_oss_qlz_login_log` VALUES ('84', 'game003', '192.168.1.241', '2014-08-22 17:06:15', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:51');
INSERT INTO `op_oss_qlz_login_log` VALUES ('85', 'game003', '192.168.1.241', '2014-08-22 17:07:54', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:51');
INSERT INTO `op_oss_qlz_login_log` VALUES ('86', 'game003', '192.168.1.169', '2014-08-22 17:13:17', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:51');
INSERT INTO `op_oss_qlz_login_log` VALUES ('87', 'game003', '192.168.1.169', '2014-08-22 17:17:33', 'sad', '70', '格斯蒙哥马利', '2017-06-02 12:48:52');
INSERT INTO `op_oss_qlz_login_log` VALUES ('88', 'game003', '192.168.1.241', '2014-08-22 17:18:05', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:52');
INSERT INTO `op_oss_qlz_login_log` VALUES ('89', 'game003', '192.168.1.241', '2014-08-22 17:27:29', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:52');
INSERT INTO `op_oss_qlz_login_log` VALUES ('90', 'game003', '192.168.1.241', '2014-08-22 17:32:25', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:53');
INSERT INTO `op_oss_qlz_login_log` VALUES ('91', 'game003', '192.168.1.241', '2014-08-22 17:33:04', 'test', '45', '沃克瓦格纳', '2017-06-02 12:48:54');
INSERT INTO `op_oss_qlz_login_log` VALUES ('92', 'game003', '192.168.1.118', '2014-08-25 09:37:18', '1290', '1', 'ssw', '2017-06-02 12:48:54');
INSERT INTO `op_oss_qlz_login_log` VALUES ('93', 'game003', '192.168.1.118', '2014-08-25 10:13:08', '1290', '1', 'sew', '2017-06-02 12:48:54');
INSERT INTO `op_oss_qlz_login_log` VALUES ('94', 'game003', '192.168.1.118', '2014-08-25 10:28:25', '1290', '70', 'sew', '2017-06-02 12:48:58');
INSERT INTO `op_oss_qlz_login_log` VALUES ('95', 'game003', '192.168.1.118', '2014-08-25 10:32:31', '1290', '70', 'sew', '2017-06-02 12:49:00');
INSERT INTO `op_oss_qlz_login_log` VALUES ('96', 'game003', '192.168.1.118', '2014-08-25 10:35:07', '1290', '70', 'sew', '2017-06-02 12:49:00');
INSERT INTO `op_oss_qlz_login_log` VALUES ('97', 'game003', '192.168.1.118', '2014-08-25 10:46:42', '1290', '70', 'sew', '2017-06-02 12:49:01');
INSERT INTO `op_oss_qlz_login_log` VALUES ('98', 'game003', '192.168.1.118', '2014-08-25 11:06:39', '1290', '70', 'sew', '2017-06-02 12:49:01');
INSERT INTO `op_oss_qlz_login_log` VALUES ('99', 'game003', '192.168.1.118', '2014-08-25 11:08:04', '1290', '70', 'sew', '2017-06-02 12:49:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('100', 'game003', '192.168.1.118', '2014-08-25 11:10:44', '1290', '70', 'sew', '2017-06-02 12:49:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('101', 'game003', '192.168.1.118', '2014-08-25 11:13:03', '1290', '70', 'sew', '2017-06-02 12:49:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('102', 'game003', '192.168.1.118', '2014-08-25 11:14:03', '1290', '70', 'sew', '2017-06-02 12:49:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('103', 'game003', '192.168.1.118', '2014-08-25 11:52:48', '1290', '70', 'sew', '2017-06-02 12:49:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('104', 'game003', '192.168.1.118', '2014-08-25 11:54:41', '1290', '70', 'sew', '2017-06-02 12:49:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('105', 'game003', '192.168.1.118', '2014-08-25 12:08:37', '1290', '70', 'sew', '2017-06-02 12:49:03');
INSERT INTO `op_oss_qlz_login_log` VALUES ('106', 'game003', '192.168.1.118', '2014-08-25 12:21:06', '1290', '70', 'sew', '2017-06-02 12:49:03');
INSERT INTO `op_oss_qlz_login_log` VALUES ('107', 'game003', '192.168.1.118', '2014-08-25 12:22:43', '1290', '70', 'sew', '2017-06-02 12:49:04');
INSERT INTO `op_oss_qlz_login_log` VALUES ('108', 'game003', '192.168.1.118', '2014-08-25 13:37:21', '1290', '70', 'sew', '2017-06-02 12:49:04');
INSERT INTO `op_oss_qlz_login_log` VALUES ('109', 'game003', '192.168.1.128', '2014-08-25 13:38:19', 'sad', '1', '汤姆劳埃德', '2017-06-02 12:49:04');
INSERT INTO `op_oss_qlz_login_log` VALUES ('110', 'game003', '192.168.1.128', '2014-08-25 13:38:39', 'sad', '1', '汤姆劳埃德', '2017-06-02 12:49:04');
INSERT INTO `op_oss_qlz_login_log` VALUES ('111', 'game003', '192.168.1.128', '2014-08-25 13:38:54', 'sad', '1', '汤姆劳埃德', '2017-06-02 12:49:05');
INSERT INTO `op_oss_qlz_login_log` VALUES ('112', 'game003', '192.168.1.128', '2014-08-25 13:40:11', 'sad', '1', '汤姆劳埃德', '2017-06-02 12:49:05');
INSERT INTO `op_oss_qlz_login_log` VALUES ('113', 'game003', '192.168.1.118', '2014-08-25 13:44:48', '1290', '70', 'sew', '2017-06-02 12:49:06');
INSERT INTO `op_oss_qlz_login_log` VALUES ('114', 'game003', '192.168.1.128', '2014-08-25 13:44:55', 'sad', '1', '汤姆劳埃德', '2017-06-02 12:49:06');
INSERT INTO `op_oss_qlz_login_log` VALUES ('115', 'game003', '192.168.1.128', '2014-08-25 13:45:09', 'sad', '1', '汤姆劳埃德', '2017-06-02 12:49:06');
INSERT INTO `op_oss_qlz_login_log` VALUES ('116', 'game003', '192.168.1.128', '2014-08-25 14:02:21', 'sad', '1', '汤姆劳埃德', '2017-06-02 12:49:16');
INSERT INTO `op_oss_qlz_login_log` VALUES ('117', 'game003', '192.168.1.128', '2014-08-25 14:03:43', 'sad', '1', '汤姆劳埃德', '2017-06-02 12:49:18');
INSERT INTO `op_oss_qlz_login_log` VALUES ('118', 'game003', '192.168.1.128', '2014-08-25 14:06:43', 'sad', '1', '汤姆劳埃德', '2017-06-02 12:49:23');
INSERT INTO `op_oss_qlz_login_log` VALUES ('119', 'game003', '192.168.1.118', '2014-08-25 14:16:52', '1290', '70', 'sew', '2017-06-02 12:49:25');
INSERT INTO `op_oss_qlz_login_log` VALUES ('120', 'game003', '192.168.1.118', '2014-08-25 14:26:02', '1290', '70', 'sew', '2017-06-02 12:49:26');
INSERT INTO `op_oss_qlz_login_log` VALUES ('121', 'game003', '192.168.1.118', '2014-08-25 14:28:26', '1290', '70', 'sew', '2017-06-02 12:49:26');
INSERT INTO `op_oss_qlz_login_log` VALUES ('122', 'game003', '192.168.1.118', '2014-08-25 14:30:18', '1290', '70', 'sew', '2017-06-02 12:49:27');
INSERT INTO `op_oss_qlz_login_log` VALUES ('123', 'game003', '192.168.1.118', '2014-08-25 14:31:45', '1290', '70', 'sew', '2017-06-02 12:49:28');
INSERT INTO `op_oss_qlz_login_log` VALUES ('124', 'game003', '192.168.1.118', '2014-08-25 14:32:25', '1290', '70', 'sew', '2017-06-02 12:49:28');
INSERT INTO `op_oss_qlz_login_log` VALUES ('125', 'game003', '192.168.1.118', '2014-08-25 14:33:15', '1290', '70', 'sew', '2017-06-02 12:49:28');
INSERT INTO `op_oss_qlz_login_log` VALUES ('126', 'game003', '192.168.1.128', '2014-08-25 14:34:02', '1290', '70', 'sew', '2017-06-02 12:49:28');
INSERT INTO `op_oss_qlz_login_log` VALUES ('127', 'game003', '192.168.1.128', '2014-08-25 14:37:56', '1290', '70', 'sew', '2017-06-02 12:49:28');
INSERT INTO `op_oss_qlz_login_log` VALUES ('128', 'game003', '192.168.1.118', '2014-08-25 14:44:41', '1290', '70', 'sew', '2017-06-02 12:49:29');
INSERT INTO `op_oss_qlz_login_log` VALUES ('129', 'game003', '192.168.1.118', '2014-08-25 14:46:06', '1290', '70', 'sew', '2017-06-02 12:49:30');
INSERT INTO `op_oss_qlz_login_log` VALUES ('130', 'game003', '192.168.1.118', '2014-08-25 14:46:58', '1290', '70', 'sew', '2017-06-02 12:49:30');
INSERT INTO `op_oss_qlz_login_log` VALUES ('131', 'game003', '192.168.1.241', '2014-08-25 14:47:37', 'test', '1', '波普麦金托什', '2017-06-02 12:49:30');
INSERT INTO `op_oss_qlz_login_log` VALUES ('132', 'game003', '192.168.1.241', '2014-08-25 14:49:32', 'test', '1', '波普麦金托什', '2017-06-02 12:49:30');
INSERT INTO `op_oss_qlz_login_log` VALUES ('133', 'game003', '192.168.1.241', '2014-08-25 14:50:23', 'test', '1', '波普麦金托什', '2017-06-02 12:49:30');
INSERT INTO `op_oss_qlz_login_log` VALUES ('134', 'game003', '192.168.1.241', '2014-08-25 14:53:22', 'test', '1', '波普麦金托什', '2017-06-02 12:49:31');
INSERT INTO `op_oss_qlz_login_log` VALUES ('135', 'game003', '192.168.1.118', '2014-08-25 14:55:04', '1290', '70', 'sew', '2017-06-02 12:49:31');
INSERT INTO `op_oss_qlz_login_log` VALUES ('136', 'game003', '192.168.1.118', '2014-08-25 14:56:03', '12900', '1', '拉金罗伯逊', '2017-06-02 12:49:32');
INSERT INTO `op_oss_qlz_login_log` VALUES ('137', 'game003', '192.168.1.118', '2014-08-25 14:56:39', 'test', '1', '波普麦金托什', '2017-06-02 12:49:32');
INSERT INTO `op_oss_qlz_login_log` VALUES ('138', 'game003', '192.168.1.241', '2014-08-25 15:00:10', 'test', '1', '波普麦金托什', '2017-06-02 12:49:32');
INSERT INTO `op_oss_qlz_login_log` VALUES ('139', 'game003', '192.168.1.118', '2014-08-25 15:00:36', '1290', '70', 'sew', '2017-06-02 12:49:32');
INSERT INTO `op_oss_qlz_login_log` VALUES ('140', 'game003', '192.168.1.128', '2014-08-25 17:51:44', 'EA29906FEE97799837A8F0C63035F62E', '70', '薇微笑', '2017-06-02 12:49:33');
INSERT INTO `op_oss_qlz_login_log` VALUES ('141', 'game003', '192.168.1.128', '2014-08-25 17:52:05', 'EA29906FEE97799837A8F0C63035F62E', '70', '薇微笑', '2017-06-02 12:49:33');
INSERT INTO `op_oss_qlz_login_log` VALUES ('142', 'game003', '192.168.1.118', '2014-08-26 09:44:30', '1290', '1', 'fff', '2017-06-02 12:49:33');
INSERT INTO `op_oss_qlz_login_log` VALUES ('143', 'game003', '192.168.1.118', '2014-08-26 09:50:20', '1290', '70', 'fff', '2017-06-02 12:49:35');
INSERT INTO `op_oss_qlz_login_log` VALUES ('144', 'game003', '192.168.1.118', '2014-08-26 11:36:06', '1290', '70', 'fff', '2017-06-02 12:49:35');
INSERT INTO `op_oss_qlz_login_log` VALUES ('145', 'game003', '192.168.1.118', '2014-08-26 16:54:05', '1290', '70', 'fff', '2017-06-02 12:49:35');
INSERT INTO `op_oss_qlz_login_log` VALUES ('146', 'game003', '192.168.1.118', '2014-08-28 21:37:19', 'sa1', '40', 'sa1', '2017-06-02 12:49:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('147', 'game003', '192.168.1.118', '2014-08-28 21:52:10', 'sa1', '40', 'sa1', '2017-06-02 12:49:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('148', 'game003', '192.168.1.118', '2014-08-28 21:55:03', 'sa1', '40', 'sa1', '2017-06-02 12:49:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('149', 'game003', '192.168.1.118', '2014-08-28 21:57:38', 'sa1', '40', 'sa1', '2017-06-02 12:49:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('150', 'game003', '192.168.1.118', '2014-08-28 22:18:24', 'yuchangmei12', '35', '罗素佩兴斯', '2017-06-02 12:49:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('151', 'game003', '192.168.1.118', '2014-08-28 22:19:48', 'sa1', '40', 'sa1', '2017-06-02 12:49:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('152', 'game003', '192.168.1.118', '2014-08-28 22:24:16', 'yuchangmei12', '35', '罗素佩兴斯', '2017-06-02 12:49:37');
INSERT INTO `op_oss_qlz_login_log` VALUES ('153', 'game003', '192.168.1.118', '2014-08-28 22:29:19', 'yuchangmei12', '35', '罗素佩兴斯', '2017-06-02 12:49:38');
INSERT INTO `op_oss_qlz_login_log` VALUES ('154', 'game003', '192.168.1.118', '2014-08-28 22:29:56', 'sa1', '40', 'sa1', '2017-06-02 12:49:38');
INSERT INTO `op_oss_qlz_login_log` VALUES ('155', 'game003', '192.168.1.150', '2014-08-28 22:30:16', '12', '3', '福勒菲尔丁', '2017-06-02 12:49:38');
INSERT INTO `op_oss_qlz_login_log` VALUES ('156', 'game003', '192.168.1.150', '2014-08-28 22:30:31', '12', '3', '福勒菲尔丁', '2017-06-02 12:49:38');
INSERT INTO `op_oss_qlz_login_log` VALUES ('157', 'game003', '192.168.1.118', '2014-08-28 22:48:21', 'sa1', '40', 'sa1', '2017-06-02 12:49:40');
INSERT INTO `op_oss_qlz_login_log` VALUES ('158', 'game003', '192.168.1.118', '2014-08-28 22:48:52', 'yuchangmei12', '35', '罗素佩兴斯', '2017-06-02 12:49:40');
INSERT INTO `op_oss_qlz_login_log` VALUES ('159', 'game003', '192.168.1.150', '2014-08-28 22:49:23', '12', '3', '福勒菲尔丁', '2017-06-02 12:49:41');
INSERT INTO `op_oss_qlz_login_log` VALUES ('160', 'game003', '192.168.1.118', '2014-08-28 22:54:57', 'yuchangmei12', '35', '罗素佩兴斯', '2017-06-02 12:49:41');
INSERT INTO `op_oss_qlz_login_log` VALUES ('161', 'game003', '192.168.1.118', '2014-08-28 22:55:39', 'sa1', '40', 'sa1', '2017-06-02 12:49:42');
INSERT INTO `op_oss_qlz_login_log` VALUES ('162', 'game003', '192.168.1.150', '2014-08-28 22:56:46', '12', '3', '福勒菲尔丁', '2017-06-02 12:49:42');
INSERT INTO `op_oss_qlz_login_log` VALUES ('163', 'game003', '192.168.1.118', '2014-08-28 23:28:28', 'sa123', '1', '洛克福开森', '2017-06-02 12:49:42');
INSERT INTO `op_oss_qlz_login_log` VALUES ('164', 'game003', '192.168.1.118', '2014-08-29 00:04:19', 'sa123456', '1', '拉金詹姆斯', '2017-06-02 12:49:43');
INSERT INTO `op_oss_qlz_login_log` VALUES ('165', 'game003', '192.168.1.118', '2014-08-29 00:19:14', 'sa123456', '1', '拉金詹姆斯', '2017-06-02 12:49:43');
INSERT INTO `op_oss_qlz_login_log` VALUES ('166', 'game003', '192.168.1.118', '2014-08-29 00:22:30', 'sa123456', '1', '拉金詹姆斯', '2017-06-02 12:49:43');
INSERT INTO `op_oss_qlz_login_log` VALUES ('167', 'game003', '192.168.1.118', '2014-08-29 00:27:06', 'sa123456', '1', '拉金詹姆斯', '2017-06-02 12:49:43');
INSERT INTO `op_oss_qlz_login_log` VALUES ('168', 'game003', '192.168.1.118', '2014-08-29 00:28:48', 'sa123456', '1', '拉金詹姆斯', '2017-06-02 12:49:43');
INSERT INTO `op_oss_qlz_login_log` VALUES ('169', 'game003', '192.168.1.118', '2014-08-29 00:32:58', 'sa123456', '1', '拉金詹姆斯', '2017-06-02 12:49:44');
INSERT INTO `op_oss_qlz_login_log` VALUES ('170', 'game003', '192.168.1.118', '2014-08-29 00:36:32', 'sa123456', '1', '拉金詹姆斯', '2017-06-02 12:49:44');
INSERT INTO `op_oss_qlz_login_log` VALUES ('171', 'game003', '192.168.1.118', '2014-08-29 00:42:31', 'sa123456', '1', '佩特巴特勒', '2017-06-02 12:49:44');
INSERT INTO `op_oss_qlz_login_log` VALUES ('172', 'game003', '192.168.1.118', '2014-08-29 00:48:04', 'sa123456', '1', '佩特巴特勒', '2017-06-02 12:49:44');
INSERT INTO `op_oss_qlz_login_log` VALUES ('173', 'game003', '192.168.1.118', '2014-08-29 00:48:50', 'sa123456', '1', '佩特巴特勒', '2017-06-02 12:49:45');
INSERT INTO `op_oss_qlz_login_log` VALUES ('174', 'game003', '192.168.1.118', '2014-08-29 00:49:21', 'sa1234567', '1', '迪福拉瑟福德', '2017-06-02 12:49:46');
INSERT INTO `op_oss_qlz_login_log` VALUES ('175', 'game003', '192.168.1.118', '2014-08-29 00:53:05', 'sa1234567', '1', '迪福拉瑟福德', '2017-06-02 12:49:46');
INSERT INTO `op_oss_qlz_login_log` VALUES ('176', 'game003', '192.168.1.118', '2014-08-29 12:08:29', '1', '1', '凯雷朗费罗', '2017-06-02 12:49:47');
INSERT INTO `op_oss_qlz_login_log` VALUES ('177', 'game003', '192.168.1.118', '2014-08-29 12:11:56', '1', '1', '凯雷朗费罗', '2017-06-02 12:49:47');
INSERT INTO `op_oss_qlz_login_log` VALUES ('178', 'game003', '192.168.1.118', '2014-08-29 12:13:40', '1', '1', '休詹理斯', '2017-06-02 12:49:48');
INSERT INTO `op_oss_qlz_login_log` VALUES ('179', 'game003', '192.168.1.118', '2014-08-29 12:15:34', '2', '1', '哈该哈伯德', '2017-06-02 12:49:49');
INSERT INTO `op_oss_qlz_login_log` VALUES ('180', 'game003', '192.168.1.118', '2014-08-29 12:17:16', '3', '1', '乔丹白壁德', '2017-06-02 12:49:49');
INSERT INTO `op_oss_qlz_login_log` VALUES ('181', 'game003', '192.168.1.118', '2014-08-29 12:20:45', '4', '1', '鲍勃托因比', '2017-06-02 12:49:49');
INSERT INTO `op_oss_qlz_login_log` VALUES ('182', 'game003', '192.168.1.118', '2014-08-29 12:22:37', '5', '1', '卡特霍尔特', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_login_log` VALUES ('183', 'game003', '192.168.1.118', '2014-08-29 12:24:09', '6', '1', '哈尔希克斯', '2017-06-02 12:49:50');
INSERT INTO `op_oss_qlz_login_log` VALUES ('184', 'game003', '192.168.1.118', '2014-08-29 12:25:01', '7', '1', '卡尔威克利夫', '2017-06-02 12:49:51');
INSERT INTO `op_oss_qlz_login_log` VALUES ('185', 'game003', '192.168.1.118', '2014-08-29 12:25:52', '8', '1', '哈该利奥波德', '2017-06-02 12:49:51');
INSERT INTO `op_oss_qlz_login_log` VALUES ('186', 'game003', '192.168.1.118', '2014-08-29 12:26:55', '9', '1', '杰米鲍德温', '2017-06-02 12:49:52');
INSERT INTO `op_oss_qlz_login_log` VALUES ('187', 'game003', '192.168.1.118', '2014-08-29 12:27:58', '10', '1', '罗斯克洛宁', '2017-06-02 12:49:53');
INSERT INTO `op_oss_qlz_login_log` VALUES ('188', 'game003', '192.168.1.118', '2014-08-29 12:33:10', '10', '1', '罗斯克洛宁', '2017-06-02 12:49:55');
INSERT INTO `op_oss_qlz_login_log` VALUES ('189', 'game003', '192.168.1.118', '2014-08-29 12:33:27', '9', '1', '杰米鲍德温', '2017-06-02 12:49:55');
INSERT INTO `op_oss_qlz_login_log` VALUES ('190', 'game003', '192.168.1.118', '2014-08-29 12:33:49', '8', '1', '哈该利奥波德', '2017-06-02 12:49:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('191', 'game003', '192.168.1.118', '2014-08-29 12:34:06', '7', '1', '卡尔威克利夫', '2017-06-02 12:49:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('192', 'game003', '192.168.1.118', '2014-08-29 12:34:23', '6', '1', '哈尔希克斯', '2017-06-02 12:49:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('193', 'game003', '192.168.1.118', '2014-08-29 12:34:38', '5', '1', '卡特霍尔特', '2017-06-02 12:49:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('194', 'game003', '192.168.1.118', '2014-08-29 12:34:54', '4', '1', '鲍勃托因比', '2017-06-02 12:49:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('195', 'game003', '192.168.1.118', '2014-08-29 12:35:11', '3', '1', '乔丹白壁德', '2017-06-02 12:49:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('196', 'game003', '192.168.1.118', '2014-08-29 12:35:27', '2', '1', '哈该哈伯德', '2017-06-02 12:49:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('197', 'game003', '192.168.1.118', '2014-08-29 12:36:23', '1', '2', '休詹理斯', '2017-06-02 12:49:57');
INSERT INTO `op_oss_qlz_login_log` VALUES ('198', 'game003', '192.168.1.118', '2014-08-29 12:38:15', '0', '1', '霍普鲁道夫', '2017-06-02 12:49:57');
INSERT INTO `op_oss_qlz_login_log` VALUES ('199', 'game003', '192.168.1.128', '2014-08-30 15:43:07', 'EA29906FEE97799837A8F0C63035F62E', '1', '斯诺森次巴立', '2017-06-02 12:49:58');
INSERT INTO `op_oss_qlz_login_log` VALUES ('200', 'game003', '192.168.1.128', '2014-08-30 15:45:17', 'EA29906FEE97799837A8F0C63035F62E', '1', '斯诺森次巴立', '2017-06-02 12:49:58');
INSERT INTO `op_oss_qlz_login_log` VALUES ('201', 'game003', '192.168.1.128', '2014-08-30 15:48:26', 'sad', '1', '埃文哈罗德', '2017-06-02 12:49:59');
INSERT INTO `op_oss_qlz_login_log` VALUES ('202', 'game003', '192.168.1.241', '2014-08-30 16:04:59', 'sa', '1', '巴尼比勒尔', '2017-06-02 12:49:59');
INSERT INTO `op_oss_qlz_login_log` VALUES ('203', 'game003', '192.168.1.128', '2014-08-30 16:16:27', '234', '1', '摩利安東尼', '2017-06-02 12:49:59');
INSERT INTO `op_oss_qlz_login_log` VALUES ('204', 'game003', '192.168.1.128', '2014-08-30 16:20:47', '234', '1', '摩利安東尼', '2017-06-02 12:49:59');
INSERT INTO `op_oss_qlz_login_log` VALUES ('205', 'game003', '192.168.1.128', '2014-08-30 16:23:15', '234', '1', '摩利安東尼', '2017-06-02 12:50:00');
INSERT INTO `op_oss_qlz_login_log` VALUES ('206', 'game003', '192.168.1.128', '2014-08-30 16:25:41', '234', '1', '摩利安東尼', '2017-06-02 12:50:00');
INSERT INTO `op_oss_qlz_login_log` VALUES ('207', 'game003', '192.168.1.128', '2014-08-30 16:29:24', '234', '1', '摩利安東尼', '2017-06-02 12:50:00');
INSERT INTO `op_oss_qlz_login_log` VALUES ('208', 'game003', '192.168.1.128', '2014-08-30 16:30:24', '234', '1', '摩利安東尼', '2017-06-02 12:50:01');
INSERT INTO `op_oss_qlz_login_log` VALUES ('209', 'game003', '192.168.1.128', '2014-08-30 16:30:57', '234', '1', '摩利安東尼', '2017-06-02 12:50:01');
INSERT INTO `op_oss_qlz_login_log` VALUES ('210', 'game003', '192.168.1.128', '2014-08-30 16:33:46', '234', '1', '摩利安東尼', '2017-06-02 12:50:01');
INSERT INTO `op_oss_qlz_login_log` VALUES ('211', 'game003', '192.168.1.128', '2014-08-30 16:34:50', 'EA29906FEE97799837A8F0C63035F62E', '1', '斯诺森次巴立', '2017-06-02 12:50:01');
INSERT INTO `op_oss_qlz_login_log` VALUES ('212', 'game003', '192.168.1.128', '2014-08-30 16:49:55', 'EA29906FEE97799837A8F0C63035F62E', '1', '斯诺森次巴立', '2017-06-02 12:50:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('213', 'game003', '192.168.1.128', '2014-08-30 16:51:19', '234', '1', '摩利安東尼', '2017-06-02 12:50:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('214', 'game003', '192.168.1.128', '2014-08-30 17:06:12', '234', '1', '摩利安東尼', '2017-06-02 12:50:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('215', 'game003', '192.168.1.128', '2014-08-30 17:09:20', '234', '1', '摩利安東尼', '2017-06-02 12:50:04');
INSERT INTO `op_oss_qlz_login_log` VALUES ('216', 'game003', '192.168.1.118', '2014-09-03 14:09:34', '0', '1', '霍普鲁道夫', '2017-06-02 12:50:05');
INSERT INTO `op_oss_qlz_login_log` VALUES ('217', 'game003', '192.168.1.118', '2014-09-03 14:10:34', '0', '1', '霍普鲁道夫', '2017-06-02 12:50:05');
INSERT INTO `op_oss_qlz_login_log` VALUES ('218', 'game003', '192.168.1.118', '2014-09-03 14:12:21', '0', '1', '霍普鲁道夫', '2017-06-02 12:50:05');
INSERT INTO `op_oss_qlz_login_log` VALUES ('219', 'game003', '192.168.1.118', '2014-09-03 14:49:02', '2', '1', '哈该哈伯德', '2017-06-02 12:50:06');
INSERT INTO `op_oss_qlz_login_log` VALUES ('220', 'game003', '192.168.1.118', '2014-09-04 11:52:29', '4455', '1', '劳里普里策', '2017-06-02 12:50:06');
INSERT INTO `op_oss_qlz_login_log` VALUES ('221', 'game003', '192.168.1.118', '2014-09-04 18:05:57', '2035942', '48', '李慢慢', '2017-06-02 12:50:07');
INSERT INTO `op_oss_qlz_login_log` VALUES ('222', 'game003', '192.168.1.241', '2014-09-04 18:29:06', 'test', '1', '鄧巴赫士列特', '2017-06-02 12:50:09');
INSERT INTO `op_oss_qlz_login_log` VALUES ('223', 'game003', '192.168.1.241', '2014-09-04 18:32:55', '2033648', '35', '科菲莫特利', '2017-06-02 12:50:09');
INSERT INTO `op_oss_qlz_login_log` VALUES ('224', 'game003', '192.168.1.241', '2014-09-04 18:34:25', 'test', '1', '鄧巴赫士列特', '2017-06-02 12:50:09');
INSERT INTO `op_oss_qlz_login_log` VALUES ('225', 'game003', '192.168.1.241', '2014-09-04 18:35:09', '2033648', '35', '科菲莫特利', '2017-06-02 12:50:10');
INSERT INTO `op_oss_qlz_login_log` VALUES ('226', 'game003', '192.168.1.241', '2014-09-04 18:35:42', '2033648', '35', '科菲莫特利', '2017-06-02 12:50:11');
INSERT INTO `op_oss_qlz_login_log` VALUES ('227', 'game003', '192.168.1.88', '2014-09-04 19:07:02', '43', '1', '贾德鲍德温', '2017-06-02 12:50:11');
INSERT INTO `op_oss_qlz_login_log` VALUES ('228', 'game003', '192.168.1.118', '2014-09-10 17:14:07', '1', '1', '嘛的', '2017-06-02 12:50:12');
INSERT INTO `op_oss_qlz_login_log` VALUES ('229', 'game003', '192.168.1.118', '2014-09-10 17:17:56', '1', '2', '嘛的', '2017-06-02 12:50:12');
INSERT INTO `op_oss_qlz_login_log` VALUES ('230', 'game003', '192.168.1.118', '2014-09-10 17:22:07', '1', '65', '嘛的', '2017-06-02 12:50:12');
INSERT INTO `op_oss_qlz_login_log` VALUES ('231', 'game003', '192.168.1.118', '2014-09-10 17:28:32', '1', '65', '嘛的', '2017-06-02 12:50:13');
INSERT INTO `op_oss_qlz_login_log` VALUES ('232', 'game003', '192.168.1.118', '2014-09-10 17:54:36', '1', '65', '嘛的', '2017-06-02 12:50:14');
INSERT INTO `op_oss_qlz_login_log` VALUES ('233', 'game003', '192.168.1.118', '2014-09-11 17:58:01', '4545645', '1', '斯托克罗夫特', '2017-06-02 12:50:15');
INSERT INTO `op_oss_qlz_login_log` VALUES ('234', 'game003', '192.168.1.118', '2014-09-11 17:58:23', '14', '1', '芬恩布赖斯', '2017-06-02 12:50:16');
INSERT INTO `op_oss_qlz_login_log` VALUES ('235', 'game003', '192.168.1.118', '2014-09-11 17:58:44', '14', '1', '芬恩布赖斯', '2017-06-02 12:50:16');
INSERT INTO `op_oss_qlz_login_log` VALUES ('236', 'game003', '192.168.1.118', '2014-09-11 18:02:40', '14', '8', '芬恩布赖斯', '2017-06-02 12:50:16');
INSERT INTO `op_oss_qlz_login_log` VALUES ('237', 'game003', '192.168.1.118', '2014-09-11 18:03:33', '14', '8', '芬恩布赖斯', '2017-06-02 12:50:16');
INSERT INTO `op_oss_qlz_login_log` VALUES ('238', 'game003', '192.168.1.118', '2014-09-12 12:03:15', '14', '8', '芬恩布赖斯', '2017-06-02 12:50:17');
INSERT INTO `op_oss_qlz_login_log` VALUES ('239', 'game003', '192.168.1.118', '2014-09-12 15:51:21', 'E4EF6792D38354EC67DAB4087245AD96', '70', '无赖', '2017-06-02 12:50:19');
INSERT INTO `op_oss_qlz_login_log` VALUES ('240', 'game003', '192.168.1.118', '2014-09-12 15:53:36', 'E4EF6792D38354EC67DAB4087245AD96', '70', '无赖', '2017-06-02 12:50:19');
INSERT INTO `op_oss_qlz_login_log` VALUES ('241', 'game003', '192.168.1.118', '2014-09-12 15:56:07', 'E4EF6792D38354EC67DAB4087245AD96', '70', '无赖', '2017-06-02 12:50:19');
INSERT INTO `op_oss_qlz_login_log` VALUES ('242', 'game003', '192.168.1.118', '2014-09-16 10:10:56', '1', '1', '在要', '2017-06-02 12:50:19');
INSERT INTO `op_oss_qlz_login_log` VALUES ('243', 'game003', '192.168.1.118', '2014-09-16 10:12:30', '2', '1', '尤尔富兰克林', '2017-06-02 12:50:20');
INSERT INTO `op_oss_qlz_login_log` VALUES ('244', 'game003', '192.168.1.118', '2014-09-16 10:16:59', '1', '45', '在要', '2017-06-02 12:50:20');
INSERT INTO `op_oss_qlz_login_log` VALUES ('245', 'game003', '192.168.1.118', '2014-09-16 10:17:47', '1', '45', '在要', '2017-06-02 12:50:20');
INSERT INTO `op_oss_qlz_login_log` VALUES ('246', 'game003', '192.168.1.118', '2014-09-16 10:18:29', '1', '45', '在要', '2017-06-02 12:50:20');
INSERT INTO `op_oss_qlz_login_log` VALUES ('247', 'game003', '192.168.1.118', '2014-09-16 10:18:53', '1', '45', '在要', '2017-06-02 12:50:22');
INSERT INTO `op_oss_qlz_login_log` VALUES ('248', 'game003', '192.168.1.118', '2014-09-17 16:55:28', '11', '1', '休爱迪生', '2017-06-02 12:50:26');
INSERT INTO `op_oss_qlz_login_log` VALUES ('249', 'game003', '192.168.1.118', '2014-09-17 17:00:11', '11', '1', '休爱迪生', '2017-06-02 12:50:26');
INSERT INTO `op_oss_qlz_login_log` VALUES ('250', 'game003', '192.168.1.118', '2014-09-17 17:32:55', '11', '1', '休爱迪生', '2017-06-02 12:50:26');
INSERT INTO `op_oss_qlz_login_log` VALUES ('251', 'game003', '192.168.1.118', '2014-09-17 18:24:50', '11', '1', '休爱迪生', '2017-06-02 12:50:27');
INSERT INTO `op_oss_qlz_login_log` VALUES ('252', 'game003', '192.168.1.118', '2014-09-19 11:47:47', '459742', '58', '媽媽咪呀', '2017-06-02 12:50:29');
INSERT INTO `op_oss_qlz_login_log` VALUES ('253', 'game003', '192.168.1.118', '2014-09-19 14:03:31', '459742', '58', '媽媽咪呀', '2017-06-02 12:50:30');
INSERT INTO `op_oss_qlz_login_log` VALUES ('254', 'game003', '192.168.1.128', '2014-09-19 14:45:11', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:30');
INSERT INTO `op_oss_qlz_login_log` VALUES ('255', 'game003', '192.168.1.128', '2014-09-19 14:45:37', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:31');
INSERT INTO `op_oss_qlz_login_log` VALUES ('256', 'game003', '192.168.1.128', '2014-09-19 14:51:25', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:31');
INSERT INTO `op_oss_qlz_login_log` VALUES ('257', 'game003', '192.168.1.128', '2014-09-19 14:55:39', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:31');
INSERT INTO `op_oss_qlz_login_log` VALUES ('258', 'game003', '192.168.1.128', '2014-09-19 14:58:25', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:31');
INSERT INTO `op_oss_qlz_login_log` VALUES ('259', 'game003', '192.168.1.128', '2014-09-19 14:59:14', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:32');
INSERT INTO `op_oss_qlz_login_log` VALUES ('260', 'game003', '192.168.1.128', '2014-09-19 15:01:02', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:33');
INSERT INTO `op_oss_qlz_login_log` VALUES ('261', 'game003', '192.168.1.128', '2014-09-19 15:02:18', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:33');
INSERT INTO `op_oss_qlz_login_log` VALUES ('262', 'game003', '192.168.1.128', '2014-09-19 15:03:23', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:33');
INSERT INTO `op_oss_qlz_login_log` VALUES ('263', 'game003', '192.168.1.128', '2014-09-19 15:04:29', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:34');
INSERT INTO `op_oss_qlz_login_log` VALUES ('264', 'game003', '192.168.1.128', '2014-09-19 15:06:17', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:34');
INSERT INTO `op_oss_qlz_login_log` VALUES ('265', 'game003', '192.168.1.128', '2014-09-19 15:08:23', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:34');
INSERT INTO `op_oss_qlz_login_log` VALUES ('266', 'game003', '192.168.1.118', '2014-09-19 15:09:45', '459742', '58', '媽媽咪呀', '2017-06-02 12:50:34');
INSERT INTO `op_oss_qlz_login_log` VALUES ('267', 'game003', '192.168.1.118', '2014-09-19 15:11:50', '459742', '58', '媽媽咪呀', '2017-06-02 12:50:35');
INSERT INTO `op_oss_qlz_login_log` VALUES ('268', 'game003', '192.168.1.128', '2014-09-19 15:17:52', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:35');
INSERT INTO `op_oss_qlz_login_log` VALUES ('269', 'game003', '192.168.1.128', '2014-09-19 15:22:05', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:35');
INSERT INTO `op_oss_qlz_login_log` VALUES ('270', 'game003', '192.168.1.128', '2014-09-19 15:22:40', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:35');
INSERT INTO `op_oss_qlz_login_log` VALUES ('271', 'game003', '192.168.1.128', '2014-09-19 15:25:01', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('272', 'game003', '192.168.1.128', '2014-09-19 15:27:17', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('273', 'game003', '192.168.1.128', '2014-09-19 15:28:01', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('274', 'game003', '192.168.1.128', '2014-09-19 15:30:58', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:36');
INSERT INTO `op_oss_qlz_login_log` VALUES ('275', 'game003', '192.168.1.128', '2014-09-19 15:31:38', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:37');
INSERT INTO `op_oss_qlz_login_log` VALUES ('276', 'game003', '192.168.1.128', '2014-09-19 15:32:48', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:38');
INSERT INTO `op_oss_qlz_login_log` VALUES ('277', 'game003', '192.168.1.128', '2014-09-19 15:37:23', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:38');
INSERT INTO `op_oss_qlz_login_log` VALUES ('278', 'game003', '192.168.1.128', '2014-09-19 15:39:24', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:38');
INSERT INTO `op_oss_qlz_login_log` VALUES ('279', 'game003', '192.168.1.128', '2014-09-19 15:41:13', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:39');
INSERT INTO `op_oss_qlz_login_log` VALUES ('280', 'game003', '192.168.1.128', '2014-09-19 15:42:10', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:39');
INSERT INTO `op_oss_qlz_login_log` VALUES ('281', 'game003', '192.168.1.128', '2014-09-19 15:44:55', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:39');
INSERT INTO `op_oss_qlz_login_log` VALUES ('282', 'game003', '192.168.1.128', '2014-09-19 15:47:14', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:40');
INSERT INTO `op_oss_qlz_login_log` VALUES ('283', 'game003', '192.168.1.128', '2014-09-19 15:51:21', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:41');
INSERT INTO `op_oss_qlz_login_log` VALUES ('284', 'game003', '192.168.1.128', '2014-09-19 15:54:47', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:42');
INSERT INTO `op_oss_qlz_login_log` VALUES ('285', 'game003', '192.168.1.128', '2014-09-19 15:57:11', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:43');
INSERT INTO `op_oss_qlz_login_log` VALUES ('286', 'game003', '192.168.1.128', '2014-09-19 15:58:35', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:44');
INSERT INTO `op_oss_qlz_login_log` VALUES ('287', 'game003', '192.168.1.128', '2014-09-19 16:03:36', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:44');
INSERT INTO `op_oss_qlz_login_log` VALUES ('288', 'game003', '192.168.1.128', '2014-09-19 16:06:33', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:45');
INSERT INTO `op_oss_qlz_login_log` VALUES ('289', 'game003', '192.168.1.128', '2014-09-19 16:09:35', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:46');
INSERT INTO `op_oss_qlz_login_log` VALUES ('290', 'game003', '192.168.1.128', '2014-09-19 16:09:59', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:46');
INSERT INTO `op_oss_qlz_login_log` VALUES ('291', 'game003', '192.168.1.128', '2014-09-19 16:11:24', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:47');
INSERT INTO `op_oss_qlz_login_log` VALUES ('292', 'game003', '192.168.1.128', '2014-09-19 16:18:36', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:51');
INSERT INTO `op_oss_qlz_login_log` VALUES ('293', 'game003', '192.168.1.128', '2014-09-19 16:20:55', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:52');
INSERT INTO `op_oss_qlz_login_log` VALUES ('294', 'game003', '192.168.1.128', '2014-09-19 16:42:42', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:53');
INSERT INTO `op_oss_qlz_login_log` VALUES ('295', 'game003', '192.168.1.128', '2014-09-19 16:45:51', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:54');
INSERT INTO `op_oss_qlz_login_log` VALUES ('296', 'game003', '192.168.1.128', '2014-09-19 16:48:26', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:54');
INSERT INTO `op_oss_qlz_login_log` VALUES ('297', 'game003', '192.168.1.128', '2014-09-19 17:07:31', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:55');
INSERT INTO `op_oss_qlz_login_log` VALUES ('298', 'game003', '192.168.1.128', '2014-09-19 17:08:42', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:55');
INSERT INTO `op_oss_qlz_login_log` VALUES ('299', 'game003', '192.168.1.128', '2014-09-19 17:12:01', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:55');
INSERT INTO `op_oss_qlz_login_log` VALUES ('300', 'game003', '192.168.1.128', '2014-09-19 17:13:03', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('301', 'game003', '192.168.1.128', '2014-09-19 17:24:42', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('302', 'game003', '192.168.1.128', '2014-09-19 17:25:41', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:56');
INSERT INTO `op_oss_qlz_login_log` VALUES ('303', 'game003', '192.168.1.128', '2014-09-19 17:27:41', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:57');
INSERT INTO `op_oss_qlz_login_log` VALUES ('304', 'game003', '192.168.1.128', '2014-09-19 17:28:51', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:57');
INSERT INTO `op_oss_qlz_login_log` VALUES ('305', 'game003', '192.168.1.128', '2014-09-19 17:35:24', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:58');
INSERT INTO `op_oss_qlz_login_log` VALUES ('306', 'game003', '192.168.1.128', '2014-09-19 17:51:08', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:58');
INSERT INTO `op_oss_qlz_login_log` VALUES ('307', 'game003', '192.168.1.128', '2014-09-19 17:51:46', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:58');
INSERT INTO `op_oss_qlz_login_log` VALUES ('308', 'game003', '192.168.1.128', '2014-09-19 17:53:51', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:58');
INSERT INTO `op_oss_qlz_login_log` VALUES ('309', 'game003', '192.168.1.128', '2014-09-19 17:54:12', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:59');
INSERT INTO `op_oss_qlz_login_log` VALUES ('310', 'game003', '192.168.1.128', '2014-09-19 17:54:58', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:59');
INSERT INTO `op_oss_qlz_login_log` VALUES ('311', 'game003', '192.168.1.128', '2014-09-19 17:55:43', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:59');
INSERT INTO `op_oss_qlz_login_log` VALUES ('312', 'game003', '192.168.1.128', '2014-09-19 17:55:53', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:50:59');
INSERT INTO `op_oss_qlz_login_log` VALUES ('313', 'game003', '192.168.1.128', '2014-09-19 17:59:14', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:51:00');
INSERT INTO `op_oss_qlz_login_log` VALUES ('314', 'game003', '192.168.1.128', '2014-09-19 18:05:10', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:51:00');
INSERT INTO `op_oss_qlz_login_log` VALUES ('315', 'game003', '192.168.1.118', '2014-09-22 13:53:19', '11', '1', '贝克法兰西斯', '2017-06-02 12:51:01');
INSERT INTO `op_oss_qlz_login_log` VALUES ('316', 'game003', '192.168.1.118', '2014-09-22 13:59:14', '11', '1', '贝克法兰西斯', '2017-06-02 12:51:01');
INSERT INTO `op_oss_qlz_login_log` VALUES ('317', 'game003', '192.168.1.118', '2014-09-22 14:03:25', '11', '1', '贝克法兰西斯', '2017-06-02 12:51:01');
INSERT INTO `op_oss_qlz_login_log` VALUES ('318', 'game003', '192.168.1.128', '2014-09-22 14:16:46', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:51:01');
INSERT INTO `op_oss_qlz_login_log` VALUES ('319', 'game003', '192.168.1.128', '2014-09-22 14:43:10', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '特里艾迪生', '2017-06-02 12:51:02');
INSERT INTO `op_oss_qlz_login_log` VALUES ('320', 'game003', '192.168.1.118', '2014-09-22 17:37:31', '2039427', '69', '田小官', '2017-06-02 12:51:04');
INSERT INTO `op_oss_qlz_login_log` VALUES ('321', 'game003', '192.168.1.128', '2014-09-22 17:38:29', 'sad', '1', '鲍勃李嘉图', '2017-06-02 12:51:05');
INSERT INTO `op_oss_qlz_login_log` VALUES ('322', 'game003', '192.168.1.118', '2014-09-22 17:53:14', '2039427', '69', '田小官', '2017-06-02 12:51:06');
INSERT INTO `op_oss_qlz_login_log` VALUES ('323', 'game003', '192.168.1.118', '2014-09-22 17:55:20', '2039427', '69', '田小官', '2017-06-02 12:51:06');
INSERT INTO `op_oss_qlz_login_log` VALUES ('324', 'game003', '192.168.1.118', '2014-09-22 18:25:05', '2039427', '69', '田小官', '2017-06-02 12:51:06');
INSERT INTO `op_oss_qlz_login_log` VALUES ('325', '1', '192.168.1.118', '2014-09-26 09:35:14', '2039427', '1', '兰登亚当斯', '2017-06-02 12:51:07');
INSERT INTO `op_oss_qlz_login_log` VALUES ('326', '1', '192.168.1.118', '2014-09-26 09:36:17', '2039427', '1', '兰登亚当斯', '2017-06-02 12:51:07');
INSERT INTO `op_oss_qlz_login_log` VALUES ('327', '1', '192.168.1.118', '2014-09-26 09:47:07', '1', '1', '1', '2017-06-02 12:51:08');
INSERT INTO `op_oss_qlz_login_log` VALUES ('328', '1', '192.168.1.118', '2014-09-26 09:48:21', '2', '1', '2', '2017-06-02 12:51:08');
INSERT INTO `op_oss_qlz_login_log` VALUES ('329', '1', '192.168.1.118', '2014-09-26 09:49:20', '3', '1', '3', '2017-06-02 12:51:08');
INSERT INTO `op_oss_qlz_login_log` VALUES ('330', '1', '192.168.1.118', '2014-09-26 09:50:04', '4', '1', '5', '2017-06-02 12:51:08');
INSERT INTO `op_oss_qlz_login_log` VALUES ('331', '1', '192.168.1.118', '2014-09-26 09:50:47', '5', '1', '4', '2017-06-02 12:52:22');
INSERT INTO `op_oss_qlz_login_log` VALUES ('332', '1', '192.168.1.118', '2014-09-26 09:53:14', '6', '1', '6', '2017-06-02 12:52:22');
INSERT INTO `op_oss_qlz_login_log` VALUES ('333', '1', '192.168.1.118', '2014-09-26 10:12:44', '6', '1', '6', '2017-06-02 12:52:22');
INSERT INTO `op_oss_qlz_login_log` VALUES ('334', '1', '192.168.1.118', '2014-09-26 10:13:19', '5', '1', '4', '2017-06-02 12:52:23');
INSERT INTO `op_oss_qlz_login_log` VALUES ('335', '1', '192.168.1.118', '2014-09-26 10:13:32', '4', '1', '5', '2017-06-02 12:52:23');
INSERT INTO `op_oss_qlz_login_log` VALUES ('336', '1', '192.168.1.118', '2014-09-26 10:13:49', '3', '1', '3', '2017-06-02 12:52:23');
INSERT INTO `op_oss_qlz_login_log` VALUES ('337', '1', '192.168.1.118', '2014-09-26 10:14:24', '2', '1', '2', '2017-06-02 12:52:24');
INSERT INTO `op_oss_qlz_login_log` VALUES ('338', '1', '192.168.1.118', '2014-09-26 10:14:37', '1', '3', '1', '2017-06-02 12:52:24');
INSERT INTO `op_oss_qlz_login_log` VALUES ('339', '1', '192.168.1.118', '2014-09-26 10:33:55', '6', '1', '6', '2017-06-02 12:52:25');
INSERT INTO `op_oss_qlz_login_log` VALUES ('340', '1', '192.168.1.118', '2014-09-26 10:34:45', '5', '1', '4', '2017-06-02 12:52:25');
INSERT INTO `op_oss_qlz_login_log` VALUES ('341', '1', '192.168.1.118', '2014-09-26 10:35:20', '4', '1', '5', '2017-06-02 12:52:26');
INSERT INTO `op_oss_qlz_login_log` VALUES ('342', '1', '192.168.1.118', '2014-09-26 10:35:56', '3', '1', '3', '2017-06-02 12:52:27');
INSERT INTO `op_oss_qlz_login_log` VALUES ('343', '1', '192.168.1.118', '2014-09-26 10:36:27', '2', '1', '2', '2017-06-02 12:52:27');
INSERT INTO `op_oss_qlz_login_log` VALUES ('344', '1', '192.168.1.118', '2014-09-26 10:36:56', '1', '3', '1', '2017-06-02 12:52:28');
INSERT INTO `op_oss_qlz_login_log` VALUES ('345', '1', '192.168.1.118', '2014-09-28 14:09:10', '1', '3', '1', '2017-06-02 12:52:32');
INSERT INTO `op_oss_qlz_login_log` VALUES ('346', '1', '192.168.1.118', '2014-09-28 14:12:55', '1', '3', '1', '2017-06-02 12:52:33');
INSERT INTO `op_oss_qlz_login_log` VALUES ('347', '1', '192.168.1.118', '2014-09-28 14:15:54', '1', '3', '1', '2017-06-02 12:52:33');
INSERT INTO `op_oss_qlz_login_log` VALUES ('348', '1', '192.168.1.118', '2014-09-28 14:18:10', '1', '3', '1', '2017-06-02 12:52:33');
INSERT INTO `op_oss_qlz_login_log` VALUES ('349', '1', '192.168.1.118', '2014-09-28 14:23:31', '1', '3', '1', '2017-06-02 12:52:33');
INSERT INTO `op_oss_qlz_login_log` VALUES ('350', '1', '192.168.1.118', '2014-09-28 14:24:04', '1', '3', '1', '2017-06-02 12:52:34');
INSERT INTO `op_oss_qlz_login_log` VALUES ('351', '1', '192.168.1.118', '2014-09-28 17:06:34', '2', '1', '2', '2017-06-02 12:52:36');

-- ----------------------------
-- Table structure for op_oss_qlz_onlinecur_log
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_onlinecur_log`;
CREATE TABLE `op_oss_qlz_onlinecur_log` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `worldid` varchar(20) DEFAULT NULL,
  `onlinenum` int(11) DEFAULT '0',
  `addtime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=758 DEFAULT CHARSET=utf8 COMMENT='上报实时在线人数   周期5秒\r\n\r\n当前时间  传输是 unix 时间   存储格式是日期格式';

-- ----------------------------
-- Records of op_oss_qlz_onlinecur_log
-- ----------------------------
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('1', 'game003', '0', '2014-08-21 17:42:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('2', 'game003', '1', '2014-08-21 17:47:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('3', 'game003', '0', '2014-08-21 17:54:13');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('4', 'game003', '1', '2014-08-21 17:59:13');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('5', 'game003', '0', '2014-08-21 18:04:13');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('6', 'game003', '0', '2014-08-21 18:09:13');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('7', 'game003', '0', '2014-08-21 18:14:13');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('8', 'game003', '0', '2014-08-21 18:19:13');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('9', 'game003', '0', '2014-08-21 18:24:13');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('10', 'game003', '0', '2014-08-22 09:42:02');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('11', 'game003', '0', '2014-08-22 09:50:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('12', 'game003', '0', '2014-08-22 09:55:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('13', 'game003', '1', '2014-08-22 10:04:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('14', 'game003', '1', '2014-08-22 10:09:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('15', 'game003', '1', '2014-08-22 10:14:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('16', 'game003', '1', '2014-08-22 10:19:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('17', 'game003', '1', '2014-08-22 10:24:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('18', 'game003', '1', '2014-08-22 10:29:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('19', 'game003', '1', '2014-08-22 10:34:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('20', 'game003', '1', '2014-08-22 10:39:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('21', 'game003', '1', '2014-08-22 10:44:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('22', 'game003', '0', '2014-08-22 10:49:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('23', 'game003', '0', '2014-08-22 10:54:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('24', 'game003', '0', '2014-08-22 10:59:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('25', 'game003', '0', '2014-08-22 11:04:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('26', 'game003', '0', '2014-08-22 11:09:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('27', 'game003', '0', '2014-08-22 11:14:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('28', 'game003', '0', '2014-08-22 11:25:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('29', 'game003', '0', '2014-08-22 11:36:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('30', 'game003', '0', '2014-08-22 11:41:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('31', 'game003', '0', '2014-08-22 11:46:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('32', 'game003', '0', '2014-08-22 11:55:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('33', 'game003', '0', '2014-08-22 12:00:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('34', 'game003', '0', '2014-08-22 12:05:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('35', 'game003', '0', '2014-08-22 12:10:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('36', 'game003', '0', '2014-08-22 12:15:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('37', 'game003', '0', '2014-08-22 12:20:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('38', 'game003', '0', '2014-08-22 12:25:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('39', 'game003', '0', '2014-08-22 12:37:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('40', 'game003', '0', '2014-08-22 12:49:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('41', 'game003', '0', '2014-08-22 12:54:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('42', 'game003', '1', '2014-08-22 12:59:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('43', 'game003', '0', '2014-08-22 13:04:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('44', 'game003', '0', '2014-08-22 13:09:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('45', 'game003', '0', '2014-08-22 13:14:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('46', 'game003', '0', '2014-08-22 13:19:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('47', 'game003', '0', '2014-08-22 13:24:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('48', 'game003', '0', '2014-08-22 13:29:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('49', 'game003', '0', '2014-08-22 13:34:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('50', 'game003', '1', '2014-08-22 13:39:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('51', 'game003', '0', '2014-08-22 13:44:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('52', 'game003', '0', '2014-08-22 13:49:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('53', 'game003', '1', '2014-08-22 13:54:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('54', 'game003', '1', '2014-08-22 13:59:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('55', 'game003', '1', '2014-08-22 14:06:49');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('56', 'game003', '1', '2014-08-22 14:11:49');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('57', 'game003', '2', '2014-08-22 14:16:49');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('58', 'game003', '1', '2014-08-22 14:21:49');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('59', 'game003', '1', '2014-08-22 14:35:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('60', 'game003', '1', '2014-08-22 14:40:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('61', 'game003', '1', '2014-08-22 14:45:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('62', 'game003', '2', '2014-08-22 14:50:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('63', 'game003', '1', '2014-08-22 14:55:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('64', 'game003', '1', '2014-08-22 15:00:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('65', 'game003', '2', '2014-08-22 15:05:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('66', 'game003', '1', '2014-08-22 15:10:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('67', 'game003', '1', '2014-08-22 15:15:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('68', 'game003', '1', '2014-08-22 15:22:40');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('69', 'game003', '0', '2014-08-22 15:27:40');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('70', 'game003', '1', '2014-08-22 15:32:40');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('71', 'game003', '1', '2014-08-22 15:37:40');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('72', 'game003', '1', '2014-08-22 15:42:40');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('73', 'game003', '0', '2014-08-22 15:50:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('74', 'game003', '1', '2014-08-22 15:55:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('75', 'game003', '1', '2014-08-22 16:00:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('76', 'game003', '2', '2014-08-22 16:05:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('77', 'game003', '2', '2014-08-22 16:10:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('78', 'game003', '2', '2014-08-22 16:15:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('79', 'game003', '2', '2014-08-22 16:20:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('80', 'game003', '2', '2014-08-22 16:25:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('81', 'game003', '2', '2014-08-22 16:30:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('82', 'game003', '2', '2014-08-22 16:35:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('83', 'game003', '2', '2014-08-22 16:40:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('84', 'game003', '1', '2014-08-22 16:45:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('85', 'game003', '1', '2014-08-22 16:50:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('86', 'game003', '1', '2014-08-22 16:55:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('87', 'game003', '1', '2014-08-22 17:00:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('88', 'game003', '1', '2014-08-22 17:05:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('89', 'game003', '1', '2014-08-22 17:10:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('90', 'game003', '0', '2014-08-22 17:15:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('91', 'game003', '1', '2014-08-22 17:20:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('92', 'game003', '1', '2014-08-22 17:25:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('93', 'game003', '1', '2014-08-22 17:30:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('94', 'game003', '0', '2014-08-22 17:35:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('95', 'game003', '0', '2014-08-22 17:40:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('96', 'game003', '0', '2014-08-22 17:45:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('97', 'game003', '0', '2014-08-22 17:50:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('98', 'game003', '0', '2014-08-22 17:55:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('99', 'game003', '0', '2014-08-22 18:00:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('100', 'game003', '0', '2014-08-23 15:39:39');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('101', 'game003', '0', '2014-08-23 15:44:39');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('102', 'game003', '0', '2014-08-23 15:49:39');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('103', 'game003', '0', '2014-08-23 15:54:39');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('104', 'game003', '0', '2014-08-23 15:59:39');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('105', 'game003', '0', '2014-08-23 16:04:39');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('106', 'game003', '0', '2014-08-23 16:09:39');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('107', 'game003', '0', '2014-08-23 16:14:39');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('108', 'game003', '0', '2014-08-23 17:22:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('109', 'game003', '0', '2014-08-23 17:27:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('110', 'game003', '0', '2014-08-23 17:32:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('111', 'game003', '0', '2014-08-23 17:37:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('112', 'game003', '0', '2014-08-23 17:42:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('113', 'game003', '1', '2014-08-25 09:40:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('114', 'game003', '1', '2014-08-25 10:17:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('115', 'game003', '1', '2014-08-25 10:22:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('116', 'game003', '0', '2014-08-25 10:27:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('117', 'game003', '1', '2014-08-25 10:39:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('118', 'game003', '1', '2014-08-25 10:50:58');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('119', 'game003', '1', '2014-08-25 10:55:58');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('120', 'game003', '1', '2014-08-25 11:00:58');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('121', 'game003', '1', '2014-08-25 11:12:33');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('122', 'game003', '0', '2014-08-25 11:17:33');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('123', 'game003', '0', '2014-08-25 11:22:33');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('124', 'game003', '1', '2014-08-25 11:59:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('125', 'game003', '1', '2014-08-25 12:04:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('126', 'game003', '1', '2014-08-25 12:09:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('127', 'game003', '0', '2014-08-25 12:14:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('128', 'game003', '0', '2014-08-25 12:19:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('129', 'game003', '1', '2014-08-25 12:24:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('130', 'game003', '0', '2014-08-25 12:29:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('131', 'game003', '0', '2014-08-25 12:34:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('132', 'game003', '0', '2014-08-25 12:39:23');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('133', 'game003', '0', '2014-08-25 12:48:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('134', 'game003', '0', '2014-08-25 12:53:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('135', 'game003', '0', '2014-08-25 12:58:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('136', 'game003', '0', '2014-08-25 13:03:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('137', 'game003', '0', '2014-08-25 13:08:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('138', 'game003', '0', '2014-08-25 13:13:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('139', 'game003', '0', '2014-08-25 13:18:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('140', 'game003', '0', '2014-08-25 13:23:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('141', 'game003', '0', '2014-08-25 13:28:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('142', 'game003', '0', '2014-08-25 13:33:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('143', 'game003', '2', '2014-08-25 13:38:42');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('144', 'game003', '2', '2014-08-25 13:49:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('145', 'game003', '2', '2014-08-25 13:54:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('146', 'game003', '2', '2014-08-25 13:59:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('147', 'game003', '2', '2014-08-25 14:04:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('148', 'game003', '1', '2014-08-25 14:09:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('149', 'game003', '1', '2014-08-25 14:20:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('150', 'game003', '1', '2014-08-25 14:25:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('151', 'game003', '1', '2014-08-25 14:33:00');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('152', 'game003', '1', '2014-08-25 14:38:00');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('153', 'game003', '1', '2014-08-25 14:43:00');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('154', 'game003', '2', '2014-08-25 14:50:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('155', 'game003', '1', '2014-08-25 14:55:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('156', 'game003', '1', '2014-08-25 17:34:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('157', 'game003', '1', '2014-08-25 17:39:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('158', 'game003', '0', '2014-08-25 17:44:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('159', 'game003', '1', '2014-08-26 09:49:06');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('160', 'game003', '1', '2014-08-26 09:54:06');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('161', 'game003', '1', '2014-08-26 09:59:06');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('162', 'game003', '0', '2014-08-26 16:58:16');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('163', 'game003', '0', '2014-08-26 17:03:16');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('164', 'game003', '0', '2014-08-26 17:08:16');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('165', 'game003', '0', '2014-08-26 17:13:16');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('166', 'game003', '0', '2014-08-26 17:18:16');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('167', 'game003', '0', '2014-08-28 16:58:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('168', 'game003', '0', '2014-08-28 17:03:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('169', 'game003', '0', '2014-08-28 17:08:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('170', 'game003', '0', '2014-08-28 21:41:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('171', 'game003', '0', '2014-08-28 21:46:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('172', 'game003', '1', '2014-08-28 22:02:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('173', 'game003', '1', '2014-08-28 22:07:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('174', 'game003', '0', '2014-08-28 22:12:09');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('175', 'game003', '1', '2014-08-28 22:21:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('176', 'game003', '2', '2014-08-28 22:26:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('177', 'game003', '3', '2014-08-28 22:34:02');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('178', 'game003', '3', '2014-08-28 22:39:02');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('179', 'game003', '3', '2014-08-28 22:44:02');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('180', 'game003', '1', '2014-08-28 23:32:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('181', 'game003', '1', '2014-08-28 23:37:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('182', 'game003', '1', '2014-08-28 23:42:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('183', 'game003', '0', '2014-08-29 00:07:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('184', 'game003', '1', '2014-08-29 00:31:49');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('185', 'game003', '1', '2014-08-29 00:36:49');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('186', 'game003', '1', '2014-08-29 00:46:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('187', 'game003', '2', '2014-08-29 12:15:38');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('188', 'game003', '3', '2014-08-29 12:20:38');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('189', 'game003', '7', '2014-08-29 12:25:38');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('190', 'game003', '10', '2014-08-29 12:30:38');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('191', 'game003', '10', '2014-08-29 12:37:51');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('192', 'game003', '1', '2014-08-30 15:49:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('193', 'game003', '0', '2014-08-30 15:54:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('194', 'game003', '0', '2014-08-30 15:59:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('195', 'game003', '0', '2014-08-30 16:04:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('196', 'game003', '0', '2014-08-30 16:09:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('197', 'game003', '0', '2014-08-30 16:14:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('198', 'game003', '0', '2014-08-30 16:19:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('199', 'game003', '1', '2014-08-30 16:24:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('200', 'game003', '0', '2014-08-30 16:29:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('201', 'game003', '0', '2014-08-30 16:34:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('202', 'game003', '1', '2014-08-30 16:39:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('203', 'game003', '1', '2014-08-30 16:44:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('204', 'game003', '1', '2014-08-30 16:49:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('205', 'game003', '1', '2014-08-30 16:54:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('206', 'game003', '1', '2014-08-30 16:59:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('207', 'game003', '1', '2014-08-30 17:04:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('208', 'game003', '0', '2014-08-30 17:09:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('209', 'game003', '0', '2014-08-30 17:14:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('210', 'game003', '0', '2014-08-30 17:19:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('211', 'game003', '0', '2014-08-30 17:24:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('212', 'game003', '0', '2014-08-30 17:29:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('213', 'game003', '0', '2014-08-30 17:34:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('214', 'game003', '0', '2014-08-30 17:39:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('215', 'game003', '0', '2014-08-30 17:44:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('216', 'game003', '0', '2014-08-30 17:49:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('217', 'game003', '0', '2014-08-30 17:54:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('218', 'game003', '0', '2014-08-30 17:59:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('219', 'game003', '0', '2014-08-30 18:04:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('220', 'game003', '0', '2014-08-30 18:09:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('221', 'game003', '0', '2014-08-30 18:14:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('222', 'game003', '0', '2014-08-30 18:19:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('223', 'game003', '0', '2014-08-30 18:24:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('224', 'game003', '0', '2014-08-30 18:29:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('225', 'game003', '0', '2014-08-30 18:34:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('226', 'game003', '0', '2014-08-30 18:39:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('227', 'game003', '0', '2014-08-30 18:44:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('228', 'game003', '0', '2014-08-30 18:49:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('229', 'game003', '0', '2014-08-30 18:54:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('230', 'game003', '0', '2014-08-30 18:59:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('231', 'game003', '0', '2014-08-30 19:04:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('232', 'game003', '0', '2014-08-30 19:09:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('233', 'game003', '0', '2014-08-30 19:14:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('234', 'game003', '0', '2014-08-30 19:19:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('235', 'game003', '0', '2014-08-30 19:24:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('236', 'game003', '0', '2014-08-30 19:29:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('237', 'game003', '0', '2014-08-30 19:34:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('238', 'game003', '0', '2014-08-30 19:39:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('239', 'game003', '0', '2014-08-30 19:44:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('240', 'game003', '0', '2014-08-30 19:49:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('241', 'game003', '0', '2014-08-30 19:54:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('242', 'game003', '0', '2014-08-30 19:59:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('243', 'game003', '0', '2014-08-30 20:04:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('244', 'game003', '0', '2014-08-30 20:09:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('245', 'game003', '0', '2014-08-30 20:14:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('246', 'game003', '0', '2014-08-30 20:19:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('247', 'game003', '0', '2014-08-30 20:24:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('248', 'game003', '0', '2014-08-30 20:29:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('249', 'game003', '0', '2014-08-30 20:34:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('250', 'game003', '0', '2014-08-30 20:39:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('251', 'game003', '0', '2014-08-30 20:44:17');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('252', 'game003', '0', '2014-09-03 13:32:22');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('253', 'game003', '0', '2014-09-03 13:37:22');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('254', 'game003', '1', '2014-09-03 14:11:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('255', 'game003', '0', '2014-09-03 14:16:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('256', 'game003', '0', '2014-09-03 14:21:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('257', 'game003', '0', '2014-09-03 14:26:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('258', 'game003', '1', '2014-09-03 14:51:16');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('259', 'game003', '0', '2014-09-04 12:08:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('260', 'game003', '0', '2014-09-04 12:13:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('261', 'game003', '0', '2014-09-04 12:18:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('262', 'game003', '0', '2014-09-04 12:23:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('263', 'game003', '0', '2014-09-04 12:28:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('264', 'game003', '0', '2014-09-04 12:33:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('265', 'game003', '0', '2014-09-04 12:38:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('266', 'game003', '0', '2014-09-04 12:43:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('267', 'game003', '0', '2014-09-04 12:48:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('268', 'game003', '0', '2014-09-04 12:53:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('269', 'game003', '0', '2014-09-04 12:58:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('270', 'game003', '0', '2014-09-04 13:03:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('271', 'game003', '0', '2014-09-04 13:08:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('272', 'game003', '0', '2014-09-04 13:13:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('273', 'game003', '0', '2014-09-04 13:18:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('274', 'game003', '0', '2014-09-04 13:23:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('275', 'game003', '0', '2014-09-04 13:28:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('276', 'game003', '0', '2014-09-04 13:33:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('277', 'game003', '0', '2014-09-04 13:38:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('278', 'game003', '0', '2014-09-04 13:43:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('279', 'game003', '0', '2014-09-04 13:48:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('280', 'game003', '0', '2014-09-04 13:53:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('281', 'game003', '0', '2014-09-04 13:58:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('282', 'game003', '0', '2014-09-04 14:03:43');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('283', 'game003', '1', '2014-09-04 18:07:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('284', 'game003', '1', '2014-09-04 18:12:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('285', 'game003', '1', '2014-09-04 18:17:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('286', 'game003', '1', '2014-09-04 18:22:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('287', 'game003', '1', '2014-09-04 18:27:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('288', 'game003', '1', '2014-09-04 18:32:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('289', 'game003', '2', '2014-09-04 18:37:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('290', 'game003', '1', '2014-09-04 18:42:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('291', 'game003', '1', '2014-09-04 18:47:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('292', 'game003', '1', '2014-09-04 18:52:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('293', 'game003', '1', '2014-09-04 18:57:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('294', 'game003', '1', '2014-09-04 19:02:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('295', 'game003', '2', '2014-09-04 19:07:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('296', 'game003', '1', '2014-09-04 19:12:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('297', 'game003', '1', '2014-09-04 19:17:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('298', 'game003', '1', '2014-09-04 19:22:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('299', 'game003', '1', '2014-09-04 19:27:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('300', 'game003', '1', '2014-09-04 19:32:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('301', 'game003', '1', '2014-09-04 19:37:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('302', 'game003', '1', '2014-09-04 19:42:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('303', 'game003', '1', '2014-09-04 19:47:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('304', 'game003', '1', '2014-09-04 19:52:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('305', 'game003', '1', '2014-09-04 19:57:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('306', 'game003', '1', '2014-09-04 20:02:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('307', 'game003', '1', '2014-09-04 20:07:07');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('308', 'game003', '0', '2014-09-10 17:08:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('309', 'game003', '0', '2014-09-10 17:13:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('310', 'game003', '1', '2014-09-10 17:22:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('311', 'game003', '0', '2014-09-10 17:27:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('312', 'game003', '1', '2014-09-10 17:32:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('313', 'game003', '1', '2014-09-10 17:37:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('314', 'game003', '1', '2014-09-10 17:42:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('315', 'game003', '1', '2014-09-10 17:47:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('316', 'game003', '1', '2014-09-10 17:52:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('317', 'game003', '0', '2014-09-10 17:59:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('318', 'game003', '0', '2014-09-10 18:07:25');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('319', 'game003', '0', '2014-09-11 13:45:12');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('320', 'game003', '0', '2014-09-11 13:50:12');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('321', 'game003', '0', '2014-09-11 13:55:12');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('322', 'game003', '0', '2014-09-11 14:28:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('323', 'game003', '0', '2014-09-11 14:33:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('324', 'game003', '0', '2014-09-11 14:38:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('325', 'game003', '0', '2014-09-11 14:43:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('326', 'game003', '0', '2014-09-11 14:48:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('327', 'game003', '0', '2014-09-11 14:53:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('328', 'game003', '0', '2014-09-11 14:58:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('329', 'game003', '0', '2014-09-11 15:03:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('330', 'game003', '0', '2014-09-11 15:08:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('331', 'game003', '0', '2014-09-11 15:13:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('332', 'game003', '0', '2014-09-11 15:18:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('333', 'game003', '0', '2014-09-11 15:23:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('334', 'game003', '0', '2014-09-11 15:28:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('335', 'game003', '0', '2014-09-11 15:48:40');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('336', 'game003', '0', '2014-09-11 15:53:40');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('337', 'game003', '0', '2014-09-11 15:58:40');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('338', 'game003', '0', '2014-09-11 16:03:40');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('339', 'game003', '0', '2014-09-11 16:28:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('340', 'game003', '0', '2014-09-11 16:33:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('341', 'game003', '0', '2014-09-11 16:38:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('342', 'game003', '0', '2014-09-11 16:43:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('343', 'game003', '0', '2014-09-11 16:48:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('344', 'game003', '0', '2014-09-11 16:53:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('345', 'game003', '0', '2014-09-11 16:58:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('346', 'game003', '0', '2014-09-11 17:03:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('347', 'game003', '0', '2014-09-11 17:08:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('348', 'game003', '0', '2014-09-11 17:13:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('349', 'game003', '0', '2014-09-11 17:18:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('350', 'game003', '0', '2014-09-11 17:23:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('351', 'game003', '0', '2014-09-11 17:28:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('352', 'game003', '0', '2014-09-11 17:33:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('353', 'game003', '0', '2014-09-11 17:38:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('354', 'game003', '0', '2014-09-11 17:43:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('355', 'game003', '0', '2014-09-11 17:48:03');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('356', 'game003', '1', '2014-09-11 18:02:12');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('357', 'game003', '0', '2014-09-12 11:45:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('358', 'game003', '0', '2014-09-12 11:50:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('359', 'game003', '0', '2014-09-12 11:55:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('360', 'game003', '0', '2014-09-12 12:00:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('361', 'game003', '1', '2014-09-12 12:05:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('362', 'game003', '0', '2014-09-12 12:10:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('363', 'game003', '0', '2014-09-12 12:15:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('364', 'game003', '0', '2014-09-12 12:20:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('365', 'game003', '0', '2014-09-12 12:25:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('366', 'game003', '0', '2014-09-12 12:30:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('367', 'game003', '0', '2014-09-12 12:35:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('368', 'game003', '0', '2014-09-12 12:40:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('369', 'game003', '0', '2014-09-12 14:30:53');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('370', 'game003', '0', '2014-09-12 14:35:53');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('371', 'game003', '0', '2014-09-12 14:40:53');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('372', 'game003', '0', '2014-09-12 15:59:39');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('373', 'game003', '0', '2014-09-12 16:04:39');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('374', 'game003', '0', '2014-09-15 16:00:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('375', 'game003', '0', '2014-09-15 16:05:52');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('376', 'game003', '1', '2014-09-16 10:11:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('377', 'game003', '2', '2014-09-16 10:16:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('378', 'game003', '2', '2014-09-16 10:21:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('379', 'game003', '2', '2014-09-16 10:26:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('380', 'game003', '2', '2014-09-16 10:31:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('381', 'game003', '2', '2014-09-16 10:36:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('382', 'game003', '2', '2014-09-16 10:41:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('383', 'game003', '2', '2014-09-16 10:46:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('384', 'game003', '2', '2014-09-16 10:51:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('385', 'game003', '2', '2014-09-16 10:56:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('386', 'game003', '2', '2014-09-16 11:01:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('387', 'game003', '2', '2014-09-16 11:06:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('388', 'game003', '2', '2014-09-16 11:11:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('389', 'game003', '2', '2014-09-16 11:16:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('390', 'game003', '2', '2014-09-16 11:21:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('391', 'game003', '2', '2014-09-16 11:26:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('392', 'game003', '2', '2014-09-16 11:31:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('393', 'game003', '2', '2014-09-16 11:36:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('394', 'game003', '2', '2014-09-16 11:41:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('395', 'game003', '2', '2014-09-16 11:46:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('396', 'game003', '2', '2014-09-16 11:51:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('397', 'game003', '2', '2014-09-16 11:56:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('398', 'game003', '2', '2014-09-16 12:01:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('399', 'game003', '2', '2014-09-16 12:06:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('400', 'game003', '1', '2014-09-16 12:11:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('401', 'game003', '1', '2014-09-16 12:16:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('402', 'game003', '1', '2014-09-16 12:21:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('403', 'game003', '1', '2014-09-16 12:26:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('404', 'game003', '1', '2014-09-16 12:31:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('405', 'game003', '1', '2014-09-16 12:36:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('406', 'game003', '1', '2014-09-16 12:41:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('407', 'game003', '1', '2014-09-16 12:46:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('408', 'game003', '1', '2014-09-16 12:51:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('409', 'game003', '1', '2014-09-16 12:56:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('410', 'game003', '1', '2014-09-16 13:01:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('411', 'game003', '1', '2014-09-16 13:06:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('412', 'game003', '1', '2014-09-16 13:11:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('413', 'game003', '1', '2014-09-16 13:16:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('414', 'game003', '1', '2014-09-16 13:21:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('415', 'game003', '1', '2014-09-16 13:26:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('416', 'game003', '1', '2014-09-16 13:31:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('417', 'game003', '1', '2014-09-16 13:36:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('418', 'game003', '1', '2014-09-16 13:41:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('419', 'game003', '1', '2014-09-16 13:46:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('420', 'game003', '1', '2014-09-16 13:51:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('421', 'game003', '1', '2014-09-16 13:56:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('422', 'game003', '1', '2014-09-16 14:01:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('423', 'game003', '1', '2014-09-16 14:06:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('424', 'game003', '1', '2014-09-16 14:11:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('425', 'game003', '1', '2014-09-16 14:16:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('426', 'game003', '1', '2014-09-16 14:21:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('427', 'game003', '1', '2014-09-16 14:26:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('428', 'game003', '1', '2014-09-16 14:31:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('429', 'game003', '1', '2014-09-16 14:36:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('430', 'game003', '1', '2014-09-16 14:41:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('431', 'game003', '1', '2014-09-16 14:46:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('432', 'game003', '1', '2014-09-16 14:51:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('433', 'game003', '1', '2014-09-16 14:56:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('434', 'game003', '1', '2014-09-16 15:01:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('435', 'game003', '1', '2014-09-16 15:06:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('436', 'game003', '1', '2014-09-16 15:11:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('437', 'game003', '1', '2014-09-16 15:16:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('438', 'game003', '1', '2014-09-16 15:21:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('439', 'game003', '1', '2014-09-16 15:26:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('440', 'game003', '1', '2014-09-16 15:31:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('441', 'game003', '1', '2014-09-16 15:36:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('442', 'game003', '1', '2014-09-16 15:41:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('443', 'game003', '1', '2014-09-16 15:46:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('444', 'game003', '1', '2014-09-16 15:51:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('445', 'game003', '1', '2014-09-16 15:56:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('446', 'game003', '1', '2014-09-16 16:01:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('447', 'game003', '1', '2014-09-16 16:06:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('448', 'game003', '1', '2014-09-16 16:11:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('449', 'game003', '1', '2014-09-16 16:16:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('450', 'game003', '1', '2014-09-16 16:21:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('451', 'game003', '1', '2014-09-16 16:26:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('452', 'game003', '1', '2014-09-16 16:31:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('453', 'game003', '1', '2014-09-16 16:36:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('454', 'game003', '1', '2014-09-16 16:41:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('455', 'game003', '1', '2014-09-16 16:46:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('456', 'game003', '1', '2014-09-16 16:51:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('457', 'game003', '1', '2014-09-16 16:56:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('458', 'game003', '1', '2014-09-16 17:01:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('459', 'game003', '1', '2014-09-16 17:06:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('460', 'game003', '1', '2014-09-16 17:11:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('461', 'game003', '1', '2014-09-16 17:16:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('462', 'game003', '1', '2014-09-16 17:21:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('463', 'game003', '1', '2014-09-16 17:26:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('464', 'game003', '1', '2014-09-16 17:31:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('465', 'game003', '1', '2014-09-16 17:36:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('466', 'game003', '0', '2014-09-16 17:41:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('467', 'game003', '0', '2014-09-16 17:46:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('468', 'game003', '0', '2014-09-16 17:51:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('469', 'game003', '0', '2014-09-16 17:56:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('470', 'game003', '0', '2014-09-16 18:01:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('471', 'game003', '0', '2014-09-16 18:06:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('472', 'game003', '0', '2014-09-16 18:11:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('473', 'game003', '0', '2014-09-16 18:16:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('474', 'game003', '0', '2014-09-16 18:21:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('475', 'game003', '0', '2014-09-16 18:26:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('476', 'game003', '0', '2014-09-16 18:31:37');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('477', 'game003', '0', '2014-09-17 16:59:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('478', 'game003', '0', '2014-09-17 17:04:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('479', 'game003', '0', '2014-09-17 17:09:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('480', 'game003', '0', '2014-09-17 17:14:54');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('481', 'game003', '0', '2014-09-17 17:37:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('482', 'game003', '0', '2014-09-17 17:42:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('483', 'game003', '0', '2014-09-17 17:47:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('484', 'game003', '0', '2014-09-17 17:52:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('485', 'game003', '0', '2014-09-17 17:57:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('486', 'game003', '0', '2014-09-17 18:02:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('487', 'game003', '0', '2014-09-17 18:07:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('488', 'game003', '0', '2014-09-17 18:12:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('489', 'game003', '0', '2014-09-17 18:17:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('490', 'game003', '0', '2014-09-17 18:22:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('491', 'game003', '0', '2014-09-17 18:27:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('492', 'game003', '0', '2014-09-17 18:32:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('493', 'game003', '0', '2014-09-17 18:37:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('494', 'game003', '0', '2014-09-17 18:42:28');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('495', 'game003', '0', '2014-09-19 10:28:53');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('496', 'game003', '1', '2014-09-19 10:33:53');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('497', 'game003', '1', '2014-09-19 10:38:53');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('498', 'game003', '1', '2014-09-19 10:43:53');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('499', 'game003', '1', '2014-09-19 10:48:53');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('500', 'game003', '0', '2014-09-19 11:21:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('501', 'game003', '0', '2014-09-19 11:26:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('502', 'game003', '0', '2014-09-19 11:31:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('503', 'game003', '0', '2014-09-19 11:36:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('504', 'game003', '0', '2014-09-19 11:41:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('505', 'game003', '0', '2014-09-19 11:46:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('506', 'game003', '1', '2014-09-19 11:51:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('507', 'game003', '1', '2014-09-19 11:56:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('508', 'game003', '1', '2014-09-19 12:01:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('509', 'game003', '0', '2014-09-19 12:14:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('510', 'game003', '0', '2014-09-19 12:19:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('511', 'game003', '0', '2014-09-19 12:24:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('512', 'game003', '0', '2014-09-19 12:29:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('513', 'game003', '0', '2014-09-19 12:34:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('514', 'game003', '0', '2014-09-19 12:39:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('515', 'game003', '0', '2014-09-19 12:44:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('516', 'game003', '0', '2014-09-19 12:49:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('517', 'game003', '0', '2014-09-19 12:54:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('518', 'game003', '0', '2014-09-19 12:59:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('519', 'game003', '0', '2014-09-19 13:04:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('520', 'game003', '0', '2014-09-19 13:09:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('521', 'game003', '0', '2014-09-19 13:14:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('522', 'game003', '0', '2014-09-19 13:19:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('523', 'game003', '0', '2014-09-19 13:24:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('524', 'game003', '0', '2014-09-19 13:29:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('525', 'game003', '0', '2014-09-19 13:34:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('526', 'game003', '0', '2014-09-19 13:39:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('527', 'game003', '0', '2014-09-19 13:44:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('528', 'game003', '0', '2014-09-19 13:49:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('529', 'game003', '0', '2014-09-19 13:54:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('530', 'game003', '0', '2014-09-19 13:59:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('531', 'game003', '1', '2014-09-19 14:06:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('532', 'game003', '1', '2014-09-19 14:11:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('533', 'game003', '1', '2014-09-19 14:16:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('534', 'game003', '1', '2014-09-19 14:21:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('535', 'game003', '1', '2014-09-19 14:26:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('536', 'game003', '1', '2014-09-19 14:31:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('537', 'game003', '1', '2014-09-19 14:36:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('538', 'game003', '1', '2014-09-19 14:55:48');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('539', 'game003', '0', '2014-09-19 15:03:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('540', 'game003', '0', '2014-09-19 15:08:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('541', 'game003', '1', '2014-09-19 15:13:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('542', 'game003', '2', '2014-09-19 15:18:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('543', 'game003', '2', '2014-09-19 15:23:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('544', 'game003', '2', '2014-09-19 15:28:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('545', 'game003', '2', '2014-09-19 15:33:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('546', 'game003', '1', '2014-09-19 15:38:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('547', 'game003', '1', '2014-09-19 15:43:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('548', 'game003', '2', '2014-09-19 15:48:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('549', 'game003', '2', '2014-09-19 15:53:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('550', 'game003', '1', '2014-09-19 16:10:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('551', 'game003', '0', '2014-09-19 16:15:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('552', 'game003', '0', '2014-09-19 16:20:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('553', 'game003', '0', '2014-09-19 16:25:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('554', 'game003', '0', '2014-09-19 16:30:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('555', 'game003', '0', '2014-09-19 16:35:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('556', 'game003', '0', '2014-09-19 16:40:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('557', 'game003', '0', '2014-09-19 16:45:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('558', 'game003', '0', '2014-09-19 16:50:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('559', 'game003', '0', '2014-09-19 16:55:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('560', 'game003', '0', '2014-09-19 17:00:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('561', 'game003', '0', '2014-09-19 17:05:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('562', 'game003', '1', '2014-09-19 17:10:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('563', 'game003', '0', '2014-09-19 17:15:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('564', 'game003', '0', '2014-09-19 17:20:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('565', 'game003', '1', '2014-09-19 17:25:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('566', 'game003', '1', '2014-09-19 17:30:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('567', 'game003', '0', '2014-09-19 17:35:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('568', 'game003', '1', '2014-09-19 17:40:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('569', 'game003', '0', '2014-09-19 17:45:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('570', 'game003', '0', '2014-09-19 17:50:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('571', 'game003', '1', '2014-09-19 17:55:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('572', 'game003', '1', '2014-09-19 18:00:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('573', 'game003', '1', '2014-09-19 18:05:10');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('574', 'game003', '1', '2014-09-22 13:54:06');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('575', 'game003', '1', '2014-09-22 14:07:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('576', 'game003', '1', '2014-09-22 14:12:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('577', 'game003', '1', '2014-09-22 14:17:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('578', 'game003', '1', '2014-09-22 14:22:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('579', 'game003', '1', '2014-09-22 14:27:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('580', 'game003', '1', '2014-09-22 14:32:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('581', 'game003', '1', '2014-09-22 14:37:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('582', 'game003', '1', '2014-09-22 14:42:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('583', 'game003', '1', '2014-09-22 14:47:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('584', 'game003', '1', '2014-09-22 14:52:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('585', 'game003', '1', '2014-09-22 14:57:34');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('586', 'game003', '0', '2014-09-22 15:13:11');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('587', 'game003', '0', '2014-09-22 16:09:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('588', 'game003', '0', '2014-09-22 16:14:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('589', 'game003', '0', '2014-09-22 16:19:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('590', 'game003', '0', '2014-09-22 16:24:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('591', 'game003', '0', '2014-09-22 16:29:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('592', 'game003', '0', '2014-09-22 16:34:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('593', 'game003', '0', '2014-09-22 16:39:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('594', 'game003', '0', '2014-09-22 16:44:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('595', 'game003', '0', '2014-09-22 16:49:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('596', 'game003', '0', '2014-09-22 16:54:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('597', 'game003', '0', '2014-09-22 16:59:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('598', 'game003', '0', '2014-09-22 17:04:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('599', 'game003', '0', '2014-09-22 17:09:15');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('600', 'game003', '1', '2014-09-22 17:41:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('601', 'game003', '1', '2014-09-22 17:46:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('602', 'game003', '1', '2014-09-22 17:51:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('603', 'game003', '1', '2014-09-22 17:56:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('604', 'game003', '1', '2014-09-22 18:01:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('605', 'game003', '1', '2014-09-22 18:06:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('606', 'game003', '1', '2014-09-22 18:11:18');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('607', 'game003', '1', '2014-09-22 18:29:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('608', 'game003', '0', '2014-09-22 18:34:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('609', 'game003', '0', '2014-09-22 18:39:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('610', 'game003', '0', '2014-09-22 18:44:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('611', 'game003', '0', '2014-09-22 18:49:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('612', 'game003', '0', '2014-09-22 18:54:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('613', 'game003', '0', '2014-09-22 18:59:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('614', 'game003', '0', '2014-09-22 19:04:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('615', 'game003', '0', '2014-09-22 19:09:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('616', 'game003', '0', '2014-09-22 19:14:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('617', 'game003', '0', '2014-09-22 19:19:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('618', 'game003', '0', '2014-09-22 19:24:46');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('619', 'game003', '0', '2014-09-23 09:53:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('620', 'game003', '0', '2014-09-23 09:58:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('621', 'game003', '0', '2014-09-23 10:03:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('622', 'game003', '0', '2014-09-23 10:08:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('623', '1', '0', '2014-09-24 17:31:49');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('624', '1', '0', '2014-09-24 17:36:49');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('625', '1', '0', '2014-09-24 17:41:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('626', '1', '0', '2014-09-24 17:46:50');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('627', '1', '1', '2014-09-26 09:39:12');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('628', '1', '1', '2014-09-26 09:44:12');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('629', '1', '5', '2014-09-26 09:51:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('630', '1', '6', '2014-09-26 09:56:29');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('631', '1', '6', '2014-09-26 10:16:45');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('632', '1', '6', '2014-09-26 10:21:45');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('633', '1', '6', '2014-09-26 10:26:45');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('634', '1', '6', '2014-09-26 10:31:45');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('635', '1', '6', '2014-09-26 10:38:14');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('636', '1', '6', '2014-09-26 10:43:14');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('637', '1', '0', '2014-09-26 11:27:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('638', '1', '0', '2014-09-26 11:32:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('639', '1', '0', '2014-09-26 11:37:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('640', '1', '0', '2014-09-26 11:42:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('641', '1', '0', '2014-09-26 11:47:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('642', '1', '0', '2014-09-26 11:52:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('643', '1', '0', '2014-09-26 11:57:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('644', '1', '0', '2014-09-26 12:02:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('645', '1', '0', '2014-09-26 12:07:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('646', '1', '0', '2014-09-26 12:12:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('647', '1', '0', '2014-09-26 12:17:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('648', '1', '0', '2014-09-26 12:22:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('649', '1', '0', '2014-09-26 12:27:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('650', '1', '0', '2014-09-26 12:32:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('651', '1', '0', '2014-09-26 12:37:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('652', '1', '0', '2014-09-26 12:42:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('653', '1', '0', '2014-09-26 12:47:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('654', '1', '0', '2014-09-26 12:52:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('655', '1', '0', '2014-09-26 12:57:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('656', '1', '0', '2014-09-26 13:02:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('657', '1', '0', '2014-09-26 13:07:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('658', '1', '0', '2014-09-26 13:12:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('659', '1', '0', '2014-09-26 13:17:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('660', '1', '0', '2014-09-26 13:22:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('661', '1', '0', '2014-09-26 13:27:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('662', '1', '0', '2014-09-26 13:32:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('663', '1', '0', '2014-09-26 13:37:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('664', '1', '0', '2014-09-26 13:42:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('665', '1', '0', '2014-09-26 13:47:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('666', '1', '0', '2014-09-26 13:52:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('667', '1', '0', '2014-09-26 13:57:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('668', '1', '0', '2014-09-26 14:02:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('669', '1', '0', '2014-09-26 14:07:44');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('670', '1', '0', '2014-09-26 14:16:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('671', '1', '0', '2014-09-26 14:21:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('672', '1', '0', '2014-09-26 14:26:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('673', '1', '0', '2014-09-26 14:31:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('674', '1', '0', '2014-09-26 14:36:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('675', '1', '0', '2014-09-26 14:41:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('676', '1', '0', '2014-09-26 14:46:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('677', '1', '0', '2014-09-26 14:51:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('678', '1', '0', '2014-09-26 14:56:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('679', '1', '0', '2014-09-26 15:01:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('680', '1', '0', '2014-09-26 15:06:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('681', '1', '0', '2014-09-26 15:11:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('682', '1', '0', '2014-09-26 15:16:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('683', '1', '0', '2014-09-26 15:21:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('684', '1', '0', '2014-09-26 15:26:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('685', '1', '0', '2014-09-26 15:31:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('686', '1', '0', '2014-09-26 15:36:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('687', '1', '0', '2014-09-26 15:41:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('688', '1', '0', '2014-09-26 15:46:21');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('689', '1', '0', '2014-09-26 15:57:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('690', '1', '0', '2014-09-26 16:02:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('691', '1', '0', '2014-09-26 16:07:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('692', '1', '0', '2014-09-26 16:12:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('693', '1', '0', '2014-09-26 16:17:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('694', '1', '0', '2014-09-26 16:22:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('695', '1', '0', '2014-09-26 16:27:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('696', '1', '0', '2014-09-26 16:32:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('697', '1', '0', '2014-09-26 16:37:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('698', '1', '0', '2014-09-26 16:42:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('699', '1', '0', '2014-09-26 16:47:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('700', '1', '0', '2014-09-26 16:52:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('701', '1', '0', '2014-09-26 16:57:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('702', '1', '0', '2014-09-26 17:02:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('703', '1', '0', '2014-09-26 17:07:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('704', '1', '0', '2014-09-26 17:12:26');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('705', '1', '0', '2014-09-28 13:43:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('706', '1', '0', '2014-09-28 13:48:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('707', '1', '0', '2014-09-28 13:53:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('708', '1', '0', '2014-09-28 13:58:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('709', '1', '0', '2014-09-28 14:03:19');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('710', '1', '1', '2014-09-28 14:13:30');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('711', '1', '0', '2014-09-28 14:18:30');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('712', '1', '1', '2014-09-28 14:23:30');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('713', '1', '1', '2014-09-28 14:28:30');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('714', '1', '0', '2014-09-28 14:33:30');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('715', '1', '0', '2014-09-28 14:38:30');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('716', '1', '0', '2014-09-28 14:43:31');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('717', '1', '0', '2014-09-28 14:48:31');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('718', '1', '0', '2014-09-28 14:53:31');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('719', '1', '0', '2014-09-28 14:59:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('720', '1', '0', '2014-09-28 15:04:56');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('721', '1', '0', '2014-09-28 15:16:08');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('722', '1', '0', '2014-09-28 15:24:27');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('723', '1', '0', '2014-09-28 15:32:57');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('724', '1', '0', '2014-09-28 15:41:05');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('725', '1', '0', '2014-09-28 15:46:05');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('726', '1', '0', '2014-09-28 15:53:59');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('727', '1', '0', '2014-09-28 16:12:30');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('728', '1', '0', '2014-09-28 16:24:36');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('729', '1', '0', '2014-09-28 16:33:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('730', '1', '0', '2014-09-28 16:38:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('731', '1', '0', '2014-09-28 16:43:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('732', '1', '0', '2014-09-28 16:48:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('733', '1', '0', '2014-09-28 16:53:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('734', '1', '0', '2014-09-28 16:58:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('735', '1', '0', '2014-09-28 17:03:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('736', '1', '1', '2014-09-28 17:08:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('737', '1', '1', '2014-09-28 17:13:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('738', '1', '1', '2014-09-28 17:18:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('739', '1', '1', '2014-09-28 17:23:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('740', '1', '1', '2014-09-28 17:28:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('741', '1', '1', '2014-09-28 17:33:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('742', '1', '1', '2014-09-28 17:38:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('743', '1', '0', '2014-09-28 17:43:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('744', '1', '0', '2014-09-28 17:48:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('745', '1', '0', '2014-09-28 17:53:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('746', '1', '0', '2014-09-28 17:58:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('747', '1', '0', '2014-09-28 18:03:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('748', '1', '0', '2014-09-28 18:08:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('749', '1', '0', '2014-09-28 18:13:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('750', '1', '0', '2014-09-28 18:18:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('751', '1', '0', '2014-09-28 18:23:20');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('752', '1', '0', '2014-09-28 18:34:58');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('753', '1', '0', '2014-09-28 18:39:58');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('754', '1', '0', '2014-09-28 18:44:58');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('755', '1', '0', '2014-09-28 18:49:58');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('756', '1', '0', '2014-09-28 18:54:58');
INSERT INTO `op_oss_qlz_onlinecur_log` VALUES ('757', '1', '0', '2014-09-28 18:59:58');

-- ----------------------------
-- Table structure for op_oss_qlz_out_log
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_out_log`;
CREATE TABLE `op_oss_qlz_out_log` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `worldid` varchar(20) DEFAULT NULL,
  `userip` varchar(20) DEFAULT NULL,
  `outtime` varchar(20) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `onlinetime` int(11) DEFAULT '0' COMMENT '分钟',
  `level` int(11) DEFAULT '1',
  `rolename` varchar(50) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  `vipgrade` int(11) DEFAULT '0',
  `guidenum` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=283 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_qlz_out_log
-- ----------------------------
INSERT INTO `op_oss_qlz_out_log` VALUES ('1', 'game003', '192.168.1.50', '2014-08-21 17:51:58', 'test', '1', '1', '佩恩塔特爾', '2017-06-02 12:47:55', '0', '');
INSERT INTO `op_oss_qlz_out_log` VALUES ('2', 'game003', '192.168.1.50', '2014-08-21 17:52:48', 'test', '1', '1', '佩恩塔特爾', '2017-06-02 12:47:55', '0', '');
INSERT INTO `op_oss_qlz_out_log` VALUES ('3', 'game003', '192.168.1.50', '2014-08-21 17:54:03', 'test', '1', '1', '佩恩塔特爾', '2017-06-02 12:47:56', '0', '');
INSERT INTO `op_oss_qlz_out_log` VALUES ('4', 'game003', '192.168.1.50', '2014-08-21 17:54:52', 'test', '1', '1', '佩恩塔特爾', '2017-06-02 12:47:56', '0', '');
INSERT INTO `op_oss_qlz_out_log` VALUES ('5', 'game003', '192.168.1.50', '2014-08-21 17:57:24', 'test', '1', '1', '佩恩塔特爾', '2017-06-02 12:47:56', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('6', 'game003', '192.168.1.50', '2014-08-21 17:58:34', 'test', '1', '1', '佩恩塔特爾', '2017-06-02 12:47:57', '0', '2@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('7', 'game003', '192.168.1.50', '2014-08-21 17:59:19', 'test', '1', '1', '佩恩塔特爾', '2017-06-02 12:47:57', '0', '2@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('8', 'game003', '192.168.1.50', '2014-08-21 17:59:56', 'Soul', '1', '1', '朗伯斯梅德利', '2017-06-02 12:47:58', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('9', 'game003', '192.168.1.50', '2014-08-21 18:01:10', 'test', '1', '1', '佩恩塔特爾', '2017-06-02 12:47:59', '0', '2@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('10', 'game003', '192.168.1.169', '2014-08-21 18:04:13', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '亚当福克斯', '2017-06-02 12:47:59', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('11', 'game003', '192.168.1.169', '2014-08-21 18:05:35', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '亚当福克斯', '2017-06-02 12:48:02', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('12', 'game003', '192.168.9.238', '2014-08-22 09:42:27', 'test10', '1', '1', '福特邓洛普', '2017-06-02 12:48:02', '0', '');
INSERT INTO `op_oss_qlz_out_log` VALUES ('13', 'game003', '192.168.1.169', '2014-08-22 09:47:36', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '亚当福克斯', '2017-06-02 12:48:02', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('14', 'game003', '192.168.1.169', '2014-08-22 09:49:44', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '亚当福克斯', '2017-06-02 12:48:03', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('15', 'game003', '192.168.1.241', '2014-08-22 09:50:00', 'Soul', '2', '3', '朗伯斯梅德利', '2017-06-02 12:48:04', '0', '4@4');
INSERT INTO `op_oss_qlz_out_log` VALUES ('16', 'game003', '192.168.1.169', '2014-08-22 09:59:18', '145F6553D8D8EBF6130EDC73B4017B5A', '11', '1', '亚当福克斯', '2017-06-02 12:48:05', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('17', 'game003', '192.168.1.169', '2014-08-22 10:03:41', '145F6553D8D8EBF6130EDC73B4017B5A', '4', '1', '亚当福克斯', '2017-06-02 12:48:07', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('18', 'game003', '192.168.1.241', '2014-08-22 10:05:09', 'Soul', '2', '3', '朗伯斯梅德利', '2017-06-02 12:48:07', '0', '12@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('19', 'game003', '192.168.1.169', '2014-08-22 10:06:28', '145F6553D8D8EBF6130EDC73B4017B5A', '2', '1', '亚当福克斯', '2017-06-02 12:48:07', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('20', 'game003', '192.168.1.169', '2014-08-22 10:10:34', '145F6553D8D8EBF6130EDC73B4017B5A', '3', '1', '亚当福克斯', '2017-06-02 12:48:07', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('21', 'game003', '192.168.1.169', '2014-08-22 10:44:18', '145F6553D8D8EBF6130EDC73B4017B5A', '37', '1', '亚当福克斯', '2017-06-02 12:48:08', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('22', 'game003', '192.168.1.169', '2014-08-22 10:44:18', '145F6553D8D8EBF6130EDC73B4017B5A', '37', '1', '亚当福克斯', '2017-06-02 12:48:08', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('23', 'game003', '192.168.1.169', '2014-08-22 10:44:20', 'sad', '1', '1', 'sad', '2017-06-02 12:48:08', '0', '');
INSERT INTO `op_oss_qlz_out_log` VALUES ('24', 'game003', '192.168.1.241', '2014-08-22 10:44:21', 'Soul', '41', '3', '朗伯斯梅德利', '2017-06-02 12:48:08', '0', '12@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('25', 'game003', '192.168.1.241', '2014-08-22 11:09:01', 'Soul', '1', '3', '朗伯斯梅德利', '2017-06-02 12:48:08', '0', '12@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('26', 'game003', '192.168.1.241', '2014-08-22 11:09:22', 'Soul', '1', '3', '朗伯斯梅德利', '2017-06-02 12:48:09', '0', '12@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('27', 'game003', '192.168.1.241', '2014-08-22 11:09:58', 'Soul2222121', '1', '1', '杜邦森次巴立', '2017-06-02 12:48:10', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('28', 'game003', '192.168.1.241', '2014-08-22 11:11:07', 'Soul', '1', '3', '朗伯斯梅德利', '2017-06-02 12:48:10', '0', '12@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('29', 'game003', '192.168.1.241', '2014-08-22 11:12:40', 'Soul', '1', '3', '朗伯斯梅德利', '2017-06-02 12:48:10', '0', '12@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('30', 'game003', '192.168.1.241', '2014-08-22 11:14:30', 'Soul', '2', '3', '朗伯斯梅德利', '2017-06-02 12:48:10', '0', '12@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('31', 'game003', '192.168.1.169', '2014-08-22 11:20:23', 'sad', '1', '1', 'sad', '2017-06-02 12:48:11', '0', '');
INSERT INTO `op_oss_qlz_out_log` VALUES ('32', 'game003', '192.168.1.241', '2014-08-22 11:22:39', 'Soul222c1111', '1', '1', '鲍尔马歇尔', '2017-06-02 12:48:11', '0', '');
INSERT INTO `op_oss_qlz_out_log` VALUES ('33', 'game003', '192.168.1.169', '2014-08-22 11:23:02', 'sad', '1', '1', 'sad', '2017-06-02 12:48:11', '0', '');
INSERT INTO `op_oss_qlz_out_log` VALUES ('34', 'game003', '192.168.1.118', '2014-08-22 11:26:19', '12', '1', '1', '迈卡斯梯尔', '2017-06-02 12:48:11', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('35', 'game003', '192.168.1.118', '2014-08-22 11:31:53', '12', '1', '1', '迈卡斯梯尔', '2017-06-02 12:48:12', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('36', 'game003', '192.168.1.118', '2014-08-22 11:52:14', '129', '1', '1', '萨利道格拉斯', '2017-06-02 12:48:13', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('37', 'game003', '192.168.1.118', '2014-08-22 12:26:44', '1290', '1', '1', '瓦特普赖斯', '2017-06-02 12:48:13', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('38', 'game003', '192.168.1.118', '2014-08-22 12:27:28', '1290', '1', '1', '瓦特普赖斯', '2017-06-02 12:48:14', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('39', 'game003', '192.168.1.118', '2014-08-22 12:28:14', '1290', '1', '1', '瓦特普赖斯', '2017-06-02 12:48:14', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('40', 'game003', '192.168.1.241', '2014-08-22 12:58:06', 'Soul222c1111', '1', '1', '伦敦斯图尔特', '2017-06-02 12:48:15', '0', '16@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('41', 'game003', '192.168.1.241', '2014-08-22 13:00:31', 'Soul', '1', '1', '哈该贾尔斯', '2017-06-02 12:48:15', '0', '16@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('42', 'game003', '192.168.1.169', '2014-08-22 13:39:11', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:15', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('43', 'game003', '192.168.1.169', '2014-08-22 13:39:46', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:16', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('44', 'game003', '192.168.1.169', '2014-08-22 13:40:32', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:16', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('45', 'game003', '192.168.1.169', '2014-08-22 13:40:43', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:16', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('46', 'game003', '192.168.1.169', '2014-08-22 13:42:40', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:17', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('47', 'game003', '192.168.1.169', '2014-08-22 13:43:17', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:17', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('48', 'game003', '192.168.1.169', '2014-08-22 13:43:37', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:17', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('49', 'game003', '192.168.1.169', '2014-08-22 13:43:53', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:17', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('50', 'game003', '192.168.1.169', '2014-08-22 13:44:23', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:18', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('51', 'game003', '192.168.1.241', '2014-08-22 13:54:55', 'test', '3', '3', '沃克瓦格纳', '2017-06-02 12:48:19', '0', '5@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('52', 'game003', '192.168.1.241', '2014-08-22 13:55:22', 'Soul', '1', '1', '哈该贾尔斯', '2017-06-02 12:48:19', '0', '16@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('53', 'game003', '192.168.1.169', '2014-08-22 14:05:58', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:19', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('54', 'game003', '192.168.1.169', '2014-08-22 14:08:48', 'sad', '2', '1', '格斯蒙哥马利', '2017-06-02 12:48:20', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('55', 'game003', '192.168.1.169', '2014-08-22 14:10:45', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:20', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('56', 'game003', '192.168.1.169', '2014-08-22 14:15:32', 'sad', '4', '1', '格斯蒙哥马利', '2017-06-02 12:48:22', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('57', 'game003', '192.168.1.169', '2014-08-22 14:17:09', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:22', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('58', 'game003', '192.168.1.169', '2014-08-22 14:18:36', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:23', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('59', 'game003', '192.168.1.241', '2014-08-22 14:21:00', 'test', '6', '45', '沃克瓦格纳', '2017-06-02 12:48:23', '0', '6@4');
INSERT INTO `op_oss_qlz_out_log` VALUES ('60', 'game003', '192.168.1.169', '2014-08-22 14:31:26', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:24', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('61', 'game003', '192.168.1.169', '2014-08-22 14:33:58', 'sad', '1', '1', '格斯蒙哥马利', '2017-06-02 12:48:32', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('62', 'game003', '192.168.1.241', '2014-08-22 14:46:44', 'test', '15', '45', '沃克瓦格纳', '2017-06-02 12:48:33', '12', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('63', 'game003', '192.168.1.241', '2014-08-22 14:49:17', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:34', '12', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('64', 'game003', '192.168.1.169', '2014-08-22 14:50:10', 'sad', '2', '65', '格斯蒙哥马利', '2017-06-02 12:48:34', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('65', 'game003', '192.168.1.169', '2014-08-22 14:53:15', 'sad', '2', '70', '格斯蒙哥马利', '2017-06-02 12:48:34', '0', '6@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('66', 'game003', '192.168.1.241', '2014-08-22 14:54:49', 'test', '4', '45', '沃克瓦格纳', '2017-06-02 12:48:36', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('67', 'game003', '192.168.1.169', '2014-08-22 14:55:31', 'sad', '1', '70', '格斯蒙哥马利', '2017-06-02 12:48:36', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('68', 'game003', '192.168.1.169', '2014-08-22 14:56:10', 'sad', '1', '70', '格斯蒙哥马利', '2017-06-02 12:48:36', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('69', 'game003', '192.168.1.169', '2014-08-22 14:56:53', 'sad', '1', '70', '格斯蒙哥马利', '2017-06-02 12:48:36', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('70', 'game003', '192.168.1.169', '2014-08-22 15:01:55', 'sad', '1', '70', '格斯蒙哥马利', '2017-06-02 12:48:37', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('71', 'game003', '192.168.1.241', '2014-08-22 15:02:19', 'test', '4', '45', '沃克瓦格纳', '2017-06-02 12:48:37', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('72', 'game003', '192.168.1.169', '2014-08-22 15:03:21', 'sad', '1', '70', '格斯蒙哥马利', '2017-06-02 12:48:37', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('73', 'game003', '192.168.1.241', '2014-08-22 15:06:02', 'test', '2', '45', '沃克瓦格纳', '2017-06-02 12:48:41', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('74', 'game003', '192.168.1.169', '2014-08-22 15:08:24', 'sad', '4', '70', '格斯蒙哥马利', '2017-06-02 12:48:41', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('75', 'game003', '192.168.1.169', '2014-08-22 15:10:13', 'sad', '1', '70', '格斯蒙哥马利', '2017-06-02 12:48:42', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('76', 'game003', '192.168.1.241', '2014-08-22 15:16:32', 'test', '10', '45', '沃克瓦格纳', '2017-06-02 12:48:42', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('77', 'game003', '192.168.1.241', '2014-08-22 15:27:14', 'test', '9', '45', '沃克瓦格纳', '2017-06-02 12:48:42', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('78', 'game003', '192.168.1.169', '2014-08-22 15:46:43', 'sad', '1', '70', '格斯蒙哥马利', '2017-06-02 12:48:44', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('79', 'game003', '192.168.1.241', '2014-08-22 16:11:29', 'test', '5', '45', '沃克瓦格纳', '2017-06-02 12:48:45', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('80', 'game003', '192.168.1.241', '2014-08-22 16:11:55', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:45', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('81', 'game003', '192.168.1.241', '2014-08-22 16:41:43', 'test', '29', '45', '沃克瓦格纳', '2017-06-02 12:48:46', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('82', 'game003', '192.168.1.241', '2014-08-22 16:48:35', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:47', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('83', 'game003', '192.168.1.241', '2014-08-22 16:52:52', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:48', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('84', 'game003', '192.168.1.241', '2014-08-22 16:53:16', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:48', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('85', 'game003', '192.168.1.241', '2014-08-22 16:54:37', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:49', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('86', 'game003', '192.168.1.241', '2014-08-22 16:55:36', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:49', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('87', 'game003', '192.168.1.241', '2014-08-22 16:57:24', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:49', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('88', 'game003', '192.168.1.241', '2014-08-22 16:59:36', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:49', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('89', 'game003', '192.168.1.241', '2014-08-22 17:00:38', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:50', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('90', 'game003', '192.168.1.241', '2014-08-22 17:02:34', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:50', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('91', 'game003', '192.168.1.241', '2014-08-22 17:05:37', 'test', '2', '45', '沃克瓦格纳', '2017-06-02 12:48:51', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('92', 'game003', '192.168.1.241', '2014-08-22 17:06:21', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:51', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('93', 'game003', '192.168.1.241', '2014-08-22 17:09:00', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:51', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('94', 'game003', '192.168.9.238', '2014-08-22 17:13:12', 'test11', '79', '21', '乔尔贝西墨', '2017-06-02 12:48:51', '0', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('95', 'game003', '192.168.1.169', '2014-08-22 17:15:29', 'sad', '2', '70', '格斯蒙哥马利', '2017-06-02 12:48:52', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('96', 'game003', '192.168.1.169', '2014-08-22 17:19:23', 'sad', '1', '70', '格斯蒙哥马利', '2017-06-02 12:48:52', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('97', 'game003', '192.168.1.241', '2014-08-22 17:26:45', 'test', '8', '45', '沃克瓦格纳', '2017-06-02 12:48:52', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('98', 'game003', '192.168.1.241', '2014-08-22 17:31:47', 'test', '4', '45', '沃克瓦格纳', '2017-06-02 12:48:53', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('99', 'game003', '192.168.1.241', '2014-08-22 17:32:37', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:53', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('100', 'game003', '192.168.1.241', '2014-08-22 17:33:10', 'test', '1', '45', '沃克瓦格纳', '2017-06-02 12:48:54', '12', '8@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('101', 'game003', '192.168.1.118', '2014-08-25 10:25:45', '1290', '12', '70', 'sew', '2017-06-02 12:48:58', '0', '26@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('102', 'game003', '192.168.1.118', '2014-08-25 10:31:20', '1290', '2', '70', 'sew', '2017-06-02 12:49:00', '0', '26@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('103', 'game003', '192.168.1.118', '2014-08-25 10:43:03', '1290', '7', '70', 'sew', '2017-06-02 12:49:00', '0', '26@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('104', 'game003', '192.168.1.118', '2014-08-25 11:10:38', '1290', '2', '70', 'sew', '2017-06-02 12:49:02', '0', '8@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('105', 'game003', '192.168.1.118', '2014-08-25 11:12:22', '1290', '1', '70', 'sew', '2017-06-02 12:49:02', '0', '8@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('106', 'game003', '192.168.1.118', '2014-08-25 11:13:57', '1290', '1', '70', 'sew', '2017-06-02 12:49:02', '0', '8@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('107', 'game003', '192.168.1.118', '2014-08-25 11:15:38', '1290', '1', '70', 'sew', '2017-06-02 12:49:02', '0', '8@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('108', 'game003', '192.168.1.118', '2014-08-25 12:05:40', '1290', '10', '70', 'sew', '2017-06-02 12:49:03', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('109', 'game003', '192.168.1.118', '2014-08-25 12:13:28', '1290', '4', '70', 'sew', '2017-06-02 12:49:03', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('110', 'game003', '192.168.1.118', '2014-08-25 12:22:24', '1290', '1', '70', 'sew', '2017-06-02 12:49:04', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('111', 'game003', '192.168.1.118', '2014-08-25 12:24:31', '1290', '1', '70', 'sew', '2017-06-02 12:49:04', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('112', 'game003', '192.168.1.128', '2014-08-25 13:38:23', 'sad', '1', '1', '汤姆劳埃德', '2017-06-02 12:49:04', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('113', 'game003', '192.168.1.128', '2014-08-25 13:38:45', 'sad', '1', '1', '汤姆劳埃德', '2017-06-02 12:49:05', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('114', 'game003', '192.168.1.118', '2014-08-25 13:39:04', '1290', '1', '70', 'sew', '2017-06-02 12:49:05', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('115', 'game003', '192.168.1.128', '2014-08-25 13:39:29', 'sad', '1', '1', '汤姆劳埃德', '2017-06-02 12:49:05', '0', '1@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('116', 'game003', '192.168.1.128', '2014-08-25 13:41:34', 'sad', '1', '1', '汤姆劳埃德', '2017-06-02 12:49:05', '0', '1@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('117', 'game003', '192.168.1.128', '2014-08-25 13:44:57', 'sad', '1', '1', '汤姆劳埃德', '2017-06-02 12:49:06', '0', '1@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('118', 'game003', '192.168.1.128', '2014-08-25 14:02:09', 'sad', '17', '1', '汤姆劳埃德', '2017-06-02 12:49:16', '0', '6@4');
INSERT INTO `op_oss_qlz_out_log` VALUES ('119', 'game003', '192.168.1.128', '2014-08-25 14:02:44', 'sad', '1', '1', '汤姆劳埃德', '2017-06-02 12:49:16', '0', '6@4');
INSERT INTO `op_oss_qlz_out_log` VALUES ('120', 'game003', '192.168.1.128', '2014-08-25 14:06:05', 'sad', '2', '1', '汤姆劳埃德', '2017-06-02 12:49:23', '0', '6@4');
INSERT INTO `op_oss_qlz_out_log` VALUES ('121', 'game003', '192.168.1.128', '2014-08-25 14:07:40', 'sad', '1', '1', '汤姆劳埃德', '2017-06-02 12:49:25', '0', '6@4');
INSERT INTO `op_oss_qlz_out_log` VALUES ('122', 'game003', '192.168.1.118', '2014-08-25 14:14:03', '1290', '29', '70', 'sew', '2017-06-02 12:49:25', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('123', 'game003', '192.168.1.118', '2014-08-25 14:25:57', '1290', '9', '70', 'sew', '2017-06-02 12:49:26', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('124', 'game003', '192.168.1.118', '2014-08-25 14:27:20', '1290', '1', '70', 'sew', '2017-06-02 12:49:26', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('125', 'game003', '192.168.1.118', '2014-08-25 14:30:11', '1290', '1', '70', 'sew', '2017-06-02 12:49:26', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('126', 'game003', '192.168.1.118', '2014-08-25 14:31:39', '1290', '1', '70', 'sew', '2017-06-02 12:49:27', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('127', 'game003', '192.168.1.118', '2014-08-25 14:32:19', '1290', '1', '70', 'sew', '2017-06-02 12:49:28', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('128', 'game003', '192.168.1.118', '2014-08-25 14:33:56', '1290', '1', '70', 'sew', '2017-06-02 12:49:28', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('129', 'game003', '192.168.1.128', '2014-08-25 14:34:05', '1290', '1', '70', 'sew', '2017-06-02 12:49:28', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('130', 'game003', '192.168.1.128', '2014-08-25 14:38:32', '1290', '1', '70', 'sew', '2017-06-02 12:49:29', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('131', 'game003', '192.168.1.118', '2014-08-25 14:46:34', '1290', '1', '70', 'sew', '2017-06-02 12:49:30', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('132', 'game003', '192.168.1.241', '2014-08-25 14:48:44', 'test', '1', '1', '波普麦金托什', '2017-06-02 12:49:30', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('133', 'game003', '192.168.1.241', '2014-08-25 14:50:13', 'test', '1', '1', '波普麦金托什', '2017-06-02 12:49:30', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('134', 'game003', '192.168.1.241', '2014-08-25 14:51:51', 'test', '1', '1', '波普麦金托什', '2017-06-02 12:49:30', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('135', 'game003', '192.168.1.118', '2014-08-25 14:54:59', '1290', '8', '70', 'sew', '2017-06-02 12:49:31', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('136', 'game003', '192.168.1.241', '2014-08-25 14:55:19', 'test', '1', '1', '波普麦金托什', '2017-06-02 12:49:31', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('137', 'game003', '192.168.1.118', '2014-08-25 14:57:17', 'test', '1', '1', '波普麦金托什', '2017-06-02 12:49:32', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('138', 'game003', '192.168.1.118', '2014-08-25 14:58:03', '12900', '2', '1', '拉金罗伯逊', '2017-06-02 12:49:32', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('139', 'game003', '192.168.1.241', '2014-08-25 15:00:24', 'test', '1', '1', '波普麦金托什', '2017-06-02 12:49:32', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('140', 'game003', '192.168.1.128', '2014-08-25 17:35:28', 'EA29906FEE97799837A8F0C63035F62E', '0', '70', '薇微笑', '2017-06-02 12:49:33', '10', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('141', 'game003', '192.168.1.128', '2014-08-25 17:36:09', 'EA29906FEE97799837A8F0C63035F62E', '0', '70', '薇微笑', '2017-06-02 12:49:33', '10', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('142', 'game003', '192.168.1.128', '2014-08-25 17:37:45', 'EA29906FEE97799837A8F0C63035F62E', '0', '70', '薇微笑', '2017-06-02 12:49:33', '10', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('143', 'game003', '192.168.1.128', '2014-08-25 17:39:55', 'EA29906FEE97799837A8F0C63035F62E', '0', '70', '薇微笑', '2017-06-02 12:49:33', '10', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('144', 'game003', '192.168.1.128', '2014-08-25 17:51:55', 'EA29906FEE97799837A8F0C63035F62E', '1', '70', '薇微笑', '2017-06-02 12:49:33', '10', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('145', 'game003', '192.168.1.118', '2014-08-26 09:50:14', '1290', '5', '70', 'fff', '2017-06-02 12:49:35', '8', '8@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('146', 'game003', '192.168.1.118', '2014-08-26 16:54:34', '1290', '1', '70', 'fff', '2017-06-02 12:49:35', '8', '9@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('147', 'game003', '192.168.1.118', '2014-08-28 21:40:17', 'sa1', '0', '40', 'sa1', '2017-06-02 12:49:36', '9', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('148', 'game003', '192.168.1.118', '2014-08-28 22:07:35', 'sa1', '9', '40', 'sa1', '2017-06-02 12:49:36', '9', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('149', 'game003', '192.168.1.118', '2014-08-28 22:21:49', 'yuchangmei12', '3', '35', '罗素佩兴斯', '2017-06-02 12:49:36', '12', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('150', 'game003', '192.168.1.118', '2014-08-29 00:06:19', 'sa123456', '2', '1', '拉金詹姆斯', '2017-06-02 12:49:43', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('151', 'game003', '192.168.1.118', '2014-08-29 00:21:14', 'sa123456', '2', '1', '拉金詹姆斯', '2017-06-02 12:49:43', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('152', 'game003', '192.168.1.118', '2014-08-29 00:28:43', 'sa123456', '1', '1', '拉金詹姆斯', '2017-06-02 12:49:43', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('153', 'game003', '192.168.1.118', '2014-08-29 00:32:51', 'sa123456', '4', '1', '拉金詹姆斯', '2017-06-02 12:49:44', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('154', 'game003', '192.168.1.118', '2014-08-29 00:34:58', 'sa123456', '2', '1', '拉金詹姆斯', '2017-06-02 12:49:44', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('155', 'game003', '192.168.1.118', '2014-08-29 00:48:43', 'sa123456', '1', '1', '佩特巴特勒', '2017-06-02 12:49:44', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('156', 'game003', '192.168.1.118', '2014-08-29 00:49:08', 'sa123456', '1', '1', '佩特巴特勒', '2017-06-02 12:49:45', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('157', 'game003', '192.168.1.118', '2014-08-29 00:52:14', 'sa1234567', '2', '1', '迪福拉瑟福德', '2017-06-02 12:49:46', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('158', 'game003', '192.168.1.118', '2014-08-29 12:13:17', '1', '1', '1', '凯雷朗费罗', '2017-06-02 12:49:48', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('159', 'game003', '192.168.1.118', '2014-08-29 12:32:14', '1', '18', '2', '休詹理斯', '2017-06-02 12:49:53', '12', '2@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('160', 'game003', '192.168.1.118', '2014-08-29 12:32:14', '2', '16', '1', '哈该哈伯德', '2017-06-02 12:49:53', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('161', 'game003', '192.168.1.118', '2014-08-29 12:32:14', '3', '14', '1', '乔丹白壁德', '2017-06-02 12:49:53', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('162', 'game003', '192.168.1.118', '2014-08-29 12:32:14', '4', '11', '1', '鲍勃托因比', '2017-06-02 12:49:54', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('163', 'game003', '192.168.1.118', '2014-08-29 12:32:14', '5', '9', '1', '卡特霍尔特', '2017-06-02 12:49:54', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('164', 'game003', '192.168.1.118', '2014-08-29 12:32:14', '6', '8', '1', '哈尔希克斯', '2017-06-02 12:49:54', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('165', 'game003', '192.168.1.118', '2014-08-29 12:32:14', '7', '7', '1', '卡尔威克利夫', '2017-06-02 12:49:54', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('166', 'game003', '192.168.1.118', '2014-08-29 12:32:14', '8', '6', '1', '哈该利奥波德', '2017-06-02 12:49:54', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('167', 'game003', '192.168.1.118', '2014-08-29 12:32:15', '9', '5', '1', '杰米鲍德温', '2017-06-02 12:49:55', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('168', 'game003', '192.168.1.118', '2014-08-29 12:32:15', '10', '4', '1', '罗斯克洛宁', '2017-06-02 12:49:55', '12', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('169', 'game003', '192.168.1.128', '2014-08-30 15:43:29', 'EA29906FEE97799837A8F0C63035F62E', '1', '1', '斯诺森次巴立', '2017-06-02 12:49:58', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('170', 'game003', '192.168.1.128', '2014-08-30 15:45:59', 'EA29906FEE97799837A8F0C63035F62E', '1', '1', '斯诺森次巴立', '2017-06-02 12:49:58', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('171', 'game003', '192.168.1.128', '2014-08-30 15:49:49', 'sad', '1', '1', '埃文哈罗德', '2017-06-02 12:49:59', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('172', 'game003', '192.168.1.241', '2014-08-30 16:05:24', 'sa', '1', '1', '巴尼比勒尔', '2017-06-02 12:49:59', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('173', 'game003', '192.168.1.128', '2014-08-30 16:18:27', '234', '2', '1', '摩利安東尼', '2017-06-02 12:49:59', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('174', 'game003', '192.168.1.128', '2014-08-30 16:21:02', '234', '1', '1', '摩利安東尼', '2017-06-02 12:49:59', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('175', 'game003', '192.168.1.128', '2014-08-30 16:25:23', '234', '2', '1', '摩利安東尼', '2017-06-02 12:50:00', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('176', 'game003', '192.168.1.128', '2014-08-30 16:25:58', '234', '1', '1', '摩利安東尼', '2017-06-02 12:50:00', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('177', 'game003', '192.168.1.128', '2014-08-30 16:29:46', '234', '1', '1', '摩利安東尼', '2017-06-02 12:50:01', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('178', 'game003', '192.168.1.128', '2014-08-30 16:30:31', '234', '1', '1', '摩利安東尼', '2017-06-02 12:50:01', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('179', 'game003', '192.168.1.128', '2014-08-30 16:33:18', '234', '2', '1', '摩利安東尼', '2017-06-02 12:50:01', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('180', 'game003', '192.168.1.128', '2014-08-30 16:34:14', '234', '1', '1', '摩利安東尼', '2017-06-02 12:50:01', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('181', 'game003', '192.168.1.128', '2014-08-30 16:50:42', 'EA29906FEE97799837A8F0C63035F62E', '1', '1', '斯诺森次巴立', '2017-06-02 12:50:02', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('182', 'game003', '192.168.1.128', '2014-08-30 17:06:04', '234', '14', '1', '摩利安東尼', '2017-06-02 12:50:02', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('183', 'game003', '192.168.1.128', '2014-08-30 17:08:58', '234', '2', '1', '摩利安東尼', '2017-06-02 12:50:03', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('184', 'game003', '192.168.1.128', '2014-08-30 17:09:42', '234', '1', '1', '摩利安東尼', '2017-06-02 12:50:04', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('185', 'game003', '192.168.1.118', '2014-09-03 14:10:28', '0', '1', '1', '霍普鲁道夫', '2017-06-02 12:50:05', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('186', 'game003', '192.168.1.118', '2014-09-03 14:12:08', '0', '1', '1', '霍普鲁道夫', '2017-06-02 12:50:05', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('187', 'game003', '192.168.1.118', '2014-09-03 14:15:39', '0', '3', '1', '霍普鲁道夫', '2017-06-02 12:50:05', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('188', 'game003', '192.168.1.118', '2014-09-03 14:48:30', '1', '7332', '2', '休詹理斯', '2017-06-02 12:50:06', '12', '2@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('189', 'game003', '192.168.1.241', '2014-09-04 18:29:06', 'test', '1', '1', '鄧巴赫士列特', '2017-06-02 12:50:09', '0', '');
INSERT INTO `op_oss_qlz_out_log` VALUES ('190', 'game003', '192.168.1.241', '2014-09-04 18:33:49', '2033648', '0', '35', '科菲莫特利', '2017-06-02 12:50:09', '3', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('191', 'game003', '192.168.1.241', '2014-09-04 18:34:42', 'test', '1', '1', '鄧巴赫士列特', '2017-06-02 12:50:09', '0', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('192', 'game003', '192.168.1.241', '2014-09-04 18:35:22', '2033648', '1', '35', '科菲莫特利', '2017-06-02 12:50:11', '3', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('193', 'game003', '192.168.1.241', '2014-09-04 18:37:53', '2033648', '2', '35', '科菲莫特利', '2017-06-02 12:50:11', '3', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('194', 'game003', '192.168.1.88', '2014-09-04 19:08:19', '43', '1', '1', '贾德鲍德温', '2017-06-02 12:50:11', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('195', 'game003', '192.168.1.118', '2014-09-10 17:15:19', '1', '1', '2', '嘛的', '2017-06-02 12:50:12', '0', '2@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('196', 'game003', '192.168.1.118', '2014-09-10 17:24:07', '1', '2', '65', '嘛的', '2017-06-02 12:50:13', '3', '2@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('197', 'game003', '192.168.1.118', '2014-09-10 17:56:37', '1', '2', '65', '嘛的', '2017-06-02 12:50:14', '3', '5@3');
INSERT INTO `op_oss_qlz_out_log` VALUES ('198', 'game003', '192.168.1.118', '2014-09-11 17:58:37', '14', '1', '1', '芬恩布赖斯', '2017-06-02 12:50:16', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('199', 'game003', '192.168.1.118', '2014-09-11 18:00:02', '4545645', '2', '1', '斯托克罗夫特', '2017-06-02 12:50:16', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('200', 'game003', '192.168.1.118', '2014-09-11 18:02:35', '14', '3', '8', '芬恩布赖斯', '2017-06-02 12:50:16', '0', '9@3');
INSERT INTO `op_oss_qlz_out_log` VALUES ('201', 'game003', '192.168.1.118', '2014-09-11 18:03:28', '14', '1', '8', '芬恩布赖斯', '2017-06-02 12:50:16', '0', '9@3');
INSERT INTO `op_oss_qlz_out_log` VALUES ('202', 'game003', '192.168.1.118', '2014-09-12 12:07:39', '14', '4', '8', '芬恩布赖斯', '2017-06-02 12:50:17', '0', '9@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('203', 'game003', '192.168.1.118', '2014-09-12 14:27:56', '14', '144', '8', '芬恩布赖斯', '2017-06-02 12:50:18', '0', '9@5');
INSERT INTO `op_oss_qlz_out_log` VALUES ('204', 'game003', '192.168.1.118', '2014-09-12 15:53:21', 'E4EF6792D38354EC67DAB4087245AD96', '2', '70', '无赖', '2017-06-02 12:50:19', '4', '12@6');
INSERT INTO `op_oss_qlz_out_log` VALUES ('205', 'game003', '192.168.1.118', '2014-09-12 15:58:08', 'E4EF6792D38354EC67DAB4087245AD96', '2', '70', '无赖', '2017-06-02 12:50:19', '4', '12@6');
INSERT INTO `op_oss_qlz_out_log` VALUES ('206', 'game003', '192.168.1.118', '2014-09-16 10:16:56', '1', '6', '45', '在要', '2017-06-02 12:50:20', '9', '2@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('207', 'game003', '192.168.1.118', '2014-09-16 10:17:26', '1', '1', '45', '在要', '2017-06-02 12:50:20', '9', '2@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('208', 'game003', '192.168.1.118', '2014-09-16 10:17:54', '1', '1', '45', '在要', '2017-06-02 12:50:20', '9', '2@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('209', 'game003', '192.168.1.118', '2014-09-16 10:18:40', '1', '1', '45', '在要', '2017-06-02 12:50:22', '9', '2@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('210', 'game003', '192.168.1.118', '2014-09-16 12:07:43', '1', '108', '45', '在要', '2017-06-02 12:50:23', '9', '2@1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('211', 'game003', '192.168.1.118', '2014-09-16 17:40:06', '2', '447', '1', '尤尔富兰克林', '2017-06-02 12:50:25', '0', '1@2');
INSERT INTO `op_oss_qlz_out_log` VALUES ('212', 'game003', '192.168.1.118', '2014-09-17 16:55:33', '11', '1', '1', '休爱迪生', '2017-06-02 12:50:26', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('213', 'game003', '192.168.1.118', '2014-09-17 17:00:48', '11', '1', '1', '休爱迪生', '2017-06-02 12:50:26', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('214', 'game003', '192.168.1.118', '2014-09-17 17:33:43', '11', '1', '1', '休爱迪生', '2017-06-02 12:50:27', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('215', 'game003', '192.168.1.118', '2014-09-17 18:26:33', '11', '1', '1', '休爱迪生', '2017-06-02 12:50:27', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('216', 'game003', '192.168.1.128', '2014-09-19 14:45:21', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:30', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('217', 'game003', '192.168.1.128', '2014-09-19 14:55:13', '145F6553D8D8EBF6130EDC73B4017B5A', '3', '1', '特里艾迪生', '2017-06-02 12:50:31', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('218', 'game003', '192.168.1.128', '2014-09-19 14:58:48', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:32', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('219', 'game003', '192.168.1.128', '2014-09-19 14:59:29', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:33', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('220', 'game003', '192.168.1.128', '2014-09-19 15:01:14', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:33', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('221', 'game003', '192.168.1.128', '2014-09-19 15:02:50', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:33', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('222', 'game003', '192.168.1.128', '2014-09-19 15:04:07', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:34', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('223', 'game003', '192.168.1.128', '2014-09-19 15:05:01', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:34', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('224', 'game003', '192.168.1.128', '2014-09-19 15:07:51', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:34', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('225', 'game003', '192.168.1.128', '2014-09-19 15:08:53', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:34', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('226', 'game003', '192.168.1.118', '2014-09-19 15:11:43', '459742', '1', '58', '媽媽咪呀', '2017-06-02 12:50:34', '6', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('227', 'game003', '192.168.1.128', '2014-09-19 15:21:45', '145F6553D8D8EBF6130EDC73B4017B5A', '3', '1', '特里艾迪生', '2017-06-02 12:50:35', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('228', 'game003', '192.168.1.128', '2014-09-19 15:22:19', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:35', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('229', 'game003', '192.168.1.128', '2014-09-19 15:24:42', '145F6553D8D8EBF6130EDC73B4017B5A', '2', '1', '特里艾迪生', '2017-06-02 12:50:35', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('230', 'game003', '192.168.1.128', '2014-09-19 15:26:51', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:36', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('231', 'game003', '192.168.1.128', '2014-09-19 15:27:36', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:36', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('232', 'game003', '192.168.1.128', '2014-09-19 15:28:58', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:36', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('233', 'game003', '192.168.1.128', '2014-09-19 15:31:18', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:37', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('234', 'game003', '192.168.1.128', '2014-09-19 15:32:18', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:37', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('235', 'game003', '192.168.1.128', '2014-09-19 15:37:52', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:38', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('236', 'game003', '192.168.1.128', '2014-09-19 15:40:38', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:39', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('237', 'game003', '192.168.1.128', '2014-09-19 15:41:37', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:39', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('238', 'game003', '192.168.1.128', '2014-09-19 15:42:17', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:39', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('239', 'game003', '192.168.1.128', '2014-09-19 15:46:53', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:39', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('240', 'game003', '192.168.1.128', '2014-09-19 15:51:12', '145F6553D8D8EBF6130EDC73B4017B5A', '3', '1', '特里艾迪生', '2017-06-02 12:50:41', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('241', 'game003', '192.168.1.128', '2014-09-19 15:54:13', '145F6553D8D8EBF6130EDC73B4017B5A', '2', '1', '特里艾迪生', '2017-06-02 12:50:42', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('242', 'game003', '192.168.1.128', '2014-09-19 15:56:44', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:43', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('243', 'game003', '192.168.1.128', '2014-09-19 16:09:28', '145F6553D8D8EBF6130EDC73B4017B5A', '2', '1', '特里艾迪生', '2017-06-02 12:50:46', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('244', 'game003', '192.168.1.128', '2014-09-19 16:09:50', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:46', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('245', 'game003', '192.168.1.128', '2014-09-19 16:11:00', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:46', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('246', 'game003', '192.168.1.128', '2014-09-19 16:11:44', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:51', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('247', 'game003', '192.168.1.128', '2014-09-19 16:20:03', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:52', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('248', 'game003', '192.168.1.128', '2014-09-19 16:21:52', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:53', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('249', 'game003', '192.168.1.128', '2014-09-19 16:42:48', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:54', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('250', 'game003', '192.168.1.128', '2014-09-19 16:47:06', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:54', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('251', 'game003', '192.168.1.128', '2014-09-19 16:48:33', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:55', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('252', 'game003', '192.168.1.128', '2014-09-19 17:08:22', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:55', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('253', 'game003', '192.168.1.128', '2014-09-19 17:10:42', '145F6553D8D8EBF6130EDC73B4017B5A', '2', '1', '特里艾迪生', '2017-06-02 12:50:55', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('254', 'game003', '192.168.1.128', '2014-09-19 17:12:45', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:55', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('255', 'game003', '192.168.1.128', '2014-09-19 17:15:03', '145F6553D8D8EBF6130EDC73B4017B5A', '2', '1', '特里艾迪生', '2017-06-02 12:50:56', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('256', 'game003', '192.168.1.128', '2014-09-19 17:25:31', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:56', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('257', 'game003', '192.168.1.128', '2014-09-19 17:26:25', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:56', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('258', 'game003', '192.168.1.128', '2014-09-19 17:28:32', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:57', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('259', 'game003', '192.168.1.128', '2014-09-19 17:30:19', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:57', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('260', 'game003', '192.168.1.128', '2014-09-19 17:44:04', '145F6553D8D8EBF6130EDC73B4017B5A', '8', '1', '特里艾迪生', '2017-06-02 12:50:58', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('261', 'game003', '192.168.1.128', '2014-09-19 17:51:20', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:58', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('262', 'game003', '192.168.1.128', '2014-09-19 17:53:37', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:58', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('263', 'game003', '192.168.1.128', '2014-09-19 17:53:55', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:59', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('264', 'game003', '192.168.1.128', '2014-09-19 17:54:38', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:59', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('265', 'game003', '192.168.1.128', '2014-09-19 17:55:32', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:59', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('266', 'game003', '192.168.1.128', '2014-09-19 17:55:46', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:50:59', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('267', 'game003', '192.168.1.128', '2014-09-19 17:57:54', '145F6553D8D8EBF6130EDC73B4017B5A', '2', '1', '特里艾迪生', '2017-06-02 12:51:00', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('268', 'game003', '192.168.1.128', '2014-09-19 18:01:14', '145F6553D8D8EBF6130EDC73B4017B5A', '2', '1', '特里艾迪生', '2017-06-02 12:51:00', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('269', 'game003', '192.168.1.128', '2014-09-19 18:05:16', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:51:01', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('270', 'game003', '192.168.1.128', '2014-09-22 14:17:03', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:51:02', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('271', 'game003', '192.168.1.128', '2014-09-22 14:43:16', '145F6553D8D8EBF6130EDC73B4017B5A', '1', '1', '特里艾迪生', '2017-06-02 12:51:03', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('272', 'game003', '192.168.1.128', '2014-09-22 17:38:34', 'sad', '1', '1', '鲍勃李嘉图', '2017-06-02 12:51:05', '0', '1@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('273', 'game003', '192.168.1.118', '2014-09-22 17:53:09', '2039427', '15', '69', '田小官', '2017-06-02 12:51:05', '4', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('274', 'game003', '192.168.1.118', '2014-09-22 17:55:15', '2039427', '2', '69', '田小官', '2017-06-02 12:51:06', '4', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('275', 'game003', '192.168.1.118', '2014-09-22 18:30:06', '2039427', '5', '69', '田小官', '2017-06-02 12:51:06', '4', '(*Guide_Over*)');
INSERT INTO `op_oss_qlz_out_log` VALUES ('276', '1', '192.168.1.118', '2014-09-28 14:11:10', '1', '2', '3', '1', '2017-06-02 12:52:32', '0', '5@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('277', '1', '192.168.1.118', '2014-09-28 14:15:36', '1', '2', '3', '1', '2017-06-02 12:52:33', '0', '5@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('278', '1', '192.168.1.118', '2014-09-28 14:16:12', '1', '1', '3', '1', '2017-06-02 12:52:33', '0', '5@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('279', '1', '192.168.1.118', '2014-09-28 14:18:25', '1', '1', '3', '1', '2017-06-02 12:52:33', '0', '5@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('280', '1', '192.168.1.118', '2014-09-28 14:23:46', '1', '1', '3', '1', '2017-06-02 12:52:34', '0', '5@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('281', '1', '192.168.1.118', '2014-09-28 14:30:11', '1', '6', '3', '1', '2017-06-02 12:52:35', '0', '5@0');
INSERT INTO `op_oss_qlz_out_log` VALUES ('282', '1', '192.168.1.118', '2014-09-28 17:39:09', '2', '32', '1', '2', '2017-06-02 12:52:36', '0', '1@0');

-- ----------------------------
-- Table structure for op_oss_qlz_passport
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_passport`;
CREATE TABLE `op_oss_qlz_passport` (
  `openid` varchar(50) NOT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `rolename` varchar(50) DEFAULT NULL,
  `grade` int(11) DEFAULT '1',
  `curmoney` double(12,2) DEFAULT '0.00',
  `totalmoney` double(12,2) DEFAULT '0.00',
  `career` int(11) DEFAULT NULL,
  `isonline` int(11) DEFAULT '0',
  `status` int(11) DEFAULT '1',
  `lastloginip` varchar(20) DEFAULT NULL,
  `logincount` int(11) DEFAULT '1',
  `fristlogintime` varchar(20) DEFAULT NULL,
  `lastlogintime` varchar(20) DEFAULT NULL,
  `regtime` varchar(20) DEFAULT NULL,
  `info` varchar(1000) DEFAULT NULL,
  `totalonline` int(11) DEFAULT '0',
  `totalconsume` double(12,2) DEFAULT '0.00',
  `vipgrade` int(11) DEFAULT '0',
  `fristpaytime` varchar(20) DEFAULT NULL,
  `lastpaytime` varchar(20) DEFAULT NULL,
  `optid` varchar(20) DEFAULT NULL,
  `guidenum` varchar(50) DEFAULT NULL,
  `sfrom` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='热血七龙珠账号表';

-- ----------------------------
-- Records of op_oss_qlz_passport
-- ----------------------------
INSERT INTO `op_oss_qlz_passport` VALUES ('0game003', 'game003', '霍普鲁道夫', '1', '9800000.00', '0.00', null, '0', '1', '192.168.1.118', '5', '2014-08-29 12:38:15', '2014-09-03 14:12:21', '2014-08-29 12:38:10', '3', '5', '-200000.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('10game003', 'game003', '罗斯克洛宁', '1', '9880000.00', '0.00', null, '1', '1', '192.168.1.118', '3', '2014-08-29 12:27:58', '2014-08-29 12:33:10', '2014-08-29 12:27:55', '4', '4', '-120000.00', '12', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('11', '1', '1', '3', '102.00', '0.00', null, '0', '1', '192.168.1.118', '10', '2014-09-26 09:47:07', '2014-09-28 14:24:04', '2014-09-26 09:47:03', '6', '13', '-3496.00', '0', null, null, null, '5@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('11game003', 'game003', '休爱迪生', '1', '0.00', '0.00', null, '1', '1', '192.168.1.118', '8', '2014-09-17 16:55:28', '2014-09-22 14:03:25', '2014-09-17 16:55:23', '1', '4', '0.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('12900game003', 'game003', '拉金罗伯逊', '1', '0.00', '0.00', null, '0', '1', '192.168.1.118', '2', '2014-08-25 14:56:03', '2014-08-25 14:56:03', '2014-08-25 14:56:00', '2', '2', '0.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('1290game003', 'game003', '瓦特普赖斯', '70', '99990000.00', '0.00', null, '0', '1', '192.168.1.118', '40', '2014-08-22 12:26:25', '2014-08-26 16:54:05', '2014-08-22 12:26:20', '1', '106', '-25084.00', '8', null, null, null, '9@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('129game003', 'game003', '萨利道格拉斯', '1', '0.00', '0.00', null, '0', '1', '192.168.1.118', '2', '2014-08-22 11:51:08', '2014-08-22 11:51:08', '2014-08-22 11:51:03', '1', '1', '0.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('12game003', 'game003', '迈卡斯梯尔', '3', '7663610.00', '0.00', null, '1', '1', '192.168.1.150', '8', '2014-08-22 11:25:16', '2014-08-28 22:56:46', '2014-08-22 11:25:09', '-100000', '2', '-401000.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('145F6553D8D8EBF6130EDC73B4017B5Agame003', 'game003', '亚当福克斯', '1', '893784.00', '0.00', null, '0', '1', '192.168.1.128', '69', '2014-08-21 18:04:00', '2014-09-22 14:43:10', '2014-08-21 18:03:57', '1', '173', '-118203.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('14game003', 'game003', '芬恩布赖斯', '8', '0.00', '0.00', null, '0', '1', '192.168.1.118', '6', '2014-09-11 17:58:23', '2014-09-12 12:03:15', '2014-09-11 17:58:19', '144', '153', '0.00', '0', null, null, null, '9@5', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('1game003', 'game003', '凯雷朗费罗', '45', '95278.00', '0.00', null, '0', '1', '192.168.1.118', '15', '2014-08-29 12:08:29', '2014-09-16 10:18:53', '2014-08-29 12:08:26', '108', '7473', '-206106.00', '9', null, null, null, '2@1', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('2033648game003', 'game003', '科菲莫特利', '35', '1908.00', '0.00', null, '0', '1', '192.168.1.241', '3', '2014-09-04 18:35:09', '2014-09-04 18:35:42', '2014-09-04 18:35:09', '2', '3', '-10.00', '3', null, null, null, '(*Guide_Over*)', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('2035942game003', 'game003', '李慢慢', '48', '245.00', '0.00', null, '1', '1', '192.168.1.118', '2', '2014-09-04 18:05:57', '2014-09-04 18:05:57', '2014-09-04 18:05:57', '-42', '0', '-142.00', '0', null, null, null, null, null);
INSERT INTO `op_oss_qlz_passport` VALUES ('20394271', '1', '兰登亚当斯', '1', '998202.00', '0.00', null, '1', '1', '192.168.1.118', '3', '2014-09-26 09:35:14', '2014-09-26 09:36:17', '2014-09-26 09:35:14', '-1798', '0', '-1798.00', '0', null, null, null, null, null);
INSERT INTO `op_oss_qlz_passport` VALUES ('2039427game003', 'game003', '田小官', '69', '0.00', '0.00', null, '0', '1', '192.168.1.118', '5', '2014-09-22 17:37:31', '2014-09-22 18:25:05', '2014-09-22 17:37:31', '5', '22', '0.00', '4', null, null, null, '(*Guide_Over*)', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('21', '1', '2', '1', '102.00', '0.00', null, '0', '1', '192.168.1.118', '5', '2014-09-26 09:48:21', '2014-09-28 17:06:34', '2014-09-26 09:48:16', '32', '32', '-5294.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('234game003', 'game003', '摩利安東尼', '1', '0.00', '0.00', null, '0', '1', '192.168.1.128', '12', '2014-08-30 16:16:27', '2014-08-30 17:09:20', '2014-08-30 16:16:23', '1', '28', '0.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('2game003', 'game003', '哈该哈伯德', '1', '9898000.00', '0.00', null, '0', '1', '192.168.1.118', '5', '2014-08-29 12:15:34', '2014-09-16 10:12:30', '2014-08-29 12:15:34', '447', '463', '-102000.00', '0', null, null, null, '1@2', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('31', '1', '3', '1', '2.00', '0.00', null, '1', '1', '192.168.1.118', '4', '2014-09-26 09:49:20', '2014-09-26 10:35:56', '2014-09-26 09:49:15', '-1798', '0', '-5394.00', '0', null, null, null, null, null);
INSERT INTO `op_oss_qlz_passport` VALUES ('3game003', 'game003', '乔丹白壁德', '1', '999894000.00', '0.00', null, '1', '1', '192.168.1.118', '3', '2014-08-29 12:17:16', '2014-08-29 12:35:11', '2014-08-29 12:17:13', '14', '14', '-106000.00', '12', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('41', '1', '5', '1', '2.00', '0.00', null, '1', '1', '192.168.1.118', '4', '2014-09-26 09:50:04', '2014-09-26 10:35:20', '2014-09-26 09:50:00', '-1798', '0', '-3596.00', '0', null, null, null, null, null);
INSERT INTO `op_oss_qlz_passport` VALUES ('43game003', 'game003', '贾德鲍德温', '1', '0.00', '0.00', null, '0', '1', '192.168.1.88', '2', '2014-09-04 19:07:02', '2014-09-04 19:07:02', '2014-09-04 19:06:57', '1', '1', '0.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('4455game003', 'game003', '劳里普里策', '1', '0.00', '0.00', null, '1', '1', '192.168.1.118', '2', '2014-09-04 11:52:29', '2014-09-04 11:52:29', '2014-09-04 11:52:13', null, '0', '0.00', '0', null, null, null, null, null);
INSERT INTO `op_oss_qlz_passport` VALUES ('4545645game003', 'game003', '斯托克罗夫特', '1', '0.00', '0.00', null, '0', '1', '192.168.1.118', '2', '2014-09-11 17:58:01', '2014-09-11 17:58:01', '2014-09-11 17:58:01', '2', '2', '0.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('459742game003', 'game003', '媽媽咪呀', '58', '2256.00', '0.00', null, '1', '1', '192.168.1.118', '5', '2014-09-19 11:47:47', '2014-09-19 15:11:50', '2014-09-19 11:47:47', '1', '1', '-20.00', '6', null, null, null, '(*Guide_Over*)', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('4game003', 'game003', '鲍勃托因比', '1', '999800000.00', '0.00', null, '1', '1', '192.168.1.118', '3', '2014-08-29 12:20:45', '2014-08-29 12:34:54', '2014-08-29 12:20:42', '11', '11', '-200000.00', '12', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('51', '1', '4', '1', '2.00', '0.00', null, '1', '1', '192.168.1.118', '4', '2014-09-26 09:50:47', '2014-09-26 10:34:45', '2014-09-26 09:50:44', '-1798', '0', '-5294.00', '0', null, null, null, null, null);
INSERT INTO `op_oss_qlz_passport` VALUES ('5game003', 'game003', '卡特霍尔特', '1', '99800000.00', '0.00', null, '1', '1', '192.168.1.118', '3', '2014-08-29 12:22:37', '2014-08-29 12:34:38', '2014-08-29 12:22:34', '9', '9', '-200000.00', '12', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('61', '1', '6', '1', '2.00', '0.00', null, '1', '1', '192.168.1.118', '4', '2014-09-26 09:53:14', '2014-09-26 10:33:55', '2014-09-26 09:53:09', '-1798', '0', '-5194.00', '0', null, null, null, null, null);
INSERT INTO `op_oss_qlz_passport` VALUES ('6game003', 'game003', '哈尔希克斯', '1', '99799000.00', '0.00', null, '1', '1', '192.168.1.118', '3', '2014-08-29 12:24:09', '2014-08-29 12:34:23', '2014-08-29 12:24:05', '8', '8', '-201000.00', '12', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('7game003', 'game003', '卡尔威克利夫', '1', '9799000.00', '0.00', null, '1', '1', '192.168.1.118', '3', '2014-08-29 12:25:01', '2014-08-29 12:34:06', '2014-08-29 12:24:58', '7', '7', '-201000.00', '12', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('8game003', 'game003', '哈该利奥波德', '1', '99899000.00', '0.00', null, '1', '1', '192.168.1.118', '3', '2014-08-29 12:25:52', '2014-08-29 12:33:49', '2014-08-29 12:25:49', '6', '6', '-101000.00', '12', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('9game003', 'game003', '杰米鲍德温', '1', '99888000.00', '0.00', null, '1', '1', '192.168.1.118', '3', '2014-08-29 12:26:55', '2014-08-29 12:33:27', '2014-08-29 12:26:50', '5', '5', '-112000.00', '12', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('E4EF6792D38354EC67DAB4087245AD96game003', 'game003', '无赖', '70', '0.00', '0.00', null, '0', '1', '192.168.1.118', '4', '2014-09-12 15:51:21', '2014-09-12 15:56:07', '2014-09-12 15:51:21', '2', '4', '0.00', '4', null, null, null, '12@6', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('EA29906FEE97799837A8F0C63035F62Egame003', 'game003', '薇微笑', '1', '0.00', '0.00', null, '0', '1', '192.168.1.128', '7', '2014-08-25 17:51:44', '2014-08-30 16:49:55', '2014-08-25 17:51:44', '1', '4', '0.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('sa1234567game003', 'game003', '迪福拉瑟福德', '1', '99790688.00', '0.00', null, '1', '1', '192.168.1.118', '3', '2014-08-29 00:49:21', '2014-08-29 00:53:05', '2014-08-29 00:49:21', '2', '2', '-209312.00', '12', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('sa123456game003', 'game003', '拉金詹姆斯', '1', '0.00', '0.00', null, '0', '1', '192.168.1.118', '11', '2014-08-29 00:04:19', '2014-08-29 00:48:50', '2014-08-29 00:04:19', '1', '13', '0.00', '12', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('sa123game003', 'game003', '洛克福开森', '1', '0.00', '0.00', null, '1', '1', '192.168.1.118', '2', '2014-08-28 23:28:28', '2014-08-28 23:28:28', '2014-08-28 23:28:28', null, '0', '0.00', '0', null, null, null, null, null);
INSERT INTO `op_oss_qlz_passport` VALUES ('sa1game003', 'game003', 'sa1', '40', '7594779.00', '0.00', null, '1', '1', '192.168.1.118', '8', '2014-08-28 21:52:10', '2014-08-28 22:55:39', '2014-08-28 21:52:10', '-1000', '9', '-1308000.00', '9', null, null, null, '(*Guide_Over*)', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('sadgame003', 'game003', 'sad', '1', '98869.00', '0.00', null, '0', '1', '192.168.1.128', '42', '2014-08-22 13:38:51', '2014-09-22 17:38:29', '2014-08-22 10:11:28', '1', '70', '-2030.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('sagame003', 'game003', '巴尼比勒尔', '1', '0.00', '0.00', null, '0', '1', '192.168.1.241', '2', '2014-08-30 16:04:59', '2014-08-30 16:04:59', '2014-08-30 16:04:55', '1', '1', '0.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('Soul2222121game003', 'game003', '杜邦森次巴立', '1', '0.00', '0.00', null, '0', '1', '192.168.1.241', '2', '2014-08-22 11:09:44', '2014-08-22 11:09:44', '2014-08-22 11:09:40', '1', '1', '0.00', '0', null, null, null, '1@0', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('Soul222c1111game003', 'game003', '鲍尔马歇尔', '1', '0.00', '0.00', null, '0', '1', '192.168.1.241', '2', '2014-08-22 12:56:55', '2014-08-22 12:56:55', '2014-08-22 11:20:41', '1', '2', '0.00', '0', null, null, null, '16@1', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('Soul222c11game003', 'game003', '梅格魏克利夫', '1', '0.00', '0.00', null, '0', '1', null, '1', null, null, '2014-08-22 11:16:18', null, '0', '0.00', '0', null, null, null, null, null);
INSERT INTO `op_oss_qlz_passport` VALUES ('Soulgame003', 'game003', '朗伯斯梅德利', '1', '0.00', '0.00', null, '0', '1', '192.168.1.241', '10', '2014-08-21 17:59:39', '2014-08-22 13:55:12', '2014-08-21 17:59:32', '1', '54', '0.00', '0', null, null, null, '16@1', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('test10game003', 'game003', '福特邓洛普', '1', '0.00', '0.00', null, '0', '1', null, '1', null, null, '2014-08-22 09:42:26', '1', '1', '0.00', '0', null, null, null, '', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('test11game003', 'game003', '乔尔贝西墨', '21', '0.00', '0.00', null, '0', '1', '192.168.9.238', '2', '2014-08-22 15:54:01', '2014-08-22 15:54:01', '2014-08-22 15:53:58', '79', '79', '0.00', '0', null, null, null, '(*Guide_Over*)', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('testgame003', 'game003', '佩恩塔特爾', '1', '4328.00', '0.00', null, '0', '1', '192.168.1.241', '44', '2014-08-21 17:56:28', '2014-09-04 18:34:25', '2014-08-21 17:45:36', '1', '132', '-10202.00', '0', null, null, null, '(*Guide_Over*)', null);
INSERT INTO `op_oss_qlz_passport` VALUES ('yuchangmei12game003', 'game003', '罗素佩兴斯', '35', '8996575.00', '0.00', null, '1', '1', '192.168.1.118', '6', '2014-08-28 22:18:24', '2014-08-28 22:54:57', '2014-08-28 22:18:24', '-1000', '3', '-401000.00', '12', null, null, null, '(*Guide_Over*)', null);

-- ----------------------------
-- Table structure for op_oss_qlz_passport_reg
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_passport_reg`;
CREATE TABLE `op_oss_qlz_passport_reg` (
  `openid` varchar(50) NOT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `lastloginip` varchar(20) DEFAULT NULL,
  `logincount` int(11) DEFAULT '1',
  `lastlogintime` varchar(20) DEFAULT NULL,
  `info` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='热血七龙珠账号表';

-- ----------------------------
-- Records of op_oss_qlz_passport_reg
-- ----------------------------
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('0game003', 'game003', '192.168.1.118', '4', '2014-09-03 14:12:13', '2014-08-29 12:38:06');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('10game003', 'game003', '192.168.1.118', '2', '2014-08-29 12:33:06', '2014-08-29 12:27:49');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('11', '1', '192.168.1.118', '9', '2014-09-28 14:23:50', '2014-09-26 09:46:59');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('11game003', 'game003', '192.168.1.118', '9', '2014-09-22 14:03:22', '2014-09-17 16:55:20');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('12900game003', 'game003', '192.168.1.118', '1', '2014-08-25 14:55:54', '2014-08-25 14:55:54');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('1290game003', 'game003', '192.168.1.118', '39', '2014-08-26 16:54:01', '2014-08-22 12:26:16');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('129game003', 'game003', '192.168.1.118', '1', '2014-08-22 11:51:00', '2014-08-22 11:51:00');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('12game003', 'game003', '192.168.1.150', '7', '2014-08-28 22:56:44', '2014-08-22 11:25:05');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('145F6553D8D8EBF6130EDC73B4017B5Agame003', 'game003', '192.168.1.128', '75', '2014-09-22 14:43:07', '2014-08-21 18:03:52');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('14game003', 'game003', '192.168.1.118', '6', '2014-09-12 14:27:54', '2014-09-11 17:58:18');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('1920game003', 'game003', '192.168.1.118', '1', '2014-08-25 13:36:37', '2014-08-25 13:36:37');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('1game003', 'game003', '192.168.1.118', '17', '2014-09-16 10:18:49', '2014-08-29 12:08:21');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('2033648game003', 'game003', '192.168.1.241', '2', '2014-09-04 18:35:38', '2014-09-04 18:32:49');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('2035942game003', 'game003', '192.168.1.118', '1', '2014-09-04 18:05:52', '2014-09-04 18:05:52');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('20394271', '1', '192.168.1.118', '2', '2014-09-26 09:36:08', '2014-09-26 09:35:08');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('2039427game003', 'game003', '192.168.1.118', '4', '2014-09-22 18:24:59', '2014-09-22 17:37:27');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('21', '1', '192.168.1.118', '3', '2014-09-28 17:06:29', '2014-09-26 09:48:12');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('234game003', 'game003', '192.168.1.128', '11', '2014-08-30 17:09:17', '2014-08-30 16:16:20');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('2game003', 'game003', '192.168.1.118', '4', '2014-09-16 10:12:26', '2014-08-29 12:15:25');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('31', '1', '192.168.1.118', '2', '2014-09-26 10:35:51', '2014-09-26 09:49:10');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('3game003', 'game003', '192.168.1.118', '2', '2014-08-29 12:35:07', '2014-08-29 12:17:07');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('41', '1', '192.168.1.118', '2', '2014-09-26 10:35:15', '2014-09-26 09:49:55');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('4455game003', 'game003', '192.168.1.118', '1', '2014-09-04 11:52:06', '2014-09-04 11:52:06');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('4545645game003', 'game003', '192.168.1.118', '1', '2014-09-11 17:57:47', '2014-09-11 17:57:47');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('459742game003', 'game003', '192.168.1.118', '5', '2014-09-19 15:11:44', '2014-09-19 11:47:44');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('4game003', 'game003', '192.168.1.118', '2', '2014-08-29 12:34:51', '2014-08-29 12:20:38');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('51', '1', '192.168.1.118', '3', '2014-09-26 10:34:40', '2014-09-26 09:50:31');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('539506700@qq.comgame003', 'game003', '192.168.1.241', '1', '2014-09-04 18:29:55', '2014-09-04 18:29:55');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('539506700game003', 'game003', '192.168.1.241', '1', '2014-09-04 18:30:14', '2014-09-04 18:30:14');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('5game003', 'game003', '192.168.1.118', '2', '2014-08-29 12:34:35', '2014-08-29 12:22:28');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('61', '1', '192.168.1.118', '3', '2014-09-26 10:33:49', '2014-09-26 09:53:04');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('6game003', 'game003', '192.168.1.118', '2', '2014-08-29 12:34:19', '2014-08-29 12:24:00');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('7game003', 'game003', '192.168.1.118', '2', '2014-08-29 12:34:02', '2014-08-29 12:24:52');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('8game003', 'game003', '192.168.1.118', '2', '2014-08-29 12:33:45', '2014-08-29 12:25:43');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('9game003', 'game003', '192.168.1.118', '2', '2014-08-29 12:33:23', '2014-08-29 12:26:46');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('E4EF6792D38354EC67DAB4087245AD96game003', 'game003', '192.168.1.118', '3', '2014-09-12 15:56:03', '2014-09-12 15:51:17');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('EA29906FEE97799837A8F0C63035F62Egame003', 'game003', '192.168.1.128', '6', '2014-08-30 16:49:49', '2014-08-25 17:34:25');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('sa1234567game003', 'game003', '192.168.1.118', '2', '2014-08-29 00:53:02', '2014-08-29 00:49:12');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('sa123456game003', 'game003', '192.168.1.118', '10', '2014-08-29 00:48:46', '2014-08-29 00:04:14');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('sa123game003', 'game003', '192.168.1.118', '1', '2014-08-28 23:28:25', '2014-08-28 23:28:25');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('sa1game003', 'game003', '192.168.1.118', '7', '2014-08-28 22:55:35', '2014-08-28 21:37:15');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('sadgame003', 'game003', '192.168.1.128', '47', '2014-09-22 17:38:25', '2014-08-22 10:11:21');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('sagame003', 'game003', '192.168.1.241', '1', '2014-08-30 16:04:50', '2014-08-30 16:04:50');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('Soul2222121game003', 'game003', '192.168.1.241', '1', '2014-08-22 11:09:35', '2014-08-22 11:09:35');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('Soul222c1111game003', 'game003', '192.168.1.241', '3', '2014-08-22 12:56:45', '2014-08-22 11:20:37');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('Soul222c11game003', 'game003', '192.168.1.241', '1', '2014-08-22 11:16:13', '2014-08-22 11:16:13');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('Soulgame003', 'game003', '192.168.1.241', '14', '2014-08-22 13:55:06', '2014-08-21 17:59:28');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('test1', '1', '192.168.1.116', '1', '2014-09-26 11:24:07', '2014-09-26 11:24:07');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('test10game003', 'game003', '192.168.9.238', '1', '2014-08-22 09:42:20', '2014-08-22 09:42:20');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('test11game003', 'game003', '192.168.9.238', '1', '2014-08-22 15:53:49', '2014-08-22 15:53:49');
INSERT INTO `op_oss_qlz_passport_reg` VALUES ('testgame003', 'game003', '192.168.1.241', '50', '2014-09-04 18:34:22', '2014-08-21 17:45:31');

-- ----------------------------
-- Table structure for op_oss_qlz_recharge_log
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_recharge_log`;
CREATE TABLE `op_oss_qlz_recharge_log` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `worldid` varchar(20) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `moneybefore` double(12,2) DEFAULT NULL COMMENT '游戏币',
  `moneyafter` double(12,2) DEFAULT NULL,
  `moneyadd` double(12,2) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `sfrom` varchar(2) DEFAULT NULL COMMENT '充值渠道，主要是针对自身平台',
  `level` int(11) DEFAULT NULL,
  `rolename` varchar(50) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  `billon` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_qlz_recharge_log
-- ----------------------------

-- ----------------------------
-- Table structure for op_oss_qlz_recharge_tx
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_recharge_tx`;
CREATE TABLE `op_oss_qlz_recharge_tx` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `billno` varchar(50) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `appid` varchar(20) DEFAULT NULL,
  `ts` varchar(50) DEFAULT NULL,
  `payitem` varchar(50) DEFAULT NULL,
  `token` varchar(50) DEFAULT NULL,
  `version` varchar(50) DEFAULT NULL,
  `zoneid` varchar(20) DEFAULT NULL,
  `providetype` varchar(50) DEFAULT NULL,
  `amt` varchar(10) DEFAULT NULL,
  `payamt_coins` varchar(10) DEFAULT NULL,
  `pubacct_payamt_coins` varchar(10) DEFAULT NULL,
  `sig` varchar(100) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  `status` varchar(2) DEFAULT '0' COMMENT '1：发货成功 0:未发货',
  `confirmcount` int(11) DEFAULT '0',
  `confirmret` int(11) DEFAULT '-1',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='private String openid;\r\n    private String appid;\r\n                                           -&#&';

-- ----------------------------
-- Records of op_oss_qlz_recharge_tx
-- ----------------------------

-- ----------------------------
-- Table structure for op_oss_user_dayreport
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_user_dayreport`;
CREATE TABLE `op_oss_user_dayreport` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `optid` varchar(20) DEFAULT NULL,
  `sfrom` varchar(20) DEFAULT NULL,
  `ctime` varchar(20) DEFAULT NULL,
  `regnum` int(11) DEFAULT '0',
  `createnum` int(11) DEFAULT '0',
  `dau` int(11) DEFAULT '0',
  `newdau` int(11) DEFAULT '0' COMMENT '创建 并成功进入游戏',
  `acu` int(11) DEFAULT '0',
  `pcu` int(11) DEFAULT '0',
  `maxtime` int(11) DEFAULT '0',
  `avgtime` int(11) DEFAULT '0',
  `avglogin` int(11) DEFAULT '0',
  `createper` double(5,2) DEFAULT '0.00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_user_dayreport
-- ----------------------------

-- ----------------------------
-- Table structure for op_oss_user_remain
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_user_remain`;
CREATE TABLE `op_oss_user_remain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appid` varchar(20) DEFAULT NULL,
  `worldid` varchar(20) DEFAULT NULL,
  `goaltime` varchar(20) DEFAULT NULL,
  `lc2` double DEFAULT NULL,
  `lc3` double DEFAULT NULL,
  `lc7` double DEFAULT NULL,
  `lc30` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_user_remain
-- ----------------------------

-- ----------------------------
-- Table structure for op_tx_task
-- ----------------------------
DROP TABLE IF EXISTS `op_tx_task`;
CREATE TABLE `op_tx_task` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `cmd` varchar(20) DEFAULT NULL,
  `openid` varchar(100) DEFAULT NULL,
  `pf` varchar(20) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `appid` varchar(20) DEFAULT NULL,
  `version` varchar(20) DEFAULT NULL,
  `contractid` varchar(20) DEFAULT NULL,
  `step` varchar(20) DEFAULT NULL,
  `payitem` varchar(20) DEFAULT NULL,
  `billno` varchar(20) DEFAULT NULL,
  `providetype` varchar(20) DEFAULT NULL,
  `sig` varchar(200) DEFAULT NULL,
  `res` varchar(20) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='腾讯任务集市';

-- ----------------------------
-- Records of op_tx_task
-- ----------------------------
