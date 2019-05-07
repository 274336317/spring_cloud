package com.mackerelpike.springcloud.user_service.mapper;

import java.util.List;

import com.mackerelpike.springcloud.user_service.po.PO_User;

public interface UserMapper
{
	List<PO_User> getAll();

	PO_User getUserDetails(Long id);

	void add(PO_User user);

	void update(PO_User user);

	void delete(Long id);
}
