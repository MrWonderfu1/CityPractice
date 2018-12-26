package com.qst.Servlet;

import com.qst.bean.User;
import com.qst.dao.userDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userUpdateServlet")
public class userUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf8");
        String userid= request.getParameter("userid");
        String newPassword= request.getParameter("password");
        userDao userDao = new userDao();
        int i = userDao.updateUserById(userid,newPassword);
        if (i>0){//修改密码成功
            response.getWriter().print("<script>alert('修改成功');window.location.href='/userSelectServlet';</script>");

        }else {//修改密码失败
            response.getWriter().print("<script>alert('修改失败');history.go(-1);</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String userid=request.getParameter("userid");
       userDao userDao = new userDao();
      User user = userDao.findUserById(userid);
      request.setAttribute("user",user);
      request.getRequestDispatcher("userUpdate.jsp").forward(request,response);

    }
}
