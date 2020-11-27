<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>네이버 로그인</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
.login-form{
	margin:0 auto;
	width:470px;
}
.naver-items{
	text-align:center;
	margin-top:100px;
	margin-bottom:60px;
	
	
	
}
.naver-items img{
	width:50%;
}
.login-buttons{
	text-align:center;
	line-height:54px;
	
	color:white;
	
}
.button-items{
	height:54px;
	background-color:#03c75a;
	cursor:pointer;
	
	
}


</style>
</head>
<body>

<div class="login-form">
<div class="naver-items">
<img src="https://ssl.pstatic.net/static/nid/login/m_logo_naver.png">

</div>
<div class="input-items">
<div class="input-group mb-3">
  <div class="input-group-prepend">
  </div>
  <input type="text" id="id" name="id" class="form-control" placeholder="아이디" aria-label="Username" aria-describedby="basic-addon1">
</div>


<div class="input-group mb-3">
  <div class="input-group-prepend">
    
  </div>
  <input type="password" id="password" name="password" class="form-control" placeholder="비밀번호" aria-label="Username" aria-describedby="basic-addon1">
</div>

</div>
<div class="button-items">
<div class="login-buttons">
로그인


</div>


</div>



</div>

</body>

<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script language="javascript">
$(document)
.on("click",".login-buttons",function(){
	if($('#id').val()==""){
		alert("아이디란은 공백으로 둘수없습니다.")
		return false
	}
	if($('#password').val()==""){
		alert("비밀먼호란은 공백으로 둘수없습니다.")
		return false
	}
	
	$.ajax({

		  url:'naverlogin',//호출될 서블릿의 경로(이름)
		  method:'get',//데이터 전송방식 get/post
		  //전송할 데이터(쿼리스트링)//
		  data:'id='+$('input[name=id]').val()+'&password='+$('input[name=password]').val(),
		  dataType:'text',//반환받을 데이터 타입 
		  beforeSend:function(){},
		  success:function(txt){//호출 성공해서 완료하면 
			  if(txt=="0"){
				  alert("존재하지않는 계정입니다.")
				  return false
			  }else{
				  alert("로그인되었습니다.")
				  return false
				 
			  }
		  	
			
		},
		complete:function(){
			
		} 
		
	  })
	
})








</script>

</html>