package com.swk;

public class Demo {
  public static void main(String args[])
  {
	 int num[]=new int[]{1,3,5,7,9,11,13,15};
	 for(int i=0;i<num.length;i++)
	 {
		 for(int j=0;j<num.length;j++)
		 {
			 for(int k=0;k<num.length;k++)
			 {
				 if(num[i]+num[j]+num[k]==30)
				 {
					 System.out.println(num[i]+"\t"+num[j]+"\t"+num[k]);
				 }
			 }
		 }
	 }
	 System.out.println("Çî¾ÙÍê³É£¡");
  }
}
