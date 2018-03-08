<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="../js/plugs/angular.min.js"></script>
<script type="text/javascript"></script>
<title>Angualr expression</title>
</head>
<body>	
	
	<div ng-app="" ng-init="qty=10;cost=5;firstName='vico';lastName='song'">
		<p>my first expression:{{5+5}}</p>
		<hr>
		<br>
		<p>total price :{{ qty*cost }}</p>
		<hr>
		<br>
		<p>total price: <span ng-bind="qty*cost"></span></p>
		<hr>
		<br>
		<p>name : {{ firstName+''+lastName }}</p>
	</div>
</body>
</html>