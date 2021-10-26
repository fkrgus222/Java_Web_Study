<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!--  �߰�  -->
<%@ page errorPage = "error.jsp" %>

<%@ page import = "com.company.Model2_Board.board.BoardDO" %>
<%@ page import = "com.company.Model2_Board.board.BoardDAO" %>

<%@ page import = "java.util.List" %>

<%
	List<BoardDO> boardList = (List)session.getAttribute("boardList");
%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 

 <%
 	int totalList = boardList.size();
 	request.setAttribute("totalList",totalList);
 %>

<!DOCTYPE html>

<html>
<head>
<meta charset="EUC-KR">
<title>error.jsp ������</title>

</head>

<body>
	
		<h3>&{IdKey}�� ȯ���մϴ�.&nbsp;&nbsp;&nbsp; <a href = "logout.do">�α׾ƿ�</a></h3>
		<form name = "myForm" method = "POST" action = "getBoardList.do">
			<p>�� �Խñ�: ${totalList}��</p>
			<table border = "1" cellpadding = "0" cellspacing = "0">
				<tr>
					<td align = "right">
						<select name = "searchCondition">
							<option value = "TITLE">����</option>
							<option value = "WRITER">�ۼ���</option>
						</select>
						<input type = "text" name = "searchKeyword" />
						<input type = "submit" value ="�˻�" />
					</td>
				</tr>
			</table>
			
			<table border = "1" cellpadding = "0" cellspacing = "0" width = "700">
				<tr>
					<th bgcolor = "orange" width = "100">��ȣ</th>
					<th bgcolor = "orange" width = "200">����</th>
					<th bgcolor = "orange" width = "150">�ۼ���</th>
					<th bgcolor = "orange" width = "150">�����</th>
					<th bgcolor = "orange" width = "100">��ȸ��</th>
				</tr>
			
			<c:forEach var = "board" items = "${boardList}">
				<tr>
					<td align = "center">${board.seq}</td>
					<td align = "left"><a href = "getBoard.do?seq=${board.seq}">${board.title}</td>
					<td align = "center">${board.writer}</td>
					<td align = "center">${board.regdate}</td>
					<td align = "center">${board.cnt}</td>
				</tr>
			</c:forEach>
			</table>
			
			<br> <br>
			
			<a href = "insertBoard.jsp">�� �Խñ� ���</a> &nbsp;&nbsp;&nbsp;
			<a href = "getBoardList.do">��ü�Խñ� ��� ����</a>
			
			
		</form>
	
</body>

</html>