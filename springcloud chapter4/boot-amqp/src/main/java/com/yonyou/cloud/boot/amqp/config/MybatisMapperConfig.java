package com.yonyou.cloud.boot.amqp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yonyou.cloud.boot.amqp.mapper")
public class MybatisMapperConfig {

}
