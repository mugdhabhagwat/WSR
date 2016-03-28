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
		function validateRegistrationForm(){
			var userNameInput = document.getElementById("userName").value;
			var passwordInput = document.getElementById("password").value;
			var projectRolesList = document.getElementById("projectRolesList");
			var projectRoleSelected=null;
			
			if(projectRolesList.selectedIndex!=-1)
				projectRoleSelected = projectRolesList.options[projectRolesList.selectedIndex].value;
			
			
			if((userNameInput==null || userNameInput == "") || (passwordInput==null || passwordInput=="") || (projectRoleSelected==null || projectRoleSelected=="")) {
				alert("Please fill in required details");
				return false;
			}
			else
				return true;
		}
	</script>
  
</head>
<body>	
	<center>
	<div style="color: teal;font-size: 30px">Registration Form</div>
	<br><br>
	<c:url var="userRegistration" value="saveUser.html"/>
	<form:form id="registerForm" modelAttribute="user" method="post" onsubmit="return validateRegistrationForm()" action="saveUser">
	<table width="400px" height="150px">
	<tr>
	<td><form:label path="userName">User Name</form:label></td>
	<td><form:input  path="userName" id="userName"/></td>
	</tr>
	<tr>
	<td><form:label path="password">Password</form:label></td>
	<td><form:input  path="password" id="password"/></td>
	</tr>
	<tr>
	<td><form:label path="projectRoles">Project Roles</form:label></td>
	<td>
	<form:select  path="projectRoles" id="projectRolesList">
        <form:options items="${projectRoles}" itemValue="roleId" itemLabel="roleDescription"></form:options>
    </form:select>
    </td>
	</tr>
	<tr><td>
	<input type="submit" value="Register User"/>
	</td></tr>
	</table>
	</form:form>
	</center>
	
	<script>
	document.getElementById("projectRolesList").removeAttribute("multiple");
	</script>
		
</body>
</html>