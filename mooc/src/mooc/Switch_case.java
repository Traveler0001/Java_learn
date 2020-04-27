/**
 * 2.3.1
 * 分支语句用法与C语言一致
 * */

package mooc;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int type = in.nextInt();
		switch(type)
		{
			case 1:System.out.println("1");break;
			case 2:System.out.println("2");break;
			case 3:System.out.println("3");break;
			case 4:System.out.println("4");break;
			case 5:System.out.println("5");break;
			case 6:System.out.println("6");break;
			case 7:System.out.println("7");break;
			case 8:System.out.println("8");break;
			default:System.out.println("over");break;
		}
	}

}
