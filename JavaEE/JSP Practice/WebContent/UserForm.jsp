<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
    <%request.setCharacterEncoding("gb2312"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Insert title here</title>
</head>
<body>
	
	<center>
		<form action="SetProperty.jsp" method="post">
			<table>
				<tr>
					<td colspan="2">用户表单</td>
				</tr>
				<tr>
					<td>用户名</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>密&nbsp;&nbsp;码</td>
					<td><input type="password" name="userPassword"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="提交">
						<input type="reset"  value="重置">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>