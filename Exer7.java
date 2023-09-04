//Descreva um algoritmo que leia a altura de 5 pessoas e calcule a média de altura das mesmas.

package exercicos_laco;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		double somaAlturas = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite a altura da pessoa " + i + ": ");
			double altura = entrada.nextDouble();
			somaAlturas += altura;
		}

		double mediaAltura = somaAlturas / 5;
		System.out.println("Média de altura das pessoas: " + mediaAltura);
	}
}
