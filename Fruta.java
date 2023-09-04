//Faça um programa que receba um nome de uma fruta como entrada.
//Faça vários cases para as frutas que você conhece.
//Por exemplo:
//Case "banana": Eu gosto dessa fruta
//Case "pera": Eu não gosto dessa fruta
//Caso o usuário entre um valor desconhecido, escreva: Eu não conheço essa fruta

package exercicos_laco;

import java.util.Scanner;

public class Fruta {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("<Escolha uma fruta>");
		System.out.println("1. Banana");
		System.out.println("2. Maçã");
		System.out.println("3. Abacaxi");
		System.out.println("4. Manga");

		String fruta = entrada.next();

		switch (fruta) {
		case "1": {
			System.out.println("Não gosto de Banana:");
			break;
		}

		case "2": {
			System.out.println("Eu gosto de maçã");
			break;
		}
		case "3": {
			System.out.println("Esta fruta está muito azeda!");
			break;
		}

		case "4": {
			System.out.println("Cuidado para não deixar cair!");
			break;
		}

		default:
			System.out.println("Nenhuma fruta foi selecionada");
			return;
		}
	}
}