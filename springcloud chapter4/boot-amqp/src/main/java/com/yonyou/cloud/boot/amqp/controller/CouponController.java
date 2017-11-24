package com.yonyou.cloud.boot.amqp.controller;

import com.yonyou.cloud.boot.amqp.entity.TrPackageBatch;
import com.yonyou.cloud.boot.amqp.service.CouponService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.cloud.common.annotation.YcApi;
import com.yonyou.cloud.common.controller.BaseController;

@RestController
@RequestMapping("/coupon")
@YcApi
public class CouponController extends BaseController<CouponService,TrPackageBatch>{

}
