//Descreva um algoritmo que calcule e escreva 
//a soma dos números pares e a soma dos números ímpares entre 1 e 100.  

package exercicos_laco;

public class Exer6 {

	public static void main(String[] args) {

		int somaPares = 0;
		int somaImpares = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				somaPares += i;
			} else {
				somaImpares += i;
			}
		}

		System.out.println("Soma dos números pares: " + somaPares);
		System.out.println("Soma dos números ímpares: " + somaImpares);
	}
}