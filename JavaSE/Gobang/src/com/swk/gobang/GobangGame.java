package com.swk.gobang;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.sound.midi.MidiDevice.Info;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;


/**
 * 游戏类
 * @author Administrator
 * @version 20151013
 * */
/*
 * 功能：游戏类，该类主要控制游戏的开始、重新开始、结束，验证玩家输入的合法性，
 * 判断游戏的输赢，初始化棋盘、打印棋盘、调用棋子设置棋盘等功能。
 * 思路及步骤:
 *1.初始化棋盘和棋子属性
 *2.检查输入的合法性
 *3.开始游戏
 *4.重新开始
 *5.计算机随机下棋
 *6。判断输赢
 *7.
 */
public class GobangGame {
	private final int WINCOUNT=5;//定义赢时的棋子数
	private int posX;//定义棋子的X坐标
	private int posY;//定义妻子的Y坐标
	private Chessboard chessboard;
	
	/**
	 * 空构造函数
	 * */
	public GobangGame()
	{}
	
	/**
	 * 含参构造函数,初始化棋盘和棋子属性。
	 * @param chessboard 棋盘类
	 * 
	 * */
	public GobangGame(Chessboard chessboard)
	{
		this.chessboard=chessboard;
		
	}
	
	/**
	 * isValid:检查输入是否合法
	 * @param inputStr  由控制台输出的字符串
	 * @return Boolean类型，输入合法true,输入非法false.
	 * 
	 * */
	public boolean isValid(String inputStr)
	{
		
		String[] posArry=inputStr.split(","); //将输入的字符串以逗号进行分割
		
		//判断输入的格式是否正确
		try{
			posX=Integer.parseInt(posArry[0])-1;
			posY=Integer.parseInt(posArry[1])-1;
		}catch(NumberFormatException e)
		{
			chessboard.printBoard();
			System.out.println("请以(数字，数字)的格式输入");
			return false;
		}
		
		//判断是否超出范围
		if(posX<0||posX>=Chessboard.BOARDSIZE||posY<0||posY>=Chessboard.BOARDSIZE)
		{
			chessboard.printBoard();
			System.out.println("输入的坐标范围只能在：1~"+Chessboard.BOARDSIZE+"之间，请重新输入：");
			return false;
		}
		
		//检查输入的位置是否有棋子
		String[][] board=chessboard.getBoard();
		if(board[posX][posY]!="+")
		{
			chessboard.printBoard();
			System.out.println("此位置已经有棋子，请重新输入：");
			return false;
		}
		return true;
	}
	
	/**
	 * start:开始游戏
	 * @param none
	 * @throws Exception
	 * @return void
	 * */
	public void start() throws Exception
	{
		Boolean isOver=false;//true为结束，false为没结束
		chessboard.initBoard();
	
		chessboard.printBoard();
		//获取键盘的输入
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String inputStr=null;
		while((inputStr=br.readLine())!=null)
		{
			isOver=false;
			//进行输入合法性验证
			if(!isValid(inputStr))
			{
				continue;
			}
			//把对应的数组元素赋值为"●"
			String chessman=Chessman.BLACK.getChessman();
			chessboard.setBoard(posX, posY, chessman);
			//判断用户是否Win
			if(isWin(posX, posY, chessman))
			{
				isOver=true;
			}else{
				//计算机随机选择位置坐标
				int[] pcPosArry=computerDo();
				chessman=Chessman.WHITE.getChessman();
				chessboard.setBoard(pcPosArry[0], pcPosArry[1], chessman);
				//判断计算机是否赢了
				if(isWin(pcPosArry[0], pcPosArry[1], chessman))
				{
					isOver=true;
				}
			}
			//如果产生胜者，询问是否继续游戏
			if(isOver)
			{
				if(isReplay(chessman))
				{
					chessboard.initBoard();
					chessboard.printBoard();
					continue;
				}
				break;
			}
			chessboard.printBoard();
			System.out.print("请以x,y的格式输入你的下棋坐标：");
		}	
		
	}
	
	/**
	 * isWin:判断输赢
	 * @param posX  棋子的X坐标
	 * @param posY  棋子的坐标
	 * @param ico   棋子类型
	 * @return Boolean类型，如果有5颗棋子连成一条直线返回真(true)，否则返回假(false)。
	 * */
	public boolean  isWin(int posX,int posY,String ico)
	{
		//直线起点X坐标
		int startX=0;
		//直线起点Y坐标
		int startY=0;
		//直线结束X坐标
		int endX=Chessboard.BOARDSIZE-1;
		//直线结束Y坐标
		int endY=endX;
		//同条直线相同棋子累计数
		int count=0;
		int temp=0;
		//计算起点的最小X坐标与Y坐标
		temp=posX-WINCOUNT+1;
		startX=temp<0?0:temp;
		temp=posY-WINCOUNT+1;
		startY=temp<0?0:temp;
		//计算终点的最大X坐标与Y坐标
		temp=posX+WINCOUNT-1;
		endX=temp>Chessboard.BOARDSIZE-1?Chessboard.BOARDSIZE-1:temp;
		temp=posY+WINCOUNT-1;
		endY=temp>Chessboard.BOARDSIZE-1?Chessboard.BOARDSIZE-1:temp;
		
		String[][] board=chessboard.getBoard();
		//从左向右计算相同相邻棋子数目
		for(int i=startY; i<endY; i++)
		{
			if(board[posX][i]==ico&&board[posX][i+1]==ico)
			{
				count++;
			}else if(count!=WINCOUNT-1)
			{
				count=0;
			}
		}
		
		//从上到下计算相同棋子数
		if(count==0)
		{
			for(int i=startX;i<endX;i++)
			{
				if(board[i][posY]==ico&&board[i+1][posY]==ico)
				{
					count++;
				}else if (count!=WINCOUNT-1) 
				{
					count=0; 
				}
			}
		}
		
		//从左上到右下计算相同棋子数
		if(count==0)
		{
			int j=startY;
			for(int i=startX;i<endX;i++)
			{
				if(board[i][j]==ico&&board[i+1][j+1]==ico)
				{
					count++;
				}else if (count!=WINCOUNT-1) {
					count=0;
				}
				j++;
			}	
		}
		return count==WINCOUNT-1?true:false;
	}
	
	/**
	 * computerDo:计算机随机下棋
	 * @param none
	 * @return int[]  int型数组，存放计算机随机产生的坐标。
	 * 
	 * */
	public int[] computerDo()
	{
		int posX=(int)(Math.random()*(Chessboard.BOARDSIZE-1));
		int posY=(int)(Math.random()*(Chessboard.BOARDSIZE-1));
		String[][] board=chessboard.getBoard();
		while(board[posX][posY]!="+")
		{
			 posX=(int)(Math.random()*(Chessboard.BOARDSIZE-1));
			 posY=(int)(Math.random()*(Chessboard.BOARDSIZE-1));
		}
		int[] pcPosArry={posX,posY};
		return pcPosArry;
	}
	
	/**
	 * isReplay:判断用户是否重玩游戏
	 * @param chessman String类型，代表棋子。
	 * @exception Exception
	 * @return boolean true代表重玩，false代表退出游戏。
	 * 
	 * */
	public boolean isReplay(String chessman) throws Exception 
	{
		String message=chessman.equals(Chessman.BLACK.getChessman())?"恭喜你，你赢了":"很遗憾，你输了";
			System.out.println(message+"在玩一局?(y/n)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			if(br.readLine().equals("y"))
			{
				return true;
			}
			return false;
	}
	
	/**
	 * main:程序执行的入口
	 * */
	public static void main(String[] args) throws Exception
	{
		new GobangGame(new Chessboard()).start();
		
		//配置log信息
		/*
		Logger logger=Logger.getLogger(GobangGame.class);
		logger.setLevel(Level.INFO);
		logger.debug("this is debug");
		logger.info("This is an info");
		logger.warn("This is an info");
		logger.error("This is an info");
		logger.fatal("This is a fatal info");
		*/
	}
}
 