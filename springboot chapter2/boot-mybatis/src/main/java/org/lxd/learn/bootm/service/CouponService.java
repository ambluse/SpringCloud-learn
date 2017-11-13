package org.lxd.learn.bootm.service;

import org.lxd.learn.bootm.entity.TrPackageBatch;
import org.springframework.stereotype.Service;

import com.yonyou.cloud.common.service.BaseService;

import tk.mybatis.mapper.common.Mapper;

@Service
public class CouponService extends BaseService<Mapper<TrPackageBatch>, TrPackageBatch>{

}
