<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma","no-cache");
response.setDateHeader("Expires", 0);
%>
<!DOCTYPE html>  
<html lang="en">
<head>
   <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <title>Domestic Help</title>

    <style>
        .navbar{position: fixed; z-index: 2; width: 100%;}
        .dropdown:hover .dropdown-menu{ display: block; position: absolute; top: 30px; background-color:#138D75;}
        .navbar-collapse{display: flex; justify-content: space-between;}
        @media (max-width: 768px) {
            .navbar-collapse{display: block;}
        }
        .container-fluid{background-image: url("image/background.avif"); padding: 5%;}
        .card p{height: 150px}
        .card:hover{transform: translateY(-5px); transition: 0.5s;}
        .data input{border: 1px solid #138d755b; padding: 5px;margin: 0;}
        .data input:focus {outline:#138D75 1px inset;}
        .data button {width: 40px;height: 36px;border: none; background-color: #138D75; position: relative; top: 3px; font-size: 23px;}  
        .data button:hover{outline: #015383 outset 1px;}
        .data button:active{outline: #015383 inset 2px;}
        .foot{background-color: #4F4F4F;}
        .foot div{width: 83%; margin: auto;padding: 2px 0;
    </style>
</head>
<body>

	<%
	String n=(String)session.getAttribute("uname");
	if(n==null){
		%>
		<%@include file="include/loginHeader.jsp" %>
		<% 
	}else{
		%>
		<%@include file="include/header.html" %>
		<% 
	}
	%>
	
	
	  <div id="carousel-1" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
      </ol>
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img class="d-block w-100" src="image/decoration.png" alt="First slide">
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" src="image/plumbing.jpeg" alt="Second slide">
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" src="image/wiring.jpg" alt="Third slide">
      </div>
    </div>
    <a class="carousel-control-prev" href="#carousel-1" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="carousel-control-next" href="#carousel-1" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
  </div>

  <div class="container-fluid">
    <div class="row">
        <div class="col-lg-4">
            <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="image/plumbing-logo-.avif" alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Card title</h5>
                  <p class="card-text"> Support for pipes and fixtures installed in a building for the distribution and use of potable (drinkable) water and the removal of waterborne wastes.</p>
                  <a href="plumber.jsp" class="btn btn-primary">Details</a>
                </div>
              </div>
        </div>
        <div class="col-lg-4">
            <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="image/Electricity.webp" alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Card title</h5>
                  <p class="card-text">Execute plans of electrical wiring for well functioning lighting, intercom and other electrical systems.</p>
                  <a href="#" class="btn btn-primary">Details</a>
                </div>
              </div>
        </div>
        <div class="col-lg-4">
            <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="image/Paint-logo.avif" alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Card title</h5>
                  <p class="card-text">Safe Home Painting Services for your house by trained colour painters. Home colour painting services by professional home painters only at Asian Paints.</p>
                  <a href="#" class="btn btn-primary">Details</a>
                </div>
              </div>
        </div>
        
    </div>      
  </div>
	
	<%@include file="include/footer.html" %>
</body>
</html>