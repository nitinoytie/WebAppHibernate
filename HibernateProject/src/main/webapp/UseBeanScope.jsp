<%@page import="dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="ob" class="bean.User" scope="session"></jsp:useBean>
	
	<jsp:setProperty property="*" name="ob"/>
	
	<%
	UserDao.saveUser(ob);
	%>
	
	<jsp:getProperty property="name" name="ob"/>
	<jsp:getProperty property="email" name="ob"/>
	<jsp:getProperty property="password" name="ob"/>
	<h4>User Succefully Saved..</h4>
	<a href="UserList.jsp">List of User</a>
</body>
</html>