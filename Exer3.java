//Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número lido, 
//se o mesmo é par ou ímpar.

package exercicos_laco;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {

	@SuppressWarnings("resource")
	Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = entrada.nextInt();
            
            if (numero % 2 == 0) {
                System.out.println(numero + " é um número par.");
            } else {
                System.out.println(numero + " é um número ímpar.");
            }
        }
    }
}
		