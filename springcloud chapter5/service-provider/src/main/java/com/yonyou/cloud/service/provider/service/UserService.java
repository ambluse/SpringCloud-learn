package com.yonyou.cloud.service.provider.service;

import org.springframework.stereotype.Service;

import com.yonyou.cloud.common.service.BaseService;
import com.yonyou.cloud.service.provider.entity.TUser;

import tk.mybatis.mapper.common.Mapper;

@Service
public class UserService extends BaseService<Mapper<TUser>, TUser>{

}
