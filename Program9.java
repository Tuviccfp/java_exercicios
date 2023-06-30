package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, maior, position_array = 0;
		
		System.out.println("Quantas pessoas você vai digitar?");
		n = sc.nextInt();
		String[] vetorName = new String[n];
		int[] vetorIdade = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			vetorName[i] = sc.next();
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();
		}
		
		//Após obter a maior idade do vetor, igualo o valor da posição dele ao valor da posição atual do vetor.
		//position_array armazena a posição do array que contém a maior idade.		
		maior = vetorIdade[0];
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] > maior) {
				maior = vetorIdade[i];
				position_array = i;
			}
		}
		System.out.println(position_array);
		System.out.print("Pessoa mais velha: " + vetorName[position_array]);
		sc.close();
	}

}
