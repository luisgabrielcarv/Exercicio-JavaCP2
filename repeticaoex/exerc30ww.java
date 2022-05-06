package repeticaoex;

import java.util.Scanner;
public class exerc30ww {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int va, i=0, terc=3, nva=2;
		
		do {
			System.out.printf("Insira um valor de 0 a 99: ");
			va = ler.nextInt();
		}while (va<0 || va>100);
		
		do {
				nva = nva + terc;
				terc = terc+2;
				System.out.println(nva);
				i++;
				
		}while(i<va);
		
	}

}
