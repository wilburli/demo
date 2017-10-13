package com.inforun;

import com.inforun.model.SystemLog;
import com.inforun.service.SystemLogService;
import com.inforun.service.redis.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	SystemLogService systemLogService;
	@Autowired
	RedisService redisService;

	@Test
	public void contextLoads() {
		SystemLog systemLog = systemLogService.byId(474351);
		System.out.println(systemLog.getBankName());

	}
	@Test
	public void addRedisData(){
		String key = "redisTest2";
		String value = "{test:1}";
		redisService.set(key,value);
	}




}
