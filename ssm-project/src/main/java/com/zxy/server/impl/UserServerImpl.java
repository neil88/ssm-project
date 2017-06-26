package com.zxy.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxy.dao.IUserDao;
import com.zxy.server.IUserServer;
import com.zxy.user.entity.User;

@Service
public class UserServerImpl implements IUserServer {

	@Autowired
	private IUserDao iUserDao;
	@Override
	public int addUser(User u) {
		return iUserDao.addUser(u);
	}
	@Override
	public List<User> queryUserList() {
		return iUserDao.queryUserList();
	}

}
