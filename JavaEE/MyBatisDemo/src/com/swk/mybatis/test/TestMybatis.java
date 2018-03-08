package com.swk.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.sun.xml.internal.bind.v2.model.core.Adapter;
import com.swk.mybatis.domain.Person;

public class TestMybatis {
   private SqlSessionFactory factory;
    @Before //最先执行
    public void init() throws IOException
    {
	String resource="sqlMapConfig.xml";
	InputStream is=Resources.getResourceAsStream(resource);
	 factory=new SqlSessionFactoryBuilder().build(is);
    }
    
    /*基础测试*/
    @Test //查询所有
    public void testSelectList()
    {
	SqlSession session=factory.openSession();
	//访问mapper中配置的sql规则：命名空间.id
	List<Person> beans=session.selectList("com.swk.mybatis.mapper.PersonMapper.find");
	for (Person person : beans) 
	{
	     System.out.print(person.toString());
	}
    }
   
    @Test //查询一条
    public void testSelectOne()
    {
	SqlSession session=factory.openSession();
	Person person=session.selectOne("com.swk.mybatis.mapper.PersonMapper.get",2);
	System.out.print(person.toString());
    }
    
    @Test //测试新增
    public void testInsert()
    {
	SqlSession session = factory.openSession();
	Person person =new Person();
	person.setId(4);
	person.setName("Jason");
	person.setAge(19);
	person.setRemark("one good person");
	session.insert("com.swk.mybatis.mapper.PersonMapper.insert",person);
	session.commit();
	System.out.println("insert finished!");
	
    }
    
    @Test
    public void testUpdate()
    {
	SqlSession session=factory.openSession();
	Person person=new Person();
	person.setId(1);
	person.setName("kangkang");
	person.setRemark(" very kind");
	session.update("com.swk.mybatis.mapper.PersonMapper.update",person);
	session.commit();
    }
    
    @Test //查询记录数
    public void testCount()
    {
	SqlSession session=factory.openSession();
	int count=session.selectOne("com.swk.mybatis.mapper.PersonMapper.count");
	System.out.println("total record:"+count);

    }
    
    @Test  //按条件查找
    public void testQueryWithCondition()
    {
	SqlSession session=factory.openSession();
	Map<String, Object> paramMap=new HashMap<String, Object>();
	//paramMap.put("name", "k%");
	paramMap.put("age", 36);
	List<Person> beans=session.selectList("com.swk.mybatis.mapper.PersonMapper.queryWithCondition",paramMap);
	for (Person person : beans) 
	{
	     System.out.print(person.toString());
	}
    }
    
    @Test  //测试set标签
    public void testUpdateDyn()
    {
	SqlSession session=factory.openSession();
	Map<String, Object> paramMap=new HashMap<String, Object>();
	//paramMap.put("name", "k%");
	paramMap.put("age", 23);
	paramMap.put("id", 3);
	session.update("com.swk.mybatis.mapper.PersonMapper.updateDyn",paramMap);
	session.commit();
	
    }
    
    
    @Test  //测试foreach删除多条-array
    public void testdeleteMultiArry()
    {
	SqlSession session=factory.openSession();
	int[] ids={5,6};
	session.delete("com.swk.mybatis.mapper.PersonMapper.deleteMultiArry",ids);
	session.commit();
	
    }
    
    @Test  //测试foreach删除多条-list
    public void testdeleteMultiList()
    {
	SqlSession session=factory.openSession();
	List<Integer> ids=new ArrayList<Integer>();
	ids.add(5);
	ids.add(6);
	session.delete("com.swk.mybatis.mapper.PersonMapper.deleteMultiList",ids);
	session.commit();
	
    }
    
    @Test  //测试foreach删除多条-map
    public void testdeleteMultiMap()
    {
	SqlSession session=factory.openSession();
	Map<String, Object> paraMap=new  HashMap<String, Object>();
	List<Person> beans=new ArrayList<Person>();
	for(int i=7;i<9;i++)
	{
	    Person person=new Person();
	    person.setId(i);
	   beans.add(person);
	}
	paraMap.put("beans", beans);
	
	session.delete("com.swk.mybatis.mapper.PersonMapper.deleteMultiMap",paraMap);
	session.commit();
	
    }
    
    @Test  //测试特殊字符
    public void testqueryUseSpecChar()
    {
	SqlSession session=factory.openSession();
	Map<String, Object> paramMap=new HashMap<String, Object>();
	//paramMap.put("name", "k%");
	paramMap.put("startAge", 18);
	paramMap.put("endAge", 30);
	
	List<Person> beansList=session.selectList("com.swk.mybatis.mapper.PersonMapper.queryUseSpecChar",paramMap);
	for(Person bean:beansList)
	{
	    System.out.println( bean.toString());
	   
	}
	
    }
    
    /*关联关系测试*/
    @Test //测试 一对一关联测试
    public void testRelateQuery()
    {
	SqlSession session=factory.openSession();
	List<Person> persons=session.selectList("com.swk.mybatis.mapper.PersonMapper.relateQuery");
	for(Person bean:persons)
	{
	    System.out.println( bean.toString());
	   
	}
	
    }
    
    @Test //测试一对一关联测试 继承方式
    public void testqueryPersonAndPersonInfo()
    {
	SqlSession session=factory.openSession();
	Map<String, Object> paramMap=new HashMap<String, Object>();
	paramMap.put("name", "vico");
	List<Person> persons=session.selectList("com.swk.mybatis.mapper.PersonInfoMapper.queryPersonAndPersonInfo",paramMap);
	for (Person person :persons) {
	    System.out.println(person.toString());
	   
	}
	
    }
    
    
    
}
