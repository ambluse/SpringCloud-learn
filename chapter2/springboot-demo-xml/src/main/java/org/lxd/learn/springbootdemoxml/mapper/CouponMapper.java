package org.lxd.learn.springbootdemoxml.mapper;

import java.util.List;

import org.lxd.learn.springbootdemoxml.entity.TrPackageBatch;

public interface CouponMapper {
	
	List<TrPackageBatch> getAll();
	
	TrPackageBatch getOne(Long id);

	void insert(TrPackageBatch user);

	void update(TrPackageBatch user);

	void delete(Integer id);

}