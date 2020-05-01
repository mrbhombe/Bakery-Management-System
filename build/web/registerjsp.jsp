<%-- 
    Document   : registerjsp
    Created on : 20 Apr, 2020, 6:05:14 PM
    Author     : Mohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
    </head>
    	<div class="container-login100" style="color:">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30" style="height:650px;width:600px">
                    <form class="login100-form validate-form" action="register_Servlet" method="post" >
				<span class="login100-form-title p-b-37" >
					Registration
				</span>

				<div class="wrap-input100 validate-input m-b-20" >
					<input class="input100" type="text" name="cname" placeholder="Full Name" required>
					<span class="focus-input100"></span>
				</div>

		<div class="wrap-input100 validate-input m-b-20" data-validate="E-mail">
					<input class="input100" type="email" name="cemail" placeholder="E-mail" required>
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 validate-input m-b-25" data-validate = "Enter password">
					<input class="input100" type="password" name="cpass" placeholder="password" required>
					<span class="focus-input100"></span>
				</div>

		<div class="wrap-input100 validate-input m-b-20">
					<input class="input100" type="text" name="caddr" placeholder="Address" required>
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input m-b-20" >
					<input class="input100" type="text" name="ccont" placeholder="Contact" required>
					<span class="focus-input100"></span>
				</div>

				<div class="container-login100-form-btn" ">
					
					<button class="login100-form-btn" style="background-color:#FFCC00" name="submit">
						Sign up
					</button>
				</div>


			</form>
		
		</div>
	</div>
	

			
		</div>
	</div>
	</div>
	
	<div id="dropDownSelect1"></div>
	
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="vendor/select2/select2.min.js"></script>
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
	<script src="vendor/countdowntime/countdowntime.js"></script>
	<script src="js/main.js"></script>

</body>

</html>
