package com.zxy.dao;

import java.util.List;

import com.zxy.user.entity.User;

public interface IUserDao {

	int addUser(User u);

	List<User> queryUserList();

}
