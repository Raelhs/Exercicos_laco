//Dada uma turma de alunos, contendo seu nome e nota de duas provas.
//Descreva um algoritmo para informar a média de cada aluno.
//Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.

package exercicos_laco;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		while (true) {
			System.out.print("Digite o nome do aluno (ou 'fim' para sair): ");
			String nome = entrada.nextLine();

			if (nome.equalsIgnoreCase("fim")) {
				break;
			} else {
				System.out.print("Digite a nota da primeira prova: ");
				double nota1 = entrada.nextDouble();
				System.out.print("Digite a nota da segunda prova: ");
				double nota2 = entrada.nextDouble();

				double media = (nota1 + nota2) / 2;
				System.out.printf("Média do aluno " + nome + ": " + media + "%n");

				entrada.nextLine();
			}
		}
	}
}