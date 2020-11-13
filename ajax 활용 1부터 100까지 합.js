<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="text" id="txtnum" name="txt1" size="10"><br><!-- 숫자입력 -->
<input type="text" id="txtresult" value="" size="10"><br><br><!-- 결과표시 -->
<input type="button" id="btnRun" value="결과보기">


</body>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
$(document)
.on('click','#btnRun',function(){
	  $.get("web06",
	    		{txtnum:$('input[name=txt1]').val()},
	    		
	    		function(txt){
	    	 	  alert(txt)
	    	 	 $('#txtresult').val(txt);
	    	 	 
	    		  },
	    		  
	    	'text')
	    	.fail(function (jqXHR, textStatus, errorThrown) { 
	    		if($.isNumeric( $('#txtnum').val())){
	    			
	    			
	    		}
	    	serrorFunction(); });
 })

 
		 	 
 




</script>
</html>