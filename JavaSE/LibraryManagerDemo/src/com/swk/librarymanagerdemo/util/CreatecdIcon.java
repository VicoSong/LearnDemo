package com.swk.librarymanagerdemo.util;

import java.net.URL;

import javax.swing.ImageIcon;

import com.swk.librarymanagerdemo.frame.MainFrame;


public class CreatecdIcon {
	public static ImageIcon add(String ImageName){
		URL IconUrl = MainFrame.class.getResource("/"+ImageName);
		ImageIcon icon=new ImageIcon(IconUrl);
		return icon;
	}
}
