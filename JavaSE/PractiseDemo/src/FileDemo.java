import java.io.*;
public class FileDemo {
	public static void main(String args[])
	{
		File file=new File("D://唯美句子.txt");
		if(file.exists()){
			String textName=file.getName();
			Boolean canReade=file.canRead();
			Boolean canWrite=file.canWrite();
			Long textLength=file.length();
			Long lastModified=file.lastModified();
			String path=file.getAbsolutePath();
			System.out.println("文件名是："+textName);
			System.out.println("能否读："+canReade);
			System.out.println("能否写："+canWrite);
			System.out.println("文件大小："+textLength);
			System.out.println("文件路径："+path);
			System.out.println("文件最后修改时间："+lastModified);
		}
	}
}
