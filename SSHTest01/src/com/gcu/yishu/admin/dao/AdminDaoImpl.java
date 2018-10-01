package com.gcu.yishu.admin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.gcu.yishu.admin.pojos.AdminUser;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao{

	@Override
	public AdminUser Admin_Login() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Admin_Add(AdminUser adminUser) {
		// TODO Auto-generated method stub
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(adminUser);
		transaction.commit();
		session.close();
		return null;
	}
	
}
