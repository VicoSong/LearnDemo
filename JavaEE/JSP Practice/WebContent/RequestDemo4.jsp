<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>ʹ��request�����ò��������в���ֵ</title>
</head>
<body>
	<%--ͨ��request�����getParameterValues��ò��������в���ֵ --%>
	<%
		String[] strArr=request.getParameterValues("sport");
		out.println("ϲ�����˶���");
		for(String str:strArr)
		{
			out.println(str);
		}
	%>
</body>
</html>