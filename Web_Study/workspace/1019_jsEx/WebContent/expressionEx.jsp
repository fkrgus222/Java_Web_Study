<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!--  �߰�   -->
<!--  ���� �������� java.util�� �ִ� Ŭ�������� import�ؼ� ����ϰڴ�. -->
<%@ page import = "java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ǥ���� ���� ����</title>
</head>
<body>
	<%	//�ڹ� �ڵ� ��� 
		String[] str = {"�ڹ�","HTML","CSS","JavaScript","React","Node.js"};
		
		Random rnd = new Random();
		int i = rnd.nextInt(6);
	
	%>

	<%=str[i]%> ������ �����߽��ϴ�.


</body>
</html>