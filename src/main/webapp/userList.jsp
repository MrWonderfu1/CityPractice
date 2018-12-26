<%--
  Created by IntelliJ IDEA.
  User: Mr. Wonderful
  Date: 2018/9/29
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script>
        function del() {
            return confirm("确定删除？");

        }

    </script>
</head>
<body>
<div align="center">

    <table width="650" cellspacing="0" cellpadding="0" border="0" height="300">
        <thead>${requestScope.message}</thead>
        <tbody><tr><td align="center">用户id</td><td>用户名</td><td>操作</td></tr>
        <c:forEach items="${userList}" var="user">
            <tr id="trdel">
                <td align="center">${user.id}</td>
                <td>${user.username}</td>
                <td><a href="userUpdateServlet?userid=${user.id}">修改</a>|<a href="userDeleteServlet?userid=${user.id}" onclick="return del()">删除</a>
                </td>
            </tr>
        </c:forEach>
        <tr><td align="center" colspan="3">
            <c:if test="${goPage!=1}"> <a href="userSelectServlet?page=${goPage-1}">上一页</a></c:if>
            |
          <c:if test="${goPage!=page}">  <a href="userSelectServlet?page=${goPage+1}">下一页</a></c:if>
        </td>
        </tr>
        </tbody></table>
</div>
</body>
</html>

