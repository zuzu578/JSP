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
for(int i = 2; i<10 ; i++){%>
<%
	for(int j= 1; j<10 ; j++){%>
    <td><%=i%>X<%=j%>=<%=i*j%>   </td>	
	<%}%>
</tr>
	
<%}%>
</table>
</body>

</body>
</html>