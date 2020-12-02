package loginform;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class selectServlet
 */
@WebServlet("/adminAllselect")
public class adminAllselect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	String url;
	String userid;
	String passwd;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminAllselect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 url = "jdbc:oracle:thin:@localhost:1521:orcl";
		 userid ="system";
		 passwd = "human123";
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet rs = null;
		 PrintWriter out = response.getWriter();
		 try {
			 String id=request.getParameter("id");
			
			String sql = "select count(*) cnt from adminpage where user_id='"+id+"'";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,userid,passwd);
			System.out.println("console1");
			System.out.println(sql);
			stmt = conn.createStatement();
			System.out.println("console2");
			rs=stmt.executeQuery(sql);
			System.out.println("console3");
			String str = "";
			rs.next();
			System.out.println("console4");
			//int id=rs.getInt("id");
			System.out.println("console5");
			int cnt=rs.getInt("cnt");
			out.print(cnt);
			System.out.println(cnt);
				out.close();
			

			
			//out.println("<script>alert('중복된 아이디가 있습니다'); history.back();</script>");
			System.out.println("console7");
			
			System.out.println("console8");
		}catch(Exception e) {
			System.out.println(e);
			out.println("error");
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}