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
		
		System.out.print("Quantos numeros voc� vai digitar?");
		n = sc.nextInt();
		double[] vetorPosition = new double[n];
		
		for (int i = 0; i < vetorPosition.length; i++) {
			System.out.print("Digite um numero: ");
			vetorPosition[i] = sc.nextDouble();
		}
		
		//Vari�vel maior representa o maior valor passado no vetor com base na sua primeira posi��o. 
		//Logo depois eu crio uma condi��o, onde se a posi��o do vetor atual for maior que o valor da sua primeira posi��o, ele armazena o maior valor na vari�vel maior.
		maior = vetorPosition[0];
		positionVetor = 0;
		for (int i = 0; i < vetorPosition.length; i++) {
			if(vetorPosition[i] > maior) {
				maior = vetorPosition[i];
				positionVetor = i;
			}
		}
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Posi��o do maior valor: " + positionVetor);
		
		sc.close();
	}

}
