import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();
		int [] vect = new int [n];
		double soma = 0 , media =0;
		int contPares = 0;
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
			if(vect[i] % 2 == 0 ) {
				soma+=vect[i];
				contPares++;
			}
		}
		if(soma == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		media = soma/contPares;
		if(media!=0) {		
			System.out.printf("MEDIA DOS PARES %.1f", media);
		}
		sc.close();
	}

}
