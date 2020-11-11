<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="MethodServlet" id="frmSignin"> 
 <table>
   <tr><td align=right>아이디</td><td><input type=text  name=userid size=12></td>
   <tr><td align=right>비밀번호</td><td><input type=text  name=passwd1 size=12></td>
   <tr><td align=right>비밀번호확인</td><td><input type=text  name=passwd2 size=12></td>
   <tr><td align=right>실명</td><td><input type=text  name=username size=12></td>
   <tr><td align=right>생년월일</td><td><input type=date name=birth></td>
   <tr><td align=right>성별</td><td><input type=radio name=gender value=female>여성
                           <input type=radio name=gender value=male>남성</td>
   <tr><td align=right>모바일</td><td><input type=phone  name=mobile></td>
   <tr><td align=right>관련지역</td><td><select name=selArea multiple>
                              <option value='서울'>서울</option>
                              <option value='경기'>경기</option>
                              <option value='충남'>충남</option>
                              <option value='충북'>충북</option>
                              <option value='전북'>전북</option>
                              <option value='전남'>전남</option>
                              </select></td>
   <tr><td align=right>관심분야</td><td><input type=checkbox name=interest value="정치">정치
                              <input type=checkbox name=interest value="경제">경제
                              <input type=checkbox name=interest value="스포츠">스포츠<br>
                              <input type=checkbox name=interest value="연예">연예
                              <input type=checkbox name=interest value="사회">사회
                              <input type=checkbox name=interest value="국제">국제<br>
                              <input type=checkbox name=interest value="금융">금융
                              <input type=checkbox name=interest value="부동산">부동산
                              <input type=checkbox name=interest value="주식">주식
   </td>
   
   </table>
 
  <input type="button" id="btnSignin value="가입">
  
</form>
<br><br>
<form method="post" action="MethodServlet">
<input type="text" name="first" ><br>
<input type="text" name="second" ><br>
 <input type="submit" value="post방식으로 호출">
</form>
</body>
<script src="https://code.jquery.com/jquery.3.5.0.js"></script>
<script>
//서버에서 유효성 검사하는 대신에 클라이언트쪽에서 검사//
//submit 버튼을 대체햇다//
$(document)
.on('click','#btnSignin',function(){
	//생년월일 성별 비밀번호 일치여부 모바일 번호 형식 체크 //
	if($('input[name=birth]').val()){
		return false;
	}
	$('#frmSignin').submit();
	
})
.on('click','#btnSignin',function(){
	
})

</script>
</html>