package Web01;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class AdittionServlet
 */
@WebServlet("/AdittionServlet")
public class AdittionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdittionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //doget은 리턴값이없다 (void이기때문)//
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//이러한것은 Get 방식이다//
		int num1 = 20;
		int num2 = 10;
		int add = num1+num2;
		//자바에서 코딩한내용을 웹브라우저에 출력하기위한 키워드
		PrintWriter out=response.getWriter();
		//웹서버에서 이러한 내용을 날려준다.//
		
		out.println("<html><head><title>Addition</title></head>");
		out.println("<body>");
		out.println(add);
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}