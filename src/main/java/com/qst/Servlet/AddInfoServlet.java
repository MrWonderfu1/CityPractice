package com.qst.Servlet;
import com.qst.bean.Info;
import com.qst.bean.User;
import com.qst.dao.InfoDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddInfoServlet",value = "/AddInfoServlet")
public class AddInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String infotype = req.getParameter("infoType");
        String infoTitle = req.getParameter("infoTitle");
        String infoContent = req.getParameter("infoContent");
        String infoPhone = req.getParameter("infoPhone");
        String infoLinkman = req.getParameter("infoLinkman");
        String infoEmail = req.getParameter("infoEmail");
        User user = (User) req.getSession().getAttribute("user");
        //用户名是否登录
        if (user != null){
            Info info = new Info();
            info.setType(Integer.parseInt(infotype));

            info.setTitle(infoTitle);
            info.setId(user.getId());
            info.setPhone(String.valueOf(infoPhone));
            info.setEmail(infoEmail);
            info.setContent(infoContent);
            info.setLinkman(infoLinkman);
            InfoDao infoDao = new InfoDao();

            if (infoDao.addinfo(info) > 0){
                resp.setCharacterEncoding("utf-8");
                resp.setContentType("text/html; charaset=utf-8");
                resp.getWriter().print("<script>alert('请先登录，再发布信息');window.location.href='addInfo.jsp'</script>");


            }else{
                resp.getWriter().print("<script>history.go(-1)</script>");
            }
        }else {
            resp.setCharacterEncoding("utf-8");
            resp.setContentType("text/html; charaset=utf-8");
            resp.getWriter().print("<script>alert('请先登录，再发布信息');window.location.href='login.jsp'</script>");
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
