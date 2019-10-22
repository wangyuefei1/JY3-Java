package com.neuedu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.neuedu.mapper.CityMapper;
import com.neuedu.pojo.Area;
import com.neuedu.pojo.City;
import com.neuedu.pojo.Province;
import com.neuedu.util.Mybatisutil;

public class testCityMapper {
	
	public static void main(String[] args) {
		SqlSession session = Mybatisutil.getSqlsession();
		CityMapper mapper = session.getMapper(CityMapper.class);
//		List<Province> province = mapper.findAll();
//		for (Province provinces : province) {
//			System.out.println(provinces);
//		}
//		List<City> city = mapper.findByPid("140000");
//		for (City cities : city) {
//			System.out.println(cities);
//		}
		List<Area> area = mapper.findByCid("140300");
		for (Area areas : area) {
			System.out.println(areas);
		}
	}
}	
