//Descreva um algoritmo que calcule e escreva a soma dos n�meros pares e a soma 
//dos n�meros �mpares entre 1 e 1000.
package exercicos_laco;

public class Exer14 {

	public static void main(String[] args) {

		int somaPares = 0;
		int somaImpares = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				somaPares += i;
			} else {
				somaImpares += i;
			}
		}

		System.out.println("Soma dos n�meros pares: " + somaPares);
		System.out.println("Soma dos n�meros �mpares: " + somaImpares);
	}
}
