package com.mackerelpike.springcloud.user_service.vo;

import java.io.Serializable;

import com.mackerelpike.springcloud.user_service.po.PO_User;

public class VO_User implements Serializable
{
	private static final long	serialVersionUID	= -830728988250076484L;

	private String				password;

	private String				userName;

	public VO_User()
	{
		
	}
	
	public VO_User(PO_User user)
	{
		this.password = user.getPassword();
		this.userName = user.getUserName();
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}