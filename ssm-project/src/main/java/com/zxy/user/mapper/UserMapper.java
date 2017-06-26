package com.zxy.user.mapper;

import java.util.List;

import com.zxy.user.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /**
     * 查询用户列表
     * @return
     */
	List<User> queryUserList();
}