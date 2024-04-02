import java.util.Locale;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros voce deseja: ");
		int n = sc.nextInt();
		double [] vect = new double[n];
		double soma = 0, media;
		for(int i=0;i<n;i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma+=vect[i];
		}
		System.out.printf("Valores: ");
		for(int i=0;i<n;i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		media = soma/n;
		System.out.printf("\nSoma = %.2f \n", soma);
		System.out.printf("Media = %.2f \n", media);
		
		
		sc.close();
	
	}

}
