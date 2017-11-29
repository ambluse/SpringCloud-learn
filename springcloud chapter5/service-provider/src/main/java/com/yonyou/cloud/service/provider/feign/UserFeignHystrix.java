package com.yonyou.cloud.service.provider.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yonyou.cloud.common.beans.RestResultResponse;

@Component
public class UserFeignHystrix implements PUserFeign{

    @Override
    @RequestMapping(value = "user/{id}",method=RequestMethod.GET)
    public RestResultResponse<String> getUserInfo(@PathVariable(value="id") int id){
    	
    	return new RestResultResponse().data("lala").success(true);
    }
}