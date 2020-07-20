package com.servlet;

import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        Jedis jedis =new Jedis("127.0.0.1",6379);
        String key = request.getParameter("key");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String description = request.getParameter("description");
        String avgscore = request.getParameter("avgscore");
        jedis.hset(key,"name",name);
        jedis.hset(key,"birthday",birthday);
        jedis.hset(key,"description",description);
        jedis.hset(key,"avgscore",avgscore);
        response.sendRedirect("QueryServlet");
    }
}
