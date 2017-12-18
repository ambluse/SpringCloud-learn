package org.benjamin.test.service;

import org.benjamin.test.entity.TOrder;
import org.benjamin.test.entity.TUser;
import org.springframework.stereotype.Service;

import com.yonyou.cloud.common.service.BaseService;

import tk.mybatis.mapper.common.Mapper;

@Service
public class OrderService extends BaseService<Mapper<TOrder>, TOrder>{

}
