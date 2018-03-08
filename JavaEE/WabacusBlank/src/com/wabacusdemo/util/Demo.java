package com.wabacusdemo.util;


public class Demo {
	public void beforeFileUpload() 
	{
		//获取文件名
		String srcPath="D:\\图片\\我的图片\\012\\youjiao.jpeg";
		String imgName=srcPath.substring(srcPath.lastIndexOf("\\"));
		//设置新文件名
		String newName="sm"+imgName;
		String savePath="d:\\"+imgName;  //设定存储路径
		//获取工程所在的路径
		String projectPath=System.getProperty("user.dir");
		String rootUrl=projectPath;
		String smSavePath="d:\\"+newName;
		//制作缩略图
		OperateImage.resizeImage(srcPath, smSavePath, 100, 100);
	}
	
	public static void main(String[] args)
	{
		/*String path=System.getProperty("user.dir");
		System.out.println(path);*/
		Demo demo=new Demo();
		demo.beforeFileUpload();
	}
}
