package repeticaoex;

import java.util.Scanner;
public class exerc29dd {
	
	public static void main(String[] args) {

		int c, a = 1, b = 1, i = 3;

		System.out.printf("%d\n%d", a, b);
		do {
		
			System.out.printf("\n");
			c = a + b;
			System.out.printf(":%d", c);
			a = b;
			b = c;
			i++;
		} while (i <= 30);
	}
	
}