import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas ira digitar:");
		int n = sc.nextInt();
		String [] nome = new String [n];
		int [] idade = new int [n];
		int maisVelha = idade[0];
		int posicaomaior = 0;
		for(int i=0;i<n;i++) {
			System.out.println("Dados da "+(i+1)+" pessoa:");
			System.out.print("Nome: ");
			nome [i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
		}
		for(int i=1;i<n;i++) {
			if(idade[i]>maisVelha) {
				maisVelha = idade[i];
				posicaomaior = i;
			}
		}
		System.out.print("Pessoa mais velha: "+ nome[posicaomaior]);
		sc.close();
	}

}
