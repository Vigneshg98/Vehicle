<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="java.util.*,com.vehicle.model.Vehicle"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<link rel='stylesheet'
	href='https://use.fontawesome.com/releases/v5.5.0/css/all.css'
	integrity='sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU'
	crossorigin='anonymous'>
<title>Remove Vehicle</title>
</head>
<body style="font-family: Gill Sans Extrabold, sans-serif;">
	<nav class="navbar navbar-expand-md navbar-dark"
		style="font-family: cursive; background-color:#000000; border-style:solid; border-bottom-color:white; border-right-color:black; border-top-color:black; border-left-color:black;">
	<a class="navbar-brand" href="#" style="color: #ff0047;"> <span>
			<b>Vehicle Store</b>
	</span>
	</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#collapsibleNavbar">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="collapsibleNavbar">
		<ul class="navbar-nav ml-auto">
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/userLanding"
				style="color: white;">Home</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/addVehicle"
				style="color: white;">AddVehicle</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/logout"
				style="color: white;">Logout</a></li>
		</ul>
	</div>
	</nav>
	<br>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Vehicle Name</th>
					<th>Price</th>
					<th>Brand</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${vehicle}" var="s1">

					<c:url value="/delete" var="url">
						<c:param name="userId" value="${s1.zId }">
						</c:param>
					</c:url>

					<tr>
						<td>${s1.zName }</td>
						<td>${s1.zPrice }</td>
						<td>${s1.zBrand }</td>
						<td><a href="${url}">
								<button type="submit" class="btn btn-danger">Delete</button>
						</a></td>

					</tr>

				</c:forEach>



			</tbody>
		</table>
	</div>

</body>

</html>