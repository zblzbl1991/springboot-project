package com.zbl.entity.enumeration;

/**
 * 性别枚举
 */
public enum Sex {
	male(1,"男"),female(0,"女");
	private Integer sex;
	private String text;

	Sex(Integer sex, String text) {
		this.sex = sex;
		this.text = text;
	}
}
