package com.yonyou.cloud.service.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.cloud.common.controller.BaseController;
import com.yonyou.cloud.service.provider.entity.TUser;
import com.yonyou.cloud.service.provider.feign.PUserFeign;
import com.yonyou.cloud.service.provider.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController extends BaseController<UserService, TUser>{

	@Autowired
	PUserFeign feign;
	
	@RequestMapping(value="/u/{id}",method=RequestMethod.GET)
	public String getUser(@PathVariable int id){
		return feign.getUserInfo(id).getData();
	}
}
