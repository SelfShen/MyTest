package com.gcu.yishu.order.dao;

import java.util.List;

import com.gcu.yishu.order.pojos.Order;
import com.gcu.yishu.user.pojos.User;

public interface OrderDao {
	
	/*ͨ���û�������û�����*/
	public void addOrderList(Order order);
	/*ͨ���û������Ҷ�Ӧ����*/
	List<Order> findOrderList(User user);

}
