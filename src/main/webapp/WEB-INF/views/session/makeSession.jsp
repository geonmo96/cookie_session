<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>makeSession</h4>
	id : ${id }<br>
	age : ${age }<br>
	addr : ${sessionScope.addr }<br>
	<!-- scope를 사용하지 않은 변수는 범위가 작은 범위부터 출력됨 -->
	<!-- page > request > session > application -->
	<hr>
	<a href="resultSession">resultSession</a>
	<a href="delSession">delSession</a>
</body>
</html>