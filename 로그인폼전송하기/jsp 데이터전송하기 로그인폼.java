<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로그인하세요</h3>

</body>
</html>





<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select</title>
</head>
<body>
<form method="post" action="doMove.jsp">
<input type="text" name="userid"> 
<input type="submit" value="login">
<input type="reset" value="reset">


</form>


</body>
</html>






<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 String userid=request.getParameter("userid");

 	if(userid.equals("login")){
 		RequestDispatcher rd = request.getRequestDispatcher("login.jsp?userid="+userid);
		rd.forward(request,response);//post 방식 
 	}else{
 		response.sendRedirect("signin.jsp");
 	}

%>
</body>
</html>





<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>가입하세요.</h3>
</body>
</html>