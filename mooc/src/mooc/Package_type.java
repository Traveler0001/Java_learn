/*6.1.2
 * 基础类型      包裹类型
 * boolean-> Boolean
 * char   -> Character
 * int    -> Integer
 * double -> Double
 */
package mooc;

public class Package_type {

	public static void eg1() {
		int i = 10;
		Integer k = 0;
		k = i;
		System.out.println(k);
		//包裹类型与基础类型之间可以相互赋值
		//包裹类型可以当基础类型使用
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//输出int型变量最大(小)可以储存的值[-2e32-1,2e31]
		//[0xffffffff,0xefffffff]
		//Double类似
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Double.SIZE);
		//输出所占字节数
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		eg1();
	}

}
