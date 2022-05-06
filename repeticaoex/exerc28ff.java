package repeticaoex;

import java.util.Scanner;
public class exerc28ff {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int op;
	    
		op = 0;

		for (int va = 1; va <= 100; va++) {
			op = op + va;
		}
		System.out.printf(":%d", op);
		ler.close();
	}
}


