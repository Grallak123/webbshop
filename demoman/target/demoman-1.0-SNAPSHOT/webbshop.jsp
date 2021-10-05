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
    <tile><h1>WEBBLER</h1></tile>
</head>
<body>
<br>
<% String theUserName = (String)session.getAttribute("username");%>
Welcome to the Webb Shop <% out.print(theUserName);%><br><br>


<h2>Cart table</h2>

<table style="width:100%">
<% Collection<ItemInfo> items = ItemHandler.getItemsWithGroup("");
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
<%/*  String x1 = "kex";
    String x2 = "kex smakar gott";
    int x3 = 1;*/
%>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br>
<br>


<form action="webbshopitemprocess.jsp" method="post">
    Item name:<input type="text" name="name"/><br/><br/>
    Item description:<input type="text" name="description"/><br/><br/>
    Cart nr<input type="text" name="cart_nr"/><br/><br/>
    <input type="submit" value="submit"/>"
</form>

<h2>Cart table</h2>

<table style="width:100%">
<% Collection<CartInfo> carts = CartHandler.getcartsWithGroup("");
    Iterator<CartInfo> it2 = carts.iterator();
    for(; it2.hasNext();) {
        CartInfo cart = it2.next();
        //request.getParameterNames();
        //session.setAttribute();
%>

<tr>
    <th>Cart: <%= cart.getId_cart() %> </th>
    <th>Cart User: <%= cart.getCart_user() %></th>
</tr>

<% } %>
</table>
<br>
<h2>User table</h2>

<table style="width:100%">
<% Collection<UserInfo> users = UserHandler.getUsersWithGroup("");
    Iterator<UserInfo> it3 = users.iterator();
    for(; it3.hasNext();) {
        UserInfo user = it3.next(); %>


    <tr>
        <th>User: <%= user.getId_user() %></th>
        <th>User_cart: <%= user.getUser_cart() %></th>
        <th>Username: <%= user.getUsername() %></th>
        <th>User_password: <%= user.getUser_password() %></th>
    </tr>


<% } %>
</table>
<br>

</body>
</html>
}
