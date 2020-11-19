package web08;

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
 * Servlet implementation class BookList
 */
@WebServlet("/BookList")
public class BookList extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
                String url;
                String userid;
                String passwd;
        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookList() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                url="jdbc:oracle:thin:@localhost:1521:orcl";
                userid="system";
                passwd="human123";
                Connection conn=null;
                Statement stmt=null;
                Statement stmt2=null;
                ResultSet rs=null;
                ResultSet rs2=null;
                PrintWriter out=response.getWriter();
                
                try {
                        System.out.println("BookList_start");
                        String rooms=request.getParameter("rooms");
                        System.out.println("rooms : "+rooms);
                        String inText=request.getParameter("checkin");
                        String outText=request.getParameter("checkout");
                        int checkinText=Integer.parseInt(inText);
                        int checkoutText=Integer.parseInt(outText);
                
                        String sql="select * from book "
                                           + "where TO_NUMBER(checkin) between "+checkinText+" and "+checkoutText+" or To_NUMBER(checkout) between "+checkinText+" and "+checkoutText;
                        String sql2="select room_name from room where room_type='"+rooms+"' and room_id in"
                                        + "(select room_id from book "
                                        + "where TO_NUMBER(checkin) between "+checkinText+" and "+checkoutText+" or To_NUMBER(checkout) between "+checkinText+" and "+checkoutText+")";
                        System.out.println(sql);
                        System.out.println(sql2);
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        conn = DriverManager.getConnection(url,userid,passwd);
                        stmt=conn.createStatement();
                        stmt2=conn.createStatement();
                        rs=stmt.executeQuery(sql);
                        rs2=stmt2.executeQuery(sql2);
                        JSONArray ja=new JSONArray();
                        while(rs.next() && rs2.next()) {
                                JSONObject jo=new JSONObject();
                                jo.put("room_name", rs2.getString("room_name"));
                                jo.put("book_id", rs.getString("book_id"));
                                System.out.println("list book_id: "+rs.getString("book_id"));
                                jo.put("room_id", rs.getString("room_id"));
                                jo.put("checkin", rs.getString("checkin"));
                                jo.put("checkout", rs.getString("checkout"));
                                jo.put("howmany2", rs.getString("howmany2"));
                                jo.put("expense", rs.getString("expense"));
                                jo.put("name", rs.getString("name"));
                                jo.put("mobile", rs.getString("mobile"));
                                jo.put("book_dt", rs.getString("book_dt"));
                                ja.add(jo);
                        }
                        
                        System.out.println("BookList_end");
                        out.println(ja.toString());
                        
                        out.close();
                        
                } catch(Exception e){
                        System.out.println(e);
                } finally {
                        try {
                                rs2.close();
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
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
