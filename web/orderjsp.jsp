<%-- 
    Document   : orderjsp
    Created on : 23 Apr, 2020, 5:16:59 PM
    Author     : Mohan
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
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
      // String id = request.getParameter("userId");
       String driverName = "com.mysql.jdbc.Driver";
       String connectionUrl = "jdbc:mysql://localhost:3306/";
       String dbName = "bakery";
       String userId = "root";
       String password = "";
String id="";
            String pid="";
            int amount = 0,finalamt=0;
                     
            id = session.getAttribute("cid").toString();
            
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
                            <h2>Checkout</h2>
                        </div>
                    </div>
                       <%
            int i=0;
                         try{ 
            
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
				resultSet1.next();
                                amount = amount + (Integer.parseInt(resultSet1.getString("pprice")) * Integer.parseInt(resultSet.getString("pqty")));
            }        %>
										
									
                                
					
					
                    <div class="col-12 col-lg-4" style="position:absolute">
                        <div class="cart-summary">
                            <h5>Cart Total</h5>
                            <ul class="summary-table">
                                <li><span>subtotal:</span> <span><% out.print(amount); %></span></li>
                                <li><span>delivery:</span> <span>70</span></li>
                                <li><span>total:</span> <span><%  
                                        finalamt = amount + 70 ; 
                                        out.print(finalamt);%></span></li>
                            </ul>
                            
                            <div class="cart-btn mt-100">
                                <a href="doneorderjsp.jsp" class="btn amado-btn w-100">Checkout</a>
                            </div>
                            <% 
                            

                            } catch (Exception e) {
                            e.printStackTrace();
                            }
                            %>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ##### Main Content Wrapper End ##### -->
     <%
         Date dNow = new Date();
         SimpleDateFormat ft = 
         new SimpleDateFormat ("yyyy-MM-dd");
         String datecur =  ft.format(dNow).toString() ;
         Statement statementn = null;
         statementn = connection.createStatement();
         String sqln = "insert into tbl_order(cid,delivered,amount,date) values('"+id+"',0,'"+finalamt+"','"+datecur+"')" ;
         statementn.executeUpdate(sqln);
     %>
	
	
?>
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

</body>

</html>