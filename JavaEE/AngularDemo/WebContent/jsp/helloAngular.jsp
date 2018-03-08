<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="../js/plugs/angular.min.js"></script>
<title>Hello Angualr</title>
</head>
<body>
	<div ng-app="">
 		<p>名字 : <input type="text" ng-model="name"></p>
 		<h1>Hello {{name}}</h1>
	</div>
</body>
</html>