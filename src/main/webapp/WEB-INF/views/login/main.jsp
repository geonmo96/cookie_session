<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>main.jsp</h4>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<c:choose>
		<c:when test="${loginUser == null }">
			<script type="text/javascript">
				location.href="login";
			</script>
		</c:when>
		<c:otherwise>
			${sessionScope.loginUser }님 안녕하세요<br>
			<a href="logout">로그아웃</a>
		</c:otherwise>
	</c:choose>
</body>
</html>