package com.gcu.yishu.admin.service;

import com.gcu.yishu.admin.dao.AdminDaoImpl;
import com.gcu.yishu.admin.pojos.AdminUser;

public class AdminServiceImpl implements AdminService{

	private AdminDaoImpl adminDaoImpl;
	
	public void setAdminDaoImpl(AdminDaoImpl adminDaoImpl)
	{
		this.adminDaoImpl=adminDaoImpl;
	}
	
	@Override
	public String Admin_Login() {
		// TODO Auto-generated method stub
		adminDaoImpl.Admin_Login();
		return null;
	}

	@Override
	public String Admin_Add(AdminUser adminUser) {
		// TODO Auto-generated method stub
		adminDaoImpl.Admin_Add(adminUser);
		return null;
	}


}
