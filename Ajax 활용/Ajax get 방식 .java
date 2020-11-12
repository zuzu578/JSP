<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><td align=right>아이디</td><td><input type="text" name="userid"></td>
<tr><td align=right>비밀번호</td><td><input type="text" name="passwd"></td>
</td>
</table>
<input type="button" id="btnLogin" value="Login">


</body>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
$(document)
.on('click','#btnLogin',function(){
	$.ajax({
		url:'s1',
		method:'get',
		data:'userid='+$('input[name=userid]').val()+'&passwd='+$('input[name=passwd]').val(),
		dataType:'text',
		beforeSend:function(){},
		success:function(txt){
			alert(txt);
		},
		complete:function(){
			alert("have a nice day");
		}
	})
})




</script>
</html>