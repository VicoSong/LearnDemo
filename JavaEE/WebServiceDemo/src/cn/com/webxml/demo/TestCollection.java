package cn.com.webxml.demo;

import java.util.ArrayList;
import java.util.Vector;

import org.junit.Test;

public class TestCollection {
    @Test
    public void test()
    {
	Vector vector=new Vector();
	for (int i = 0; i < vector.size(); i++) {
	    vector.add(i+"");
	    vector.remove(i);
	    System.out.print(vector.get(i)+"==="+i);
	}
	
	ArrayList list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	for (int i = 0; i <list.size(); i++) {
	    list.remove(i);
	    System.out.print(list.get(i));
	    
	}
    }
}
