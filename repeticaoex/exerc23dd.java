package repeticaoex;

import java.util.Scanner;
public class exerc23dd {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char gen;
		
		do {
			System.out.printf("Informe o genero, m ou f: ");
			gen = ler.next().toUpperCase().charAt(0);
		}while (gen != 'm' && gen != 'f');
		
		if (gen == 'm'){
			System.out.printf("genero Masculino ");
			gen = ler.next().charAt(0);
		}
		else {
			System.out.printf("genero Feminino");
			gen = ler.next().charAt(0);
		}

	}

}