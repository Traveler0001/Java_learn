/*
 * 1.2.1
 * 总结：基础语法与C语言一致
 * 包括赋值，for语句，while语句，if……else……语句，定义变量等
 */

package mooc;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		System.out.println("hello world!");  //eg1：输出字符串，需用""包含
		
		Scanner in = new Scanner(System.in);   //eg2：初始化类
//		System.out.println("echo:"+in.nextLine());//+表示连接前后字符，此处表示输出连接固定字符串加上用户输入的字符串
		
		
//		System.out.println("2+3="+2+3);    //eg3：error  输出结果为2+3=23
//		System.out.println("2+3="+(2+3));  //     true   输出结果为2+3=5
		
//		System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt()));//eg4：error    两次读入数据，需输入两次，正确做法为使用变量
		int a;
		a = in.nextInt();
		System.out.println("100-"+a+"="+(100-a));//eg4:true    类似c语言
	}

}
