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
<div class="title">
<h1>Insert</h1>
</div>
<input type="button" id ="btnInsert1" value="추가"><br>
<input type="text" id="insert"name="insert">이름<br>
<input type="text" id="insert1"name="insert1">모바일번호<br>

<div class="delete">
<h1>Delete</h1>
<input type="button" id ="btnDelete1" value="삭제"><br>
<input type="text" id="delete"name="delete">이름<br>
</div>

<div class="Update">
<h1>Update</h1>
<input type="button" id ="btnUpadte1" value="수정"><br>
<input type="text" id="oldName"name="oldName">예전이름<br>
<input type="text" id="updateName"name="updateName">수정할 이름<br> 
<input type="text" id="updatePhone"name="updatePhone">수정할 모바일번호 <br>
</div>

<div class="Select">
<h1>Select</h1>
<input type="button" id = "btnGet" value="가져오기/검색">
</div>



</body>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
$(document)
.on('click','#btnInsert1',function(){
	//===>insert<===//
	$.ajax({
		  url:'insertServlet',//호출될 서블릿의 경로(이름)
		  method:'get',//데이터 전송방식 get/post
		  //전송할 데이터(쿼리스트링)//
		  data:'insert='+$('input[name=insert]').val()+'&insert1='+$('input[name=insert1]').val(),
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
	  
	  	//===>select<===//
 $(document)
.on('click','#btnGet',function(){
	$.get('selectServlet',{},function(txt){//txt="john, smith ,...,jane"//
		alert("값을 넣습니다.");
		ar = txt.split(',');
		for(i=0;i<ar.length;i++){
			//<tr><td>John</td></tr>이런식으로 넣게된다.//
			name = '<tr><td>'+ar[i]+'</td></tr>';
			$('#tblData').append(name);
		}
		
	},'text');
	return false;
});
	  	
	  	//===>delete<===//
 $(document)
 .on('click','#btnDelete1',function(){
 	$.ajax({
 		  url:'deleteServlet',//호출될 서블릿의 경로(이름)
 		  method:'get',//데이터 전송방식 get/post
 		  data:'delete='+$('input[name=delete]').val(),
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
 	  
 	  
 	  //===>update<===//
 $(document)
.on('click','#btnUpadte1',function(){
	$.ajax({
		  url:'updateServlet',//호출될 서블릿의 경로(이름)
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