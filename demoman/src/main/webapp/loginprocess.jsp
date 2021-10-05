<%--
  Created by IntelliJ IDEA.
  User: frith
  Date: 2021-10-05
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="db.LoginDao"%>
<jsp:useBean id="obj" class="bean.LoginBean"/>

<jsp:setProperty property="*" name="obj"/>

<%
    boolean status=LoginDao.validate(obj);
    if(status){
        out.println("You r successfully logged in");
        session.setAttribute("session","TRUE");
        //request.getRequestDispatcher("index.jsp").forward();
         %>
        session.setAttribute("username", obj.getUsername());
        session.getAttribute("username");

<%
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