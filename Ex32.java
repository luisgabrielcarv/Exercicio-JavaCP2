package ddd;

import java.util.Scanner;

public class Ex32 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		clientes[] listaclientes = new clientes[5];
		
		
		for (int i=0; i<=4; i++) {
			
			clientes c = new clientes();
			
			
					
			System.out.printf("Digite o id do cliente:");
			c.id = ler.nextInt();
			
			System.out.printf("Digite o nome do cliente:");
			c.nome = ler.next();
			
			System.out.printf("Digite a idade do cliente:");
			c.idade = ler.nextInt();
			
			System.out.printf("Digite o email do cliente:");
			c.email = ler.next();
			
			
		
			listaclientes[i] = c;
			
		}
		
         for (int i=0; i<=4; i++) {
        	 
     		if (listaclientes[i].idade >= 18) {
    			System.out.printf("Cliente %d criado com sucesso (%s)!",listaclientes[i].id, listaclientes[i].nome);
			
		}
	
		
		}
		
		

	}
	
}
