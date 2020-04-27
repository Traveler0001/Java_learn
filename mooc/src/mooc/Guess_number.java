/**
 * 3.2.3
 * 总结：C语言是Java他爹，相似的地方太多了
 * */

package mooc;

import java.util.Scanner;

public class Guess_number {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		//初始化
		int number = (int)(Math.random()*100+1);
		//产生随机数
		//Math.random()产生[0，1)区域内的随机数
		//*100+1后产生[1，100]内的整数
		int putin = 0;
		int count = 0;
//		while(putin != number)
//		{
//			putin = in.nextInt();
//			++count;
//			if(putin > number)
//			{
//				System.out.println("偏大");
//			}
//			else
//			{
//				System.out.println("偏小");
//			}
//		}
		do{
			putin = in.nextInt();
			++count;
			if(putin > number)
			{
				System.out.println("偏大");
			}
			else
			{
				System.out.println("偏小");
			}
		}while(putin != number);
		System.out.println("恭喜你猜对了，共猜了"+count+"次");
	}

}
