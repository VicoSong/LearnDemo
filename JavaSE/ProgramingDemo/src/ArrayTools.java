/*
 ���󣺶���һ�����鹤���࣬�����а���ѡ������ð�����򡢴�ӡ����ȹ��ܡ�
 ˼·��
 ���裺
1.����һ����
2.�����ȡ���ֵ����
3.�����ȡ��Сֵ����
5.����ð������
6.����ѡ������
7.�����ӡ���鹦��
 */
/**
 * ����һ�����鹤���࣬��Ҫ����������в�����һЩ����������:��ȡ�����е������Сֵ��ѡ������ð�����򡢴�ӡ����ȹ��ܡ�
 * @author ��ά��
 * @version 1.0
 * */
public class ArrayTools {
	
	/**
	 * ѡ������
	 * @param arr����int������
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
	 * ѡ������
	 * @param arr����int������
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
	 * �������в���ָ�� ��Ԫ��
	 * @param arr ����int������
	 * @param keyWord ����Ҫ���ҵ�int������
	 * @return ���ز��ҽ��
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
	 * �������в���ָ�� ��Ԫ��
	 * @param arr����int������
	 * @param keyWord����Ҫ���ҵ�int������
	 * @return ���ز��ҽ��
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
	//�۰������һ�ֱ�����ʽ
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
	 * ��ȡ�����е����ֵ
	 * @param arr����int������
	 * @return ����int�͵������е����ֵ*/
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
		 * ��ȡ�����е���Сֵ
		 * @param arr ����int������
		 * @return ����int�͵������е���Сֵ*/
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
	 
	
	//��ӡ����
	/**
	 * ��ӡ����
	 * @param arr����int������
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
