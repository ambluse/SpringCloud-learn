package org.benjamin.test.service;

import org.benjamin.test.entity.TUser;
import org.springframework.stereotype.Service;

import com.yonyou.cloud.common.service.BaseService;

import tk.mybatis.mapper.common.Mapper;

@Service
public class UserService extends BaseService<Mapper<TUser>, TUser>{

}
