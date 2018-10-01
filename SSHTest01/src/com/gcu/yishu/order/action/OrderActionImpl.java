package com.gcu.yishu.order.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.gcu.yishu.order.pojos.Order;
import com.gcu.yishu.order.service.OrderService;
import com.gcu.yishu.user.pojos.User;
import com.gcu.yishu.util.session.SessionUtil;
import com.opensymphony.xwork2.ModelDriven;

public class OrderActionImpl implements ModelDriven<Order>, OrderAction{

	private OrderService orderService;
	private SessionUtil sessionUtil;
	private User user;
	private Order item = new Order();
	
	public void setOrderService(OrderService orderService)
	{
		this.orderService=orderService;
	}
	public void setSessionUtil(SessionUtil sessionUtil)
	{
		this.sessionUtil=sessionUtil;
	}
	
	@Override
	public void addOrderList() {
		// TODO Auto-generated method stub
		System.out.println("addItemList Action Test");
		
		Date date = null;
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		
		try {
			date = formatter.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(dateString);
		System.out.println(date);
		
		item.setCreateTime(date);
		item.setIsitarrive(1);
		item.setIsitOnline(1);
		item.setIsitPay(1);
		user=(User)sessionUtil.getSession().get("UserList");
		System.out.println("session Get Test:"+user);
		item.setUser(user);
		System.out.println("Item getUser Test:"+item.getUser());
		
		orderService.addOrderList(item);
//		return message;
	}

	@Override
	public String findOrderList() {
		// TODO Auto-generated method stub
		User user=(User)sessionUtil.getSession().get("UserList");
		System.out.println("findItemList Action Test");
		List<Order> item=orderService.findOrderList(user);
		for(Order isitem:item)
		{
			System.out.println(user+"->Item: "+isitem.getOrder_Id());
			System.out.println(user+"->Item: "+isitem.getCreateTime());
			System.out.println(user+"->Item: "+isitem.getIsitarrive());
		}
		return "successfindItem";
	}

	@Override
	public Order getModel() {
		// TODO Auto-generated method stub
		return item;
	}

}

