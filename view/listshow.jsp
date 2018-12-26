<%--
  Created by IntelliJ IDEA.
  User: Mr. Wonderful
  Date: 2018/10/15
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台-查看信息列表</title>
    <link type="text/css" rel="stylesheet" href="../css/style.css">
</head>
<body background="images/back.gif">
<center>
    <table border="0" width="920" cellspacing="0" cellpadding="0" bgcolor="white">
        <tr><td colspan="2">
            <!-- 页眉 -->
            <iframe src="top.jsp" frameBorder="0" width="920" scrolling="no" height="200" ></iframe>
        </td></tr>
        <tr>
            <td width="230" valign="top" align="center">
                <!-- 左侧 -->
                <iframe src="left.jsp" frameBorder="0" width="225" scrolling="no" height="400" ></iframe>
            </td>
            <td width="690" height="400" align="center" valign="top" bgcolor="#FFFFFF">
                <table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5px">


                    <tr height="30"><td style="text-indent:5px" valign="bottom"><font color="#004790"><b>■推荐XX信息</b>『缴费专区』</font></td></tr>


                    <tr><td align="center" style="border:1px solid" bgcolor="#F0F0F0">


                        <table border="0" width="655" cellpadding="3" style="word-break:break-all">
                            <tr height="30">
                                <td colspan="2">【XX信息】</td>
                                <td align="right">发布时间：『2018-10-26 11:16:14』&nbsp;</td>
                            </tr>
                            <tr height="80"><td colspan="3">XX信息内容</td></tr>
                            <tr height="30" align="center">
                                <td>联系电话：13255******</td>
                                <td>联 系 人：XX</td>
                                <td>E-mail：888@8*.com</td>
                            </tr>
                        </table>
                    </td>
                    </tr>
                    <tr height="1"><td></td></tr>


                </table>
                <!-- 列表显示免费信息 -->

                <table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5px" rules="rows">


                    <tr height="30"><td style="text-indent:5px" valign="bottom"><font color="#004790"><b>■最新XX信息</b>『免费专区』</font></td></tr>


                    <tr><td align="center" style="border:1px solid" bgcolor="#F0F0F0">


                        <table border="0" width="655" cellpadding="3" style="word-break:break-all">
                            <tr height="30">
                                <td colspan="2">【XX信息】</td>
                                <td align="right">发布时间：『2018-10-26 13:58:53』&nbsp;</td>
                            </tr>
                            <tr height="80"><td colspan="3">发布XX信息标题</td></tr>
                            <tr height="30" align="center">
                                <td>联系电话：11111******</td>
                                <td>联系人：XX</td>
                                <td>E-mail：44@1*.com</td>
                            </tr>
                        </table>
                    </td>
                    </tr>
                    <tr height="1"><td></td></tr>

                    <tr height="30">
                        <td align="center">
                            <html>
                            <head><title>分页导航栏</title></head>
                            <body>
                            <table border="0" width="100%" cellspacing="0">
                                <tr>
                                    <td width="60%"></td>
                                    <td align="center" width="40%"></td>
                                </tr>
                            </table>
                            </body>
                            </html>
                        </td></tr>

                </table>
                <br>
            </td>
        </tr>

    </table>
    <!-- 页脚 -->
    <iframe src="end.jsp" frameBorder="0" width="920" scrolling="no" height="70" style="margin-top:0"></iframe>
</center>
</body>
</html>
