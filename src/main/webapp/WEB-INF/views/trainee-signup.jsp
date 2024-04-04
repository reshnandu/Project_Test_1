<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<h1><%=request.getAttribute("msg")%></h1>
		<p>FirstName : <%=request.getAttribute("first_name")%> </p>
		<p>LastName: <%=request.getAttribute("last_name")%> </p>
		<p>DOB : <%=request.getAttribute("dob")%> </p>
		<p>Feild of Study : <%=request.getAttribute("feild_of_study")%> </p>
		<p>Email : <%=request.getAttribute("email")%> </p>
		<p>Password : <%=request.getAttribute("password")%> </p>
	</body>
</html>