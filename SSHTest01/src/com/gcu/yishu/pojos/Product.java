package com.gcu.yishu.pojos;

import java.util.Date;

public class Product {
	private Integer pro_ID;//产品号
	private String pro_Name;//产品名称
	private String pro_Press;//出版社
	private String pro_Author;//作者
	private Date pro_PublishTime;//发放时间
	
	public Integer getPro_ID() {
		return pro_ID;
	}
	public void setPro_ID(Integer pro_ID) {
		this.pro_ID = pro_ID;
	}
	public String getPro_Name() {
		return pro_Name;
	}
	public void setPro_Name(String pro_Name) {
		this.pro_Name = pro_Name;
	}
	public String getPro_Press() {
		return pro_Press;
	}
	public void setPro_Press(String pro_Press) {
		this.pro_Press = pro_Press;
	}
	public String getPro_Author() {
		return pro_Author;
	}
	public void setPro_Author(String pro_Author) {
		this.pro_Author = pro_Author;
	}
	public Date getPro_PublishTime() {
		return pro_PublishTime;
	}
	public void setPro_PublishTime(Date pro_PublishTime) {
		this.pro_PublishTime = pro_PublishTime;
	}
}
