package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, sum = 0, num_pares = 0;
		double media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		int[] vetorMediapares = new int[n];
		
		for (int i = 0; i < vetorMediapares.length; i++) {
			System.out.print("Digite um n�mero: ");
			vetorMediapares[i] = sc.nextInt();
		}
				
		//Crio uma condi��o para verificar se os valores de vetor tem o resto da divis�o por 2 igual a 0.
		//Se isso for verdadeiro, vou somar e igualar os valores junto ao total da vari�vel sum.
		//num_pares � para incrementar cada vez que o vetor possui um n�mero par.		
		for (int i = 0; i < vetorMediapares.length; i++) {
			if (vetorMediapares[i] % 2 == 0) {
				sum += vetorMediapares[i];
				num_pares++;
			}
		}
		
		//Reutilizo a vari�vel num_pares para verificar a quantidade de numeros pares do vetor, se for igual a um total de 0, ir� retornar um nenhum par encontrado.		
		if (num_pares == 0) {
			System.out.println("Nenhum n�mero par encontrado!");
		} else {
			// Agora se n�o for igual a 0, ir� calcular a m�dia do valor, entre a soma dos n�meros pares do vetor divido pela quantidade dos pares.
			media = (double) sum / num_pares;
			System.out.printf("Media dos pares: %.2f%n ", media);
		}
		
		sc.close();
	}

}
