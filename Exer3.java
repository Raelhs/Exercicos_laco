//Descreva um algoritmo que leia 5 n�meros inteiros e escreva, para cada n�mero lido, 
//se o mesmo � par ou �mpar.

package exercicos_laco;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {

	@SuppressWarnings("resource")
	Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o n�mero " + i + ": ");
            int numero = entrada.nextInt();
            
            if (numero % 2 == 0) {
                System.out.println(numero + " � um n�mero par.");
            } else {
                System.out.println(numero + " � um n�mero �mpar.");
            }
        }
    }
}
		