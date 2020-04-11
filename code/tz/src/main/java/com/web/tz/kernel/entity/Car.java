package com.web.tz.kernel.entity;

import org.springframework.stereotype.Component;

import com.web.tz.web.contorller.constants.BaseEntity;

@Component
public class Car extends BaseEntity{
	private int id;
	private int lx;
	private String cph;
	private String comment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLx() {
		return lx;
	}
	public void setLx(int lx) {
		this.lx = lx;
	}
	public String getCph() {
		return cph;
	}
	public void setCph(String cph) {
		this.cph = cph;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
