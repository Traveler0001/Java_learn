/**
 * 1.3.1
 * �ܽ᣺ǿ������ת����C�����÷�һ��
 * 		��Χ���Զ�ת��խ��Χ����֮������
 * 
 * �������ı�ʾҲ��C����һ�£���ѭIEEE����
 * 
 * �������ȼ���C��������
 * */


package mooc;

import java.util.Scanner;

public class Foot_inch {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int foot = 0;
		double inch = 0;
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextDouble();
		System.out.println("10/3="+10/3);   //Ĭ������Ϊint��������С��������֣�10/3=3
		System.out.println("foot="+foot+",inch="+inch );
		System.out.println((foot+inch/12)*0.3048);
		System.out.println((foot+inch/12)*0.3048*100+"cm");
		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");//ǿ������ת�����÷�����C���ԡ����������ͣ������ʽ����
		/*��������
		 * 3 7
		 *10/3=3
		 *foot=3,inch=7.0
		 *1.0922
		 *109.22cm
		 *109cm
		 */
	}

}
