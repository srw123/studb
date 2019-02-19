<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/12/012
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="#">
        <table border="1px">
            <tr>
                <td colspan="2"学员信息></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td>
                    <input value="${info.sname}" id="username" type="text" name="username">
                </td>
            </tr>
            <tr>
                <td>年龄</td>
                <td>
                    <input value="${info.sage}" type="text" id="age" name="age">
                </td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input  value="${info.sgender}" type="text" id="gender" name="gender"></td>
            </tr>
            <tr>
                <td>家庭住址</td>
                <td><input  value="${info.saddress}" type="text" name="address" id="address"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input value="${info.semail}" type="text" id="email" name="email"> </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input id="sid" name="sname" type="hidden" value="${info.sid}">
                    <input type="submit" value="修改">
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
