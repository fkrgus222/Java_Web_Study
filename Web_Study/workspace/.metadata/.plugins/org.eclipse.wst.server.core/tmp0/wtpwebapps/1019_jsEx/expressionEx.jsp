<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!--  추가   -->
<!--  현재 페이지에 java.util에 있는 클래스들을 import해서 사용하겠다. -->
<%@ page import = "java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>표현식 응용 예제</title>
</head>
<body>
	<%	//자바 코드 기술 
		String[] str = {"자바","HTML","CSS","JavaScript","React","Node.js"};
		
		Random rnd = new Random();
		int i = rnd.nextInt(6);
	
	%>

	<%=str[i]%> 과목을 선택했습니다.


</body>
</html>