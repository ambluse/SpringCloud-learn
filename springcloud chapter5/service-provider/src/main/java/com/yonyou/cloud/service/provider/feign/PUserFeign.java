package com.yonyou.cloud.service.provider.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.yonyou.cloud.common.beans.RestResultResponse;


@FeignClient(name= "service-consumer",fallback=UserFeignHystrix.class)
public interface PUserFeign {
	
	@RequestMapping(value = "c-user/{id}",method=RequestMethod.GET)
    public RestResultResponse<String> getUserInfo(@PathVariable(value="id") int id);
	
}
