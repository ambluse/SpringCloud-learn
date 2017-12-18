package org.benjamin.test.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import io.shardingjdbc.core.api.ShardingDataSourceFactory;
import io.shardingjdbc.core.api.config.ShardingRuleConfiguration;
import io.shardingjdbc.core.api.config.TableRuleConfiguration;
import io.shardingjdbc.core.keygen.DefaultKeyGenerator;



@Configuration
public class DatasourceConfig {
    
    @Autowired
    private Environment env;
    
    
    @Bean
    public DataSource buildDataSource() throws Exception {
        Map<String, DataSource> dataSourceMap = new HashMap<>();
        dataSourceMap.put("user", createDataSource("user"));
        dataSourceMap.put("order", createDataSource("order"));
        
        TableRuleConfiguration userTableConfig = new TableRuleConfiguration();
        userTableConfig.setLogicTable("t_user");
        userTableConfig.setActualDataNodes("user.t_user");
        userTableConfig.setKeyGeneratorColumnName("id");
        
        TableRuleConfiguration orderTableConfig = new TableRuleConfiguration();
        orderTableConfig.setLogicTable("t_order");
        orderTableConfig.setActualDataNodes("order.t_order");
        orderTableConfig.setKeyGeneratorColumnName("id");
        
        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
        shardingRuleConfig.getTableRuleConfigs().add(userTableConfig);
        shardingRuleConfig.getTableRuleConfigs().add(orderTableConfig);
        shardingRuleConfig.setDefaultKeyGeneratorClass(DefaultKeyGenerator.class.getName());
        
        return ShardingDataSourceFactory.createDataSource(dataSourceMap, shardingRuleConfig, new HashMap<String, Object>(), new Properties());
    }
    
    
    
    /**
     * druid数据源
     * @return
     * @throws Exception
     */
    public  DataSource createDataSource(String dataSourceName) throws Exception{
        Properties dataSourceProps = new Properties();
        dataSourceProps.put("driverClassName", env.getProperty(String.format("%s.db.driveClassName",dataSourceName)));
        dataSourceProps.put("url", env.getProperty(String.format("%s.db.url", dataSourceName) ));
        dataSourceProps.put("username", env.getProperty(String.format("%s.db.username",dataSourceName)));
        dataSourceProps.put("password", env.getProperty(String.format("%s.db.password",dataSourceName)));
        dataSourceProps.put("initialSize", env.getProperty("initialSize"));
        dataSourceProps.put("maxActive", env.getProperty("maxActive"));
        dataSourceProps.put("minIdle", env.getProperty("minIdle"));
        dataSourceProps.put("maxWait", env.getProperty("maxWait"));
        dataSourceProps.put("removeAbandoned", env.getProperty("removeAbandoned"));
        dataSourceProps.put("removeAbandonedTimeout", env.getProperty("removeAbandonedTimeout"));
        dataSourceProps.put("timeBetweenEvictionRunsMillis", env.getProperty("timeBetweenEvictionRunsMillis"));
        dataSourceProps.put("minEvictableIdleTimeMillis", env.getProperty("minEvictableIdleTimeMillis"));
        dataSourceProps.put("validationQuery", env.getProperty("validationQuery"));
        dataSourceProps.put("testWhileIdle", env.getProperty("testWhileIdle"));
        dataSourceProps.put("testOnBorrow", env.getProperty("testOnBorrow"));
        dataSourceProps.put("testOnReturn", env.getProperty("testOnReturn"));
        dataSourceProps.put("poolPreparedStatements", env.getProperty("poolPreparedStatements"));
        dataSourceProps.put("maxPoolPreparedStatementPerConnectionSize",env.getProperty("maxPoolPreparedStatementPerConnectionSize"));
        dataSourceProps.put("filters", env.getProperty("filters"));
        dataSourceProps.put("connectionProperties", env.getProperty("connectionProperties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(dataSourceProps);
        return dataSource;
    }
}