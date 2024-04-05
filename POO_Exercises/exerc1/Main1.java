// Main.java
package application;

import java.util.Scanner;

import entities.DadoEx1;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resposta = "sim";
		int sum =0;
		while (resposta.equalsIgnoreCase("sim")) {
			System.out.println("Digite qual numero irá apostar (1 até 6): ");
			int numero = sc.nextInt();
			DadoEx1 dado = new DadoEx1();
			int numeroRolado = dado.rolarDado(); // Rola o dado
			System.out.println("--------------------------------");
			System.out.println("O número girado foi: " + numeroRolado);
			System.out.println("--------------------------------");
			sum+= numeroRolado;
			sc.nextLine();
			if(numero == numeroRolado) {
				System.out.println("Voce acertou parabens");
				System.out.println("Deseja continuar: (sim/nao)");
				resposta = sc.nextLine();
			}
			if(numero != numeroRolado){
				System.out.println("Voce errou");
				System.out.println("Deseja continuar: (sim/nao)");
				resposta = sc.nextLine();
			}
		}
		System.out.println("Voce saiu");
		System.out.println("A soma de todos os numeros girados foi: "+sum);
		sc.close();
	}
}
