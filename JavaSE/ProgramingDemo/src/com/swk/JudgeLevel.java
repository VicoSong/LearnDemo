package com.swk;
/**
 * 根据分数确定等级
 * @author 宋维康
 *
 */
import java.util.Scanner;
public class JudgeLevel {
	public void RankLevel(int grade)
	{
		switch(grade/10)
		{
		case 9:System.out.println("A Level");	break;
		case 8:System.out.println("B Level");	break;
		case 7:System.out.println("C Level");	break;
		case 6:System.out.println("D Level");	break;
		case 5:System.out.println("E Level");	break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:System.out.println("F Level");	break;
		}
		
	}
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		JudgeLevel judgelevel=new JudgeLevel();
		judgelevel.RankLevel(scanner.nextInt());
	}
}
