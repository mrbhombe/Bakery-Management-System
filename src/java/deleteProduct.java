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
@WebServlet(name = "deleteProduct",urlPatterns = {"/deleteProduct"})
public class deleteProduct extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         String id="";
          PrintWriter out = response.getWriter();
        String pid = request.getParameter("pid");
          HttpSession session = request.getSession();
            id = session.getAttribute("cid").toString();
              try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","");  
            //here sonoo is database name, root is username and password  
           
            Statement stmt=con.createStatement();  
            
            String qry = "delete from tbl_cart where pid = '"+pid+"' and cid = '"+id+"' ";
            //out.print(qry);
            int i=stmt.executeUpdate(qry);  
            if(i==0)
            {
                out.print("<script>alert('Sorry ! There is problem Try Again')</script>");
                out.print("<script>window.location='index.jsp'</script>");
           
            }
            else
            {
                out.print("<script>alert('Done ! Item Remove Successfully')</script>");
                out.print("<script>window.location='cartjsp.jsp'</script>");
            }
            
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
       
    }

}
