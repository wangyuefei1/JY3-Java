package com.neuedu.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import com.neuedu.mapper.AdminMapper;
import com.neuedu.pojo.Admin;
import com.neuedu.util.Mybatisutil;
import com.neuedu.util.Servletutil;

@WebServlet(name = "adminoperation",urlPatterns = "*.do")
public class AdminServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6409853668958869857L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���뼯	
		Servletutil.setCharset(request, response);
		//������
		String url = request.getRequestURL().toString();
		String path = url.substring(url.lastIndexOf("/"), url.lastIndexOf("."));
		
		//��ȡSqlSession
		
		SqlSession session = Mybatisutil.getSqlsession();
		AdminMapper mapper = session.getMapper(AdminMapper.class);

		if(path.equals("/admins")) {
			//��ѯ����
			List<Admin> admins = mapper.findAll();
			//servlet��ʹ��printwrite�����������ַ���ʽ���
			//��Ҫ��ʾ�Ķ���󶨵�request�����н�������ת��
			request.setAttribute("admins",admins);
			//��ȡת����
			request.getRequestDispatcher("admins.jsp").forward(request, response);
			
		}
		else if(path.equals("/admin_insert")) {
			String aname = request.getParameter("aname");
			String apwd = request.getParameter("apwd");
			Admin admin = new Admin();
			admin.setAname(aname);
			admin.setApwd(apwd);
			mapper.insert(admin);
			session.commit();
			response.sendRedirect("admins.do");
		}
		else if(path.equals("/admin_update")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String aname = request.getParameter("aname");
			String apwd = request.getParameter("apwd");
			Admin admin = mapper.findById(id);
			admin.setAname(aname);
			admin.setApwd(apwd);
			mapper.update(admin);
			session.commit();
			response.sendRedirect("admins.do");
		}
		else if(path.equals("/admin_delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			mapper.delete(id);
			session.commit();
			response.sendRedirect("admins.do");
		}
		else if(path.equals("/admin_load")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Admin admin = mapper.findById(id);
			request.setAttribute("admin", admin);
			request.getRequestDispatcher("admin_update.jsp").forward(request, response);
		}
		else if(path.equals("/admin_login")) {
			String aname = request.getParameter("aname");
			String apwd = request.getParameter("apwd");
			Admin admin = mapper.findByAname(aname);
			if(admin != null) {
				//�ɹ�
				if(admin.getApwd().equals(Servletutil.getmd5(apwd))) {
					
					HttpSession session2 = request.getSession();
					session2.setAttribute("admin", admin);
					response.sendRedirect("admins.do");
				}else {
					request.setAttribute("error_msg", "�û������������");
					request.getRequestDispatcher("admin_login.jsp").forward(request, response);
				}
			}else {
				request.setAttribute("error_msg", "�û���������");
				request.getRequestDispatcher("admin_login.jsp").forward(request, response);
				//response.sendRedirect("admin_login.jsp");
			}
		}else if(path.equals("/admin_logout")) {
			HttpSession session2 = request.getSession();
			session2.invalidate();
			response.sendRedirect("admins.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}

	}	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}
}
