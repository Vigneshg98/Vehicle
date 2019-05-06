<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<link rel='stylesheet'
	href='https://use.fontawesome.com/releases/v5.5.0/css/all.css'
	integrity='sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU'
	crossorigin='anonymous'>


<link rel="stylesheet" href="styleFile.css">
<title>Reset</title>
</head>

<body style="font-family: Gill Sans Extrabold, sans-serif;">
	<nav class="navbar navbar-expand-md navbar-dark"
		style="font-family: cursive; background-color:#000000; border-style:solid; border-bottom-color:white; border-right-color:black; border-top-color:black; border-left-color:black;">
	<a class="navbar-brand" href="#" style="color: #ff0047;"><span>
			<b>Vehicle Store</b>
	</span> </a>
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
				href="${pageContext.request.contextPath}/logout"
				style="color: white;">Logout</a></li>
		</ul>
	</div>
	</nav>
	<br>
	<div class="container">
		<br>
		<ul class="nav nav-tabs" role="tablist">
			<li class="nav-item"><a class="nav-link active"
				data-toggle="tab" href="#userLogin">Reset Password</a></li>
		</ul>
		<div class="tab-content">
			<div id="userLogin" class="container tab-pane active">
				<br>
				<main class="login-form">
				<div class="cotainer">
					<div class="row justify-content-center">
						<div class="col-lg-6 col-md-12 col-sm-6 col-xs-12">
							<div class="card">
								<div class="card-header">
									<strong>Reset Password</strong>
								</div>
								<div class="card-body">
									<form:form action="resetPass" method="post"
										modelAttribute="userRegister">
										<div class="form-group row">
											<label for="userName"
												class="col-md-4 col-form-label text-md-right">Username</label>
											<div class="col-md-6">
												<input type="text" id="userName" class="form-control"
													name="userName" value="${user}" required>
											</div>
										</div>
										<div class="form-group row">
											<label for="userEmail"
												class="col-md-4 col-form-label text-md-right">Email</label>
											<div class="col-md-6">
												<input type="text" id="userEmail" class="form-control"
													name="userEmail" value="${email}" required>
											</div>
										</div>
										<div class="form-group row">
											<label for="userPass"
												class="col-md-4 col-form-label text-md-right">New Password</label>
											<div class="col-md-6">
												<input type="password" id="userPass" class="form-control"
													name="userPass" required autofocus>
											</div>
										</div>
										<div class="col-md-6 offset-md-4">
											<button type="submit" class="btn btn-success">Submit</button>
											<br><br><h6 style="color:red;">${message}</h6>
										</div>
								</div>
								</form:form>
							</div>
						</div>
					</div>
				</div>
				</main>
			</div>
	
</body>

</html>