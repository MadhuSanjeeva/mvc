<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName"/>
	<br><br>
	Last Name: <form:input path="lastName"/><br>
	
	<br><br>
	<form:select path="country">
		<form:option value="Brazil" label=""></form:option>
		<form:option value="" label=""></form:option>
		<form:option value="" label=""></form:option>
		<form:option value="" label=""></form:option>
	</form:select>
	
	<input type="submit" value="Submit">
	</form:form>
</body>

</html>
