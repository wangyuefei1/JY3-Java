package com.neuedu.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.neuedu.mapper.CityMapper;
import com.neuedu.pojo.Area;
import com.neuedu.pojo.City;
import com.neuedu.pojo.Province;
import com.neuedu.util.Mybatisutil;
import com.neuedu.util.Servletutil;

import net.sf.json.JSONArray;
@WebServlet(urlPatterns ="*.action")
public class CityServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Servletutil.setCharset(request, response);
		SqlSession session = Mybatisutil.getSqlsession();
		CityMapper mapper = session.getMapper(CityMapper.class);
		//url拦截
		String url = request.getRequestURL().toString();
		String path = url.substring(url.lastIndexOf("/"), url.lastIndexOf("."));
		PrintWriter writer = response.getWriter();
		if("/province".equals(path)) {
			List<Province> province = mapper.findAll();
			//转换为json格式
			JSONArray json = JSONArray.fromObject(province);
			String provinces = json.toString();
			writer.print(provinces);
		}else if("/city".equals(path)){
			String pid = request.getParameter("pid");
			List<City> city = mapper.findByPid(pid);
			//转换为json格式
			JSONArray json = JSONArray.fromObject(city);
			String cities = json.toString();
			writer.print(cities);	
		}else if("/area".equals(path)){
			String cid = request.getParameter("cid");
			List<Area> area = mapper.findByCid(cid);
			//转换为json格式
			JSONArray json = JSONArray.fromObject(area);
			String areas = json.toString();
			writer.print(areas);	
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doGet(request, response);
	}
	
}
