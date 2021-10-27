<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "mybatis.dao.EmpDAO" %>

<%
	//넘어오는 파라미터 받기(empno, ename, position)
	request.setCharacterEncoding("UTF-8");

	String empno = request.getParameter("empno");
	String ename = request.getParameter("ename");
	String position = request.getParameter("position");
	
	System.out.println(empno+ename+position);
	int cnt = EmpDAO.add(empno, ename, position);
	
	//클라이언트에 응답
	response.sendRedirect("total.jsp");
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>