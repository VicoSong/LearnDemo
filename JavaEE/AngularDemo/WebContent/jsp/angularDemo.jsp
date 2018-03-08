<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"></script>
<script type="text/javascript" src="../js/plugs/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../js/plugs/angular.min.js"></script>
<script type="text/javascript" src="../js/demo/angularDemo.js?ver =<%=new Random().nextInt()%>" ></script>
<title> Angualr Demo</title>
</head>
<body>

	<!--  1 
	  <div ng-app="myApp" ng-controller="myCtrl" >
		名: <input type="text" ng-model="firstName"><br>
		 姓: <input type="text" ng-model="lastName"><br> <br>
		  姓名:{{firstName + " " + lastName}}
	</div>  --> 
	
	<!--  2 
	<div ng-app="" ng-init="firstName='vico'">
		<p>name:<span ng-bind="firstName"></span></p>
	 </div> -->

	<!-- 	3
	<div data-ng-app="" data-ng-init="firstName='vico'">
		<p>name:<span data-ng-bind="firstName"></span></p>
	 </div> -->

	<!-- 	4
	<div ng-app="myApp" ng-controller="myCtrl">
		名: <input type="text" ng-model="firstName"><br>
		姓: <input type="text" ng-model="lastName"><br>
	<br>
		姓名: {{firstName + " " + lastName}} -->
		
		<!-- 5
		<p>不使用 ng-app 指令，表达式原因输出，不会被 Angularjs 解析。</p>
		<div>
			<p>我的第一个表达式: {{ 5 + 5 }}</p>
		</div> -->
		
		<!-- 	6
		<div ng-app="" ng-init="quantity=1;cost=5">
			<p>总价: {{ quantity * cost }}</p>
		</div> -->
		
	<!-- 	7
		<div ng-app="" ng-init="quantity=1;cost=5">
			<p>总价: <span ng-bind="quantity * cost"></span></p>
		</div> -->
		
		<!-- 8
		<div ng-app="" ng-init="firstName='John';lastName='Doe'">
			<p>姓名: {{ firstName + " " + lastName }}</p>
		</div> -->
		<!-- 9
		<div ng-app="" ng-init="firstName='John';lastName='Doe'">
			<p>姓名: <span ng-bind="firstName + ' ' + lastName"></span></p>
		</div> -->
		<!-- 10
		<div ng-app="" ng-init="person={firstName:'John',lastName:'Doe'}">
			<p>姓为 {{ person.lastName }}</p>
		</div> -->
		<!-- 11
		<div ng-app="" ng-init="person={firstName:'John',lastName:'Doe'}">
			<p>姓为 {{ person.lastName }}</p>
		</div> -->
		<!-- 12
		<div ng-app="" ng-init="points=[1,15,19,2,40]">
			<p>第三个值为 {{ points[2] }}</p>
		</div>
		13
		<div ng-app="" ng-init="points=[1,15,19,2,40]">
			<p>第三个值为 <span ng-bind="points[2]"></span></p>
		</div> -->
		<!-- 14
		<div ng-app="" ng-init="firstName='John'">
			<p>在输入框中尝试输入:</p>
			<p>姓名: <input type="text" ng-model="firstName"></p>
			<p>你输入的为: {{ firstName }}</p>
		</div> -->
		<!-- 15
		<div data-ng-app="" data-ng-init="quantity=1;price=5">
			<h2>价格计算器</h2>
			数量: <input type="number" ng-model="quantity">
			价格: <input type="number" ng-model="price">
			<p><b>总价:</b> {{quantity * price}}</p>
		</div> -->
		<!--  16
		<div data-ng-app="" data-ng-init="names=['Jani','Hege','Kai']">
		  <p>使用 ng-repeat 来循环数组</p>
		  <ul>
		    <li data-ng-repeat="x in names">
		      {{ x }}
		    </li>
		  </ul>
		</div>  -->
	<!-- 	17
		<div ng-app="" ng-init="names=[
			{name:'Jani',country:'Norway'},
			{name:'Hege',country:'Sweden'},
			{name:'Kai',country:'Denmark'}]">
		
		<p>循环对象:</p>
		<ul>
		  <li ng-repeat="x in names">
		  {{ x.name + ', ' + x.country }}</li>
		</ul>
		
		</div> -->
		<!--  18
		<div ng-app="myApp" ng-controller="myCtrl">
			名:  <input type="text" ng-model="firstName"><br>
			姓:  <input type="text" ng-model="lastName"><br>
			<br>
			姓名: {{firstName + " " + lastName}}
		</div> -->
		<!-- 19
		<div ng-app="myApp" ng-controller="myCtrl">
			名: <input type="text" ng-model="firstName"><br>
			姓: <input type="text" ng-model="lastName"><br>
			<br>
			姓名: {{fullName()}}
		</div> -->
		<!-- 20
		<div ng-app="myApp" ng-controller="personController">
			名: <input type="text" ng-model="person.firstName"><br>
			姓: <input type="text" ng-model="person.lastName"><br>
			<br>
			姓名: {{fullName()}}
		</div> -->
		<!-- 21
		<div ng-app="myApp" ng-controller="personCtrl">
			名: <input type="text" ng-model="firstName"><br>
			姓: <input type="text" ng-model="lastName"><br>
			<br>
			姓名: {{firstName + " " + lastName}}
		</div> -->
		<!-- 22
		<div ng-app="myApp" ng-controller="myCtrl"> 
		<ul>
		  <li ng-repeat="x in names">
		    {{ x.name + ', ' + x.country }}
		  </li>
		</ul>
		</div> -->
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
</body>
</html>