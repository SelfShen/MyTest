package com.gcu.yishu.order.pojos;

import java.util.Date;

import com.gcu.yishu.user.pojos.User;

public class Order {
	/*
	 * IsitPay,Isitarrive,IsitOnlineĬ��ֵΪ0
	 */
	private Integer Order_Id;//�������
	private Date CreateTime;//��������ʱ��(�Զ���ȡϵͳʱ��)
	private Integer IsitPay;//����֧��״̬(0:δ֧��,1:��֧��)
	private Integer Isitarrive;//��������״̬(0:δ����,1:�ѽ���)
	private Integer IsitOnline;//�Ƿ�ͨ�����Ͻ���(0:��,1����)
	private Integer Pro_sum;//��Ʒ��������

	private User user;//�����û�
//	private Product product;//��Ʒ��Ϣ
	
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