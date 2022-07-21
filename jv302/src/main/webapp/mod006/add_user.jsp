<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<title>Login</title>
    <style>
      ul,li,ol{
        list-style: none;
      }
      body{
        margin:0; padding:0;
      }    
      section{      	
      	margin: 0 auto;
      	width: 1000px;
      	height: 900px;      
      } 
      section > h3 {
      	text-align: center;
      	font-size: 32px;
      	line-height: 32px;
      	color: #b2e33e;
      	font-weight: bold;
      }
      section > div {
      	margin-top: 50px;
      	
      }
      section > div > form > div{
      	margin-top : 40px;
      	display: flex;
      	justify-content:center;
      }
    </style>
</head>
<body> 
  	<!-- <url-pattern>/mod005/login.do<url-pattern>  -->
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
  </body>
</html>