<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!--  추가   -->
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List 페이지</title>
</head>
<body>
	<h2>제품 목록 보기</h2>
	<hr>
	<form name = "myForm" method = "POST" action = "ProductSelect.jsp">
		<jsp:useBean id = "pro" scope = "page" class = "Product.Product" />
		<%--
		<select name = "sel">
		 
			<%
				for(String item : pro.getProductList()){
					out.println("<option>" + item + "</option>");
				}
			%>
		--%>
		
		<select>
		<c:forEach var = "item" items = "${pro.ProductList}">
			<option><c:out value = "${item}" /></option>
		</c:forEach>
		</select>
		
		
		
		</select>
		<input type = "submit" value = "선택">
	</form>
</body>
</html>