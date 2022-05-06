package repeticaoex;

import java.util.Scanner;
public class exerc30dd {
	
	public static void main(String[] args) {
		
		int a=1, b=1, c=1, d, i=3;
		
		System.out.printf("%d\n%d\n%d", a, b, c);
		do {
			System.out.printf("\n");
			d = a + b + c;
			System.out.printf(":%d", d);
			a = b;
			b = c;
			c = d;
			i++;
		}while (i<= 20);
	}

}