<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사 결과</title>
</head>
<style>
b {
   font-size:16pt;
}
</style>
<body>
<h2>설문조사 결과</h2>
<%
   request.setCharacterEncoding("utf-8");
   String username=request.getParameter("username");
   String gender=request.getParameter("gender");
   String[] season=request.getParameterValues("season");
%>
<table>
<tr><td>이름</td><td><%=username %></td></tr>
<tr><td>성별</td><td><%=gender %></td></tr>
<tr><td>계절</td><td>
<%
   for(int i=0;i<season.length;i++){
      out.println(season[i]);
   }
%>
</td></tr>
<tr>
<td colspan=2 align=center><a href="javascript:history.go(-1)">뒤로 다시</a></td>
</tr>
</table>
</body>
</html>