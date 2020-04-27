/**
 * 5.1.4eg1
 * *************************************
 * 5.1.4eg2
 * 与C语言不同之处
 * 
 *************************************
 * 一个奇怪的小错误
 * 		int []num2 = {1,2,3,4,5,6,7,8,9};
 *		//用大括号给出数组的所有元素的初始值
 *		//并且不需要给出数组的大小，编译器会自己计算
 *		System.out.println(num2.length);
 *		for (int i : num2)
 *		{
 *			System.out.print(num2[i]+" ");
 *		}
 *		
 *	9
 *	2 3 4 5 6 7 8 9 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
 *	at mooc.Array.eg1(Array.java:25)
 *	at mooc.Array.main(Array.java:31)
 *但是
 *int []num2 = {0,1,2,3,4,5,6,7,8,9};
 *没错误
 *
 *************************************
 *1.数组变量是数组的管理者而非数组本身
 *2.数组必须创建出来然后交给数组变量来管理
 *3.数组变量之间的赋值是管理权限的赋予
 *4.数组变量之间的比较是判断是否管理同一个数组
 * */

package mooc;

public class Array {

	public static void eg1()
	{
		int []num1 = new int[10];
		//new创建的数组会默认初始化为0
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i]+" ");
		}
		System.out.println();
		//换行
		int []num2 = {0,1,2,3,4,5,6,7,8,9};
		//用大括号给出数组的所有元素的初始值
		//并且不需要给出数组的大小，编译器会自己计算
		System.out.println(num2.length);
		for (int i : num2)
		{
			System.out.print(i+" ");
		}
		//for-each循环中i为数组中的值
		//等同于i=num2[count];count为循环计数
		System.out.println();
	}

	public static void eg2() {
		int []num1 = new int[10];
		num1[0] = 5;
		int []num2 = num1;
		System.out.println(num1[0]);
		num2[0] = 16;
		System.out.println(num1[0]);
		/*
		 * Java的数组与C语言的不同点在于Java数组的结构如下，例如int []num1 = new int[10];
		 * [num1][length][0][1][2][3][4][5][6][7][8][9]
		 * [length]记录了数组的长度
		 * number管理着数组中10个元素，num1->[10]
		 * 当int []num2 = num1;时，将会发生num1与num2共同管理num1的10个元素
		 * num1->{[0][1][2][3][4][5][6][7][8][9]}<-num2
		 * 所以
		 * int []num2 = num1;
		 * System.out.println(num1[0]);
		 * num2[0] = 16;
		 * System.out.println(num1[0]);
		 * 将输出
		 * 5 16
		 */
	}
	
	public static void eg3() {
		int []num1 = {1,2,3,4,5};
		int []num2 = new int[num1.length];
		//num2的长度等于num1
		for (int i = 0; i < num2.length; i++) 
		{
			num2[i] = num1[i];
		}
		//数组值的拷贝必须遍历赋值
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i]+" ");
		}
		//遍历输出num2的值
		System.out.println();
		System.out.println(num1==num2);
		//判断两数组是否管理同一组数组
		//输出false
		//而判断两数组值是否一致只能遍历比较，由第三个变量来输出是否相等
		
	}
	
	public static void eg4() throws InterruptedException {
		int []num1 = new int[4];
		num1.clone();
		num1.equals(num1);
		num1.getClass();
		num1.hashCode();
		num1.notify();
		num1.notifyAll();
		num1.toString();
		num1.wait();
		num1.wait(0);
		num1.wait(0, 0);
		int a;
		a = num1.length;
	}
	
	public static void eg5() {
		System.out.println();
		//for-each
		int []num1 = {1,2,3,4,5};
		for ( int i : num1) 
		{
				System.out.print(i+" ");
		}
		//for-each循环中i为数组中的值
		//等同于i=num2[count];count为循环计数
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		eg1();
		System.out.println();
		eg2();
		System.out.println();
		eg3();
		eg5();
	}

}
