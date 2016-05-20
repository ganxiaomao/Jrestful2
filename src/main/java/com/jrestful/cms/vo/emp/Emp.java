package com.jrestful.cms.vo.emp;

import java.io.Serializable;

public class Emp implements Serializable  {
	
	private static final long serialVersionUID = 8200660249985482355L;

	private String id;
	
	private String name;
	
	private String sex;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
