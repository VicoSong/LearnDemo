<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>ע���</title>
</head>
<body>
	<% request.setCharacterEncoding("gb2312");%>
	<center>
		<form action="Register.jsp"  method="post">
			<table>
				<tr>
					<td colspan="2">�û�ע��</td>
				</tr>
				<tr>
					<td>�û�����</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>��&nbsp;&nbsp;�룺</td>
					<td><input type="password" name="userpassword"></td>
				</tr>
				<tr>
					<td colspan="2">
					<input type="submit" value="ע��">
					<input type="reset"  value="����">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>