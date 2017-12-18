package org.benjamin.test.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.benjamin.test.mapper")
public class MybatisMapperConfig {

}
