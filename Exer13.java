//Escreva um programa para achar o fatorial de um número

package exercicos_laco;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número para calcular o fatorial: ");
		int numero = entrada.nextInt();

		long fatorial = 1;

		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}

		System.out.println("O fatorial de " + numero + " é: " + fatorial);
	}
}
