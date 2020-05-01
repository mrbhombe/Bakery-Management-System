package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headerjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"search-wrapper section-padding-100\">\n");
      out.write("        <div class=\"search-close\">\n");
      out.write("            <i class=\"fa fa-close\" aria-hidden=\"true\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <div class=\"search-content\">\n");
      out.write("                        <form action=\"dashBoard.php\" method=\"get\">\n");
      out.write("                            <input type=\"search\" name=\"search\" id=\"search\" placeholder=\"Type your keyword...\">\n");
      out.write("                            <button type=\"submit\"><img src=\"img/core-img/search.png\" alt=\"\"></button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Search Wrapper Area End -->\n");
      out.write("\n");
      out.write("    <!-- ##### Main Content Wrapper Start ##### -->\n");
      out.write("    <div class=\"main-content-wrapper d-flex clearfix\">\n");
      out.write("\n");
      out.write("        <!-- Mobile Nav (max width 767px)-->\n");
      out.write("        <div class=\"mobile-nav\">\n");
      out.write("            <!-- Navbar Brand -->\n");
      out.write("           \n");
      out.write("            <!-- Navbar Toggler -->\n");
      out.write("            <div class=\"amado-navbar-toggler\">\n");
      out.write("                <span></span><span></span><span></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Header Area Start -->\n");
      out.write("        <header class=\"header-area clearfix\">\n");
      out.write("            <!-- Close Icon -->\n");
      out.write("            <div class=\"nav-close\">\n");
      out.write("                <i class=\"fa fa-close\" aria-hidden=\"true\"></i>            </div>\n");
      out.write("            <!-- Logo -->\n");
      out.write("            <!-- Amado Nav -->\n");
      out.write("            <nav class=\"amado-nav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"dashBoard.php\">Home</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"cart.php\">Cart</a></li>\n");
      out.write("                    <li><a href=\"myOrder.php\">Order</a></li>\n");
      out.write("                  </ul>\n");
      out.write("            </nav>\n");
      out.write("            <!-- Button Group -->\n");
      out.write("            <div class=\"amado-btn-group mt-30 mb-100\">\n");
      out.write("                <a href=\"#\" class=\"btn amado-btn mb-15\">%Discount%</a>\n");
      out.write("                <a href=\"#\" class=\"btn amado-btn active\">New this week</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Cart Menu -->\n");
      out.write("            <div class=\"cart-fav-search mb-100\">\n");
      out.write("\n");
      out.write("                <a href=\"#\" class=\"search-nav\"><img src=\"img/core-img/search.png\" alt=\"\"> Search</a>\n");
      out.write("\t\t\t\t<a href=\"logout.php\" class=\"search-nav\"> logout</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Social Button -->\n");
      out.write("            <div class=\"social-info d-flex justify-content-between\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- Header Area End -->\n");
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
