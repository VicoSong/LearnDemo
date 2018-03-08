/*
 需求：定义一个数组工具类，该类中包括选择排序、冒泡排序、打印数组等功能。
 思路：
 步骤：
1.定义一个类
2.定义获取最大值方法
3.定义获取最小值方法
5.定义冒泡排序法
6.定义选择排序法
7.定义打印数组功能
 */
/**
 * 这是一个数组工具类，主要包括数组进行操作的一些基本方法如:获取数组中的最大最小值、选择排序、冒泡排序、打印数组等功能。
 * @author 宋维康
 * @version 1.0
 * */
public class ArrayTools {
	
	/**
	 * 选择排序
	 * @param arr接受int型数组
	 */
	
	public static void selectSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
	}
	
	/**
	 * 选择排序
	 * @param arr接受int型数组
	 */
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
					
			}
		}
	}
	
	/**
	 * 从数组中查找指定 的元素
	 * @param arr 接受int型数组
	 * @param keyWord 接受要查找的int型数据
	 * @return 返回查找结果
	 */
	public static int getIndex(int[] arr,int keyWord)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==keyWord)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 从数组中查找指定 的元素
	 * @param arr接受int型数组
	 * @param keyWord接受要查找的int型数据
	 * @return 返回查找结果
	 */
	public static int halfSearch(int[] arr,int key)
	{
		int min,mid,max;
		min=0;
		max=arr.length-1;
		mid=(min+max)/2;
		while(mid!=key)
		{
			if(key>mid)
			{
				min=mid+1;
			}
			else if(key<mid)
			{
				max=mid-1;
			}
			
			if(min>max)
			{
				return -1;
			}
		}
		return mid;
	}
	//折半查找另一种表现形式
	public static  int halfSearch_2(int[] arr,int key)
	{
		int min=0,max=arr.length-1,mid;
		while(min<=max)
		{
			mid=(min+max)>>1;
			if(key>arr[mid])
			{
				min=mid+1;
			}
			else if(key<arr[mid])
			{
				max=mid-1;
			}
			else
				return mid;
		}
		return -1;
	}
	/**
	 * 获取数组中的最大值
	 * @param arr接受int型数组
	 * @return 返回int型的数组中的最大值*/
	  public static int max1(int[] arr)
	  {
		  int temp=arr[0];
		  for(int i=0;i<arr.length;i++)
		  {
			  if(arr[i]>temp)
			  {
				  temp=arr[i];
			  }
		  }
		  return temp;
	  }
	  /**
		 * 获取数组中的最小值
		 * @param arr 接受int型数组
		 * @return 返回int型的数组中的最小值*/
		  public static int min(int[] arr)
		  {
			  int temp=arr[0];
			  for(int i=0;i<arr.length;i++)
			  {
				  if(arr[i]<temp)
				  {
					  temp=arr[i];
				  }
			  }
			  return temp;
		  }
	 
	
	//打印数组
	/**
	 * 打印数组
	 * @param arr接受int型数组
	 */
	public static void printArry(int[] arr)
	{
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			if(i<arr.length-1)
			{
				System.out.print(arr[i]+",");
			}
			else
				System.out.println(arr[i]+"]");
		}
	}
	
}
