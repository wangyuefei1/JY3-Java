package com.neuedu.mapper;

import java.util.List;

import com.neuedu.pojo.Admin;

public interface AdminMapper {

	List<Admin>  findAll();
	
	Admin findById(Integer id);
	
	void insert(Admin admin);
	void update(Admin admin);
	void delete(Integer id);
	
	Admin findByAname(String aname);
}
