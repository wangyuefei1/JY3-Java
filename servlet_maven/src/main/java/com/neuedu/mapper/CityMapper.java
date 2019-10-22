package com.neuedu.mapper;

import java.util.List;

import com.neuedu.pojo.Area;
import com.neuedu.pojo.City;
import com.neuedu.pojo.Province;

public interface CityMapper {
	
	List<Province> findAll();
	
	List<City>  findByPid(String pid);
	
	List<Area>  findByCid(String cid);
}
