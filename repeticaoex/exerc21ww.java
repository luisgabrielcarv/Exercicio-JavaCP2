package repeticaoex;

import java.util.Scanner;
public class exerc21ww {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int va;
		
		
		System.out.printf("Digite um valor positivo: ");
		va = ler.nextInt();
		
		while( va <= 0) {
			System.out.printf("Valor não encontrado. Novamente Digite um valor positivo:");
			va = ler.nextInt();	
		}
		
		ler.close();
	}
}

