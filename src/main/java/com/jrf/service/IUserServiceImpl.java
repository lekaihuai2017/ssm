package com.jrf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrf.dao.UserTMapper;
import com.jrf.entity.UserT;

@Service("userService")
public class IUserServiceImpl  implements IUserService{

	@Autowired
	public UserTMapper udao;
	
	@Override
	public UserT getUserById(int id) {
		return udao.selectByPrimaryKey(id);
	}


}
