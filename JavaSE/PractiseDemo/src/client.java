import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
public class client {
	public static void main(String args[])
	{
		Socket clientSocket;
		String str=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		try{
			clientSocket=new Socket("127.0.0.1",4331);
			dis=new DataInputStream(clientSocket.getInputStream());
			dos=new DataOutputStream(clientSocket.getOutputStream());
			dos.writeUTF("你好！！");
			while(true)
			{
				str=dis.readUTF();
				dos.writeUTF((int)(Math.random()*10+1)+"");
				System.out.println("客户端收到："+str);
				Thread.sleep(10000);
				
			}
		}catch(Exception e){
			e.getMessage();
		}
	}
}
