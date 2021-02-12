<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
     <h3>Result Page</h3>
     <p>
     User Name : ${usrInfo.getUserName()}
     </p>
     <p>
     Crush Name : ${usrInfo.getCrushName()}
     </p>
     
     <form:form modelAttribute="usrInfo">	
	<p>
		<label for="yn"> Your Name </label> 
		<form:input id="yn" path="userName" />	
	</p>
	<p>		 
		<label for="cn"> Crush Name </label>
		<form:input id="cn" path="crushName" />
		<form:textarea path="crushName"/>
	</p>	
	
	</form:form>
     
     
</body>
</html>