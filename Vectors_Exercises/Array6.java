import java.util.Locale;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos numeros deseja digitar: ");
		int contadorPares = 0;
		int n = sc.nextInt();
		int []numero = new int [n];
		for(int i=0;i<n;i++) {
			System.out.print("Digite o valor: ");
			numero[i] = sc.nextInt();
			if(numero[i] % 2 == 0) {
				contadorPares++;
			}
		}
		System.out.print("NUMEROS PARES: ");
		for(int i=0;i<n;i++) {
			if(numero[i] % 2 == 0) {
				System.out.print(numero[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Quantidade de numeros pares: "+contadorPares);
		
		sc.close();
	}

}
