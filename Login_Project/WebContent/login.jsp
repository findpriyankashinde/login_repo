<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Login Page </title>
</head>
<body> </br>
<h2> <center> Welcome to Login Page </center></h2> <br/> <br/>

<center><p style="color:red">
<h3> 
<%if(null!=request.getAttribute("errormessage")) {%>
<%=request.getAttribute("errormessage") %>
<%} %>
</h3>
</p></center>

<form action="login" >
<input type="hidden" name="requestAction" value="login">  

<center>

Enter User ID:<input type="text" name="userid"/> <br/> <br/>  

Enter Password:<input type="password" name="password"/> <br/> <br/>  

<input type="submit" value="Login"/> 
</center>

</form>
 

<center>
<h3>
<% session.invalidate(); %>
<%if(null!=request.getAttribute("logoutmsg")) {%>
<%=request.getAttribute("logoutmsg") %>
<%} %>
</h3> 
</center>

</body>
</html>