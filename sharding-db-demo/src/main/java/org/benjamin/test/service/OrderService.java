package org.benjamin.test.service;

import org.benjamin.test.entity.TOrder;
import org.benjamin.test.entity.TUser;
import org.benjamin.test.mapper.TOrderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.cloud.common.service.BaseService;
import com.yonyou.cloud.common.service.utils.EntityUtils;

import tk.mybatis.mapper.common.Mapper;

@Service
@Transactional
public class OrderService extends BaseService<Mapper<TOrder>, TOrder> {
	
	@Autowired
	UserService userService;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public void SaveNewOrder(TOrder entity) {
		TOrder delOrder = new TOrder();
		delOrder.setOrderNo(entity.getOrderNo());
		mapper.delete(delOrder);

		this.insertSelective(entity);
		
		TUser user = new TUser();
		user.setName("匿名用户");
		
		userService.insertSelective(user);
		
		int i = 1/0;
	}

}
