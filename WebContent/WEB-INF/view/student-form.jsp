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
	<form:radiobuttons path="favouriteLanguage" items= "${theLanguages}"/>
	<br><br>
	<input type="submit" value="submit">
	</form:form>
</body>
</html>