<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginform</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
.login-form{
	width:800px;
	margin:0 auto;
	margin-top:100px;
	
	display:flex;
	flex-direction:column;
	align-items:center;
	justify-contents:center;
}
.image-items{
	text-align:center;
	margin-top:300px;
	
}

.image-items img{
  	width:30%;
}
.button-items{
	margin-top:60px;
}
</style>
</head>
<body>
<header class="header-items">
<div class="image-items">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Naver_Logotype.svg/1280px-Naver_Logotype.svg.png">
</div>


</header>

<div class="login-form">
<div class="input-group mb-3">
  <input type="text" id="id" name="id" class="form-control" placeholder="아이디를 입력해주세요." aria-label="Recipient's username" aria-describedby="basic-addon2">
  <input type="text" id="hidden_id" name="hidden_id"  >
  <div class="input-group-append">
    <span class="input-group-text" id="basic-addon2">아이디</span>
  
  </div>
</div>

<div class="input-group mb-3">
  <input type="password" id="password" name="password" class="form-control" placeholder="비밀번호를 입력해주세요." aria-label="Recipient's username" aria-describedby="basic-addon2">
  <input type="text" id="hidden_pwd" name="hidden_pwd">
  <div class="input-group-append">
    <span class="input-group-text" id="basic-addon2">비밀번호</span>
  </div>
</div>



<div class="button-items">
<button type="button" id="login" name="login"class="btn btn-success">로그인</button>
<button type="button" id="signin" name="signin"class="btn btn-success">회원가입</button>
</div>

</div>

</body>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script language="javascript">

$(document).ready(function() {
	
	$.get('loginform',{},function(txt){
			ar = txt.split(',');
			for(i=0;i<ar.length;i++){
			id = ar[i];
			$('#hidden_id').val(id);
		}
	},'text');
	$.get('password',{},function(txt){
		
		ar = txt.split(',');
		for(i=0;i<ar.length;i++){
		
			password = ar[i];
			
		$('#hidden_pwd').val(password);
	}
	
	},'text');
	console.log($('#hidden_id').val())
	console.log($('#hidden_pwd').val())
		return false;
	});
$(document)
.on('click','#login',function(){
	//경우의수//
	//1)아이디를 공란으로 했을때//
	if($('#id').val()==""){
		alert("아이디를 공란으로 해두면안됩니다.")
		return false
		//2)비밀번호를 공란으로 했을때//
	}else if($('#password').val()=="")
		alert("비밀번호를 공란으로 해두면안됩니다.")
		
		//3)아이디와 비밀번호가 모두 일치하는 경우//
		if($('#password').val()==$('#hidden_pwd').val() && $('#id').val()==$('#hidden_id').val()){
			alert("로그인성공")
			//메인페이지로 보낸다//
			page_href();
		}else{
			//아닐경우 실패//
			alert("로그인실패")
		}
		//4)아이디가 일치하지않고 비밀번호만 일치할 경우//
		if($('#id').val()!=$('#hidden_id').val()){
			alert("아이디가 일치하지않습니다.")
			//5)아이디가 맞고 비밀번호가 일치하지않는경우//
		} if($('#password').val()!=$('#hidden_pwd').val()){
			alert("비밀번호가 일치하지않습니다.")
		}
		//로그인 성공/실패시 공백으로 해준다//	
		$('#id').val('');
		$('#password').val('');
		//로그인 성공을했을때  성공한 부분에만  호이스팅을 해주어서 페이지로 이동하는 함수를 호출한다.//
		function page_href() {
			location.href = "https://www.naver.com/";

			}

})





</script>
</html>