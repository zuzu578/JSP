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
 * Servlet implementation class ConfirmList
 */
@WebServlet("/ConfirmList")
public class ConfirmList extends HttpServlet {
        private static final long serialVersionUID = 1L;
    
        String url;
        String userid;
        String passwd;
        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmList() {
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
                ResultSet rs2=null;
                PrintWriter out=response.getWriter();
                
                try {
                        System.out.println("ConfirmList_start");
//                        System.out.println("test");
                        String rooms=request.getParameter("rooms");
//                        System.out.println("rooms : "+rooms);
                        String inText=request.getParameter("checkin");
                        String outText=request.getParameter("checkout");
                        int checkinText=Integer.parseInt(inText);
                        int checkoutText=Integer.parseInt(outText);
                        
                        String sql="select * from room where room_type='"+rooms+"' and room_id "
                                        + "not in "
                                        + "(select room_id from book "
                                        + "where TO_NUMBER(checkin) between "+checkinText+" and "+checkoutText+" or To_NUMBER(checkout) between "+checkinText+" and "+checkoutText+")";
//                        System.out.println(sql);
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        conn = DriverManager.getConnection(url,userid,passwd);
                        stmt=conn.createStatement();
                        rs=stmt.executeQuery(sql);
                        JSONArray ja=new JSONArray();
                        while(rs.next()) {
                                JSONObject jo=new JSONObject();
                                jo.put("room_id", rs.getString("room_id"));
                                jo.put("room_name", rs.getString("room_name"));  // json object ¸¸µé±â
                                jo.put("howmany", rs.getString("howmany1"));
                                jo.put("howmuch", rs.getString("howmuch"));
                                ja.add(jo);
                        }
                        System.out.println("ConfirmList_end");
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
