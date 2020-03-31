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
<br>
Last Name: <form:input path="lastName"/>
<br>
Country:
<form:select path="country">
<form:option value="India" label="IND"></form:option>
<form:option value="America" label="USA"></form:option>
<form:option value="New Zealand" label="NZL"></form:option>
</form:select>
<input type="submit" value="submit">
</form:form>
</body>
</html>