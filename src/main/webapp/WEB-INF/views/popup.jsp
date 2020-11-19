<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>popup.jsp</title>
<script type="text/javascript">
	function chk(){
		location.href="cookieChk";
	}
</script>
</head>
<body>
	<h4>popup.jsp</h4>
	cookie 페이지 입니다<br><br><br>
	
	<input type="checkbox" onclick="chk()">하루동안 열지 않음
</body>
</html>