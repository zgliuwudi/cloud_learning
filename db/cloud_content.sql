DROP DATABASE IF EXISTS `cloud_content`;
CREATE DATABASE cloud_content CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE cloud_content;

DROP TABLE IF EXISTS cms_banner;

/*==============================================================*/
/* Table: cms_banner                                            */
/*==============================================================*/
CREATE TABLE cms_banner
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   img_url              VARCHAR(500) COMMENT '图片路径',
   title                VARCHAR(500) COMMENT '标题',
   display_order        INT COMMENT '排序',
   ENABLE               TINYINT COMMENT '是否显示',
   render_type          TINYINT COMMENT '跳转类型',
   render_url           VARCHAR(500) COMMENT '跳转路径',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

ALTER TABLE cms_banner COMMENT '内容-横幅广告表';

DROP TABLE IF EXISTS cms_news;

/*==============================================================*/
/* Table: cms_news                                              */
/*==============================================================*/
CREATE TABLE cms_news
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   image_url            VARCHAR(500) COMMENT '图片路径',
   title                VARCHAR(500) COMMENT '标题',
   display_order        INT COMMENT '排序',
   render_url           VARCHAR(500) COMMENT '跳转路径',
   ENABLE               TINYINT COMMENT '是否显示',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

ALTER TABLE cms_news COMMENT '内容-资讯表';
