/*6.1.2
 * ��������      ��������
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
		//�����������������֮������໥��ֵ
		//�������Ϳ��Ե���������ʹ��
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//���int�ͱ������(С)���Դ����ֵ[-2e32-1,2e31]
		//[0xffffffff,0xefffffff]
		//Double����
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Double.SIZE);
		//�����ռ�ֽ���
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		eg1();
	}

}
