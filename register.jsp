<%--
  Created by IntelliJ IDEA.
  User: Mr. Wonderful
  Date: 2018/9/29
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>注册界面</title>
    <script>
        function check() {
            var result=true;
            var username=document.getElementById("username");
            var password=document.getElementById("password")
            if(username.value.length<3||username.value.length>10){
                alert("用户名在3-10位之间");
                result=false;
            }
            if(password.value.length<6||password.value.length>10){
                alert("密码在6-10位之间");
                result=false;
            }
            return result;
        }
    </script>
</head>
<body bgcolor="#E7ECEF">
<div align="center">
    <form action="registerServlet" method="post" onsubmit="return check();">
        <table border="0" cellspacing="0" cellpadding="0" style="margin-top:130px">
            <tr><td><img src="images/logon_top.gif"></td></tr>
            <tr height="180">
                <td background="images/logon_middle.gif" align="center" valign="top">
                    <table border="0" width="90%" cellspacing="0" cellpadding="0">
                        <tr height="50"><td colspan="2"></td></tr>
                        <tr height="30">
                            <td align="right" width="40%">用户名：&nbsp;&nbsp;</td>
                            <td style="text-indent:5px"><input type="text" id="username" name="username" size="30" placeholder="请输入用户名" required="required"/></td>
                        </tr>
                        <tr height="30">
                            <td align="right">密&nbsp;&nbsp;码：&nbsp;&nbsp;</td>
                            <td style="text-indent:5px"><input type="password" id="password" name="password" size="30"  placeholder="请输入密码" required="required" /></td>
                        </tr>
                        <tr height="60">
                            <td></td>
                            <td>
                                <input type="submit" value="注册"/>
                                <input type="reset" value="重置"/>
                                <a href="login.jsp">[返回首页]</a>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr><td><img src="images/logon_end.gif"></td></tr>
        </table>
    </form>
</div>
<div align="center">
    <font color="red"><c:out value="${requestScope.message}" default=""></c:out></font>
</div>
</body>
</html>
