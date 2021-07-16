<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Used Car sale</title>
</head>
<body>
<c:out value="${heading}"></c:out>
<br>
<a href ="cars">Add Car</a><br>
<a href="cars/all">View Cars</a><br>
<a href="cars/viewall">Cars for sale</a><br>
<a href="cars/showByBrand">Search Car by brand</a><br>
</body>
</html>