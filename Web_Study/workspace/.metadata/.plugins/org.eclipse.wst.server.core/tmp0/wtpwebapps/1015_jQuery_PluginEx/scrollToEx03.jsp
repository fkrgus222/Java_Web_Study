<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!--  추가  -->
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--  prefix는 코어 라이브러리  -->
<!--  코어와 국제화 
	코어라이브러리의 OUT이라는 태크,
	국제화의 formatNumber사용
 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>윈도우 스크롤의 절대 위치로 이동하기</title>
</head>
<body>
	<h3>오픈마켓</h3>
	<h2>과일 상품 목록 리스트</h2>
	<div id = "apple">
		<div>
			<img src = "./images/appleimage.jpg"/>
		</div>
		
		<div>
			<b><c:out value = "청송 꿀사과"/></b>
		</div>
		
		<div>
			<b><fmt:formatNumber value = "12000" pattern = "#,###원"/></b>
		</div>
		
		<div>
			<small><c:out value = "고당도 아삭한 사과" /></small>
		</div>
	</div>
	
	<div id = "grape">
		<div>
			<img src = "./images/grapeimage.jpg"/>
		</div>
		
		<div>
			<b><c:out value = "홍성 샤인 머스켓 포도"/></b>
		</div>
		
		<div>
			<b><fmt:formatNumber value = "20000" pattern = "#,###원"/></b>
		</div>
		
		<div>
			<small><c:out value = "달달하고 맛있는 샤인머스켓 포도" /></small>
		</div>
	</div>
	
	<div id = "strawberry">
		<div>
			<img src = "./images/strawberryimage.jpg"/>
		</div>
		
		<div>
			<b><c:out value = "강진 딸기"/></b>
		</div>
		
		<div>
			<b><fmt:formatNumber value = "15000" pattern = "#,###원"/></b>
		</div>
		
		<div>
			<small><c:out value = "달콤한 딸기 해외에서도 유명" /></small>
		</div>
	</div>
	
	<div id = "watermelon">
		<div>
			<img src = "./images/watermelon.jpg"/>
		</div>
		
		<div>
			<b><c:out value = "황안 수박"/></b>
		</div>
		
		<div>
			<b><fmt:formatNumber value = "25000" pattern = "#,###원"/></b>
		</div>
		
		<div>
			<small><c:out value = "달달하고 시원한 유명 수박" /></small>
		</div>
	</div>
	<br><br>
	<input id ="scroll-to-top" type = "image" src = "./images/top_image.png"
			onclick = "javascript:window.scrollTo(0,0)/">
	
	
	
</body>
</html>