package com.yonyou.cloud.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.cloud.service.consumer.feign.UserFeign;

@RestController
@RequestMapping(value="/c-user")
public class UserController {

	@Autowired
	UserFeign client;
	
	
	@RequestMapping("/{id}")
	public String userName(@PathVariable int id){
		return client.getUserInfo(id).getData().getName();
	}
	
	
}
