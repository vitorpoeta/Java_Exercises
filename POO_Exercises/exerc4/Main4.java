package application;

import java.util.Scanner;

import entities.PetsEx4;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o sobrenome da família: ");
		String sobrenome = sc.nextLine();
		System.out.println("Qual o nome: ");
		String nome = sc.nextLine();
		PetsEx4 p1 = new PetsEx4(nome, sobrenome);
		System.out.println(p1);
		System.out.println("Ficou satisfeito com a escolha (s/n): ");
		String resposta = sc.nextLine();
		
		while (resposta.equalsIgnoreCase("n")) {
			System.out.println("Digite um novo nome para o pet: ");
			p1.setNome(sc.nextLine());
			System.out.println(p1);
			System.out.println("Ficou satisfeito com a escolha (s/n): ");
			resposta = sc.nextLine();
		}

		System.out.println("Bem-vindo à família, " + p1.getNome() + " " + p1.getSobrenome());

		sc.close();
	}
}
