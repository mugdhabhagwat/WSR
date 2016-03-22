<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
  <title>Register</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
  </script>
</head>
<body>	
	<center>

		<div style="color: teal; font-size: 30px">Register User</div>
		
		<c:url var="userRegistration" value="registerUser" />
		<form:form id="registerForm" modelAttribute="LoginDto" method="post" action="registerUser">
			<table width="400px" height="150px">
				<tr>
					<td><form:label path="username">User Name</form:label></td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td><form:label path="password">Password</form:label></td>
					<td><form:input id="password" path="last_updated_on" /></td>
					<td><a ></a></td>
				</tr>
					<td><form:label path="userRoles">User Roles</form:label></td>
					<td>
						<form:checkbox path="userRoles" value="admin" />Admin 
	                    <form:checkbox path="userRoles" value="user" />User
					 </td>					
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="register"/>
					</td>
				</tr>
				<tr>
			</table>
		</form:form>
	</center>
</body>
</html>