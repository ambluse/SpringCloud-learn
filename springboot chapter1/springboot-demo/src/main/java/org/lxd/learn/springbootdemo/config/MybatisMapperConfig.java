package org.lxd.learn.springbootdemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.lxd.learn.springbootdemo.mapper")
public class MybatisMapperConfig {

}
