import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IODemo {
	public static void main(String[] args) throws Exception
	{
		/*
		FileWriter fw=new FileWriter("bufferdemo.txt");
		BufferedWriter bufw=new BufferedWriter(fw);
		bufw.write("abcdefg");//注：\r\n表示换行，也可用newLine（）方法
		bufw.newLine();
		bufw.write("abcdefgjklmno");
		bufw.flush();
		bufw.close();
		FileReader fr=new FileReader("bufferdemo.txt");
		BufferedReader bufr=new BufferedReader(fr);
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			System.out.println(line);
		}
		
		bufr.close();
		*/
		
		//  listDemo();
		//listRootsDemo();
		//listFilterDemo();
		File file=new File("F:\\1");
		//removeFile(file);
		//showDir(file,3);
		List<File> list=new ArrayList<File>();
		fileToList(file,list);
		// System.out.println(list);
		File f=new File("F:3.txt");
		writeToFile(list,f.toString());
		
	}
	/*
	//list方法演示
	public static void listDemo()
	{
		File f=new File("D:\\Rescourse\\Java\\ProgramingDemo");
		String[] names=f.list();
		for(String name:names)
		{
			System.out.println(name);
		}
	}
	*/
	
	/*
	//listRoots方法演示
	public static void listRootsDemo()
	{
		File[] file=File.listRoots();
		for(File f:file)
		{
			System.out.println(f);
		}
	}
	*/
	/*
	//list 过滤文件
	public static void listFilterDemo()
	{
		File dir=new File("D:\\Rescourse\\Java\\ProgramingDemo");
		String[ ] arry=dir.list(new FilenameFilter(){
			public boolean accept(File dir,String name)
			{
				
				if(name.endsWith(".txt"))
				{
					return true;
				}
				else
					return false;
					
			//	return name.endsWith("txt");
			}
		});
		for(String name:arry)
		{
			System.out.println(name);
		}
	}
	*/
	/*
	public static String getLevel(int level)
	{
		StringBuilder sb=new StringBuilder();
		sb.append("*** ");
		for(int i=0;i<level;i++)
		{
			sb.insert(0," ###");
		}
		return sb.toString();
	}
	public static void showDir(File dir,int level)
	{
		System.out.println(dir.getName());
		level++;
		File[] files=dir.listFiles();
		System.out.println(dir);
		for(int i=0;i<files.length;i++)
		{
			if(files[i].isDirectory())
			{
				showDir(files[i],level);
			}
			else
				System.out.println(getLevel(level)+files[i]);
		}
	}
	*/
	/*
	//删除功能演示
	public static void removeFile(File dir)
	{
		File[] files=dir.listFiles();
		for(int i=0;i<files.length;i++)
		{
			if((files[i].isDirectory()))
			{
				removeFile(files[i]);
			}
			else
				System.out.println(files[i].toString()+"***filedelete***"+files[i].delete());
		}
		System.out.println(dir.toString()+"--dirdelete--"+dir.delete());
	}
	*/
	
	/*
	 需求：将一个文件夹下的所有java文件的绝对路径保存到一个文件中
	 思路：1.用递归方法，遍历该文件夹。
	 	  2.获取递归过程中所有以java结尾的文件
	 	  3.将这些路径存储到结合中
	 	  4.遍历打印集合中的元素。
	  */
	public static void fileToList(File dir,List<File> list)
	{
		File[] files=dir.listFiles();
		for(File file:files)
		{
			if(file.isDirectory())
			{
				fileToList(file,list);
			}
			else
			{
				if(file.getName().endsWith("java"))
				{
					list.add(file);
				}
			}
		}
	}
	
	
	//将数据写入文件
	public static void writeToFile(List<File> list,String fileName) throws IOException
	{
		BufferedWriter bufw=null;
		try{
			bufw=new BufferedWriter(new FileWriter(fileName));
			for(File file:list)
			{
				String path=file.getAbsolutePath();
				bufw.write(path);
				bufw.newLine();
				bufw.flush();
			}
		}
		catch(IOException e)
			{
				throw new RuntimeException();
			}
		
		finally{
			try{
				if(bufw!=null)
					bufw.close();
			}catch(IOException e){
				
			}
		}
	}
}
