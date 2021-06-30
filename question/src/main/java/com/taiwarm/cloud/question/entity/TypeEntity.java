package com.taiwarm.cloud.question.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 题目-题目类型表
 * 
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 05:06:56
 */
@Data
@TableName("qms_type")
public class TypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 类型名称
	 */
	private String type;
	/**
	 * 备注
	 */
	private String comments;
	/**
	 * 类型logo路径
	 */
	private String logoUrl;
	/**
	 * 删除标记（0-正常，1-删除）
	 */
	private Integer delFlag;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
