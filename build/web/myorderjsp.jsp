<%-- 
    Document   : myorderjsp.jsp
    Created on : 24 Apr, 2020, 7:59:52 PM
    Author     : Mohan
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>Amado </title>

    <!-- Favicon  -->
    <link rel="icon" href="img/core-img/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="css/core-style.css">
    <link rel="stylesheet" href="style.css">

</head>

<body>
        <jsp:include page="headerjsp.jsp" />  
        <%
       //String id = request.getParameter("userId");
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
        <div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-lg-8">
                        <div class="cart-title mt-50">
                            <h2>My Order</h2>
                        </div>

                        <div class="cart-table clearfix">
                            <table class="table table-responsive">
                                <thead>
                                    <tr>
                                        <th>Amount</th>
                                        <th>Date</th>
					<th style="margin-left:80px">Action</th>
										
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
            int i=0;
            String id="";
            String oid="";
            String pid="";
                     
            id = session.getAttribute("cid").toString();
           
            try{ 
            
            
            connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            statement=connection.createStatement();
            String sql ="Select * from tbl_order where cid = '"+id+"' ORDER BY oid DESC";
                
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                oid= resultSet.getString("oid");
                i=1;
                                    %>
                                    <tr>
                                        <td class="cart_product_desc">
                                            <h5><%=resultSet.getString("amount") %></h5>
                                        </td>
                                        <td class="price">
                                            <span><%=resultSet.getString("date") %></span>
                                        </td>
                                        <td class="qty">
                                            <div class="qty-btn d-flex" style="padding:5px">

                                                <span style="padding:15px"></span>
												
&nbsp;&nbsp;
										<button style="padding:5px; background:#FFCC00;color:#FFFFFF;border:none" onClick="myfun(<% out.print(oid); %>)">Summary</button>
&nbsp;&nbsp;
										<button style="padding:5px; background:#FFCC00;color:#FFFFFF;border:none" onClick="myfun2(<% out.print(oid); %>)">Cancel</button>
            		                            
										</td>
									
                                    </tr>
										<% 
                            }

                            } catch (Exception e) {
                            e.printStackTrace();
                            }
                            %>
                  
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
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
<script>
function myfun(oid)
{
  location.replace("ordersummaryjsp.jsp?oid="+oid);
}

function myfun2(oid)
{
  var x = confirm("Are you sure to cancel the order");
  if (x == true) {
  location.replace("deleteorder_Servlet?oid="+oid);
  }
}

</script>
</body>

</html>