<%@ page import="com.student.service.StudentDao" %>
<%@ page import="java.util.List" %>
<%@ page import="com.student.model.StudentInfo" %><%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 2017/2/18
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    StudentDao studentDao = new StudentDao();
    List<StudentInfo> list = studentDao.getAllStudentInfo();
%>
<table>
    <thead>
    <td>学号</td>
    <td>姓名</td>
    <td>年龄</td>
    <td>性别</td>
    <td>专业</td>
    </thead>
    <%
        for (int i = 0; i < list.size(); i++) {
            StudentInfo studentInfo = list.get(i);
    %>
    <tr>
        <td><%=studentInfo.getStudentID()%>
        </td>
        <td><%=studentInfo.getStudentName()%>
        </td>
        <td><%=studentInfo.getAge()%>
        </td>
        <td><%=studentInfo.getSex()%>
        </td>
        <td><%=studentInfo.getMajor()%>
        </td>
        <td><a href="/modifyServlet?studentid=<%=studentInfo.getStudentID()%>">修改</a></td>
    </tr>
    <%
        }
    %>

</table>
</body>
</html>
