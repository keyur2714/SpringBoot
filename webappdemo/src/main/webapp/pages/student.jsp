<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web Stack</title>
</head>
<body>
	<form action="/students/save" method="post">
		<table border=5>
			<tr>
				<th>Roll No:</th>
				<td><input type=text name=rollNo /></td>
			</tr>
			<tr>
				<th>Name:</th>
				<td><input type=text name=name /></td>
			</tr>
			<tr>
				<th>MobileNo:</th>
				<td><input type=text name=mobileNo /></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><input type=text name=email /></td>
			</tr>
			<tr>
				<td><button>Save</button></td>
			</tr>
		</table>
	</form>
</body>
</html>