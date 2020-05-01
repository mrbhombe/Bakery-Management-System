/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "login_Servlet",urlPatterns = {"/login_Servlet"})
public class login_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        user u = new user();
       String uname,pass;
       uname = request.getParameter("username");
       pass = request.getParameter("pass");
         PrintWriter out = response.getWriter();
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","");  
            //here sonoo is database name, root is username and password  
           
            Statement stmt=con.createStatement();  
            
            String qry = "select * from tbl_customer where cemail = '"+uname+"' and cpass = '"+pass+"'";
            //out.print(qry);
            ResultSet result = stmt.executeQuery(qry);  
            int i=0;
            while(result.next())
            {
                
                u.setid(result.getString("cid"));
                u.setname(result.getString("cname"));
                    HttpSession session = request.getSession();
                    if(session.getAttribute("cid")!=null && session.getAttribute("cid")!="")
                    {session.setAttribute("cid", result.getString("cid"));}
                    else
                    {
                     session.setAttribute("cid","" );   
                     
                     
                    }
                      out.print("<script>window.location='dashboardjsp.jsp'</script>");
                      i=1;
                }
                if(i==0)
                {
                    out.print("<script>alert('Sorry ! Invalid Email or Password')</script>");
                   out.print("<script>window.location='index.jsp'</script>");
                }
        con.close();      
        } catch (SQLException ex) {
            Logger.getLogger(login_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            catch(Exception e){ System.out.println(e);}  
    }
       
    

 
}
