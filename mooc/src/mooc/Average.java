/**
 * 3.2.2:eg1
 * 总结：do……while……与while应注意循环次数的问题
 * 5.1.1
 * 总结：数组的用法与C语言基本一致，但是有一些不同的地方
 * 		仍需注意下标越界，编译器不会检查越界问题
 * 		Java数组提供了计算数组长度的工具<数组名>.length
 * 		length是数组的一个固定成员，在数组定义时就以确定
 * 		
 * */

package mooc;

import java.util.Scanner;

public class Average {

	public static void eg1() {
		Scanner in = new Scanner(System.in);
		int num;//数据
		int sum = 0;//总和
		int count = 0;//计数器
		
//		num = in.nextInt();//读入数据
//		while(num != -1)
//		{
//			sum = sum + num;
//			++count;//自增
//			num = in.nextInt();
//		}
		do {
			num = in.nextInt();
			if(num != -1)//判断输入是否是-1
			{
				sum = sum + num;
				count = count + 1;
			}
		}while(num != -1);
		if(count > 0)//确保输入两次以上
		{
			System.out.println("平均数="+(double)sum/count);
		}	
	}
	
	public static void eg2() {
		Scanner in = new Scanner(System.in);
//		int x;
//		int []numbers= new int[100];
		//定义数组
		double sum = 0;
		int cnt = 0;
		cnt = in.nextInt();
		//确定数组长度
		if(cnt > 0)
		{
			int []numbers= new int[cnt];
			for(int i = 0;i < numbers.length; i++)
			//将数据写入数组
			{
				numbers[i] = in.nextInt();
				sum += numbers[i];
				//计算输入数据的和
			}
			double average = sum / cnt;
			//计算平均数
			for (int i = 0; i < numbers.length; i++)
			//遍历数组并找出所需求的数据
			{
				if (numbers[i] > average) 
				{
					System.out.println(numbers[i]);	
				}
			}
			System.out.println(sum / cnt);
		}
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		eg2();
	}

}
