<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Login</title>
    <style>
        body{
            color : white;
            background-image: url("https://wallpaper.wiki/wp-content/uploads/2017/05/wallpaper.wiki-Sunrise-Wallpaper-Download-Free-PIC-WPE00740.jpg")
        }
    </style>
</head>

<body>
<form action="${pageContext.request.contextPath}/servl.html" method="POST">
    <h1>Log In</h1>
    <p>Username:
        <input type="text" name="username"/></p>
    <p>Password:
        <input type="password" name="password"/></p>

    <p> <input type="submit" name="login2" value="LOG IN"/></p>
</form>
</body>

</html>
