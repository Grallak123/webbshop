<%--
  Created by IntelliJ IDEA.
  User: frith
  Date: 2021-10-05
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<html>
<body>
<a href="webbshop2.jsp"> Go to Webbshop</a>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="db.ItemDB"%>
<jsp:useBean id="obj" class="bean.ItemBean"/>

<jsp:setProperty property="*" name="obj"/>

<% int theUserId = (int) session.getAttribute("userId"); %>
<% String theUserName = (String)session.getAttribute("username");%>
Welcome to the Webb Shop <% out.print(theUserName);%> <% out.print(theUserId);%><br><br>

<%

    ItemDB.addItem(obj.getName(),obj.getDescription(),theUserId);
    String redirectURL = "http://localhost:8081/demoman_war_exploded/webbshop2.jsp";
    response.sendRedirect(redirectURL);

%>


<jsp:include page="webbshop2.jsp"></jsp:include>

<br>

</body>
</html>