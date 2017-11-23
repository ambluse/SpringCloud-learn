package com.yonyou.cloud.service.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.cloud.common.controller.BaseController;
import com.yonyou.cloud.service.provider.entity.TUser;
import com.yonyou.cloud.service.provider.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController extends BaseController<UserService, TUser>{

}
