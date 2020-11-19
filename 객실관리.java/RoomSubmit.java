package web08;

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
@WebServlet("/RoomSubmit")
public class RoomSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;


	String url;
	String userid;
	String passwd;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomSubmit() {
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
		 Statement stmt2=null;
		 ResultSet rs = null;
		 ResultSet rs2=null;
		 PrintWriter out = response.getWriter();
		 try {
			  System.out.println("console1");
			  String sql2="select roomid.nextval room_id from dual";
	    	  String sql1 = "insert into room values (?,?,?,?,?)";
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  conn = DriverManager.getConnection(url,userid,passwd);
	    	  System.out.println("console2");
	    	  stmt2=conn.createStatement();
	    	  rs2=stmt2.executeQuery(sql2);
	    	  PreparedStatement ps1 = conn.prepareStatement(sql1);
	    	  System.out.println("console3");
	    	  rs2.next();
//	    	  String roomid = request.getParameter("roomid");
	    	  String roomid=rs2.getString("room_id");
	    	  String roomname = request.getParameter("roomname");
	    	  String roomitem2= request.getParameter("roomitem2");
	    	  System.out.println(roomitem2);
	    	  String roomexpense = request.getParameter("roomexpense");
	    	  String person = request.getParameter("person");
	    	  System.out.println("console4");
	    		  ps1.setString(1, roomid);
	    		  ps1.setString(2, roomname);
	    		  ps1.setString(3, roomitem2);
	    		  ps1.setString(4, roomexpense);	
	    		  ps1.setString(5, person);
	    		  
	    		  System.out.println("console5");
	    		  ps1.executeUpdate();
	    		  System.out.println("console6");
	        	  
	        	  System.out.println("console7");
	    		  
	    		  
	    	  String txt="<option value='"+roomid+"'><table><tr><td>"+roomname+"</td><td>"+roomitem2+"</td><td>"+roomexpense+"</td><td>"+person+"</td></tr></table></option>";
	    	  
	    	  out.println(txt);
	    	  ps1.close();
	    	  //DB¥›æ∆¡‹//
	    	  conn.close();
	      
	    	  System.out.println("console8");
			
		}catch(Exception e) {
			System.out.println(e);
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