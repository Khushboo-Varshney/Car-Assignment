<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cars for Sale</title>
<style>
table{
border:2px solid blue;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}
tr,th,td{
border:2px solid blue;
}
</style>
</head>
<body>
<table>
<tr>
<th>Car Model</th>
<th>Manufacturing Date</th>
<th>Distance Covered</th>
<th>Car Brand</th>
<th>Car Status</th>

</tr>
<c:forEach items="${list}" var="eachItem">
<tr>
<td><c:out value="${eachItem.model}"></c:out></td>
<td><c:out value="${eachItem.year}"></c:out></td>
<td><c:out value="${eachItem.kilometers}"></c:out></td>
<td><c:out value="${eachItem.brand}"></c:out></td>
<td><c:out value="${eachItem.status}"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>