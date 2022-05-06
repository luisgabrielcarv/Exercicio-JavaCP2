package repeticaoex;

import java.util.Scanner;
public class exerc30ff {
	
	public static void main(String[] args) {

		int a = 1, b = 1, c = 1, d;

		System.out.printf("%d\n%d\n%d", a, b, c);
		for (int i =3; i<=20; i++) {
			System.out.printf("\n");
			d = a + b + c;
			System.out.printf(":%d", d);
			a = b;
			b = c;
			c = d;
		}
		
	}
	
	
}


