package org.benjamin.test.controller;

import org.benjamin.test.entity.TOrder;
import org.benjamin.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.cloud.common.annotation.YcApi;
import com.yonyou.cloud.common.beans.RestResultResponse;
import com.yonyou.cloud.common.controller.BaseController;

@RestController
@RequestMapping("/order")
public class OrderController extends BaseController<OrderService,TOrder>{
	
	@Autowired
	OrderService orderService;

	@RequestMapping(value="/saveAndDel",method=RequestMethod.POST)
	@YcApi
	public RestResultResponse<String> saveAndDelOrder(@RequestBody TOrder order){
		orderService.SaveNewOrder(order);
		 return new RestResultResponse<String>().success(true);
	}
}
