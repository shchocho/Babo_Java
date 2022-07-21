<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>my page</h3>
<a href='<c:url value="/mod010/logout"/>'> 로그아웃 </a>
<label>Last Access Time:</label> ${lastAccessTime}

<form action="edit_user.do" method="get">
	아아디 : <input type="text" name="userId">	
	<input type="submit" value ="정보변경">
</form>

</body>
</html>