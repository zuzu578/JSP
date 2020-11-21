package todolist;
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
@WebServlet("/selecttodoid")
public class selecttodoid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	String url;
	String userid;
	String passwd;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selecttodoid() {
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
			String sql = "select MY_SEQ1.nextval from dual";
			System.out.println("console1");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,userid,passwd);
			System.out.println("console2");
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			String str = "";//John,Smith,....,JaneÀ¸·Î º¸³»±â"//
			while(rs.next()) {
				if(!str.equals("")) str+=",";
				System.out.println("console3");
				System.out.println(str);
				str+=rs.getString("NEXTVAL");
				System.out.println(str);
				System.out.println("console4");
				
			}
			//1¹ø¸¸ str Ãâ·Â//
			out.println(str);//john, smith ,...,jane"//
			out.close();
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