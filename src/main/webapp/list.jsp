<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align:center;">
    <a href="add.jsp">新增学生</a>
</div>
<table border="1" width="80%" align="center" cellpadding="5" cellspacing="0">
    <tr>
        <td>ID</td>
        <td>学生姓名</td>
        <td>出生日期</td>
        <td>备注</td>
        <td>平均分</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${student}" var="s">
        <tr>
            <td>${s.key}</td>
            <td>${s.name}</td>
            <td>${s.birthday}</td>
            <td>${s.description}</td>
            <td>${s.avgscore}</td>
            <td>
                <a href="${pageContext.request.contextPath }/UpdateUiServlet?key=${s.key}">修改</a>
                <a href="${pageContext.request.contextPath }/DeleteServlet?key=${s.key}">删除</a>
            </td>
        </tr>
    </c:forEach>
    <%--<c:forEach items="${key}" var="k">
        <tr>
            <td>${k}</td>
        <c:forEach items="${student}" var="s">
                <td>${s.name}</td>
                <td>${s.birthday}</td>
                <td>${s.description}</td>
                <td>${s.avgscore}</td>
                <td>
                    <a href="${pageContext.request.contextPath }/UpdateUiServlet?key=${k}">修改</a>
                    <a href="${pageContext.request.contextPath }/DeleteServlet?key=${k}">删除</a>
                </td>
        </c:forEach>
        </tr>
    </c:forEach>--%>
</table>
</body>
</html>
