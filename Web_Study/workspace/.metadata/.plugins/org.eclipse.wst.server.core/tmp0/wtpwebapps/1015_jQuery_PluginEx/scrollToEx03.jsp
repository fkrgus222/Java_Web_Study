<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!--  �߰�  -->
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--  prefix�� �ھ� ���̺귯��  -->
<!--  �ھ�� ����ȭ 
	�ھ���̺귯���� OUT�̶�� ��ũ,
	����ȭ�� formatNumber���
 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>������ ��ũ���� ���� ��ġ�� �̵��ϱ�</title>
</head>
<body>
	<h3>���¸���</h3>
	<h2>���� ��ǰ ��� ����Ʈ</h2>
	<div id = "apple">
		<div>
			<img src = "./images/appleimage.jpg"/>
		</div>
		
		<div>
			<b><c:out value = "û�� �ܻ��"/></b>
		</div>
		
		<div>
			<b><fmt:formatNumber value = "12000" pattern = "#,###��"/></b>
		</div>
		
		<div>
			<small><c:out value = "���絵 �ƻ��� ���" /></small>
		</div>
	</div>
	
	<div id = "grape">
		<div>
			<img src = "./images/grapeimage.jpg"/>
		</div>
		
		<div>
			<b><c:out value = "ȫ�� ���� �ӽ��� ����"/></b>
		</div>
		
		<div>
			<b><fmt:formatNumber value = "20000" pattern = "#,###��"/></b>
		</div>
		
		<div>
			<small><c:out value = "�޴��ϰ� ���ִ� ���θӽ��� ����" /></small>
		</div>
	</div>
	
	<div id = "strawberry">
		<div>
			<img src = "./images/strawberryimage.jpg"/>
		</div>
		
		<div>
			<b><c:out value = "���� ����"/></b>
		</div>
		
		<div>
			<b><fmt:formatNumber value = "15000" pattern = "#,###��"/></b>
		</div>
		
		<div>
			<small><c:out value = "������ ���� �ؿܿ����� ����" /></small>
		</div>
	</div>
	
	<div id = "watermelon">
		<div>
			<img src = "./images/watermelon.jpg"/>
		</div>
		
		<div>
			<b><c:out value = "Ȳ�� ����"/></b>
		</div>
		
		<div>
			<b><fmt:formatNumber value = "25000" pattern = "#,###��"/></b>
		</div>
		
		<div>
			<small><c:out value = "�޴��ϰ� �ÿ��� ���� ����" /></small>
		</div>
	</div>
	<br><br>
	<input id ="scroll-to-top" type = "image" src = "./images/top_image.png"
			onclick = "javascript:window.scrollTo(0,0)/">
	
	
	
</body>
</html>