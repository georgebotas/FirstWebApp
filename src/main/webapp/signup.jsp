<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registation</title>
    <style>
        body {
            color: white;
            background-image: url("https://wallpaper.wiki/wp-content/uploads/2017/05/wallpaper.wiki-Sunrise-Wallpaper-Download-Free-PIC-WPE00740.jpg")
        }
    </style>
</head>

<body>
<form action="${pageContext.request.contextPath}/servl.html" method="POST">
    <h1>Create a new account</h1>
    <p>Name:
        <input type="text" name="name"/></p>
    <p>Username:
        <input type="text" name="username"/></p>
    <p>E-mail:
        <input type="text" name="e-mail"/></p>
    <p>Gender:
        <input type="radio" name="gender" value="F"/> Female
        <input type="radio" name="gender" value="M"/> Male</p>
    <p>Password:
        <input type="password" name="password"/></p>

    <p> <input type="submit" name="signup2" value="SIGN UP"/></p>
</form>
</body>

</html>
