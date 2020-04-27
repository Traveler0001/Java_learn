/**
 * 6.1.1eg1
 * */

package mooc;

public class Character {

	public static void eg1() {
		char a = 'a';
		char b = 'A';
		System.out.println(a > b);
		//字符之间比较的是编码值的大小
	}
	
	public static void eg2() {
		//逃逸字符
		//‘/’开头的特殊字符，不显示
		/*
		 *\b回退一格，\t到下一个表格位
		 *\n换行，\r回车==enter
		 *\"双引号，\'单引号
		 *\\反斜杠本身
		 */
	}	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		eg1();
	}

}
