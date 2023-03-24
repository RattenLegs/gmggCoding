<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page pageEncoding="utf-8" %>
<%@ page import="java.util.Date" %>
<% Date now = new Date(); %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p>현재 시각: <%= now %></p>
</body>
</html>
