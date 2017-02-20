package com.student.control;

import com.student.model.UserInfo;
import com.student.service.UserDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**处理用户信息
 * Created by peter on 2017/2/17.
 */
@javax.servlet.annotation.WebServlet(name = "UserServlet")
public class UserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserInfo userInfo = new UserInfo(username,password);
        UserDao userDao = new UserDao();
        //检验用户和密码是否正确
        if(userDao.login(userInfo)){
            HttpSession session = request.getSession();
            session.setAttribute("user",userInfo);//将用户信息缓存到session
            response.sendRedirect("main.jsp");//登陆到main页面
        }else {
            response.sendRedirect("index.jsp");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
