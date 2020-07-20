package com.servlet;

import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


public class JedisTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        Jedis jedis = new Jedis("127.0.0.1",6379);
        Map<String, String> map = jedis.hgetAll("8");
        String key="8";
        request.setAttribute("key",key);
        String name = map.get("name");
        request.setAttribute("name",name);
        String birthday = map.get("birthday");
        request.setAttribute("birthday",birthday);
        String description = map.get("description");
        request.setAttribute("description",description);
        String avgscore = map.get("avgscore");
        request.setAttribute("avgscore",avgscore);
        request.getRequestDispatcher("list.jsp").forward(request,response);
        /* String name = map.get("name");
            String birthday = map.get("birthday");
            String description = map.get("description");
            String avgscore = map.get("avgscore");
            request.setAttribute("key",key);
            request.setAttribute("name",name);
            request.setAttribute("birthday",birthday);
            request.setAttribute("description",description);
            request.setAttribute("avgscore",avgscore);
            request.getRequestDispatcher("list.jsp").forward(request,response);*/
    }

}
