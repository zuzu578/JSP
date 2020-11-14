<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB Connection</title>
</head>
<body>
<table id=tblData>


</table><br><br>
<input type="button" id ="btnInsert1" value="update">
<input type="text" id="oldName"name="oldName">예전이름<br>
<input type="text" id="updateName"name="updateName">수정할 이름<br> 
<input type="text" id="updatePhone"name="updatePhone">수정할 모바일번호 




</body>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
$(document)
.on('click','#btnInsert1',function(){
	$.ajax({
		  url:'selectServlet',//호출될 서블릿의 경로(이름)
		  method:'get',//데이터 전송방식 get/post
		  data:'oldName='+$('input[name=oldName]').val()+'&updateName='+$('input[name=updateName]').val()+'&updatePhone='+$('input[name=updatePhone]').val(),
		  dataType:'text',//반환받을 데이터 타입 
		  beforeSend:function(){},
		  success:function(txt){//호출 성공해서 완료하면 
			alert("입력완료되었습니다.");
		},
		complete:function(){
			alert("hi");
		} 
		
	    })
	  })


</script>
</html>