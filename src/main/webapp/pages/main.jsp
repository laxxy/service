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
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="!isAuthenticated()">
    <div><b>You are not authenticated!</b></div>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
    <div><b>You are authenticated ))))!</b></div>
</sec:authorize>
</body>
</html>
