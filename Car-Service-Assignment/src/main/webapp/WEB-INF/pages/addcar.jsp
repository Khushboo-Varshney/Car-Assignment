<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>RowAdded</p><c:out value="${rowAdded}"/>
<form:form method="post" action="cars">

<form:label path="model">Car Model</form:label>
<form:input path="model"/>

<form:label path="year">Manufacturing Date</form:label>
<form:input path="year"/>

<form:label path="kilometers">Distance Covered</form:label>
<form:input path="kilometers"/>

<form:label path="brand">Car Brand</form:label>
<form:input path="brand"/>

<form:label path="status">Car Status</form:label>
<form:input path="status"/>


<input type="submit" value="Add">
</form:form>

</body>
</html>