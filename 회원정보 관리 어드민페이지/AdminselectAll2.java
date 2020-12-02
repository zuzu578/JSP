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

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class selectServlet
 */
@WebServlet("/AdminselectAll2")
public class AdminselectAll2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	String url;
	String userid;
	String passwd;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminselectAll2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 url = "jdbc:oracle:thin:@localhost:1521:orcl";
		 userid ="system";
		 passwd = "human123";
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet rs = null;
		 PrintWriter out = response.getWriter();
		 try {
			String sql = "select USER_ID,USER_PASSWORD,USER_GENDER,USER_MOBILE,USER_EMAIL,USER_NAME from adminpage";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,userid,passwd);
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			//json 방식//
			JSONArray ja = new JSONArray();
			System.out.println("debug0");
			System.out.println("rs.next");
			while(rs.next()) {
				JSONObject jo = new JSONObject();
				System.out.println("debug1");
				//2개의 값을가져옴//
				//왼쪽은 (ajax에서 일치)키값을 써야함 오른쪽은 sql문의 테이블 레코드이름//
				//String name=rs.getString("emp_name");
				jo.put("ID",rs.getString("USER_ID"));
				jo.put("PWD",rs.getString("USER_PASSWORD"));
				jo.put("Gender",rs.getString("USER_GENDER"));//json object 만들기//
				System.out.println("debug2");
				jo.put("Mobile", rs.getString("USER_MOBILE"));
				System.out.println("debug3");
				jo.put("Email", rs.getString("USER_EMAIL"));
				jo.put("Name", rs.getString("USER_NAME"));
		
				System.out.println("debug4");
				//jo.put("hire_date",rs.getDate("hire_date"));
				ja.add(jo);
				System.out.println("debug5");
				System.out.println(rs.getString("USER_ID")+","+rs.getString("USER_PASSWORD")+","+rs.getString("USER_GENDER")+","+rs.getString("USER_MOBILE")+","+rs.getString("USER_EMAIL")+","+rs.getString("USER_NAME"));
				System.out.println("debug6");
			}
			System.out.println("....");
			System.out.println("debug7");
			out.println(ja.toString());//==>ja의 값을 문자열로.//
			System.out.println("debug8");
			out.close();
			System.out.println(ja.toString());
			System.out.println("debug9");
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
		
	}

}