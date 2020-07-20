package com.servlet;

import com.entity.Student;
import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        Jedis jedis =new Jedis("127.0.0.1",6379);
        List<Map<String, String>> student=new ArrayList<>();
        Long max = jedis.llen("LIST_ID");
        for (int i=0;i<max;i++){
            String key = String.valueOf(i);
            Map<String, String> map = jedis.hgetAll(key);
            map.put("key",key);
            student.add(i,map);
        }
        request.setAttribute("student",student);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
}
