package org.lxd.learn.boot.multi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lxd.learn.boot.multi.datasource1.entity.TDep;
import org.lxd.learn.boot.multi.datasource1.mapper.TDepMapper;
import org.lxd.learn.boot.multi.datasource2.entity.TUser;
import org.lxd.learn.boot.multi.datasource2.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootMApplicationTests {

	@Test
	public void contextLoads() {
	}

	
//	@Autowired
//	TrPackageBatchMapper trPackageBatchMapper;
//	
//	@Test
//	public void test1(){
//		System.out.println(trPackageBatchMapper.selectAll().size());
//	}
	
	@Autowired
	TDepMapper tDepMapper;
	
	@Autowired
	TUserMapper tUserMapper;
	
	@Test
	public void test1(){
		TDep dep = new TDep();
		dep.setDepName("tt");
		tDepMapper.insert(dep);
		
		TUser user = new TUser();
		user.setName("ben");
		tUserMapper.insert(user);
		
		System.out.println(tDepMapper.selectAll().size());
		System.out.println(tUserMapper.selectAll().size());
	}
	
}
