/*
 * 1.2.1
 * �ܽ᣺�����﷨��C����һ��
 * ������ֵ��for��䣬while��䣬if����else������䣬���������
 */

package mooc;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		System.out.println("hello world!");  //eg1������ַ���������""����
		
		Scanner in = new Scanner(System.in);   //eg2����ʼ����
//		System.out.println("echo:"+in.nextLine());//+��ʾ����ǰ���ַ����˴���ʾ������ӹ̶��ַ��������û�������ַ���
		
		
//		System.out.println("2+3="+2+3);    //eg3��error  ������Ϊ2+3=23
//		System.out.println("2+3="+(2+3));  //     true   ������Ϊ2+3=5
		
//		System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt()));//eg4��error    ���ζ������ݣ����������Σ���ȷ����Ϊʹ�ñ���
		int a;
		a = in.nextInt();
		System.out.println("100-"+a+"="+(100-a));//eg4:true    ����c����
	}

}
