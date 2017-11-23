package com.yonyou.cloud.service.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yonyou.cloud.common.beans.RestResultResponse;
import com.yonyou.cloud.service.consumer.entity.TUser;

@FeignClient(name= "service-provider")
public interface UserFeign {
	
	@RequestMapping(value = "user/{id}",method=RequestMethod.GET)
    public RestResultResponse<TUser> getUserInfo(@PathVariable(value="id") int id);
	
}
