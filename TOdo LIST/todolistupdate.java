package todolist;
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
@WebServlet("/todolistupdate")
public class todolistupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;


	String url;
	String userid;
	String passwd;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public todolistupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 url = "jdbc:oracle:thin:@localhost:1521:orcl";
		 userid ="system";
		 passwd = "human123";
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet rs = null;
		 PrintWriter out = response.getWriter();
		 try {
			 	String sql3 = "update todolist set todo=? where oldtotdo=?";
			 	//jdbc 드라이버 로딩//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//db연결//
				conn = DriverManager.getConnection(url,userid,passwd);
				  System.out.println("console1");
		    	  System.out.println("console2");
				PreparedStatement ps3 = conn.prepareStatement(sql3);
				  System.out.println("console3");
				String hidden_text = request.getParameter("hidden_text");
				String todo = request.getParameter("todo");
				  System.out.println("console4");
			
				  System.out.println("console5");
				
				  System.out.println("console6");
				ps3.setString(1, todo);
				  System.out.println("console7");
				ps3.setString(2, hidden_text);
				  System.out.println("console8");
				
				  System.out.println("console9");
				ps3.executeUpdate();
				
				
				ps3.close();
				conn.close();





	      
	    	  System.out.println("console10");
			
		}catch(Exception e) {
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