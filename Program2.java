package exercicio;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� vai digitar?");
		int n = sc.nextInt();
		double[] vetorNum = new double[n];
		
		for (int i = 0; i < vetorNum.length; i++) {
			System.out.println("Digite o " + (i + 1) + " n�mero");
			vetorNum[i] = sc.nextDouble();
		}
		
		//Arrays.toString(vari�vel) � um m�todo utilizado para exibir dados de um vetor.		
		String valuesVetor = Arrays.toString(vetorNum);
		System.out.println("Valores digitados: " + valuesVetor);
		
		double sum = 0.0;
		for (int i = 0; i < vetorNum.length; i++) {
			sum += vetorNum[i];
		}
		double media = (double) sum / vetorNum.length;
		
		System.out.println("A soma dos valores �: " + sum);
		System.out.println("A media dos valores �: " + media);
		
		sc.close();
	}

}
