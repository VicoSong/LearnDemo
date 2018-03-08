package com.swk.gobang;
/**
 * ������
 * @author Administrator
 * @version 6.24 20151009
 * */
/*
 * ���ܣ������࣬��Ҫ�������̵Ĵ�������ʼ��������Լ������µ�����
 * ˼·�����裺
 * 1.ͨ����ά���鹹��һ������
 * 2.�������̳�ʼ������
 * 3.���������������
 * 5.������������õ������ϵķ���
 * */
public class Chessboard {
	private String[][] board; //����һ����ά���飬�䵱����
    static final int BOARDSIZE=15;//�������̴�С
	
	/**
	 * initBoard:�÷�����Ҫ���ڳ�ʼ������
	 * @return void
	  */
	public void initBoard()
	{
		board=new String[BOARDSIZE][BOARDSIZE];
		//��������ÿ��λ�ø�ֵΪ��+�����Է����������
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
	 * printBoard:�ڿ���̨�������
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
	 * setBoard:�������������ӵ�λ��
	 * @param posX  X����
	 * @param posY  Y����
	 * @param String chessman
	 * @return void
	 */
	public void setBoard(int posX,int posY,String chessman)
	{
		this.board[posX][posY]=chessman;
	}
	
	/**
	 * getBoard:��������
	 * @return board
	 * */
	public String[][] getBoard()
	{
		return board;
	}
	
	
}
