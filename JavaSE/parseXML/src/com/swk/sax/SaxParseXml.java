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
		//����������
		SAXParser sax=SAXParserFactory.newInstance().newSAXParser();
		//��ȡ���ݶ�ȡ��
		XMLReader xml=sax.getXMLReader();
		//ע��һ�����ݴ�����
		xml.setContentHandler(new DefaultHandler(){

			//�������ĵ���ʼʱ����
			public void startDocument() throws SAXException {
				super.startDocument();
				System.out.println("�ĵ�������ʼ��");
			}

			//�������ĵ�����ʱ����
			public void endDocument() throws SAXException {
				super.endDocument();
				System.out.println("�ĵ�����������");
			}

			//����������ʼ��ǩʱ����
			public void startElement(String uri, String localName, String qName, Attributes attributes)
					throws SAXException {
				super.startElement(uri, localName, qName, attributes);
				System.out.println(qName+"��ǩ������ʼ��");
			}

			//��������������ǩʱ����
			public void endElement(String uri, String localName, String qName) throws SAXException {
				super.endElement(uri, localName, qName);
				System.out.println(qName+"��ǩ����������");
			}

			//���������ı�ʱ����
			public void characters(char[] ch, int start, int length) throws SAXException {
				super.characters(ch, start, length);
				System.out.println(new String(ch,start,length)+"�ı�");
			}
			
		});
		xml.parse("src/bookstore.xml");
	}
}
