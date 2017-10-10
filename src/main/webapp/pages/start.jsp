<%--
  Created by IntelliJ IDEA.
  User: cosxt
  Date: 10/9/2017
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Start service</title>
    <link href="<c:url value="/assets/css/bootstrap.min.css"/>" rel="stylesheet" media="screen">
    <link href="<c:url value="/assets/css/font-awesome.min.css"/>" rel="stylesheet">
</head>
<body>
    <div>
        <li role="presentation" class="disabled"><a href="#">Kiev</a></li>
    </div>
    <div>
        <li role="presentation" class="disabled"><a href="#">Lviv</a></li>
    </div>
        <button type="submit" class="btn btn-default">Submit</button>

    <script src="<c:url value="/assets/js/jquery.js"/>"></script>
    <script src="<c:url value="/assets/js/bootstrap.min.js"/>"></script>
</body>
</html>
