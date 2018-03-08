package com.swk.gobang;
/**
 * 棋盘类
 * @author Administrator
 * @version 6.24 20151009
 * */
/*
 * 功能：棋盘类，主要负责棋盘的创建、初始化、输出以及增加新的棋子
 * 思路及步骤：
 * 1.通过二维数组构建一个棋盘
 * 2.定义棋盘初始化方法
 * 3.定义棋盘输出方法
 * 5.定义把棋子设置到棋盘上的方法
 * */
public class Chessboard {
	private String[][] board; //定义一个二维数组，充当棋盘
    static final int BOARDSIZE=15;//定义棋盘大小
	
	/**
	 * initBoard:该方法主要用于初始化棋盘
	 * @return void
	  */
	public void initBoard()
	{
		board=new String[BOARDSIZE][BOARDSIZE];
		//把棋盘中每个位置赋值为“+”，以方便输出棋盘
		for(int i=0;i<BOARDSIZE;i++)
		{
			for(int j=0;j<BOARDSIZE;j++)
			{
				board[i][j]="+";
			}
		}
	}
	
	/*
	public void test()
	{
		Object[][] arry=new Object[10][10];
		for(int i=0;i<arry.length;i++)
		{
			for(int j=0;j<arry[i].length;j++)
			{
				arry[i][j]=new Object();
			}
		}
	}
	*/
	
	/**
	 * printBoard:在控制台输出棋盘
	 * @return void 
	 */
	public void printBoard()
	{
		for(int i=0;i<BOARDSIZE;i++)
		{
			for(int j=0;j<BOARDSIZE;j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
	}
	
	/**
	 * setBoard:设置棋盘中棋子的位置
	 * @param posX  X坐标
	 * @param posY  Y坐标
	 * @param String chessman
	 * @return void
	 */
	public void setBoard(int posX,int posY,String chessman)
	{
		this.board[posX][posY]=chessman;
	}
	
	/**
	 * getBoard:返回棋盘
	 * @return board
	 * */
	public String[][] getBoard()
	{
		return board;
	}
	
	
}
