<%--
  Created by IntelliJ IDEA.
  User: frith
  Date: 2021-10-05
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="index.jsp" %>
<hr/>

<h3>Login Form</h3>
<%
    String profile_msg=(String)request.getAttribute("profile_msg");
    if(profile_msg!=null){
        out.print(profile_msg);
    }
    String login_msg=(String)request.getAttribute("login_msg");
    if(login_msg!=null){
        out.print(login_msg);
    }
%>
<br/>
<form action="loginprocess.jsp" method="post">
    Username:<input type="text" name="username"/><br/><br/>
    Password:<input type="password" name="user_password"/><br/><br/>
    <input type="submit" value="login"/>"
</form>