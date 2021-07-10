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
		  <thead>
		    <tr>
		      <th scope="col">ID</th>
		      <th scope="col">Dojo Name:</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${dojos}" var="dojo">
		    <tr>
		      <th scope="row">${ dojo.id }</th>
		      <td> <a href="/dojo/${ dojo.id }"> ${ dojo.name }</a></td>
		    </tr>
		    </c:forEach>
		  </tbody>
		</table>
		<div class="card">
		  <div class="card-header">
		  	<div class="text-right">
			    <a href="/joja/new/dojo"> Add Dojo</a>
		    </div>
		    <div class="text-left">
			    <a href="/joja/new/ninja"> Add Ninja</a>
		    </div>
		  </div>
	  	</div>
		
</main>
</body>
</html>