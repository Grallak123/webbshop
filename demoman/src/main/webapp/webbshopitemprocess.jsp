<%--
  Created by IntelliJ IDEA.
  User: frith
  Date: 2021-10-05
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="db.ItemDB"%>
<jsp:useBean id="obj" class="bean.ItemBean"/>

<jsp:setProperty property="*" name="obj"/>

<%

    ItemDB.addItem(obj.getName(),obj.getDescription(),obj.getCart_nr());

%>


<jsp:include page="webbshop.jsp"></jsp:include>

<br>
<a href="webbshop.jsp"> Go to Webbshop</a>
