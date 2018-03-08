package com.swk.gobang;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.sound.midi.MidiDevice.Info;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;


/**
 * ��Ϸ��
 * @author Administrator
 * @version 20151013
 * */
/*
 * ���ܣ���Ϸ�࣬������Ҫ������Ϸ�Ŀ�ʼ�����¿�ʼ����������֤�������ĺϷ��ԣ�
 * �ж���Ϸ����Ӯ����ʼ�����̡���ӡ���̡����������������̵ȹ��ܡ�
 * ˼·������:
 *1.��ʼ�����̺���������
 *2.�������ĺϷ���
 *3.��ʼ��Ϸ
 *4.���¿�ʼ
 *5.������������
 *6���ж���Ӯ
 *7.
 */
public class GobangGame {
	private final int WINCOUNT=5;//����Ӯʱ��������
	private int posX;//�������ӵ�X����
	private int posY;//�������ӵ�Y����
	private Chessboard chessboard;
	
	/**
	 * �չ��캯��
	 * */
	public GobangGame()
	{}
	
	/**
	 * ���ι��캯��,��ʼ�����̺��������ԡ�
	 * @param chessboard ������
	 * 
	 * */
	public GobangGame(Chessboard chessboard)
	{
		this.chessboard=chessboard;
		
	}
	
	/**
	 * isValid:��������Ƿ�Ϸ�
	 * @param inputStr  �ɿ���̨������ַ���
	 * @return Boolean���ͣ�����Ϸ�true,����Ƿ�false.
	 * 
	 * */
	public boolean isValid(String inputStr)
	{
		
		String[] posArry=inputStr.split(","); //��������ַ����Զ��Ž��зָ�
		
		//�ж�����ĸ�ʽ�Ƿ���ȷ
		try{
			posX=Integer.parseInt(posArry[0])-1;
			posY=Integer.parseInt(posArry[1])-1;
		}catch(NumberFormatException e)
		{
			chessboard.printBoard();
			System.out.println("����(���֣�����)�ĸ�ʽ����");
			return false;
		}
		
		//�ж��Ƿ񳬳���Χ
		if(posX<0||posX>=Chessboard.BOARDSIZE||posY<0||posY>=Chessboard.BOARDSIZE)
		{
			chessboard.printBoard();
			System.out.println("��������귶Χֻ���ڣ�1~"+Chessboard.BOARDSIZE+"֮�䣬���������룺");
			return false;
		}
		
		//��������λ���Ƿ�������
		String[][] board=chessboard.getBoard();
		if(board[posX][posY]!="+")
		{
			chessboard.printBoard();
			System.out.println("��λ���Ѿ������ӣ����������룺");
			return false;
		}
		return true;
	}
	
	/**
	 * start:��ʼ��Ϸ
	 * @param none
	 * @throws Exception
	 * @return void
	 * */
	public void start() throws Exception
	{
		Boolean isOver=false;//trueΪ������falseΪû����
		chessboard.initBoard();
	
		chessboard.printBoard();
		//��ȡ���̵�����
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String inputStr=null;
		while((inputStr=br.readLine())!=null)
		{
			isOver=false;
			//��������Ϸ�����֤
			if(!isValid(inputStr))
			{
				continue;
			}
			//�Ѷ�Ӧ������Ԫ�ظ�ֵΪ"��"
			String chessman=Chessman.BLACK.getChessman();
			chessboard.setBoard(posX, posY, chessman);
			//�ж��û��Ƿ�Win
			if(isWin(posX, posY, chessman))
			{
				isOver=true;
			}else{
				//��������ѡ��λ������
				int[] pcPosArry=computerDo();
				chessman=Chessman.WHITE.getChessman();
				chessboard.setBoard(pcPosArry[0], pcPosArry[1], chessman);
				//�жϼ�����Ƿ�Ӯ��
				if(isWin(pcPosArry[0], pcPosArry[1], chessman))
				{
					isOver=true;
				}
			}
			//�������ʤ�ߣ�ѯ���Ƿ������Ϸ
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
			System.out.print("����x,y�ĸ�ʽ��������������꣺");
		}	
		
	}
	
	/**
	 * isWin:�ж���Ӯ
	 * @param posX  ���ӵ�X����
	 * @param posY  ���ӵ�����
	 * @param ico   ��������
	 * @return Boolean���ͣ������5����������һ��ֱ�߷�����(true)�����򷵻ؼ�(false)��
	 * */
	public boolean  isWin(int posX,int posY,String ico)
	{
		//ֱ�����X����
		int startX=0;
		//ֱ�����Y����
		int startY=0;
		//ֱ�߽���X����
		int endX=Chessboard.BOARDSIZE-1;
		//ֱ�߽���Y����
		int endY=endX;
		//ͬ��ֱ����ͬ�����ۼ���
		int count=0;
		int temp=0;
		//����������СX������Y����
		temp=posX-WINCOUNT+1;
		startX=temp<0?0:temp;
		temp=posY-WINCOUNT+1;
		startY=temp<0?0:temp;
		//�����յ�����X������Y����
		temp=posX+WINCOUNT-1;
		endX=temp>Chessboard.BOARDSIZE-1?Chessboard.BOARDSIZE-1:temp;
		temp=posY+WINCOUNT-1;
		endY=temp>Chessboard.BOARDSIZE-1?Chessboard.BOARDSIZE-1:temp;
		
		String[][] board=chessboard.getBoard();
		//�������Ҽ�����ͬ����������Ŀ
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
		
		//���ϵ��¼�����ͬ������
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
		
		//�����ϵ����¼�����ͬ������
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
	 * computerDo:������������
	 * @param none
	 * @return int[]  int�����飬��ż����������������ꡣ
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
	 * isReplay:�ж��û��Ƿ�������Ϸ
	 * @param chessman String���ͣ��������ӡ�
	 * @exception Exception
	 * @return boolean true�������棬false�����˳���Ϸ��
	 * 
	 * */
	public boolean isReplay(String chessman) throws Exception 
	{
		String message=chessman.equals(Chessman.BLACK.getChessman())?"��ϲ�㣬��Ӯ��":"���ź���������";
			System.out.println(message+"����һ��?(y/n)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			if(br.readLine().equals("y"))
			{
				return true;
			}
			return false;
	}
	
	/**
	 * main:����ִ�е����
	 * */
	public static void main(String[] args) throws Exception
	{
		new GobangGame(new Chessboard()).start();
		
		//����log��Ϣ
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
 