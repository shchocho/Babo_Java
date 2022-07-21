<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<title>Login</title>   

<link rel="stylesheet" href="./style.css">
</head>
<body> 
  	<div id="wrapper">
  		<div id="header">
  			<jsp:include page="/incl/banner.jsp">  				
  			
  				<jsp:param value="mod008:Java Beans and include" name="subtitle"/>
  			</jsp:include>
  		</div>
  	<div id="content-wrapper">
  	 <section>
      <h3>회원가입</h3>
      <div>
        <form action="add_user.do" method="post">
          <div>
            회원 아이디 : <input type="text" name="userId">
          </div>
          <div>
            비밀 번호: <input type="password" name="passwd">
            <br>
          </div>
          <div>
            이름 : <input type="text" name="userName">
            <br>
          </div>
          <div>
            주민번호: <input type="text" name="ssn">
            <br>
          </div>
          <div>
            이메일1 : <input type="text" name="email1">
            이메일2 : <select name="email2">
              <option value="google.com">google.com</option>
              <option value="naver.com">naver.com</option>
              <option value="insta.com">insta.com</option>
            </select>
            <br>
          </div>
          <div>
           주소1: <input type = "text" name="addr1"> 
           <br>
           주소2: <input type = "text" name="addr2"> 
          </div>
          <div>
            <input type="submit" value="확인">
          </div>
        </form>
      </div>
    </section>
  	
  	
  	
  	</div>
  	
    <div id ="footer">
    	<%@ include file ="/incl/footer.jsp"%>
    </div>
  	</div>
      
  </body>
</html>