/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohan
 */
public class header_Servlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("\n" +
"<div class=\"search-wrapper section-padding-100\">\n" +
"        <div class=\"search-close\">\n" +
"            <i class=\"fa fa-close\" aria-hidden=\"true\"></i>\n" +
"        </div>\n" +
"        <div class=\"container\">\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-12\">\n" +
"                    <div class=\"search-content\">\n" +
"                        <form action=\"dashBoard.php\" method=\"get\">\n" +
"                            <input type=\"search\" name=\"search\" id=\"search\" placeholder=\"Type your keyword...\">\n" +
"                            <button type=\"submit\"><img src=\"img/core-img/search.png\" alt=\"\"></button>\n" +
"                        </form>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <!-- Search Wrapper Area End -->\n" +
"\n" +
"    <!-- ##### Main Content Wrapper Start ##### -->\n" +
"    <div class=\"main-content-wrapper d-flex clearfix\">\n" +
"\n" +
"        <!-- Mobile Nav (max width 767px)-->\n" +
"        <div class=\"mobile-nav\">\n" +
"            <!-- Navbar Brand -->\n" +
"           \n" +
"            <!-- Navbar Toggler -->\n" +
"            <div class=\"amado-navbar-toggler\">\n" +
"                <span></span><span></span><span></span>\n" +
"            </div>\n" +
"        </div>\n" +
"\n" +
"        <!-- Header Area Start -->\n" +
"        <header class=\"header-area clearfix\">\n" +
"            <!-- Close Icon -->\n" +
"            <div class=\"nav-close\">\n" +
"                <i class=\"fa fa-close\" aria-hidden=\"true\"></i>            </div>\n" +
"            <!-- Logo -->\n" +
"            <!-- Amado Nav -->\n" +
"            <nav class=\"amado-nav\">\n" +
"                <ul>\n" +
"                    <li class=\"active\"><a href=\"dashBoard.php\">Home</a></li>\n" +
"\n" +
"                    <li><a href=\"cart.php\">Cart</a></li>\n" +
"                    <li><a href=\"myOrder.php\">Order</a></li>\n" +
"                  </ul>\n" +
"            </nav>\n" +
"            <!-- Button Group -->\n" +
"            <div class=\"amado-btn-group mt-30 mb-100\">\n" +
"                <a href=\"#\" class=\"btn amado-btn mb-15\">%Discount%</a>\n" +
"                <a href=\"#\" class=\"btn amado-btn active\">New this week</a>\n" +
"            </div>\n" +
"            <!-- Cart Menu -->\n" +
"            <div class=\"cart-fav-search mb-100\">\n" +
"\n" +
"                <a href=\"#\" class=\"search-nav\"><img src=\"img/core-img/search.png\" alt=\"\"> Search</a>\n" +
"				<a href=\"logout.php\" class=\"search-nav\"> logout</a>\n" +
"            </div>\n" +
"            <!-- Social Button -->\n" +
"            <div class=\"social-info d-flex justify-content-between\">\n" +
"                <a href=\"#\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\n" +
"                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n" +
"                <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\n" +
"                <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\n" +
"            </div>\n" +
"        </header>\n" +
"        <!-- Header Area End -->\n" +
"");
        }
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
