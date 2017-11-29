package com.yonyou.cloud.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.cloud.common.annotation.YcApi;
import com.yonyou.cloud.common.beans.RestResultResponse;
import com.yonyou.cloud.service.consumer.feign.UserFeign;

@RestController
@RequestMapping(value="/c-user")
public class UserController {

	@Autowired
	UserFeign client;
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	@YcApi
	public RestResultResponse<String> userName(@PathVariable int id){
		return new RestResultResponse().data(client.getUserInfo(id).getData().getName());
	}
	
	
}
