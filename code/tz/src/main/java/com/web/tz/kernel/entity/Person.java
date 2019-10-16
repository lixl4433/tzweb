package com.web.tz.kernel.entity;

import org.springframework.stereotype.Component;

import com.web.tz.web.contorller.constants.BaseEntity;

@Component
public class Person extends BaseEntity{
	
	private String id;
	private String xm;
	private String zjhm;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getZjhm() {
		return zjhm;
	}

	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}

}
