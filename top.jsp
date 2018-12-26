<%--
  Created by IntelliJ IDEA.
  User: Mr. Wonderful
  Date: 2018/9/29
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<div align="center">

    <table border="0" width="100%" height="93" cellspacing="0" cellpadding="0" background="images/admin_top.jpg">
        <tr>
            <td width="100%" height="100%" align="right" valign="bottom">

                <a href="" onclick="window.parent.location.href='addInfo.jsp'">
                    <img src="images/admin_index.gif" border="0" />
                </a>

                <%
                    if(session.getAttribute("user")!=null){
                        out.print("<a href=''><img onclick='return logout();' src='images/admin_exit.gif'></img></a>");
                    }else{
                        out.print("<a href=''><img onclick='return returnLogin();' src='images/b_logon.gif'></img></a>");
                    }
                %>
            </td>
        </tr>
    </table>
</div>
<script>
    function logout() {
        if(confirm("确认退出？")){
            window.parent.location.href="login.jsp?flag=logout";
            return true;
        }else{
            return false;
        }
    }
    function returnLogin() {
        window.parent.location.href="login.jsp";
    }
</script>
</body>
</html>
