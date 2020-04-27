/**
 * 4.2.1
 * 无总结：eg1
 * 4.2.2
 * eg2总结：
 * print不换行打印，println换行打印
 * */

package mooc;

import java.util.Scanner;

public class Prime {

	public static void eg1() {
		//素数只能被自己或1整除
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for(int i = 2;i < n;i++)
		{
			if(n % i == 0)//eg：4%2=0
			{
				isPrime = 0;
				System.out.println(n+"不是素数");
				break;
			}
		}
		if(isPrime == 1)
		{
			System.out.println(n+"是素数");
		}	
		
	}
	
	public static void eg2() {
		//输出100以内的素数
		for(int n = 2; n < 100; n++)
		{
			int isPrime = 1;
			for(int i = 2;i < n;i++)
			{
				if(n % i == 0)
				{
					isPrime = 0;
//					System.out.println(n+"不是素数");
					break;
				}
			}
			if(isPrime == 1)
			{
				System.out.print(n+" ");
//				System.out.println(n+"是素数");
			}
			else
			{
//				System.out.println(n+"不是素数");
			}
		}
		
	}

	public static void eg3() {
		//去掉偶数后，从3到x-1，每次加2
		//如果x是偶数，立刻排除
		//否则要循环（n-3）/2+1遍
		//当n很大时就是n/2遍
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		boolean isPrime = true;
		if (x == 1 || x%2 == 0 && x != 2) 
		{
			isPrime = false;
		}
		else
		{
			for( int i=3; i<x; i+=2)
			{
				if( x % i == 0)
				{
					isPrime = false;
	//				System.out.println(n+"不是素数");
					break;
				}
			}
			
		}
		if(isPrime)
		{
//			System.out.print(x+" ");
			System.out.println(x+"是素数");
		}
		else
			{
			System.out.println(x+"不是素数");
		}	
	}

	public static void eg4() {
		//无须到x-1，到sqrt（x）就够了
		//只需循环到sqrt（x）遍
		//从n->n/2->sqrt(n)
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		boolean isPrime = true;
		if (x == 1 || x%2 == 0 && x != 2) 
		{
			isPrime = false;
		}
		else
		{
			for (int i = 3; i < Math.sqrt(x); i+=2) {
				if (x % i == 0) {
					isPrime = false;
					break;
				}
			}
				
		}
		if(isPrime)
		{
//			System.out.print(x+" ");
			System.out.println(x+"是素数");
		}
		else
			{
			System.out.println(x+"不是素数");
		}	
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		eg1();
		eg3();
		eg4();
	}

}
