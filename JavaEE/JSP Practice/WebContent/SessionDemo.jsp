<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ÉèÖÃ²¢»ñµÃsessionÊ±¼ä</title>
</head>
<body>
	<%
		String strGetId=session.getId();
	    out.println("sessionµÄIDÊÇ"+strGetId);
	    Long longGetCreationTime=session.getCreationTime();
	    out.println("sessionÉú³ÉµÄÊ±¼äÊÇ"+longGetCreationTime+"<br>");
	    
	    Long longGetLastAccessedTime=session.getLastAccessedTime();
	    out.println("ÓÃ»§×îºóÍ¨¹ýsession·¢ËÍÇëÇóÊ±¼ä"+longGetLastAccessedTime+"<br>");
	    
	    int  longGetMaxInactiveInterval=session.getMaxInactiveInterval();
	    out.println("ÓÃ»§×îºóÍ¨¹ýsession·¢ËÍÇëÇóÊ±¼ä"+longGetCreationTime+"<br>");
	    
	    boolean isNew=session.isNew();
	    out.println("sessionÊÇ·ñÎªÐÂ"+isNew+"<br>");
	    
	    session.setMaxInactiveInterval(100);
	    
	%>
</body>
</html>