package com.sun.jyu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.jyu.dao.UserMapper;
import com.sun.jyu.pojo.User;
import com.sun.jyu.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User getUserById(long userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
