DROP DATABASE IF EXISTS `cloud_member`;
CREATE DATABASE cloud_member CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

USE cloud_member;

DROP TABLE IF EXISTS ums_member;

/*==============================================================*/
/* Table: ums_member                                            */
/*==============================================================*/

CREATE TABLE ums_member
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   mini_openid          INT COMMENT '小程序openid',
   mp_openid            VARCHAR(64) COMMENT '服务号openid',
   unionid              VARCHAR(64) COMMENT '微信unionid',
   level_id             BIGINT COMMENT '会员等级id',
   user_name            CHAR(64) COMMENT '用户名',
   PASSWORD             VARCHAR(64) COMMENT '密码',
   nickname             VARCHAR(64) COMMENT '昵称',
   phone                VARCHAR(20) COMMENT '手机号码',
   email                VARCHAR(64) COMMENT '邮箱',
   avatar               VARCHAR(500) COMMENT '头像',
   gender               TINYINT COMMENT '性别',
   birth                DATE COMMENT '生日',
   city                 VARCHAR(500) COMMENT '所在城市',
   source_type          TINYINT COMMENT '用户来源',
   integration          INT COMMENT '积分',
   register_time        DATETIME COMMENT '注册时间',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

ALTER TABLE ums_member COMMENT '会员-会员表';

DROP TABLE IF EXISTS ums_growth_change_history;

/*==============================================================*/
/* Table: ums_growth_change_history                             */
/*==============================================================*/
CREATE TABLE ums_growth_change_history
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   member_id            BIGINT COMMENT '会员id',
   change_count         INT COMMENT '改变的值（正负计数）',
   note                 VARCHAR(500) COMMENT '备注',
   source_type          TINYINT COMMENT '0->扫码；1->搜索;2->分享',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

ALTER TABLE ums_growth_change_history COMMENT '会员-积分值变化历史记录表';


