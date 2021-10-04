<%@ page import="ui.ItemInfo" %>
<%@ page import="bo.ItemHandler" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Collection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <tile>Title</tile>
</head>
<body>


<% Collection<ItemInfo> items = ItemHandler.getItemsWithGroup("");
    Iterator<ItemInfo> it = items.iterator();
    for(; it.hasNext();) {
        ItemInfo item = it.next(); %>
<%= item.getName() %> :
<%= item.getDescription() %><br>

<% } %>

</body>
</html>
}