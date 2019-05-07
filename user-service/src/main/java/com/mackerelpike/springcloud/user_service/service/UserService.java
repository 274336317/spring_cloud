package com.mackerelpike.springcloud.user_service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mackerelpike.springcloud.user_service.mapper.UserMapper;
import com.mackerelpike.springcloud.user_service.po.PO_User;
import com.mackerelpike.springcloud.user_service.vo.VO_User;

@Service
public class UserService
{
	@Autowired
	private UserMapper userMapper;
	
	public List<VO_User> listUsers()
	{
		List<PO_User> list = this.userMapper.getAll();
		
		List<VO_User> users = new ArrayList<VO_User>();
		
		list.forEach((u)->users.add(new VO_User(u)));
		
		return users;
	}
	
	public VO_User getUserDetails(long userId)
	{
		
		VO_User user = null;
		
		PO_User u = this.userMapper.getUserDetails(userId);
		
		if(u != null)
		{
			user = new VO_User();
			user.setPassword(u.getPassword());
			user.setUserName(u.getUserName());
		}
		
		return user;
	}
	
	public void deleteUser(long userId)
	{
		this.userMapper.delete(userId);
	}
	
	public void updateUser(int userId, VO_User user)
	{
		
	}
	
	public void addUser(VO_User user)
	{
		PO_User u = new PO_User();
		
		u.setPassword(user.getPassword());
		u.setUserName(user.getUserName());
		
		this.userMapper.add(u);
		
		System.out.println("ID:" + u.getId());
	}
}
