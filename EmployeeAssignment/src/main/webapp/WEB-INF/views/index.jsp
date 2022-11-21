<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Employee List</h1>
<br><br>
<a href="/showAddPage">Add Employee</a><br><br>
<table border="1">
<tr>
<th>ID</th>
<th>NAME</th>
<th>DEPARTMENT</th>
<th>DESIGNATION</th>
<th>SALARY</th>
</tr>
<c:forEach var="e" items="${employeelist}">
<tr>
<td><a href="/${e.id}">${e.id}</a></td>
<td>${e.name}</td>
<td>${e.dept}</td>
<td>${e.desg}</td>
<td>${e.salary}</td>
<td><a href="/showUpdatePage/${e.id}">Update</a></td>
<td><a href="/delete/${e.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>