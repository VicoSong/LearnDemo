
public class ArraySort {
	// 选择排序
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
	//冒泡排序
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
	//查找数组中的元素
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
	//折半查找
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
	
	
	//打印数组
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
	public static void main(String[] args)
	{
		int[] arr=new int[]{115,86,32,84,98,15,56,35,41,52};
		System.out.print("排序前的数组为：");
		printArry(arr);
	
		System.out.print("排序后的数组为：");
		//selectSort(arr);
		bubbleSort(arr);
		printArry(arr);
	}
}
