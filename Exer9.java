//Escreva um algoritmo que leia o número de inscrição e a altura de um atleta e informe:  

//- o número de inscrição e a altura do atleta mais alto;  
//- o número de inscrição e a altura do atleta mais baixo;  
//- a altura média do grupo de atletas.  

//A leitura deve ser finalizada ao digitar 0 para o número de inscrição.

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

		System.out.println("Insira o número de inscrição ou (digite 0 para finalizar)");
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
			System.out.println("Insira o número de inscrição (digite 0 para finalizar)");
			numeroInscricao = entrada.next();
			if (numeroInscricao.equals("0")) {
				break;
			}

			System.out.println("Insira a altura: ");
			altura = entrada.nextDouble();

		}
		double media = somaAltura / contador;
		System.out.println("O atleta com a maior altura tem o número de inscrição " 
		+ inscricaoMaior + " com "
				+ maiorAltura + "(m)");
		System.out.println("O atleta com a menor altura tem o número de inscrição " 
				+ inscricaoMenor + " com "
				+ menorAltura + "(m)");
		
		System.out.println("A média de altura é de " + media + "(m)");
	}

}
