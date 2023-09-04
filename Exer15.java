//Descreva um algoritmo que leia n n�meros inteiros e at� o usu�rio entrar com a letra n
//a) escreva o menor valor 
//b) escreva o maior valor

package exercicos_laco;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		int menorValor = Integer.MAX_VALUE;
		int maiorValor = Integer.MIN_VALUE;

		while (true) {
			System.out.print("Digite um n�mero inteiro (ou 'n' para sair): ");
			String valor = entrada.next();

			if (valor.equalsIgnoreCase("n")) {
				break;
			}

			int numero = Integer.parseInt(valor);
			menorValor = Math.min(menorValor, numero);
			maiorValor = Math.max(maiorValor, numero);
		}

		System.out.println(
				"Menor valor: " + (menorValor == Integer.MAX_VALUE ?  
						"Nenhum valor foi inserido." : menorValor));
		System.out.println(
				"Maior valor: " + (maiorValor == Integer.MIN_VALUE ?
						"Nenhum valor foi inserido." : maiorValor));
	}

}
