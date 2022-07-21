<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
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
  				<jsp:param value="mod007:Java Beans and include" name="subtitle"/>
  			</jsp:include>
  		</div>
  	<div id="content-wrapper"></div>
  		
  		<h3>다음과 같은 에러가 발생했습니다</h3>
  		<ul>
  			<%
  				@SuppressWarnings("unchecked")
  				List<String> errorMsgs = (List<String>)request.getAttribute("errorMsgs");
  				for(String errorMsg : errorMsgs){ %>
  					<li><%=errorMsg%></li>
  			<%
  				}
  			%>
  			
  		</ul>
    <div id ="footer">
    	<%@ include file ="/incl/footer.jsp"%>
    </div>
  	</div>



	

</body>
</html>