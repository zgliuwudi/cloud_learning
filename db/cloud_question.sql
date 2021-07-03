
DROP DATABASE IF EXISTS `cloud_qms`;
CREATE DATABASE cloud_qms CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

USE cloud_qms;
DROP TABLE IF EXISTS qms_question;
/*==============================================================*/
/* Table: qms_question                                          */
/*==============================================================*/
CREATE TABLE qms_question
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   title                VARCHAR(500) COMMENT '题目标题',
   answer               VARCHAR(15000) COMMENT '题目解答',
   LEVEL                TINYINT COMMENT '题目难度等级',
   display_order        INT COMMENT '排序',
   sub_title            VARCHAR(500) COMMENT '副标题',
   TYPE                 BIGINT COMMENT '题目类型',
   ENABLE               TINYINT COMMENT '是否显示',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

DROP TABLE IF EXISTS qms_type;
/*==============================================================*/
/* Table: qms_type                                              */
/*==============================================================*/
CREATE TABLE qms_type
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   TYPE                 CHAR(64) COMMENT '类型名称',
   comments             CHAR(64) COMMENT '备注',
   logo_url             VARCHAR(500) COMMENT '类型logo路径',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);
ALTER TABLE qms_type COMMENT '题目-题目类型表';
