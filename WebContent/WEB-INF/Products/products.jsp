<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="Style/bootstrap.min.css"/>

	<!-- Slick -->
	<link type="text/css" rel="stylesheet" href="Style/slick.css"/>
	<link type="text/css" rel="stylesheet" href="Style/slick-theme.css"/>

	<!-- nouislider -->
	<link type="text/css" rel="stylesheet" href="Style/nouislider.min.css"/>

	<!-- Font Awesome Icon -->
	<link rel="stylesheet" href="Style/font-awesome.min.css">

		<!-- Custom stlylesheet -->
		<link type="text/css" rel="stylesheet" href="Style/style.css"/>
</head>
<body>
		<header>
			<!-- TOP HEADER -->
			
			<jsp:include page="/WEB-INF/Home/Home-Content.jsp" />
			
			<!-- /TOP HEADER -->
			
			<!-- MAIN HEADER -->
			<jsp:include page="/WEB-INF/Home/Home-MainHeader.jsp" />
			<!-- /MAIN HEADER -->
		</header>
		<!-- /HEADER -->
		
		<!-- NAVIGATION -->		
		<jsp:include page="/WEB-INF/Home/Home-Navigation.jsp"></jsp:include>		
		<!-- /NAVIGATION -->
		
		<c:forEach items="listProducts" var="item">
			<div>
				<img src='<c:out value="${item.image }"></c:out>' />
				<h3>Ten San Pham : (${item.productName}) </h3>
				<h5>Gia : (${item.price})</h5>
			</div>
		</c:forEach>
</body>
</html>