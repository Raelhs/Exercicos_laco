//Fa�a um programa que receba um nome de uma fruta como entrada.
//Fa�a v�rios cases para as frutas que voc� conhece.
//Por exemplo:
//Case "banana": Eu gosto dessa fruta
//Case "pera": Eu n�o gosto dessa fruta
//Caso o usu�rio entre um valor desconhecido, escreva: Eu n�o conhe�o essa fruta

package exercicos_laco;

import java.util.Scanner;

public class Fruta {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("<Escolha uma fruta>");
		System.out.println("1. Banana");
		System.out.println("2. Ma��");
		System.out.println("3. Abacaxi");
		System.out.println("4. Manga");

		String fruta = entrada.next();

		switch (fruta) {
		case "1": {
			System.out.println("N�o gosto de Banana:");
			break;
		}

		case "2": {
			System.out.println("Eu gosto de ma��");
			break;
		}
		case "3": {
			System.out.println("Esta fruta est� muito azeda!");
			break;
		}

		case "4": {
			System.out.println("Cuidado para n�o deixar cair!");
			break;
		}

		default:
			System.out.println("Nenhuma fruta foi selecionada");
			return;
		}
	}
}