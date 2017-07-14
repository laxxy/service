<%--
  Created by IntelliJ IDEA.
  User: cosxt
  Date: 9/22/2016
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

    <!-- /.website title -->
    <title>Backyard Landing Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <!-- CSS Files -->
    <link href="<c:url value="/assets/css/bootstrap.min.css"/>" rel="stylesheet" media="screen">
    <link href="<c:url value="/assets/css/font-awesome.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/assets/fonts/icon-7-stroke/css/pe-icon-7-stroke.css"/>" rel="stylesheet">
    <link href="<c:url value="/assets/css/animate.css"/>" rel="stylesheet" media="screen">
    <link href="<c:url value="/assets/css/owl.theme.css"/>" rel="stylesheet">
    <link href="<c:url value="/assets/css/owl.carousel.css"/>" rel="stylesheet">

    <!-- Colors -->
    <link ref="<c:url value="/assets/css/css-index.css"/>" rel="stylesheet" media="screen">

    <!-- Google Fonts -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic" />

</head>

<body data-spy="scroll" data-target="#navbar-scroll">
<!-- /.preloader -->
<div id="preloader"></div>
<div id="top"></div>

<%--<sec:authorize access="!isAuthenticated()">
    <c:url value="/j_spring_security_check" var="loginUrl" />--%>
<!-- /.parallax full screen background image -->
<div class="fullscreen landing parallax" data-img-width="2000" data-img-height="1333" data-diff="100">

    <div class="overlay">
        <div class="container">
            <div class="row">
                <div class="col-md-7">

                    <!-- /.main title -->
                    <h1 class="wow fadeInLeft">
                        Beautiful High Converting Landing Page
                    </h1>

                    <!-- /.header paragraph -->
                    <div class="landing-text wow fadeInUp">
                        <p>Backyard is a modern and customizable landing page template designed to increase conversion of your product. Backyard is flexible to suit any kind of your business. Try now and join with our happy customers!</p>
                    </div>

                    <!-- /.header button -->
                    <!--<div class="head-btn wow fadeInLeft">
                        <a href="#feature" class="btn-primary">Features</a>
                        <a href="#download" class="btn-default">Download</a>
                    </div>-->



                </div>

                <!-- /.signup form -->
                <div class="col-md-5">

                    <div class="signup-header wow fadeInUp">
                        <h3 class="form-title text-center">GET STARTED</h3>
                        <form class="form-header" action="${loginUrl}" role="form" method="POST" id="#">
                            <div class="form-group">
                                <input class="form-control input-lg" name="sec_username" id="login" type="email" placeholder="Email" required>
                            </div>
                            <div class="form-group">
                                <input class="form-control input-lg" name="sec_password" id="password" type="password" placeholder="Password" required>
                            </div>
                            <div class="form-group last">
                                <input type="submit" class="btn btn-warning btn-block btn-lg" value="LOGIN">
                            </div>
                            <p class="privacy text-center">We will not share your email. Read our <a href="/">privacy policy</a>.</p>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
<%--</sec:authorize>--%>

<!-- /.javascript files -->
<script src="<c:url value="/assets/js/jquery.js"/>"></script>
<script src="<c:url value="/assets/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/js/custom.js"/>"></script>
<script src="<c:url value="/assets/js/jquery.sticky.js"/>"></script>
<script src="<c:url value="/assets/js/wow.min.js"/>"></script>
<script src="<c:url value="/assets/js/owl.carousel.min.js"/>"></script>
<script>
    new WOW().init();
</script>
</body>
</html>