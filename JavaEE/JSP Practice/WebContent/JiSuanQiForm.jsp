<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<% request.setCharacterEncoding("gb2312"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>¼ÆËãÆ÷</title>
</head>
<body>
	<center>
		<h1>¼ÆËãÆ÷</h1>
		<hr>
			<form action="result.jsp" method="post">
				<input type="text" name="number1">
				<select name="operation">
					<option value="add">+</option>
					<option value="minus">-</option>
					<option value="multiply">*</option>
					<option value="divide">/</option>
				</select>
				<input type="text" name="number2"></input>
				<input type="submit"  value="¼ÆËã"></input>
				<input type="reset"   value="ÖØÖÃ"></input>
			</form>
	</center>
	
</body>
</html>