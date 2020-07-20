package com.servlet;

import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class UpdateUiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        Jedis jedis =new Jedis("127.0.0.1",6379);
        String key = request.getParameter("key");
        Map<String, String> map = jedis.hgetAll(key);
        map.put("key",key);
        request.setAttribute("student",map);
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }
}
