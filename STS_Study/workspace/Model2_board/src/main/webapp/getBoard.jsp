<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!--  �߰�  -->
<%@ page errorPage = "error.jsp" %>
<%@ page import = "com.company.Model2_Board.board.BoardDO" %>

<%
	BoardDO board = (BoardDO)session.getAttribute("board");
	
	
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>getBoard.jsp</title>
</head>
<body>
	<center>
		<h1>�Խñ� �� ����</h1>
		<a href = "logout.do">�α׾ƿ�</a>
		<hr>
		<form name = "getBoardForm" method = "POST" action = "updateBoard.do">
			<input type = "hidden" name = "seq" value = "${board.seq}" />		
			<table border = "1" cellpadding = "0" cellspacing = "0" >
			
			
				<tr>
					<td bgcolor= "orange" width = "70">����</td>
					<td align = "left">
						<input type = "text" name = "title" value = "${board.title}" />
					</td>
				</tr>
				
				<tr>
					<td bgcolor= "orange">�ۼ��ڤ�</td>
					<td align = "left">
						<input type = "text" name = "title" value = "${board.writer}" />
					</td>
				</tr>
				
				<tr>
					<td bgcolor= "orange">����</td>
					<td align = "left">
						<input type = "text" name = "title" value = "${board.content}" />
					</td>
				</tr>
				
				<tr>
					<td bgcolor= "orange">�����</td>
					<td align = "left">
						<input type = "text" name = "title" value = "${board.regdate}" />
					</td>
				</tr>
				
				<tr>
					<td bgcolor= "orange">��ȸ��</td>
					<td align = "left">
						<input type = "text" name = "title" value = "${board.cnt}" />
					</td>
				</tr>
				
				<tr>
					<td bgcolor= "orange">�����</td>
					<td align = "left">
						<input type = "text" name = "title" value = "${board.regdate}" />
					</td>
				</tr>
				
				<tr>
					<td conspan = "2" align = "center">
						<input type = "submit" value = "�� ����" />
					</td>
				</tr>
				
			</table>
		</form>
		<hr>
		<a href = "insertboard.jsp">�� �Խñ� ���</a>
		<a href = "deleteBoard.do?seq=${board.seq}">�Խñ� ����</a>&nbsp;&nbsp;&nbsp;
		<a href = "getBoardList.do">��ü �Խñ� ��� ����</a>
		
	</center>



</body>
</html>