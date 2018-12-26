package com.qst.Servlet;

import com.qst.bean.User;
import com.qst.dao.userDao;
import com.qst.util.JDBCUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(value = "/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        userDao userDao=new userDao();
        User user= userDao.login(username,password);
        if(user==null){
            //登录失败
            request.setAttribute("message","用户名或密码错误");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }else{
            HttpSession session=request.getSession();
            session.setAttribute("user",user);
            response.sendRedirect("index.jsp");
        }

    }

}



