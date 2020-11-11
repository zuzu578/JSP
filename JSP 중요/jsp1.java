<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사</title>
</head>
<body>
<h2>설문조사</h2>
<form action=research.jsp method=post>
   <table>
   <tr>
      <td>이름</td><td><input type=text name=username size=12>
   </tr>
   <tr>
      <td>성별</td><td><input type=radio name=gender value=female>여성
                  <input type=radio name=gender value=male>남성</td>
   </tr>
   <tr>
      <td>좋아하는 계절</td><td>
      <input type=checkbox name=season value=spring>봄
      <input type=checkbox name=season value=summer>여름
      <input type=checkbox name=season value=fall>가을
      <input type=checkbox name=season value=winter>겨울
   </tr>
   <tr>
      <td colspan=2>
         <input type=submit value="전송">
         <input type=reset value='취소'>
      </td>
   </tr>
   </table>
</form>
</body>
</html>