<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
    <%= "<h1> The sum is "+(Integer.parseInt(request.getParameter("num1"))+Integer.parseInt(request.getParameter("num2")))+"</h1>"%>
    </body>
</body>
</html>