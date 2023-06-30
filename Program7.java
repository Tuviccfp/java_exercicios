package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double sum, media;
		
		System.out.print("Quantos elementos terá no vetor?");
		n = sc.nextInt();
		double[] vetorDownMedia = new double[n];
		
		for (int i = 0; i < vetorDownMedia.length; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetorDownMedia[i] = sc.nextDouble();
		}
		
		sum = 0.0;
		for (int i = 0; i < vetorDownMedia.length; i++) {
			sum += vetorDownMedia[i];
		}
		media = (double) sum / vetorDownMedia.length;
		System.out.printf("Media do vetor: %.3f%n", media);
		
		System.out.println("Elementos abaixo da média: ");
		for (int i = 0; i < vetorDownMedia.length; i++) {
			if (vetorDownMedia[i] < media) {
				System.out.printf("%.1f ", vetorDownMedia[i]);
			}
		}
		
		sc.close();
	}

}
