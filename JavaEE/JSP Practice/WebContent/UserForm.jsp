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
					<td colspan="2">�û���</td>
				</tr>
				<tr>
					<td>�û���</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>��&nbsp;&nbsp;��</td>
					<td><input type="password" name="userPassword"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="�ύ">
						<input type="reset"  value="����">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>