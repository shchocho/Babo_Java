<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="update_user.do" method= "post">
		<div>
			회원 아이디 : <input type="text" name="userId" value = "${user.userId}">
		</div>
		<div>
			비밀 번호: <input type="password" name="passwd" value = "${user.passwd}"> <br>
		</div>
		<div>
			이름 : <input type="text" name="userName" value = "${user.userName}"> <br>
		</div>
		<div>
			주민번호: <input type="text" name="ssn" value = "${user.ssn}"> <br>
		</div>
		<div>
			이메일1 : <input type="text" name="email1" value = "${user.email}"> 이메일2 : <select
				name="email2">
				<option value="google.com">google.com</option>
				<option value="naver.com">naver.com</option>
				<option value="insta.com">insta.com</option>
			</select> <br>
		</div>
		<div>
			주소1: <input type="text" name="addr1"  value = "${user.addr}"> <br> 주소2: <input
				type="text" name="addr2" value = "${user.addr}">
		</div>
		<div>
			<input type="submit" value="확인">
		</div>
	</form>

</body>
</html>