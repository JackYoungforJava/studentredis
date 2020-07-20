<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/UpdateServlet">
    <input type="hidden" value="${student.key }" name="key">
    <div>
        <label>学生姓名</label>
        <input type="text" name="name" value="${student.name }" placeholder="请输入学生姓名">
    </div>
    <div>
        <label>出生日期</label>
        <input type="text" name="birthday"  value="${student.birthday }" placeholder="请输入出生日期">
    </div>
    <div>
        <label>备注</label>
        <input type="text" name="description"  value="${student.description }" placeholder="请输入备注">
    </div>
    <div>
        <label>平均分</label>
        <input type="text" name="avgscore"  value="${student.avgscore }" placeholder="请输入平均分">
    </div>
    <button type="submit">确认修改</button>
    <a href="${pageContext.request.contextPath }/QueryServlet">返回</a>
</form>
</body>
</html>
