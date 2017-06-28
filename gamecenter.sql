/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50714
Source Host           : 127.0.0.1:3306
Source Database       : gamecenter

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-28 11:36:43
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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='权限组';

-- ----------------------------
-- Records of oa_role
-- ----------------------------
INSERT INTO `oa_role` VALUES ('16', '产品运营', '1', '', '');
INSERT INTO `oa_role` VALUES ('17', '普通客服', '1', '', '');
INSERT INTO `oa_role` VALUES ('18', '客服主管', '1', '', '');
INSERT INTO `oa_role` VALUES ('19', '财务管理', '1', '', '');
INSERT INTO `oa_role` VALUES ('20', '管理员', '1', '', '');
INSERT INTO `oa_role` VALUES ('21', '代理', '1', null, null);

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
INSERT INTO `oa_user_permit` VALUES ('16', null, null, '18', null, null);

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
-- Table structure for op_agent_config
-- ----------------------------
DROP TABLE IF EXISTS `op_agent_config`;
CREATE TABLE `op_agent_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `one_level` varchar(255) DEFAULT NULL COMMENT '一级的充值比例',
  `two_level` varchar(255) DEFAULT NULL COMMENT '二级充值比例',
  `three_level` varchar(255) DEFAULT NULL COMMENT '三级充值比例',
  `none_level` varchar(255) DEFAULT NULL COMMENT '玩家充值比例',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of op_agent_config
-- ----------------------------
INSERT INTO `op_agent_config` VALUES ('1', '15', '8', '4', '1');

-- ----------------------------
-- Table structure for op_agent_invite_code
-- ----------------------------
DROP TABLE IF EXISTS `op_agent_invite_code`;
CREATE TABLE `op_agent_invite_code` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `invite_code` varchar(255) DEFAULT NULL COMMENT '邀请码',
  `agent_id` bigint(20) DEFAULT NULL,
  `is_use` tinyint(4) DEFAULT '0' COMMENT '是否已使用,已使用为1',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `is_put_out` tinyint(4) DEFAULT '0' COMMENT '是否已发放 发放为1',
  PRIMARY KEY (`id`),
  KEY `agent_id` (`agent_id`),
  KEY `invite_code` (`invite_code`)
) ENGINE=InnoDB AUTO_INCREMENT=616 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of op_agent_invite_code
-- ----------------------------
INSERT INTO `op_agent_invite_code` VALUES ('315', 'f9tyhq', '1', '1', '2017-06-22 16:58:19', '1');
INSERT INTO `op_agent_invite_code` VALUES ('316', 'CY6Gou', '1', '1', '2017-06-22 16:58:36', '1');
INSERT INTO `op_agent_invite_code` VALUES ('317', 'MJre2U', '1', '0', '2017-06-22 16:58:36', '1');
INSERT INTO `op_agent_invite_code` VALUES ('318', 'E5Y8qq', '1', '1', '2017-06-22 16:58:36', '1');
INSERT INTO `op_agent_invite_code` VALUES ('319', 'nWuLqK', '1', '0', '2017-06-22 16:58:36', '0');
INSERT INTO `op_agent_invite_code` VALUES ('320', '0S1AYe', '1', '0', '2017-06-22 16:58:36', '0');
INSERT INTO `op_agent_invite_code` VALUES ('321', 'T5bLZL', '1', '1', '2017-06-22 16:58:36', '1');
INSERT INTO `op_agent_invite_code` VALUES ('322', 'I3Htxq', '1', '0', '2017-06-22 16:58:36', '1');
INSERT INTO `op_agent_invite_code` VALUES ('323', 'uRZ8fb', '1', '0', '2017-06-22 16:58:36', '1');
INSERT INTO `op_agent_invite_code` VALUES ('324', 'tx8gAl', '1', '0', '2017-06-22 16:58:36', '0');
INSERT INTO `op_agent_invite_code` VALUES ('325', 'paWaxA', '1', '1', '2017-06-22 16:58:36', '1');
INSERT INTO `op_agent_invite_code` VALUES ('326', 'NFszs7', '1', '0', '2017-06-22 16:58:36', '0');
INSERT INTO `op_agent_invite_code` VALUES ('327', 'eMuUst', '1', '0', '2017-06-22 16:58:37', '1');
INSERT INTO `op_agent_invite_code` VALUES ('328', 'HrjKwx', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('329', 'y3jqC8', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('330', '5AzXXS', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('331', 'OXWo7k', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('332', 'uIUSjn', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('333', '3xyYl1', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('334', 'xW9oO0', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('335', '7NRsf2', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('336', 'YLeV3o', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('337', 'qwBeMF', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('338', 'eK7EqS', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('339', 'vxOarJ', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('340', 'jgvODD', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('341', 'brEJoy', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('342', 'd6VOC7', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('343', 'JAtKCP', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('344', 'ESdwfa', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('345', 'QJT1RC', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('346', 'OBVvj5', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('347', 'Gwpyxe', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('348', 'Ledxc7', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('349', 'lziBak', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('350', 'TY91Ej', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('351', 'gsGaRX', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('352', 'R9QcLw', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('353', '1osNi7', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('354', 'E98PG2', '1', '0', '2017-06-22 16:58:37', '0');
INSERT INTO `op_agent_invite_code` VALUES ('355', 'io4yNc', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('356', 'Lh3lzg', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('357', '1W5yey', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('358', 'YBOs5U', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('359', 'w9zzOA', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('360', 'qan1nS', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('361', 'Z8RpOj', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('362', 'gnDstP', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('363', 'cbi5RE', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('364', 'PFmCXq', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('365', 'fonxjO', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('366', 'ccKBCS', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('367', 'LMcy8D', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('368', 'z34D1Q', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('369', 'UEV3qb', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('370', 'I7kRij', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('371', 'IFTndj', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('372', 'eS1uNQ', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('373', 'JELj1B', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('374', 'IHqI3r', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('375', 'cq9wpM', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('376', 'dO47zW', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('377', 'AHGaSc', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('378', 'OEOVxk', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('379', '1oooV2', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('380', 'QyEqpt', '1', '0', '2017-06-22 16:58:38', '0');
INSERT INTO `op_agent_invite_code` VALUES ('381', '0EW9fM', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('382', 'DD6QBg', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('383', 'DZnR9W', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('384', 'HJsAZ8', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('385', 'LGN8i2', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('386', '0v7JMA', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('387', 'BgS5ks', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('388', 'oqiEIR', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('389', 'R9bazm', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('390', '11KN2s', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('391', 'xPXDMa', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('392', 'HFvD0v', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('393', 'tpBRzX', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('394', 'KZ1hxv', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('395', 'FEixyK', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('396', 'rardcZ', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('397', 'M2K1q4', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('398', 'YwlpbE', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('399', 'nl0Qt2', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('400', 'Jb1r5N', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('401', 'ibwKYE', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('402', 'ogleRI', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('403', 'IicF6Z', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('404', 'eKsCYQ', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('405', 'ZiPD7T', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('406', 'gSOr6k', '1', '0', '2017-06-22 16:58:39', '0');
INSERT INTO `op_agent_invite_code` VALUES ('407', 'd0DMtf', '1', '0', '2017-06-22 16:58:40', '0');
INSERT INTO `op_agent_invite_code` VALUES ('408', 'Xd7kja', '1', '0', '2017-06-22 16:58:40', '0');
INSERT INTO `op_agent_invite_code` VALUES ('409', 'vZmJs7', '1', '0', '2017-06-22 16:58:40', '0');
INSERT INTO `op_agent_invite_code` VALUES ('410', 'zsv6zP', '1', '0', '2017-06-22 16:58:40', '0');
INSERT INTO `op_agent_invite_code` VALUES ('411', 'zlOGJD', '1', '0', '2017-06-22 16:58:40', '0');
INSERT INTO `op_agent_invite_code` VALUES ('412', 'wDW9NL', '1', '0', '2017-06-22 16:58:40', '0');
INSERT INTO `op_agent_invite_code` VALUES ('413', 'hg9Co6', '1', '0', '2017-06-22 16:58:40', '0');
INSERT INTO `op_agent_invite_code` VALUES ('414', 'Ozq7rg', '1', '0', '2017-06-22 16:58:40', '0');
INSERT INTO `op_agent_invite_code` VALUES ('415', 'Zjius6', '1', '0', '2017-06-22 17:09:07', '0');
INSERT INTO `op_agent_invite_code` VALUES ('416', 'toq18a', '11', '1', '2017-06-22 17:20:29', '1');
INSERT INTO `op_agent_invite_code` VALUES ('417', 'McARTK', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('418', 'CDbH9o', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('419', 'dbsgIq', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('420', 'vK65Ie', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('421', 'fjeC7r', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('422', 'BLW1mW', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('423', 'p5BqCH', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('424', 'b0E6Sx', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('425', 'YAH8g4', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('426', 'aTNrCA', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('427', 'UiU7OQ', '11', '1', '2017-06-22 17:20:29', '1');
INSERT INTO `op_agent_invite_code` VALUES ('428', 'qdLAzc', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('429', 'xqfxnX', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('430', 'vGIb3m', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('431', 'MJCbCD', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('432', 'PlSZTc', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('433', 'm7ofsj', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('434', '94kvOf', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('435', 'mZ2Pge', '11', '0', '2017-06-22 17:20:29', '0');
INSERT INTO `op_agent_invite_code` VALUES ('436', 'VXZ3ql', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('437', 'pkvoUf', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('438', 'FHUQrQ', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('439', 'GmCQhV', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('440', 'Fuxjl8', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('441', 'zzwY7t', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('442', 'GctOfb', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('443', 'WVJeDZ', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('444', 'XP5Y3a', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('445', '4dKLuD', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('446', 'SUKlD9', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('447', 'iaLDrh', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('448', '6LeRuK', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('449', 'MOjXq6', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('450', 'n0UHAn', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('451', '4e0qjI', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('452', 'PiQqt6', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('453', 'a9oAJ5', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('454', '611Pqx', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('455', 'Yeo3LF', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('456', 'SPxkko', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('457', 'uUZcXV', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('458', 'h5jTNu', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('459', 'klHAnW', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('460', 'QVLM79', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('461', 'vYFiVN', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('462', 'VqwR6y', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('463', '9kyWDQ', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('464', 'ZX1RwG', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('465', 'e007SB', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('466', 'ZAd23t', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('467', 'boadSY', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('468', 'svmdDa', '11', '0', '2017-06-22 17:20:30', '0');
INSERT INTO `op_agent_invite_code` VALUES ('469', 'Ag8WhG', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('470', 'IUYUqE', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('471', 'xngEIX', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('472', 'j3VfCG', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('473', 'GkECR9', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('474', 'kb47jB', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('475', '6Vp4F5', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('476', '9wxrE2', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('477', 'BkzjmN', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('478', 'nwCdWd', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('479', 'sxQU8C', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('480', 'SElCDL', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('481', 'dMVG18', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('482', 'nxuEAu', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('483', 'eizpOQ', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('484', 'RhvJqN', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('485', 'W0H9ml', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('486', 'n5gOfW', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('487', 'nbD7UP', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('488', 'HoHlWq', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('489', 'K2h0YV', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('490', 'XyjNWd', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('491', 'LYncHc', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('492', 'GkO0Bq', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('493', '1incyq', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('494', 'ieeUwV', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('495', '933EjP', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('496', 'k6fibZ', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('497', 'amPmAK', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('498', 'KsMJmf', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('499', 'HaXsHN', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('500', 'nFCEBo', '11', '0', '2017-06-22 17:20:31', '0');
INSERT INTO `op_agent_invite_code` VALUES ('501', 'Xyox00', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('502', 'AL9WhO', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('503', 'nuTE2w', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('504', '7oVRiZ', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('505', 'cyMtd6', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('506', 'OYBLll', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('507', 'NZNyUj', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('508', '3iDSOt', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('509', 'AJRjwl', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('510', '1y4orX', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('511', 'ztlA86', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('512', 'xVKncm', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('513', 'gcewsZ', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('514', '55RX7Y', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('515', 'iaDEwp', '11', '0', '2017-06-22 17:20:32', '0');
INSERT INTO `op_agent_invite_code` VALUES ('516', '30qbMv', '14', '0', '2017-06-28 10:10:17', '0');
INSERT INTO `op_agent_invite_code` VALUES ('517', 'DzP9UF', '14', '0', '2017-06-28 10:10:17', '0');
INSERT INTO `op_agent_invite_code` VALUES ('518', 'wjkNCg', '14', '0', '2017-06-28 10:10:17', '0');
INSERT INTO `op_agent_invite_code` VALUES ('519', 'cAYG0V', '14', '0', '2017-06-28 10:10:17', '0');
INSERT INTO `op_agent_invite_code` VALUES ('520', 'o5rNFa', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('521', '9Yz6ZY', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('522', 'NVvObb', '14', '1', '2017-06-28 10:10:18', '1');
INSERT INTO `op_agent_invite_code` VALUES ('523', 'Fi9pl0', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('524', 'PiVNtu', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('525', 'vYCDpp', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('526', 'DexGqt', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('527', 'BYdTkD', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('528', 'tQ2VtJ', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('529', 'SPlJXv', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('530', '0WMpPt', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('531', '9Wfjfd', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('532', 'a8tOpC', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('533', 'zEPqrA', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('534', 'aBEYi8', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('535', '3XmlK1', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('536', 'IVIRWJ', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('537', 'Kmqa37', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('538', 'dZEIvG', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('539', 'zOkiTk', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('540', 'FnkDlg', '14', '0', '2017-06-28 10:10:18', '0');
INSERT INTO `op_agent_invite_code` VALUES ('541', 'eZb78W', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('542', 'Rxuk9h', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('543', 'TjU1gq', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('544', 'L0oJML', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('545', 'TzzLrz', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('546', '3t1ELL', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('547', 'u1iXBL', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('548', 'w5G91g', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('549', 'pBQXdA', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('550', 'g3bBqC', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('551', '52PJ3q', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('552', '16zvbq', '14', '0', '2017-06-28 10:10:19', '0');
INSERT INTO `op_agent_invite_code` VALUES ('553', 'rPPISC', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('554', 'DzmWvu', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('555', 'd1r3uV', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('556', 'F655Ar', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('557', 'N9rJDL', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('558', '3HCybC', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('559', 'lHCvsr', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('560', 'FUM01J', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('561', 'puoyiC', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('562', 'BmzHnU', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('563', '6rGiKl', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('564', 'SOWtGp', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('565', 'tITsRl', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('566', 'wL0WWr', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('567', 'VAStmh', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('568', 'ocdt82', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('569', 'fzqJNH', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('570', 'D3uJbU', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('571', 'oxp6KG', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('572', '13GwNe', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('573', 'ydYYrZ', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('574', 'hPyQly', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('575', 'Ulhfpj', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('576', 'td04Me', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('577', 'Tj4Hpl', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('578', 'x5ip3U', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('579', 'yWuVv1', '14', '0', '2017-06-28 10:10:20', '0');
INSERT INTO `op_agent_invite_code` VALUES ('580', 'COvrxS', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('581', 'AusoNp', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('582', 'k17WH9', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('583', 'nsn2RW', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('584', '8vI42R', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('585', 'UYJSUQ', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('586', 'XAQ6kv', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('587', 'lnZ0UO', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('588', '7sQ548', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('589', 'g6heRC', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('590', 'cWnYsk', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('591', 'VtxbDZ', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('592', 'xNknWE', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('593', 'mM6IWT', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('594', 'E8wlPb', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('595', 'YdCc64', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('596', 'XIloBE', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('597', 'KID5iu', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('598', 'bFHiM6', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('599', 'hexWy3', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('600', 'pa90F0', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('601', '1KmBEZ', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('602', '6L45MF', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('603', 'I4Go7S', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('604', 'BAj5RW', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('605', 'CZYbXq', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('606', 'YHS5f3', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('607', 'X7D0AR', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('608', 'Sxzn3c', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('609', 'QcY8dZ', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('610', 'Gw0s38', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('611', 'XJqffE', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('612', 'b4YId8', '14', '0', '2017-06-28 10:10:21', '0');
INSERT INTO `op_agent_invite_code` VALUES ('613', 'O0l3jf', '14', '0', '2017-06-28 10:10:22', '0');
INSERT INTO `op_agent_invite_code` VALUES ('614', 'coRHy0', '14', '0', '2017-06-28 10:10:22', '0');
INSERT INTO `op_agent_invite_code` VALUES ('615', '4l6g4L', '14', '0', '2017-06-28 10:10:22', '0');

-- ----------------------------
-- Table structure for op_agent_list
-- ----------------------------
DROP TABLE IF EXISTS `op_agent_list`;
CREATE TABLE `op_agent_list` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `invite_code` varchar(255) DEFAULT NULL COMMENT '邀请码',
  `agent_level` int(11) DEFAULT '0' COMMENT '代理级别,0,1,2,3,',
  `remain_money` int(11) DEFAULT '0' COMMENT '剩余房卡数',
  `parent_name` varchar(255) DEFAULT NULL COMMENT '上一级代理名称',
  `wechat_code` varchar(255) DEFAULT NULL COMMENT '微信号',
  `phone` bigint(20) DEFAULT '0' COMMENT '电话',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `password` varchar(255) DEFAULT NULL COMMENT '代理密码',
  `status` tinyint(4) DEFAULT '1' COMMENT '禁用为0,',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_name`),
  KEY `name` (`name`),
  KEY `invite_code` (`invite_code`),
  KEY `phone` (`phone`),
  KEY `wechat_code` (`wechat_code`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of op_agent_list
-- ----------------------------
INSERT INTO `op_agent_list` VALUES ('1', '超级管理员', '888888', '888888', '2147483637', '0', '超级管理员', '12345678996', '2017-06-28 09:36:43', '888888', '1');
INSERT INTO `op_agent_list` VALUES ('11', 'proxy1', 'paWaxA', '999', '2147483617', '超级管理员', '88888', '15746953659', '2017-06-28 09:59:09', '123456', '1');
INSERT INTO `op_agent_list` VALUES ('12', 'proxy2', 'f9tyhq', '999', '2147483647', '超级管理员', '9876554', '17785246536', '2017-06-28 09:59:12', '123456', '1');
INSERT INTO `op_agent_list` VALUES ('13', 'proxy11', 'toq18a', '1', null, 'proxy1', 'toq18a', '13256487952', '2017-06-28 09:59:18', '123456', '1');
INSERT INTO `op_agent_list` VALUES ('14', 'proxy12', 'UiU7OQ', '1', '9', 'proxy1', 'UiU7OQ', '18745696352', '2017-06-28 09:59:21', '123456', '1');

-- ----------------------------
-- Table structure for op_agent_recharge
-- ----------------------------
DROP TABLE IF EXISTS `op_agent_recharge`;
CREATE TABLE `op_agent_recharge` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `agent_name` varchar(255) DEFAULT NULL COMMENT '代理名称',
  `money` double(20,2) DEFAULT '0.00' COMMENT '充值的金额(rmb)',
  `is_agent` tinyint(4) DEFAULT '0' COMMENT '是否是代理1为代理',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '申请充值时间',
  `name` varchar(255) DEFAULT NULL COMMENT '充值的用户名,或者代理名',
  `trader_order` varchar(255) DEFAULT NULL COMMENT '交易号',
  `online_pay` int(11) DEFAULT NULL COMMENT '是否在线充值 1为在线充',
  `is_fetch` int(11) DEFAULT '0' COMMENT '是否已提现 ,申请提现为1,已提为2',
  `fetch_money` double(20,2) DEFAULT '0.00' COMMENT '提成',
  PRIMARY KEY (`id`),
  KEY `agent_name` (`agent_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of op_agent_recharge
-- ----------------------------
INSERT INTO `op_agent_recharge` VALUES ('1', '超级管理员', '1.00', '0', '2017-06-28 09:43:44', 'c:esmj879611060301070336', 'player:879877857940078592', '0', '0', '0.15');
INSERT INTO `op_agent_recharge` VALUES ('2', 'proxy1', '10.00', '1', '2017-06-28 10:17:37', 'proxy12', 'agent:879886473006940160', '0', '0', '0.00');
INSERT INTO `op_agent_recharge` VALUES ('3', 'proxy12', '1.00', '0', '2017-06-28 11:03:41', 'c:esmj879611060301070336', 'player:879886984158380032', '0', '2', '0.15');
INSERT INTO `op_agent_recharge` VALUES ('4', 'proxy12', '5.00', '0', '2017-06-28 11:03:39', 'c:esmj879611060301070336', 'player:879887196549545984', '0', '2', '0.75');

-- ----------------------------
-- Table structure for op_agent_recharge_fetch
-- ----------------------------
DROP TABLE IF EXISTS `op_agent_recharge_fetch`;
CREATE TABLE `op_agent_recharge_fetch` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `money` double(20,2) DEFAULT '0.00' COMMENT '充值的金额(rmb)',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '申请充值时间',
  `name` varchar(255) DEFAULT NULL COMMENT '申请结算的代理名',
  `ids` varchar(512) DEFAULT NULL COMMENT '申请结算的充值id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of op_agent_recharge_fetch
-- ----------------------------

-- ----------------------------
-- Table structure for op_agent_request
-- ----------------------------
DROP TABLE IF EXISTS `op_agent_request`;
CREATE TABLE `op_agent_request` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `invite_code` varchar(255) DEFAULT NULL COMMENT '邀请码',
  `wechat_code` varchar(255) DEFAULT NULL COMMENT '微信号',
  `phone` bigint(255) DEFAULT '0' COMMENT '电话',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `parent_name` varchar(255) DEFAULT '' COMMENT '上级代理',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of op_agent_request
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gameapp
-- ----------------------------
INSERT INTO `op_gameapp` VALUES ('1', 'game1001', '棋牌', '棋牌');

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gameworld
-- ----------------------------
INSERT INTO `op_gameworld` VALUES ('10', 'game1001', null, '局域网', '1001', '1', '192.168.0.189', '192.168.0.189', '3102', '', '0', null, '2014-06-05');

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
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_forbidmsg
-- ----------------------------
INSERT INTO `op_gmt_forbidmsg` VALUES ('1', '1', '321654', null, '10', '5050', '10', null, '不想看到你', '成功', '2017-06-27 17:01:41', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('2', '1', '321654', null, '10', '5051', null, null, '', '成功', '2017-06-27 17:03:17', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('3', null, null, null, '10', '5052', null, '192.168.0.189', '想禁你', '成功', '2017-06-27 17:06:41', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('4', null, null, null, '10', '5052', null, '192.168.0.189', '想禁你', '成功', '2017-06-27 17:08:25', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('5', null, null, null, '10', '5053', null, '192.168.0.189', '想解你', '成功', '2017-06-27 17:16:47', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('6', null, null, null, '10', '5052', null, '192.168.0.189', '', '成功', '2017-06-27 17:19:23', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('7', null, null, null, '10', '5053', null, '192.168.0.189', '', '成功', '2017-06-27 17:20:06', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('8', null, null, null, '10', '5053', null, '192.168.0.189', '', '成功', '2017-06-27 17:22:49', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('9', null, null, null, '10', '5052', null, '192.168.0.189', '', '成功', '2017-06-27 17:24:23', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('10', '1', '321654', null, '10', '5060', null, null, '禁止登录', '失败-2', '2017-06-27 17:27:20', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('11', '1', '321654', null, '10', '5060', null, null, '禁止登录', '成功', '2017-06-27 17:28:55', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('12', '1', '321654', null, '10', '5061', null, null, '', '成功', '2017-06-27 17:32:05', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('13', '1', '321654', null, '10', '5070', null, null, '', '成功', '2017-06-27 17:34:22', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('14', '1', '321654', null, '10', '5070', null, null, '', '成功', '2017-06-27 17:35:15', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('15', '1', '321654', null, '10', '5070', null, null, '', '成功', '2017-06-27 17:37:52', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('16', '1', '321654', null, '10', '5070', null, null, '', '成功', '2017-06-27 17:40:02', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('17', '1', '321654', null, '10', '5070', null, null, '', '成功', '2017-06-27 17:53:05', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('18', '1', '321654', null, '10', '5070', null, null, '', '成功', '2017-06-27 18:02:24', 'admin');
INSERT INTO `op_gmt_forbidmsg` VALUES ('19', '1', '321654', null, '10', '5070', null, null, '', '成功', '2017-06-27 18:10:30', 'admin');

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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_notice
-- ----------------------------
INSERT INTO `op_gmt_notice` VALUES ('1', 'game1001', '10', '1', '公千柑 工有去 苛工', '', '成功', '2017-06-27 18:12:01', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('2', 'game1001', '10', '2', '看下净利要', '', '成功', '2017-06-27 18:12:50', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('3', 'game1001', '10', '2', '我相看看地', '', '成功', '2017-06-27 18:16:00', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('4', 'game1001', '10', '2', '大规模', '', '成功', '2017-06-27 18:29:44', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('5', 'game1001', '10', '1', '春树暮云 棋工仍解体你', '', '成功', '2017-06-27 18:39:29', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('6', 'game1001', '10', '1', '脏爸爸我', '', '成功', '2017-06-27 18:43:42', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('7', 'game1001', '10', '1', '须苛在人有在', '', '成功', '2017-06-27 18:44:56', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('8', 'game1001', '10', '1', 'ewee dsf as', '', '成功', '2017-06-27 18:46:02', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('9', 'game1001', '10', '2', '56416', '', '成功', '2017-06-27 19:05:39', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('10', 'game1001', '10', '2', '56416', '', '成功', '2017-06-27 19:05:40', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('11', 'game1001', '10', '2', '56416', '', '成功', '2017-06-27 19:05:50', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('12', 'game1001', '10', '2', '56416', '', '成功', '2017-06-27 19:06:00', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('13', 'game1001', '10', '2', '56416', '', '成功', '2017-06-27 19:06:10', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('14', 'game1001', '10', '2', '56416', '', '成功', '2017-06-27 19:06:20', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('15', 'game1001', '10', '2', 'ewtrwet vwertwe r', '', '成功', '2017-06-27 19:07:10', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('16', 'game1001', '10', '2', 'ewtrwet vwertwe r', '', '成功', '2017-06-27 19:07:20', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('17', 'game1001', '10', '2', 'ewtrwet vwertwe r', '', '成功', '2017-06-27 19:07:40', '胡君琳');
INSERT INTO `op_gmt_notice` VALUES ('18', 'game1001', '10', '2', 'ewtrwet vwertwe r', '', '成功', '2017-06-27 19:08:10', '胡君琳');

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_notice_cycle
-- ----------------------------
INSERT INTO `op_gmt_notice_cycle` VALUES ('1', 'game1001', '10', '2', '10', '看下净利要', '', '2017-06-27 18:12:50', '胡君琳', '2017-06-27 18:12:48', '0');
INSERT INTO `op_gmt_notice_cycle` VALUES ('2', 'game1001', '10', '2', '10', '我相看看地', '', '2017-06-27 18:16:00', '胡君琳', '2017-06-27 18:15:53', '0');
INSERT INTO `op_gmt_notice_cycle` VALUES ('3', 'game1001', '10', '2', '10', '你们好在基斯柯达茜苛', '', '2017-06-27 18:23:06', '胡君琳', '2017-06-27 18:22:58', '0');
INSERT INTO `op_gmt_notice_cycle` VALUES ('4', 'game1001', '10', '2', '10', '大规模', '', '2017-06-27 18:29:42', '胡君琳', '2017-06-27 18:24:21', '0');
INSERT INTO `op_gmt_notice_cycle` VALUES ('5', 'game1001', '10', '2', '10', '脸在人仍在基区', '', '2017-06-27 18:45:45', '胡君琳', '2017-06-27 18:33:43', '0');
INSERT INTO `op_gmt_notice_cycle` VALUES ('6', 'game1001', '10', '2', '1', '56416', '', '2017-06-27 19:06:20', '胡君琳', '2017-06-27 19:05:26', '0');
INSERT INTO `op_gmt_notice_cycle` VALUES ('7', 'game1001', '10', '2', '1', 'ewtrwet vwertwe r', '', '2017-06-27 19:07:50', '胡君琳', '2017-06-27 19:07:00', '0');

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_sendmoney
-- ----------------------------
INSERT INTO `op_gmt_sendmoney` VALUES ('1', 'game1001', '10', '1', '1000', '2017-06-27 19:30:33', '胡君琳', '0', null);

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_gmt_sendmoney_log
-- ----------------------------
INSERT INTO `op_gmt_sendmoney_log` VALUES ('1', '1', 'game1001', '10', '1', '321654', '', 'ok,成功发送0个', '2017-06-27 19:31:31', '胡君琳');
INSERT INTO `op_gmt_sendmoney_log` VALUES ('2', '1', 'game1001', '10', '1', '321654', '', 'ok,成功发送1个', '2017-06-27 19:33:45', '胡君琳');

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
INSERT INTO `op_gmt_sendmoney_pay` VALUES ('1498563228403', 'game1001', '1001', '321654', '100.00', '2', '1', null, '2017-06-27 19:33:48');

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_operator
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_operator_product
-- ----------------------------

-- ----------------------------
-- Table structure for op_operator_recharge
-- ----------------------------
DROP TABLE IF EXISTS `op_operator_recharge`;
CREATE TABLE `op_operator_recharge` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `passport` varchar(100) DEFAULT NULL,
  `sid` varchar(100) DEFAULT NULL,
  `gold` int(11) DEFAULT NULL,
  `money` double(10,2) DEFAULT NULL,
  `billno` varchar(100) DEFAULT NULL,
  `time` int(11) DEFAULT NULL,
  `flag` varchar(200) DEFAULT NULL,
  `addtime` varchar(20) DEFAULT NULL,
  `res` varchar(100) DEFAULT NULL,
  `info` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_operator_recharge
-- ----------------------------
INSERT INTO `op_operator_recharge` VALUES ('1', '321654', '1001', null, '10.00', 'player:879877857940078592', '1498614203', '1', '2017-06-28 09:43:26', '1', null);
INSERT INTO `op_operator_recharge` VALUES ('2', '321654', '1001', null, '10.00', 'player:879886984158380032', '1498616379', '1', '2017-06-28 10:19:46', '1', null);
INSERT INTO `op_operator_recharge` VALUES ('3', '321654', '1001', null, '11.00', 'player:879887196549545984', '1498616429', '1', '2017-06-28 10:20:29', '1', null);

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_operator_world
-- ----------------------------

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
  `app_id` varchar(50) DEFAULT NULL COMMENT '应用id',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_qlz_consume_log
-- ----------------------------

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
  `app_id` varchar(50) DEFAULT NULL COMMENT '应用id',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='角色创建上报。。';

-- ----------------------------
-- Records of op_oss_qlz_createrole_log
-- ----------------------------
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('1', '1', '192.168.0.189', '2017-06-27 15:16:46', '6589', 'c:', '2017-06-27 15:16:53', '1');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('2', '1', '192.168.0.189', '2017-06-27 15:47:32', '9865', 'c:esmj879606665433841664', '2017-06-27 15:47:32', '1');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('3', '1001', '192.168.0.189', '2017-06-27 16:03:24', '321654', 'c:esmj879611060301070336', '2017-06-27 16:03:27', '1');
INSERT INTO `op_oss_qlz_createrole_log` VALUES ('4', '1001', '192.168.0.189', '2017-06-27 17:17:34', '987456', 'c:esmj879629765277908992', '2017-06-27 17:17:39', '1');

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
  `app_id` varchar(50) DEFAULT NULL COMMENT '应用id',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_qlz_login_log
-- ----------------------------
INSERT INTO `op_oss_qlz_login_log` VALUES ('1', '1001', '192.168.0.189', '2017-06-27 17:33:52', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 17:33:53', '1');
INSERT INTO `op_oss_qlz_login_log` VALUES ('2', '1001', '192.168.0.189', '2017-06-27 17:39:45', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 17:39:45', '1');
INSERT INTO `op_oss_qlz_login_log` VALUES ('3', '1001', '192.168.0.189', '2017-06-27 17:42:14', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 17:42:14', '1');
INSERT INTO `op_oss_qlz_login_log` VALUES ('4', '1001', '192.168.0.189', '2017-06-27 17:54:13', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 17:54:18', '1');
INSERT INTO `op_oss_qlz_login_log` VALUES ('5', '1001', '192.168.0.189', '2017-06-27 17:57:21', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 17:57:21', '1');
INSERT INTO `op_oss_qlz_login_log` VALUES ('6', '1001', '192.168.0.189', '2017-06-27 18:01:18', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 18:01:18', '1');
INSERT INTO `op_oss_qlz_login_log` VALUES ('7', '1001', '192.168.0.189', '2017-06-27 18:04:35', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 18:04:35', '1');
INSERT INTO `op_oss_qlz_login_log` VALUES ('8', '1001', '192.168.0.189', '2017-06-27 18:09:49', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 18:09:49', '1');
INSERT INTO `op_oss_qlz_login_log` VALUES ('9', '1001', '192.168.0.189', '2017-06-27 18:11:21', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 18:11:21', '1');
INSERT INTO `op_oss_qlz_login_log` VALUES ('10', '1001', '192.168.0.189', '2017-06-27 18:22:28', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 18:22:31', '1');
INSERT INTO `op_oss_qlz_login_log` VALUES ('11', '1001', '192.168.0.189', '2017-06-27 19:03:45', '321654', '1', 'c:esmj879611060301070336', '2017-06-27 19:03:51', '1');

-- ----------------------------
-- Table structure for op_oss_qlz_onlinecur_log
-- ----------------------------
DROP TABLE IF EXISTS `op_oss_qlz_onlinecur_log`;
CREATE TABLE `op_oss_qlz_onlinecur_log` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `worldid` varchar(20) DEFAULT NULL,
  `onlinenum` int(11) DEFAULT '0',
  `addtime` varchar(20) DEFAULT NULL,
  `app_id` varchar(50) DEFAULT NULL COMMENT '应用id',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='上报实时在线人数   周期5秒\r\n\r\n当前时间  传输是 unix 时间   存储格式是日期格式';

-- ----------------------------
-- Records of op_oss_qlz_onlinecur_log
-- ----------------------------

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
  `app_id` varchar(50) DEFAULT NULL COMMENT '应用id',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_qlz_out_log
-- ----------------------------
INSERT INTO `op_oss_qlz_out_log` VALUES ('1', '1', '192.168.0.189', '2017-06-27 15:43:02', '6589', '1', '1', 'c:', '2017-06-27 15:43:04', '0', null, '1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('2', '1001', '192.168.0.189', '2017-06-27 16:08:50', '321654', '0', '1', 'c:esmj879611060301070336', '2017-06-27 16:08:51', '0', null, '1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('3', '1001', '192.168.0.189', '2017-06-27 17:24:28', '987456', '0', '1', 'c:esmj879629765277908992', '2017-06-27 17:24:29', '0', null, '1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('4', '1001', '192.168.0.189', '2017-06-27 17:39:28', '321654', '0', '1', 'c:esmj879611060301070336', '2017-06-27 17:39:28', '0', null, '1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('5', '1001', '192.168.0.189', '2017-06-27 17:41:23', '321654', '0', '1', 'c:esmj879611060301070336', '2017-06-27 17:41:23', '0', null, '1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('6', '1001', '192.168.0.189', '2017-06-27 17:56:14', '321654', '0', '1', 'c:esmj879611060301070336', '2017-06-27 17:56:15', '0', null, '1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('7', '1001', '192.168.0.189', '2017-06-27 17:58:14', '321654', '0', '1', 'c:esmj879611060301070336', '2017-06-27 17:58:14', '0', null, '1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('8', '1001', '192.168.0.189', '2017-06-27 18:03:50', '321654', '0', '1', 'c:esmj879611060301070336', '2017-06-27 18:03:50', '0', null, '1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('9', '1001', '192.168.0.189', '2017-06-27 18:09:18', '321654', '1', '1', 'c:esmj879611060301070336', '2017-06-27 18:09:18', '0', null, '1');
INSERT INTO `op_oss_qlz_out_log` VALUES ('10', '1001', '192.168.0.189', '2017-06-27 18:10:46', '321654', '1', '1', 'c:esmj879611060301070336', '2017-06-27 18:10:46', '0', null, '1');

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
  `app_id` varchar(50) DEFAULT NULL COMMENT '应用id',
  `invite_code` varchar(255) DEFAULT NULL COMMENT '邀请码',
  PRIMARY KEY (`openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='热血七龙珠账号表';

-- ----------------------------
-- Records of op_oss_qlz_passport
-- ----------------------------
INSERT INTO `op_oss_qlz_passport` VALUES ('321654', '1001', 'c:esmj879611060301070336', '1', '110.00', '110.00', null, '1', '1', '192.168.0.189', '5', '2017-06-27 18:09:49', '2017-06-27 19:03:45', '2017-06-27 16:03:24', '10#player:879877857940078592', '1', '0.00', '0', '2017-06-28 09:43:25', '2017-06-28 09:43:25', null, null, null, '1001', 'NVvObb');
INSERT INTO `op_oss_qlz_passport` VALUES ('987456', '1001', 'c:esmj879629765277908992', '1', '0.00', '0.00', null, '0', '1', null, '1', null, null, '2017-06-27 17:17:34', null, '0', '0.00', '0', null, null, null, null, null, '1', '');

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
  `app_id` varchar(50) DEFAULT NULL COMMENT '应用id',
  PRIMARY KEY (`openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='热血七龙珠账号表';

-- ----------------------------
-- Records of op_oss_qlz_passport_reg
-- ----------------------------

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
  `app_id` varchar(50) DEFAULT NULL COMMENT '应用id',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of op_oss_qlz_recharge_log
-- ----------------------------
INSERT INTO `op_oss_qlz_recharge_log` VALUES ('1', '1001', '321654', '0.00', '100.00', '100.00', '2017-06-27 19:33:47', '1', '1', 'c:esmj879611060301070336', '2017-06-27 19:33:58', 'lyh:1498563225592', '1001');
INSERT INTO `op_oss_qlz_recharge_log` VALUES ('2', '1001', '321654', '100.00', '110.00', '10.00', '2017-06-28 09:43:25', '1', '1', 'c:esmj879611060301070336', '2017-06-28 09:43:29', 'player:879877857940078592', '1001');

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
-- Table structure for op_shop
-- ----------------------------
DROP TABLE IF EXISTS `op_shop`;
CREATE TABLE `op_shop` (
  `id` bigint(20) NOT NULL COMMENT 'id',
  `price` double(20,2) DEFAULT '0.00' COMMENT '价格(RMB)',
  `num` int(11) DEFAULT '0' COMMENT '钻的数量',
  `gift` int(11) DEFAULT '0' COMMENT '赠送',
  `type` int(11) DEFAULT '0' COMMENT '充值类型0为全部,1为玩家2.为代理',
  `name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  PRIMARY KEY (`id`),
  KEY `price` (`price`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of op_shop
-- ----------------------------
INSERT INTO `op_shop` VALUES ('1', '6.00', '7', '0', '0', '钻6');
INSERT INTO `op_shop` VALUES ('2', '12.00', '15', '0', '0', '钻12');
INSERT INTO `op_shop` VALUES ('3', '24.00', '30', '0', '0', '钻24');
INSERT INTO `op_shop` VALUES ('4', '48.00', '58', '0', '0', '钻48');
INSERT INTO `op_shop` VALUES ('5', '96.00', '116', '0', '0', '钻96');
INSERT INTO `op_shop` VALUES ('6', '200.00', '250', '0', '0', '钻200');
INSERT INTO `op_shop` VALUES ('7', '400.00', '500', '0', '0', '钻400');

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
