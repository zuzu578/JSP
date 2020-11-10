<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<table border="1">
<tr>
<%

for(int i = 2 ; i<10 ; i++){%>
<% 
  for(int j = 1 ; j<10; j++){%>
   <tr><td><%=i %>X<%=j%>=<%=i*j%></tr>  </td>
 <% }%>
<% }%>
</tr>
</table>

</head>
<body>

</body>
</html>