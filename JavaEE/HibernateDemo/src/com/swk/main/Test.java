package com.swk.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.swk.bean.User;

public class Test {
	private static SessionFactory sf =null;
	static{
		Configuration cfg =new Configuration();
		cfg.addClass(User.class);
		sf = cfg.buildSessionFactory();
	}
	public static void main(String[] args)
	{
		User user = new User();
		user.setName("swk");
		user.setAge(24);
		user.setDescription("poem");
		user.setIsMarried(true);
		
		try
		{
			FileInputStream fis=new FileInputStream("E:\\笔记图片\\1.png");
			byte[] bytes =new byte[fis.available()];
			fis.read(bytes);
			fis.close();
			user.setPhoto(bytes);
			String desc ="这是一只熊猫！";
			user.setDescription(desc);
					
					
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		insertUser(user);
	}
	
	public static void insertUser(User user)
	{
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}
}
