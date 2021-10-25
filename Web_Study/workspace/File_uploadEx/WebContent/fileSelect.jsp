<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileSelect 페이지</title>

<script>
function fileCheckSize(input){
	if(input.files && input.files[0].size > (20*1024*1024)){
		alert("파일 사이즈가 20MB를 초과했습니다.");
		input.value = null;
	}
}



</script>

</head>
<body>
<!--  file upload 할땐 form 태그에 enctype이 추가되어야한다. -->
	<form name = "fileUpload" enctype = "multipart/form-data"
		  method = "POST" action = "viewPage.jsp">
		
		작성자<br>
		<input type = "text" name = "name"/><br>		
	
		제목<br>
		<input type = "text" name = "subject"/><br>
		
		<h4><font color = "red">*업로드 파일은 최대 20MB 까지 업로드 가능함!!</font></h4>
		
		업로드<br>
		<input type = "file" name = "uploadFile" onchange = "fileCheckSize(this)" />
		
		<input type = "submit" value = "파일 올리기"/>
		
		
	</form>


</body>
</html>