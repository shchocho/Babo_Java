<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>


<div id="wrapper">
  		<div id="header">
  			<jsp:include page="/incl/banner.jsp">
  				<jsp:param value="mod007:Java Beans and include" name="subtitle"/>
  			</jsp:include>
  		</div>
  	<div id="content-wrapper"></div>
  	 <section>
      <h3>회원가입되 었습니다.</h3>
      <div>  
      	<jsp:useBean id="user" class="com.varxyz.jv302.mod007.User" scope="request"></jsp:useBean>
      	아이디: <jsp:getProperty property="userId" name="user"/> <br> 
      	이름: <jsp:getProperty property="userName" name="user"/> <br> 
      	
      </div>
    </section>
    <div id ="footer">
    	<%@ include file ="/incl/footer.jsp"%>
    </div>
  	</div>
</body>
</html>