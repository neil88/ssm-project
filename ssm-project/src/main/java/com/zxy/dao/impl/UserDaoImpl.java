package com.zxy.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zxy.dao.IUserDao;
import com.zxy.user.entity.User;
import com.zxy.user.mapper.UserMapper;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private UserMapper userMapper;
	@Override
	public int addUser(User u) {
		System.out.println(u.getName());
		return userMapper.insertSelective(u);
	}
	@Override
	public List<User> queryUserList() {
		return userMapper.queryUserList();
	}

}
