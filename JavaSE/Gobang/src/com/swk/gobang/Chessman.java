package com.swk.gobang;
/**
 * ������
 * @author Administrator
 * @version 20151013
 * */
/*
 * ���ܣ������࣬��һ��ö���࣬������ӳ�ʼ�������������ӵ�ʵ������
 * ˼·�����裺
 * 1.����ڰ���������
 * 2.˽�й���������ʼ�����Ӷ���
 * 3.�������Ӷ���
 * */
public enum Chessman {
	BLACK("��"),WHITE("��");
	private String chessman;
	/*
	 * ˽�й�����
	 */
	private Chessman(String chessman)
	{
		this.chessman=chessman;
	}
	
	/**
	 * getChessman: ��ȡ��ɫ���ӻ��ɫ���ӡ�
	 * @return ���ذ�������
	 * */ 
	public String getChessman()
	{
		return chessman;
	}
	
}
