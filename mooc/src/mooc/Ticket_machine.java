/**
 * 2.1.1
 * �ܽ᣺�Ƚ�����Ľ��Ϊboolen���ͣ�ֻ��Ϊtrue��false
 * 
 * ��֪ʶ�㣺�жϸ������Ƿ����
 * ��Math����
 * System.out.println(Math.abs(a-b)>1e-6);
 * a-b�ľ���ֵ�Ƚ�1*10��-6�η�
 * */

package mooc;

import java.util.Scanner;

public class Ticket_machine {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		//��ʼ��
		
		System.out.println("******************");
		System.out.println("*Java�Ǽ���·ר��*");
		System.out.println("*   ��ָ����λ     *");
		System.out.println("*   Ʊ�ۣ�10Ԫ     *");
		System.out.println("******************");
		//��ӡ��ʾ��
		
		double a = 0.8 + 0.1;
		double b = 0.8 + 0.1;
		
		System.out.println(Math.abs(a-b)>1e-6);
		
		int sum = 0;
		//��¼�������
		for(sum = 0; sum < 10;)
		{
			int amount = in.nextInt();
			//�����û����������
			sum = sum + amount;
			if(sum > 10)
			{
				System.out.println(" �ѳ�Ʊ�����㣺 "+ (sum-10)+" Ԫ");
				//���㲢��ӡ����
				break;
			}
			else
			{
				System.out.println("���㣬ȱ��"+ (10-sum)+"Ԫ");
				System.out.println("     ��Ͷ��");
			}
			//�������if����else�����÷���C����һ�£��²�ѭ�����while��forӦ��Ҳһ��
			
		}
	}

}
