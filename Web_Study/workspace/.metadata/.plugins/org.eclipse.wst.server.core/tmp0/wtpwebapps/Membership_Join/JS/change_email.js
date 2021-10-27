/**
 * 
 */

function change_email() {
		var email_add = document.getElementById("email_add");
	   var email_sel = document.getElementById("email_sel");
	   
	   var idx = email_sel.options.selectedIndex;
	   var val = email_sel.options[idx].value;
	   
	   email_add.value = val;
	
}