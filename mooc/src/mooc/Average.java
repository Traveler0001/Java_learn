/**
 * 3.2.2:eg1
 * �ܽ᣺do����while������whileӦע��ѭ������������
 * 5.1.1
 * �ܽ᣺������÷���C���Ի���һ�£�������һЩ��ͬ�ĵط�
 * 		����ע���±�Խ�磬������������Խ������
 * 		Java�����ṩ�˼������鳤�ȵĹ���<������>.length
 * 		length�������һ���̶���Ա�������鶨��ʱ����ȷ��
 * 		
 * */

package mooc;

import java.util.Scanner;

public class Average {

	public static void eg1() {
		Scanner in = new Scanner(System.in);
		int num;//����
		int sum = 0;//�ܺ�
		int count = 0;//������
		
//		num = in.nextInt();//��������
//		while(num != -1)
//		{
//			sum = sum + num;
//			++count;//����
//			num = in.nextInt();
//		}
		do {
			num = in.nextInt();
			if(num != -1)//�ж������Ƿ���-1
			{
				sum = sum + num;
				count = count + 1;
			}
		}while(num != -1);
		if(count > 0)//ȷ��������������
		{
			System.out.println("ƽ����="+(double)sum/count);
		}	
	}
	
	public static void eg2() {
		Scanner in = new Scanner(System.in);
//		int x;
//		int []numbers= new int[100];
		//��������
		double sum = 0;
		int cnt = 0;
		cnt = in.nextInt();
		//ȷ�����鳤��
		if(cnt > 0)
		{
			int []numbers= new int[cnt];
			for(int i = 0;i < numbers.length; i++)
			//������д������
			{
				numbers[i] = in.nextInt();
				sum += numbers[i];
				//�����������ݵĺ�
			}
			double average = sum / cnt;
			//����ƽ����
			for (int i = 0; i < numbers.length; i++)
			//�������鲢�ҳ������������
			{
				if (numbers[i] > average) 
				{
					System.out.println(numbers[i]);	
				}
			}
			System.out.println(sum / cnt);
		}
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		eg2();
	}

}
