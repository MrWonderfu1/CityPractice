package com.qst.Servlet;

import com.qst.dao.userDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "registerServlet",value="/registerServlet")
public class registerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userDao userDao = new userDao();
        if (userDao.register(username,password)>0){
            response.getWriter().print("<script>alert('注册成功');window.location.href='login.jsp';</script>");
        }else{
            request.setAttribute("message","注册失败，用户名已存在");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }
    }


}
