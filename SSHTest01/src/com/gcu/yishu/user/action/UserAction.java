package com.gcu.yishu.user.action;

public interface UserAction {
	
	public String add();//注册
	public String login();//用户登录
	public String update();//用户信息修改
	
	/*
	 * 测试Order组件用
	 * */
	public String addOrder();//添加order订单
	public String findOrder();//查询用户订单
	
	public String ToRegister();//跳转到注册页面
	public String ToLogin();//跳转到登录界面
}
