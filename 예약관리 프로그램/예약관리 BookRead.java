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
 * Servlet implementation class BookRead
 */
@WebServlet("/BookRead")
public class BookRead extends HttpServlet {
        private static final long serialVersionUID = 1L;
                String url;
                String userid;
                String passwd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookRead() {
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
                ResultSet rs=null;
                PrintWriter out=response.getWriter();
                System.out.println("BookRead_test");
                try {
                        System.out.println("BookRead_start");
                        
                        String book_id=request.getParameter("book_id");
                        System.out.println(book_id);
                        String sql="select * from book where book_id='"+book_id+"'";
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        conn = DriverManager.getConnection(url,userid,passwd);
                        stmt=conn.createStatement();
                        rs=stmt.executeQuery(sql);
                        System.out.println(sql);
                        
                        rs.next();
                        String out_bookId=rs.getString("book_id");
                        System.out.println("book_id ["+out_bookId+"]");
                        String out_roomId=rs.getString("room_id");
                        String out_checkin=rs.getString("checkin");
                        String out_checkout=rs.getString("checkout");
                        String out_howmany=rs.getString("howmany2");
                        String out_expense=rs.getString("expense");
                        String out_name=rs.getString("name");
                        String out_mobile=rs.getString("mobile");
                        
                        System.out.println(out_bookId);
                        System.out.println(out_mobile);
                        
                        JSONObject jo=new JSONObject();
                        
                        jo.put("book_id",out_bookId);
                        jo.put("room_id",out_roomId);
                        jo.put("checkin",out_checkin);
                        jo.put("checkout",out_checkout);
                        jo.put("howmany",out_howmany);
                        jo.put("expense",out_expense);
                        jo.put("name",out_name);
                        jo.put("mobile",out_mobile);
                        JSONArray ja=new JSONArray();
                        ja.add(jo);
                        jo.get("book_id");
                        jo.get("mobile");
                        
                        System.out.println("BookRead_end");
                        
                        out.println(ja.toString());
                        out.close();
                        
                } catch(Exception e){
                        System.out.println(e);
                } finally {
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
