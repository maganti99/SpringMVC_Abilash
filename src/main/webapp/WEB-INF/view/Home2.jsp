<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <title>Reservation Form</title>  
</head>  
<h3>Railway Reservation Form</h3>  
<body>  
    <form:form action="process-homepage" modelAttribute="HomeUserInfo">  
        First name: <form:input id="yn" path="userName" />         
        <br><br>  
        Last name: <form:input id="cn" path="crushName" />  
        <br><br>  
        <input type="submit" value="Calculate" />      
    </form:form>  
</body>  
</html>  