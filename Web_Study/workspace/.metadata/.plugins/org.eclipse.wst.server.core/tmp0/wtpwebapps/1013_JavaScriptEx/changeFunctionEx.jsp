<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ڹٽ�ũ��Ʈ jQuerry change() �Լ� ���θ��� ���� ����</title>
<!-- �߰� -->
<script src = "https://ajax.googleapis.com/ajax/libs/jquery3.2.0/jquery.min.js"></script>

<script>
	function hideOption(){
		$('#select2, #select3').hide();
        itemChange(); //�Լ� ȣ��
	}

    function itemChange(){
        $('select[name = option1]').change(function(){
            $('#select2').show();
        });

        $('select[name = option2]').change(function(){
            $('#select3').show();
        });
    }

</script>


</head>
<body onload = "hideOption();">
    <form name = "shoppingForm">
        <h1>�Ե� ��ȭ�� ����</h1>
        <b>���̼��� ��ǰ ���� �� �ɼ� ����</b>
        <br><br>
        <select id="select1" name="option1">
            <option selected>��ǰ�� ����</option>
            <option value="��Ŭ���� ����">��Ŭ���� ����</option>
            <option value="����NB����">����NB����</option>
            <option value="����ST���ϼ���">����ST���ϼ���</option>
            <option value="����ī�콺 ����">����ī�콺 ����</option>
            <option value="�缱 ��� ����">�缱 ��� ����</option>
            </select>
            <br><br>
            
            <select id="select2" name="option2">
            <option selected>���� ����</option>
            <option value="��">��</option>
            <option value="��">��</option>
            <option value="��">��</option>
            <option value="��">��</option>
            <option value="��">��</option>
            </select>
            <br><br>
            
            <select id="select3" name="option3">
            <option selected>������ ����</option>
            <option value="S">S|50,000��|10�� ����</option>
            <option value="M">M|60,000��|7�� ����</option>
            <option value="L">L|70,000��|5�� ����</option>
            
            </select>
    </form>

</body>
</html>