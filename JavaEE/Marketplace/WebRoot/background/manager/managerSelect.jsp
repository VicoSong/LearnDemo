<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.ManagerForm"%>
<%
List list=(List)request.getAttribute("list");
ManagerForm manager=(ManagerForm)session.getAttribute("manager");
int sigh=manager.getSigh().intValue();
int number=Integer.parseInt((String)request.getAttribute("number"));
int maxPage=Integer.parseInt((String)request.getAttribute("maxPage"));
int pageNumber=Integer.parseInt((String)request.getAttribute("pageNumber"));
int start=number*7;//��ʼ����
int over=(number+1)*7;//��������
int count=pageNumber-over;//��ʣ��������¼
if(count<=0){
  over=pageNumber;
  }
%>
<script Language="JavaScript">
 function deleteManager(date) {
  if(confirm("ȷ��Ҫɾ����")){
    window.location="managerAction.do?action=4&id="+date;
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
	<table width="755" border="0" align="center" cellpadding="0"
		cellspacing="0">

		<tr valign="bottom">
			<td height="108" colspan="2" background="image/banner1.jpg"><div
					align="center">
					<jsp:include page="../upTwo.jsp" />
				</div></td>
		</tr>
		<tr>
			<td width="24%" height="390"><jsp:include
					page="../../leftManager.jsp" /></td>
			<td width="76%" bgcolor="#FFFFFF" class="linkBlack">
				<div align="center">
					<table width="90%" height="16" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td bgcolor="#E6E6E6"><div align="center" class="dhz">
									<font color="#990000"><b>����Ա��Ϣ�Ĳ�ѯ</b></font>
								</div></td>
						</tr>
					</table>
					<br>
					<br>

					<table width="90%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="20%" height="20" colspan="4"><div align="right">
									<a href="managerAction.do?action=7">�޸���������</a><span class="zi">&nbsp;&nbsp;&nbsp;</span>
								</div></td>
						<tr>
					</table>
					<table width="90%" border="1" cellspacing="0" cellpadding="0">

						<tr class="zi">
							<td width="20%" height="25"><div align="center">
									<span class="zi">���ݱ��</span>
								</div></td>
							<td width="20%"><div align="center">
									<span class="zi">����Ա�˺�</span>
								</div></td>
							<td width="20%"><div align="center">
									<span class="zi">����Ա����</span>
								</div></td>

							<%if(sigh==1){%>
							<td width="44%"><div align="center">
									<span class="zi">����</span>
								</div></td>
							<%}else{}%>
						</tr>
						<%for(int i=start;i<over;i++){
      ManagerForm form=(ManagerForm)list.get(i);
          %>
						<tr class="zi">
							<td height="30"><div align="center">
									<span class="zi"><%=form.getId()%></span>
								</div></td>
							<td><div align="center">
									<span class="zi"><%=form.getAccount()%></span>
								</div></td>
							<td><div align="center">
									<span class="zi"><%=form.getName()%></span>
								</div></td>
							<%if(sigh==1){%>
							<td><div align="center">

									<span class="zi"><a
										href="managerAction.do?action=5&account=<%=form.getAccount()%>">�޸�</a>&nbsp;&nbsp;&nbsp;&nbsp;
										<%if(form.getSigh().intValue()==0){%> <a
										href="javascript:deleteManager('<%=form.getId()%>')">ɾ��</a> <%}else{%>ɾ��<%}%>
									</span>
								</div></td>
							<%}else{}%>
						</tr>
						<%}%>
					</table>
					<span class="zi"><br> </span>
					<table width="90%" border="0" align="center" cellpadding="0"
						cellspacing="0">
						<tr align="center" class="zi">
							<td width="13%"><span class="zi">��Ϊ<%=maxPage%>ҳ
							</span></td>
							<td width="16%"><span class="zi">����<%=pageNumber%>����¼
							</span></td>
							<td width="14%"><span class="zi">��ǰΪ��<%=number+1%>ҳ
							</span></td>
							<td width="19%"><span class="zi">
									<%if((number+1)==1){%> ��һҳ<%}else{%><a
									href="managerAction.do?action=1&i=<%=number-1%>">��һҳ</a>
							</span></td>
							<%}%>
							<td width="18%"><span class="zi">
									<%if(maxPage<=(number+1)){%>��һҳ<%}else{%><a
									href="managerAction.do?action=1&i=<%=number+1%>">��һҳ</a>
							</span></td>
							<%}%>
							<%if(sigh==1){%>
							<td width="20%">
								<div align="right">
									<span class="zi"><a href="managerAction.do?action=2">��ӹ���Ա</a>&nbsp;&nbsp;&nbsp;&nbsp;</span>
								</div>
							</td>
							<%}else{%>
							<%}%>
						</tr>
					</table>

				</div>
			</td>
		</tr>
		<tr bgcolor="#FFFFFF">
			<td height="60" colspan="2"><p align="center">
					<span class="zi"><jsp:include page="../downNews.jsp" /> </span>
				</p></td>
		</tr>
	</table>
</body>
</html>
