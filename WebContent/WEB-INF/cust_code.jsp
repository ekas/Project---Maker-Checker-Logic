
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>Maker-Checker</title>
  <!--font In-->
  <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,900,700italic,700,600italic,400italic,600,300italic,300,200italic,200' rel='stylesheet' type='text/css'>
  

  <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


  <!-- Custom CSS -->
  <style type="text/css">
    .login-pane label,.login-pane span{font-family:'Titillium Web',sans-serif}.login-pane h4,.login-pane label,.login-pane span{font-size:22px;font-weight:600}.jumbo-one a,.jumbo-two .ic,.jumbo-two .ic:hover,.jumbo-two a{text-decoration:none}.login-pane{margin-top:150px;margin-bottom:250px}.main-form{border:1px solid #685E6D;border-radius:2%;padding:30px}.login-pane span{color:#685E6D;float:left}.login-pane h4{color:#685E6D}.login-pane .sign-in hr{border-color:#00bfa9;width:176px}.login-pane .first{margin-left:13px}.login-pane .main-form{margin:0 auto;width:500px}.login-pane .form-control{color:#00bfa9;border:2px solid #00bfa9;border-radius:0}.login-pane label{color:#685E6D}.login-pane .check{font-size:15px;margin-bottom:10px}.login-pane .btn-sign,.login-pane .btn-sign:hover{margin-bottom:15px;font-family:inherit;font-size:17px;font-weight:700;padding:5px 185px;text-align:center}.login-pane .btn-sign{color:#fff;background-color:#00bfa9;border:5px solid #00bfa9;border-radius:0}.login-pane .btn-create,.login-pane .btn-sign:hover{color:#00bfa9;background-color:#fff;border:5px solid #00bfa9}.login-pane .btn-sign:hover{border-radius:0}.login-pane .sign-with{margin-top:20px}.login-pane .btn-create,.login-pane .btn-create:hover{margin-top:10px;font-size:17px;font-weight:700;padding:5px 125px;margin-bottom:70px;font-family:inherit}.login-pane .sign-with hr{border-color:#00bfa9;width:146px}.login-pane .create{text-align:center}.login-pane .btn-create{border-radius:0;text-align:center}.login-pane .btn-create:hover,.main .btn-update{background-color:#00bfa9;border:5px solid #00bfa9;text-align:center}.login-pane .btn-create:hover{color:#fff;border-radius:0}.login-pane h4{text-align:center;margin-top:20px;font-family:inherit}.main,.main h1{font-family:'Titillium Web',sans-serif}@media(max-width:590px){.login-pane h4,.login-pane label,.login-pane span{font-size:19px}.login-pane .sign-in hr{width:160px}.login-pane .main-form{margin:0 auto;width:450px}.login-pane .first{margin-left:14px}.login-pane .check{font-size:13px}.login-pane .btn-sign,.login-pane .btn-sign:hover{width:100%;font-size:15px;padding:5px 172px}.login-pane .btn-create,.login-pane .btn-create:hover{width:450px;font-size:15px;padding:5px 100px}}@media(max-width:490px){.login-pane h4,.login-pane label,.login-pane span{font-size:17px}.login-pane .sign-in hr{width:100px}.login-pane .main-form{margin:0 auto;width:315px}.login-pane .first{margin-left:14px}.login-pane .check{font-size:13px}.login-pane .btn-sign,.login-pane .btn-sign:hover{width:100%;font-size:14px;padding:5px 90px}.login-pane .btn-create,.login-pane .btn-create:hover{width:320px;font-size:14px;padding:5px 50px}}@media(max-width:370px){.login-pane h4,.login-pane label,.login-pane span{font-size:15px}.login-pane .sign-in hr{width:80px}.login-pane .main-form{margin:0 auto;width:270px}.login-pane .first{margin-left:12px}.login-pane .check{font-size:13px}.login-pane .btn-sign,.login-pane .btn-sign:hover{width:100%;font-size:14px;padding:5px 70px}.login-pane .btn-create,.login-pane .btn-create:hover{width:285px;font-size:14px;padding:5px 30px}}@media(max-width:340px){.login-pane h4,.login-pane label,.login-pane span{font-size:15px}.login-pane .sign-in hr{width:65px}.login-pane .main-form{margin:0 auto;width:240px}.login-pane .first{margin-left:12px}.login-pane .check{font-size:13px}.login-pane .btn-sign,.login-pane .btn-sign:hover{width:100%;font-size:13px;padding:5px 40px}.login-pane .btn-create,.login-pane .btn-create:hover{width:245px;font-size:13px;padding:5px 27px}}.container-custom{width:940px;padding-right:15px;padding-left:15px;margin-right:auto;margin-left:auto}.main{margin:80px 0;color:#685E6D;font-size:18px}.main h1{font-size:35px;margin-bottom:60px}.main .custom-combobox{color:#685E6D;width:100%;font-family:inherit;border:2px solid #00bfa9;font-size:17px;margin-bottom:5px;border-radius:0;font-weight:500}.header,.header .navbar-brand,.main .btn-update{font-family:'Titillium Web',sans-serif}.main .form-control{color:#00bfa9;border:2px solid #00bfa9;border-radius:0}.main .btn-update{width:100px;margin-top:30px;font-size:15px;color:#fff;border-radius:0;margin-right:10px}.main .btn-update:hover{color:#00bfa9;background-color:#fff;border:5px solid #00bfa9;border-radius:0;text-align:center}@media(max-width:1000px){.container-custom{width:800px}}@media(max-width:990px){.container-custom{width:700px}}@media(max-width:780px){.container-custom{width:600px}}@media(max-width:650px){.container-custom{width:500px}}@media(max-width:550px){.container-custom{width:400px}.main{margin:80px 0;font-size:16px}.main h1{font-size:33px}.main .btn-update,.main .btn-update:hover{font-size:16px}}@media(max-width:450px){.container-custom{width:300px}.main{margin:80px 0;font-size:14px}.main h1{font-size:30px}.main .btn-update,.main .btn-update:hover{width:100%;font-size:14px}}@media(max-width:350px){.container-custom{width:250px}.main{margin:80px 0;font-size:12px}.main h1{font-size:25px}.main form{margin-top:-30px}.main .btn-update,.main .btn-update:hover{width:100%;font-size:13px}}body{padding-top:50px;transition:all 600s}.header{font-size:20px}.header .navbar-brand{font-weight:700;font-size:30px}.header .navbar-default{background-color:#fff}.header .dropdown-menu>li>a,.header .navbar-brand,.header .navbar-brand:hover,.navbar-default .navbar-nav>li>a{color:#00bfa9}.header .navbar-default .navbar-toggle{border-color:#00bfa9}.header .navbar-default .navbar-toggle .icon-bar,.header .navbar-default .navbar-toggle .icon-bar :focus,.header .navbar-default .navbar-toggle .icon-bar :hover{background-color:#00bfa9}.header .navbar-default .navbar-nav>li>a:focus,.header .navbar-default .navbar-nav>li>a:hover{background-color:#00bfa9;color:#fff}.header .navbar-default .navbar-nav .open .dropdown-menu>li>a{font-family:'Titillium Web',sans-serif;font-weight:400;font-size:15px;color:#00bfa9}.jumbo-one h1,.jumbo-one p,.jumbo-two h2,.jumbo-two p{font-family:inherit}.header .navbar-default .navbar-nav .open .dropdown-menu>li>a:focus,.header .navbar-default .navbar-nav .open .dropdown-menu>li>a:hover{background-color:#00bfa9;color:#fff}@media (max-width:400px){.header .navbar-brand{font-size:23px}}@media (max-width:320px){.header .navbar-brand{font-size:20px}}.jumbo-one{text-align:center;background-color:#685E6D;color:#fff;height:600px}.jumbo-one img{margin-top:50px;border:1px solid #685E6D}.jumbo-one h1{margin-top:20px;font-size:80px;font-weight:700}.jumbo-one p{color:#00bfa9;font-size:40px;font-weight:300;font-style:bold;margin-bottom:40px}.jumbo-one a{display:inline;color:#fff}.jumbo-one .in,.jumbo-one .up{margin:0 20px;background:#00bfa9;font-family:inherit;font-weight:300;font-size:15px;letter-spacing:1.3px;padding:16px 35px;text-decoration:none;text-transform:uppercase;border:2px solid #fff;cursor:pointer}.jumbo-one .up{background:#685E6D}@media (max-width:1000px){.jumbo-one{height:410px}.jumbo-one img{width:100px;height:100px;border:1px solid #685E6D}.jumbo-one h1{margin-bottom:5px;font-size:60px}.jumbo-one p{font-size:30px}.jumbo-one .in,.jumbo-one .up{font-size:13px;padding:14px 33px}}@media (max-width:800px){.jumbo-one{height:390px}.jumbo-one img{width:70px;height:70px;border:1px solid #685E6D}.jumbo-one h1{font-size:40px;margin-bottom:5px}.jumbo-one p{font-size:20px}.jumbo-one .in,.jumbo-one .up{font-size:10px;padding:11px 31px}}@media (max-width:550px){.jumbo-one{max-height:350px}.jumbo-one img{width:60px;height:60px;border:1px solid #685E6D}.jumbo-one h1{font-size:30px;margin-bottom:5px}.jumbo-one p{font-size:18px}.jumbo-one .in,.jumbo-one .up{font-size:10px;padding:11px 28px;margin:0 15px}}@media (max-width:300px){.jumbo-one{max-height:350px}.jumbo-one img{width:60px;height:60px;border:1px solid #685E6D}.jumbo-one h1{font-size:30px;margin-bottom:5px}.jumbo-one p{font-size:18px}.jumbo-one .in,.jumbo-one .up{display:inline-block}}.jumbo-two{margin-top:60px;text-align:center;margin-bottom:60px;color:#685E6D}.jumbo-two h2{font-weight:600;font-size:28px;color:#685E6D}.jumbo-two p{font-weight:4600;font-size:15px}.jumbo-two .buttn,.jumbo-two .buttn:hover{margin:0 20px;font-weight:300;font-size:13px;letter-spacing:1.3px;text-transform:uppercase;font-family:inherit}.jumbo-two .ic{color:#00bfa9;border-radius:200%}.jumbo-two .ic:hover{color:#685E6D;cursor:pointer}.jumbo-two .buttn{color:#fff;background:#00bfa9;padding:14px 28px;text-decoration:none;border:2px solid #fff}.footer a,.jumbo-two .buttn:hover{color:#00bfa9;text-decoration:none}.jumbo-two .buttn:hover{background:#fff;padding:14px 20px;border:2px solid #00bfa9;cursor:pointer}@media (max-width:768px){.jumbo-two .sub1,.jumbo-two .sub2{margin-bottom:50px}.jumbo-two .buttn,.jumbo-two .buttn:hover{margin:0 200px}}@media (max-width:620px){.jumbo-two .sub1,.jumbo-two .sub2{margin-bottom:50px}.jumbo-two .buttn,.jumbo-two .buttn:hover{margin:0 110px;font-size:13px;padding:14px 25px}}@media (max-width:450px){.jumbo-two .sub1,.jumbo-two .sub2{margin-bottom:50px}.jumbo-two .buttn,.jumbo-two .buttn:hover{margin:0 40px;font-size:13px;padding:14px 25px}}.footer{text-align:center;padding-top:20px;height:120px;background-color:#685E6D}.footer a:hover{color:#fff;cursor:pointer;text-decoration:none}.footer .scrollup{float:right}.footer .new{margin-left:35px}.footer li a{text-decoration:none}.footer ul{margin-top:5px;margin-right:35px}.footer li{font-size:17px;list-style:none;display:inline}.footer p{font-family:inherit;font-size:14px}
  </style>
</head>
</head>
<body><!--  
  <div class="header">
    <nav class="navbar navbar-default navbar-fixed-top clearfix">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">
            <span class="one">Maker Checker BRD</span>
          </a>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav navbar-right">
            <li ><a href="#">One<span class="sr-only">(current)</span></a></li>
            <li><a href="#">Two</a></li>
            <li><a href="#">Three</a></li>
          </ul>
        </div>
      </div>
    </nav>
  </div>-->
<% if (request.getAttribute("oper").equals("modify")) { %>
  <div class="main">
    <div class="container-custom">
      <h1>Fill the Details</h1>    
      <form action="http://localhost:8081/WebApp2CustInventoryBrd/formServlet" method="post">
        <div class="form-group">
          <label> Customer Code*</label>
          <input id="custCode" type="text" class="form-control"  placeholder="Enter Customer Code" name="custCode">
        </div>
        <button type="submit" id="btn-update" class="btn-update btn btn-default" name="btn" value="modify">Submit</button>
        
      </form>
	 
    </div>
  </div>
<% } %>
<% if (request.getAttribute("oper").equals("modify_master")) { %>
  <div class="main">
    <div class="container-custom">
      <h1>Fill the Details</h1>    
      <form action="http://localhost:8081/WebApp2CustInventoryBrd/formServlet" method="post">
        <div class="form-group">
          <label> Customer Code*</label>
          <input id="custCode" type="text" class="form-control"  placeholder="Enter Customer Code" name="custCode">
        </div>
        <button type="submit" id="btn-update" class="btn-update btn btn-default" name="btn" value="modify_master">Submit</button>
        
      </form>
	 
    </div>
  </div>
<% } %>
<% if (request.getAttribute("oper").equals("view")) { %>
  <div class="main">
    <div class="container-custom">
      <h1>Fill the Details</h1>    
      <form action="http://localhost:8081/WebApp2CustInventoryBrd/formServlet" method="post">
        <div class="form-group">
          <label> Customer Code*</label>
          <input id="custCode" type="text" class="form-control"  placeholder="Enter Customer Code" name="custCode">
        </div>
        <button type="submit" id="btn-update" class="btn-update btn btn-default" name="btn" value="view">Submit</button>
        
      </form>
	 
    </div>
  </div>
<% } %>
<% if (request.getAttribute("oper").equals("delete")) { %>
  <div class="main">
    <div class="container-custom">
      <h1>Fill the Details</h1>    
      <form action="http://localhost:8081/WebApp2CustInventoryBrd/formServlet" method="post">
        <div class="form-group">
          <label> Customer Code*</label>
          <input id="custCode" type="text" class="form-control"  placeholder="Enter Customer Code" name="custCode">
        </div>
        <button type="submit" id="btn-update" class="btn-update btn btn-default" name="btn" value="delete">Submit</button>
        
      </form>
	 
    </div>
  </div>
<% } %>
<% if (request.getAttribute("oper").equals("searchall")) { %>
  <div class="main">
    <div class="container-custom">
      <h1>Fill the Details</h1>    
      <form action="http://localhost:8081/WebApp2CustInventoryBrd/formServlet" method="post">
        <div class="form-group">
        <button type="submit" id="btn-update" class="btn-update btn btn-default" name="btn" value="maker_searchall">Submit</button>
        
      </form>
	 
    </div>
  </div>
<% } %>
<% if (request.getAttribute("oper").equals("viewChecker")) { %>
  <div class="main">
    <div class="container-custom">
      <h1>Fill the Details</h1>    
      <form action="http://localhost:8081/WebApp2CustInventoryBrd/formServlet" method="post">
        <div class="form-group">
          <label> Customer Code*</label>
          <input id="custCode" type="text" class="form-control"  placeholder="Enter Customer Code" name="custCode">
        </div>
        <button type="submit" id="btn-update" class="btn-update btn btn-default" name="btn" value="viewChecker">Submit</button>
        
      </form>
	 
    </div>
  </div>
<% } %>
<% if (request.getAttribute("oper").equals("viewCheckerSpecific")) { %>
  <div class="main">
    <div class="container-custom">
      <h1>Fill the Details</h1>    
      <form action="http://localhost:8081/WebApp2CustInventoryBrd/formServlet" method="post">
        <div class="form-group">
          <label> Customer Code*</label>
          <input id="custCode" type="text" class="form-control"  placeholder="Enter Customer Code" name="custCode">
        </div>
        <button type="submit" id="btn-update" class="btn-update btn btn-default" name="btn" value="viewCheckerSpecific">Submit</button>
        
      </form>
	 
    </div>
  </div>
<% } %>
  <!-- **********************Footer Starts***********************
  <div class="footer">
    <div class="container">
      <div class="row">
        <a class="new" href="https://www.facebook.com/"><i class="fa fa-facebook-square fa-2x" aria-hidden="true"></i></a>
        <a href="https://www.twitter.com/"><i class="fa fa-twitter-square fa-2x" aria-hidden="true"></i></a>
        <a href="https://plus.google.com/"><i class="fa fa-google-plus-square fa-2x" aria-hidden="true"></i></a>
        <a href="#" class="scrollup" style="display: inline;"><i class="fa fa-chevron-circle-up fa-2x"> </i></a>
      </div>
      <div class="row">
        <ul>
          <li><a href="">One</a></li>
          <li>|</li>
          <li><a href="">Two</a></li>
          <li>|</li>
          <li><a href="">Three</a></li>
          <li>|</li>
          <li><a href="">Four</a></li>
        </ul>
      </div>
      <p>&copy;Copyright 2016 <span><a href="">Maker Checker BRD</a></span></p>

    </div>
  </div>
   **********************Footer ends*********************** -->



  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
  

  <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  
  
  <script type="text/javascript">
    $(function(){
      $("#btn-update").click(function(){
        var custCode = $('#custCode').val();

        console.log(custCode);
        if (custCode.length === 0) {
          alert("all Fields are mandatory");
          return false;
        }

      });
    });
  </script>
</body>    
</body>

</html>