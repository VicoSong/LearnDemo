<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>validate user info</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript">
		function createXMLHttpRequest(){
			try{
				return new XMLHttpRequest();
			}catch(e){
				try{
					return ActiveXObject("Msxml2.XMLHTTP");
				}catch(e){
					try{
						return ActiveXObject("Microsoft.XMLHTTP");
					}catch(e){
						alert("创建XMLHttpRequest对象失败");
					  	throw e;
					}
				}
			
			}
		}
		
		
		window.onload=function(){
			var usernametext=document.getElementById("usernametext");
			 usernametext.onblur=function(){
			 		var xmlHttp=createXMLHttpRequest();
					xmlHttp.open("POST","<c:url value='/ValidateAjax'/>",true);
					xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
					xmlHttp.send("username="+usernametext.value);
					xmlHttp.onreadystatechange=function(){
						if(xmlHttp.readystate==4 & xmlHttp.status==200)
						{
							var resptext=xmlHttp.responseText;
							var errormsgspan=document.getElementById("errormsgspan");
							if(resptext=="1")
							{
								
								errormsgspan.innerHTML="此用户名已经被注册！";
							}else{
								errormsgspan.innerHTML="此用户名未被注册！";
							}
						}		
				};
			 };
		};
	</script>
  </head>
  
  <body>
    	<h1>用Ajax技术验证用户信息</h1>
    	<form action="" method="post">
    		用户名：<input type="text" name='username' id='usernametext'><span name='errormsg' id="errormsgspan"></span><br>
    		密码：<input type="password" name="password"><br>
    		<input type="submit"  value="提交"> 
    	</form>
  </body>
</html>
