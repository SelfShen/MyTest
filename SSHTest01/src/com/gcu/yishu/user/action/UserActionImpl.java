package com.gcu.yishu.user.action;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.gcu.yishu.order.action.OrderAction;
import com.gcu.yishu.user.pojos.User;
import com.gcu.yishu.user.service.UserService;
import com.gcu.yishu.util.session.SessionUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserActionImpl extends ActionSupport implements SessionAware, ModelDriven<User>, UserAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7046918605087489712L;

	private UserService userService;
	private OrderAction orderAction;
	private User user = new User();// 模型驱动使用的对象
	private SessionUtil sessionUtil;
	
	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}

	public void setUserService(UserService userService)
	{
		this.userService=userService;
	}
	public void setOrderAction(OrderAction orderAction)
	{
		this.orderAction=orderAction;
	}
	public void setSessionUtil(SessionUtil sessionUtil)
	{
		this.sessionUtil=sessionUtil;
	}

	@Override
	public String add() {
		// TODO Auto-generated method stub
		System.out.println("user:"+user.toString());
		//保存新增
			try {
				if(user!=null){
					System.out.println("user Pass");
					System.out.println(user.getHeadImg());
					//处理头像
					if(user.getHeadImg()!=null){
						System.out.println("HeadImg Pass");
						//1、保存头像到upload/user
						//获取保存路径的绝对地址
						String filePath=ServletActionContext.getServletContext().getRealPath("upload/user");
						//生成带格式的随机文件名称
						String fileName=UUID.randomUUID().toString()+".jpg";
						//复制文件
						String path=filePath+fileName;
						File file =new File(path);
						FileUtils.copyFile(user.getHeadImg(),file);
						//2、设置用户头像路径
						user.setHeadImgPath(path);
					}
					System.out.println("Path Test");
//					System.out.println("HeadImg Test:"+user.getHeadImg().toString());
					System.out.println("userGetPath Test:"+user.getHeadImgPath());
					userService.User_add(user);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		return "success";
	}

	
	@Override
	public String login() {
		// TODO Auto-generated method stub
		System.out.println("User_Login test_01"+user.toString());
		List<User> users=userService.User_login(user,user.getSNO());
		if(users.equals(null)) return "error";
		for(User isuser:users)
		{
			if(isuser.getSNO().equals(user.getSNO())&&isuser.getPassword().equals(user.getPassword()))
			{
				session.put("UserList", isuser);
				System.out.println("Session Put Test: "+session.get("UserList").toString());  
				sessionUtil.setSession(session);
				
				
				ServletActionContext.getRequest().setAttribute("UserList2", isuser);
				User test=(User)ServletActionContext.getRequest().getAttribute("UserList2");
				System.out.println("SNO Test: "+test.getSNO());
				
				return "success";
			}
		}
		return "error";
	}
	
	@Override
	public String update() {
		// TODO Auto-generated method stub
		userService.User_update(user);
		return "userupdatesuccess";
	}
	
	@Override
	public String addOrder() {
		// TODO Auto-generated method stub
		System.out.println("AddItem Test");
		orderAction.addOrderList();
		return null;
	}
	
	@Override
	public String findOrder() {
		// TODO Auto-generated method stub
		System.out.println("FindItem Test");
		orderAction.findOrderList();
		return null;
	}

	@Override
	public String ToRegister() {
		// TODO Auto-generated method stub
		return "toRegister";
	}

	@Override
	public String ToLogin() {
		// TODO Auto-generated method stub
		return "toLogin";
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
