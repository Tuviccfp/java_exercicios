package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Quantos valores terá cada vetor?");
		n = sc.nextInt();
		int[] vetorSoma1 = new int[n];
		int[] vetorSoma2 = new int[n];
		int[] vetorSoma3 = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < n; i++) {
			vetorSoma1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vetorSoma2.length; i++) {
			vetorSoma2[i] = sc.nextInt();
		}
		
		//Somo os valores do vetorSoma1 com vetorSoma2 e retorno no vetorSoma3.		
		for (int i = 0; i < vetorSoma3.length; i++) {
			vetorSoma3[i] = vetorSoma1[i] + vetorSoma2[i] ; 
		}
		
		for (int i = 0; i < vetorSoma3.length; i++) {
			System.out.println("VETOR RESULTANTE: " + vetorSoma3[i]);
		}
		sc.close();
	}
}
