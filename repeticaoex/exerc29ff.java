package repeticaoex;

import java.util.Scanner;
public class exerc29ff {
	
	public static void main(String args[]) {

		int c, a = 1, b = 1;

		System.out.printf("%d\n%d", a, b);
		
		for (int i = 3; i <= 30; i++) {
			System.out.printf("\n");
			c = a + b;
			System.out.printf(":%d", c);
			a = b;
			b = c;
		}
	}
}