package com.gcu.yishu.order.service;

import java.util.List;

import com.gcu.yishu.order.pojos.Order;
import com.gcu.yishu.user.pojos.User;

public interface OrderService {

	/*ͨ���û�������û�����*/
	public String addOrderList(Order order);
	/*ͨ���û������Ҷ�Ӧ����*/
	List<Order> findOrderList(User user);
}
