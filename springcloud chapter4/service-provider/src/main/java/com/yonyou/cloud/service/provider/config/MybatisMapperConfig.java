package com.yonyou.cloud.service.provider.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yonyou.cloud.service.provider.mapper")
public class MybatisMapperConfig {

}
