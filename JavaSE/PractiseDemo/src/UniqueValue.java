import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import sun.misc.BASE64Encoder;

/**
 * 三种产生唯一值的方法
 * @author Administrator
 *
 */
public class UniqueValue {
	
	/**
	 * 第一种方式：通过nanoTime()方法获得
	 * 通过System类的nanoTime()方法产生，理论上存在重复的可能，实际不会重复
	 */
	public String uniqueCodeOne()
	{
		long n=System.nanoTime();
	
//		Random random=new Random();
//		String n=System.nanoTime()+""+random.nextInt();
//      System.out.println(n);
		return String.valueOf(n);
	}
	
	
	/**
	 * 第二种方式：通过UUID类（表示通用唯一标识符的类）获得唯一值，UUID表示一个128位的值
	 * 
	 */
	public String uniqueCodeTwo()
	{
		String s=UUID.randomUUID().toString();
//		System.out.println(s);
		return s;
	}
	
	/**
	 * 第三种方式：采用数据指纹
	 * @throws NoSuchAlgorithmException 
	 * 
	 */
	public String uniqueCodeThree() throws NoSuchAlgorithmException
	{
		String s=UUID.randomUUID().toString();
		//先进行MD5加密
		MessageDigest md=MessageDigest.getInstance("md5");
		//对数据进行加密
		byte[] bs=md.digest(s.getBytes());
		//采用数据指纹进一步加密，拿到的数据成为数据指纹
		BASE64Encoder base=new BASE64Encoder();	
		String digitFingerprint=base.encode(bs);
		//System.out.println(digitFingerprint);
		return digitFingerprint;
	}
	
}
