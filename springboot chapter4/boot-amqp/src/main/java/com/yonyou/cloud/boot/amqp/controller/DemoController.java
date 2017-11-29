package com.yonyou.cloud.boot.amqp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.cloud.boot.amqp.sender.DemoSender;

@RestController
public class DemoController {

	@Autowired
	DemoSender sender;
	
	@RequestMapping("/demo")
	public String send(){
		sender.send();
		return "ok";
	}
}
