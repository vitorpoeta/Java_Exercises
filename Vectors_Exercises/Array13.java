import java.util.Locale;
import java.util.Scanner;

public class Array13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		double altura [] = new double[n];
		char sexo [] = new char [n];
	
		int contadorHomens=0, contadorMulheres=0;
		double alturaFemMedia, alturaFemTotal=0;
		for(int i=0;i<n;i++) {
			System.out.println("Altura da "+(i+1)+" pessoa: ");
			altura [i] = sc.nextDouble();
			System.out.println("Genero da "+(i+1)+" pessoa: ");
			sexo[i] = sc.next().charAt(0);
		}
		double menorAltura = altura[0]; 
		double maiorAltura = altura[0]; 

		for(int i = 1; i < n; i++) {
		    if(altura[i] > maiorAltura) {
		        maiorAltura = altura[i];
		    }
		    if(altura[i] < menorAltura) {
		        menorAltura = altura[i];
		    }
		}

		
		for(int i=0;i<n;i++) {
			if(sexo[i]=='M') {
				contadorHomens++;
			}
			else {
				contadorMulheres++;
				alturaFemTotal += altura[i];
			}
		}
	
		alturaFemMedia = alturaFemTotal / contadorMulheres++;
		System.out.printf("Menor altura %.2f\n", menorAltura);
		System.out.printf("Maior altura %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres: %.2f\n", alturaFemMedia );
		System.out.println("Numero de homens "+contadorHomens);
	
		
		sc.close();	
	}

}
