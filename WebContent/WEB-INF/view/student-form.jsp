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
java<form:radiobutton path="favouriteLanguage" value= "java"/>
c++<form:radiobutton path="favouriteLanguage" value= "c++"/>
PHP<form:radiobutton path="favouriteLanguage" value= "PHP"/>
ANGULAR<form:radiobutton path="favouriteLanguage" value= "Angular"/>
<br><br>
<input type="submit" value="submit">
</form:form>
</body>
</html>