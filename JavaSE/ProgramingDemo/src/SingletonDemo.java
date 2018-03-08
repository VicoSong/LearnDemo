//����ʽ
class HungerMan{
	private static final HungerMan s=new HungerMan();
	private HungerMan(){}
	public static HungerMan getInstance()
	{
		return s;
	}
}
//����ʽ
class LazyMan{
	private static LazyMan s=null;
	private LazyMan(){}
	//ͬ������ Ч�ʲ���
	public static synchronized LazyMan getInstance()
	{
		if(s==null)
			s=new LazyMan();
		return s;
	}
	//����һ��ʵ��
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
