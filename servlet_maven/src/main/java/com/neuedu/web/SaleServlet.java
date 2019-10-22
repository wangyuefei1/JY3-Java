package com.neuedu.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.neuedu.mapper.SaleMapper;
import com.neuedu.pojo.Sale;
import com.neuedu.util.Mybatisutil;
import com.neuedu.util.Servletutil;

import net.sf.json.JSONArray;

@WebServlet(urlPatterns = "/sale")
public class SaleServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6409853668958869857L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//±àÂë¼¯	
		Servletutil.setCharset(request, response);
		
		SqlSession session = Mybatisutil.getSqlsession();
		SaleMapper mapper = session.getMapper(SaleMapper.class);
		List<Sale> sales = mapper.findAll();
		
		JSONArray array = JSONArray.fromObject(sales);
		String string = array.toString();
		response.getWriter().print(string);
		

	}	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}
}
