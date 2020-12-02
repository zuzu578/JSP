<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<style>
.admin-form{
	margin:0 auto;
	margin-top:50px;
	width:600px;
	

}
.h1-items{
	font-size:40px;
	text-align:center;
	font-weight:bold;
	
}
.t-1{

	
	
}
.input-items{
	padding-top:50px;
	
	width:700px;
	margin:0 auto;
	
}
.button-items{
	text-align:center;
	margin-top:50px;
	
}
.table-items{
	text-align:center;
	
}
</style>
<body>
<div class="admin-form">
<p class="h1-items">Admin page</p>
<div class="table-items">
<table class="t-1" border="1">
<tr><td>ID</td> <td>PWD</td> <td>Gender</td> <td>Mobile </td> <td>Email </td> <td>Name</td>  </tr>
</table>
</div>
<div class="input-items">
<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">아이디</span>
  </div>
  <input type="text" class="form-control" id="id" name="id"placeholder="id" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">비밀번호</span>
  </div>
  <input type="password" id="password" name="password" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">성별</span>
  </div>
  <input type="text" id="gender" name="gender"class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">모바일</span>
  </div>
  <input type="tel" id="mobile" name="mobile" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">이메일</span>
  </div>
  <input type="email" id="email" name="email" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">이름</span>
  </div>
  <input type="text" id="name" name="name" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
</div>
<div class="button-items">
<button type="button" id="create" name="create" class="btn btn-info">등록</button>
<button type="button" id="update" name="update" class="btn btn-info">수정</button>
<button type="button" id="delete" name="delete"class="btn btn-info">삭제</button>
<button type="button" id="reset" name="reset" class="btn btn-info">비우기</button>
</div>
</div>
</div>
</body>
</html>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script language="javascript">
var nClick=null;
$(document).ready(function() {
	$.get('AdminselectAll2',{},function(data){
		//json방식//
		console.log('btnGet2')
		console.log(data);
		$.each(data,function(ndx,value){
			//서블릿에서 써준대로 값을 써준다.//
			name='<tr><td>'+value['ID']+'</td><td>'+value['PWD']+'</td><td>'+value['Gender']+'</td><td>'+value['Mobile']+'</td><td>'+value['Email']+'</td><td>'+value['Name']+'</td></tr>';
			$('table:eq(0)').append(name);
			console.log('btnGet3')
		})
		
		
		
	},'json');//===>2개이상 타입 은 json 이라한다.//text는 하나//
	return false;
});
$(document)
.on('click','table:eq(0) tr',function(){
	id=$(this).find('td:eq(0)').text();
	
	 $('#id').val(id)
	
	
})

$(document)
.on('click','table:eq(0) tr',function(){
	password=$(this).find('td:eq(1)').text();
	 
	 $('#password').val(password)
	
	
})

$(document)
.on('click','table:eq(0) tr',function(){
	gender=$(this).find('td:eq(2)').text();
	 console.log(name)
	 $('#gender').val(gender)
	
	
})

$(document)
.on('click','table:eq(0) tr',function(){
	 mobile=$(this).find('td:eq(3)').text();
	 console.log(name)
	 $('#mobile').val(mobile)
	
	
})

$(document)
.on('click','table:eq(0) tr',function(){
	email=$(this).find('td:eq(4)').text();
	 console.log(name)
	 $('#email').val(email)
	
	
})
$(document)
.on('click','table:eq(0) tr',function(){
	name=$(this).find('td:eq(5)').text();
	 console.log(name)
	 $('#name').val(name)
	
	
})


$(document)
.on("click","#create",function(){
	
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
	}if($('#email').val()==""){
		alert("이메일 란을 공백으로 입력할수없습니다.")
		return false;
	}if($('#gender').val()==""){
		alert("성별란을 공백으로 입력할수없습니다.")
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
	 var c1 = confirm("회원정보를 등록하시겠습니까?")
	
	if (c1==true){
	$.ajax({
		  url:'adminAllselect',//호출될 서블릿의 경로(이름)
		  method:'get',//데이터 전송방식 get/post
		  //전송할 데이터(쿼리스트링)//
		  data:'id='+$('input[name=id]').val(),
		  dataType:'text',//반환받을 데이터 타입 
		  beforeSend:function(){},
		  success:function(txt){//호출 성공해서 완료하면 
			  if(txt=="0"){
				  alert("사용가능한 아이디입니다.")
				  
			  }else{
				  alert("중복되는 아이디가 있습니다.")
				  return false;
			  }
		  	
			
		},
		complete:function(){
			
		} 
		
	  })
	}else{
		alert("취소합니다.")
		return false;
	}
	
	$.ajax({
		  url:'admininsert',//호출될 서블릿의 경로(이름)
		  method:'get',//데이터 전송방식 get/post
		  //전송할 데이터(쿼리스트링)//
		  data:'id='+$('input[name=id]').val()+'&password='+$('input[name=password]').val()+'&gender='+$('input[name=gender]').val()+'&mobile='+$('input[name=mobile]').val()+'&email='+$('input[name=email]').val()+'&name='+$('input[name=name]').val(),
		  dataType:'text',//반환받을 데이터 타입 
		  beforeSend:function(){},
		  success:function(txt){//호출 성공해서 완료하면 
			alert("입력완료되었습니다.");
		},
		complete:function(){
			
		} 
		
	    })
	    window.location.reload(true); 
	    
	    
	    
		
	
})
$(document)
 .on('click','#delete',function(){
	if($('#id').val()==""){
		alert("아이디란을 공백으로 입력할수없습니다.")
		return false;
	}
	 var v8 = confirm("정말 이 회원정보를 지우시겠습니까?")
	 if(v8==true){
 	$.ajax({
 		  url:'Admindelete',//호출될 서블릿의 경로(이름)
 		  method:'get',//데이터 전송방식 get/post
 		  data:'id='+$('input[name=id]').val(),
 		  dataType:'text',//반환받을 데이터 타입 
 		  beforeSend:function(){},
 		  success:function(txt){//호출 성공해서 완료하면 
 			
 		},
 		complete:function(){
 			
 		} 
 	    })
 		alert("삭제되었습니다.")
 		window.location.reload(true);
	 	}else{
		 	alert("취소합니다.")
	 	}
 })
 $(document)
 .on("click","#update",function(){
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
		}if($('#email').val()==""){
			alert("이메일 란을 공백으로 입력할수없습니다.")
			return false;
		}if($('#gender').val()==""){
			alert("성별란을 공백으로 입력할수없습니다.")
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
		var v9 = confirm("유저정보를 수정하시겠습니까?")
		if(v9==true){
	 $.ajax({
		  url:'AdminUpdate2',//호출될 서블릿의 경로(이름)
		  method:'get',//데이터 전송방식 get/post
		  data:'id='+$('input[name=id]').val()+'&password='+$('input[name=password]').val()+'&gender='+$('input[name=gender]').val()+'&mobile='+$('input[name=mobile]').val()+'&email='+$('input[name=email]').val()+'&name='+$('input[name=name]').val(),
		  dataType:'text',//반환받을 데이터 타입 
		  beforeSend:function(){},
		  success:function(txt){//호출 성공해서 완료하면 
			
		},
		complete:function(){
		
		} 
	    })
		alert("수정되었습니다.")
		window.location.reload(true);
	}else{
		alert("유저 정보 수정을 취소합니다.")
	}
	 
 })
 $(document)
.on("click","#reset",function(){
	$("#id").val("");
	$("#password").val("");
	$("#gender").val("");
	$("#mobile").val("");
	$("#name").val("");
	$("#email").val("");
}) 	  






</script>