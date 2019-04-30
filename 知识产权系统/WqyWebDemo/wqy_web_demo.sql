/*
 Navicat Premium Data Transfer

 Source Server         : 本地物理机mysql
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : wqy_web_demo

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 17/12/2018 15:47:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
  `brandStyle` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商标样式',
  `brandName` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商标名称',
  `groups` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '群组',
  `category` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类别',
  `protectedAreas` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '保护地域',
  `applyName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请人',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作地',
  `applyNumber` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请号',
  `applyDate` date NULL DEFAULT NULL COMMENT '申请日',
  `cbsdggr` date NULL DEFAULT NULL COMMENT '初步审定公告日 同初审公告日期',
  `zcggr` date NULL DEFAULT NULL COMMENT '注册公告日',
  `regNumber` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '注册号',
  `deadline` date NULL DEFAULT NULL COMMENT '专利权期限',
  `state` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '法律状态',
  `sqxmb` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请项目表',
  `agency` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代理机构',
  `brandSource` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商标来源',
  `bz` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `fileNumber` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '档案编号',
  `regDate` date NULL DEFAULT NULL COMMENT '注册日',
  `commodity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品/服务',
  `brandType` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商标类型',
  `authorization` date NULL DEFAULT NULL COMMENT '商标授权日',
  `partOwer` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '共有人',
  `color` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '颜色',
  `firstDate` date NULL DEFAULT NULL COMMENT '最早使用日期',
  `projectApplyNumber` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '项目申请编号',
  `applyUnit` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请单位',
  `useUnit` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '使用单位',
  `acceptDate` date NULL DEFAULT NULL COMMENT '受理日期',
  `noticeDate` date NULL DEFAULT NULL COMMENT '初步审定公告日 同初审公告日期',
  `intRegDate` date NULL DEFAULT NULL COMMENT '国际注册日期',
  `lateDate` date NULL DEFAULT NULL COMMENT '后期指定日期',
  `faomousTrademark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '著名商标认定',
  `reputedTrademark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '驰名商标认定',
  `reject` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '驳回记录',
  `ext1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for brand_cx
-- ----------------------------
DROP TABLE IF EXISTS `brand_cx`;
CREATE TABLE `brand_cx`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID',
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父ID',
  `cxf` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '撤销方',
  `bcxf` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被撤销方',
  `cxqz` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '撤销群组',
  `cxrq` date NULL DEFAULT NULL COMMENT '提撤销日期',
  `cxdljg` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '撤销代理机构',
  `cxjg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '撤销结果',
  PRIMARY KEY (`id`, `pid`) USING BTREE,
  INDEX `pid`(`pid`) USING BTREE,
  CONSTRAINT `brand_cx_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `brand` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for brand_jc
-- ----------------------------
DROP TABLE IF EXISTS `brand_jc`;
CREATE TABLE `brand_jc`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '疑似商标标样',
  `applyNumber` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '疑似商标申请号',
  `applyName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '疑似商标申请人',
  `sbType` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '疑似商标类别',
  `groups` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '疑似商标群组',
  `applyDate` date NULL DEFAULT NULL COMMENT '疑似商标申请日',
  `startDate` date NULL DEFAULT NULL COMMENT '疑似商标初审公告日',
  `endDate` date NULL DEFAULT NULL COMMENT '疑似商标异议截止日',
  `results` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '监测确认结果',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of brand_jc
-- ----------------------------
INSERT INTO `brand_jc` VALUES ('jc-b2849420-d568-484d-9b29-3614872478e0', 'QQ拼音截图未命名1.png', '疑似商标申请号', '疑似商标申请人', '疑似商标类别', '疑似商标群组', '2018-12-17', '2018-12-18', '2018-12-19', '监测确认结果');
INSERT INTO `brand_jc` VALUES ('jc-d898b9ca-781d-4374-bb67-e44a66f8cfa3', 'QQ拼音截图未命名.png', '', '', '', '', '2018-12-13', '2018-12-22', '2018-12-20', '');

-- ----------------------------
-- Table structure for brand_notice
-- ----------------------------
DROP TABLE IF EXISTS `brand_notice`;
CREATE TABLE `brand_notice`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父ID',
  `txrq` date NULL DEFAULT NULL COMMENT '*提醒日期\r\n',
  `yxrq` date NULL DEFAULT NULL COMMENT '有效日期',
  `xzrq` date NULL DEFAULT NULL COMMENT '续展日期',
  `xztxrq` date NULL DEFAULT NULL COMMENT '续展提醒日期',
  `gwcljxtxrq` date NULL DEFAULT NULL COMMENT '官文处理绝限提醒日期',
  `jxrq1` date NULL DEFAULT NULL COMMENT '官文处理绝限日期1',
  `jxrq2` date NULL DEFAULT NULL COMMENT '官文处理绝限日期2',
  `jxrq3` date NULL DEFAULT NULL COMMENT '官文处理绝限日期3',
  `jxrq4` date NULL DEFAULT NULL COMMENT '官文处理绝限日期4',
  `jxrq5` date NULL DEFAULT NULL COMMENT '官文处理绝限日期5',
  `jxrq6` date NULL DEFAULT NULL COMMENT '官文处理绝限日期6',
  `jxrq7` date NULL DEFAULT NULL COMMENT '官文处理绝限日期7',
  `jxrq8` date NULL DEFAULT NULL COMMENT '官文处理绝限日期8',
  `jxrq9` date NULL DEFAULT NULL COMMENT '官文处理绝限日期9',
  `jxrq10` date NULL DEFAULT NULL COMMENT '官文处理绝限日期10',
  `enables` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开启状态 1开启 0关闭',
  PRIMARY KEY (`id`, `pid`) USING BTREE,
  INDEX `pid`(`pid`) USING BTREE,
  CONSTRAINT `brand_notice_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `brand` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for brand_ss
-- ----------------------------
DROP TABLE IF EXISTS `brand_ss`;
CREATE TABLE `brand_ss`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父ID',
  `sslx` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '诉讼类型',
  `sj` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '审级',
  `yg` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原告',
  `bg` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被告',
  `ay` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '案由',
  `ssqq` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '诉讼请求',
  `ajjg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '案件结果',
  `cprq` date NULL DEFAULT NULL COMMENT '裁判日期',
  `ysfy` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '一审法院',
  `ls` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '律师',
  `lssws` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '律师事务所',
  `dsr` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '第三人',
  `ssxx` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上诉信息',
  `sasb` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '涉案商标',
  `bz` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`, `pid`) USING BTREE,
  INDEX `pid`(`pid`) USING BTREE,
  CONSTRAINT `brand_ss_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `brand` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for brand_sy
-- ----------------------------
DROP TABLE IF EXISTS `brand_sy`;
CREATE TABLE `brand_sy`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父ID',
  `sbsydw` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商标使用单位',
  `spjfw` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品及服务',
  `use_start_date` date NULL DEFAULT NULL COMMENT '商标使用起始时间',
  `syzj` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商标使用证据',
  PRIMARY KEY (`id`, `pid`) USING BTREE,
  INDEX `brand_sy_ibfk_1`(`pid`) USING BTREE,
  CONSTRAINT `brand_sy_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `brand` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for brand_xk
-- ----------------------------
DROP TABLE IF EXISTS `brand_xk`;
CREATE TABLE `brand_xk`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父ID',
  `bxkf` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被许可方',
  `bxkqx` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被许可期限',
  `bxkspjfw` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被许商品及服务',
  PRIMARY KEY (`id`, `pid`) USING BTREE,
  INDEX `pid`(`pid`) USING BTREE,
  CONSTRAINT `brand_xk_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `brand` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for brand_yy
-- ----------------------------
DROP TABLE IF EXISTS `brand_yy`;
CREATE TABLE `brand_yy`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID',
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父表ID',
  `yyf` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '异议方',
  `byyf` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被异议方',
  `yyqz` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '异议群组',
  `tyyrq` date NULL DEFAULT NULL COMMENT '提异议日期',
  `yydljg` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '异议代理机构',
  `yyjg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '异议结果',
  PRIMARY KEY (`id`, `pid`) USING BTREE,
  INDEX `brand_yy_ibfk_1`(`pid`) USING BTREE,
  CONSTRAINT `brand_yy_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `brand` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for brand_zr
-- ----------------------------
DROP TABLE IF EXISTS `brand_zr`;
CREATE TABLE `brand_zr`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父ID',
  `zrslr` date NULL DEFAULT NULL COMMENT '转让受理日',
  `srr` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '受让人',
  `dljg` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代理机构',
  `zryy` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '转让原因',
  `zrwcr` date NULL DEFAULT NULL COMMENT '转让完成日',
  PRIMARY KEY (`id`, `pid`) USING BTREE,
  INDEX `pid`(`pid`) USING BTREE,
  CONSTRAINT `brand_zr_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `brand` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for mail
-- ----------------------------
DROP TABLE IF EXISTS `mail`;
CREATE TABLE `mail`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `to_mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收件方',
  `from_mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发送方',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `mail_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱账号',
  `mail_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮件密码',
  `smtp_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'SMTP服务器地址',
  `subject` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '主题',
  `ext1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of mail
-- ----------------------------
INSERT INTO `mail` VALUES ('mail-admin', 'wqy@activa-leisure.com', '18758365020@163.com', '<a href=\"www.baidu.com\" target=\"_blank\">Baidu1</a>', NULL, '18758365020@163.com', 'wqy1314', 'smtp.163.com', '测试续展提醒2018', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for patent
-- ----------------------------
DROP TABLE IF EXISTS `patent`;
CREATE TABLE `patent`  (
  `id` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键\r\n',
  `image` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图示',
  `patentName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专利名称',
  `patent_number` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专利号',
  `apply_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请人',
  `apply_number` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请号',
  `technical_classification` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '技术类型',
  `patent_product` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专利产品',
  `apply_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请类型',
  `protected_areas` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '保护地域',
  `patent_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专利类型',
  `address` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作地',
  `apply_date` date NULL DEFAULT NULL COMMENT '申请日',
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '法律状态',
  `accredit_date` date NULL DEFAULT NULL COMMENT '授权公告日',
  `patent_end_date` date NULL DEFAULT NULL COMMENT '专利截止日',
  `patent_invalid_date` date NULL DEFAULT NULL COMMENT '专利失效日期',
  `egency` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代理机构',
  `priority_deadline` date NULL DEFAULT NULL COMMENT '优先权截止日',
  `apply_table` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请表',
  `patent_level` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专利分级',
  `vetting_process` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '审查过程',
  `gkh` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公开号',
  `ly` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源',
  `bz` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `ext1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段1',
  `ext2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段2',
  `ext3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段3',
  `ext4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段4',
  `ext5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段5',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of patent
-- ----------------------------
INSERT INTO `patent` VALUES ('i-p-5fd861ab-8c73-4a38-8796-75038089880c', 'notice.png', 'Bases and braces for support poles, such as poles for pavilions and umbrellas', 'US7628164B2', 'Oliver Joen-an Ma', '11241892', '支撑座体', 'TP08', '巴黎公约', '美国', '发明', '美国TG', '2005-09-30', '授权', '2009-12-08', '2025-09-29', '2009-12-08', '', NULL, '', '', NULL, 'US20060081283A1', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-1b9d595c-cfb0-4562-bb80-ed377c5efa16', 'QQ拼音截图未命名.png', '', '', '', '', '', NULL, NULL, '', '', NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-1cb3f336-d680-417a-9634-3c94f89439ee', 'notice.png', '', '', '', '', 'asasaaaaaaaaaaaaaaaaaa', '', '', '', '', '', NULL, '', NULL, NULL, NULL, '', NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-217f9d91-2868-4dda-adf7-7d9af4299874', '', '', '', '', '', '', '', '', 'ddd', '', '', NULL, '', NULL, NULL, NULL, 's', NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-29a37039-770c-4da7-b5ff-9df88c6a05ec', '', '', '', '', '', 'xxxxx', '', '', '', '', '', '2018-09-06', '', NULL, NULL, NULL, '', NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-3c858771-b176-4a1a-8d85-9344917535b4', NULL, '', '', '', NULL, 'sasas', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-44267e78-2ad0-4120-adae-2db185de2423', 'QQ拼音截图未命名.png', '', '', '', '', 'aaasasasasasasa', '', '', '', '', '', '1970-01-01', '', '2018-09-08', '2018-09-16', NULL, '', NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-5aac1b47-7ac9-475c-9bf4-ba37de121e1a', 'QQ拼音截图未命名.png', '', '', '', '', 'sasasa', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-5e7332ee-429c-46d0-8d16-983c1a0016a8', '', '', '', '', '', 'aaa', '', '', '', '', '宁波', NULL, '', NULL, NULL, NULL, '', NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-614322c2-f30c-4ffb-ae21-ec391161ff4c', 'notice.png', '', '', '', '', 'xccc', NULL, '', '', '', NULL, NULL, '', NULL, NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-791e68b5-8406-4391-9e4f-5d5ac851a2e2', 'notice.png', '', '', '', '', 'asas', '', '', '', '', '', NULL, '', NULL, NULL, NULL, '', NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-82124d67-40b3-413b-8575-19be89692f58', NULL, '', '', '', NULL, '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-83c2cfb0-d258-492b-a7ae-8b50274e7d66', '', 'a', '', '', '', '', '', '', '', '', '', NULL, '', NULL, NULL, NULL, '', NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-8438bef8-0773-4de4-a6fa-3636392750c6', '', 'f', '4444', 'l', '1212121', 'adddddd', 'k', 'h', 'c', 'g', 't', NULL, '', NULL, NULL, NULL, '', NULL, NULL, '8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-df81102b-0b75-4515-9da7-19bf56e9cf03', '', '', '', '', '', 'aaaAAAAAAAAAAAA', '', '', '', '', '美国', NULL, '', NULL, NULL, NULL, '', NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-f6cfa3c9-195a-4bcb-a232-48270414021d', '', '', '', '', '', '', '', '', '', '', '', NULL, '', NULL, NULL, NULL, '', NULL, 'notice.png', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-f81c179e-9652-4cf5-a97c-5e97c490a788', NULL, 'ds', 'sdsd', 'sdsds', NULL, 'dddsd', 'dsds', 'dsd', 'dsd', 'dsds', NULL, '2018-09-04', NULL, '2018-09-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent` VALUES ('p-fb24ac14-9c56-4aad-bcaf-9bfdaf0d397b', 'notice.png', '', '', '', NULL, 'sasa', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for patent_accept
-- ----------------------------
DROP TABLE IF EXISTS `patent_accept`;
CREATE TABLE `patent_accept`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父ID',
  `assign_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '转让合同编号',
  `assign_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '转让方',
  `accept_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '受让方',
  `accept_date` date NULL DEFAULT NULL COMMENT '转让申请日',
  `accept_finish_date` date NULL DEFAULT NULL COMMENT '转让完成日',
  `other` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`, `pid`) USING BTREE,
  INDEX `pid`(`pid`) USING BTREE,
  CONSTRAINT `patent_accept_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `patent` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of patent_accept
-- ----------------------------
INSERT INTO `patent_accept` VALUES ('i-zr2007-bed74218-22af-43f5-ac80-7cb55dd941e4', 'i-p-5fd861ab-8c73-4a38-8796-75038089880c', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-16ea8dc5-0879-4f13-8000-01a68b17f8b9', 'p-3c858771-b176-4a1a-8d85-9344917535b4', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-1daea7af-ec96-4b06-b5e6-9d4d2b99dbdb', 'p-5e7332ee-429c-46d0-8d16-983c1a0016a8', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-4c735e0d-eb0e-4016-9a99-d9699aacff65', 'p-217f9d91-2868-4dda-adf7-7d9af4299874', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-563c6266-a9a9-4a38-9f6f-679d847f9358', 'p-29a37039-770c-4da7-b5ff-9df88c6a05ec', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-5f586668-063c-4508-84c8-18c8e12cf1fe', 'p-791e68b5-8406-4391-9e4f-5d5ac851a2e2', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-6ef3eebc-b0d0-4e75-9690-b66fce48baa5', 'p-df81102b-0b75-4515-9da7-19bf56e9cf03', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-7fa98d76-5295-4203-8f30-e5ecba32a47b', 'p-8438bef8-0773-4de4-a6fa-3636392750c6', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-8e51138f-2e45-4f69-821f-a86814e5640c', 'p-fb24ac14-9c56-4aad-bcaf-9bfdaf0d397b', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-a06a3499-6136-4b17-b606-60845bdf9d5f', 'p-f6cfa3c9-195a-4bcb-a232-48270414021d', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-a6b2c2da-fa0c-4d4a-a097-99a190b7c364', 'p-82124d67-40b3-413b-8575-19be89692f58', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-b1ec9c6e-7910-4b02-a932-7c3479ea3ce0', 'p-1cb3f336-d680-417a-9634-3c94f89439ee', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-c22a623b-e4df-4cc3-a2b1-aab965470599', 'p-f81c179e-9652-4cf5-a97c-5e97c490a788', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-ec5d06bb-6297-48af-8ed7-f35a6798ca7b', 'p-1b9d595c-cfb0-4562-bb80-ed377c5efa16', '', '', '', NULL, NULL, '');
INSERT INTO `patent_accept` VALUES ('zr-f2483d31-bd1d-4b77-b2e1-22466f4cf878', 'p-5aac1b47-7ac9-475c-9bf4-ba37de121e1a', '', '', '', NULL, NULL, '');
INSERT INTO `patent_accept` VALUES ('zr-f431e751-3049-4ea8-afde-409ef5f717fc', 'p-614322c2-f30c-4ffb-ae21-ec391161ff4c', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-fb2eac4c-94ff-44ac-b5b8-88bb324615f0', 'p-44267e78-2ad0-4120-adae-2db185de2423', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_accept` VALUES ('zr-fb8e2961-4f10-4530-9061-e587429141ca', 'p-83c2cfb0-d258-492b-a7ae-8b50274e7d66', NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for patent_invalid_declare
-- ----------------------------
DROP TABLE IF EXISTS `patent_invalid_declare`;
CREATE TABLE `patent_invalid_declare`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '专利无效宣告主键ID',
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '外键关联',
  `invalid_ower` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '提无效公司/人\r\n',
  `invalid_files` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '无效申请/答辩文件',
  `results` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '裁定结果',
  PRIMARY KEY (`id`, `pid`) USING BTREE,
  INDEX `pid`(`pid`) USING BTREE,
  CONSTRAINT `patent_invalid_declare_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `patent` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of patent_invalid_declare
-- ----------------------------
INSERT INTO `patent_invalid_declare` VALUES ('i-wx2007-408f86a1-f8d3-44dc-b467-082f31afbc7d', 'i-p-5fd861ab-8c73-4a38-8796-75038089880c', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-01ce3476-1d69-4c53-b8b5-fa7c7be6b17e', 'p-1cb3f336-d680-417a-9634-3c94f89439ee', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-26918367-9690-47d8-a407-0c6326e69425', 'p-df81102b-0b75-4515-9da7-19bf56e9cf03', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-38706599-4e84-49da-bec6-0ef7f6f54ac7', 'p-217f9d91-2868-4dda-adf7-7d9af4299874', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-47101ddd-5a10-4b4f-abbb-263a2fd344ce', 'p-f6cfa3c9-195a-4bcb-a232-48270414021d', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-58ab5ce4-7e7a-4d5e-84e8-22ccfd00b183', 'p-f81c179e-9652-4cf5-a97c-5e97c490a788', 'dsd', NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-61916017-9bd8-42ca-8ad8-937fa3f48570', 'p-8438bef8-0773-4de4-a6fa-3636392750c6', '', '', '');
INSERT INTO `patent_invalid_declare` VALUES ('wx-666ad267-7f43-4069-a0a1-5dbeaa74793d', 'p-29a37039-770c-4da7-b5ff-9df88c6a05ec', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-6c71e4c1-a638-476a-83ca-b66451b1289d', 'p-44267e78-2ad0-4120-adae-2db185de2423', '', NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-771398b9-198f-439c-b546-40fe77db98bd', 'p-fb24ac14-9c56-4aad-bcaf-9bfdaf0d397b', '', NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-901088b8-c571-483a-91f8-2fe7ca1549da', 'p-82124d67-40b3-413b-8575-19be89692f58', '', 'CentOS6安装.docx', NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-a226e1fd-5142-4f01-8e55-de6ba916c371', 'p-5aac1b47-7ac9-475c-9bf4-ba37de121e1a', '', NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-a44acb66-2b2e-44c9-afdc-e403e6358b21', 'p-791e68b5-8406-4391-9e4f-5d5ac851a2e2', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-ae595bc4-1287-4668-8dce-fff90b16bcc4', 'p-614322c2-f30c-4ffb-ae21-ec391161ff4c', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-c01730af-b38c-4e39-95fd-e3caa90ee6b9', 'p-5e7332ee-429c-46d0-8d16-983c1a0016a8', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-ca9ac048-9d80-4b0e-a52d-f709c89164aa', 'p-83c2cfb0-d258-492b-a7ae-8b50274e7d66', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wx-f5ed94fc-4075-46fd-b2e7-e3c5038d12e0', 'p-1b9d595c-cfb0-4562-bb80-ed377c5efa16', NULL, NULL, NULL);
INSERT INTO `patent_invalid_declare` VALUES ('wxe1734560-5c2a-437b-aa4e-eadbe243e524', 'p-3c858771-b176-4a1a-8d85-9344917535b4', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for patent_lawsuit
-- ----------------------------
DROP TABLE IF EXISTS `patent_lawsuit`;
CREATE TABLE `patent_lawsuit`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父ID',
  `suit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '提诉讼公司/人',
  `solicitor` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '诉讼律师',
  `lawyer` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应诉律师',
  `process` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '诉讼过程',
  `results` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '诉讼结果',
  `other` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`, `pid`) USING BTREE,
  INDEX `pid`(`pid`) USING BTREE,
  CONSTRAINT `patent_lawsuit_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `patent` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of patent_lawsuit
-- ----------------------------
INSERT INTO `patent_lawsuit` VALUES ('i-ss2007-10e595f8-abc5-47f4-b578-4b7b26f55c28', 'i-p-5fd861ab-8c73-4a38-8796-75038089880c', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-0e593a4e-86ca-4a9b-9121-cc57e5e73553', 'p-217f9d91-2868-4dda-adf7-7d9af4299874', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-132b92e8-caa4-4910-978c-6ab80df9df68', 'p-29a37039-770c-4da7-b5ff-9df88c6a05ec', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-13e6f024-5a6a-4cd5-b4c2-e58e3943a5c6', 'p-82124d67-40b3-413b-8575-19be89692f58', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-1cdf1c9e-8cc1-4a02-b334-8b6dc82edba1', 'p-5aac1b47-7ac9-475c-9bf4-ba37de121e1a', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-2fe9514b-ae89-43fd-94bd-df00fc2eed62', 'p-1b9d595c-cfb0-4562-bb80-ed377c5efa16', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-34c67890-0b01-4bdb-b8ca-b9a9216d87af', 'p-df81102b-0b75-4515-9da7-19bf56e9cf03', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-42165ee7-141b-4546-be2e-af27126a451b', 'p-1cb3f336-d680-417a-9634-3c94f89439ee', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-4b2a179d-39dd-4033-8858-4ec04165709a', 'p-83c2cfb0-d258-492b-a7ae-8b50274e7d66', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-7ac25f73-47c3-4e6a-9ac8-7ebc075c5b71', 'p-791e68b5-8406-4391-9e4f-5d5ac851a2e2', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-830f6450-ea24-4906-b10b-668ba40edca3', 'p-f6cfa3c9-195a-4bcb-a232-48270414021d', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-9a66e224-3aef-45e1-b32d-b7fc6413a11d', 'p-614322c2-f30c-4ffb-ae21-ec391161ff4c', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-ac690d4f-d9ed-4380-a238-6140b3e8e37e', 'p-44267e78-2ad0-4120-adae-2db185de2423', '', '', '', NULL, NULL, '');
INSERT INTO `patent_lawsuit` VALUES ('ss-c40f1ebe-cdff-4d6f-a749-c3c68d902070', 'p-5e7332ee-429c-46d0-8d16-983c1a0016a8', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-c44e3849-ccc3-41c1-a6e6-064431c410c8', 'p-3c858771-b176-4a1a-8d85-9344917535b4', '', '', '', NULL, NULL, '');
INSERT INTO `patent_lawsuit` VALUES ('ss-cbd83d29-e877-4e55-b009-f864792008f8', 'p-8438bef8-0773-4de4-a6fa-3636392750c6', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-e90cb1c1-6d3a-4097-afad-8c1a995f9ac5', 'p-f81c179e-9652-4cf5-a97c-5e97c490a788', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patent_lawsuit` VALUES ('ss-ff56f236-7e85-44ad-a254-66000e7e5b28', 'p-fb24ac14-9c56-4aad-bcaf-9bfdaf0d397b', NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for patent_renewals
-- ----------------------------
DROP TABLE IF EXISTS `patent_renewals`;
CREATE TABLE `patent_renewals`  (
  `id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `technicalClf` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '技术分类',
  `patentName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专利名称',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图示',
  `patentType` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专利类型',
  `protectedAreas` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '保护地域',
  `applyType` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请类型',
  `applyDate` date NULL DEFAULT NULL COMMENT '申请日',
  `applyName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请人',
  `applyNumber` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请号',
  `state` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '法律状态',
  `accreditDate` date NULL DEFAULT NULL COMMENT '授权公告日',
  `patentNumber` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专利号',
  `agency` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代理机构',
  `annualFee` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年费缴纳',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of patent_renewals
-- ----------------------------
INSERT INTO `patent_renewals` VALUES ('09206194-0bc7-4b36-b5d7-6d7abb40ac07', 'dasdasdsa', 'dasdsa', NULL, 'adssa', 'dasd', 'dsadsa', '2018-05-11', 'dsadsa', 'dasdas', '', '2018-05-11', 'sadd', 'dasd', '');
INSERT INTO `patent_renewals` VALUES ('16c4ea7c-8102-4bf1-a782-b662457e7a10', 'ZXZ', 'XZX', NULL, 'zxc', 'XZ', 'czxc', '2018-05-13', 'czxczcxc', 'cxzcx', '', '2018-05-13', 'zcxc', 'czxc', 'zcxcz');
INSERT INTO `patent_renewals` VALUES ('2ccce0cb-eedc-4b11-8f54-a67d1d54c495', 'dasdasdsa', 'dasdsa', NULL, 'adssa', 'dasd', 'dsadsa', '2018-05-11', 'dsadsa', 'dasdas', '', '2018-05-11', 'sadd', 'dasd', '');
INSERT INTO `patent_renewals` VALUES ('46c9e34a-7ed4-4713-90e6-1e91ac871831', 'ffdgd', 'gfdg', NULL, 'gfdgfd', 'dgf', 'gdfg', '2018-05-11', 'gfdg', 'gfdg', '', '2018-05-11', 'gdfg', 'gfdfg', '');
INSERT INTO `patent_renewals` VALUES ('49f815e8-2218-41c9-a5e4-7a9e7862f0c6', 'ffdgd', 'gfdg', NULL, 'gfdgfd', 'dgf', 'gdfg', '2018-05-11', 'gfdg', 'gfdg', '', '2018-05-11', 'gdfg', 'gfdfg', '');
INSERT INTO `patent_renewals` VALUES ('5bea7a6c-a695-4e25-9910-cd315f446d29', 'ffdgd', 'gfdg', NULL, 'gfdgfd', 'dgf', 'gdfg', '2018-05-11', 'gfdg', 'gfdg', '', '2018-05-11', 'gdfg', 'gfdfg', '');
INSERT INTO `patent_renewals` VALUES ('792255e7-788f-42eb-903b-02e54368fc33', 'dasdasdsa', 'dasdsa', NULL, 'adssa', 'dasd', 'dsadsa', '2018-05-11', 'dsadsa', 'dasdas', '', '2018-05-11', 'sadd', 'dasd', '');
INSERT INTO `patent_renewals` VALUES ('89e1ed01-1384-4127-9d6a-0efd93b0a785', 'ffdgd', 'gfdg', NULL, 'gfdgfd', 'dgf', 'gdfg', '2018-05-11', 'gfdg', 'gfdg', '', '2018-05-11', 'gdfg', 'gfdfg', '');
INSERT INTO `patent_renewals` VALUES ('902e9972-02c8-401a-a2e1-16d80918c8f6', 'dasdasdsa', 'dasdsa', NULL, 'adssa', 'dasd', 'dsadsa', '2018-05-11', 'dsadsa', 'dasdas', '', '2018-05-11', 'sadd', 'dasd', '');
INSERT INTO `patent_renewals` VALUES ('c8f2146a-d793-4d55-b3e7-d44d912c4423', 'ffdgd', 'gfdg', NULL, 'gfdgfd', 'dgf', 'gdfg', '2018-05-11', 'gfdg', 'gfdg', '', '2018-05-11', 'gdfg', 'gfdfg', '');
INSERT INTO `patent_renewals` VALUES ('d611c3c8-3290-4618-a135-2c00f314555c', 'dasd', 'dsfd', NULL, 'dasdsa', 'fsdfds', 'dasdasd', '2018-05-11', 'dsfdsf', 'fsdf', '', '2018-05-11', 'fdsf', 'fsd', 'fs');
INSERT INTO `patent_renewals` VALUES ('d748378b-ecd4-4ca0-8937-c3e6b5bb8b70', 'ffdgd', 'gfdg', NULL, 'gfdgfd', 'dgf', 'gdfg', '2018-05-10', 'gfdg', 'gfdg', '', '2018-05-10', 'gdfg', 'gfdfg', '');
INSERT INTO `patent_renewals` VALUES ('d98ef4bd-f87b-4da6-806d-7976ad84352f', 'dasdasdsa', 'dasdsa', NULL, 'adssa', 'dasd', 'dsadsa', '2018-05-11', 'dsadsa', 'dasdas', '', '2018-05-11', 'sadd', 'dasd', '');
INSERT INTO `patent_renewals` VALUES ('e306fc9c-3dd9-493c-8633-7ead98bd8026', 'dasdasdsa', 'dasdsa', NULL, 'adssa', 'dasd', 'dsadsa', '2018-05-11', 'dsadsa', 'dasdas', '', '2018-05-11', 'sadd', 'dasd', '');
INSERT INTO `patent_renewals` VALUES ('eb41ee62-8e2c-4a7d-90ae-7db6a3bdf53e', 'dasd', 'dasdsa', NULL, 'adssa', 'dasd', 'dsadsa', '2018-05-11', 'dsadsa', 'dasdas', '', '2018-05-11', 'sadd', 'dasd', '');
INSERT INTO `patent_renewals` VALUES ('test001', '支撑座体', 'abcskkjdskfhkd', 'upload/images/ok.png', '发明', '美国', '巴黎公约', '2016-11-24', 'Oli', 'US98938', '授权', '2009-12-08', 'USkk12', '上海智信', '完成2017/11/6缴纳 ');

-- ----------------------------
-- Table structure for patent_renewals_new
-- ----------------------------
DROP TABLE IF EXISTS `patent_renewals_new`;
CREATE TABLE `patent_renewals_new`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '外键ID',
  `annual_fee` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年份缴纳',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `pid`(`pid`) USING BTREE,
  CONSTRAINT `patent_renewals_new_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `patent` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of patent_renewals_new
-- ----------------------------
INSERT INTO `patent_renewals_new` VALUES ('i-xz2007-1f2ac7c7-7964-453d-b62e-b97ff30b7f03', 'i-p-5fd861ab-8c73-4a38-8796-75038089880c', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-25008e71-5441-4f46-9df5-b4e868c29338', 'p-614322c2-f30c-4ffb-ae21-ec391161ff4c', '');
INSERT INTO `patent_renewals_new` VALUES ('xz-2677902f-09cd-4874-bd67-630173db149a', 'p-1cb3f336-d680-417a-9634-3c94f89439ee', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-3428ab91-de10-4293-b014-67b772408402', 'p-3c858771-b176-4a1a-8d85-9344917535b4', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-3a593623-0d95-4efc-8678-badce10fa5bf', 'p-df81102b-0b75-4515-9da7-19bf56e9cf03', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-4f7ca753-72c3-4b2c-a7bd-67de324952be', 'p-f6cfa3c9-195a-4bcb-a232-48270414021d', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-7259efee-e1b5-4a55-a98b-5582fe81720f', 'p-5e7332ee-429c-46d0-8d16-983c1a0016a8', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-75f3075c-b36f-4734-b167-df679e4c7bd5', 'p-82124d67-40b3-413b-8575-19be89692f58', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-819c162b-60b9-4940-9b86-2308d2b81e42', 'p-fb24ac14-9c56-4aad-bcaf-9bfdaf0d397b', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-8c37b9ce-8d59-41b1-a118-9b583d4fbc37', 'p-44267e78-2ad0-4120-adae-2db185de2423', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-8c46a93a-5042-415b-a536-7c7d14fad26e', 'p-f81c179e-9652-4cf5-a97c-5e97c490a788', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-94a75f20-7ef7-47ab-938e-1ee6d9c33145', 'p-5aac1b47-7ac9-475c-9bf4-ba37de121e1a', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-a82168e5-dd67-4414-b313-5408e89eb843', 'p-29a37039-770c-4da7-b5ff-9df88c6a05ec', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-af2998c2-ba94-485b-ae8f-7999411c12da', 'p-217f9d91-2868-4dda-adf7-7d9af4299874', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-cb659e2f-3b2f-4cff-a291-cb4c82735686', 'p-1b9d595c-cfb0-4562-bb80-ed377c5efa16', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-f4978c0d-d58a-420c-89bf-f541f9b4d39a', 'p-83c2cfb0-d258-492b-a7ae-8b50274e7d66', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-f59c1243-2a53-47b0-8eb1-8dc5863d0606', 'p-8438bef8-0773-4de4-a6fa-3636392750c6', NULL);
INSERT INTO `patent_renewals_new` VALUES ('xz-fa3ae61b-35f8-4a65-be7f-b72f7a2dae17', 'p-791e68b5-8406-4391-9e4f-5d5ac851a2e2', NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名称',
  `birthday` date NULL DEFAULT NULL COMMENT '生日',
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `address` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `ext1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段1',
  `ext2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段2',
  `ext3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段3',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('3b01a474-6818-48a8-855a-0c894c77baf2', 'nb', '2018-07-16', NULL, '宁波', '202cb962ac59075b964b07152d234b70', '1', NULL, NULL);
INSERT INTO `user` VALUES ('7bc83162-c7d4-415a-bd8a-06acf08b9986', 'qd', '2018-06-04', NULL, '青岛', '202cb962ac59075b964b07152d234b70', '1', NULL, NULL);
INSERT INTO `user` VALUES ('80fb6032-be4d-41b0-b420-0d9cbc73ff45', 'admin', NULL, NULL, NULL, '202cb962ac59075b964b07152d234b70', '1', NULL, NULL);
INSERT INTO `user` VALUES ('aa33bbac-9fb9-407b-8513-802d24132033', 'usa', '2018-05-09', NULL, '美国', '202cb962ac59075b964b07152d234b70', '1', NULL, NULL);
INSERT INTO `user` VALUES ('b24ec3e1-05ad-485f-96e2-a96d0d3f3102', 'vip', NULL, NULL, '宁波,美国', '202cb962ac59075b964b07152d234b70', '1', NULL, NULL);
INSERT INTO `user` VALUES ('test1', 'test1', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test10', 'test10', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test11', 'test11', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test12', 'test12', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test2', 'test2', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test3', 'test3', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test4', 'test4', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test5', 'test5', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test6', 'test6', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test7', 'test7', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test8', 'test8', NULL, NULL, NULL, NULL, '0', NULL, NULL);
INSERT INTO `user` VALUES ('test9', 'test9', NULL, NULL, NULL, NULL, '0', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
