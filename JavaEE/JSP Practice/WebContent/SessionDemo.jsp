<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>���ò����sessionʱ��</title>
</head>
<body>
	<%
		String strGetId=session.getId();
	    out.println("session��ID��"+strGetId);
	    Long longGetCreationTime=session.getCreationTime();
	    out.println("session���ɵ�ʱ����"+longGetCreationTime+"<br>");
	    
	    Long longGetLastAccessedTime=session.getLastAccessedTime();
	    out.println("�û����ͨ��session��������ʱ��"+longGetLastAccessedTime+"<br>");
	    
	    int  longGetMaxInactiveInterval=session.getMaxInactiveInterval();
	    out.println("�û����ͨ��session��������ʱ��"+longGetCreationTime+"<br>");
	    
	    boolean isNew=session.isNew();
	    out.println("session�Ƿ�Ϊ��"+isNew+"<br>");
	    
	    session.setMaxInactiveInterval(100);
	    
	%>
</body>
</html>