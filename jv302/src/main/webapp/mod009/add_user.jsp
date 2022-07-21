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
  			
  				<jsp:param value="mod009:Java Beans and include" name="subtitle"/>
  			</jsp:include>
  		</div>
  	<div id="content-wrapper">
  	 <section>
      <h3>회원가입</h3>
      <div>
        <form action="add_user1.do" method="post">
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
      
      
      <form action="find_user.do" method="get">
     	 <input type="submit" value="유저전문">
      </form>
      
      <form action="find_user_id.do" method="get">
      	<input type="text" name="userId">
      	<input type="submit" value="확인">
      </form>
      
      
    </section>
  	
  	
  	
  	</div>
  	
    <div id ="footer">
    	<%@ include file ="/incl/footer.jsp"%>
    </div>
  	</div>
      
  </body>
</html>