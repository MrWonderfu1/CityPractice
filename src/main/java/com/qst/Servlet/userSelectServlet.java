package com.qst.Servlet;

import com.qst.bean.User;
import com.qst.dao.userDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet( value = "/userSelectServlet")
public class userSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId=request.getParameter("userid");
        userDao userDao=new userDao();
        List<User> userList=new ArrayList<>();
        if(userId==null||userId.equals("")){
            //查询所有用户
          //  userList= userDao.findUserList();
            int goPage=1;//代表当前页码
            int rows=5;//
            String pageStr = request.getParameter("page");//pageStr代表要打开的页码
           if (pageStr!=null&&!pageStr.equals("")){
               goPage=Integer.parseInt(pageStr);
           }
           //获取数据库中的所有用户数据
            List<User> allUsers=userDao.findUserList();
           int totals= allUsers.size();//所有用户数量
           int page = (totals+rows-1)/rows; //最后一页的页码

            userList=userDao.findUserListByPage(goPage,rows);
           request.setAttribute("goPage",goPage);
           request.setAttribute("page",page);
        }else{
            //根据ID查询单个用户
            User user=userDao.findUserById(userId);
            if(user==null){
                request.setAttribute("message","该用户不存在");
            }else{
                userList.add(user);
            }
        }
        request.setAttribute("userList",userList);
        request.getRequestDispatcher("userList.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
