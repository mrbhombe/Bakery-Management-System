/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tables.TblCustomer;

/**
 *
 * @author Mohan
 */
@WebServlet(name = "register_Servlet",urlPatterns = {"/register_Servlet"})
public class register_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    public void init() {
    
    }
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
            
        String name = request.getParameter("cname");
        String email = request.getParameter("cemail");
        String pass = request.getParameter("cpass");
        String addr = request.getParameter("caddr");
        String ccont = request.getParameter("ccont");
         PrintWriter out = response.getWriter();
         
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","");  
            //here sonoo is database name, root is username and password  
           
            Statement stmt=con.createStatement();  
            
            String qry = "insert into tbl_customer(cname,cemail,cpass,caddr,ccont) values('"+name+"','"+email+"','"+pass+"','"+addr+"','"+ccont+"')";
            //out.print(qry);
            int i=stmt.executeUpdate(qry);  
            if(i==0)
            {
                out.print("<script>alert('Sorry ! Registration Not Success')</script>");
                out.print("<script>window.location='registerjsp.jsp'</script>");
           
            }
            else
            {
                out.print("<script>alert('Done ! Registration Success')</script>");
                out.print("<script>window.location='index.html'</script>");
            }
            
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
            
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
