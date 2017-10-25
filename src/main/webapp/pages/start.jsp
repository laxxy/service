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
    <div>
        <label id="from" role="presentation" class="disabled">Kiev</label>
    </div>
    <div>
        <label id="to" role="presentation" class="disabled">Lviv</label>
    </div>
    <div>
        <label id="date" role="presentation" class="disabled">27.10.2017</label>
    </div>
    <div>
        <span id="train" role="presentation" class="disabled"><a href="#">745</a></span>
    </div>
    <div>
        <span id="cls" role="presentation" class="disabled"><a href="#">2</a></span>
    </div>
        <button type="submit" class="btn btn-default"
                onclick="startQueue()">
            Submit</button>
</div>

    <script src="<c:url value="/assets/js/jquery2.js"/>"></script>
    <script src="<c:url value="/assets/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/assets/js/api_calls.js"/>"></script>
</body>
</html>
