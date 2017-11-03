package org.lxd.learn.springbootdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.lxd.learn.springbootdemo.entity.TrPackageBatch;

public interface CouponMapper {
	
	@Select("SELECT * FROM TR_PACKAGE_BATCH")
	List<TrPackageBatch> getAll();
	
	@Select("SELECT * FROM TR_PACKAGE_BATCH WHERE REL_ID = #{id}")
//	@Results({
//		@Result(property = "type",  column = "user_sex", javaType = UserSexEnum.class),
//		@Result(property = "name", column = "nick_name")
//	})
	TrPackageBatch getOne(Long id);

	@Insert("INSERT INTO TR_PACKAGE_BATCH (PACKAGE_ID,BATCH_ID,GRANT_COUNT) VALUES(#{packageId}, #{batchId}, #{grantCount})")
	void insert(TrPackageBatch user);

	@Update("UPDATE TR_PACKAGE_BATCH SET GRAND_COUNT=#{grantCount} WHERE REL_ID =#{id}")
	void update(TrPackageBatch user);

	@Delete("DELETE FROM TR_PACKAGE_BATCH WHERE REL_ID =#{id}")
	void delete(Integer id);

}