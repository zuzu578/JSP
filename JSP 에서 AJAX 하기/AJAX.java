<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
//AJAX
$(document)
.on('click','#btnLogin',function(){
	$.ajax({
	  url:'MethodServlet',//호출될 서블릿의 경로(이름)
	  method:'post',//데이터 전송방식 get/post
	  data:'userid='+$('input[name=userid]').val()+'&passwd='+$('input[name=passwd]').val(),//querystring=data;
	  dataType:'text',//반환받을 데이터 타입 
	  beforeSend:function(){},
	  success:function(txt){//호출 성공해서 완료하면 
		alert(txt);
	},
	complete:function(){
	} //호출을 성공하든 실패하든 마지막에 할일 
	
    })
  })

</script>