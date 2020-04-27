package mooc;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);//必须有这句，不然会报错
//		System.out.println(in);
//		int num = 0;
//		num = in.nextInt();//in.nextxx为读入数据的动作
//		System.out.println(num);
		// °F = (9/5)*°C + 32
		/*
		 * (9/5)c=f-32
		 * c=(f-32)*5/9
		 */
//		int i;
//		double k;
//		i = in.nextInt();
//		k = (i-32.0)*5/9; 
//		System.out.println((int)k);
//		int i = 1;
//		do {
//		    i = i+5;
//		} while (i<17);
//		System.out.println(i);//这里是温度转换程序
		int[][] m = {{1,4,7},
					{2,5,8},
					{3,6,9},};
		int i,j,k=2;
		for ( i=0; i<3; i++ ) {    
		    System.out.print(m[k][i]);
		}
	}
}
