package com.swk.gobang;
/**
 * 棋子类
 * @author Administrator
 * @version 20151013
 * */
/*
 * 功能：棋子类，是一个枚举类，完成棋子初始化，并返回棋子的实例对象
 * 思路及步骤：
 * 1.定义黑白两种棋子
 * 2.私有构造器，初始化棋子对象
 * 3.返回棋子对象
 * */
public enum Chessman {
	BLACK("●"),WHITE("○");
	private String chessman;
	/*
	 * 私有构造器
	 */
	private Chessman(String chessman)
	{
		this.chessman=chessman;
	}
	
	/**
	 * getChessman: 获取白色棋子或黑色棋子。
	 * @return 返回白棋或黑棋
	 * */ 
	public String getChessman()
	{
		return chessman;
	}
	
}
