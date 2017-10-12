package org.lxd.learn.springbootdemoxml;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lxd.learn.springbootdemoxml.entity.TrPackageBatch;
import org.lxd.learn.springbootdemoxml.mapper.CouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoXmlApplicationTests {

//	@Test
//	public void contextLoads() {
//	}
	
	
	@Autowired
	private CouponMapper couponMapper;

	
	@Test
	public void testInsert() throws Exception {
		couponMapper.insert(new TrPackageBatch(1, 2, 3));
		couponMapper.insert(new TrPackageBatch(10, 20, 30));
		couponMapper.insert(new TrPackageBatch(11, 12, 13));

		Assert.assertEquals(3, couponMapper.getAll().size());
		
		
	}

}
