package mooc;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);//��������䣬��Ȼ�ᱨ��
//		System.out.println(in);
//		int num = 0;
//		num = in.nextInt();//in.nextxxΪ�������ݵĶ���
//		System.out.println(num);
		// ��F = (9/5)*��C + 32
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
//		System.out.println(i);//�������¶�ת������
		int[][] m = {{1,4,7},
					{2,5,8},
					{3,6,9},};
		int i,j,k=2;
		for ( i=0; i<3; i++ ) {    
		    System.out.print(m[k][i]);
		}
	}
}
