package repeticaoex;

import java.util.Scanner;
public class exerc23ww {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char gen;
		
		System.out.printf("Informe o seu genero: ");
		gen = ler.next().toUpperCase().charAt(0);
		
		for (;(gen != 'm')&&(gen != 'f');) {
			
			System.out.printf("informe um genero valido: ");
			gen = ler.next().toUpperCase().charAt(0);
		}
		if (gen == 'M'){
			System.out.printf("genero Masculino ");
			gen = ler.next().charAt(0);
		}
		else {
			System.out.printf("genero Feminino");
			gen = ler.next().charAt(0);
		}

	}

}