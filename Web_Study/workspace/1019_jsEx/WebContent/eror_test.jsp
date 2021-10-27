<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    
<!--  추가   -->
<%@ page errorPage = "error_page.jsp" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error_test.jsp 페이지</title>
</head>
<body>
	<div align = "center">
		<h2>erorr _test page</h2>
		<hr>
		<%= 10/0 %>
	</div>
</body>
</html>