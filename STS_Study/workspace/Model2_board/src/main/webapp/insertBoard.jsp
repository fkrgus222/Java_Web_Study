<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

   
<!--  �߰�  -->
<%@ page errorPage = "error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>insertBoard.jsp</title>
</head>
<body>
	<center>
	<h1>�� �Խñ� ��� </h1>
	<a href = "logout.do">�α׾ƿ�</a>
	<hr>
	<form name = "insertForm" method = "POST" action = "insertBoard.do">
		<table border = "1" cellpadding = "0" cellspacing = "0">
			<tr>
				<td bgcolor= "orange" width = "70">����</td>
				<td align = "left"><input type = "text" name = "title" />
			</tr>
			
			<tr>
				<td bgcolor= "orange">�ۼ���</td>
				<td align = "left"><input type = "text" name = "writer" />
			</tr>
			
			<tr>
				<td bgcolor= "orange">����</td>
				<td align = "left"><input type = "text" name = "content" />
			</tr>
			
			<tr>
				<td colspan = "2" align = "center">
					<input type = "submit" value = "�� ���"/>
			
			</tr>
		</table>
	</form>
	<hr>
	<a href = "getBoardList.do">��ü �Խñ� ��� ����</a>
	</center>
</body>
</html>