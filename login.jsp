
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员登录</title>
    <link type="text/css" rel="stylesheet" href="css/style.css;">
</head>
<body bgcolor="#E7ECEF">

<%
    String flag=request.getParameter("flag");
    if(flag!=null&&flag.equals("logout")){
        session.removeAttribute("user");
    }else

%>


<div align="center">
    <form action="Servlet" method="post">
        <table border="0" cellspacing="0" cellpadding="0" style="margin-top:130px">
            <tr><td><img src="images/logon_top.gif"></td></tr>
            <tr height="180">
                <td background="images/logon_middle.gif" align="center" valign="top">
                    <table border="0" width="90%" cellspacing="0" cellpadding="0">
                        <tr height="50"><td colspan="2"></td></tr>
                        <tr height="30">
                            <td align="right" width="40%">用户名：&nbsp;&nbsp;</td>
                            <td style="text-indent:5px"><input type="text" name="username" size="30" required="required" /></td>
                        </tr>
                        <tr height="30">
                            <td align="right">密&nbsp;&nbsp;&nbsp;码：&nbsp;&nbsp;</td>
                            <td style="text-indent:5px"><input type="password" name="password" size="30" required="required"/></td>
                        </tr>
                        <tr height="60">
                            <td></td>
                            <td>
                                <input type="submit" value="登录"/>
                                <input type="reset" value="重置"/>
                                <a href="#">[返回首页]</a>
                                <a  href="register.jsp">[注册]</a>
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
