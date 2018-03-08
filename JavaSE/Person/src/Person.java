class Person1
{
	 private String name;
	 private int age;
	 public  Person1()
	 {
	 }
	 public void setName(String str)
	 {
		 this.name=str;
	 }
	 public void setAge(int a)
	 {
		 this.age=a;
	 }
	 public String talk()
	 {
		 return "我是"+this.name+",我今年"+this.age+"岁了";
				 
	 }
	 
}
class Student extends Person1{
	String school;
  public Student()
  {
	  super.setName("张三");
	  super.setAge(25);
	  
  }
}
public class Person {
	 
	public static void main(String args[])
	{
		Person1  s=new Student();
		//s.school="北京";
		System.out.println(s.talk());
	}
	
}
