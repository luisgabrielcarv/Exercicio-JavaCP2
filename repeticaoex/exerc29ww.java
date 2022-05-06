package repeticaoex;

import java.util.Scanner;
public class exerc29ww {
	
	public static void main(String[] args) {

		int va=30, c, a=1, b=1, i=3;
		
		System.out.printf("%d\n%d", a, b);
		while (i <= va) {
			System.out.printf("\n");
			c = a + b;
			System.out.printf(":%d", c);
			a = b;
			b = c;
			i++;
		}	
	}

	}
