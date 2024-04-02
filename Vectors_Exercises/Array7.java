import java.util.Locale;
import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros irá digitar: ");
		int n = sc.nextInt();
		double [] num = new double [n];
		
		int cont1=0;
		int cont2=0;
		for(int i=0;i<n;i++) {
			System.out.println("Digite um numero: ");
			num[i] = sc.nextDouble();
		}
		
		double maior = num[0];
		double menor = num[0];
		for(int i=1;i<n;i++) {
			if(num[i]>maior) {
				maior = num[i];
				cont1 = i;
			}
			if(num[i]<menor) {
				menor = num[i];
				cont2 = i;
			}
		}
		System.out.println("MAIOR = "+maior);
		System.out.println("MENOR = "+menor);
		System.out.println("POSICAO MAIOR = "+cont1);
		System.out.println("POSICAO MENOR = "+cont2);
		sc.close();
	}

}
