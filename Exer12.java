//Uma turma tem n alunos.
//Dado n, o nome(somente o primeiro nome) e idade de cada aluno descreva:
//a) os nomes dos alunos que tem 18 anos; 
//b) a quantidade de alunos que tem idade acima de 20 anos.

package exercicos_laco;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o número de alunos: ");
		int n = entrada.nextInt();
		entrada.nextLine();

		@SuppressWarnings("unused")
		int contador18Anos = 0;
		int contadorAcima20Anos = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o nome do aluno " + i + ": ");
			String nome = entrada.nextLine();

			System.out.print("Digite a idade do aluno " + i + ": ");
			int idade = entrada.nextInt();
			entrada.nextLine();

			if (idade == 18) {
				System.out.println("Aluno com 18 anos: " + nome);
				contador18Anos++;
			}

			if (idade > 20) {
				contadorAcima20Anos++;
			}
		}

		System.out.println("Quantidade de alunos com idade acima de 20 anos: " + contadorAcima20Anos);
	}
}