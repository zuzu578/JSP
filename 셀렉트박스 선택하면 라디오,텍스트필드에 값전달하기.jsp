<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스탭관리</title>
</head>
<body>
<table style='border:1px solid green'>
<tr>
	
   <td style='border:1px solid green'>
 		
   
      <select id=selStaff size=20 style='width:300px'><table id="tt2"><tr><td></td><td></td><td></td></tr></table></select>
     	 
   </td>
  

   <td style='border:1px solid green' valign=top>
      <table>
      <tr height=40px>
         <td>이름:&nbsp;<input type=text name ="txtnick"id=txtnick size=30></td>
      </tr>
      <tr height=40px>
         <td>모바일:&nbsp;<input type=text name="txtmobile" id=txtmobile size=20></td>
      </tr>
      <tr height=40px>
         <td>성별:&nbsp;<input type=radio value='f' id=female name=gender>여성
            <input type=radio value='m' id=male name=gender>남성
      </tr>
      <tr height=40px>
         <td><input type=button id=btnInsert value='등록'>&nbsp;
            <input type=button id=btnDelete value='삭제'>&nbsp;
            <input type=button id=btnReset value='비우기'>
      </tr>
      </table>
   </td>
</tr>
</table>
</body>
</html>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
var ar =[];
$(document).ready(function() {
	var item ;
	$.get('selectAll',{},function(data){
		//json방식//
		ar = data;
		console.log(data);
		console.log(ar);
		$.each(data,function(ndx,value){
			//서블릿에서 써준대로 값을 써준다.//
			//name='<option><tr><td>'+value['NICK']+'</td><td>'+value['MOBILE']+'</td><td>'+value['GENDER']+'</td></tr></option>';
			name='<option>'+value['NICK']+','+value['MOBILE']+','+value['GENDER']+'</option>';
			$('#selStaff').append(name);
			//$('#tt2').append(name);
			console.log('btnGet3')
		})
			
	},'json');//===>2개이상 타입 은 json 이라한다.//text는 하나//
	return false;
	
    
});

var nClick=null;
var radioVal = $('input[name="gender"]:checked').val();
$(document)
.on('click','#btnInsert',function(){
	//===>insert<===//
	var r2 ;
	var r3 ;
	alert(radioVal)
	$.ajax({
		  url:'insert1',//호출될 서블릿의 경로(이름)
		  method:'get',//데이터 전송방식 get/post
 		  beforeSend:function(){
 			  /*
			  if($('input[name="gender"]:checked').val()=="female"){
				  r2 = $('input[name="gender"]:checked').val('f')
			  }
				// $("input[type=radio][name=gender]").val('f');
			   if($('input[name="gender"]:checked').val()=="male"){
				  $('input[name="gender"]:checked').val('m')
				  //$("input[type=radio][name=gender]").val('m');
			  }
			   */
			   console.log(r2)
			  
			 
		  },
		  data:'txtnick='+$('input[name=txtnick]').val()+'&txtmobile='+$('input[name=txtmobile]').val()+'&gender='+$('input[name="gender"]:checked').val(),
		  dataType:'text',//반환받을 데이터 타입 
		 
		 
		  success:function(txt){//호출 성공해서 완료하면 
			alert("입력완료되었습니다.");
		},
		complete:function(){
			alert("hi");
			
		} 
		
	    })
	    window.location.reload(true)
	  })
	  
	  
	  
 $(document)
 .on('click','#btnDelete',function(){
 	$.ajax({
 		  url:'delete1',//호출될 서블릿의 경로(이름)
 		  method:'get',//데이터 전송방식 get/post
 		  data:'txtnick='+$('input[name=txtnick]').val(),
 		  dataType:'text',//반환받을 데이터 타입 
 		  beforeSend:function(){},
 		  success:function(txt){//호출 성공해서 완료하면 
 			alert("입력완료되었습니다.");
 		},
 		complete:function(){
 			alert("hi");
 		} 
 		
 	    })
 	    window.location.reload(true)
 	  })	
 
 	  
$(document)
  .on('click','#selStaff',function(){
	   //var idx = $("#selStaff option:selected").index();
	   //console.log(idx)
	   txt=$(this).text();
	console.log(txt)	  
	  id=$(this).find('option:selected').text();
	console.log(id)
	  ar = id.split(',');
	  //alert(id);
	  //$("#txtnick").val(id);
	 
	   console.log(ar)
	   console.log(ar)
	   $("#txtnick").val(ar[0])
		$("#txtmobile").val(ar[1])
		if(ar[2]=="f"){
		var v9=  $("input:radio[name='gender']:radio[value='f']").prop("checked",true);
		}
	   if(ar[2]=="m"){
			var v9=  $("input:radio[name='gender']:radio[value='m']").prop("checked",true);
		}
	  	
		
	  /*
		if($('input[name="gender"]:checked').val()=="f"){
			var v9=  $("input:radio[name='gender']:radio[value='f']").prop("checked",true);
		}
	  */
	    if($('input[name="gender"]:checked').val()=="m"){
			 $("input:radio[name='gender']:radio[value='m']").prop("checked",true);
		}
		
	  //v20= $("#selStaff option:eq(1)").val();

   })


   
$(document)
.on('click','#btnReset',function(){
	$("#txtnick").val("");
	$("#txtmobile").val("");
	$("#txtnick").val("");
	$("input:radio[name='gender']").prop("checked", false);     
})  
    
 
    
 	  

</script>