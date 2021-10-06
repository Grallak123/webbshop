<%--
  Created by IntelliJ IDEA.
  User: frith
  Date: 2021-10-03
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="ui.ItemInfo" %>
<%@ page import="bo.ItemHandler" %>
<%@ page import="ui.CartInfo" %>
<%@ page import="bo.CartHandler" %>
<%@ page import="ui.UserInfo" %>
<%@ page import="bo.UserHandler" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Collection" %>
<%@ page import="db.CartDB" %>
<%@ page import="db.ItemDB" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    table, th, td {
        border:1px solid black;
    }
</style>
<head>
    <tile><h1>WEBBLER 2</h1></tile>
</head>
<body>
<a href="login.jsp"> Log out</a>
<br>
<% int theUserId = (int) session.getAttribute("userId"); %>
<% String theUserName = (String)session.getAttribute("username");%>
Welcome to the Webb Shop <% out.print(theUserName);%> <% out.print(theUserId);%><br><br>



<h2>Item table</h2>

<table style="width:100%">
    <% Collection<ItemInfo> items = ItemHandler.findUserItems(theUserId);
        Iterator<ItemInfo> it = items.iterator();
        for(; it.hasNext();) {
            ItemInfo item = it.next(); %>
    <tr>
        <th>Item: <%= item.getId() %></th>
        <th>Item name: <%= item.getName() %></th>
        <th>Item description: <%= item.getDescription() %></th>
        <th>Item cart: <%= item.getCart_nr() %></th>

    </tr>

    <% } %>
</table>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br>
<br>


<form action="webbshopitemprocess.jsp" method="post">
    Item name:<input type="text" name="name"/><br/><br/>
    Item description:<input type="text" name="description"/><br/><br/>

    <input type="submit" value="submit"/>"
</form>

<br>

</body>
</html>
}
