import java.net.InetAddress;


public class InetAddressDemo {
	public static void main(String args[])
	{
		try{
		InetAddress ia=InetAddress.getByName("www.baidu.com");
		System.out.println(ia.toString());
		InetAddress ip=InetAddress.getLocalHost();
		String hostName=ip.getHostName();
		String localIp=ip.getHostAddress();
		System.out.println("本机名："+hostName);
		System.out.println("Ip地址：  "+localIp);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
