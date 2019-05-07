package com.mackerelpike.springcloud.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mackerelpike.springcloud.user_service.service.UserService;
import com.mackerelpike.springcloud.user_service.vo.VO_JsonDataResult;
import com.mackerelpike.springcloud.user_service.vo.VO_JsonErrorResult;
import com.mackerelpike.springcloud.user_service.vo.VO_JsonOkResult;
import com.mackerelpike.springcloud.user_service.vo.VO_JsonResult;
import com.mackerelpike.springcloud.user_service.vo.VO_User;

@RestController
@RequestMapping(value="/user/v1.0/")
public class UserController 
{
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public VO_JsonResult getUserDetails(@PathVariable("id")  long id)
	{
		
		VO_JsonDataResult<VO_User> result = new VO_JsonDataResult<VO_User>();
		
		VO_User user = this.userService.getUserDetails(id);
		
		result.setData(user);
		
		return result;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	@ResponseBody
	public VO_JsonResult deleteUser(@PathVariable("id")  long id)
	{
		
		return new VO_JsonOkResult();
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.POST)
	@ResponseBody
	public VO_JsonResult updateUser(@PathVariable("id")  int id, @RequestBody VO_User user)
	{
		
		return new VO_JsonOkResult();
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	@ResponseBody
	public VO_JsonResult listUsers()
	{
		VO_JsonDataResult<List<VO_User>> result = new VO_JsonDataResult<List<VO_User>>();
		
		result.setData(this.userService.listUsers());
		
		return  result;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public VO_JsonResult addUser(@RequestBody VO_User user)
	{
		try
		{
			this.userService.addUser(user);
			return new VO_JsonOkResult();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return new VO_JsonErrorResult(0, ex.getMessage());
		}
	}
	
	@RequestMapping("/")
	public String Info()
	{
		return "UserController V1.0.0";
	}
}