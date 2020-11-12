
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1</title>
</head>
<body>
<%
 	pageContext.setAttribute("name","page man");//name 이라는 변수에 page man을 저장//
 	request.setAttribute("name","request man");
 	session.setAttribute("name","session man");
 	application.setAttribute("name","application man");
	System.out.println("FirstPage.jsp");
	System.out.println("하나의 페이지 속성["+pageContext.getAttribute("name")+"]");
	System.out.println("하나의 리퀘스트 속성["+request.getAttribute("name")+"]");
	System.out.println("하나의 세션 속성["+session.getAttribute("name")+"]");
	System.out.println("하나의 어플리케이션 속성["+application.getAttribute("name")+"]");
	
	request.getRequestDispatcher("secondPage.jsp").forward(request,response);//post 방식 줄여쓰기//
	
	
%>

</body>
</html>