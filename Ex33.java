package ddd;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		produtos[] listaprodutos = new produtos[10];

		for (int i = 0; i <= 9; i++) {

			produtos p = new produtos();

			System.out.printf("Digite o id do produto: ");
			p.id = ler.nextInt();

			System.out.printf("Digite a descrição do produto: ");
			p.descricao = ler.next();

			System.out.printf("Digite o valor do produto: ");
			p.valor = ler.nextDouble();

			System.out.printf("Digite a quantidade: ");
			p.quantidade = ler.nextDouble();

			listaprodutos[i] = p;

		}

		for (int i = 0; i <= 9; i++) {

			if (listaprodutos[i].valor <= 99) {
				System.out.printf("O produto (%s) foi cadastrado com sucesso e seu valor é (%.2f)",
						listaprodutos[i].descricao, listaprodutos[i].valor);

			}

		}

	}

}
