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
										<!-- 生成订单表单 -->
									    <!-- 收货人表单 -->
										<form action="${pageContext.request.contextPath }/orderAdd" method="post">
											<table>
												<tr>
													<td>收货人信息</td>
													<td><textarea rows="5" cols="80" name="receiverinfo"></textarea> </td>
												</tr>
												<tr>
													<td>支付方式</td>
													<td style="color:red"><input type="radio" checked="checked" />在线支付</td>
												</tr>
											</table>
											<!-- 购物车中商品信息 -->
											<h3>购物车信息</h3>
											<div class="shopping_list_border">
										  <table width="100%" border="0" cellspacing="0" cellpadding="0">
										     <tr class="shopping_list_title">
										       <td class="shopping_list_title_1">商品名</td>
										       <td class="shopping_list_title_2">库存数量</td>
										       <td class="shopping_list_title_3">市场价</td>
										       <td class="shopping_list_title_4">Estore打折价</td>
										       <td class="shopping_list_title_5">数量</td>
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
									       	${entry.value }
									       </td>
									   	  	<c:set var="saveprice" scope="page" value="${saveprice + (entry.key.marketprice-entry.key.estoreprice)*entry.value }"></c:set>
									  		<c:set var="totalprice" scope="page" value="${ totalprice + entry.key.estoreprice * entry.value}"></c:set>
									   </tr>
									     </c:forEach>
										   </table>  
										     <div class="shopping_list_end">
										      <ul>
										       <li class="shopping_list_end_1"></li>
									       <li class="shopping_list_end_2">￥${totalprice }</li>
									       <li class="shopping_list_end_3">商品金额总计：</li>
									       <li class="shopping_list_end_4">您共节省：<label class="shopping_list_end_yellow">￥${saveprice }</label></li>
										      </ul>
										     </div>
										  </div>
										  	<!-- 隐藏域  订单总金额 -->
										  	<input type="hidden" name="totalprice" value="${totalprice }"/>
											<input type="submit" value="生成订单" />
										</form>
									    <!-- 生成订单结束 -->                        
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