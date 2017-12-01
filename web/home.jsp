<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html lang="en">
  <head>
      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      
     <c:import url="head-meta.jsp"/>
      <link rel="stylesheet" href="css/bootstrap.css" />
        <title>Home Page</title>
     
 
  </head>
  <body ng-app="myApp">


<nav class="navbar navbar-inverse" style="margin-bottom:0px;">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
<a class="navbar-brand" href="#" style="color:#FF0000">Automotive</a>
      <ul class="nav navbar-nav">
        <li class="active"><a href="home.jsp">Home</a></li>
        <li><a href="buy_product.jsp">Buy Products</a></li>
        <li><a href="sale_products.jsp">Sale Products</a></li>   
        <li><a href="about_us.jsp">About Us</a></li>
        <li><a href="contact_us.jsp">Contact Us</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
<li><a href="#"><span class="glyphicon glyphicon-user"></span> <b style="color:green">Welcome </b><b style="color:Orange"> <%= request.getSession().getAttribute("userdb") %></b></a></li>
          <!-- User Nmae -->
        <li ><a href="loginform.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
<!-- User Logout Button -->
	
      </ul>
    </div>
  </div>
</nav>


<!--navigation section end -->
<!--HOME PAGE-->  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
	        <li data-target="#myCarousel" data-slide-to="3"></li>
			      <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

   

	        <div class="item" >
        <img src="images/p.jpg" alt="Chicago" style="width:100%; height:500px;">
        <div class="carousel-caption">
          <h5>Thanks for visit our website</h5>
          
        </div>
      </div>
        
         <div class="item active">
        <img src="images/R.jpg" id="imgslid" alt="Los Angeles" style="width:100%; height:500px;">
        <div class="carousel-caption">
          <h5>Welcome</h5>
        </div>
      </div>
	  
	        <div class="item">
        <img src="images/Q.jpg" id="imgslid" alt="Chicago" style="width:100%; height:500px;">
        <div class="carousel-caption">
          <h5>Feel free to contact us</h5>
        </div>
      </div>
	  
      <div class="item">
        <img src="images/S.jpg" id="imgslid" alt="Chicago" style="width:100%; height:500px;">
        <div class="carousel-caption">
          <h5>Get more details of automotives's.com </h5>
        </div>
      </div>
    
     
        
         <div class="item">
        <img src="images/slide6.jpeg" id="imgslid" alt="Chicago" style="width:100%; height:500px;">
        <div class="carousel-caption">
          <h5>Get more details of automotives's.com </h5>
        </div>
      </div>
        
        
    <div>
        
  
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
<!--HOME PAGE END-->
<h2 style="font-size: 12pt; color:black">
<hr>
<div class="container"> 
<div class="row" >

   <center> 
    <div class="col-sm-10">
<h2>Welcome to The Automotive </h2>
<p> 
    
    <br>
        Automotive India is published as a monthly magazine and currently enjoys the highest readership among automotive magazines in India (IRS-2009 R1 report). A television show titled 'The Automotive Show' also airs weekly on Times Now and ET Now which enjoys the highest viewership among Indian automotive programmes (source). Automotive India has a strong digital presence with the website providing a daily feed of automotive news, updates and reviews. The automotive's India YouTube channel features numerous videos with reviews, comparisons and other exciting automotive content. Automotive India's digital presence extends to Twitter, Facebook, Instagram and Google+.


Led by Mr.Prashant kumar das and his Team, India's leading automotive journalist, the first Automotive India issue came out in september2017. Over the years, the brand has earned an enviable reputation for high level of editorial content, production standards and meticulous testing. The parent brand, 'Autocar', was first published in 2000 and is referred to as the world's oldest car magazine. Autocar also lays claim to inventing the road test in 1998.
</h2></div>
     </center>

<div class="col-sm-4">
<img src="images/backnavv.jpg" class="imghome" alt="" />
</div>
</div>
</div>

<hr>

<div class="container-fluid">
  <div id="myCarousel1" class="carousel slide" data-ride="carousel" data-interval="false">
    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
      <div class="row">
      <div class="col-sm-3">
          <img src="images/ccad.png" class="listH" alt="Los Angeles" style="width:100%;height:600;">
      </div>
        
        <div class="col-sm-3">
            <img src="images/ccdh.png" class="listH" alt="Los Angeles" style="width:100%;height:600;">
        </div>
        
        <div class="col-sm-3">
            <img src="images/vol.jpg" class="listH" alt="Los Angeles" style="width:100%;height:500;">
        <div class="carousel-caption">
            <marquee direction="right"><h5 style="color:#F1C40F; margin-right: 100px;"><b></b></h5></marquee>
        </div>
        </div>
        
                <div class="col-sm-3">
        <img src="images/ccjag.png" class="listH" alt="Los Angeles" style="width:100%;height:500;">
        </div>
                
        </div>
      </div>
<div class="item">

                <div class="col-sm-3">
        <img src="images/ccmahi.png" class="listH" alt="Los Angeles" style="width:100%;height:500;">
        </div>
        
                <div class="col-sm-3">
                    <img src="images/ccdh.jpg" alt="Los Angeles" class="listH" style="width:100%;">
        </div>

      <div class="row">
      <div class="col-sm-3">
          <img src="images/ccmd.jpg" alt="Los Angeles" class="listH" style="width:100%;">
        </div>
        
        <div class="col-sm-3">
            <img src="images/ccad.jpg" alt="Los Angeles" class="listH" style="width:100%;">
        </div>
      </div>
</div><hr>

    <!-- Left and right controls -->

	<a class="left slide-control" hresf="#myCarousel1" role="button" data-slide="prev"><i class="fa fa-angle-left"></i></a>
    <a class="right slide-control" href="#myCarousel1" role="button" data-slide="next"><i class="fa fa-angle-right"></i></a>
	
	
  </div>
</div>
</div>
<!--Footer section start -->
<!--footer class="container-fluid text-center" >
  <h4><i><b>Online b&s cars</b></i></h4>  
  <form class="form-inline"><b>Get deals:</b>
    <input type="email" class="form-control" size="50" placeholder="Enter your email-id" required>
    <button type="button" class="btn btn-danger lastbtn">Subscribe now</button>
  </form>
</footer!-->

<!--latest footer at bottom start -->

<div class="container-fluid footer" style="background-color:#7FFFDA;">
<div class="container-fluid">
<div class="col-sm-4">
<img src="images/footpic.jpg" alt="" class="img-responsive" />
<p>At Scrubs, we know your time is valuable. Having to take your car in to get washed and detailed is typically a hassle. Even going out without your vehicle for a few hours can be inconvenient at the best of times....</p>

<p><a href="#" class="btn btn-danger" >Read More...</a></p>
</div>
<div class="col-sm-4 midfooter">
<h3>Quick Links</h3>
<ul>
<li><a href="index.jsp">&raquo; Home </a></li>
<li><a href="buy_product.jsp">&raquo; Buy Products</a></li>
<li><a href="about_us.jsp">&raquo; About Us</a></li>
<li><a href="contact_us.jsp">&raquo; Contact Us</a></li>
</ul>

</div>
<div class="col-sm-4"></div>
<h3>Contact Details</h3>
<p>Address : </strong> PRASHANT KUMAR DAS,(Delhi)</p>
<p>Email : </strong>prashantdas64@gmil.com</p>
<p>Phone : </strong>9810368242 </p>
<p style="text-align: right; margin-right: 60px;">Store Timing : </strong> 10:00am to 9:30pm</p>
</div>

</div>
      
<!--footer section end -->

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
<script>
         

        var app=angular.module("myApp",['ngRoute']);
	app.config(function($routeProvider)
{
		$routeProvider
		.when('/',{
			templateUrl:'index.html',
			controller:'myrefreshcontroller'

		})
                        .otherwise(
                        {
                            controller:'nextcontroller'
                        });
	
});

	app.controller("myrefreshController",function($scope,$location)
	{
		
			$location.path('/')
			{
                            //$route.reload();
                           setTimeout(function() {
						location.reload();  // this method for refresh the page 
					}, 
					40000);
					
			
		}
	});
            app.controller("nextcontroller",function ($scope,$location)
            {
                            
                     setTimeout(function ()
                            {
                              // location.reload();
                                    },2000) 
                            
                });
       
    </script>
  </body>
</html>


