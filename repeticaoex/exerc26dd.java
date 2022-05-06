package repeticaoex;

import java.util.Scanner;
public class exerc26dd {
	
	public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
		
         int t, a, b;
	
		System.out.printf("Insira o valor A: ");
		a = ler.nextInt();
		
		System.out.printf("Insira valor B: ");
		b = ler.nextInt();
		
		do {
			System.out.printf("Valor B menor que o valor A. Insira o valor B: ");
			b = ler.nextInt();
		} while (b <= a);
		
		do {
			t = a * b;
			System.out.printf("\n%d X %d = %d", a, b, t);
			b--;
		}while (b>= a);
		ler.close();
	}
}