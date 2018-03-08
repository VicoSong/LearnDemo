class Person{
	String name;
	int age;
	public void f1()
	{
		System.out.println("f1");
	}
	public void f2()
	{
		System.out.println("f2");
	}
}
class Student extends Person{
	String school;
	public void f1()
	{
		System.out.println("f3");
	}
	public void f2()
	{
		System.out.println("f4");
	}
	
}
public class TestInterfaceDemo {
	public static void main(String args[])
	{
		Person p=new Student();
		if(p instanceof Student)
		{
			Student s=(Student)p;
			s.f1();
			s.f2();
		}
		else{
			p.f1();
			p.f2();
		}	
	}

}
