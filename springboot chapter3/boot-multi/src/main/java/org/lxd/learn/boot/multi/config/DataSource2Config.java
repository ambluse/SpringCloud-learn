package org.lxd.learn.boot.multi.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages="org.lxd.learn.boot.multi.datasource2.mapper",sqlSessionTemplateRef="datasource2SqlSessionTemplate")
public class DataSource2Config {
	
	 	@Bean(name = "datasource2DataSource")
	    @ConfigurationProperties(prefix = "spring.datasource.datasource2")
	    public DataSource testDataSource() {
	        return DataSourceBuilder.create().build();
	    }

	    @Bean(name = "datasource2SqlSessionFactory")
	    public SqlSessionFactory testSqlSessionFactory(@Qualifier("datasource2DataSource") DataSource dataSource) throws Exception {
	        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
	        bean.setDataSource(dataSource);
	        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/datasource2/*.xml"));
	        return bean.getObject();
	    }

	    @Bean(name = "datasource2TransactionManager")
	    public DataSourceTransactionManager testTransactionManager(@Qualifier("datasource2DataSource") DataSource dataSource) {
	        return new DataSourceTransactionManager(dataSource);
	    }

	    @Bean(name = "datasource2SqlSessionTemplate")
	    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("datasource2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
	        return new SqlSessionTemplate(sqlSessionFactory);
	    }
	
}
