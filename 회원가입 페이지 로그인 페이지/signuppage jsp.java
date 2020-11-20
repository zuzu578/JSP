<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
.title{
	text-align:center;
	font-size:100px;
	font-weight:bold;
	margin-top:100px;
	
}

.signup-forms{
 width: 500px;
 margin:0 auto;
 margin-top:100px;
 

}



</style>
</head>
<body>
<p class="title">회원가입</p>
<div class="signup-forms">
<div class="items">
<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">아이디</span>
  </div>
  <input type="text" id="id" name="id" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
  <button type="button" id="check_id"name="check_id" class="btn btn-primary">중복검사</button>
</div>


<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">비밀번호</span>
  </div>
  <input type="password" id="password" name="password" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">


</div>


<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">전화번호</span>
  </div>
  <input type="text" id="mobile" name="mobile" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">이름</span>
  </div>
  <input type="text" id="name" name="name" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">이메일주소</span>
  </div>
  <input type="text" id="email" name="email" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
</div>

  <input type="text" id="check_hidden1" name="check_hidden1">
 



</div>
<button type="button" id="insert" name="insert" class="btn btn-success">등록</button>
<button type="button" id="clear" name="clear" class="btn btn-danger">비우기</button>


</div>

</body>
</html>

<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script language="javascript">

$( document ).ready(function() {
	$.get('loginform',{},function(txt){//txt="john, smith ,...,jane"//
		
		ar = txt.split(',');
		for(i=0;i<ar.length;i++){
			//<tr><td>John</td></tr>이런식으로 넣게된다.//
			check1 = ar[i];
			$('#check_hidden1').val(check1);
			console.log(check1)
		}
		
	},'text');
	
	return false;
    
});

$(document)
.on('click','#check_id',function(){
	if($('#id').val()==""){
		alert("입력필드를 공란으로 둘수 없습니다.");
		return false;
	}
	if($('#id').val()==$('#check_hidden1').val()){
		alert("아이디가 중복됩니다.")
		return false;
	}else{
		alert("사용가능한 아이디입니다.")
	}
	return false;
})





$(document)
.on('click','#insert',function(){
	//===>insert<===//
	if($('#id').val()==""){
		alert("아이디란을 공백으로 입력할수없습니다.")
		return false;
	}if($('#password').val()==""){
		alert("비밀번호란을 공백으로 입력할수없습니다.")
		return false;
	}if($("#mobile").val()==""){
		alert("모바일번호란을 공백으로 입력할수없습니다.")
		return false;
	}if($('#name').val()==""){
		alert("이름란을 공백으로 입력할수없습니다.")
		return false;
	}if($('email').val()==""){
		alert("이메일 란을 공백으로 입력할수없습니다.")
		return false;
	}if($('#id').val()==$('#check_hidden1').val()){
		alert("아이디가 중복됩니다.")
		return false
	}
	if($.isNumeric($('#name').val())==true){
		alert("이름란에는 숫자가 들어갈수없습니다.")
		return false;
	}
	if($.isNumeric($('#mobile').val())==false){
		alert("모바일번호란에는 숫자만 들어갈수 있습니다.")
		return false;
	}
	

	$.ajax({
		  url:'Signup',//호출될 서블릿의 경로(이름)
		  method:'get',//데이터 전송방식 get/post
		  //전송할 데이터(쿼리스트링)//
		  data:'id='+$('input[name=id]').val()+'&password='+$('input[name=password]').val()+'&mobile='+$('input[name=mobile]').val()+'&name='+$('input[name=name]').val()+'&email='+$('input[name=email]').val(),
		  dataType:'text',//반환받을 데이터 타입 
		  beforeSend:function(){},
		  success:function(txt){//호출 성공해서 완료하면 
			alert("입력완료되었습니다.");
		},
		complete:function(){
			
		} 
		
	    })
	    alert("회원가입 완료! 로그인 페이지로 이동합니다.");
		myFnc();
		function myFnc(){
			location.href = "loginform.jsp";

		}
	
})
	    

$(document)
.on('click','#clear',function(){
	$('#id').val("");
	$('#password').val("");
	$('#mobile').val("");
	$('#name').val("");
	$('#email').val("");
	
	
})




</script>