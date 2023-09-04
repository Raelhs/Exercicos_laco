//Fa�a uma calculadora.
//O usu�rio entra com dois n�meros e depois com a opera��o desejada.
//Caso o n�mero da opera��o seja 1: some os dois n�meros.
//Caso seja 2: subtraia os dois n�meros.
//Caso seja 3: multiplique os dois n�meros.
//Caso seja 4: divida os dois n�meros.

package exercicos_laco;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		double numero = entrada.nextDouble();

		System.out.println("Escolha a opera��o:");
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
				System.out.println("Erro: Divis�o por zero n�o � permitida.");
				return;
			}
			break;
		default:
			System.out.println("Op��o inv�lida.");
			return;
		}

		System.out.println("Resultado: " + numero);
	}
}