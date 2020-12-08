<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>카페주문접수</title>
        
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic" rel="stylesheet" type="text/css" />
        <!-- Third party plugin CSS-->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link href="CSS/styles.css" rel="stylesheet" />
      
    </head>
    <body id="page-top">
      
        <!-- Masthead-->
        <header class="masthead">
            <div class="menu-container">
                <div class="menu-area1">
                    <select class="form-select form-select-lg mb-3" id="select1" style="width:500px;height: 500px;"aria-label=".form-select-lg example">
                        <option selected>메뉴리스트</option>
                        <option value="1">CaffeLatte,3000</option>
                        <option value="2">AmeriCano,2000</option>
                        <option value="3">CappuCcino,4000</option>
                        <option value="4">Earl Gray,3500</option>
                      </select>
                 



                </div>

                <div class="menu-area2">
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">메뉴명</span>
                        <input type="text" class="form-control" id="menuName" name="menuName" aria-label="Username" aria-describedby="basic-addon1">
                      </div>
                      <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">수량</span>
                        <input type="text" class="form-control" id="count" name="count" aria-label="Username" aria-describedby="basic-addon1">
                      </div>
                      <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">가격</span>
                        <input type="text" id="total" name="total"class="form-control" aria-label="Username" aria-describedby="basic-addon1">
                      </div>
                      <button type="button" id="order" name="order"class="btn btn-info">주문</button>
                      <button type="button" id="cancle" name="cancle"class="btn btn-warning">취소</button>

                    
                </div>


                <div class="menu-area3">
                    <select class="form-select form-select-lg mb-3"id="orderlist" name="orderlist" style="width:500px;height: 500px;" aria-label=".form-select-lg example">
                        <option selected>주문리스트</option>
                        
                      </select>
                      <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">합계</span>
                        <input type="text" id="totalMoney" name="totalMoney" class="form-control"  aria-label="Username" aria-describedby="basic-addon1">
                        <span class="input-group-text" id="basic-addon1">원</span>
                      </div>
                      <button type="button" id="confirm" name="confirm" class="btn btn-success">주문완료</button>


                    
                </div>

                <div class="menu-area4">
                    <select class="form-select" id="result" name="result" style="width:500px;height: 500px;" aria-label="Default select example">
                        <option selected>누적매출</option>
                       
                      </select>
                      <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">매출액</span>
                        <input type="text" class="form-control" id="todayTotal" name="todayTotal" aria-label="Username" aria-describedby="basic-addon1">
                        <span class="input-group-text" id="basic-addon1">원</span>
                      </div>
                      <button type="button" id="todayTotalButton" name="todayTotal"class="btn btn-dark">총매출보기</button>
                      <button type="button" id="delete" name="delete"class="btn btn-info">매출내역 지우기</button>
                      <input type="hidden" id="hidden" name="hidden">
                      
                      


                    
                </div>







            </div>
           
        </header>
 
      
        <!-- Portfolio-->
        <div id="portfolio">
            <div class="container-fluid p-0">
                <div class="row no-gutters">
                    <div class="col-lg-4 col-sm-6">
                        <a class="portfolio-box" href="assets/img/portfolio/fullsize/1.jpg">
                            <img class="img-fluid" src="assets/img/portfolio/thumbnails/1.jpg" alt="" />
                            <div class="portfolio-box-caption">
                                <div class="project-category text-white-50">카페사진1</div>
                                <div class="project-name">카페사진1</div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <a class="portfolio-box" href="assets/img/portfolio/fullsize/2.jpg">
                            <img class="img-fluid" src="assets/img/portfolio/thumbnails/2.jpg" alt="" />
                            <div class="portfolio-box-caption">
                                <div class="project-category text-white-50">카페사진1</div>
                                <div class="project-name">카페사진1</div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <a class="portfolio-box" href="assets/img/portfolio/fullsize/3.jpg">
                            <img class="img-fluid" src="assets/img/portfolio/thumbnails/3.jpg" alt="" />
                            <div class="portfolio-box-caption">
                                <div class="project-category text-white-50">카페사진1</div>
                                <div class="project-name">카페사진1</div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <a class="portfolio-box" href="assets/img/portfolio/fullsize/4.jpg">
                            <img class="img-fluid" src="assets/img/portfolio/thumbnails/4.jpg" alt="" />
                            <div class="portfolio-box-caption">
                                <div class="project-category text-white-50">카페사진2</div>
                                <div class="project-name">카페사진2</div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <a class="portfolio-box" href="assets/img/portfolio/fullsize/5.jpg">
                            <img class="img-fluid" src="assets/img/portfolio/thumbnails/5.jpg" alt="" />
                            <div class="portfolio-box-caption">
                                <div class="project-category text-white-50">카페사진2</div>
                                <div class="project-name">카페사진2</div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <a class="portfolio-box" href="assets/img/portfolio/fullsize/6.jpg">
                            <img class="img-fluid" src="assets/img/portfolio/thumbnails/6.jpg" alt="" />
                            <div class="portfolio-box-caption p-3">
                                <div class="project-category text-white-50">카페사진3</div>
                                <div class="project-name">카페사진3</div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </div>
       
       
        <!-- Footer-->
        <footer class="bg-light py-5">
            <div class="container"><div class="small text-center text-muted">카페주문받기</div></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script language="javascript">
var menuName = 0;
var menuCount = 0;
var menuPrice = 0;
var price = 0 ;
var count = 0 ;
var totalSum = 0 ;
var t11 = 0 ;
$( document ).ready(function() {
	var item ;
	$.get('CaffeSelect',{},function(data){
		//json방식//
		ar = data;
		console.log(data);
		console.log(ar);
		$.each(data,function(ndx,value){
			//서블릿에서 써준대로 값을 써준다.//
			//name='<option><tr><td>'+value['NICK']+'</td><td>'+value['MOBILE']+'</td><td>'+value['GENDER']+'</td></tr></option>';
			name='<option>'+value['menu_name']+','+value['menu_price']+','+value['menu_count']+'</option>';
			$('#result').append(name);
			//$('#tt2').append(name);
			console.log('btnGet3')
		})
			
	},'json');//===>2개이상 타입 은 json 이라한다.//text는 하나//
	return false;
	
});
$(document)
.on("click","#select1",function(){
	 id=$(this).find('option:selected').text();
	 console.log(id);
	 ar = id.split(',');
	 menuName = $("#menuName").val(ar[0]);
	 menuPrice =  $("#total").val(ar[1]);
	 menuCount =  $("#count").val();
	
})
$(document)
.on("click","#order",function(){
	id=$("#select1").find('option:selected').text();
	ar = id.split(',');
	 menuName = $("#menuName").val();
	 menuPrice =  $("#total").val();
	 menuCount =  $("#count").val();
	 name='<option>'+[menuName]+','+[menuPrice]+','+[menuCount]+'</option>';
	 $('#orderlist').append(name);
	 console.log(name)
	
})
$(document)
.on("click","#orderlist",function(){
	id=$(this).find('option:selected').text();
	console.log(id);
	ar = id.split(',');
	console.log(ar);
	console.log(ar[1]);
	console.log(ar[2]);
	price=parseInt(ar[1]);
	count=parseInt(ar[2]);
	console.log(price);
	console.log(count);
	console.log(price*count);
	result = price*count;
	$("#totalMoney").val(result);
	
})
$(document)
.on("click","#confirm",function(){
	/*
	var t1 = $("#totalMoney").val();
	console.log(t1);
	name='<option>'+[t1]+'</option>';
	$('#result').append(name);
	*/
	window.location.reload(true);
	
	$.ajax({
		  url:'CaffeInsert',//호출될 서블릿의 경로(이름)
		  method:'get',//데이터 전송방식 get/post
		  //전송할 데이터(쿼리스트링)//
		  data:'menuName='+$('input[name=menuName]').val()+'&count='+$('input[name=count]').val()+'&total='+$('input[name=total]').val(),
		  dataType:'text',//반환받을 데이터 타입 
		  beforeSend:function(){},
		  success:function(txt){//호출 성공해서 완료하면 
		},
		complete:function(){
			alert("hi");
		} 
		
	    })
	$("#menuName").val("");
	$("#count").val("");
	$("#total").val("");
	$("#totalMoney").val("");
	$('#orderlist').children('option').remove();
	  })

$(document)
.on("click","#todayTotalButton",function(){
	id=$("#result").find('option').text();
	console.log(id);
	ar = id.split(',');
	var t8 = parseInt(ar[1]);
	var t9 = parseInt(ar[2]);
	/*
	for(var i = 0 ; i < ar.length ; i++){
		
	var t11= ar[i];
	}
	*/
	var t10 = t8*t9;
	totalSum = totalSum+t10
	$("#todayTotal").val(totalSum);
	
})
$(document)
.on("click","#cancle",function(){
	$("#menuName").val("");
	$("#count").val("");
	$("#total").val("");
	$("#totalMoney").val("");
	$('#select_id').children('option').remove();

	
})
$(document)
.on("click","#result",function(){
	id=$(this).find('option:selected').text();
	ar = id.split(',');
	console.log(ar[0]);
	$("#hidden").val(ar[0]);
	

})
$(document)
.on("click","#delete",function(){
	$.ajax({
		  url:'CaffeDelete',//호출될 서블릿의 경로(이름)
		  method:'get',//데이터 전송방식 get/post
		  data:'hidden='+$('input[name=hidden]').val(),
		  dataType:'text',//반환받을 데이터 타입 
		  beforeSend:function(){},
		  success:function(txt){//호출 성공해서 완료하면 
			alert("입력완료되었습니다.");
		},
		complete:function(){
			alert("hi");
		} 

	    })
		window.location.reload(true);
})
</script>
