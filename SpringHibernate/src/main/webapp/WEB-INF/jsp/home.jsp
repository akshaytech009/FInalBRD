<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<title>Home page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">UserDetails</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="addCustomer" target="iframe_b">New</a></li>
			<li class="active"><a href="update" target="iframe_b">Update</a></li>

			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">View<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="viewCustomer" target="iframe_b">SingleView</a></li>
					<li><a href="viewall" target="iframe_b">All</a></li>

				</ul></li>
			<li><a href="deleteCustomer" target="iframe_b">Delete</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">

			<li><a href="LogOutController"><span
					class="glyphicon glyphicon-log-in"></span> LogOut</a></li>
		</ul>
	</div>
	</nav> 

	
	<div class="container"></div>

</body>
</html>
