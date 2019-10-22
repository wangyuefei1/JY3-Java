package com.neuedu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.neuedu.mapper.SaleMapper;
import com.neuedu.pojo.Area;
import com.neuedu.pojo.Sale;
import com.neuedu.util.Mybatisutil;

public class testSaleMapper {
	
	public static void main(String[] args) {
		SqlSession session = Mybatisutil.getSqlsession();
		SaleMapper mapper = session.getMapper(SaleMapper.class);
		List<Sale> sale = mapper.findAll();
		for (Sale sales : sale) {
			System.out.println(sales);
		}
	}
}	
