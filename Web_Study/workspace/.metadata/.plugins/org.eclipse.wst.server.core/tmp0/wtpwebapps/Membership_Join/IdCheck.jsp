<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<% request.setCharacterEncoding("EUC-KR"); %>

<jsp:userBean id = "mem" scope = "page" class = "member.DBBean" />
    
<%
	String mem_id = request.getParameter("mem_id");
	int idCheck = mem.confirmId(mem_id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>IdCheck.jsp 파일</title>
</head>
<body>
	<table border = "0" align = "center">
		<tr>
			<td align = "center">
			<%
				if(idCheck == 1){}  //ID가 중복된 경우	
			%>
			<input type = "button" value/>
			<br>
			<%=_mem_id %> 는 이미 존재하는 ID입니다.%>&nbsp;<br><br>
			
			
			</td>
		</tr>
	</table>

</body>
</html>