<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.epam.gomel.beans.Operation" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="style/mvc.css" type="text/css" rel="stylesheet" />
    <link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico" />
    <script src="scripts/mvc.js" type="text/javascript"></script>
    <title>Task MVC. Start Page</title>
</head>
<body>
    <form name="operations" method="post" action="result">
        <table>
            <tr>
            <c:forEach var="number" items="${numbers}" varStatus="status">
                <td>
                <c:choose>
                    <c:when test="${control eq 'text'}">
                        <input type="checkbox" name="flag">
                        <input type="text" name="flag" value="${number}" size="10">
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" name="flag" value="${number}">
                        <label for="${flag}">${number}</label>
                    </c:otherwise>
                </c:choose>
                </td>
            </c:forEach>
            </tr>
        </table>
        <br />
        <input type=hidden name="operation" value="no">
        <a href="JavaScript:sendOperation('<%= Operation.SUM %>')">Sum</a>&nbsp;
        <a href="JavaScript:sendOperation('<%= Operation.MAX %>')">Max</a>&nbsp;
        <a href="JavaScript:sendOperation('<%= Operation.MIN %>')">Min</a>&nbsp;
        <a href="JavaScript:sendOperation('<%= Operation.AVG %>')">Avg</a>
    </form>
</body>
</html>
