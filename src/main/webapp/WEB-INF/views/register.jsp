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
</head>
<body>	
	<center>

		<div style="color: teal; font-size: 30px">Register User</div>
		
		<table border="1" bgcolor="black" width="600px">
		<c:if test="${not empty projectUsersList}">
		<ul>
			<c:forEach var="listValue" items="${projectUsersList}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>
		</c:if>
		</table>
	</center>
	
	
	<div style="color: teal;font-size: 30px">Registration Form</div>
	<br><br>
	<c:url var="userRegistration" value="saveUser.html"/>
	<form:form id="registerForm" modelAttribute="user" method="post" action="${userRegistration}">
	<table width="400px" height="150px">
	<tr>
	<td><form:label path="userName">User Name</form:label></td>
	<td><form:input  path="userName"/></td>
	</tr>
	<tr>
	<td><form:label path="password">Password</form:label></td>
	<td><form:input  path="password"/></td>
	</tr>
	<tr>
	<td><form:label path="projectRoles">Role</form:label></td>
	<td><form:radiobuttons path="projectRoles" items="${projectRoles.roleDescription}"/></td>
	</tr>
	<tr><td></td><td>
	<input type="submit" value="registerUser" />
	</td></tr>
	</table>
	</form:form>
	
</body>
</html>