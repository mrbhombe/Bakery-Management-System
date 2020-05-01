package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class dashboardjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("    <!-- Title  -->\n");
      out.write("    <title>Bakery</title>\n");
      out.write("\n");
      out.write("    <!-- Favicon  -->\n");
      out.write("    <link rel=\"icon\" href=\"img/core-img/favicon.ico\">\n");
      out.write("\n");
      out.write("    <!-- Core Style CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/core-style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\t\n");
      out.write("<body>\n");
      out.write("    <!-- Search Wrapper Area Start -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerjsp.jsp", out, false);
      out.write("  \n");
      out.write("    \n");
      out.write("        ");

      // String id = request.getParameter("userId");
       String driverName = "com.mysql.jdbc.Driver";
       String connectionUrl = "jdbc:mysql://localhost:3306/";
       String dbName = "bakery";
       String userId = "root";
       String password = "";

       try {
       Class.forName(driverName);
       } catch (ClassNotFoundException e) {
       e.printStackTrace();
       }

       Connection connection = null;
       Statement statement = null;
       ResultSet resultSet = null;
       
      out.write("\n");
      out.write("        <!-- Product Catagories Area Start -->\n");
      out.write("        <div class=\"products-catagories-area clearfix\">\n");
      out.write("            <div class=\"amado-pro-catagory clearfix\">\n");
      out.write("            ");

            try{ 
            connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            statement=connection.createStatement();
            String sql ="SELECT * FROM tbl_product";

            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
            
      out.write("\n");
      out.write("                <c:forEach var = \"row\" items = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("                <!-- Single Catagory -->\n");
      out.write("                <div class=\"single-products-catagory clearfix\" style=\"padding:10px\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img src=product_image/");
      out.print(resultSet.getString("pimg") );
      out.write("  alt=\"Image Not Available\">\n");
      out.write("                        <!-- Hover Content -->\n");
      out.write("                        <div class=\"hover-content\">\n");
      out.write("                            <div class=\"line\"></div>\n");
      out.write("                            <p>From ");
      out.print(resultSet.getString("pprice") );
      out.write(" </p>\n");
      out.write("                            <h4>");
      out.print(resultSet.getString("pname") );
      out.write("</h4>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"height:20px; width:20px\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<img src=\"product_image/market.png\" title=\"Add to cart\" onClick=\"myfunc(");
      out.print(resultSet.getString("pid") );
      out.write(")\"/>\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                                ");
 
                            }

                            } catch (Exception e) {
                            e.printStackTrace();
                            }
                            
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Product Catagories Area End -->\n");
      out.write("    </div>\n");
      out.write("    <!-- ##### Main Content Wrapper End ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### Newsletter Area Start ##### -->\n");
      out.write("    <section class=\"newsletter-area section-padding-100-0\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row align-items-center\">\n");
      out.write("                <!-- Newsletter Text -->\n");
      out.write("                <div class=\"col-12 col-lg-6 col-xl-7\">\n");
      out.write("                    <div class=\"newsletter-text mb-100\">\n");
      out.write("                        <h2>Subscribe for a <span>25% Discount</span></h2>\n");
      out.write("                        <p>Nulla ac convallis lorem, eget euismod nisl. Donec in libero sit amet mi vulputate consectetur. Donec auctor interdum purus, ac finibus massa bibendum nec.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Newsletter Form -->\n");
      out.write("                <div class=\"col-12 col-lg-6 col-xl-5\">\n");
      out.write("                    <div class=\"newsletter-form mb-100\">\n");
      out.write("                        <form action=\"#\" method=\"post\">\n");
      out.write("                            <input type=\"email\" name=\"email\" class=\"nl-email\" placeholder=\"Your E-mail\">\n");
      out.write("                            <input type=\"submit\" value=\"Subscribe\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- ##### Newsletter Area End ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### Footer Area Start ##### -->\n");
      out.write("    <footer class=\"footer_area clearfix\">\n");
      out.write("        \n");
      out.write("    </footer>\n");
      out.write("    <!-- ##### Footer Area End ##### -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("function myfunc(pid) {\n");
      out.write("\t\n");
      out.write("\tvar pqty = prompt(\"Please Enter Quantity:\",\"0\");\n");
      out.write("\t \n");
      out.write("  \n");
      out.write("  //document.getElementById(\"pqty\").innerHTML = 0;\n");
      out.write("  location.replace(\"addtocart_Servlet?pid=\"+pid+\"&pqty=\"+pqty);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->\n");
      out.write("    <script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\n");
      out.write("    <!-- Popper js -->\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Plugins js -->\n");
      out.write("    <script src=\"js/plugins.js\"></script>\n");
      out.write("    <!-- Active js -->\n");
      out.write("    <script src=\"js/active.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
