<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie.jsp</title>
<script type="text/javascript">
	function popup(){
		console.log("cook : " + '${cook}')
		// ${cook}으로만 사용한다면 null일 때는 아무것도 없기 때문에 "cook : " + 가 된다.
		// 아무것도 없기 때문에 ''를 해야함
		
		if('${cook}' == "" || '${cook}' == null){
			window.open("popup","","width=300,height=200,top=500,left=500");
			// 자기 자신에서 오픈할거라면 2번째 인덱스에 self?가 들어가면 된다
		}
	}
</script>
</head>
<body onload="popup()">
	cookie 페이지 입니다
</body>
</html>