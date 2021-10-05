<%--
  Created by IntelliJ IDEA.
  User: frith
  Date: 2021-10-05
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="db.LoginDao"%>
<%@ page import="bo.User" %>
<jsp:useBean id="obj" class="bean.LoginBean"/>

<jsp:setProperty property="*" name="obj"/>

<%
    boolean status=LoginDao.validate(obj);
    if(status){
        out.println("You have successfully logged in" + obj.getUsername() + obj.getUser_password());
        session.setAttribute("session","TRUE");
        //request.getRequestDispatcher("index.jsp").forward();
        session.setAttribute("username", obj.getUsername());
        //gör så att vi får id:et också

       /* int userId = LoginDao.checkUserId(obj);
        userId = 5;
        session.setAttribute("userId",userId);*/

        //System.out.println(session.getAttribute((User)));


    }
    else
    {
        out.print("Sorry, email or password error");
%>


<jsp:include page="index.jsp"></jsp:include>
<%
    }
%>
<br>

<a href="webbshop.jsp"> Go to Webbshop</a>

<html>
<body>
<h2>this is loginProcess.jsp</h2>

<% String uname = (String) obj.getUsername();%>

<jsp:forward page="webbshop.jsp" >
    <jsp:param name="username" value="theusernameyes" />

</jsp:forward>

</body>
</html>