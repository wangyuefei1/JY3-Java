package com.neuedu.controller;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "cookieServlet",urlPatterns = "/cookie.do")
public class cookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(date);
        Cookie cookie = new Cookie("time",format);
        cookie.setPath("/");
        resp.addCookie(cookie);
        cookie.setMaxAge(60*60*24*7);
        Cookie[] cookies = req.getCookies();
        if (null != cookie)
        {
            String time = null;
            for (Cookie c :cookies)
            {
                if ("time".equals(c.getName()))
                {
                     time = c.getValue();
                }
            }
            if ( null != time)
            {
                resp.getWriter().write("上次登录时间为："+time);
            }
            else{
                resp.getWriter().write("首次登录！");
            }
        }
    }
}
