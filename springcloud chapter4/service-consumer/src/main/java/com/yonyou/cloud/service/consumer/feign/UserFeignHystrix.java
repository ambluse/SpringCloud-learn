package com.yonyou.cloud.service.consumer.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yonyou.cloud.common.beans.RestResultResponse;
import com.yonyou.cloud.service.consumer.entity.TUser;

@Component
public class UserFeignHystrix implements UserFeign{

    @Override
    @RequestMapping(value = "user/{id}",method=RequestMethod.GET)
    public RestResultResponse<TUser> getUserInfo(@PathVariable(value="id") int id){
    	TUser user = new TUser();
    	user.setId(0);
    	user.setName("默认用户");
    	return new RestResultResponse().data(user).success(true);
    }
}