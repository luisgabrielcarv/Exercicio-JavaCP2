package repeticaoex;

import java.util.Scanner;
public class exerc24ww {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int va, t, i;

		i = 1;
		va = 5;
		
		while (i <= 10) {
			t = 5 * i;
			System.out.printf("\n%d X %d = %d", va, i, t);
			i++;
		}
		ler.close();
	}
}