package mooc;

import java.util.Scanner;

public class Aaas {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int n;
		char k;
		n = in.nextInt();
		for (int i = 0; i <n; i++) {
			if(i > 0 && i < (n - 1))
				k = 'a';
			else
				k = 'b';
			switch(k)
			{
				case 'a':System.out.println("*      *");break;
				case 'b':System.out.println("********");break;
			}
		}
	}

}
