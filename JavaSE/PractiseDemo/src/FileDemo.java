import java.io.*;
public class FileDemo {
	public static void main(String args[])
	{
		File file=new File("D://Ψ������.txt");
		if(file.exists()){
			String textName=file.getName();
			Boolean canReade=file.canRead();
			Boolean canWrite=file.canWrite();
			Long textLength=file.length();
			Long lastModified=file.lastModified();
			String path=file.getAbsolutePath();
			System.out.println("�ļ����ǣ�"+textName);
			System.out.println("�ܷ����"+canReade);
			System.out.println("�ܷ�д��"+canWrite);
			System.out.println("�ļ���С��"+textLength);
			System.out.println("�ļ�·����"+path);
			System.out.println("�ļ�����޸�ʱ�䣺"+lastModified);
		}
	}
}
