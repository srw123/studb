<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/12/012
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-1.12.4.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $("table tr:first").css("font-size","20px")
            $("table tr:odd").css("background","yellow")
        })
    </script>
</head>
<body>
<table border="2px">
    <tr>
        <td colspan="6">
            学员信息列表
        </td>
    </tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>住址</td>
        <td>Email</td>
    </tr>
    <c:forEach items="${list}" var="stu">
    <tr>
        <td><a href="Update?type=sel&id=${stu.sid}"> ${stu.sid}</a></td>
        <td>${stu.sname}</td>
        <td>${stu.sgender}</td>
        <td>${stu.sage}</td>
        <td>${stu.saddress}</td>
        <td>${stu.semail}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
