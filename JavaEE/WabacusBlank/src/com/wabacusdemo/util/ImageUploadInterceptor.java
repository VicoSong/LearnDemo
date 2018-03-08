package com.wabacusdemo.util;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;


import com.wabacus.system.intercept.AbsFileUploadInterceptor;

public class ImageUploadInterceptor extends AbsFileUploadInterceptor{

	String savePath="";
	String rootPath="";
	String smIamgePath="";
			
	//在显示文件上传对话框前
	public boolean beforeDisplayFileUploadInterface(HttpServletRequest request,Map<String, String> mFormAndConfigValues, PrintWriter out) 
	{
		 
		return super.beforeDisplayFileUploadInterface(request, mFormAndConfigValues, out);
	}

	//在显示确认上传文件前
	public boolean beforeDisplayFileUploadPrompt(HttpServletRequest request, List lstFieldItems,Map<String, String> mFormAndConfigValues, String failedMessage, PrintWriter out)
	{
		
		return super.beforeDisplayFileUploadPrompt(request, lstFieldItems, mFormAndConfigValues, failedMessage, out);
	}

	//在文件上传之前,设定存储路径、制作缩略图、设定rootUrl
	public boolean beforeFileUpload(HttpServletRequest request, FileItem fileitemObj,Map<String, String> mFormAndConfigValues, PrintWriter out) 
	{
		//获取文件名
		String srcPath=fileitemObj.getName();
		String imgName=srcPath.substring(srcPath.lastIndexOf("\\"));
		//设置新文件名
		String newName="sm"+imgName;
		String savePath="M:\\"+imgName;  //设定存储路径
		//获取工程所在的路径
		String projectPath=System.getProperty("user.dir");
		
		String smSavePath="M:\\"+newName;
		//制作缩略图
		OperateImage.resizeImage(srcPath, smSavePath, 100, 100);
		
		mFormAndConfigValues.put(SAVEPATH_KEY, savePath);			//动态更新上传路径
			

		return super.beforeFileUpload(request, fileitemObj, mFormAndConfigValues, out);
	}
	
	
	
}
