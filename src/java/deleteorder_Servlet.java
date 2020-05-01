/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mohan
 */
@WebServlet(name = "deleteorder_Servlet",urlPatterns = {"/deleteorder_Servlet"})
public class deleteorder_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id="";
        
        String oid = request.getParameter("oid");
        
        
            PrintWriter out = response.getWriter();
            HttpSession session = request.getSession();
            id = session.getAttribute("cid").toString();
            
            
             try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","");  
            //here sonoo is database name, root is username and password  
           
            Statement stmt=con.createStatement();  
            Statement stmt1=con.createStatement();  
            
            String qry = "delete from tbl_order_list where oid = "+oid;
           // out.print(qry);
            int i=stmt.executeUpdate(qry);  
            if(i==1)
            {
                  
                out.print("<script>alert('Sorry ! There is problem')</script>");
                out.print("<script>window.location='index.jsp'</script>");
           
            }
            else
            {
                qry = "delete from tbl_order where oid = "+oid;
                stmt1.executeUpdate(qry);
                out.print("<script>alert('Done ! Order Cancel Successfully')</script>");
                out.print("<script>window.location='myorderjsp.jsp'</script>");
            }
            
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
       
        
    }

    

}
