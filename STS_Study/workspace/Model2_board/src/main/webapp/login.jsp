<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>
	#div_box{
		position : absolute;
		top : 10%;
		left : 40$;
	}



</style>

</head>
<body>
	<div id = "div_box">
		<h1>로그인</h1>
		<form name = "loginForm" action = "login.do" >
			<table border = "1" cellpadding = "0" cellspacing = "0">
				<tr>
					<td bgcolor = "orange">아이디</td>
					<td><input type = "text" name = "id" /></td>
				</tr>
				
				<tr>
					<td bgcolor = "oragne">패스워드</td>
					<td><input type = "password" name = "password" /></td>
				</tr>
				
				<tr>
					<td><input type = "submit" value = "로그인" /></td>
				</tr>
				
			</table>
		
		</form>
	</div>

</body>
</html>