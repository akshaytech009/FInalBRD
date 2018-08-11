<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>View</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"
	type="text/javascript"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" type="text/javascript"></script>
</head>
<script type="text/javascript">
	window.history.forward();
	function noBack() {
		window.history.forward();
	}
</script>
<script type="text/javascript">
 	function autoRefreshPage() 
 	{
 		window.location=window.location.href;
 	} 
 	setInterval("autoRefreshPage()", 10000);
</script>
<!-- <nav class="navbar navbar-inverse">
<div class="container-fluid">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">UserDetails</a>
	</div>
	<ul class="nav navbar-nav">

		<li class="active"><a href="addCustomer">newCustomer</a></li>
		<li class="active"><a href="update">Update</a></li>
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#">View<span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a href="viewCustomer">SingleView</a></li>
				<li><a href="viewall">All</a></li>

			</ul></li>
		<li><a href="deleteCustomer">Delete</a></li>
	</ul>
	<ul class="nav navbar-nav navbar-right">

		<li><a href="LogOutController"><span
				class="glyphicon glyphicon-log-in"></span> LogOut</a></li>
	</ul>
</div>
</nav> -->
<form action="viewall" method="GET">
	<table style="width: 100%">
		<thead>

			<tr>
				<th>Customer Code</th>
				<th>Customer Name</th>
				<th>Customer Address</th>
				<th>Customer Pincode</th>
				<th>Customer Email</th>
				<th>Customer Number</th>
				<th>Customer Registration Date</th>
				<th>Customer created By</th>
				<th>Customer Modified Date</th>
			</tr>

			<c:forEach items="${customer}" var="customer">
				<tr>
					<td><c:out value="${customer.customerCode}" /></td>
					<td><c:out value="${customer.customerName}" /></td>
					<td><c:out value="${customer.customerAddress}" /></td>
					<td><c:out value="${customer.customerPincode}" /></td>
					<td><c:out value="${customer.customerEmail}" /></td>
					<td><c:out value="${customer.contactNumber}" /></td>
					<td><c:out value="${customer.registrationDate}" /></td>
					<td><c:out value="${customer.createdBy}" /></td>
					<td><c:out value="${customer.modifiedDate}" /></td>
				</tr>
			</c:forEach>
		</thead>
	</table>
</form>

</body>
</html>