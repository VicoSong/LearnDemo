package com.wabacusdemo.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

public class OperateImage {
		@Test
	public static void resizeImage(String srcImgPath, String distImgPath,  
            int width, int height)  {  
 
        File srcFile = new File(srcImgPath);  
        Image srcImg;
		try {
			srcImg = ImageIO.read(srcFile);
			BufferedImage buffImg = null;  
			buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);  
			buffImg.getGraphics().drawImage(srcImg.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);   
			ImageIO.write(buffImg, "JPEG", new File(distImgPath));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}  
 
    }  
}
