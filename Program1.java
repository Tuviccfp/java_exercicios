package exercicio;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você vai digitar?");
		int n = sc.nextInt();
		int[] vetorNumber = new int[n];
		
		for (int i = 0; i < vetorNumber.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			vetorNumber[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos: ");
		for (int j = 0; j < vetorNumber.length; j++) {
			if (vetorNumber[j] < 0) {
				System.out.println(vetorNumber[j]);
			}			
		}
		
		
		sc.close();
	}

}
