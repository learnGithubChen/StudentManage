<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 2017/2/18
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="addStudentInfo">
    <label>学号</label><input type="text" name="studentID"><br>
    <label>姓名</label><input type="text" name="studentName"><br>
    <label>年龄</label><input type="text" name="age"><br>
    性别:<label><input type="radio" name="sex" value="男">男</label><label><input type="radio" name="sex"
                                                                              value="女">女</label><br>
    专业:<select name="major">
    <option value="计算机科学">计算机科学</option>
    <option value="通信工程">通信工程</option>
    <option value="软件工程">软件工程</option>
    <option value="电子商务">电子商务</option>
    <option value="网络工程">网络工程</option>
</select>
    <input type="hidden" name="flag" value="1">
    </label><input type="submit" value="提交">
</form>
</body>
</html>
