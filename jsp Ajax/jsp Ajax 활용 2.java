package s1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s1
 */
@WebServlet("/s1")
public class s1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public s1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpServletRequest request ==> Client 로 부터 온데이터가//
		//포함되어있는 객체이다.(수신용)//
		//HttpServletresponse:web browser(client)에 데이터를 보낼때 사용되는 객체이다(통신용)//
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		//요청한 결과를 받아옴//
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
	
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		
		String gender = request.getParameter("gender");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		out.println(userid+","+passwd+","+gender);
		out.close();
	}

}
