<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<% request.setCharacterEncoding("EUC-KR"); %>

<jsp:userBean id = "mem" scope = "page" class = "member.DBBean" />
<jsp:setProperty name = "mem" property = "*" />

<%
	String action = request.getParameter("ACTION");
	if(action.equals("insert")){
		if(mem.insertDB()){
			response.sendRedirect("Welcome.jsp");
			System.out.println("member 테이블에 데이터 입력 성공!");
		}else{
			System.out.println("member 테이블에 데이터 입력 실패!");
		}
	}
	
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Member_control.jsp 파일 => MVC패턴의 Controller 역할의 페이지  </title>
</head>
<body>

</body>
</html>