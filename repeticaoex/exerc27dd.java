package repeticaoex;

import java.util.Scanner;
public class exerc27dd {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, t, va;

		va = 1;

		do {
			i = 1;
			System.out.println("Insira o valor: ");
			ler.next();
			do {
				t = va * i;
				System.out.printf("\n%d X %d = %d", va, i, t);
				i++;
			} while (i <= 10);
			va++;
			System.out.printf("\n");
		} while (va <= 20);
		ler.close();
	}
}