package com.web.tz.kernel.entity;

import org.springframework.stereotype.Component;

import com.web.tz.web.contorller.constants.BaseEntity;

@Component
public class Person extends BaseEntity{
	
	private String id;
	private String xm;
	private int xb;
	private String sfzh;
	
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
	public int getXb() {
		return xb;
	}
	public void setXb(int xb) {
		this.xb = xb;
	}
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

}
