<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1 style="color:blue;">Login</h1><br><br>
<form:form action="/login" method="post" modelAttribute="user">
Username: <form:input path="uname"/><br><br>
Password: <form:password path="pass"/><br><br>
<input type="submit" value="Login"/><br>
</form:form><br>
Don't have an Account? <a href="/registration">Register</a>
</body>
</html>