<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  --%> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student REgistration Form</title>
</head>
<body>
The student is confirmed: ${student.firstName} ${student.lastName} .
<br>

Operating System(S):
<ul>
<c:forEach var="OPS" items="${student.softwareCheckbox}">
<li>
${OPS}
</li>
</c:forEach>
</ul>
</body>
</html>