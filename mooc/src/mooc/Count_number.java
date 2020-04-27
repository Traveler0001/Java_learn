/**
 * 3.1.2
 * while循环语法与C语言一致
 * do……while……循环与C语言用法也一致
 * */

package mooc;

import java.util.Scanner;

public class Count_number {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
//		while( num > 0)
//		{
//			num = num / 10;
//			count = count + 1;
//		}
		do{
			num = num / 10;
			count = count + 1;
		}while( num > 0);//此处一定要加分号;
		System.out.println(num+"是"+count+"位数");
	}

}
