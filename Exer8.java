//Descreva um algoritmo que v� lendo a altura de pessoas at� o usu�rio entrar com o n�mero 0
//Calcule a m�dia de altura das mesmas.

package exercicos_laco;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		double somaAlturas = 0;
		int contador = 0;
		double altura = 1;

		while (altura != 0) {
			System.out.print("Digite a altura da pessoa (ou 0 para sair): ");
			altura = entrada.nextDouble();

			if (altura != 0) {
				somaAlturas += altura;
				contador++;
			}
		}

		if (contador != 0) {
			double mediaAltura = somaAlturas / contador;
			System.out.println("M�dia de altura das pessoas: " + mediaAltura);
		} else {
			System.out.println("Nenhum dado foi inserido.");
		}
	}
}