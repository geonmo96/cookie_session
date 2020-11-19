<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>delSession</h4>
	id : ${id }<br>
	age : ${age }<br>
	addr : ${sessionScope.addr }<br>
	
	<a href="resultSession">resultSession</a>
	<a href="makeSession">makeSession</a>
</body>
</html>