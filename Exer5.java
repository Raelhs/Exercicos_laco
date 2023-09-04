//Escreva um algoritmo em que o usu�rio entre 5 valores de 0 a 1000
//Come�ando com o la�o (while ou for) em 0
//Printe os n�meros que o usu�rio entrou 

package exercicos_laco;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um valor entre 0 e 1000: ");
			int valor = entrada.nextInt();

			if (valor >= 0 && valor <= 1000) {
				System.out.println("Voc� digitou: " + valor);
			} else {
				System.out.println("Valor n�o permitido. Tente novamente.");
				i--;
			}
		}
	}
}