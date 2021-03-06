package com.servlet;

import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        Jedis jedis =new Jedis("127.0.0.1",6379);
        String id = request.getParameter("id");
        jedis.rpush("LIST_ID",id);
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String description = request.getParameter("description");
        String avgscore = request.getParameter("avgscore");
        jedis.hset(id,"name",name);
        jedis.hset(id,"birthday",birthday);
        jedis.hset(id,"description",description);
        jedis.hset(id,"avgscore",avgscore);
        response.sendRedirect("QueryServlet");
    }
}
