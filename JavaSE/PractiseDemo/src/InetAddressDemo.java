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
		System.out.println("��������"+hostName);
		System.out.println("Ip��ַ��  "+localIp);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
