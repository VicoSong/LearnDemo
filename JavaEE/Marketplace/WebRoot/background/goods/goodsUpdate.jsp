<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.GoodsForm"%>
<%@page import="com.domain.BigTypeForm"%>
<%@page import="com.domain.SmallTypeForm"%>
<script language="javascript">
function checkEmpty(form){
for(i=0;i<form.length;i++){
if(form.elements[i].value==""){
alert("����Ϣ����Ϊ��");
return false;
}
}
}
</script>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>�����̳ǵĺ�̨</title>
<link href="../../css/css.css" rel="stylesheet" type="text/css">
</head>
<link href="css/css.css" rel="stylesheet" type="text/css">
<body>
	<%
GoodsForm gf=(GoodsForm)request.getAttribute("formforward");
List big=(List)request.getAttribute("bigTypeform");
List small=(List)request.getAttribute("smallTypeform");
List bigAll=(List)request.getAttribute("bigTypeAll");
List smallAll=(List)request.getAttribute("smallTypeAll");
 %>
	<table width="755" border="0" align="center" cellpadding="0"
		cellspacing="0">

		<tr valign="bottom">
			<td height="108" colspan="2" background="image/banner1.jpg"><div
					align="center">
					<jsp:include page="../upTwo.jsp" />
				</div></td>
		</tr>
		<tr>
			<td width="24%" height="318"><jsp:include
					page="../../leftManager.jsp" /></td>
			<td width="76%" height="36" bgcolor="#FFFFFF">
				<div align="center">

					<table width="99%" height="16" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td bgcolor="#E6E6E6"><div align="center" class="dhz">
									<font color="#990000"><b>�޸���Ʒ��ϸ��Ϣ</b></font>
								</div></td>
						</tr>
					</table>
					<br>
					<br>

					<form action="goodsAction.do?action=17&id=<%=gf.getId() %>"
						method="post" name="form" onSubmit="return checkEmpty(form)">
						<table width="500" border="0">
							<tr class="zi">
								<td width="159">���ݱ�ţ�</td>
								<td width="331"><input type="text" name="id"
									value=<%=gf.getId() %> disabled></td>
							</tr>
							<tr class="zi">
								<td>��Ʒ���ƣ�</td>
								<td><input type="text" name="goodsname"
									value=<%=gf.getName() %>></td>
							</tr>
							<tr class="zi">
								<td>�����</td>
								<td><select name="bigType">
										<%for(int i=0;i<bigAll.size();i++){
            		BigTypeForm bigform=(BigTypeForm)bigAll.get(i);
            		%>
										<option value=<%=bigform.getId() %>><%=bigform.getBigName() %></option>
										<%
            	} %>
								</select></td>
							</tr>
							<tr class="zi">
								<td>С���</td>
								<td><select name="smallType">
										<%for(int i=0;i<smallAll.size();i++){
            		SmallTypeForm smallform=(SmallTypeForm)smallAll.get(i);
            		%>
										<option value=<%=smallform.getId()%>><%=smallform.getSmallName() %></option>
										<%
            	} %>
								</select></td>
							</tr>
							<tr class="zi">
								<td>�Ƿ��ؼۣ�</td>
								<td><select name="or">
										<%
            if(gf.getMark().equals(1)){
             %>
										<option value=1>��</option>
										<%}else {
            %>
										<option value=0>��</option>
										<%} %>
								</select></td>
							</tr>
						</table>
						<p>&nbsp;</p>
						<p>
							<input type="submit" name="Submit2" value="�ύ"> &nbsp; <input
								type="reset" name="reset" value="���"> &nbsp; <input
								type="button" name="back" value="����"
								onClick="javasrcipt:history.go(-1)">
						</p>
					</form>
					<p>&nbsp;</p>
					<p>&nbsp;</p>
					<p>&nbsp;</p>
				</div>
			</td>
		</tr>
		<tr bgcolor="#FFFFFF">
			<td height="60" colspan="2"><p align="center"><jsp:include
						page="../downNews.jsp" />

				</p></td>
		</tr>
	</table>
</body>
</html>
