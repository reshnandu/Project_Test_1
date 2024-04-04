<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><%=request.getAttribute("msg")%></h1>
	<p>Email : <%=request.getAttribute("email")%> </p>
	<p>Password : <%=request.getAttribute("password")%> </p>
</body>
</html>