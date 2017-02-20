<%@ page import="com.student.model.StudentInfo" %><%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 2017/2/18
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript">
        function queryStudentInfo() {
            var httpRequest = new XMLHttpRequest();
            var studentID = document.getElementById("studentID").value;
            httpRequest.open("Get", "/queryStudentInfo?studentID=" + studentID, true);
            httpRequest.send();
            httpRequest.onreadystatechange = function () {
                if (httpRequest.readyState == 4 && httpRequest.status == 200) {
                    document.getElementById("queryStudentInfo").innerHTML = httpRequest.responseText;
                }
            }
        }
    </script>
</head>
<body>
请输入学号<input type="text" name="studentID" id="studentID">
<input type="button" onclick="queryStudentInfo();" value="查询">
<div id="queryStudentInfo"></div>
</body>
</html>
