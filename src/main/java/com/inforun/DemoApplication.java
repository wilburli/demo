package com.inforun;


import com.alibaba.druid.pool.DruidDataSource;
import com.inforun.config.QuartzConfigProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.inforun.dao")
@EnableConfigurationProperties({QuartzConfigProperties.class})
public class DemoApplication {

	@Autowired
	Environment env;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public DataSource dataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		return dataSource;
	}

}
