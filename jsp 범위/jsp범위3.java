<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3</title>
</head>
<body>
하나의 페이지 속성:<%=pageContext.getAttribute("name") %><br>
하나의 request 속성:<%=request.getAttribute("name") %><br>
하나의 session 속성:<%=session.getAttribute("name") %><br>
하나의 application 속성:<%=application.getAttribute("name") %>

</body>
</html>