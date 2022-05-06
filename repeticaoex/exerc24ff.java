package repeticaoex;

import java.util.Scanner;
public class exerc24ff {
	
	public static void main(String[]args) {
		
		int va, t, i;
		va= 5;
		
		for(i=1; i<=10; i++) {
			t = va * i;
			System.out.printf("\n%d X %d = %d", va, i, t);
		}
	}
}