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
<input type="button" id = "btnGet" value="가져오기">

</body>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
$(document)
.on('click','#btnGet',function(){
	$.get('selectServlet',{},function(txt){//txt="john, smith ,...,jane"//
		alert("값을 넣습니다.");
		ar = txt.split(',');
		for(i=0;i<ar.length;i++){
			//<tr><td>John</td></tr>이런식으로 넣게된다.//
			name = '<tr><td>ar'+ar[i]+'</td></tr>';
			$('#tblData').append(name);
		}
		
	},'text');
	return false;
});
</script>
</html>