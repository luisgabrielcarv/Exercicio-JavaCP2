package repeticaoex;

import java.util.Scanner;
public class exerc25dd {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int va, t, i;
		do {
			System.out.printf("Insira um valor positivo: ");
			va = ler.nextInt();
		} while (va <= 0);
		
		i=1; 
		
		do {
			t = va * i;
			System.out.printf("\n%d X %d = %d", va, i, t);
			i++;
			
		} while (i <= 10);
		
		ler.close();
	}
}
