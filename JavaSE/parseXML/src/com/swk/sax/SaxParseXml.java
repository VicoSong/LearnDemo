package com.swk.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParseXml {
	public static void main(String[] args) throws Exception
	{
		//创建解析器
		SAXParser sax=SAXParserFactory.newInstance().newSAXParser();
		//获取内容读取器
		XMLReader xml=sax.getXMLReader();
		//注册一个内容处理器
		xml.setContentHandler(new DefaultHandler(){

			//当解析文档开始时调用
			public void startDocument() throws SAXException {
				super.startDocument();
				System.out.println("文档解析开始了");
			}

			//当解析文档结束时调用
			public void endDocument() throws SAXException {
				super.endDocument();
				System.out.println("文档解析结束了");
			}

			//当解析到开始标签时调用
			public void startElement(String uri, String localName, String qName, Attributes attributes)
					throws SAXException {
				super.startElement(uri, localName, qName, attributes);
				System.out.println(qName+"标签解析开始了");
			}

			//当解析到结束标签时调用
			public void endElement(String uri, String localName, String qName) throws SAXException {
				super.endElement(uri, localName, qName);
				System.out.println(qName+"标签解析结束了");
			}

			//当解析到文本时调用
			public void characters(char[] ch, int start, int length) throws SAXException {
				super.characters(ch, start, length);
				System.out.println(new String(ch,start,length)+"文本");
			}
			
		});
		xml.parse("src/bookstore.xml");
	}
}
