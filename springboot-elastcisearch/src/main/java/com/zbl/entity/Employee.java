package com.zbl.entity;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author zhaobaolong
 * @Title: Employee
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/12/411:19
 */
@Document(indexName = "project",type = "employee")
public class Employee {
	private Integer id;
	private String lastName;
	private String email;
	private Integer gender;
	private Integer dId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}
}
