package exercicio;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		double[] vetorNum = new double[n];
		
		for (int i = 0; i < vetorNum.length; i++) {
			System.out.println("Digite o " + (i + 1) + " número");
			vetorNum[i] = sc.nextDouble();
		}
		
		//Arrays.toString(variável) é um método utilizado para exibir dados de um vetor.		
		String valuesVetor = Arrays.toString(vetorNum);
		System.out.println("Valores digitados: " + valuesVetor);
		
		double sum = 0.0;
		for (int i = 0; i < vetorNum.length; i++) {
			sum += vetorNum[i];
		}
		double media = (double) sum / vetorNum.length;
		
		System.out.println("A soma dos valores é: " + sum);
		System.out.println("A media dos valores é: " + media);
		
		sc.close();
	}

}
