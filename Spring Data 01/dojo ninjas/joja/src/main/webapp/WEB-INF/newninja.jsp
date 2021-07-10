<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<title>New Dojo</title>
<style>
	main{
		width:768px;
		margin:0 auto;
	}
</style>
</head>
<body>
	<main>

		<div class="card">
		<a class="btn btn-danger p-1 m-2" href="/">Go Back!</a>
		  <div class="card-header">
		    <h3 class="card-title">Add Ninja</h3>
		  </div>
		  <div class="card-body text-center">
		  
		    
	    	<form:form action="/ninja/new" method="POST" modelAttribute="ninja">
			<div class="form-row">
			   <div class="col p-3">
			    <form:select path="dojo" class="form-control">
		    		<c:forEach items="${dojos}" var="dojo">
				      <form:option value="${dojo.id}">${dojo.name}</form:option>
		     	 	</c:forEach>
			    </form:select>
			   </div>
			 </div>
			 <div class="form-row">
			   <div class="col p-3">
			     	<form:label path="firstName">First Name: </form:label>
			        <form:errors class="form-control" path="firstName"/>
			        <form:input class="form-control" path="firstName"/>
			   </div>
			 </div>
			 
			 <div class="form-row">
			   <div class="col p-3">
			     	<form:label path="lastName">Last Name: </form:label>
			        <form:errors class="form-control" path="lastName"/>
			        <form:input class="form-control" path="lastName"/>
			   </div>
			 </div>
			 
			 <div class="form-row">
			   <div class="col p-3">
			     	<form:label path="age">Age: </form:label>
			        <form:errors class="form-control" path="age"/>
			        <form:input class="form-control" path="age"/>
			   </div>
			 </div>
		    <input type="submit" class="btn btn-primary p-3" value="Add Dojo"/>
		</form:form>     
		  </div>
		</div>

</main>
</body>
</html>