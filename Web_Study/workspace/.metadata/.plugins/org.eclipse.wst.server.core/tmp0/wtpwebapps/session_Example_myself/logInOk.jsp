<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	String id1 = "choi";
	String pwd1 = "0000";
	String session1 = "#2413&^232";
	
	
%>
    
    
    
    
<% 
	String userID = request.getParameter("ID");
	String password = request.getParameter("PWD");

	
	
	
	if (userID != null ){
		session.setAttribute(session1,userID);
		response.sendRedirect("welcome.jsp");
	}
	else{
		response.sendRedirect("fail.jsp");
	}


%>