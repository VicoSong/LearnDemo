<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件下载</title>
</head>
<body> 
	<%-- <h3><a href="${pageContext.request.contextPath}/downs/原创诗歌.txt">原创诗歌.txt</a></h3>
	<h3><a href="${pageContext.request.contextPath}/downs/附件.zip">附件.zip</a></h3>
	<h3><a href="${pageContext.request.contextPath}/downs/英语范文.doc">英语范文.doc</a></h3>
	<h3><a href="${pageContext.request.contextPath}/downs/作文-四级.ppt">作文-四级.ppt</a></h3>
	<h3><a href="${pageContext.request.contextPath}/downs/youjiao.jpg">youjiao.jpg</a></h3> --%>
	
	<h3><a href="${pageContext.request.contextPath}/downs?filename=原创诗歌.txt">原创诗歌.txt</a></h3>
	<h3><a href="${pageContext.request.contextPath}/downs?filename=附件.zip">附件.zip</a></h3>
	<h3><a href="${pageContext.request.contextPath}/downs?filename=英语范文.doc">英语范文.doc</a></h3>
	<h3><a href="${pageContext.request.contextPath}/downs?filename=作文-四级.ppt">作文-四级.ppt</a></h3>
	<h3><a href="${pageContext.request.contextPath}/downs?filename=youjiao.jpg">youjiao.jpg</a></h3>
</body>
</html>