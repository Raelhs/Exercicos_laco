//Faça uma calculadora.
//O usuário entra com dois números e depois com a operação desejada.
//Caso o número da operação seja 1: some os dois números.
//Caso seja 2: subtraia os dois números.
//Caso seja 3: multiplique os dois números.
//Caso seja 4: divida os dois números.

package exercicos_laco;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double numero = entrada.nextDouble();

		System.out.println("Escolha a operação:");
		System.out.println("1. Adicionar 10");
		System.out.println("2. Subtrair 10");
		System.out.println("3. Multiplicar por 10");
		System.out.println("4. Dividir por 10");
		int operacao = entrada.nextInt();

		entrada.close();

		switch (operacao) {
		case 1:
			numero += 10;
			break;
		case 2:
			numero -= 10;
			break;
		case 3:
			numero *= 10;
			break;
		case 4:
			if (numero != 0) {
				numero /= 10;
			} else {
				System.out.println("Erro: Divisão por zero não é permitida.");
				return;
			}
			break;
		default:
			System.out.println("Opção inválida.");
			return;
		}

		System.out.println("Resultado: " + numero);
	}
}