//饿汉式
class HungerMan{
	private static final HungerMan s=new HungerMan();
	private HungerMan(){}
	public static HungerMan getInstance()
	{
		return s;
	}
}
//懒汉式
class LazyMan{
	private static LazyMan s=null;
	private LazyMan(){}
	//同步方法 效率不高
	public static synchronized LazyMan getInstance()
	{
		if(s==null)
			s=new LazyMan();
		return s;
	}
	//另外一种实现
	/*
	 public static  LazyMan getInstance()
	{
		if(s==null)
		{
		   synchronized(LazyMan.class)
		   {
		   			s=new LazyMan();
		   }
		}
		return s;	
	}
	 */
}
public class SingletonDemo {
	
}
