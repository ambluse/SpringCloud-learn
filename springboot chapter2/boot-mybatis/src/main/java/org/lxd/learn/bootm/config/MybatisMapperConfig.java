package org.lxd.learn.bootm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.lxd.learn.bootm.mapper")
public class MybatisMapperConfig {

}
