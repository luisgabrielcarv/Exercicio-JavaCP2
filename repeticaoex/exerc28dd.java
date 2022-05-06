package repeticaoex;

import java.util.Scanner;
public class exerc28dd {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int va, op;
		va = 1;
		
		op = 0;
		
		do {
			op = op + va;
			va++;
			 
		}while(va <=100);
		System.out.printf(":%d", op);
		
		ler.close();
	

	}
}


