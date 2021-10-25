/**
 * 
 */

function idCheck(id){
	if(id == ""){
		alert("아디이를 입력해 주세요!!");
	}else{
		url = "IdCheck.jsp?mem_id="+id;
		window.open(url,"post","width=350, height=150");
	}
	
	
}