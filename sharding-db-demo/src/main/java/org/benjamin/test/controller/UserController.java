package org.benjamin.test.controller;

import org.benjamin.test.entity.TUser;
import org.benjamin.test.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.cloud.common.annotation.YcApi;
import com.yonyou.cloud.common.controller.BaseController;

@RestController
@RequestMapping("/user")
@YcApi
public class UserController extends BaseController<UserService,TUser>{

}
