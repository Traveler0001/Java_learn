/**
 * 4.2.1
 * ���ܽ᣺eg1
 * 4.2.2
 * eg2�ܽ᣺
 * print�����д�ӡ��println���д�ӡ
 * */

package mooc;

import java.util.Scanner;

public class Prime {

	public static void eg1() {
		//����ֻ�ܱ��Լ���1����
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for(int i = 2;i < n;i++)
		{
			if(n % i == 0)//eg��4%2=0
			{
				isPrime = 0;
				System.out.println(n+"��������");
				break;
			}
		}
		if(isPrime == 1)
		{
			System.out.println(n+"������");
		}	
		
	}
	
	public static void eg2() {
		//���100���ڵ�����
		for(int n = 2; n < 100; n++)
		{
			int isPrime = 1;
			for(int i = 2;i < n;i++)
			{
				if(n % i == 0)
				{
					isPrime = 0;
//					System.out.println(n+"��������");
					break;
				}
			}
			if(isPrime == 1)
			{
				System.out.print(n+" ");
//				System.out.println(n+"������");
			}
			else
			{
//				System.out.println(n+"��������");
			}
		}
		
	}

	public static void eg3() {
		//ȥ��ż���󣬴�3��x-1��ÿ�μ�2
		//���x��ż���������ų�
		//����Ҫѭ����n-3��/2+1��
		//��n�ܴ�ʱ����n/2��
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
	//				System.out.println(n+"��������");
					break;
				}
			}
			
		}
		if(isPrime)
		{
//			System.out.print(x+" ");
			System.out.println(x+"������");
		}
		else
			{
			System.out.println(x+"��������");
		}	
	}

	public static void eg4() {
		//���뵽x-1����sqrt��x���͹���
		//ֻ��ѭ����sqrt��x����
		//��n->n/2->sqrt(n)
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
			System.out.println(x+"������");
		}
		else
			{
			System.out.println(x+"��������");
		}	
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		eg1();
		eg3();
		eg4();
	}

}
