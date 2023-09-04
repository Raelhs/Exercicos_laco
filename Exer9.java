//Escreva um algoritmo que leia o n�mero de inscri��o e a altura de um atleta e informe:  

//- o n�mero de inscri��o e a altura do atleta mais alto;  
//- o n�mero de inscri��o e a altura do atleta mais baixo;  
//- a altura m�dia do grupo de atletas.  

//A leitura deve ser finalizada ao digitar 0 para o n�mero de inscri��o.

package exercicos_laco;

import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		double maiorAltura = Integer.MIN_VALUE;
		double menorAltura = Integer.MAX_VALUE;
		String inscricaoMenor = "";
		String inscricaoMaior = "";
		int contador = 0;
		double somaAltura = 0;

		System.out.println("Insira o n�mero de inscri��o ou (digite 0 para finalizar)");
		String numeroInscricao = entrada.next();

		System.out.println("Insira a altura: ");
		double altura = entrada.nextDouble();

		while (!numeroInscricao.equals("0")) {
			contador++;
			somaAltura += altura;
			if (altura > maiorAltura) {
				maiorAltura = altura;
				inscricaoMaior = numeroInscricao;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
				inscricaoMenor = numeroInscricao;
			}
			System.out.println("Insira o n�mero de inscri��o (digite 0 para finalizar)");
			numeroInscricao = entrada.next();
			if (numeroInscricao.equals("0")) {
				break;
			}

			System.out.println("Insira a altura: ");
			altura = entrada.nextDouble();

		}
		double media = somaAltura / contador;
		System.out.println("O atleta com a maior altura tem o n�mero de inscri��o " 
		+ inscricaoMaior + " com "
				+ maiorAltura + "(m)");
		System.out.println("O atleta com a menor altura tem o n�mero de inscri��o " 
				+ inscricaoMenor + " com "
				+ menorAltura + "(m)");
		
		System.out.println("A m�dia de altura � de " + media + "(m)");
	}

}
