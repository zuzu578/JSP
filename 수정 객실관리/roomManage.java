<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>객실관리</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
         <link href="styles.css" rel="stylesheet" type="text/css">
        
    </head>
    <body id="page-top">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">메인</a>
                <button class="navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                           <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="bookManage.jsp">예약관리</a></li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#about">객실관리하러가기</a></li>
                      
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Masthead-->
        <header class="masthead bg-primary text-white text-center">
            <div class="container d-flex align-items-center flex-column">
                <!-- Masthead Avatar Image-->
               
                <!-- Masthead Heading-->
                <h1 class="masthead-heading text-uppercase mb-0">객실관리 프로그램</h1>
                <!-- Icon Divider-->
                <div class="divider-custom divider-light">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <!-- Masthead Subheading-->
               
            </div>
        </header>
        <!-- Portfolio Section-->
        <section class="page-section portfolio" id="room-manage">
            <div class="container">
                <!-- Portfolio Section Heading-->
                <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">객실관리 시작하기</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
              
        <!-- About Section-->
        <section class="page-section bg-primary text-white mb-0" id="about">
            <div class="container">
                <!-- About Section Heading-->
                <h2 class="page-section-heading text-center text-uppercase text-white">객실관리</h2>
                <!-- Icon Divider-->
                <div class="divider-custom divider-light">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <!-- About Section Content-->
               
    
         <div class="wrapper">
            
            <div class="main-contents1">
            <div class="left">
            
                 <!-- 왼쪽 셀렉트 박스에요 아이디는 "selectBox"-->
              <select class="custom-select" name="selectBox" style="width:300px; height:400px;" id="selectBox" size=12>
             
              <option selected>
              
              <table id='table' border=1 >
              <tr><td>객실명</td><td>객실분류</td><td>총요금 요금</td><td>숙박인원</td></tr>
              
              
              
              </table>
              
              </option>
              
              
            </select>
            <table border="1" id="room-table">
              
             </table>
              
            
            
          </div>
           <!-- 여기부터는 오른쪽에있는 내용물들 이에요!-->
            <!-- 테이블로 짰어요!-->
        <div class="right">
        <table>
      <tr><td>
      <div class="input-hidden">
      <!-- id="hi_roomId"-->
      <input type = "hidden" id="roomid" name="roomid">
      
      </div>
      <div class="input-group mb-3">
          <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-default">객실명</span>
          </div>
           <!-- 객실명 옆에 있는 input 이에요 아이디는 "room-name"이에요 !-->
          <input type="text" id="roomname" name="roomname" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
        </div><br></td></tr>
      <tr><td><div class="input-group">
                  <select class="custom-select custom-select-lg mb-3"name="roomitem2" value="roomitem2" id="roomitem2">
     
      <option selected>객실</option>
                           <option value="SuiteRoom">SuiteRoom</option>
                           <option value="FamilyRoom">FamilyRoom</option>
                           <option value="DoubleRoom">DoubleRoom</option>
                           <option value="SingleRoom">SingleRoom</option>
                           <option value="Dormitory">Dormitory</option>
          <!-- 객실분류 옆에 있는 input 이에요 아이디는 "room-div"이에요 !-->
          
        </div>
        <br></td></tr>
      <tr><td><div class="input-group mb-3">
          <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-default">총요금</span>
          </div>
           <!-- 1박요금 옆에 있는 input 이에요 아이디는 "room-expense"이에요 !-->
          <input type="text" class="form-control" id="roomexpense" name="roomexpense"aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
        </div><br></td></tr>
      <tr><td><div class="input-group mb-3">
          <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-default">숙박인원</span>
          </div>
          <!-- 숙박인원 옆에 있는 input 이에요 아이디는 "person" 이에요 !-->
          <input type="text" class="form-control"id="person" name="person" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
        </div><br></td></tr>
        </table>
        <!-- 등록(수정)버튼 삭제버튼 비우기 버튼  이에요 !-->
        <!-- 등록(수정)은 update 이고 삭제버튼은 delete 이며 비우기버튼은 remove입니다.!-->
        <div class="button-items">
          <button type="button" id="update" class="btn btn-dark">등록</button>
          <button type="button" id="edit" class="btn btn-info">수정</button>
          <button type="button" id="delete" class="btn btn-warning">삭제</button>
          <button type="button" id="reset"  class="btn btn-danger">비우기</button>
        </div>
        </div>
        </div>
           </div>
                
            </div>
        </section>
       
        <!-- Bootstrap core JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <!-- Contact form JS-->
        <script src="assets/mail/jqBootstrapValidation.js"></script>
        <script src="assets/mail/contact_me.js"></script>
        <!-- Core theme JS-->
           <script type ="text/javascript" src="scripts.js"> </script>

    </body>
    <script src="https://code.jquery.com/jquery-3.5.0.js"></script>

<script language="javascript">

$(document).ready(function(){
   $.get('RoomAllSelect',{},function(txt){//txt="john, smith ,...,jane"//
      
      ar = txt.split(',');
      for(i=0;i<ar.length;i++){
         //<tr><td>John</td></tr>이런식으로 넣게된다.//
         name = '<tr><td>'+ar[i]+'</td></tr>';
         console.log(name)
          $('#selectBox:eq(0)').append('<option><table><tr><td>'+name+'</td></tr></table></option>');
      
         
      }
      
   },'text');
   return false;

    

});






    
    
    $(document)
    //Create(insert부분)//
    .on('click','#update',function(){
    	alert("입력되었습니다.")
    	  window.location.reload(true);
    	  

       $.ajax({
          url:'RoomSubmit',
          method:'get',
         // data:'roomname='+$('input[name=roomname]').val()+'&roomitem2='+$('#roomitem2 option:selected').text()+'&roomexpense='+$('input[name=roomexpense]').val()+'&person='+$('input[name=person]').val(),
         data:'roomname='+$('input[name=roomname]').val()+'&roomitem2='+$('#roomitem2 option:selected').text()+'&roomexpense='+$('input[name=roomexpense]').val()+'&person='+$('input[name=person]').val()+'&roomid='+$('input[name=roomid]').val(),
          dataType:'text',
          beforeSend:function(){},
          success:function(txt){
             //alert(txt);
             
          },
          complete:function(txt){
            
             $('#selectBox:eq(0)').append(txt);
          }
       })
        var r1 = $('#roomname').val();
        var r2 = $("#roomitem2 option:selected").val();
        var r3 = $('#roomexpense').val();
        var r4 = $('#person').val();
       
        $('#roomname').val(r1);
        $('#roomitem2').val(r2);
        $('#roomexpense').val(r3);
        $('#person').val(r4);
        //table//
        $('#selectBox:eq(0)').append('<option><table><tr><td>'+r1+'</td><td>'+r2+'</td><td>'+r3+'</td><td>'+r4+'</td></tr></table></option>');
        $('#roomname').val("");
        $('#roomitem2').val("");
        $('#roomexpense').val("");
        $('#person').val("");
     
        
        
    })
    
    $(document)
    .on('click','#edit',function(){
    	var c8 = confirm("수정하시겠습니까?")
    	if(c8===true){
    	 window.location.reload(true);
       $.ajax({
            url:'RoomEdit',
            method:'get',
            data:'roomid='+$('input[name=roomid]').val()+'&roomitem2='+$('#roomitem2 option:selected').text()+'&roomexpense='+$('input[name=roomexpense]').val()+'&person='+$('input[name=person]').val()+'&roomname='+$('input[name=roomname]').val(),
            //data:'roomname='+$('input[name=roomname]').val()+'&roomitem2='+$('#roomitem2 option:selected').text()+'&roomexpense='+$('input[name=roomexpense]').val()+'&person='+$('input[name=person]').val()+'&roomid='+$('input[name=roomid]').val(),
            dataType:'text',
            beforeSend:function(){},
            success:function(txt){
               alert(txt);
            },
            complete:function(){
             
            }
         })
        var r01 =  $('#roomname').val();
        var r02 = $('#roomitem2').val();
        var r03 =  $('#roomexpense').val();
        var r04 = $('#person').val();
          $('#roomname').val("");
          $('#roomitem2').val("");
          $('#roomexpense').val("");
          $('#person').val("");
          $('#selectBox').children('option:selected').remove();
          //$('#selectBox').children('option:not(:first)').remove();
       // $('#selectBox:eq(0) tr').eq(0).remove();
        $('#selectBox:eq(0)').append('<option><table><tr><td>'+r01+'</td><td>'+r02+'</td><td>'+r03+'</td><td>'+r04+'</td></tr></table></option>');
       	alert("수정되었습니다.")
    	}else{
    		alert("수정을 취소합니다.")
    	}
       
     
    })
    
    
    $(document)
    //Delete(remove(delete)부분)//
    //테이블에있는 내용물을 삭제합니다.//
    .on('click','#delete',function(){
    	var c9 = confirm("삭제하시겠습니까?")
    	if(c9===true){
       $.ajax({
          url:'RoomCancle',
          method:'get', 
          data:'roomname='+$('input[name=roomname]').val(),
          dataType:'text',
          beforeSend:function(){},
          success:function(txt){
             alert(txt);
          }, 
          complete:function(){
            
          }
       })
       // $('#rooms01').children('option:not(:first)').remove();
         $('#selectBox').children('option:selected').remove();
        //$('#selectBox:eq(0) tr').eq(0).remove();
       $('#roomname').val;
       $('#roomname').val("");
        $('#roomitem2').val("");
        $('#roomexpense').val("");
        $('#person').val("");
        alert("삭제되었습니다.")
    	}else{
    		alert("삭제를 취소합니다.")
    	}
    })
    $(document)
    .on('click','#reset',function(){
         $('#roomname').val("");
         $('#roomitem2').val("");
         $('#roomexpense').val("");
         $('#person').val("");
    })
   
    
   $(document)
   .on('change','#selectBox',function(){
       
      var idx = $("#selectBox option:selected").index();
    
      var s1 = $('table:eq('+(idx-1)+') td:eq(2)').text();
      console.log(s1)
      var s2 = $('table:eq('+(idx-1)+') td:eq(3)').text();
      console.log(s2)
      var s3 = $('table:eq('+(idx-1)+') td:eq(4)').text();
      console.log(s3)
      var s4 = $('table:eq('+(idx-1)+') td:eq(5)').text();
      console.log(s4)

      
        var id = $('#hi_roomId').val();
        
      $('#roomname').val(s1);
      $('#roomitem2').val(s2);
      $('#roomexpense').val(s3);
      $('#person').val(s4);
      
   })
   
     $(document)
   .on('click','#selectBox',function(){
     $.get('RoomSelect',{},function(txt){
            
                        
                        ar = txt.split(',');
                        for(i=0;i<ar.length;i++){
                                //<tr><td>John</td></tr>이런식으로 넣게된다.//
                                name =ar[i];
                                $('#roomid').val(name);
                        }
                        
                },'text');
                return false;
   })
   
</script> 