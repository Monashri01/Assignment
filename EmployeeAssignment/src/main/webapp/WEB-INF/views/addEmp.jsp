<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<h1>Add Employee</h1>
<form:form action="/addemp" method="post" modelAttribute="employee">
Employee Id: <form:input path="id" />
<b style="color:red"><form:errors path="id"/></b><br><br>
Employee Name: <form:input path="name" />
<b style="color:red"><form:errors path="name"/></b><br><br>
Employee Department: <form:input path="dept" />
<b style="color:red"><form:errors path="dept"/></b><br><br>
Employee Designation: <form:input path="desg" />
<b style="color:red"><form:errors path="desg"/></b><br><br>
Employee Salary: <form:input path="salary" />
<b style="color:red"><form:errors path="salary"/></b><br><br>
<input type="submit" value="Add Employee"/>
</form:form>
</body>
</html>