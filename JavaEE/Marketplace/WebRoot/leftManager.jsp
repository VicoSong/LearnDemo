<%@ page contentType="text/html; charset=gb2312"%>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<script Language="JavaScript">
 function quit() {
  if(confirm("ȷ��Ҫ�˳���̨��")){
    window.location.href="loginOut.jsp";
	}
  }
 </script>
<script language="javascript">   
  window.onbeforeunload   =   function   ()   
  {   
            if   (event.clientY   <   0   &&   event.clientX>document.body.scrollWidth)   {   
           window.location.href="loginOut.jsp";
        }   
  }   
  </script>
<link href="css/css.css" rel="stylesheet" type="text/css">
<table width="182" border="0" align="center" cellpadding="0"
	cellspacing="0">
	<tr>
		<td height="59" colspan="106" background="image/zuocedaohang1.jpg">
		</td>
	</tr>
	<tr>
		<td height="55" colspan="106" background="image/zuocedaohang2.jpg"><p
				align="center" class="linkBlack">
				<a href="goodsAction.do?action=0">��Ʒ����<br> Goods Manager
				</a>
			</p></td>
	</tr>
	<tr>
		<td height="45" colspan="106" background="image/zuocedaohang3.jpg"><p
				align="center" class="linkBlack">
				<a href="memberAction.do?action=2">��Ա����<br> Member Manager
				</a>
			</p></td>
	</tr>
	<tr>
		<td height="45" colspan="106" background="image/zuocedaohang4.jpg"><p
				align="center" class="linkBlack">
				<a href="managerAction.do?action=1">��̨����Ա����<br>
					Administrator Manager
				</a>
			</p></td>
	</tr>
	<tr>
		<td height="45" colspan="106" background="image/zuocedaohang5.jpg"><p
				align="center" class="linkBlack">
				<a href="orderAction.do?action=0">��������<br> Order Manager
				</a>
			</p></td>
	</tr>
	<tr>
		<td height="45" colspan="106" background="image/zuocedaohang6.jpg"><p
				align="center" class="linkBlack">
				<a href="afficheAction.do?action=0">��������<br> Manager
					Placard
				</a>
			</p></td>
	</tr>
	<tr>
		<td height="45" colspan="106" background="image/zuocedaohang7.jpg"><p
				align="center" class="linkBlack">
				<a href="linkAction.do?action=0">������������<br> Link Manager
				</a>
			</p></td>
	</tr>
	<tr>
		<td colspan="106" height="62" background="image/zuocedaohang8.jpg"
			class="linkBlack"><p align="center">
				<a href="javascript:quit()">�˳���̨<br> Exit Background
				</a>
			</p></td>
	</tr>
</table>
