<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1 style="color:blue;">Register</h1><br><br>
<form:form action="/register" method="post" modelAttribute="user">
Username: <form:input path="uname"/><br><br>
<b style="color:red"><form:errors path="uname"/></b><br><br>
Email: <form:input path="email"/><br>
<b style="color:red"><form:errors path="email"/></b><br><br>
Password: <form:password path="pass"/><br>
<b style="color:red"><form:errors path="pass"/></b><br><br>
<input type="submit" value="Register"/><br>
</form:form><br>
Already have an Account? <a href="/">Login</a>
</body>
</html>