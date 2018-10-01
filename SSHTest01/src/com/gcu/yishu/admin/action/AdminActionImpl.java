package com.gcu.yishu.admin.action;

import com.gcu.yishu.admin.pojos.AdminUser;
import com.gcu.yishu.admin.service.AdminServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminActionImpl extends ActionSupport implements ModelDriven<AdminUser>, AdminAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = -400871074364959575L;
	
	private AdminUser adminUser=new AdminUser(); 
	private AdminServiceImpl adminServiceImpl;
	
	public void setAdminServiceImpl(AdminServiceImpl adminServiceImpl)
	{
		this.adminServiceImpl=adminServiceImpl;
	}

	@Override
	public String add() {
		// TODO Auto-generated method stub
		System.out.println("admin add action success");
		System.out.println("adminuser"+adminUser.toString());
		System.out.println("adminUsername"+adminUser.getAdminName());
		System.out.println("adminPassword"+adminUser.getAdminPassword());
		adminServiceImpl.Admin_Add(adminUser);
		return null;
	}

	@Override
	public String login() {
		// TODO Auto-generated method stub
		String message = adminServiceImpl.Admin_Login();
		return message;
	}
	
	@Override
	public AdminUser getModel() {
		// TODO Auto-generated method stub
		return adminUser;
	}

}
