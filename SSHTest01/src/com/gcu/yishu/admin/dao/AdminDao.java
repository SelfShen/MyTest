package com.gcu.yishu.admin.dao;

import com.gcu.yishu.admin.pojos.AdminUser;

public interface AdminDao {
	
	public AdminUser Admin_Login();//����Ա��¼
	public String Admin_Add(AdminUser adminUser);//��ӹ���Ա
}
