<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Hello ajax测试</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript">
		//创建XMLHttpRequest对象
		function createHttpRequest(){
			try{
				return new XMLHttpRequest();  //大多数浏览器
			}catch(e){
				try{
					return new ActiveXObject("Msxml2.XMLHTTP"); //IE6.0
				}catch(e){
					try{
						return new ActiveXObject("Microsoft.XMLHTTP");
					}catch(e)
					{
						alert("创建XMLHttpRequest对象失败");
						throw e;
					}
				}
			}
		}
	
		window.onload=function(){  //文档加载完成后执行
			var btn=document.getElementById("btn");
				btn.onclick=function(){  //给按钮的点击事件注册监听
					/*
					*ajax的四步操作得到服务器的响应
					*把响应结果显示到h1元素中
					*/
					/*
					*1.创建XMLHttpRequest对象
					*/
				var xmlHttpReq=createHttpRequest();
				/*
				*2.打开连接,设置请求方式为post
				*/
				xmlHttpReq.open("POST","<c:url value='/HelloAjax'/>",true);
				/*
				*设置ContentType请求头
				*/
				xmlHttpReq.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
				/*
				*3.发送请求,包含参数
				*/
				xmlHttpReq.send("username=vico&password=101000");
				/*
				*4.给异步对象的onreadystatechange注册事件
				*/
				xmlHttpReq.onreadystatechange=function(){
					/*
					*当xmlHttpReq状态发生变化时执行
					*双重判断：xmlHttpReq的状态为4（表示响应结束），以及服务器响应状态码为200表示响应成功
					*
					*/
					if(xmlHttpReq.readyState == 4 && xmlHttpReq.status == 200){
						//获取服务器的响应内容
						var text = xmlHttpReq.responseText;
						// 获取h1元素
						var ht = document.getElementById("ht");
						alert(ht);
						ht.innerHTML += text;
						alert(ht.innerHTML);
					}
				};
					
				};	
		};
	</script>
  </head>
  
  <body>
   	<body>
   	<div><button id="btn">点击这里</button>
		<h1 id="ht">你好</h1>
	</div>
		
  </body>
  </body>
</html>
