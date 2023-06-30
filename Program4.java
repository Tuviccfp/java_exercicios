package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		int[] vetorNumber = new int[n];
		
		for (int i = 0; i < vetorNumber.length; i++) {
			System.out.printf("Digite um número: ");
			vetorNumber[i] = sc.nextInt();
		}
		
		System.out.print("Numeros Pares: ");
		int quantity = 0;
		for (int i = 0; i < vetorNumber.length; i++) {
			if(vetorNumber[i] % 2 == 0) {
				System.out.printf("%d, ", vetorNumber[i]);;
				quantity++;
			}
		}
		System.out.printf("%n" + "Quantidade de numeros pares: " + quantity);
		
		
		sc.close();
	}

}
