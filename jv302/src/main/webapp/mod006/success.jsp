<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String userName = (String)request.getAttribute("userName");
String userId = (String)request.getAttribute("userId");
%>
<h3> 당신의 이름은 <%= userName %> 이군요</h3>
<h4> 당신의 아이디는 <%= userId %> 이군요</h4>

기강잡기
</body>
</html>