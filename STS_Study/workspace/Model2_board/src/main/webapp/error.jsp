<%@ page language="java" contentType="text/html; charset=EUC-KR"

    pageEncoding="EUC-KR"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="EUC-KR">

<title>error.jsp ������</title>

</head>

 

<!-- �߰� -->

<jsp:useBean id="now" class="java.util.Date" />

<body>

	<div>

		<h2>error_page.jsp ������</h2>

		<hr>

		<table>

			<tr width=100% bgcolor="orange">

				<td>

					�����ڿ��� ������ �ּ���.<br>

					���� ���ϳ��� �ذ��ϰڽ��ϴ�.

				</td>				

			</tr>

			<tr>

				<td>

					${now}<p>

					��û���� URI : ${pageContext.errorData.requestURI}<br>

					�����ڵ� : ${pageContext.errorData.statusCode}<br>

					�������� : ${pageContext.errorData.throwable}

				</td>

			</tr>

		</table>

	</div>

</body>

</html>