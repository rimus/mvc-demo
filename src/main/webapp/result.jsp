<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="style/mvc.css" type="text/css" rel="stylesheet" />
    <link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico" />
    <title>Task MVC. Result Page</title>
</head>
<body>
    <c:set var="joinValues" value="${fn:join(numbers, ', ')}" />
    ${operation} (${joinValues}) = ${result}
    <br />
    <br />
    <a href="start">Main</a>
</body>
</html>
