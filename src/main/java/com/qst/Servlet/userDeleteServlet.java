package com.qst.Servlet;

import com.qst.dao.userDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userDeleteServlet",value ="/userDeleteServlet" )
public class userDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String userid=request.getParameter("userid");
        userDao userDao=new userDao();
       int i = userDao.deleteUserById(userid);
       if (i>0){
           response.sendRedirect("/userSelectServlet");
       }else {
           response.getWriter().print("<script>alert('删除失败');history.go(-1)</script>");
       }
    }
}
