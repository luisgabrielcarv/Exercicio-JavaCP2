package repeticaoex;

import java.util.Scanner;
public class exerc28ww {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int va;
		va = 1;
		int op = 0;
				
		while (va <= 100) {
			op = op + va;
			va++;
		}
		System.out.printf(":%d", op);
		ler.close();
	}
}