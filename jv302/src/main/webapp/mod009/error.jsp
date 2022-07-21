<%@page import="java.util.List"%>
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
<div id="wrapper">
  		<div id="header">
  			<jsp:include page="/incl/banner.jsp">
  				<jsp:param value="mod009:Java Beans and include" name="subtitle"/>
  			</jsp:include>
  		</div>
  		
  	<div id="content-wrapper">
  		<c:if test = "${not empty errorMsgs} ">
  			<h3>다음과 같은 에러가 발생했습니다</h3>
  			<ul>
  			<c:forEach var="message" items="${errorMsgs}">
  				<li> ${ message } </li>	
  			</c:forEach>
  			</ul>  		
  		</c:if>  		
  	</div>	
  		
    <div id ="footer">
    	<%@ include file ="/incl/footer.jsp"%>
    </div>
  	</div>



	

</body>
</html>