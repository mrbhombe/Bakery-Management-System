package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class cartjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("    <!-- Title  -->\n");
      out.write("    <title>Amado </title>\n");
      out.write("\n");
      out.write("    <!-- Favicon  -->\n");
      out.write("    <link rel=\"icon\" href=\"img/core-img/favicon.ico\">\n");
      out.write("\n");
      out.write("    <!-- Core Style CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/core-style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerjsp.jsp", out, false);
      out.write("  \n");
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
      out.write("        <div class=\"cart-table-area section-padding-100\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 col-lg-8\">\n");
      out.write("                        <div class=\"cart-title mt-50\">\n");
      out.write("                            <h2>Shopping Cart</h2>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"cart-table clearfix\">\n");
      out.write("                            <table class=\"table table-responsive\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th></th>\n");
      out.write("                                        <th>Name</th>\n");
      out.write("                                        <th>Price</th>\n");
      out.write("                                        <th>Quantity</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");

            int i=0;
                         try{ 
            String id="";
            String pid="";
                     
            id = session.getAttribute("cid").toString();
            
            connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            statement=connection.createStatement();
            String sql ="SELECT * FROM tbl_cart where cid = "+id;
                
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Statement statement1 = null;
                ResultSet resultSet1 = null;
                pid=resultSet.getString("pid");
                i=1;
                String sql1 ="Select * from tbl_product where pid ="+pid;
            	statement1=connection.createStatement();
            	resultSet1 = statement1.executeQuery(sql1);	
				resultSet1.next()	;				
                                    
      out.write("\n");
      out.write("                                                                                <tr>\n");
      out.write("                                        <td class=\"cart_product_img\">\n");
      out.write("                                            <a href=\"#\"><img src=product_image/");
      out.print(resultSet1.getString("pimg") );
      out.write(" alt=\"Product\"></a>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"cart_product_desc\">\n");
      out.write("                                            <h5>");
      out.print(resultSet1.getString("pname") );
      out.write("</h5>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"price\">\n");
      out.write("                                            <span>");
      out.print(resultSet1.getString("pprice") );
      out.write("</span>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"qty\">\n");
      out.write("                                            <div class=\"qty-btn d-flex\" style=\"padding:5px\">\n");
      out.write("\n");
      out.write("                                                <span style=\"padding:15px\">");
      out.print(resultSet.getString("pqty") );
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<button style=\"padding:5px; background:#FFCC00;color:#FFFFFF;border:none\" onClick=\"myfun(");
      out.print(resultSet1.getString("pid") );
      out.write(")\">Remove</button>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    </tr>\n");
      out.write("\t\t  ");
 
                            }

                            } catch (Exception e) {
                            e.printStackTrace();
                            }
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
 if (i==0)
                                    {
                                        out.print("Add Item First");
                                    }
                                    
                                    
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("     <div class=\"cart-btn mt-100\">\n");
      out.write("          ");
 if (i==1)
                                    {
                                      
                                    
                                    
                                    
      out.write("\n");
      out.write("                                <form action=\"orderjsp.jsp\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Checkout\" style=\"padding:10px; background:#FFCC00;color:#FFFFFF;border:none\">\n");
      out.write("\t\t\t\t\t\t\t\t</form>");
 } 
      out.write("\n");
      out.write("                            </div>                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("    <!-- ##### Main Content Wrapper End ##### -->\n");
      out.write("\t<!-- ##### Newsletter Area Start ##### -->\n");
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
      out.write("<script>\n");
      out.write("function myfun(pid)\n");
      out.write("{\n");
      out.write("  location.replace(\"deleteProduct?pid=\"+pid);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
