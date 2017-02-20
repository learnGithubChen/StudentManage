<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 2017/2/17
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生管理系统</title>
    <script type="text/javascript">
        //检验是否输入用户名和密码
        function checkValue(){
            var username = document.getElementById("username").value;
            if(username==""||username==null){
                alert("请输入用户名");
                return;
            }
            var password = document.getElementById("password").value;
            if(password==null||password==""){
                alert("请输入密码");
                return;
            }
        }
    </script>
  </head>
  <body>
  <form action="userServlet" method="post" onsubmit="checkValue()" >
    <table>
      <tr><td><label>用户名</label></td><td><input type="text" name="username" id="username"></td></tr>
      <tr><td><label>密码</label></td><td><input type="password" name="password" id="password"></td></tr>
      <tr><td><input type="submit" value="登录"  ></td><td><input type="reset"value="重置"></td></tr>
    </table>
  </form>

  </body>
</html>
