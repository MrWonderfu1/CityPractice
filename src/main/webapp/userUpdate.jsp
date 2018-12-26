<%--
  Created by IntelliJ IDEA.
  User: Mr. Wonderful
  Date: 2018/10/8
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form method="post" action="userUpdateServlet?userid=${user.id}">
        <table width="800" cellspacing="0" cellpadding="0" border="0" height="300">
            <tbody>
            <tr>
                <td align="right">用户id:&nbsp;&nbsp;</td>
                <td><input type="text" value="${user.id}"name="id"id="id"></td>
            </tr>
            <tr>
                <td align="right">用户名:&nbsp;&nbsp;</td>
                <td><input type="text" value="${user.username}" name="username" id="username" ></td>
            </tr>
            <tr>
                <td align="right">用户名密码:&nbsp;&nbsp;</td>
                <td><input type="password"value="${user.password}"name="password"required="required" id="password"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="修改"></td>
            </tr>
            </tbody>
        </table>
    </form>
</div>
</body>
</html>
