/**
 * 3.2.3
 * �ܽ᣺C������Java���������Ƶĵط�̫����
 * */

package mooc;

import java.util.Scanner;

public class Guess_number {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		//��ʼ��
		int number = (int)(Math.random()*100+1);
		//���������
		//Math.random()����[0��1)�����ڵ������
		//*100+1�����[1��100]�ڵ�����
		int putin = 0;
		int count = 0;
//		while(putin != number)
//		{
//			putin = in.nextInt();
//			++count;
//			if(putin > number)
//			{
//				System.out.println("ƫ��");
//			}
//			else
//			{
//				System.out.println("ƫС");
//			}
//		}
		do{
			putin = in.nextInt();
			++count;
			if(putin > number)
			{
				System.out.println("ƫ��");
			}
			else
			{
				System.out.println("ƫС");
			}
		}while(putin != number);
		System.out.println("��ϲ��¶��ˣ�������"+count+"��");
	}

}
