package repeticaoex;

import java.util.Scanner;
public class exerc24dd {
	
		public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int va, i , t;
			
		va = 5;
		i = 1;
			
			do {
				t = va * i;
				System.out.printf("\n%d X %d = %d", va, t, i);
				i++;
			}
			while (i<=10);	
			ler.close();
		}
	}
