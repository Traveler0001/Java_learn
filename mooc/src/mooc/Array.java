/**
 * 5.1.4eg1
 * *************************************
 * 5.1.4eg2
 * ��C���Բ�֮ͬ��
 * 
 *************************************
 * һ����ֵ�С����
 * 		int []num2 = {1,2,3,4,5,6,7,8,9};
 *		//�ô����Ÿ������������Ԫ�صĳ�ʼֵ
 *		//���Ҳ���Ҫ��������Ĵ�С�����������Լ�����
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
 *����
 *int []num2 = {0,1,2,3,4,5,6,7,8,9};
 *û����
 *
 *************************************
 *1.�������������Ĺ����߶������鱾��
 *2.������봴������Ȼ�󽻸��������������
 *3.�������֮��ĸ�ֵ�ǹ���Ȩ�޵ĸ���
 *4.�������֮��ıȽ����ж��Ƿ����ͬһ������
 * */

package mooc;

public class Array {

	public static void eg1()
	{
		int []num1 = new int[10];
		//new�����������Ĭ�ϳ�ʼ��Ϊ0
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i]+" ");
		}
		System.out.println();
		//����
		int []num2 = {0,1,2,3,4,5,6,7,8,9};
		//�ô����Ÿ������������Ԫ�صĳ�ʼֵ
		//���Ҳ���Ҫ��������Ĵ�С�����������Լ�����
		System.out.println(num2.length);
		for (int i : num2)
		{
			System.out.print(i+" ");
		}
		//for-eachѭ����iΪ�����е�ֵ
		//��ͬ��i=num2[count];countΪѭ������
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
		 * Java��������C���ԵĲ�ͬ������Java����Ľṹ���£�����int []num1 = new int[10];
		 * [num1][length][0][1][2][3][4][5][6][7][8][9]
		 * [length]��¼������ĳ���
		 * number������������10��Ԫ�أ�num1->[10]
		 * ��int []num2 = num1;ʱ�����ᷢ��num1��num2��ͬ����num1��10��Ԫ��
		 * num1->{[0][1][2][3][4][5][6][7][8][9]}<-num2
		 * ����
		 * int []num2 = num1;
		 * System.out.println(num1[0]);
		 * num2[0] = 16;
		 * System.out.println(num1[0]);
		 * �����
		 * 5 16
		 */
	}
	
	public static void eg3() {
		int []num1 = {1,2,3,4,5};
		int []num2 = new int[num1.length];
		//num2�ĳ��ȵ���num1
		for (int i = 0; i < num2.length; i++) 
		{
			num2[i] = num1[i];
		}
		//����ֵ�Ŀ������������ֵ
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i]+" ");
		}
		//�������num2��ֵ
		System.out.println();
		System.out.println(num1==num2);
		//�ж��������Ƿ����ͬһ������
		//���false
		//���ж�������ֵ�Ƿ�һ��ֻ�ܱ����Ƚϣ��ɵ���������������Ƿ����
		
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
		//for-eachѭ����iΪ�����е�ֵ
		//��ͬ��i=num2[count];countΪѭ������
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		eg1();
		System.out.println();
		eg2();
		System.out.println();
		eg3();
		eg5();
	}

}
