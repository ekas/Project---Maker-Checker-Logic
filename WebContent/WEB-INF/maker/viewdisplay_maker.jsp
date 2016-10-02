<%@page import="com.Nucleus.brd.ServiceLayer.CustInfoVars"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u' crossorigin='anonymous'>
    <style type='text/css'>
    	.custom-container1{
    		width: 100%;
    		overflow-x: scroll; 
    		-webkit-box-shadow: 4px 6px 13px -1px rgba(130, 126, 130, 0.64);
            -moz-box-shadow: 4px 6px 13px -1px rgba(130, 126, 130, 0.64);
            box-shadow: 4px 6px 13px -1px rgba(130, 126, 130, 0.64);
            padding: 50px;
    	}
        .custom-container2{
            margin: 50px auto 0 auto;
            width: 600px;
            -webkit-box-shadow: 4px 6px 13px -1px rgba(130, 126, 130, 0.64);
            -moz-box-shadow: 4px 6px 13px -1px rgba(130, 126, 130, 0.64);
            box-shadow: 4px 6px 13px -1px rgba(130, 126, 130, 0.64);
            padding: 50px;
        }
        
        .custom-button {
            margin-right: 10px;
            color: white;
            background-color: #66afe9;
            padding: 8px 20px 8px 20px;
            border-radius: 2px;
            border: 1px solid #66afe9;
        }
        
        .custom-button:hover {
            color: #66afe9;
            background-color: #ffffff;
            border: 1px solid #66afe9;
        }
    </style>
</head>
</head>
<body>
    <nav class='navbar navbar-default'>
        <div class='container-fluid'>
            <div class='navbar-header'>
                <button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#bs-example-navbar-collapse-1' aria-expanded='false'> <span class='sr-only'>Toggle navigation</span> <span class='icon-bar'></span> <span class='icon-bar'></span> <span class='icon-bar'></span></button> <a class='navbar-brand' href='#'>Brand</a> </div>
            <div class='collapse navbar-collapse' id='bs-example-navbar-collapse-1'>
                <ul class='nav navbar-nav navbar-right'>
                    <li class='dropdown'> <a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>New User? <span class='caret'></span></a>
                        <ul class='dropdown-menu'>
                            <li><a href='form.html'>User Form</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <% if (request.getAttribute("ret").equals("Records list")) { %>
    <div class='container'>
        <div class='custom-container1'>
            <div class='custom-form'>
                <form name='myForm' action='http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_select.html' method='get'>
                    <h2>Hello</h2>
                    <h5><%= request.getAttribute("ret")%> </h5>                    
                    
                    	<table id= "tab" class="table table-striped">
  							<tr>
  								<th>Customer Code</th>
  								<th>Customer Name</th>
  								<th>Customer Address 1</th>
  								<th>Customer Address 2</th>
  								<th>Customer Pin Code</th>
  								<th>Customer Email</th>
  								<th>Customer Contact Number</th>
  								<th>Customer Primary Contact Person</th>
  								<th>Customer Record Status</th>
  								<th>Customer Active / Inactive</th>
  								<th>Creation Date</th>
  								<th>Created By</th>
  								<th>Modifying Date</th>
  								<th>Modified By</th>
  								<th>Authorized Date</th>
  								<th>Authorized By</th>
  							</tr>
  								
  								
  							<c:forEach var = "cus" items = "${cus}">
  								<tr>
  									<td>${cus.getCustCode()}</td>  								
  									<td>${cus.getCustName()}</td>  								
  									<td>${cus.getCustAdd1()}</td>
  									<td>${cus.getCustAdd2()}</td>  								
  									<td>${cus.getCustPin()}</td>  								
  									<td>${cus.getCustEmail()}</td>  								
  									<td>${cus.getCustContact()}</td>  								
  									<td>${cus.getCustPriContact()}</td>
  									<td>${cus.getRecStatus()}</td>  								
  									<td>${cus.getCustAIFlag()}</td>  								
  									<td>${cus.getCreateDate()}</td>  								
  									<td>${cus.getCreateBy()}</td>  								
  									<td>${cus.getModDate()}</td>  								
  									<td>${cus.getModBy()}</td>  								
  									<td>${cus.getAuthDate()}</td>  								
  									<td>${cus.getAuthBy()}</td>
  								</tr>
  						</c:forEach>
					</table>
					
                    <input class='custom-button btn btn-default' id='button' type='submit' name='btn' value='Back'>
                </form>
            </div>
        </div>
    </div>
     <% } %>
     
     <% if (request.getAttribute("ret").equals("View Particular Record")) { %>
    <div class='container'>
        <div class='custom-container1'>
            <div class='custom-form'>
                <form name='myForm' action='http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_select.html' method='get'>
                    <h2>Hello</h2>
                    <h5><%= request.getAttribute("ret")%> </h5>                    
                    
                    	<table id= "tab" class="table table-striped">
  							<tr>
  								<th>Customer Code</th>
  								<td>${cus.getCustCode()}</td>
  							</tr>
  							<tr>
  								<th>Customer Name</th>
  								<td>${cus.getCustName()}</td>
  							</tr>
  							<tr>
  								<th>Customer Address 1</th>
  								<td>${cus.getCustAdd1()}</td>
  							</tr>
  							<tr>
  								<th>Customer Address 2</th>
  								<td>${cus.getCustAdd2()}</td>
  							</tr>
  							<tr>
  								<th>Customer Pin Code</th>
  								<td>${cus.getCustPin()}</td>
  							</tr>
  							<tr>
  								<th>Customer Email</th>
  								<td>${cus.getCustEmail()}</td>
  							</tr>
  							<tr>
  								<th>Customer Contact Number</th>
  								<td>${cus.getCustContact()}</td>
  							</tr>
  							<tr>
  								<th>Customer Primary Contact Person</th>
  								<td>${cus.getCustPriContact()}</td>
  							</tr>
  							<tr>
  								<th>Customer Record Status</th>
  								<td>${cus.getRecStatus()}</td>
  							</tr>
  							<tr>
  								<th>Customer Active / Inactive</th>
  								<td>${cus.getCustAIFlag()}</td>
  							</tr>
  							<tr>
  								<th>Creation Date</th>
  								<td>${cus.getCreateDate()}</td>
  							</tr>
  							<tr>
  								<th>Created By</th>
  								<td>${cus.getCreateBy()}</td>
  							</tr>
  							<tr>
  								<th>Modifying Date</th>
  								<td>${cus.getModDate()}</td>
  							</tr>
  							<tr>
  								<th>Modified By</th>
  								<td>${cus.getModBy()}</td>
  							</tr>
  							<tr>
  								<th>Authorized Date</th>
  								<td>${cus.getAuthDate()}</td>
  							</tr>
  							<tr>
  								<th>Authorized By</th>
  								<td>${cus.getAuthBy()}</td>
  							</tr>
					</table>
					
                    <input class='custom-button btn btn-default' id='button' type='submit' name='btn' value='Back'>
                </form>
            </div>
        </div>
    </div>
     <% } %>
     
    <script src='https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js'></script>
    <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js' integrity='sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa' crossorigin='anonymous'></script>
</body>

</html>