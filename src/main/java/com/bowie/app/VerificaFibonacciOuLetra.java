package com.bowie.app;

import java.util.Scanner;

public class VerificaFibonacciOuLetra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Verificar se um número pertence à sequência de Fibonacci");
			System.out.println("2 - Verificar a ocorrência da letra 'a' em uma string");
			System.out.println("0 - Sair");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir a nova linha

			switch (opcao) {
				case 1:
					System.out.print("Informe um número: ");
					int numero = scanner.nextInt();

					if (FibonacciChecker.isFibonacci(numero)) {
						System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
					} else {
						System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
					}
					break;

				case 2:
					System.out.print("Digite uma string: ");
					String input = scanner.nextLine();
					int count = ContaLetraA.contarLetras(input);
					if (count > 0) { // imprime quantas ocorrências, ou que não houveram ocorrências
						System.out.println("A letra 'a' ocorre " + count + " vezes na string.");
					} else {
						System.out.println("A letra 'a' não foi encontrada na string.");
					}
					break;

				case 0:
					System.out.println("Saindo do programa.");
					break;

				default:
					System.out.println("Opção inválida.");
					break;
			}

			System.out.println(); // Linha em branco para separar cada execução do menu

		} while (opcao != 0);

		scanner.close();
	}
}


