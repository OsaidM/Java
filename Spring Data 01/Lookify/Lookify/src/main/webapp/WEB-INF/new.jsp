<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Song</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">

</head>
<body>

<a href="/dashboard">Dashboard</a>

<form:form action="/songs/new" method="post" modelAttribute="song">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="artist">Artist</form:label>
        <form:errors path="artist"/>
        <form:input path="artist"/>
    </p>
    <p>
        <form:label path="rating">Rating(1-10)</form:label>
        <form:errors path="rating"/>
        <form:input type="number" path="rating"/>
    </p>
    <input type="submit" value="Add Song"/>
</form:form>    

</body>
</html>