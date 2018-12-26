<%--
  Created by IntelliJ IDEA.
  User: Mr. Wonderful
  Date: 2018/10/15
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>都市信息网</title>

    <link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body background="images/back.gif">
<center>
    <table border="0" width="920" height="auto" cellspacing="0" cellpadding="0" bgcolor="white">
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


                <html>
                <head><title>首页</title></head>
                <body>
                <div align="center" >
                    <!-- 缴费专区 -->

                    <table border="0" width="670" cellspacing="0" cellpadding="5">
                        <tr height="35"><td style="text-indent:5px" valign="bottom"><font color="#004790"><b>■推荐信息</b>『缴费专区』</font></td></tr>
                        <tr bgcolor="#FAFCF5">
                            <td style="border:1px solid">
                                <table border="0" width="100%" cellspacing="0" cellpadding="0">
                                    <tr height="23">
                                        <td width="50%">『<b>求职信息</b>』
                                            <a href="singleshow.jsp">求职信息标题</a>
                                        </td>
                                        <td width="50%">『<b>招聘信息</b>』
                                            <a href="singleshow.jsp">招聘信息标题</a>
                                        </td>
                                    </tr>

                                    <tr height="23">
                                        <td width="50%">『<b>培训信息</b>』
                                            <a href="singleshow.jsp">培训信息标题</a></td>
                                        <td width="50%">『<b>求购信息</b>』
                                            <a href="singleshow.jsp">求购信息标题</a></td>
                                    </tr>

                                    <tr height="23">
                                        <td width="50%">『<b>求职信息</b>』
                                            <a href="singleshow.jsp">求职信息标题</a>
                                        </td>
                                        <td width="50%">『<b>招聘信息</b>』
                                            <a href="singleshow.jsp">招聘信息标题</a>
                                        </td>
                                    </tr>

                                    <tr height="23">
                                        <td width="50%">『<b>培训信息</b>』
                                            <a href="singleshow.html">培训信息标题</a></td>
                                        <td width="50%">『<b>求购信息</b>』
                                            <a href="singleshow.html">求购信息标题</a></td>
                                    </tr>

                                </table>
                            </td>
                        </tr>
                    </table>
                    <!-- 广告 -->
                    <table border="0" width="670"cellspacing="0" cellpadding="0" style="margin-top:1px">
                        <tr><td align="center"><img src="/images/pcard2.jpg"></td></tr>
                    </table>
                    <!-- 免费专区 -->

                    <table border="0" width="670" cellspacing="2" cellpadding="0">
                        <tr height="35"><td colspan="2" style="text-indent:5px" valign="bottom"><font color="#004790"><b>■最新信息</b>『免费专区』</font></td></tr>

                        <tr>
                            <td align="center">
                                <table border="1" cellspacing="0" cellpadding="0" width="332" height="160" rules="none" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">

                                </table>
                            </td>



                        </tr>

                        <tr>
                            <td align="center">
                                <table border="1" cellspacing="0" cellpadding="0" width="332" height="160" rules="none" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">
                                    <tr bgcolor="#00B48F" height="30">
                                        <td style="text-indent:10px"><b><font color="white">培训信息</font></b></td> </tr>
                                    <tr bgcolor="#FAFCF5"><td style="text-indent:3px">★ <a href="singleshow.jsp">发布培训信息标题</a></td></tr>
                                    <tr height="20" bgcolor="#FAFCF5"><td align="right"><a href="listshow.jsp">更多...</a>&nbsp;&nbsp;</td></tr>

                                </table>
                            </td>

                            <td align="center">
                                <table border="1" cellspacing="0" cellpadding="0" width="332" height="160" rules="none" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">

                                    <tr bgcolor="#00B48F" height="30">
                                        <td style="text-indent:10px"><b><font color="white">求职信息</font></b></td>
                                    </tr>

                                    <tr bgcolor="#FAFCF5">
                                        <td style="text-indent:3px">★ <a href="singleshow.jsp">发布求职信息标题</a></td>
                                    </tr>
                                    <tr height="20" bgcolor="#FAFCF5">
                                        <td align="right"><a href="listshow.jsp">更多...</a>&nbsp;&nbsp;</td>
                                    </tr>

                                </table>
                            </td>
                        </tr>

                    </table>
                    <br>
                </div>
                </body>
                </html>
            </td>
        </tr>

    </table>
    <!-- 页脚 -->
    <iframe src="end.jsp" frameBorder="0" width="920" scrolling="no" height="70" style="margin-top:0"></iframe>
</center>
</body>
</html>
