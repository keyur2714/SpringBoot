<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web Stack</title>
</head>
<body>
	
	<a href="add">Add Student</a>	
	
	<table border="5">
		<tr>
			<th>Roll No</th>						
			<th>Name</th>
			<th>Email</th>
			<th>Mobile No</th>
			<th>Action</th>			
		</tr>			
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.rollNo}</td>
				<td>${student.name}</td>
				<td>${student.email}</td>
				<td>${student.mobileNo}</td>
				<td>
					<a href="getStudent?id=${student.id}">Detail</a>
				</td>
			</tr>	
		</c:forEach>
	
	</table>	

</body>
</html>