<%--
  Created by IntelliJ IDEA.
  User: raluca.botas
  Date: 2/6/2018
  Time: 6:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <style>
        body{
            color : white;
            background-image: url("https://wallpaper.wiki/wp-content/uploads/2017/05/wallpaper.wiki-Sunrise-Wallpaper-Download-Free-PIC-WPE00740.jpg")
        }
    </style>
</head>
<body>
<h1>
    <%
    String name=request.getParameter("username");
    out.print("Welcome to the website " + name + "!");
    %>
</h1>
</body>
</html>
