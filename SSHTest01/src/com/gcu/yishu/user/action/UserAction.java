package com.gcu.yishu.user.action;

public interface UserAction {
	
	public String add();//ע��
	public String login();//�û���¼
	public String update();//�û���Ϣ�޸�
	
	/*
	 * ����Order�����
	 * */
	public String addOrder();//���order����
	public String findOrder();//��ѯ�û�����
	
	public String ToRegister();//��ת��ע��ҳ��
	public String ToLogin();//��ת����¼����
}
