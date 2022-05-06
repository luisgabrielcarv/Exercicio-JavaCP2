package repeticaoex;

import java.util.Scanner;
public class exerc27ff {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int t;
		
		for (int va = 1; va <= 20; va++) {
			System.out.println("Insira o valor: ");
			ler.next();
			
			for(int i = 1; i<=10; i++) {
				t = va * i;
				System.out.printf("\n%d X %d = %d", va, i, t);
			}
			System.out.printf("\n");
		}
		ler.close();
	}
}