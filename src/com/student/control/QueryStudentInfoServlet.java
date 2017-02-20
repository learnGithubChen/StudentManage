package com.student.control;

import com.student.model.StudentInfo;
import com.student.service.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**处理查询请求的Servlet
 * Created by peter on 2017/2/19.
 */
@WebServlet(name = "QueryStudentInfoServlet")
public class QueryStudentInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String studentID = request.getParameter("studentID");
        StudentDao studentDao = new StudentDao();
        StudentInfo studentInfo=studentDao.queryStudentInfo(studentID);
        String message_studentInfo = "";//用来存储查询结果
        if(studentInfo!=null){
            message_studentInfo = "学号:"+studentInfo.getStudentID()+"姓名:"+studentInfo.getStudentName()+
                    "年龄:"+studentInfo.getAge()+"性别:"+studentInfo.getSex()+"专业:"+studentInfo.getMajor();
        }else{
            message_studentInfo="你要查找的学生不存在！";
        }
        out.write(message_studentInfo);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
