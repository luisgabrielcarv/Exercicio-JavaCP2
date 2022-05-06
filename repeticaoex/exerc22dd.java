package repeticaoex;

import java.util.Scanner;
public class exerc22dd {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int va1, va2;

		System.out.printf("Digite o valor1: ");
		va1 = ler.nextInt();

		System.out.printf("Digite o valor2: ");
		va2 = ler.nextInt();

		if (va2 <= va1) {
			do {
				System.out.printf("Digite um valor maior que o valor1: ");
				va2 = ler.nextInt();

			} while (va2 <= va1);
		}
		System.out.printf("Valor encontrado.");
		ler.close();
	}

}