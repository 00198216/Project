<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title -->
    <title>Alazea - Gardening &amp; Landscaping HTML Template</title>

    <!-- Favicon -->
    <link rel="icon" href="resources/img/core-img/loader.png">

    <!-- Core Stylesheet -->
    <link rel="stylesheet" href="resources/style.css">

</head>

<body>

    <!-- Preloader -->
    <div class="preloader d-flex align-items-center justify-content-center">
        <div class="preloader-circle"></div>
        <div class="preloader-img">
            <img src="resources/img/core-img/camara.png" width="400" height="400" alt="">
        </div>
    </div>

    <!-- ##### Header Area Start ##### -->
    <header class="header-area">

        <!-- ***** Top Header Area ***** -->
        <div class="top-header-area">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="top-header-content d-flex align-items-center justify-content-between">
                            <!-- Top Header Content -->
                            <div class="top-header-meta">
                                <a href="#" data-toggle="tooltip" data-placement="bottom" title="infodeercreative@gmail.com"><i class="fa fa-envelope-o" aria-hidden="true"></i> <span>Email: infodeercreative@gmail.com</span></a>
                                <a href="#" data-toggle="tooltip" data-placement="bottom" title="+1 234 122 122"><i class="fa fa-phone" aria-hidden="true"></i> <span>Call Us: +1 234 122 122</span></a>
                            </div>

                            <!-- Top Header Content -->
                            <div class="top-header-meta d-flex">
                                <!-- Language Dropdown -->
                                <div class="language-dropdown">
                                    <div class="dropdown">
                                        <button class="btn btn-secondary dropdown-toggle mr-30" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Language</button>
                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                            <a class="dropdown-item" href="#">USA</a>
                                            <a class="dropdown-item" href="#">UK</a>
                                            <a class="dropdown-item" href="#">Bangla</a>
                                            <a class="dropdown-item" href="#">Hindi</a>
                                            <a class="dropdown-item" href="#">Spanish</a>
                                            <a class="dropdown-item" href="#">Latin</a>
                                        </div>
                                    </div>
                                </div>
                                <!-- Login -->
                                <div class="login">
                                    <a href="#"><i class="fa fa-user" aria-hidden="true"></i> <span>Sign out</span></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- ***** Navbar Area ***** -->
        <div class="alazea-main-menu">
            <div class="classy-nav-container breakpoint-off">
                <div class="container">
                    <!-- Menu -->
                    <nav class="classy-navbar justify-content-between" id="alazeaNav">

                        <!-- Nav Brand -->
                        <a href="index.html" class="nav-brand"><img src="resources/img/core-img/cinema.png" width="200px" alt=""></a>

                        <!-- Navbar Toggler -->
                        <div class="classy-navbar-toggler">
                            <span class="navbarToggler"><span></span><span></span><span></span></span>
                        </div>

                        <!-- Menu -->
                        <div class="classy-menu">

                            <!-- Close Button -->
                            <div class="classycloseIcon">
                                <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                            </div>

                            <!-- Navbar Start -->
                            <div class="classynav">
                                <ul>
                                    <li><a href="${pageContext.request.contextPath}/about">About</a></li>
                                    <li><a href="#">Category</a>
                                        <ul class="dropdown">
                                            <li><a href="${pageContext.request.contextPath}/">Home</a></li>
                                            <li><a href="${pageContext.request.contextPath}/about">About</a></li>
                                            <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
                                </ul>

                                <!-- Search Icon -->
                                <div id="searchIcon">
                                    <i class="fa fa-search" aria-hidden="true"></i>
                                </div>

                            </div>
                            <!-- Navbar End -->
                        </div>
                    </nav>

                    <!-- Search Form -->
                    <div class="search-form">
                        <form action="#" method="get">
                            <input type="search" name="search" id="search" placeholder="Type keywords &amp; press enter...">
                            <button type="submit" class="d-none"></button>
                        </form>
                        <!-- Close Icon -->
                        <div class="closeIcon"><i class="fa fa-times" aria-hidden="true"></i></div>
                    </div>
                </div>
            </div>
        </div>
    </header>    
    
    <!-- ##### Header Area End ##### -->





    <!-- ##### Hero Area Start ##### -->
    <section class="hero-area">
        <div class="hero-post-slides owl-carousel">
			<!-- Single Hero Post -->
            <div class="single-hero-post bg-overlay">
                <!-- Post Image -->
                <div class="slide-img bg-img" style="background-image: url(resources/img/bg-img/sc.png);"></div>
            </div>
        </div>
    </section>
    <!-- ##### Hero Area End ##### -->



    <!-- ##### Blog Area Start ##### -->
    <section class="alazea-blog-area section-padding-100-0">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <!-- Section Heading -->
                    <div class="section-heading text-center">
                        <h2>Area de modificacion</h2>
                        <p>Tu administrador puedes modificar lo que quieras</p>
                    </div>
                </div>
            </div>

            <div class="row justify-content-center">
			<c:forEach var="v" items="${pelicula}">
                <!-- Single Blog Post Area -->
                <div class="col-12 col-md-6 col-lg-4">
                    <div class="single-blog-post mb-100">
                        <div class="post-thumbnail mb-30">
                            <a href="#"><img src="${v.ssingular}" alt=""></a>
                        </div>
                        <div class="post-content">
                            <a href="#" class="post-title">
                                <h5>${v.stitulo}</h5>
                            </a>
                            <div class="post-meta">
                                <a href="#"><i class="fa fa-clock-o" aria-hidden="true"></i> 19 Jun 2018</a>
                                <a href="#"><i class="fa fa-user" aria-hidden="true"></i>${v.sdirector}</a>
                            </div>
                            <p class="post-excerpt">${v.ssinopsis}</p>
                            <div class="welcome-btn-group">
                                    <a href="#" class="btn alazea-btn mr-30">Mostrar</a>
                            </div>
                        </div>
                    </div>
                </div>
			</c:forEach>
            </div>
        </div>
    </section>
    <!-- ##### Blog Area End ##### -->



    <!-- ##### All Javascript Files ##### -->
    <!-- jQuery-2.2.4 js -->
    <script type="text/javascript" src="resources/js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script type="text/javascript" src="resources/js/bootstrap/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script type="text/javascript" src="resources/js/bootstrap/bootstrap.min.js"></script>
    <!-- All Plugins js -->
    <script type="text/javascript" src="resources/js/plugins/plugins.js"></script>
    <!-- Active js -->
    <script type="text/javascript" src="resources/js/active.js"></script>
</body>

</html>