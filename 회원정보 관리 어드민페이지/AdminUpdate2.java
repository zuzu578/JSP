package loginform;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
@WebServlet("/AdminUpdate2")
public class AdminUpdate2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	String url;
	String userid;
	String passwd;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpdate2() {
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
			 	String sql3 = "update adminpage set USER_PASSWORD=?,USER_GENDER=?,USER_MOBILE=?,USER_EMAIL=?,USER_NAME=? where USER_ID=?";
			 	//jdbc 드라이버 로딩//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//db연결//
				conn = DriverManager.getConnection(url,userid,passwd);
				  System.out.println("console1");
		    	  System.out.println("console2");
				PreparedStatement ps3 = conn.prepareStatement(sql3);
				  System.out.println("console3");
				String id = request.getParameter("id");
				  System.out.println("console4");
				String password = request.getParameter("password");
				  System.out.println("console5");
				String gender = request.getParameter("gender");
				String mobile = request.getParameter("mobile");
				String email = request.getParameter("email");
				String name = request.getParameter("name");
				  System.out.println("console6");
				ps3.setString(1, password);
				  System.out.println("console7");
				ps3.setString(2, gender);
				  System.out.println("console8");
				ps3.setString(3, mobile);
				System.out.println("console8.1");
				ps3.setString(4, email);
				System.out.println("console8.2");
				ps3.setString(5, name);
				System.out.println("console8.3");
				ps3.setString(6, id);
				  System.out.println("console9");
				ps3.executeUpdate();
				
				
				ps3.close();
				conn.close();





	      
	    	  System.out.println("console10");
			
		}catch(Exception e) {
			System.out.println(e);
			out.println("error");
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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