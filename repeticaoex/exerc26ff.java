package repeticaoex;

import java.util.Scanner;
public class exerc26ff {
	
	public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
		
         int t, a, b;
	
		System.out.printf("Insira o valor A: ");
		a = ler.nextInt();
		
		System.out.printf("Insira valor B: ");
		b = ler.nextInt();
		
		while (b < a) {
			System.out.printf("Valor B menor que o valor A. Insira o valor B: ");
			b = ler.nextInt();
		}
		for (int i = b; i >= a; i--) {
			t = a * i;
			System.out.printf("\n%d X %d = %d", a, i, t);
			i--;
		}
		ler.close();
	}
}