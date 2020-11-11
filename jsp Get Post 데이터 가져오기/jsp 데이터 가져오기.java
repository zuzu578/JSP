package web02;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MethodServlet
 */
@WebServlet("/MethodServlet")
public class MethodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MethodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//http servlet request 란? 
		//client 로부터 온 데이터가 포함되어있는 객체(수신용)//
		//httpservletresponse:web browser(client)에 데이터를 보낼때 사용되는 객체이다.(통신용)//
		//리퀘스트를 한글처리한다//
		request.setCharacterEncoding("utf-8");
		//내보내는것도 한글처리해준다//
		response.setContentType("text/html; charset=utf-8");
		//html 의 input 값들이 여기에 전달된다//
		//getParameter (html에 보낸값을 받는다)//
		//여러개의 값을가져오기//
		//여러개 값을 가져올땐 배열을 만들어서 가져온다//
		//사용예시 ==>check box 같은 여러개 값을 받을때//
		//여러개를 하고싶을땐 getParameterValues를 쓴다//
		//selectbox를 multiple 로 만들면 getParameter를 쓰면 하나밖에 나오지않는다//
		//select ==> 단독 선택 이면 ==>getParameter()//
		//multiple selection ==> getParameterValues()사용//
		//;
			String userid=request.getParameter("userid");
			String userpwd=request.getParameter("passwd1");
			String userpwd2=request.getParameter("passwd2");
			String username=request.getParameter("username");
			String userbirth=request.getParameter("birth");
			String gender=request.getParameter("gender");
			String usermobile=request.getParameter("mobile");
			String []selArea=request.getParameterValues("selArea");
			String []interest=request.getParameterValues("interest");
			
		//라디오버튼 값을 처리할때 //
		//String gender=request.getParameter("gender");
		//textarea 일때 데이터전송//
		//String addr=request.getParameter("txtaddr");
		PrintWriter out=response.getWriter();
		out.println("userid["+userid+"]");
		out.println("userpwd["+userpwd+"]");
		out.println("userpwd2["+userpwd2+"]");
		out.println("userpwd2["+userpwd2+"]");
		out.println("userbirth["+userbirth+"]");
		out.println("gender["+gender+"]");
		out.println("usermobile["+usermobile+"]");
		for(int i = 0 ; i<selArea.length;i++) {
			out.println("selArea["+selArea[i]+"]<br>");
			}
		for(int i = 0 ; i<interest.length;i++) {
			out.println("interest["+interest[i]+"]<br>");
			}
		
		//사용하면 닫아주어야한다;
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//post방식은 id 값이 필요없다 name으로 처리가능//
		response.setContentType("text/html; charset=utf-8");
		//클라이언트에 데이터를 보낼때 이 준비를해야한다/
		PrintWriter out=response.getWriter();
	   
		//데이터를 받아들일때//
		//항상 문자열을 리턴한다//
		//계산할때는 parseInt로 형변환을해준다//
		String[]userid=request.getParameterValues("userid");
		String first = request.getParameter("first");
		String second= request.getParameter("second");
		//받아서 출력//
		out.println("<h1>get방식으로 처리되었습니다.</h1>");
		//parseInt로 형변환(타입캐스팅)//
		int n=Integer.parseInt(first);
		int x=Integer.parseInt(second);
		out.println(n*x);
		
		//사용하면 닫아주어야한다;
		out.close();
	}

}
