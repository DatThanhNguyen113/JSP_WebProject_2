<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<div id="top-header">
				<div class="container">
					<ul class="header-links pull-left">
						<li><a href="#"><i class="fa fa-phone"></i> +021-95-51-84</a></li>
						<li><a href="#"><i class="fa fa-envelope-o"></i> email@email.com</a></li>
						<li><a href="#"><i class="fa fa-map-marker"></i> 1734 Stonecoal Road</a></li>
					</ul>
					<ul class="header-links pull-right">
						<%
							String userName = "";
							userName = (String)request.getAttribute("mUserName");
							if(userName != null && userName.length() > 0){														
						%>
						<li><a><i class="fa fa-user-o"></i><%=userName%></li>
						<li><a href='login'><i class="fa fa-user-o"></i>LogOut</a></li>
						<%
							}else{
						%>
						<li><a href='login'><i class="fa fa-user-o"></i>Login</a></li>
						
						<%
							}
						%>
					</ul>
				</div>
			</div>
</body>
</html>