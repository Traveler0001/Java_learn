/**
 * 2.1.1
 * 总结：比较运算的结果为boolen类型，只能为true或false
 * 
 * 新知识点：判断浮点数是否相等
 * 用Math工具
 * System.out.println(Math.abs(a-b)>1e-6);
 * a-b的绝对值比较1*10的-6次方
 * */

package mooc;

import java.util.Scanner;

public class Ticket_machine {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		//初始化
		
		System.out.println("******************");
		System.out.println("*Java城际铁路专线*");
		System.out.println("*   无指定座位     *");
		System.out.println("*   票价：10元     *");
		System.out.println("******************");
		//打印提示语
		
		double a = 0.8 + 0.1;
		double b = 0.8 + 0.1;
		
		System.out.println(Math.abs(a-b)>1e-6);
		
		int sum = 0;
		//记录金额总数
		for(sum = 0; sum < 10;)
		{
			int amount = in.nextInt();
			//读入用户输入的数据
			sum = sum + amount;
			if(sum > 10)
			{
				System.out.println(" 已出票，找零： "+ (sum-10)+" 元");
				//计算并打印找零
				break;
			}
			else
			{
				System.out.println("金额不足，缺少"+ (10-sum)+"元");
				System.out.println("     请投币");
			}
			//条件语句if……else……用法语C语言一致，猜测循环语句while与for应该也一样
			
		}
	}

}
