package web07;
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
@WebServlet("/selectServlet")
public class selectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	String url;
	String userid;
	String passwd;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		 url = "jdbc:oracle:thin:@localhost:1521:orcl";
		 userid ="system";
		 passwd = "human123";
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet rs = null;
		 PrintWriter out = response.getWriter();
		 try {
			String sql = "select employee_id,manager_id,emp_name from employees ";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,userid,passwd);
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			//json 방식//
			JSONArray ja = new JSONArray();
			System.out.println("rs.next");
			while(rs.next()) {
				JSONObject jo = new JSONObject();
				//2개의 값을가져옴//
				//왼쪽은 (ajax에서 일치)키값을 써야함 오른쪽은 sql문의 테이블 레코드이름//
				//String name=rs.getString("emp_name");
				jo.put("emp_name",rs.getString("emp_name"));//json object 만들기//
				jo.put("emp_id", rs.getString("employee_id"));
				jo.put("man_id", rs.getInt("manager_id"));
				//jo.put("hire_date",rs.getDate("hire_date"));
				ja.add(jo);
				System.out.println(rs.getString("emp_name")+","+rs.getInt("employee_id")+","+rs.getInt("manager_id"));
			}
			System.out.println("....");
			out.println(ja.toString());//==>ja의 값을 문자열로.//
			out.close();
			System.out.println(ja.toString());
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