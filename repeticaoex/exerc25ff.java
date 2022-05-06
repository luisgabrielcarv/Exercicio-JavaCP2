package repeticaoex;

import java.util.Scanner;
public class exerc25ff {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int va, t;
		
		do {
			System.out.printf("Insira um valor positivo: ");
			va = ler.nextInt();
			
		} while (va <= 0);
		
		for (int i=1; i <=10; i++) {
			t = va * i;
			System.out.printf("\n%d X %d = %d", va, i, t);
		}
		ler.close();
	}
}