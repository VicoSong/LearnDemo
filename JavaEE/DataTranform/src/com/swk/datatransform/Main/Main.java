package com.swk.datatransform.Main;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;

import com.swk.datatransform.frame.DataTransformFrame;

/** 
* @ClassName: Main 
* @Description: 程序的入口
* @author:Vico 
* @date 2016-3-22 下午10:51:16 
*  
*/
public class Main {
   
    public static void main(String[] args) {
	try {
	    EventQueue.invokeAndWait(new Runnable() {
	        @Override
	        public void run() {
	    	DataTransformFrame dtf=new DataTransformFrame();
	    	dtf.pack();
	    	dtf.setVisible(true);
	    	dtf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    	
	        }
	    });
	} catch (InvocationTargetException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
