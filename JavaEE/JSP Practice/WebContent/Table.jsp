<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ѭ������ʮ��ʮ�б��</title>
</head>
<body>
	<center>
		<h1>ѭ������ʮ��ʮ�еı��</h1>
		<hr>
		<table border="1">
			<c:forEach var="hang" begin="1" end="10">
				<tr>
					<c:forEach var="lie" begin="1" end="10">
					<td><c:out value="a"></c:out></td>
					</c:forEach>
				</tr>
				</c:forEach>
		</table>
	</center>
</body>
</html>