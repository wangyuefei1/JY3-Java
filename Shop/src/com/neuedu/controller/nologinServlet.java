package com.neuedu.controller;

import com.alibaba.druid.sql.visitor.functions.Char;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "nologinServlet",urlPatterns = "/nologin.do")
public class nologinServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (null != username && null != password) {
            Cookie cookie = new Cookie("username", username);
            Cookie cookie1 = new Cookie("password", password);
            cookie.setMaxAge(60);
            cookie1.setMaxAge(60);
            resp.addCookie(cookie);
            resp.addCookie(cookie1);
        }else
        {
            Cookie[] cookies = req.getCookies();
            for (Cookie c:cookies) {
                if ("username".equals(c.getName()))
                {
                    username = c.getValue();
                }
                if ("password".equals(c.getName()))
                {
                    password = c.getValue();
                }
            }
        }
        if (username !=null && password != null)
        {
            req.getRequestDispatcher("").forward(req,resp);
        }
        else
        {
            req.getRequestDispatcher("").forward(req,resp);
        }
    }
}
