package com.yonyou.cloud.boot.amqp.service;

import com.yonyou.cloud.boot.amqp.entity.TrPackageBatch;
import org.springframework.stereotype.Service;

import com.yonyou.cloud.common.service.BaseService;

import tk.mybatis.mapper.common.Mapper;

@Service
public class CouponService extends BaseService<Mapper<TrPackageBatch>, TrPackageBatch>{

}
