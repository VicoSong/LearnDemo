package com.swk.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

/**
 *Description:This servlet is used to complete the file upload fuction
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UploadServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");
		//1.create a factory for disk-based file item
		DiskFileItemFactory dfif=new DiskFileItemFactory();
		//设置上传文件的缓存的大小
		dfif.setSizeThreshold(1024*1024);
		//设置指定的临时文件存储目录
		dfif.setRepository(new File(getServletContext().getRealPath("/temp")));
		//2.create a new file upload handler
		ServletFileUpload sfu=new ServletFileUpload(dfif);
		//获取文件开始上传的时间
		long startTime=System.currentTimeMillis();
		//为文件上传的过程,增加监听器（监听文件上传的过程）
		sfu.setProgressListener(new ProgressListener() {
			
			/* 
			 * update(long pBytesRead, long pContentLength, int pItems)
			 * 	*作用：用于监听文件上传过程的状态信息
			 * 	*pBytesRead：到目前为止已经读取上传文件的大小
			 * 	*pContentLength：上传文件的总大小
			 * 	*pItems：当前上传文件是表单的第几个元素
			 * 
			 * 计算一下四个结果：
			 * 	*已用时间=当前时间-开始时间
			 * 	*上传速度=已经上传的大小、已用时间
			 * 	*剩余大小=总大小-已经上传的大小
			 * 	*剩余时间=剩余大小/上传速度
			 * 
			 */
			public void update(long pBytesRead, long pContentLength, int pItems) {
				//获取当前时间
				long currentTime=System.currentTimeMillis();
				//已用时间
				long useTime=currentTime-startTime;
				//上传速度
				long speed=pBytesRead/useTime;
				//剩余大小
				long restBytes=pContentLength-pBytesRead;
				//剩余时间
				long restTime=restBytes/speed;
				System.out.println("当前上传速度："+speed+",\t已经上传："+pBytesRead+",\t剩余："+restBytes+"没有上传完成，预计要需要："+restTime+"才能完成上传");
				
			}
		});
		//限制单个文件上传的大小为3M
		sfu.setFileSizeMax(1024*1024*3);
		//限制上传文件的总大小位10M
		sfu.setSizeMax(1024*1024*10);
		//3.use ServletFileUpload instance object to parse file upload content which in request object
		try {
			List<FileItem> itemList=sfu.parseRequest(request);
			for(FileItem item : itemList)
			{
			
				/*
				 * 通过FileItem.isFormField()判断是普通项还是文件项
				 * 	*true:代表是普通项
				 * 	*false:代表是文件项
				 * */
				if(item.isFormField())
				{
					//普通项
					/*
					 * getFieldName():获取普通项的name属性值
					 * getString():获取普通项的文本内容
					 * 
					 * 
					 * */
					String fieldName=item.getFieldName();
				
					String fieldValue=item.getString("UTF-8");
					System.out.println(fieldName+":"+fieldValue);
				}else {
					//文件项
					/*
					 * getName():获取文件项的上传文件名
					 * getInputStream()：获取文件项的上传文件输入流
					 * */
					String fileName=item.getName();
					System.out.println(fileName);
					InputStream in=item.getInputStream();
					
					//将上传目录进行分级处理
					int hashcode=fileName.hashCode();
					//生成一级目录
					int d1=hashcode&0xf;
					//生成二级目录
					int d2=(hashcode>>>4)&0xf;
					
					
					String realPath=getServletContext().getRealPath("/saveuploads");
					File file=new File(realPath,fileName);
					OutputStream out=new FileOutputStream(file);
					IOUtils.copy(in,out);
					in.close();
					out.close();
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		
	}

}
