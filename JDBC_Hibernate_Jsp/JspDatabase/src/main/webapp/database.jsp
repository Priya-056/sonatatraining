<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*,java.util.*" %>
<%

try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sys", "priya", "Priya056*");
Statement st=con.createStatement();
String name=request.getParameter("name");
String address=request.getParameter("address");
long mobno=Long.parseLong(request.getParameter("tel"));
String qry="insert into sys.form values('"+name+"','"+address+"','"+mobno+"')";
int i=st.executeUpdate(qry);
out.println("Data inserted Successfully");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
</body>
</html>