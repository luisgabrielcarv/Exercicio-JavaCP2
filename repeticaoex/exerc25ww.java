package repeticaoex;

import java.util.Scanner;
public class exerc25ww {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int va, t, i;
		System.out.printf("Insira um valor positivo: ");
		va = ler.nextInt();
		
		while(va <= 0) {
			System.out.printf("Valor positivo não encontrado. Insira um valor positivo: ");
			va=ler.nextInt();
		}
		i = 1;
		while(i<=10) {
			t = va * i;
			System.out.printf("\n%d X %d = %d", va, i, t);
			i++;
		}
		ler.close();
	}
}