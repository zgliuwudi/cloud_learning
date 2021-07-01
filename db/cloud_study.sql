DROP DATABASE IF EXISTS `cloud_study`;
CREATE DATABASE cloud_study CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

USE cloud_study;

DROP TABLE IF EXISTS sms_study_time;

/*==============================================================*/
/* Table: sms_study_time                                        */
/*==============================================================*/
CREATE TABLE sms_study_time
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   ques_type            BIGINT COMMENT '题目类型id',
   member_id            BIGINT COMMENT '用户id',
   total_time           INT COMMENT '学习时常（分）',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

ALTER TABLE sms_study_time COMMENT '学习-用户学习时常表';

DROP TABLE IF EXISTS sms_view_log;

/*==============================================================*/
/* Table: sms_view_log                                          */
/*==============================================================*/
CREATE TABLE sms_view_log
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   ques_id              BIGINT COMMENT '题目id',
   ques_type            BIGINT COMMENT '题目类型id',
   member_id            BIGINT COMMENT '用户id',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

ALTER TABLE sms_view_log COMMENT '学习-用户学习浏览记录表';
