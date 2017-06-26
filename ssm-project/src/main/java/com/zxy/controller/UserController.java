package com.zxy.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxy.common.JsonResult;
import com.zxy.server.IUserServer;
import com.zxy.user.entity.User;

@Controller
@RequestMapping("/user")
class UserController {
	
	private Logger log=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserServer iUserServer;
	
	@RequestMapping("/queryUser")
	public String queryUser(){
		log.info("---查看用户添加信息开始---");
		return "user/user";
	}
	
	@ResponseBody
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public JsonResult addUser(Model model,HttpServletRequest request){
		log.info("---添加用户开始---");
		String name= request.getParameter("name");
		String age= request.getParameter("age");
		log.info("name="+name+",age="+age);
		User user=new User();
		Date date=new Date();
		user.setName(name);
		user.setAge(Integer.valueOf(age));
		user.setCreateTime(date);
		user.setEditTime(date);
		JsonResult json=new JsonResult(JsonResult.SUCCESS);
		try {
			if(iUserServer.addUser(user)!=0){
				json.setCode(JsonResult.SUCCESS);
				json.setMsg(JsonResult.REQUEST_SUCCESS);
			}else{
				json.setCode(JsonResult.ERROR);
				json.setMsg(JsonResult.REQUEST_ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
	@RequestMapping("/queryUserList")
	public String queryUserList(Model model,HttpServletRequest request){
		log.info("---查询用户列表开始---");
		List<User> userList=iUserServer.queryUserList();
		model.addAttribute("userList",userList);
		return "user/userList";
	}
}
