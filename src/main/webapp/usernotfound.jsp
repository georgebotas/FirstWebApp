<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Not Found</title>
    <style>
        body{
            color : white;
            background-image: url("https://wallpaper.wiki/wp-content/uploads/2017/05/wallpaper.wiki-Sunrise-Wallpaper-Download-Free-PIC-WPE00740.jpg")
        }
    </style>
</head>
<body>
<h1>
    The username and/or password you've entered were incorrect. Press 'Home' to go back to the main page.
    <form action="${pageContext.request.contextPath}/servl.html" method="GET">
        <input type="submit" name = "home" value = "Home"></input>
    </form>
</h1>
</body>
</html>
