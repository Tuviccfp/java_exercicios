package exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		People[] vetorPeople = new People[n];
		
		//Percorrendo o array para inserir os dados de pessoa em cada posição.		
		for (int i = 0; i < vetorPeople.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa");
			System.out.print("Nome:");
			String name = sc.next();
			System.out.print("Idade: ");	
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vetorPeople[i] = new People(name, height, age);
		}
		
		//Obtendo média das alturas		
		double sum = 0.0;
		for (int i = 0; i < vetorPeople.length; i++) {
			sum += vetorPeople[i].getHeight();			
		}
		double media = (double) sum / vetorPeople.length;
		System.out.printf("Altura média: %.2f%n ", media);
		
		//Obtendo a porcentagem de pessoas com idade abaixo de 16.
		double quantity = 0.0;
		String name = " ";
		for (int i = 0; i < vetorPeople.length; i++) {
			if(vetorPeople[i].getAge() < 16) {
				quantity++;
				name += vetorPeople[i].getName() + ",";
			}
		}
		double percentage = (quantity * 100) / vetorPeople.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentage);
		System.out.println(name);
		
		
		sc.close();
	}

}
