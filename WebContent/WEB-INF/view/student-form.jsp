<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student REgistration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstName"/>
<br><br>
Last Name: <form:input path="lastName"/>
<br><br>
Operating System:
Windows<form:checkbox path="softwareCheckbox" value="Windows"/>
Linux<form:checkbox path="softwareCheckbox" value="Linux"/>
Mac<form:checkbox path="softwareCheckbox" value="Mac"/>
<input type="submit" value="submit">
</form:form>
</body>
</html>