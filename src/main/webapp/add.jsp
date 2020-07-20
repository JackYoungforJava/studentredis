<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center"><a href="${pageContext.request.contextPath }/QueryServlet">返回首页</a></div>
<form action="${pageContext.request.contextPath }/AddServlet">
    <table width="50%" border="1" align="center" style="border-collapse: collapse;">
        <tr>
            <td>学生ID</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>学生姓名</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>出生日期</td>
            <td><input type="text" name="birthday"></td>
        </tr>
        <tr>
            <td>备注</td>
            <td><input type="text" name="description"></td>
        </tr>
        <tr>
            <td>平均分</td>
            <td><input type="text" name="avgscore"></td>
        </tr>
        <tr align="center">
            <td>
                <input type="reset" value="重置数据">
            </td>
            <td>
                <button type="submit">添加用户</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
