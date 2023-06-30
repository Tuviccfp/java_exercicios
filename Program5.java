package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, positionVetor;
		double maior;
		
		System.out.print("Quantos numeros você vai digitar?");
		n = sc.nextInt();
		double[] vetorPosition = new double[n];
		
		for (int i = 0; i < vetorPosition.length; i++) {
			System.out.print("Digite um numero: ");
			vetorPosition[i] = sc.nextDouble();
		}
		
		//Variável maior representa o maior valor passado no vetor com base na sua primeira posição. 
		//Logo depois eu crio uma condição, onde se a posição do vetor atual for maior que o valor da sua primeira posição, ele armazena o maior valor na variável maior.
		maior = vetorPosition[0];
		positionVetor = 0;
		for (int i = 0; i < vetorPosition.length; i++) {
			if(vetorPosition[i] > maior) {
				maior = vetorPosition[i];
				positionVetor = i;
			}
		}
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Posição do maior valor: " + positionVetor);
		
		sc.close();
	}

}
