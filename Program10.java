package exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double media;
		
		System.out.print("Quantos alunos serão digitados?");
		n = sc.nextInt();
		Aluno[] vetorAluno = new Aluno[n];
		
		for (int i = 0; i < vetorAluno.length; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) + " aluno:");
			String nome = sc.next();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vetorAluno[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			media = (vetorAluno[i].getNota1() + vetorAluno[i].getNota2()) / 2;
			if (media >= 6.0) {
				System.out.printf(vetorAluno[i].getName());
			}
		}
		
		sc.close();
	}

}
