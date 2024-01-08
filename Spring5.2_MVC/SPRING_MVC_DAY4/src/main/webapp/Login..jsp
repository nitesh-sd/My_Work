<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JTC User Account</h1>
	<form:form action="verifyUser.jtc" method="post" modelAttribute=""></form:form>
	<table>
		<tr>
			<td>UserName</td>
			<td><form:input path = "username"/></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><form:input path = "password"/></td>
		</tr>
		<tr>
			<td><input type = "Submit" value = "Login"></td>
			<td><form:input path = "password"/></td>			
		</tr>

	</table>


</body>
</html>