package com.swk.struts.defineresultType;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;

public class CaptchaResult implements Result{

   private int width = 80;
   private int height = 32;
   
   

    public void setWidth(int width) 
    {
	this.width = width;
    }


    public void setHeight(int height) 
    {
	this.height = height;
    }


    @Override
    public void execute(ActionInvocation invocation) throws Exception {

	    //create the image
	    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	    Graphics g = image.getGraphics();
	    // set the background color
	    g.setColor(new Color(0xDCDCDC));
	    g.fillRect(0, 0, width, height);
	    // draw the border
	    g.setColor(Color.black);
	    g.drawRect(0, 0, width - 1, height - 1);
	    // create a random instance to generate the codes
	    Random rdm = new Random();
	    String hash1 = Integer.toHexString(rdm.nextInt());
	    // make some confusion
	    for (int i = 0; i < 50; i++) {
	        int x = rdm.nextInt(width);
	        int y = rdm.nextInt(height);
	        g.drawOval(x, y, 0, 0);
	    }
	    // generate a random code
	    String capstr = hash1.substring(0, 4);
	   // session.setAttribute("key", capstr);
	    g.setColor(new Color(0, 100, 0));
	    g.setFont(new Font("Candara", Font.BOLD, 24));
	    g.drawString(capstr, 8, 24);
	    g.dispose();
	    
	    //输出
	    HttpServletResponse response = ServletActionContext.getResponse();
	    response.setHeader("Cache-Control", "no-cache");
	    response.setHeader("Pragma","no-cache");
	    response.setHeader("Expires", "-1");
	    OutputStream strm = response.getOutputStream();
	    ImageIO.write(image, "jpeg", strm);
	    strm.close();
	
    }

}
