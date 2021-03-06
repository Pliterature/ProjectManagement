package com.xhSmart.service;

import java.util.List;

import com.xhSmart.model.Allocation;
/**
 * 负责Allocation表的增删改查
 * @author lin
 *
 */
public interface AllocationService {
	void save(Allocation object);
	boolean update(Allocation object);
	boolean remove(int uid, int pid,String name);
	Allocation findById(int project_id,int user_id,String name);
	List<Allocation> findAllByPro(int id);
	List<Allocation> findByUserId(int user_id);
}
