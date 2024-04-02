import java.util.Locale;
import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero de vetores: ");
		int n = sc.nextInt();
		int [] a = new int [n];
		int [] b = new int [n];
		int [] c = new int [n];
		System.out.println("Digite os numeros do vetor A: ");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Digite os numeros do vetor B: ");
		for(int i=0;i<n;i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("RESULTADO DA SOMA DOS VETORES: ");
		for(int i=0;i<n;i++) {
			c[i] = a[i]+b[i];
			System.out.println(c[i]);
		}
		sc.close();
	}

}
