package com.yonyou.cloud.boot.amqp;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.yonyou.cloud.boot.amqp.mapper.TrPackageBatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootMApplicationTests {

	@Test
	public void contextLoads() {
	}

	
	@Autowired
	TrPackageBatchMapper trPackageBatchMapper;
	
	@Test
	public void test1(){
		System.out.println(trPackageBatchMapper.selectAll().size());
	}
}
