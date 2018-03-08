<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Estore购物商城</title>

    <link rel="stylesheet" href="style.css" type="text/css" media="screen" />
    <!--[if IE 6]><link rel="stylesheet" href="style.ie6.css" type="text/css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" href="style.ie7.css" type="text/css" media="screen" /><![endif]-->
    
    <script type="text/javascript" src="script.js"></script>
    <script type="text/javascript">
    	// 修改购物车中商品数量
    	function changeBuyNum(id,maxnum, num){
    		// 对修改后数量合法性校验 
    		var regexp = /^[0-9]+$/;
    		if(regexp.test(num)){
    			// 符合表达式，合法正整数
    			// 判断购买数量不能超过存货数量 
    			if(num>maxnum){
    				// 存货不足
    				alert("商品购买数量，不能超过库存数量！");
    			}else{
    				// 允许购买
		    		// alert("id:" + id + ",num:" + num);
    				window.location.href= "${pageContext.request.contextPath}/updateCartProductNum?id="+id+"&num="+num;
    			}
    		}else{
    			// 不符合
    			alert("修改后的商品数量，必须为正整数！");
    		}
    		
    		
    	}
    </script>
</head>
<body>
<div id="art-main">
        <div class="art-sheet">
            <div class="art-sheet-tl"></div>
            <div class="art-sheet-tr"></div>
            <div class="art-sheet-bl"></div>
            <div class="art-sheet-br"></div>
            <div class="art-sheet-tc"></div>
            <div class="art-sheet-bc"></div>
            <div class="art-sheet-cl"></div>
            <div class="art-sheet-cr"></div>
            <div class="art-sheet-cc"></div>
            <div class="art-sheet-body">
                <%@include file="header.jsp" %>
                <div class="art-content-layout">
                    <div class="art-content-layout-row">
                        <div class="art-layout-cell art-content">
                            <div class="art-post">
                                <div class="art-post-tl"></div>
                                <div class="art-post-tr"></div>
                                <div class="art-post-bl"></div>
                                <div class="art-post-br"></div>
                                <div class="art-post-tc"></div>
                                <div class="art-post-bc"></div>
                                <div class="art-post-cl"></div>
                                <div class="art-post-cr"></div>
                                <div class="art-post-cc"></div>
                                <div class="art-post-body">
									  <!-- 购物车列表 -->
									  <div>&nbsp;&nbsp;<img src="images/shopping_myshopping.gif" alt="shopping"/> <a href="#">全场免运费活动中</a></div>
									  <div class="shopping_list_top">您已选购以下商品</div>
									  <br/>
									  <div class="shopping_list_border">
									  <table width="100%" border="0" cellspacing="0" cellpadding="0">
									     <tr class="shopping_list_title">
									       <td class="shopping_list_title_1">商品名</td>
									       <td class="shopping_list_title_2">存货数量</td>
									       <td class="shopping_list_title_3">市场价</td>
									       <td class="shopping_list_title_4">Estore打折价</td>
									       <td class="shopping_list_title_5">数量</td>
									       <td class="shopping_list_title_6">删除</td>
									    </tr>
									    </table>
									    <table width="100%" border="0" cellspacing="0" cellpadding="0">
									    <!-- saveprice 节省金额，totalprice 总金额  -->
									  	<c:set var="saveprice" scope="page" value="0"></c:set>
									  	<c:set var="totalprice" scope="page" value="0"></c:set>
									   <c:forEach var="entry" items="${sessionScope.cart }">
									   <tr class="shopping_product_list" id="shoppingProduct_01">
									       <td class="shopping_product_list_1"><a href="#" class="blue">${entry.key.name }</a></td>
									       <td class="shopping_product_list_2">${entry.key.pnum }</td>
									       <td class="shopping_product_list_3">￥${entry.key.marketprice }</td>
									       <td class="shopping_product_list_4">￥${entry.key.estoreprice } (
									       	<fmt:formatNumber value="${entry.key.estoreprice*10/entry.key.marketprice}" maxFractionDigits="2" minFractionDigits="2"/>折)</td>
									       <td class="shopping_product_list_5">
									       	<!-- 购物车 商品购物数量显示  -->
									       	<input type="text" value="${entry.value }" onblur="changeBuyNum(${entry.key.id},${entry.key.pnum },this.value);"/> 
									       </td>
									       <td class="shopping_product_list_6">
									       	<!-- 删除购物车 商品 -->
									       	<a href="${pageContext.request.contextPath }/delCartProduct?id=${entry.key.id}" class="blue">删除</a>
									       </td>
									   	  	<c:set var="saveprice" scope="page" value="${saveprice + (entry.key.marketprice-entry.key.estoreprice)*entry.value }"></c:set>
									  		<c:set var="totalprice" scope="page" value="${ totalprice + entry.key.estoreprice * entry.value}"></c:set>
									   </tr>
									     </c:forEach>
									   </table>  
									     <div class="shopping_list_end">
									      <ul>
									       <li class="shopping_list_end_1"><input type="image" src="images/shopping_balance.gif" onclick="window.location='${pageContext.request.contextPath}/order_add.jsp';" /></li>
									       <li class="shopping_list_end_2">￥${totalprice }</li>
									       <li class="shopping_list_end_3">商品金额总计：</li>
									       <li class="shopping_list_end_4">您共节省：<label class="shopping_list_end_yellow">￥${saveprice }</label></li>
									      </ul>
									     </div>
									  </div>
									  <!-- 购物车列表结束 -->                        
                           			<div class="cleared"></div>
                                </div>
                            </div>
                        </div> 
                        <%@include file="sidebar.jsp" %>
                    </div>
                </div>
                <div class="cleared"></div>
                <%@include file="footer.jsp" %> 
        		<div class="cleared"></div>
            </div>
        </div>
        <div class="cleared"></div>
    </div>
    
</body>
</html>