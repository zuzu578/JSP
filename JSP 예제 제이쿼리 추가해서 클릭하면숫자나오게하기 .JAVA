<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World22</title>
</head>
<style>
td{
width:100px; 
height:40px;
text-align:center;
}

</style>
<body>
<table border=1>
<tr><td><td></td><td></td></td><td></td></tr>
<tr><td><td></td><td></td></td><td></td></tr>
<tr><td><td></td><td></td></td><td></td></tr>
<tr><td><td></td><td></td></td><td></td></tr>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script language="javascript">
var nClick = null;

$(document)
.ready(function(){
	alert('hello')
	
	
})
.on('click','td',function(){
 	$(this).text(nClick);
 	nClick++;
    
})




</script>
</html>