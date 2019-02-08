<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
	First Name : ${student.firstName} 
	<br><br>
	Last Name : ${student.lastName}
	<br><br>
	Country : ${student.country}
	<br><br>
	Favorite Language : ${student.favoriteLanguage}
	<br><br>
	Operating Sytems: 
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	<br><br>
</body>

</html>
