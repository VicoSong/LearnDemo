<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>多文件上传</title>
  <script type="text/javascript">
	function addFile()
	{
			var fileItemDiv=document.getElementById("showFile");
			fileItemDiv.innerHTML+="<div><input type='file' name='upload' /><input type='button' id='deleteButton'   value='删除' onclick='deleteFileItem(this)' /></div>";
		
	}

	function deleteFileItem(button)
	{
		 var conDiv=button.parentNode;
		
		conDiv.parentNode.removeChild(conDiv); 


	}
</script>
</head>
<body>
	<form action="" method="post"enctype="multipart/form-data">
		<input type="button" id="addFileButton" onclick="addFile()" value="文件上传"><br>
		<div id="showFile"></div>
		<input type="submit" value="上传"> 
	</form>
</body>
</html>