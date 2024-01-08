<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<div align="center">
		<h1>JTC User Account Login</h1>
		<form:form action="verifyUser.jtc" method="post"
			modelAttribute="MyUser">
			<table>
				<tr>
					<td>Username</td>
					<td><form:input path = "username" /></td>
<!-- 					<td><input type = "text" name = "username"/></td>
 -->					<td><font color = red size = 5><form:errors
							path = "username"/>
					</font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:password path = "password" /></td>
<!-- 					<td><input type = "password" name = "password"/></td>
 -->					<td><font color = red size = 5><form:errors
							path = "password"/>
					</font></td>
				</tr>
				<tr>
				
				<td colspan = "3"><input type = "submit" value="Account Login"></td>
				
				</tr>
			</table>
		</form:form>

	</div>
</body>
</html>