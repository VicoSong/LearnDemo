<%@ page contentType="text/html; charset=gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>��Աע��</title>
<style type="text/css">
<!--
.style1 {
	color: #FF0000
}

.style2 {
	color: #000000
}
-->
</style>
<link href="../css/css1.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
<!--
function SelectSubmit(){
	document.all.registerForm.submit();
	return true;
}
function submit1(){
	if(document.all.username.value.length==0){
	alert("����д�û���!");
		return false;
	}
	if(document.all.realname.value.length==0){
		alert("����д��ʵ����!");
		return false;
	}
	if(document.all.password1.value.length==0){
		alert("����д����!");
		return false;
	}
	if(document.all.password2.value.length==0){
		alert("����д����!");
		return false;
	}

	if(document.all.email.value.length==0){
		alert("����д�����ʼ�!");
		return false;
	}
	if(document.all.question.value.length==0){
		alert("��ѡ������!");
		return false;
	}
	if(document.all.result.value.length==0){
		alert("����д�����!");
		return false;
	}
	if(document.all.password1.value!=document.all.password2.value){
		alert("�����������벻�����");
		return false;
	}
	if(!checkemail(registerForm.email.value)){
		alert("������Email��ַ����ȷ!");registerForm.email.focus();return false;
	}

	 //��JavaScript�У�������ʽֻ��ʹ��"/"��ͷ�ͽ���������ʹ��˫����
	var Expression=/[^\u4E00-\u9FA5]/; 
	var objExp=new RegExp(Expression);
	if(objExp.test(registerForm.username.value)!=true){
		alert("�û���ֻ������Ӣ������!");
		return false;
	}
	
	document.all.registerForm.submit();
	return true;
	
}

function checkemail(email){
	var str=email;
	var Expression=/\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/; 
	var objExp=new RegExp(Expression);
	if(objExp.test(str)==true){
		return true;
	}else{
		return false;
	}
}	
function reset(){
	document.all.registerForm.reset();
}
function checkusername(){//������ӡ���鰴ť����Javascript
	 //��JavaScript�У�������ʽֻ��ʹ��"/"��ͷ�ͽ���������ʹ��˫����
	var Expression=/[^\u4E00-\u9FA5]/; 
	var objExp=new RegExp(Expression);
	if(objExp.test(registerForm.username.value)!=true){
		alert("�û���ֻ������Ӣ������!");
		return false;
	}
	else{
		window.location.href='checkuser.do?username='+registerForm.username.value
		return true;
	}
}


//-->
</script>
<script language="javascript">
function trigger(opt){
//opt��ʾ���п�ѡ�����Ŀ
	registerForm.question.options[opt]=new Option(registerForm.question.options[opt]?
	registerForm.question.options[opt].innerText+String.fromCharCode(event.keyCode):
	String.fromCharCode(event.keyCode))
	registerForm.question.selectedIndex=opt;  //���������б��ѡ����
}
</script>
<script language="javascript">
function edit(opt){
//opt��ʾ���п�ѡ�����Ŀ
	if(registerForm.question.options[opt]){
		if(event.keyCode==8){
			var str=registerForm.question.options[opt].innerText;
			var len=str.length;		registerForm.question.options[opt].innerText=str.substring(0,len-1);
			if(registerForm.question.options[opt].innerText==""){
				registerForm.question.remove(opt);
				registerForm.question.selectedIndex=1;
			};
		}
		if(event.keyCode==32){
			registerForm.question.options[opt].innerText+=" ";
		}
	}
}
</script>

</head>


<body>
	<div align="center">
		<p class="blue">
			<strong>��Աע�� </strong>
		</p>
		<form name="registerForm" method="post"
			action="../memberAction.do?action=0">
			<table width="298" border="1" cellspacing="0" cellpadding="0"
				bordercolor="#FFFFFF" bordercolordark="#819BBC"
				bordercolorlight="#FFFFFF">
				<tr>
					<td width="105" height="35" bgcolor="#EFF6FE">
						<div align="center">��Ա����</div>
					</td>
					<td width="187"><div align="center">
							<input type="text" name="username"> <span class="style1">*</span>
						</div></td>
				</tr>
				<tr>
					<td height="35" bgcolor="#EFF6FE">
						<div align="center">��Ա����</div>
					</td>
					<td><div align="center">
							<input type="password" name="password1"> <span
								class="style1">*</span>
						</div></td>
				</tr>
				<tr>
					<td height="35" bgcolor="#EFF6FE">
						<div align="center">����ȷ��</div>
					</td>
					<td><div align="center">
							<input type="password" name="password2"> <span
								class="style1">*</span>
						</div></td>
				</tr>
				<tr>
					<td height="35" bgcolor="#EFF6FE">
						<div align="center">��ʵ����</div>
					</td>
					<td><div align="center">
							<input type="text" name="realname"> <span class="style1">*</span>
						</div></td>
				</tr>
				<tr>
					<td height="35" bgcolor="#EFF6FE">
						<div align="center">����</div>
					</td>
					<td><div align="center">
							<input type="text" name="age" value="18"> <span
								class="style2">*</span>
						</div></td>
				</tr>
				<tr>
					<td height="35" bgcolor="#EFF6FE">
						<div align="center">ְҵ</div>
					</td>
					<td><div align="center">
							<input type="text" name="profession" value="ѧ��"> <span
								class="style2">*</span>
						</div></td>
				</tr>
				<tr>
					<td height="35" bgcolor="#EFF6FE">
						<div align="center">Email��ַ</div>
					</td>
					<td><div align="center">
							<input name="email" type="text"> <span class="style1">*</span>
						</div></td>
				</tr>
				<tr>
					<td height="35" bgcolor="#EFF6FE">
						<div align="center">�һ���������</div>
					</td>
					<td><div align="center">
							<select id="question" onkeypress="trigger(3)" onkeyup="edit(3)"
								name="question">
								<option value="1+1=��">1+1=</option>
								<option value="�ҵİ�����ʲô��">�ҵİ�����ʲô��</option>
								<option value="����ʲô��">�ҵİ�����ʲô��</option>
							</select> <span class="style1">*</span>
						</div></td>
				</tr>
				<tr>
					<td height="35" bgcolor="#EFF6FE">
						<div align="center">��</div>
					</td>
					<td><div align="center">
							<input type="text" name="result"> <span class="style1">*</span>
						</div></td>
				</tr>
			</table>
			<p>
				<span class="style1">*</span>��<span class="blue">���������Ŀ</span> *��<span
					class="blue">����Ǳ�����Ŀ</span>
			</p>
			<p>
				<input type="button" name="Submit2" value="�ύ"
					onClick="return submit1();"> &nbsp;&nbsp; <input
					type="reset" name="Submit3" value="����">
			</p>
			</p>
		</form>
		<p>&nbsp;</p>
	</div>
</body>
</html>
