package exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, quantityWoman = 0, quantityMan = 0;
		double sum = 0.0, media, min_height, max_height;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		People[] vetorPeople = new People[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			String gender = sc.next();
			System.out.println();
			vetorPeople[i] = new People(height, gender);
		}
		
		min_height = vetorPeople[0].getHeight();
		max_height = vetorPeople[0].getHeight();
		for (int i = 0; i < vetorPeople.length; i++) {
			if (vetorPeople[i].getHeight() < min_height) {
				min_height = vetorPeople[i].getHeight();
			}
			if (vetorPeople[i].getHeight() > max_height) {
				max_height = vetorPeople[i].getHeight();
			}
		}
		
		for (int i = 0; i < vetorPeople.length; i++) {
			if (vetorPeople[i].getGender().equalsIgnoreCase("F")) {
				quantityWoman++;
				sum = sum + vetorPeople[i].getHeight();
			} else {
				quantityMan++;
			}
		}
		media = sum / quantityWoman;
		
		System.out.printf("Menor altura = %.2f%n", min_height);
		System.out.printf("Maior altura = %.2f%n", max_height);
		System.out.printf("Media das alturas das mulheres: %.2f%n", media);
		System.out.println("Numero de homens: " + quantityMan);
		
		sc.close();	
	}

}
