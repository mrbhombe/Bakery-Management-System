<%-- 
    Document   : doneorderjsp
    Created on : 23 Apr, 2020, 5:34:31 PM
    Author     : Mohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
       Statement statement1 = null;
       Statement statement2 = null;
       Statement statement3 = null;
       ResultSet resultSet = null;
       ResultSet resultSet1 = null;
       
       String id="",oid="";
       id = session.getAttribute("cid").toString();
       
            connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            statement=connection.createStatement();
            statement1=connection.createStatement();
            statement2=connection.createStatement();
            statement3=connection.createStatement();
            
            
            String sql ="SELECT * FROM tbl_order where cid = "+id+" ORDER BY oid DESC LIMIT 1 ";
            String sql2 ="select * from tbl_cart where cid = "+id;
            
                
            resultSet = statement.executeQuery(sql);
            resultSet.next();
            oid = resultSet.getString("oid");
           
           resultSet1 = statement1.executeQuery(sql2);
           while(resultSet1.next()){
           String pid=resultSet1.getString("pid");
           String qty=resultSet1.getString("pqty");
           String sql3 ="insert into tbl_order_list(pid,qty,oid) values("+pid+","+qty+","+oid+")";
          
           statement2.executeUpdate(sql3);  
           }
           String sql4="delete from tbl_cart where cid = "+id;
             statement3.executeUpdate(sql4);  
            out.print("<script>alert('Done ! Order Placed Succefully')</script>");
          out.print("<script>window.location='dashboardjsp.jsp'</script>"); 
        %>
	
	
	
	
    </body>
</html>
