package org.lxd.learn.bootm.controller;

import org.lxd.learn.bootm.entity.TrPackageBatch;
import org.lxd.learn.bootm.service.CouponService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.cloud.common.controller.BaseController;

@RestController
@RequestMapping("/coupon")
public class CouponController extends BaseController<CouponService,TrPackageBatch>{

}
