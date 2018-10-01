package com.gcu.yishu.admin.pojos;

import java.io.Serializable;

public class AdminUser implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2342242700377890668L;
	
	private Integer uid;
	private String adminName;
	private String adminPassword;
	
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
}
