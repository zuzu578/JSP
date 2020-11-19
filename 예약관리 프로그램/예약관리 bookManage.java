<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Freelancer - Start Bootstrap Theme</title>
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
         <style>
          .main-contents{
                          display:flex;
                          justify-content:space-between;
                          
                  
                  
                          
  
                 }
         
         </style>
        
    </head>
    <body id="page-top">
        <!-- 네비바-->
        <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">메인</a>
                <button class="navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#about">예약관리하러 가기 </a></li>
                      <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="roomManage.jsp">객실관리하러 가기 </a></li>
                      
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Masthead-->
        <header class="masthead bg-primary text-white text-center">
            <div class="container d-flex align-items-center flex-column">
                <!-- Masthead Avatar Image-->
               
                <!-- Masthead Heading-->
                <h1 class="masthead-heading text-uppercase mb-0">예약관리 프로그램 </h1>
                <!-- Icon Divider-->
                <div class="divider-custom divider-light">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <!-- Masthead Subheading-->

            </div>
        </header>
         <!-- 헤더-->
        <section class="page-section portfolio" id="room-manage">
            <div class="container">
                <!-- Portfolio Section Heading-->
                <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">예약관리 시작하기</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
              
        <!-- 섹션-->
        <section class="page-section bg-primary text-white mb-0" id="about">
            <div class="container">
                <!-- About Section Heading-->
                <h2 class="page-section-heading text-center text-uppercase text-white">예약관리 </h2>
                <!-- Icon Divider-->
                <div class="divider-custom divider-light">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <!-- About Section Content-->
           
        

  
        <div class="main-contents">
                
            <div class="contents1">
                
                    <table>
                        <tr>
                            <td></td>
                            <div class="input-group">
                                                                  <div class="input-group-prepend">
                                                                            <span class="input-group-text">체크인</span>
                                                                  </div>
                                                                 <textarea class="form-control" id="checkin" aria-label="With textarea"></textarea>
                                                        </div>
                                                        <div class="input-group">
                                                                  <div class="input-group-prepend">
                                                                           <span class="input-group-text">체크아웃</span>
                                                                  </div>
                                                                  <textarea class="form-control" id="checkout" aria-label="With textarea"></textarea>
                                                        </div>
                        </tr>
                        <tr>
                            <td>객실종류</td>
                                    <select class="custom-select custom-select-lg mb-3" id="rooms">
                                                                        <option selected>객실</option>
                                                                        <option value="Suite">SuiteRoom</option>
                                                                        <option value="Family">FamilyRoom</option>
                                                                        <option value="Double">DoubleRoom</option>
                                                                        <option value="Single">SingleRoom</option>
                                                                        <option value="Domtory">Dormitory</option>
                                                                  
                                                                </select>
        
                                    <button type="button" id="select-button" class="btn btn-danger">조회</button></td>
                        </tr>
                        
                        <div class="contents2">
                                    <div class="input-group">
                                                                <select class="custom-select" id="rooms01" aria-label="Example select with button addon">
                                                                    <option selected>Choose...</option>
                                                                </select>
                                                                <div class="input-group-append">
                                                                    <button class="btn btn-outline-secondary" type="button">Button</button>
                                                                </div>
                                                        </div>
                            </div>
                    </table>
                    </div>
            <div class="contents3">
                <table>
                    <tr>
                        <td class="right_text"></td>
                        <td>
                                <div class="input-group">
                                                                <div class="input-group-prepend">
                                                                        <span class="input-group-text">객실명</span>
                                                                </div>
                                                        <textarea class="form-control" id="roomname1" aria-label="With textarea"></textarea>
                                                        </div>
                                                </td>
                    </tr>
                    <tr>
                            <input type=hidden id=optype>
                                                <input type=hidden id=hi_roomId name=hi_roomId>
                                                <td></td>
                        <td>
                                <div class="input-group">
                                                                  <div class="input-group-prepend">
                                                                            <span class="input-group-text">체크인</span>
                                                                  </div>
                                                                  <textarea class="form-control" id="checkin2" aria-label="With textarea"></textarea>
                                                        </div>
                                        <div class="input-group">
                                                                  <div class="input-group-prepend">
                                                                            <span class="input-group-text">체크아웃</span>
                                                                  </div>
                                                                  <textarea class="form-control" id="checkout2" aria-label="With textarea"></textarea>
                                                        </div>
                                                 </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                                <div class="input-group">
                                                                <div class="input-group-prepend">
                                                                    <span class="input-group-text">숙박인원</span>
                                                                </div>
                                                                <textarea class="form-control" id="roomperson" aria-label="With textarea"></textarea>
                                                        </div>
                                                </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                                <div class="input-group">
                                                                <div class="input-group-prepend">
                                                                    <span class="input-group-text">모바일번호</span>
                                                                </div>
                                                                <textarea class="form-control" id="mobilenumber" aria-label="With textarea"></textarea>
                                                        </div>
                                                </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                                <div class="input-group">
                                                                <div class="input-group-prepend">
                                                                    <span class="input-group-text">대표자명</span>
                                                                </div>
                                                        <textarea class="form-control" id="chairman" aria-label="With textarea"></textarea>
                                                        </div>
                                                </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                                <div class="input-group">
                                                                <div class="input-group-prepend">
                                                                    <span class="input-group-text">총요금</span>
                                                                </div>
                                                        <textarea class="form-control" id="oneday" aria-label="With textarea"></textarea>
                                                        </div>
                                                </td>
                    </tr>
                </table>
                <div id="boot_btn">
                    <button type="button" id="confirm"class="btn btn-info">예약확정</button>
                    <button type="button" id="cancel" class="btn btn-danger">예약취소</button>
                    <button type="button" id="remove01" class="btn btn-warning">비우기</button>
                </div>
              </div>
              
            
            <div class="contents4">
                        <div class="input-group mb-3">
                                <select class="custom-select" id="show" size=10 style="width:300px;height:500px","id="inputGroupSelect02">
                                    <option selected>Choose...</option>
                                </select>
                                <div class="input-group-append">
                                    <label class="input-group-text" for="inputGroupSelect02">show</label>
                                </div>
                        </div>
            
        </div>
    </div>
          
       
       
        
        
       
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
    
    $(document)
    .on('click','#select-button',function(){
            
            $('#rooms01').children('option:not(:first)').remove();
            $('#show').children('option:not(:first)').remove();
            
            $.get('ConfirmList',
                    {rooms:$('#rooms').val(),checkin:$('#checkin').val(),checkout:$('#checkout').val()},
                    function(data){
                            $.each(data,function(ndx,value){
                                    option='<option class="romove" value='+value['room_id']+'><table>'+
                                         '<tr><th>객실명</th><td class="room_name">'+value['room_name']+'</td></tr>'+
                                         '<tr><th>숙박가능인원</th><td class="howmany">'+value['howmany']+'</td></tr>'+
                                         '<tr><th>1박요금</th><td class="howmuch">'+value['howmuch']+'</td></tr>'+
                                         '</table></option>';
                                    $('#rooms01').append(option);
                            })
                    },'json')
            
                    
            $.get('BookList',
                    {rooms:$('#rooms').val(),checkin:$('#checkin').val(),checkout:$('#checkout').val()},
                    function(data){
                            console.log(data);
                            $.each(data,function(ndx,value){
                                    console.log("list bookId: "+value['book_id']);
                                    option='<option class="remove" value='+value['book_id']+'><input type=hidden value=hi_roomId2 value='+value['room_id']+'><table>'+
                                         '<tr><td class="room_name">'+value['room_name']+',</td></tr>'+
                                         '<tr><td class="checkin">'+value['checkin']+',</td></tr>'+
                                         '<tr><td class="checkout">'+value['checkout']+',</td></tr>'+
                                         '<tr><td class="howmany">'+value['howmany2']+'</td></tr>'+
                                         '</table></option>';
                                    $('#show').append(option);
                            })
                    },'json')
                    
                    return false;
    })
    .on('change','#rooms01',function(){
            var i = $('#rooms01 option:selected').val();
            $('#hi_roomId').val(i);
                        //console.log(i);            
            var n = $('option:selected .room_name').text();
            $('#roomname1').val(n);
            //console.log(n)
            var ci = $('#checkin').val();
            $('#checkin2').val(ci);
            //console.log(ci)
            var co = $('#checkout').val();
            $('#checkout2').val(co);
            //console.log(co)
            var h = $('option:selected .howmuch').text();
            //console.log(h)
            var sum =((co-ci)+1)*h;
            //console.log(sum)
            $('#oneday').val(sum);
            
            
            
            //var ri = $('#room_Id').val();
            //$('#hi_roomId').val(ri);
            //console.log(ri);
            
            //return false;

    })
    .on('click','#confirm',function(){
            
            var test=parseInt($('#roomperson').val());
            if(parseInt($('#roomperson').val())>parseInt($('option:selected .howmany').text())){
                    alert("숙박 인원수 초과");
                    return false;}
                   if($('#roomname1').val()==''){
                   alert("객실명을 입력해주세요.");
                   return false;
                   }if($('#hi_roomId').val()==''){
                           alert("roomID가 누락되었습니다.");
                     return false;
                   }if($('#checkin2').val()==''){
                           alert("체크인 날짜를 입력해주세요.");
                     return false;
                   }if($('#checkout2').val()==''){
                           alert("체크아웃 날짜를 입력해주세요.");
                     return false;                   
                   }if($('#roomperson').val()==''){
                           alert("숙박인원을 입력해주세요.");
                     return false;
                   }if($('#mobilenumber').val()==''){
                           alert("모바일번호를 입력해주세요.");
                     return false;
                   }if($('#chairman').val()==''){
                           alert("대표자 이름을 입력해주세요.");
                     return false;
                   }if($('#oneday').val()==''){
                           alert("총요금이 누락되었습니다.");
                     return false;
                   }
            
            
            $.get('BookSubmit',
                    {roomname1:$('#roomname1').val(),hi_roomId:$('#hi_roomId').val(),checkin2:$('#checkin2').val(),checkout2:$('#checkout2').val(),
                    roomperson:$('#roomperson').val(),mobilenumber:$('#mobilenumber').val(),chairman:$('#chairman').val(),
                    oneday:$('#oneday').val()},
                    function(data){
                                    console.log(data);
                                $('#show').append(data);
                                
                                alert("등록되었습니다.");
                                
                            })
                            
            $('#rooms01').children('option:not(:first)').remove();
            $('#show').children('option:not(:first)').remove();
                            
            return false;
    })
    
    .on('click','#cancel',function(){
    	$.ajax({
    		url:'BookCancle',
    		method:'get',
    		data:'hi_roomId='+$('input[name=hi_roomId]').val(),
    		dataType:'text',
    		beforeSend:function(){},
    		success:function(txt){
    			alert(txt);
    		},
    		complete:function(){
    			alert("have a nice day");
    		}
    	})
    	
    	//$('#cancel').val();
    })

    .on('click','#remove01',function(){
            $('#roomname1,#checkin2,#checkout2,#roomperson,#mobilenumber,#chairman,#oneday').val('');
            $('#checkin,#checkout').val('');
            $('#rooms').val("객실");
            $('#rooms01').val('Choose...');
           
            $('#rooms01').children('option:not(:first)').remove();
            $('#show').children('option:not(:first)').remove();
            return false;
    })
    .on('change','#show',function(){
            console.log("click show");
            
            
                    console.log($("#show option:selected").val());
                    $.get('BookRead',
                    {book_id:$('#show option:selected').val()},
                            function(data){
                            console.log(data);
                            $.each(data,function(ndx,value){
                                            console.log("BookRead_function");
                                $('#optype').val('edit');
                                console.log($('#optype').val());
                                             $('#roomname1').val($('#show option:selected .room_name').text());
                                             $('#checkin2').val(value['checkin']);
                                             console.log(value['checkin']);
                                             $('#checkout2').val(value['checkout']);
                                             $('#roomperson').val(value['howmany']);
                                             $('#mobilenumber').val(value['mobile']);
                                             $('#chairman').val(value['name']);
                                             $('#oneday').val(value['expense']);
                                    })
                            // 요기부분이 문제~
                            
                    },'json')
            
    })
    // .on('click','#')
</script> 