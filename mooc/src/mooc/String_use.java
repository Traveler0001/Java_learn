/*
 * String��һ���࣬����ĸ��д
 * String�ı����Ƕ���Ĺ����߶���ӵ����
 * ������������������鱾��
 * String s��s = "asdfgh"
 * [s][length]'a''s''d''f''g''h'
 * length��ʾ�ַ�������
 */

package mooc;

import java.util.Scanner;

public class String_use {

	public static void eg1() {
		Scanner in = new Scanner(System.in);
		String str1;
		//�����ַ�������
		str1 = in.nextLine();
		System.out.println(str1.length());
		//����ַ�����
		System.out.println(str1);
		String str2;
		str2 = str1;
		//����������
		//[str1]->'''''''''''<-[str2]
		System.out.println(str2);
		System.out.println(str1==str2);
//		������һ�����жϵ����Ƿ�������ͬһ���ַ���
		String str3 = "Hello";
		String str4 = "Hello";
		System.out.println(str3==str4);
		System.out.println(str3.equals("Hello"));
		System.out.println(str3.equals(str4));
		//str3.equals�Ƚ��ַ����Ƿ����
		System.out.println(str3.compareTo(str4));
		//str3.compareTo�Ƚ��ַ�����С����ͬΪ0������Ϊ����С��Ϊ��
		System.out.println(str3.charAt(0));
		//str3.charAt(index)��ѯ�ַ����ڵĵ����ַ�
		for (int j = 0; j < str3.length(); j++) {
			System.out.println(str3.charAt(j));
		}
		//��������ַ�
		System.out.println(str3.substring(3));
		//����ӵ�i���ַ���ʼ�������ַ�
		System.out.println(str3.substring(1, 4));
		//�����i��k-1���ַ�����Ŵ�0��ʼ
		String str5 = "asdfg";
		str5.toUpperCase();
		//��str5��Ϊȫ��д
		System.out.println(str5);
		//���ΪСд���÷�����
		/********************
		 * �ַ�����������ı��Լ���ֻ�ܸ����µ��ַ���һ�����в���
		 ********************/
		String str6 = str5.toUpperCase();
		System.out.println(str6);
		//����Ͷ���
	}
	
	public static void eg2() {
		Scanner in = new Scanner(System.in);
		String str1 = "hello ";
		String str2 = "World!";
		System.out.println(str1+str2);
		//�ַ���������+����
		System.out.println(str1+465);
		//��+��һ�߲����ַ���ʱ���Ὣ��ת��Ϊ�ַ���Ȼ������
		String str3;
		str3 = in.next();
		System.out.println(str3);
//		System.out.println(str3);
		//ֻ�ܶ���һ�����ʣ����ܶ���һ�仰
		String str4;
		str4 = in.nextLine();
		System.out.println(str4);
//		System.out.println(str4);
		//���Զ���һ�������Ļ�
	}
	
	
	public static void eg3() {
		Scanner in = new Scanner(System.in);
		String str1;
		str1 = in.next();
		switch(str1)
		{
			case"this":System.out.println(str1);break;
			case"that":System.out.println(str1);break;
			case"is":System.out.println(str1);break;
			case"are":System.out.println(str1);break;
			case"we":System.out.println(str1);break;
			default:System.out.println("������");break;
		}
		//switch...caseҲ����ʹ���ַ���
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		eg1();
		System.out.println();
		eg2();
		System.out.println();
		eg3();
	}

}
