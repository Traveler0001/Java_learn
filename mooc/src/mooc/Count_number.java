/**
 * 3.1.2
 * whileѭ���﷨��C����һ��
 * do����while����ѭ����C�����÷�Ҳһ��
 * */

package mooc;

import java.util.Scanner;

public class Count_number {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
		}while( num > 0);//�˴�һ��Ҫ�ӷֺ�;
		System.out.println(num+"��"+count+"λ��");
	}

}
