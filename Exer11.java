//Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do sexo
//(sexo = 'M' ou 'm' para masculino e sexo = 'F' ou 'f' para feminino)
//de cada pessoa informe a média da altura das mulheres e a média de altura do grupo.
//A leitura deve ser finalizada ao digitar 0 para a altura.

package exercicos_laco;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		double somaAlturasMulheres = 0;
		double somaAlturasGrupo = 0;
		int contadorMulheres = 0;
		int contadorGrupo = 0;

		while (true) {
			System.out.print("Digite a altura da pessoa (ou 0 para sair): ");
			double altura = entrada.nextDouble();

			if (altura == 0) {
				break;
			}

			entrada.nextLine();

			System.out.print("Digite o sexo da pessoa (M/F): ");
			char sexo = entrada.nextLine().charAt(0);

			if (sexo == 'M' || sexo == 'm') {
				somaAlturasGrupo += altura;
				contadorGrupo++;
			} else if (sexo == 'F' || sexo == 'f') {
				somaAlturasMulheres += altura;
				contadorMulheres++;
			} else {
				System.out.println("Sexo inválido. Tente novamente.");
			}
		}

		if (contadorGrupo != 0) {
			double mediaAlturaGrupo = somaAlturasGrupo / contadorGrupo;
			System.out.println("Média de altura do grupo: " + mediaAlturaGrupo);
		} else {
			System.out.println("Nenhum dado foi inserido para o grupo.");
		}

		if (contadorMulheres != 0) {
			double mediaAlturaMulheres = somaAlturasMulheres / contadorMulheres;
			System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
		} else {
			System.out.println("Nenhum dado foi inserido para mulheres.");
		}
	}

}
