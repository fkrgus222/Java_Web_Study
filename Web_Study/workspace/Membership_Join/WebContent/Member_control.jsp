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
			System.out.println("member ���̺��� ������ �Է� ����!");
		}else{
			System.out.println("member ���̺��� ������ �Է� ����!");
		}
	}
	
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Member_control.jsp ���� => MVC������ Controller ������ ������  </title>
</head>
<body>

</body>
</html>