<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="java.util.*"%>
<%@ page import="com.domain.SellGoodsForm"%>
<jsp:useBean id="dao" scope="page" class="com.dao.GoodsDao" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>�����̳�</title>

<link href="css/css.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div align="center">
		<table width="562" height="290" border="0" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="562" height="46" align="center" valign="center"
					background="image/gouwuche.jpg">&nbsp;</td>
			</tr>
			<tr>
				<td valign="top" bgcolor="#FFFFFF">
					<div align="center" class="zi">
						<br>
						<%if(session.getAttribute("cart")==null){%>
						����û�й������
						<%}else{%>

					</div>
					<form method="post" action="cart_modify.jsp" name="form">
						<table width="96%" border="1" align="center" cellpadding="0"
							cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#819BBC"
							bordercolorlight="#FFFFFF">
							<tr class="zi">
								<td width="16%" height="28"><div align="center">���</div></td>
								<td width="23%"><div align="center">��Ʒ������</div></td>
								<td width="22%"><div align="center">��Ʒ�۸�</div></td>
								<td width="22%"><div align="center">��Ʒ����</div></td>
								<td width="17%"><div align="center">�ܽ��</div></td>
							</tr>
							<%
            float sum=0;
        Vector cart=(Vector)session.getAttribute("cart");
        for(int i=0;i<cart.size();i++){
          SellGoodsForm form=(SellGoodsForm)cart.elementAt(i);
          sum=sum+form.number*form.price;
        
        %>
							<tr class="zi">
								<td height="28"><div align="center"><%=i+1%></div></td>
								<td><div align="center"><%=dao.selectOneGoods(new Integer(form.ID)).getName()%></div></td>
								<td><div align="center"><%=form.price%>Ԫ
									</div></td>
								<td><div align="center">
										<input name="num<%=i%>" size="7" type="text"
											value="<%=form.number%>" onBlur="check(this.form)">
									</div></td>
								<td><div align="center"><%=form.number*form.price%>Ԫ
									</div></td>
							</tr>
							<script language="javascript">
<!--
			function check(myform){
				if(isNaN(myform.num<%=i%>.value) || myform.num<%=i%>.value.indexOf('.',0)!=-1){
					alert("�벻Ҫ����Ƿ��ַ�");myform.num<%=i%>.focus();return;}
				if(myform.num<%=i%>.value==""){
					alert("�������޸ĵ�����");myform.num<%=i%>.focus();return;}
				myform.submit();
			}
-->
		</script>
							<%}%>
						</table>

					</form>

					<table width="100%" border="0" align="center" cellpadding="0"
						cellspacing="0">
						<tr align="center" valign="middle">
							<td height="10">&nbsp;</td>
							<td width="24%" height="10" colspan="-3" align="left">&nbsp;</td>
						</tr>
						<tr align="center" valign="middle">
							<td height="21" class="tableBorder_B1">&nbsp;</td>
							<td height="21" colspan="-3" align="left" class="zi">�ϼ��ܽ���<%=sum%></td>
						</tr>
						<tr align="center" valign="middle">
							<td height="21" colspan="2" class="linkBlack"><a href="#"
								onClick="javascript:window.open('cart_checkOut.jsp','','width=1024,height=768,top=5,left=5')">ȥ����̨����</a>
								| <a href="cart_clear.jsp">��չ��ﳵ</a></td>
						</tr>
					</table> <%}%>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
