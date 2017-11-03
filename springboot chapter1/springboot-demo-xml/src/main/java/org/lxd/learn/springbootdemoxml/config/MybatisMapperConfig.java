package org.lxd.learn.springbootdemoxml.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.lxd.learn.springbootdemoxml.mapper")
public class MybatisMapperConfig {

}
