<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<style>
	main{
		border:1px solid grey;
		border-radius:5px;
		box-shadow:0px 0px 3px 2px grey;
		padding:10px;
		width:768px;
		margin:0 auto;
	}
</style>
<title>Driver's Licenses</title>
</head>
<body>
	<main class="mt-5">
		<table class="table">
			<h1>${dojo.name}</h1>
		  <thead>
		    <tr>
		      <th scope="col">ID</th>
		      <th scope="col">Ninja Name </th>
		      <th scope="col">Ninja Age</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${dojo.ninjas}" var="ninja">
		    <tr>
		      <th scope="row">${ ninja.id }</th>
		      <td>${ ninja.firstName } ${ ninja.lastName }</td>
		      <td>${ ninja.age }</td>
		    </tr>
		    </c:forEach>
		  </tbody>
		</table>
		<div class="card">
		  <div class="card-header">
			    <a href="/"> Go Back</a>
		  </div>
	  	</div>
		
</main>
</body>
</html>