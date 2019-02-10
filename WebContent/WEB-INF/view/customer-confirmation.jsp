<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Customer Confirmation Page</title>
</head>
<body>
First Name: ${customer.firstName}<br><br>
Last Name: ${customer.lastName }<br><br>
Free Passes : ${customer.freePasses }<br><br>
Postal Code : ${customer.postalCode }<br><br>
Course Code : ${customer.courseCode }<br><br>
</body>
</html>