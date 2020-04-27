/**
 * 1.3.1
 * 总结：强制类型转换与C语言用法一致
 * 		宽范围会自动转换窄范围，反之不成立
 * 
 * 浮点数的表示也与C语言一致，遵循IEEE规则
 * 
 * 运算优先级与C语言类似
 * */


package mooc;

import java.util.Scanner;

public class Foot_inch {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int foot = 0;
		double inch = 0;
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextDouble();
		System.out.println("10/3="+10/3);   //默认类型为int，不保留小数点后数字，10/3=3
		System.out.println("foot="+foot+",inch="+inch );
		System.out.println((foot+inch/12)*0.3048);
		System.out.println((foot+inch/12)*0.3048*100+"cm");
		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");//强制类型转换，用法类似C语言【（变量类型）（表达式）】
		/*输出结果：
		 * 3 7
		 *10/3=3
		 *foot=3,inch=7.0
		 *1.0922
		 *109.22cm
		 *109cm
		 */
	}

}
