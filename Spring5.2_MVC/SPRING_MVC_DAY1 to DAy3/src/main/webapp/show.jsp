<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Output of Show JSP</h1>
	<h1>List of ${CourseName} Courses</h1>
	<ul>
		<c:forEach var="cou" items="${MyCourses}">
			<li>${cou}</li>
		</c:forEach>
	</ul>
</body>
</html>
