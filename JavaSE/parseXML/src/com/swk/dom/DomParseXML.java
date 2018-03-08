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
		//��������������
		DocumentBuilder db=DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//����XML�ĵ�
		Document document=db.parse("src/bookstore.xml");
		return document;
		
	}
		
	//1.���ĳ������Ľڵ�
	public  void getSpecificNode(Document document)
	{
		NodeList nl=((org.w3c.dom.Document) document).getElementsByTagName("�ۼ�");
		Node node=nl.item(1);
		String text=node.getTextContent();
		System.out.println("���ļ������ۼ��ǣ�"+text);
	}
	//2.�������е�Ԫ�ؽڵ�
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
	//3.�޸�ĳ��Ԫ�ؽڵ����������
	public  void modifyContent(Document document) throws Exception
	{
		NodeList nl=document.getElementsByTagName("�ۼ�");
		Node node=nl.item(1);
		node.setTextContent("$80");
		Transformer tf=TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(document), new StreamResult("src/bookstore.xml"));
	}
	//4.��ָ��Ԫ�ؽڵ���������Ԫ�ؽڵ�
	public  void addSonNode(Document document) throws Exception, Error
	{
		 NodeList nl=document.getElementsByTagName("�ۼ�");
		 Node node=nl.item(0);
		 Element el=document.createElement("�ڲ���");
		 el.setTextContent("$50");
		 node.appendChild(el);
		 Transformer tf=TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(document), new StreamResult("src/bookstore.xml"));
		 
	}
	//5.��ָ��Ԫ�ؽڵ�������ͬ��Ԫ�ؽڵ�
	public  void addNode(Document document) throws TransformerFactoryConfigurationError, TransformerException
	{
		 NodeList nl=document.getElementsByTagName("��");
		 Node node=nl.item(0);
		 Element el=document.createElement("������");
		 el.setTextContent("$20");
		 node.appendChild(el);
		 Transformer tf=TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(document), new StreamResult("src/bookstore.xml"));
	}
	//6.ɾ��ָ��Ԫ�ؽڵ�
	public  void deleteNode(Document document) throws TransformerFactoryConfigurationError, TransformerException
	{
		NodeList nl=document.getElementsByTagName("�ڲ���");
		Node node=nl.item(0);
		node.getParentNode().removeChild(node);
		Transformer tf=TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(document), new StreamResult("src/bookstore.xml"));
	}
	//7.����XML�ļ�����
	public  void operateAttribute(Document document) throws TransformerFactoryConfigurationError, TransformerException
	{
		NodeList nl=document.getElementsByTagName("��");
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
