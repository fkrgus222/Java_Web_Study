/**
 * 
 */
function testing(){
	alert("button operated");
}


function juminCheck(jumin1, jumin2){
	var juminNUm = jumin1 + jumin2;
	
	var jumin_pattern = new RegExp('^[0-9]{6}[1234][0-9]{6}');
	
	if(jumin_pattern.test(juminNum)){
		alert('주민번호가 정규 표현식 패턴에 적합하지 않습니다.');
	}else{
		
		/*
		 * 주민번호 체크 공식 적용
		 * 
		 */
		
		var sum = 0;
		var temp = 0;
		var result = 0;
		var weight = new Array(2,3,4,5,6,7,8,9,2,3,4,5);
		//step 1
		for (i = 0 ; i < 12 ; i ++){
			sum = sum + (juminNum.charAt(i)) * weight[i];
		}
		//step 2
		temp = 11 - (sum%11);
		//step 3
		result = temp%10;
		
		if (result != juminNum.charAt(12)){
			alert('주민번호가 정확하지 않습니다, 다시 확인하세요!!');
		}else{
			alert('주민번호가 정상입니다.!!');
		}
		
		
		alert('주민번호가 정규 표현식 패턴에 적합합니다.');
	}
	
	
}