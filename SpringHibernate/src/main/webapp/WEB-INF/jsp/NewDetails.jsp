<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <title>Add User</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body onLoad="noBack();" onpageshow="if (event.persisted) noBack();" onUnload="">

<!-- <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">UserDetails</a>
    </div>
    <ul class="nav navbar-nav">
      
       <li class="active"><a href="addCustomer">newCustomer</a></li>
       <li class="active"><a href="update">Update</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">View<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="viewCustomer">SingleView</a></li>
          <li><a href="viewall">All</a></li>
          
        </ul>
      </li>
      <li><a href="deleteCustomer">Delete</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
      <li><a href="LogOutController"><span class="glyphicon glyphicon-log-in"></span> LogOut</a></li>
    </ul>
  </div>
</nav> -->

<form:form  name ="userForm" action="newCustomer" modelAttribute = "customer">
<TABLE>
  <TR>
    <TD>Customer Code</TD>
    <TD>
    	<form:input path="customerCode" NAME="customerCode" required="required"/>
    </TD>
  </TR>
   <TR>
    <TD>Customer Name</TD>
    <TD>
      <form:input path="customerName" NAME="customerName" required="required"/>
    </TD>
  </TR>
  
<TR>
    <TD>Customer ADDRESS</TD>
    <TD>
      <form:input path="customerAddress" NAME="customerAddress" required="required"/>
    </TD>
  </TR>
  
 
  <TR>
    <TD>PinCode</TD>
    <TD>
      <form:input path="customerPincode" NAME="customerPincode" required="required"/>
    </TD>
  </TR>
  
   <TR>
    <TD>Email Address</TD>
    <TD>
      <form:input path="customerEmail" NAME="customerEmail" required="required"/>
    </TD>
  </TR>
  
   <TR>
    <TD>Contact Number</TD>
    <TD>
      <form:input path="contactNumber" NAME="contactNumber" required="required"/>
    </TD>
  </TR>
  
<%-- <TR>
    <TD>Registration Date </TD>
    <TD>
      <form:input path="registrationDate" NAME="registrationDate" required="required"/>
    </TD>
 <tr>
 
    <td> <br> </td> 
</tr>

  <tr>
    <td> <br> </td> 
    
</tr>
<tr>
 
 --%>
 
<%--   <TR>
    <TD>Created By </TD>
    <TD>
    <form:input path="createdBy" NAME="createdBy" value ="${username}" readOnly="readOnly"/>
    </TD>

  --%>
  <TR>
 <TD><input   type="SUBMIT"  value="submit" ><br></TD>
</TR>
</TABLE>
</form:form>


</body>
</html>