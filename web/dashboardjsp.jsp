<%-- 
    Document   : dashboardjsp
    Created on : 22 Apr, 2020, 6:42:35 PM
    Author     : Mohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
 <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>Bakery</title>

    <!-- Favicon  -->
    <link rel="icon" href="img/core-img/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="css/core-style.css">
    <link rel="stylesheet" href="style.css">

</head>
	
<body>
    <!-- Search Wrapper Area Start -->
    <jsp:include page="headerjsp.jsp" />  
    
        <%
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
       %>
        <!-- Product Catagories Area Start -->
        <div class="products-catagories-area clearfix">
            <div class="amado-pro-catagory clearfix">
            <%
            try{ 
            connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            statement=connection.createStatement();
            String sql ="SELECT * FROM tbl_product";
             if(request.getParameter("search")!=null)
             {
                 sql ="select * from tbl_product where pname like '%"+request.getParameter("search")+"%'";
             }
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                  Blob image = resultSet.getBlob("pimg");
                byte[ ] imgData = null ; 
                imgData = image.getBytes(1,(int)image.length());
                String imgDataBase64=new String(Base64.getEncoder().encode(imgData));
            %>
                
                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix" style="padding:10px">
                    <a href="#">
                        <img src="data:image/gif;base64,<%= imgDataBase64 %>"  alt="Image Not Available">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>From <%=resultSet.getString("pprice") %> </p>
                            <h4><%=resultSet.getString("pname") %></h4>
							<div style="height:20px; width:20px">

							
							<img src="product_image/market.png" title="Add to cart" onClick="myfunc(<%=resultSet.getString("pid") %>)"/>
	
							</div>
                        </div>
                    </a>
                </div>

                                <% 
                            }

                            } catch (Exception e) {
                            e.printStackTrace();
                            }
                            %>
            </div>
        </div>
        <!-- Product Catagories Area End -->
    </div>
    <!-- ##### Main Content Wrapper End ##### -->

    <!-- ##### Newsletter Area Start ##### -->
    <section class="newsletter-area section-padding-100-0">
        <div class="container">
            <div class="row align-items-center">
                <!-- Newsletter Text -->
                <div class="col-12 col-lg-6 col-xl-7">
                    <div class="newsletter-text mb-100">
                        <h2>Subscribe for a <span>25% Discount</span></h2>
                        <p>Nulla ac convallis lorem, eget euismod nisl. Donec in libero sit amet mi vulputate consectetur. Donec auctor interdum purus, ac finibus massa bibendum nec.</p>
                    </div>
                </div>
                <!-- Newsletter Form -->
                <div class="col-12 col-lg-6 col-xl-5">
                    <div class="newsletter-form mb-100">
                        <form action="#" method="post">
                            <input type="email" name="email" class="nl-email" placeholder="Your E-mail">
                            <input type="submit" value="Subscribe">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- ##### Newsletter Area End ##### -->

    <!-- ##### Footer Area Start ##### -->
    <footer class="footer_area clearfix">
        
    </footer>
    <!-- ##### Footer Area End ##### -->

<script>
    

function myfunc(pid) {
	
	var pqty = prompt("Please Enter Quantity:","0");
	 
  
  //document.getElementById("pqty").innerHTML = 0;
  location.replace("addtocart_Servlet?pid="+pid+"&pqty="+pqty);
}
</script>

    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
    <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Plugins js -->
    <script src="js/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>


</body>

</html>
