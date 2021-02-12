<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nagesh Page</title>
</head>
<body>
<div align="center">
	<h3>Welcome to Maganti Page</h3>
	
	<br />
	<br />
	<hr/>
	<form:form action="process-homepage" method="get" modelAttribute="HomeUserInfo">	
	<p>
		<label for="yn"> Your Name </label> 
		<form:input id="yn" path="userName" />	
	</p>
	<p>		 
		<label for="cn"> Crush Name </label>
		<form:input id="cn" path="crushName" />
	</p>	
	<input type="submit" value="Calculate">
	</form:form>
</div>
</body>
</html>