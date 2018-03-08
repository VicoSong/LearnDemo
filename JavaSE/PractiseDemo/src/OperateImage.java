import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class OperateImage {
	private int x;
	private int y;
	//���뱾��ͼƬ��������
	public BufferedImage loadImageLocal(String imgName)
	{
		try {
			return ImageIO.read(new File(imgName));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	//��������ͼƬ��������
	public BufferedImage loadImageUrl(String imageName)
	{
		
		try {
			URL url = new URL(imageName);
			 return ImageIO.read(url);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	//������ͼƬ������
	public void writeImageLocal(String newImage, BufferedImage img) {
		if (newImage != null && img != null) {
			try {
				File outputfile = new File(newImage);
				ImageIO.write(img, "jpg", outputfile);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args)
	{
		OperateImage operateImage=new OperateImage();
		BufferedImage img=operateImage.loadImageLocal("E:\\��Ļ������Ƭ\\053.jpg");
		operateImage.writeImageLocal("D:\\image.jpg", img);
	}
}
