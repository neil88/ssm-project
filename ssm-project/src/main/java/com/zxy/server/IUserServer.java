package com.zxy.server;

import java.util.List;

import com.zxy.user.entity.User;

public interface IUserServer {
	
	/**
	 * 添加用户
	 * @param u
	 * @return
	 */
	int addUser(User u);
	/**
	 * 查询用户
	 * @return
	 */
	List<User> queryUserList();

}
