<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Table</title>
<body>
<table border=1>
<tr>
<%
for(int i = 1; i<10 ; i++){%>
<%
	for(int j= 2; j<10 ; j++){%>
    <td><%=j%>X<%=i%>=<%=i*j%>   </td>	
	<%}%>
</tr>
	
<%}%>
</table>

</body>

</html>