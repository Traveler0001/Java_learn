/*
 * String是一个类，首字母大写
 * String的变量是对象的管理者而非拥有着
 * 类似于数组变量与数组本身
 * String s；s = "asdfgh"
 * [s][length]'a''s''d''f''g''h'
 * length表示字符串长度
 */

package mooc;

import java.util.Scanner;

public class String_use {

	public static void eg1() {
		Scanner in = new Scanner(System.in);
		String str1;
		//创建字符串变量
		str1 = in.nextLine();
		System.out.println(str1.length());
		//输出字符长度
		System.out.println(str1);
		String str2;
		str2 = str1;
		//与数组类似
		//[str1]->'''''''''''<-[str2]
		System.out.println(str2);
		System.out.println(str1==str2);
//		与数组一样，判断的是是否管理的是同一个字符串
		String str3 = "Hello";
		String str4 = "Hello";
		System.out.println(str3==str4);
		System.out.println(str3.equals("Hello"));
		System.out.println(str3.equals(str4));
		//str3.equals比较字符串是否相等
		System.out.println(str3.compareTo(str4));
		//str3.compareTo比较字符串大小，相同为0，大于为正，小于为负
		System.out.println(str3.charAt(0));
		//str3.charAt(index)查询字符串内的单个字符
		for (int j = 0; j < str3.length(); j++) {
			System.out.println(str3.charAt(j));
		}
		//遍历输出字符
		System.out.println(str3.substring(3));
		//输出从第i个字符开始的所有字符
		System.out.println(str3.substring(1, 4));
		//输出第i至k-1个字符，标号从0开始
		String str5 = "asdfg";
		str5.toUpperCase();
		//将str5改为全大写
		System.out.println(str5);
		//输出为小写，用法错误，
		/********************
		 * 字符串操作不会改变自己，只能复制新的字符串一个进行操作
		 ********************/
		String str6 = str5.toUpperCase();
		System.out.println(str6);
		//这个就对了
	}
	
	public static void eg2() {
		Scanner in = new Scanner(System.in);
		String str1 = "hello ";
		String str2 = "World!";
		System.out.println(str1+str2);
		//字符串可以用+连接
		System.out.println(str1+465);
		//当+另一边不是字符串时，会将其转化为字符串然后连接
		String str3;
		str3 = in.next();
		System.out.println(str3);
//		System.out.println(str3);
		//只能读入一个单词，不能读入一句话
		String str4;
		str4 = in.nextLine();
		System.out.println(str4);
//		System.out.println(str4);
		//可以读入一句完整的话
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
			default:System.out.println("都不是");break;
		}
		//switch...case也可以使用字符串
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		eg1();
		System.out.println();
		eg2();
		System.out.println();
		eg3();
	}

}
