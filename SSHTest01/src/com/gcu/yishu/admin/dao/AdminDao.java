package com.gcu.yishu.admin.dao;

import com.gcu.yishu.admin.pojos.AdminUser;

public interface AdminDao {
	
	public AdminUser Admin_Login();//管理员登录
	public String Admin_Add(AdminUser adminUser);//添加管理员
}
