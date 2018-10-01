package com.gcu.yishu.order.pojos;

import java.util.Date;

import com.gcu.yishu.user.pojos.User;

public class Order {
	/*
	 * IsitPay,Isitarrive,IsitOnline默认值为0
	 */
	private Integer Order_Id;//订单编号
	private Date CreateTime;//订单生成时间(自动获取系统时间)
	private Integer IsitPay;//订单支付状态(0:未支付,1:已支付)
	private Integer Isitarrive;//订单交付状态(0:未交付,1:已交付)
	private Integer IsitOnline;//是否通过线上交易(0:否,1：是)
	private Integer Pro_sum;//商品购买数量

	private User user;//所属用户
//	private Product product;//商品信息
	
	public Integer getOrder_Id() {
		return Order_Id;
	}

	public void setOrder_Id(Integer order_Id) {
		Order_Id = order_Id;
	}

	public Date getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}

	public Integer getIsitPay() {
		return IsitPay;
	}

	public void setIsitPay(Integer isitPay) {
		IsitPay = isitPay;
	}

	public Integer getIsitarrive() {
		return Isitarrive;
	}

	public void setIsitarrive(Integer isitarrive) {
		Isitarrive = isitarrive;
	}

	public Integer getIsitOnline() {
		return IsitOnline;
	}

	public void setIsitOnline(Integer isitOnline) {
		IsitOnline = isitOnline;
	}
	
	public Integer getPro_sum() {
		return Pro_sum;
	}

	public void setPro_sum(Integer pro_sum) {
		Pro_sum = pro_sum;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}