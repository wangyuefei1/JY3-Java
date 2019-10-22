package com.neuedu.controller;

import com.neuedu.dao.ProDao;
import com.neuedu.dao.ProDaoimpl;
import com.neuedu.pojo.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "queryServlet" ,urlPatterns = "/query.do" )
public class queryServlet extends HttpServlet {
    private ProDao proDao;

    @Override
    public void init() throws ServletException {
        proDao = new ProDaoimpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = proDao.Querymsg();
        System.out.println(products);
        request.setAttribute("products",products);
        request.getRequestDispatcher("query.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
