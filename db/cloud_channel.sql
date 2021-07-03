DROP DATABASE IF EXISTS `cloud_channel`;
CREATE DATABASE cloud_channel CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE cloud_channel;

DROP TABLE IF EXISTS chms_channel;

/*==============================================================*/
/* Table: chms_channel                                          */
/*==============================================================*/
CREATE TABLE chms_channel
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   NAME                 VARCHAR(100) COMMENT '渠道名称',
   appid                VARCHAR(100) COMMENT '渠道appid',
   appsecret            VARCHAR(500) COMMENT '渠道appsecret',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

ALTER TABLE chms_channel COMMENT '渠道-渠道表';


DROP TABLE IF EXISTS chms_access_token;

/*==============================================================*/
/* Table: chms_access_token                                     */
/*==============================================================*/
CREATE TABLE chms_access_token
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   access_token         VARCHAR(500) COMMENT 'access_token',
   expire_time          DATETIME COMMENT '到期时间',
   channel_id           BIGINT COMMENT '渠道id',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

ALTER TABLE chms_access_token COMMENT '渠道-认证表';
