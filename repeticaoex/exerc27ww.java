package repeticaoex;

import java.util.Scanner;
public class exerc27ww {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, t, va;
		
		va = 1;

		while (va <= 20) {
			i = 1;
			System.out.println("Insira o valor: ");
			ler.next();
			while (i <= 10) {
				t = va * i;
				System.out.printf("\n%d X %d = %d", va, i, t);
				i++;
				
			}
			System.out.printf("\n");
			va++;
		}
		ler.close();
	}
}