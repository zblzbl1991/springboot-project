package com.zbl.entity;

import com.zbl.entity.enumeration.Sex;

import java.io.Serializable;
import java.lang.annotation.Documented;

/**
 * @author zhaobaolong
 * @Title: User
 * @ProjectName springboot
 * @Description: 用户实体类
 * @date 2018/11/2315:22
 */


public class User implements Serializable{
	private static final long serialVersionUID = -5605388141197970541L;
	private Integer id;
	private String name;
	private Integer sex;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sex=" + sex +
				'}';
	}
}
