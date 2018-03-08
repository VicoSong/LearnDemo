<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
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
		// 添加商品到购物车函数
		function buy(id, pnum){
			// 判断商品是否有货
			if(pnum == 0 ){
				// 无货
				alert("您购物商品，已售罄！");
				return;
			}
			
			// 提交请求给服务器，加入购物车
			window.location.href = "${pageContext.request.contextPath}/addCart?id=" + id; 
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
									  <!-- 产品列表 -->
									  <div class="product_storyList_content">
									    <!--列表开始-->
									    <c:forEach var="product" items="${requestScope.products }">
									         <div class="product_storyList_content_left"><img src="${pageContext.request.contextPath }${product.imgurl_s}" width="55" height="55" alt="图书列表"/></div>
									         <div class="product_storyList_content_right">
									            <ul>
									              <li class="product_storyList_content_dash"><a href="productSearch?id=${product.id}" class="blue_14">${product.name }  </a></li>
									              <li>${product.description }</li>
									              <li>库存情况：
									              	<c:if test="${product.pnum >0 }">
									              		现在有货
									              	</c:if>
									              	<c:if test="${product.pnum == 0 }">
									              		暂时无货
									              	</c:if>
									              </li>
									              <li>
									              <dl class="product_content_dd">
									              <dd>
									              	<!-- 购物商品 图片 -->
									            	  <img src="images/product_buy_01.gif" alt="shopping" 
									            	  	onclick="buy(${product.id},${product.pnum });"/>
									              </dd>
									              <dd>节省：￥${product.marketprice-product.estoreprice }</dd>
									              <dd>折扣：
									              	<fmt:formatNumber value="${product.estoreprice*10 /product.marketprice }"  maxFractionDigits="2" minFractionDigits="2"/>
									              </dd>
									              <dd class="footer_dull_red">${product.estoreprice }</dd>
									               <dd class="product_content_delete">${product.marketprice }</dd>
									              </dl>
									              　</li>
									           </ul>
									      </div>
									       <div class="product_storyList_content_bottom"></div>
									       </c:forEach>
									       <!--列表结束-->
									   <div>
									       <dl class="product_content_dd">
									       <dd><img src="images/OK.gif" alt="ok"/></dd>
									       <dd>页</dd>
									       <dd><input name="page" type="text" value="1" style="width:20px;"/></dd>
									       <dd>跳转到第</dd>
									       <dd><img src="images/next.gif" alt="ok"/></dd>
									       <dd><ul id="product_page">
									         <li><a href="#" class="product_page">1</a></li>
									         <li><a href="#" class="product_page">2</a></li>
									         <li><a href="#" class="product_page">3</a></li>
									         <li>...</li>
									         <li><a href="#" class="product_page">14</a></li>
									         <li><a href="#" class="product_page">15</a></li>
									         <li><a href="#" class="product_page">16</a></li>
									         </ul>
									       </dd> 
									       <dd><img src="images/product_page_up.gif" alt="ok"/></dd>
									       </dl>
									   </div>
									  </div>
									  <!-- 产品列表结束 -->                        
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