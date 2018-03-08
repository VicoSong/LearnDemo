package com.swk.dom;



import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParseXML {
	DocumentBuilder db;
	Document document;
	
	public Document   getDocument() throws Exception
	{
		//创建解析器对象
		DocumentBuilder db=DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//加载XML文档
		Document document=db.parse("src/bookstore.xml");
		return document;
		
	}
		
	//1.获得某个具体的节点
	public  void getSpecificNode(Document document)
	{
		NodeList nl=((org.w3c.dom.Document) document).getElementsByTagName("售价");
		Node node=nl.item(1);
		String text=node.getTextContent();
		System.out.println("核心技术卷售价是："+text);
	}
	//2.遍历所有的元素节点
	public void getAllNode(Node node)
	{
		NodeList nl=node.getChildNodes();
		for(int i=0;i<nl.getLength();i++)
		{
			Node n=nl.item(i);
			if(n.getNodeType()==Node.ELEMENT_NODE)
			{
				System.out.println(n.getNodeName());
				getAllNode(n);
			}
			
		}
	}
	//3.修改某个元素节点的主体内容
	public  void modifyContent(Document document) throws Exception
	{
		NodeList nl=document.getElementsByTagName("售价");
		Node node=nl.item(1);
		node.setTextContent("$80");
		Transformer tf=TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(document), new StreamResult("src/bookstore.xml"));
	}
	//4.向指定元素节点中增加子元素节点
	public  void addSonNode(Document document) throws Exception, Error
	{
		 NodeList nl=document.getElementsByTagName("售价");
		 Node node=nl.item(0);
		 Element el=document.createElement("内部价");
		 el.setTextContent("$50");
		 node.appendChild(el);
		 Transformer tf=TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(document), new StreamResult("src/bookstore.xml"));
		 
	}
	//5.向指定元素节点中增加同级元素节点
	public  void addNode(Document document) throws TransformerFactoryConfigurationError, TransformerException
	{
		 NodeList nl=document.getElementsByTagName("书");
		 Node node=nl.item(0);
		 Element el=document.createElement("批发价");
		 el.setTextContent("$20");
		 node.appendChild(el);
		 Transformer tf=TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(document), new StreamResult("src/bookstore.xml"));
	}
	//6.删除指定元素节点
	public  void deleteNode(Document document) throws TransformerFactoryConfigurationError, TransformerException
	{
		NodeList nl=document.getElementsByTagName("内部价");
		Node node=nl.item(0);
		node.getParentNode().removeChild(node);
		Transformer tf=TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(document), new StreamResult("src/bookstore.xml"));
	}
	//7.操作XML文件属性
	public  void operateAttribute(Document document) throws TransformerFactoryConfigurationError, TransformerException
	{
		NodeList nl=document.getElementsByTagName("书");
		Node node=nl.item(0);
		((Element)node).setAttribute("languange", "Chinese");
		Transformer tf=TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(document), new StreamResult("src/bookstore.xml"));
	}
	
	public static  void main(String[] args) throws Exception
	{
		DomParseXML dpx=new DomParseXML();
		Document document=dpx.getDocument();
		//dpx.getSpecificNode(document);
		//dpx.getAllNode(document);
		//dpx.modifyContent(document);
		//dpx.addSonNode(document);
		//dpx.addNode(document);
		//dpx.deleteNode(document);
		dpx.operateAttribute(document);
	}
	
}
