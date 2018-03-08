import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	public static void main(String[]args)
	{
		ServerSocket serverSocket=null;
		Socket clientSocket=null;
		String str=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		try{
			serverSocket=new ServerSocket(4331);
			clientSocket=serverSocket.accept();
			dis=new DataInputStream(clientSocket.getInputStream());
			dos=new DataOutputStream(clientSocket.getOutputStream());
			while(true)
			{
				str=dis.readUTF();
				dos.writeUTF("Hello,I am Server");
				dos.writeUTF(str);
				System.out.println("server accept:"+str);
				Thread.sleep(10000);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
